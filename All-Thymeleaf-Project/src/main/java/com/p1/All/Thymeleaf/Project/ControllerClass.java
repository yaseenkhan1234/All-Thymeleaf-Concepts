package com.p1.All.Thymeleaf.Project;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ControllerClass {
	
	
	@Autowired
	EntityClass ec;
	
	
	@RequestMapping({"/","/home"})
	public String home(Model model) {
		
		ec.setFirstname("yaseen");
		ec.setEmail("lovegamea0909@gmail.com");	
		ec.setSalary(8777L);
		model.addAttribute("emp",ec);
		
		return "home";
	}
	
	
	@RequestMapping("/contact")
	public String contact() {
		return "Contact";
	
	}

	@RequestMapping("/emp/{eid}")
	public String emp(@PathVariable("eid") String id) {
		
		
		return "Your Employee id is : " +id;
	
	}


	
	@RequestMapping("/msg")
	public String message() {
		return "msg-variable";
	
	}
	
	
	@RequestMapping("/loop")
	public String loop(Model model) {
		
		List<Employee> listemp=Arrays.asList(new Employee("yaseen", 1233, 787),
				new Employee("khan", 1256, 88),
				new Employee("rishav", 3343, 65),
				new Employee("vineet", 7667, 47));
		
			
		model.addAttribute("employeeList",listemp);
		
		return "looping";
	
	}
	

	@RequestMapping("/condional")
	public String conditional(Model model) {
		
		ec.setFirstname("yaseen");
		ec.setEmail("lovegamea0909@gmail.com");	
		ec.setSalary(30000L);
		
		
		
		model.addAttribute("emp",ec);
		
		return "Conditional";
	}
	
	
	
}
