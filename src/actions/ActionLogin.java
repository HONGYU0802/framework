package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionLogin implements Action{

	public String perform(HttpServletRequest req, HttpServletResponse res) {
		
		String log=req.getParameter("nom");
		
		String suite = null;
		
		if(log.equals("Sesame")) {
			suite="/page1.jsp";
		}
		else suite="/erreur.jsp";
		
		return suite;
	}
}
