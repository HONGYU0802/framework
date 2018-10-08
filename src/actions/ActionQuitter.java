package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionQuitter implements Action{

	public String perform(HttpServletRequest req, HttpServletResponse res) {	
		String suite=null;
		suite="/goodbye.jsp";
		return suite;
	}
}
