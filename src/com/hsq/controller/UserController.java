package com.hsq.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *author:huangshanqi
 *time  :2014-8-11下午10:28:22
 *email :hsqmobile@gmail.com
 */

@Controller
public class UserController {

	@RequestMapping("login")
	public String login(HttpServletRequest request){
		String resultPageString = "result";
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String infoMessage;
		if (username.equals("zhumengxiaoqi")&& password.equals("0310huangshanqi")) {
			 infoMessage="login success";
			 request.getSession().setAttribute("username", username);
		}else {
			 infoMessage="login fail";
		}
		
		
		request.setAttribute("infoMessage", infoMessage);
		return resultPageString;
	}
}
