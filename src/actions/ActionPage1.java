package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionPage1 implements Action{
	
public String perform(HttpServletRequest req, HttpServletResponse res) {
		String art=req.getParameter("article");
		String suite=null;
		System.out.println(art);
		suite="/page1.jsp";
		
		return suite;
	}

}
