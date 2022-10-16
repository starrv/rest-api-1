package com.example.restservice;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
	
	private ArrayList<Member> children=new ArrayList<Member>();
	Member Kathy=new Member("Kathy","Starr",50);
	Member Douglass=new Member("Douglass","Green",55);
	Member Angela=new Member("Angela","Starr",4);
	Member Pocohontas=new Member("Pocohontas","Starr",14);
	
	public MemberController() {
		children.add(Angela);
		children.add(Pocohontas);
	}
	
	@GetMapping("/member")
	public Member member(@RequestParam(value="name",defaultValue="World") String name) {
		return new Member("Valencia","Starr",36,Kathy,Douglass,children,String.format("Hello %s",name));
		
	}

}
