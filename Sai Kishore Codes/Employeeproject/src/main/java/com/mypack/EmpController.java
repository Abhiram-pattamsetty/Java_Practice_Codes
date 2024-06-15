package com.mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmpController {
	
	private Employeerepo erepo;
//	
	@Autowired
	public EmpController(Employeerepo erepo) {
		this.erepo=erepo;
	}
//	@GetMapping("/")
//	public String show() {
//		return "index";
//	}
	
	@PostMapping("/upl")
	public String UploadEmp(@RequestParam int empid,@RequestParam String empname,@RequestParam int age,@RequestParam int salary,@RequestParam String country,Model model) {
		Employee e=new Employee();
		e.setEmpid(empid);
		e.setEmpName(empname);
		e.setAge(age);
		e.setSalary(salary);
		e.setCountry(country);
		
//		Employeerepo erepo=new Employeerepo();
		
//		Employee e1=new Employee();
//		e1.setEmpid(12);
//		e1.setEmpName("th");
//		e1.setAge(21);
//		e1.setSalary(78);
//		e1.setCountry("usasdf");
		
//		System.out.println(e.getEmpName());
//		e.get
//		System.out.println("Step1 complete");

//		System.out.println("Step2 complete");
		erepo.save(e);
		
		model.addAttribute("employees",erepo.findAll());
		
		return "success";
		
	}

}
