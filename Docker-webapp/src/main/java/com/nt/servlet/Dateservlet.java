package com.nt.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/dateurl")
public class Dateservlet extends HttpServlet {
	
    
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	PrintWriter pw = res.getWriter();
	res.setContentType("text/html");
	Date d = new Date();
	pw.println("<h1 style='color:red'>Date and Time::"+d+"</h1>");
	pw.println("<br><a href='index.jsp'>home</a>");
	pw.close();
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}

}
