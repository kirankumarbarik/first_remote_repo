package com.basic.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	public FirstServlet() {
       System.out.println("0-param construtor executes");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
       System.out.println("init(ServletConfig) executes");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
		PrintWriter pw=null;
		
		pw=resp.getWriter();
		pw.print("Good Afternoon.........");
		pw.flush();
		pw.close();
		
	}

	
 }
