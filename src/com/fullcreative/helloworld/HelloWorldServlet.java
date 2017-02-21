package com.fullcreative.helloworld;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class HelloWorldServlet extends HttpServlet {
	String str = null;
	String str1 = null;
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		str = "Hello, World";
		str1 = "Hello, Person";
		resp.getWriter().println(str);
		//Test Changes.
	}
}
