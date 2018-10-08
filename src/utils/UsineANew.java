package utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import actions.Action;

public class UsineANew {

		Map<String, String> lesActions =new HashMap<String, String>();
		
		public UsineANew(){
//			lesActions.put("/actionLogin.fraise","actions.ActionLogin");
//			lesActions.put("/page1.fraise","actions.ActionPage1");
//			lesActions.put("/quitte.fraise","actions.ActionQuitter");
			
			ParseurXml parse;
			try {
				parse = new ParseurXml();
				lesActions = parse.getMaMap();
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		public Action getAction(String provenance) {
			Action act=null;
			
			String nomClass = lesActions.get(provenance);//"actions.ActionLogin"
			
			//trouver la class a partir de son nom
			try {
				Class classe = Class.forName(nomClass);//ActionLogin.class
				act = (Action) classe.newInstance();
				
			} catch (Exception e) {
				System.out.println("pas de chance");
			}
			
			//instancier la class
			return act;
		}
}
