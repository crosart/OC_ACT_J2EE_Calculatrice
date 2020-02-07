package com.crosart.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crosart.beans.Operation;

@WebServlet("/Calculatrice")
public class Calculatrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Création d'une variable pour indiquer le statut de l'opération
		
		boolean status = false;
		
		// Récupération des données du formulaire et prise en compte du formulaire vide
		
		String arg1String = request.getParameter("arg1");
		int arg1 = 0;
		
		try {
			if(arg1String != null)
				arg1 = Integer.parseInt(arg1String);
		}
		catch (NumberFormatException e) {
			arg1 = 0;
		}
		
		String arg2String = request.getParameter("arg2");
		int arg2 = 0;
		
		try {
			if(arg1String != null)
				arg2 = Integer.parseInt(arg2String);
		}
		catch (NumberFormatException e) {
			arg2 = 0;
		}

		String operande = request.getParameter("operande");
		
		Operation operation = new Operation();
		
		// Envoi des données du formulaire dans le bean Operation.java
		
		operation.setArg1(arg1);
		operation.setArg2(arg2);
		operation.setOperande(operande);
		operation.calculate();
		int result = operation.getResult();

		// Modification du statut en "traité"
		
		status = true;
		
		// Renvoi du résultat et du statut dans calculatrice.jsp
		
		request.setAttribute("result", result);
		request.setAttribute("status", status);
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/calculatrice.jsp");
		view.forward(request, response);
		
	}

}
