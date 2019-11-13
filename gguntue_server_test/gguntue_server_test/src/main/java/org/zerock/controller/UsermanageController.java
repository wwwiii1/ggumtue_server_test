package org.zerock.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsermanageController {
	
	private static final Logger logger = LoggerFactory.getLogger(UsermanageController.class);
	
	@RequestMapping(value = "/usermanage/joinus", method = RequestMethod.GET)
	public String joinus(Locale locale, Model model) {
		
		return "usermanage_page/joinus";
	}
	
	@RequestMapping(value = "/usermanage/mypage", method = RequestMethod.GET)
	public String mypage(Locale locale, Model model) {
		
		return "usermanage_page/mypage";
	}
	
	@RequestMapping(value = "/usermanage/signin", method = RequestMethod.GET)
	public String signin(Locale locale, Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
	
		return "usermanage_page/signin";
	}
	
	@RequestMapping(value = "/usermanage/signup", method = RequestMethod.GET)
	@ResponseBody
	public HashMap<String, Object> signup(@RequestParam("id") String id ,@RequestParam("pw") String pw, HttpSession session) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		logger.info(id + " and " + pw);
		
		String comp_id = "aaaa";
		String comp_pw = "bbbb";
		
		if( id.equals(comp_id)) {
			/* 아이디, pw가 일치한다면 */
			map.put("result", true);
			return map;
			
		}else {
			map.put("result", false);
			return map;
		}
	}
}
