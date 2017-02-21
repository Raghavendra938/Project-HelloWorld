package com.fullcreative.helloworld;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class HelloWorldServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		String str = "Hello, World";
		resp.getWriter().println(str);
	}
}
