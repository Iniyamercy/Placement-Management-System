package com.cg.placement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AboutController {
	 @GetMapping("/aboutus")
	    public String mainpage() {
	    	return ("aboutus");
}


}
