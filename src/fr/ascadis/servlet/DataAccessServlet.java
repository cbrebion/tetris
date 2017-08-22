package fr.ascadis.servlet;

import javax.servlet.http.HttpServlet;
import fr.ascadis.dao.IDAO;


public abstract class DataAccessServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	
	protected IDAO getTetriminoDAO() {
		return (IDAO)this.getServletContext().getAttribute("tetriminoDAO");
	}
}