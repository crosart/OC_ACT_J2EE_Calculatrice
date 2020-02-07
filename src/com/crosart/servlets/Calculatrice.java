package com.crosart.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculatrice")
public class Calculatrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Calculatrice() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String arg1String = request.getParameter("arg1");
		int arg1 = Integer.parseInt(arg1String);
		String arg2String = request.getParameter("arg2");
		int arg2 = Integer.parseInt(arg2String);
		
	}

}
