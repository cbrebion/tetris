package fr.ascadis.servlet.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.ascadis.Rendu;

@WebServlet("/signin")
public class SignInServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String password = req.getParameter("password");
		
		Rendu.pageSignIn("Inscription", username, nom, prenom, password, this.getServletContext(), req, resp);
	}

}
