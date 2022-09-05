package com.mit;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddMessage extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) {
		IMessage m = new IMessage();
		String key = req.getParameter("key").toString();
		String message = req.getParameter("message").toString();
		
		m.setKey(key);
		m.setMessage(message);
		
		IMessageDAO.insertMessage(m);
	}
}