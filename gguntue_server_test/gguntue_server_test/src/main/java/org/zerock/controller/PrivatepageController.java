package org.zerock.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PrivatepageController {
	@RequestMapping(value = "/private_page/donation", method = RequestMethod.GET)
	public String donation(Locale locale, Model model) {
		
		return "private_page/donation";
	}
	
	
	@RequestMapping(value = "/private_page/training", method = RequestMethod.GET)
	public String training(Locale locale, Model model) {
		
		return "private_page/training";
	}
}
