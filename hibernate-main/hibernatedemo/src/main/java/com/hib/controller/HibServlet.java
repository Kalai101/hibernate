package com.hib.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hib.dao.TraineeDaoImpl;
import com.hibernate.model.Trainee;


public class HibServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    TraineeDaoImpl tid = new TraineeDaoImpl();
    public HibServlet() {
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("empname");
		String phno = request.getParameter("empphno");
		String email = request.getParameter("empemail");
		
		Trainee t = new Trainee();
		t.setEmpname(name);
		t.setEmpphno(phno);
		t.setEmpemail(email);
		
		tid.createTrainee(t);
		
		RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
		rd.forward(request,response);
	}

}
