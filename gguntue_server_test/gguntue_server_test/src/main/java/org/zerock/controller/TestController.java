package org.zerock.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping(value = "/test/signup", method = RequestMethod.POST)
	@ResponseBody
	public HashMap<String, Object> signup(String id, String pw, HttpSession session) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		String comp_id = "aaaa";
		String comp_pw = "bbbb";
		
		if( id.equals(comp_id) && pw.equals(comp_pw)) {
			/* 아이디, pw가 일치한다면 */
			map.put("result", true);
			return map;
			
		}else {
			map.put("result", false);
			return map;
		}
	}
	
}
