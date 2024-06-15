package com.mypack;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository
public class Employeerepo {
	
	private JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public void save(Employee emp) {
		String sql="insert into Employee (Empid,EmpName,age,salary,country) values(?,?,?,?,?)";
		int a=template.update(sql,emp.getEmpid(),emp.getEmpName(),emp.getAge(),emp.getSalary(),emp.getCountry());
		System.out.println(a+"rows effected");
	}
	public List<Employee> findAll(){
		
		String sq="select * from Employee";
		RowMapper<Employee> mapper=new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Employee e=new Employee();
				e.setEmpid(rs.getInt(1));
				e.setEmpName(rs.getString(2));
				e.setAge(rs.getInt(3));
				e.setSalary(rs.getInt(4));
				e.setCountry(rs.getString(5));
				
				return e;
			}
			
		};
		
		List<Employee> emps= template.query(sq, mapper);
		
		return emps;
	}

}

