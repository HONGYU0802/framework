package controleur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import actions.Action;
import actions.ActionLogin;
import actions.ActionPage1;
import actions.ActionQuitter;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import utils.UsineANew;


/**
 * Servlet implementation class ActionServlet
 */
public class ActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	UsineANew fact= new UsineANew() ;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String provenance = request.getServletPath();
		Action act = fact.getAction(provenance);
		String suite=act.perform(request, response);
		this.getServletContext().getRequestDispatcher(suite).forward(request, response);
/*		System.out.println(provenance);
		String suite=null;
		Action act =null;
		if(provenance.equals("/actionLogin.fraise")) {
			//recuperer le parametre
			//si le param est "sesame"
				//forword ver page1.jsp
			//forward ver erreur.isp
//			String log=request.getParameter("nom");
//			if(log.equals("Sesame")) {
//				suite="/page1.jsp";
//			}
//			else suite="/erreur.jsp";
			act=new ActionLogin();
			suite=act.perform(request, response);
						
		}
		
		if(provenance.equals("/page1.fraise")) {
//			String art=request.getParameter("article");
//			System.out.println(art);
//			suite="/page1.jsp";
			act=new ActionPage1();
			suite=act.perform(request, response);

		}

		if(provenance.equals("/quitte.fraise")) {
//			suite="/goodbye.jsp";
			act=new ActionQuitter();
			suite=act.perform(request, response);
		}
		getServletContext().getRequestDispatcher(suite).forward(request, response);*/
		
	}

}
