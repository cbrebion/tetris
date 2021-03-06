package fr.ascadis;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.ascadis.model.Joueur;
import fr.ascadis.model.Tetrimino;


public class Rendu
{
	public static void pageBienvenue(ServletContext context, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		pagePrincipale("Bienvenue", "/WEB-INF/views/accueil.jsp", context, req, resp);
	}
	
	
	public static void pageLogin(ServletContext context, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		pagePrincipale("Bienvenue", "/WEB-INF/views/login.jsp", context, req, resp);
	}
	
	public static void pageSignIn(String titrePage, String username, String nom, String prenom, String password, ServletContext context, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		req.setAttribute("username", username);
		
		pagePrincipale("Bienvenue", "/WEB-INF/views/signin.jsp", context, req, resp);
	}
	
	
	public static void listeTetriminos(String titrePage, List<Tetrimino> tetriminos, boolean montrerActions, ServletContext context, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		req.setAttribute("tetriminos", tetriminos);
		req.setAttribute("montrerActions", montrerActions);
		
		pagePrincipale(titrePage, "/WEB-INF/views/tetriminos.jsp", context, req, resp);
	}
	
	public static void listeJoueurs(String titrePage, List<Joueur> joueurs, boolean montrerActions, ServletContext context, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		req.setAttribute("joueurs", joueurs);
		req.setAttribute("montrerActions", montrerActions);
		
		pagePrincipale(titrePage, "/WEB-INF/views/joueurs.jsp", context, req, resp);
	}
	
	public static void pagePrincipale(String title, String contentJsp, ServletContext context, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		if (title == null)
			title = "D�faut";
		
		req.setAttribute("pageTitle", title);
		req.setAttribute("contentJsp", contentJsp);
		
		
		RequestDispatcher dispatcher = context.getRequestDispatcher("/WEB-INF/views/structure.jsp");
		dispatcher.forward(req, resp);
	}
}
