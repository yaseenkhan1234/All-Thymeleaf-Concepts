package com.p1.All.Thymeleaf.Project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LayoutController {

	@RequestMapping("/index")
	public String Index() {
		return "index";
	}
	
	@RequestMapping("/components")
	public String components() {
		return "components";
	}
	
}
