package com.javahonk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringMVCController {
	
	@RequestMapping(value="/angularJS.web",method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		return "angularJS";
	}
	
	
	@RequestMapping(value="/springAngularJS.web", 
			method=RequestMethod.GET,
			produces={"application/xml", "application/json"})
    public @ResponseBody Person  getPerson() {		
		Person person = new Person();
		person.setFirstName("Java");
		person.setLastName("Honk");
		return person;
	}
}