package com.mit;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetMessage {
	public void service(HttpServletRequest req, HttpServletResponse res) {
		String key = req.getParameter("key").toString();
		String message = IMessageDAO.getMessage(key);
		
		PrintWriter out = res.getWriter();
		if(message == null) out.println("");
		else out.println(message);
	}
}
