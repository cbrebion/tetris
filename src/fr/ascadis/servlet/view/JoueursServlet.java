package fr.ascadis.servlet.view;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.ascadis.Rendu;
import fr.ascadis.servlet.DataAccessServlet;


@WebServlet("/joueurs")
public class JoueursServlet extends DataAccessServlet
{
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		Rendu.listeJoueurs("Liste des Joueurs", this.getTetriminoDAO().findAll(), true, this.getServletContext(), req, resp);
	}
}