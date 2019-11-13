package org.zerock.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OpenpageController {
	private static final Logger logger = LoggerFactory.getLogger(OpenpageController.class);
	
	@RequestMapping(value = "/open_page/home_1", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "open_page/home_1";
	}
	
	
	@RequestMapping(value = "/open_page/history", method = RequestMethod.GET)
	public String history(Locale locale, Model model) {
		
		return "open_page/history";
	}
	
	@RequestMapping(value = "/open_page/activity", method = RequestMethod.GET)
	public String activity(Locale locale, Model model) {
		
		return "open_page/activity";
	}
	
}
