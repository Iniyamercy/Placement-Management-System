package com.cg.placement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CampusController {
	 @GetMapping("/campus")
	    public String mainpage() {
	    	return ("campus");
}
}
