package com.fullcreative.helloworld;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class HelloWorldServlet extends HttpServlet {
	String str = null;
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		str = "Hello, World";
		resp.getWriter().println(str);
	}
}
