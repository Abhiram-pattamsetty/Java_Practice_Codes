package com.kishore;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class compcls {
	
	public compcls() {
		super();
		System.out.println("your app is printed for everything");
	}

	int bag;
	String a1;
	String a2;
	public int getBag() {
		return bag;
	}
	public void setBag(int bag) {
		this.bag = bag;
	}
	public String getA1() {
		return a1;
	}
	public void setA1(String a1) {
		this.a1 = a1;
	}
	public String getA2() {
		return a2;
	}
	public void setA2(String a2) {
		this.a2 = a2;
	}
	@Override
	public String toString() {
		return "compcls [a1=" + a1 + ", a2=" + a2 + "]";
	}
	
	public void mann() {
		System.out.println("your app is printed");
	}
	
	

}
