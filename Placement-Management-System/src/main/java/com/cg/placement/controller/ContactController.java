package com.cg.placement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {
	 @GetMapping("/contactus")
	    public String mainpage() {
	    	return ("contactus");
}

}
