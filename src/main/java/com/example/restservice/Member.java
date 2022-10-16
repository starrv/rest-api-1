package com.example.restservice;

import java.util.ArrayList;

public class Member {
	
	private final String fname;
	private final String lname;
	private final int age;
	private ArrayList<Member> children=new ArrayList<Member>();
	private String greeting="";
	
	public Member(String fname, String lname, int age) {
		this.fname=fname;
		this.lname=lname;
		this.age=age;
	}
	
	public Member(String fname, String lname, int age,String greeting) {
		this.fname=fname;
		this.lname=lname;
		this.age=age;
		this.greeting=greeting;
	}
	
	public Member(String fname, String lname, int age, ArrayList<Member> children) {
		this.age=age;
		this.children=children;
		this.fname=fname;
		this.lname=lname;
	}
	
	public Member(String fname, String lname, int age, ArrayList<Member> children,String greeting) {
		this.age=age;
		this.children=children;
		this.fname=fname;
		this.lname=lname;
		this.greeting=greeting;
	}
	
	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public int getAge() {
		return age;
	}

	public ArrayList<Member> getChildren() {
		return children;
	}
	
	public String getGreeting() {
		return greeting;
	}
	
	public void setChildren(ArrayList<Member> children) {
		this.children=children;
	}

}
