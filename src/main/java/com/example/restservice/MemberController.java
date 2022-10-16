package com.example.restservice;

import java.util.ArrayList;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
	
	Member Valencia;
	Member Kathy;
	Member Douglass;
	Member Angela;
	Member Pocohontas;
	Member Koolaid;
	
	public MemberController() {
		Douglass=new Member("Douglass","Green",55,"My name is Douglass");
		Kathy=new Member("Kathy","Starr",50,"My name is Kathy");
		Koolaid=new Member("Koolaid","Walker",48,"My name is Koolaid");
		Valencia=new Member("Valencia","Walker",36,"My name is Valencia");
		
		ArrayList<Member> children=new ArrayList<Member>();
		children.add(Valencia);
		
		Kathy.setChildren(children);
		Douglass.setChildren(children);
		
		children=new ArrayList<Member>();
		
		Pocohontas=new Member("Pocohontas","Walker",14,"My name is Pocohontas");
		Angela=new Member("Angela","Walker",4,"My name is Angela");
		
		children.add(Pocohontas);
		children.add(Angela);
		
		Valencia.setChildren(children);
		Koolaid.setChildren(children);
	}
	
	@GetMapping("/member")
	public Member[] member(@RequestParam(value="name",defaultValue="World") String name) {
		Member[] members=new Member[7];
		members[0]=Douglass;
		members[1]=Kathy;
		members[2]=Koolaid;
		members[3]=Valencia;
		members[4]=Pocohontas;
		members[5]=Angela;
		members[6]=new Member("a","person",2,String.format("Hello %s", name));
		return members;
	}

}
