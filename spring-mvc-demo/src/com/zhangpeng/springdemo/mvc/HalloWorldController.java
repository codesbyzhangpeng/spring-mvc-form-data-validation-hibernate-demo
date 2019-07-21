package com.zhangpeng.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HalloWorldController {

	// need a Controller to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// need a Controller to process the HTML Form
	@RequestMapping("processForm")
	public String processForm() {
		return "helloworld";
	}

	// Controller to read form data and add data to the model
	@RequestMapping("processFormVersiontwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		//read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		//work on and change the data
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Yo!: " + theName;
		
		//add data to the model, we can add as many data as we want to the model
		model.addAttribute("message", result);
		
		
		//return name of a view page
		return "helloworld";
	}
	
	// Controller to read form data and add data to the model
	@RequestMapping("processFormVersionThree")
	public String AnythingName(@RequestParam("studentName") String theName, Model model) {

		//work and change the data
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Yo!: " + theName;
		
		//add data to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
