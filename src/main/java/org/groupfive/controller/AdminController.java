package org.groupfive.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.groupfive.entity.Admin;
import org.groupfive.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	@Resource
	private AdminService adminService;
	
	@RequestMapping("/showLogin")
	public String showLogin() {
		return "login";
	}
	@RequestMapping("/login")
	public String login(Admin admin, HttpServletRequest request) {
		Admin adminResult = adminService.login(admin);
		if(adminResult == null) {
			request.setAttribute("Admin", admin);
			request.setAttribute("errorMsg", "用户名或者密码错误");
			return "login";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("currentAdmin", adminResult);
			return "success";
		}
	}
}
