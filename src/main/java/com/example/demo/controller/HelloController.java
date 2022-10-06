package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello World";
	}

	@RequestMapping("/greet")
	@ResponseBody
	public String greet(@RequestParam String name) {
		return "Hello " + name;
	}

	@RequestMapping("/add")
	@ResponseBody
	public String greet(@RequestParam String operand1, @RequestParam String operand2) {
		int x = Integer.parseInt(operand1);
		int y = Integer.parseInt(operand2);
		return "" + operand1 + " + " + operand2 + " = " + (x + y);
	}

	@RequestMapping("/login")
	public String login() {
	return "<!DOCTYPE html>    \r\n"
			+ "<html>    \r\n"
			+ "<head>    \r\n"
			+ "    <title>Login Form</title>    \r\n"
			+ "</head>    \r\n"
			+ "<body>    \r\n"
			+ "    <h2>Login Page</h2><br>    \r\n"
			+ "    <div class=\"login\">    \r\n"
			+ "    <form id=\"login\" method=\"get\" action=\"login.php\">    \r\n"
			+ "        <label><b>User Name     \r\n"
			+ "        </b>    \r\n"
			+ "        </label>    \r\n"
			+ "        <input type=\"text\" name=\"Uname\" id=\"Uname\" placeholder=\"Username\">    \r\n"
			+ "        <br><br>    \r\n"
			+ "        <label><b>Password     \r\n"
			+ "        </b>    \r\n"
			+ "        </label>    \r\n"
			+ "        <input type=\"Password\" name=\"Pass\" id=\"Pass\" placeholder=\"Password\">    \r\n"
			+ "        <br><br>    \r\n"
			+ "        <input type=\"button\" name=\"log\" id=\"log\" value=\"Log In Here\">       \r\n"
			+ "        <br><br>    \r\n"
			+ "        <input type=\"checkbox\" id=\"check\">    \r\n"
			+ "        <span>Remember me</span>    \r\n"
			+ "        <br><br>    \r\n"
			+ "        Forgot <a href=\"#\">Password</a>    \r\n"
			+ "    </form>     \r\n"
			+ "</div>    \r\n"
			+ "</body>    \r\n"
			+ "</html>";
}
}
