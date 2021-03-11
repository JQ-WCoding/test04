package com.myspring.test04;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String index() {
		return "home";
	}
	
	@RequestMapping(value = "/joinForm", method = RequestMethod.GET)
	public String joinForm() {
		return "joinForm";
	}
	
//	@RequestMapping(value = "/joinPro", method = RequestMethod.POST)
//	public String joinPro(HttpServletRequest request) {
//		
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
//		String name = request.getParameter("name");
//		
//		request.setAttribute("id", id);
//		request.setAttribute("pw", pw);
//		request.setAttribute("name", name);			
//		
//		return "joinPro";
//	}

	@RequestMapping(value = "/joinPro", method = RequestMethod.POST)
	public String joinPro(Member member, Model model) {
		
		model.addAttribute("id", member.getId());
		model.addAttribute("pw", member.getPw());
		model.addAttribute("name", member.getName());	
		
		return "joinPro";
	}
	
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String loginForm() {
		return "loginForm";
	}
	
	@RequestMapping(value = "/loginPro", method = RequestMethod.POST)
	public String loginPro(Member member, HttpSession session) {
		
		session.setAttribute("id", member.getId());
		
		return "loginPro";
	}
	
}
