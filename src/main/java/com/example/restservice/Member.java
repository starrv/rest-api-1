package com.example.restservice;

import java.util.ArrayList;

public class Member {
	
	private final String fname;
	private final String lname;
	private final int age;
	private final Member mother;
	private final Member father;
	private ArrayList<Member> children=new ArrayList<Member>();
	private String greeting="";
	
	public Member(String fname, String lname, int age) {
		this.fname=fname;
		this.lname=lname;
		this.age=age;
		this.mother=null;
		this.father=null;
	}
	
	public Member(String fname, String lname, int age, Member mother, Member father) {
		this.age=age;
		this.father=father;
		this.mother=mother;
		this.fname=fname;
		this.lname=lname;
	}
	
	public Member(String fname, String lname, int age, Member mother, Member father, String greeting) {
		this.age=age;
		this.father=father;
		this.mother=mother;
		this.fname=fname;
		this.lname=lname;
		this.greeting=greeting;
	}
	
	public Member(String fname, String lname, int age, Member mother, Member father, ArrayList<Member> children, String greeting) {
		this.age=age;
		this.father=father;
		this.mother=mother;
		this.children=children;
		this.fname=fname;
		this.lname=lname;
		this.greeting=greeting;
	}
	
	public Member(String fname, String lname, int age, Member mother, Member father, ArrayList<Member> children) {
		this.age=age;
		this.father=father;
		this.mother=mother;
		this.children=children;
		this.fname=fname;
		this.lname=lname;
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

	public Member getMother() {
		return mother;
	}

	public Member getFather() {
		return father;
	}

	public ArrayList<Member> getChildren() {
		return children;
	}
	
	public String getGreeting() {
		return greeting;
	}

}
