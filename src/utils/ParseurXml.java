package utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;





public class ParseurXml {
	
		Map<String, String>  lesActions = new HashMap<String,String>();
		
		//String fichier="/Users/lihongyu/eclipse-workspace/framework/WebContent/WEB-INF/config.xml";
		
		public ParseurXml() throws ParserConfigurationException, SAXException, IOException {
			String fichier="/Users/lihongyu/eclipse-workspace/framework/WebContent/WEB-INF/config.xml";
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			Document document = builder.parse(fichier);
			
			Node enfanturl=null;
			Element racine = document.getDocumentElement();
			NodeList bases = racine.getElementsByTagName("mapping");
			
			//parcour des elements
			for(int i=0; i< bases.getLength();i++) {
				Node base = bases.item(i);
				//element enfant
				NodeList elements= base.getChildNodes();
				for(int j=0; j<elements.getLength();j++) {
					Node enfant = elements.item(j);
					if(enfant.getNodeName().equals("url")) {
						System.out.println(enfant.getTextContent());
						enfanturl= elements.item(j);
					}	
					if(enfant.getNodeName().equals("action")) {
						System.out.println(enfant.getTextContent());
						lesActions.put(enfanturl.getTextContent(),enfant.getTextContent());
					}
				}
				
			}
		}
		
		public Map<String, String> getMaMap(){
			/*//ParseurXml p = new ParseurXml();
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = null;
			try {
				builder = factory.newDocumentBuilder();
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Document document = null;
			try {
				document = builder.parse(fichier);
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Element racine = document.getDocumentElement();
			NodeList bases = racine.getElementsByTagName("mapping");
			
			for(int i=0; i< bases.getLength();i++) {
				Node base = bases.item(i);
				//element enfant
				NodeList elements= base.getChildNodes();
				for(int j=0; j<elements.getLength();j++) {
					Node enfant = elements.item(j);
					if(enfant.getNodeName().equals("url"))
						System.out.println(enfant.getTextContent());
						enfanturl= elements.item(j);
					if(enfant.getNodeName().equals("action"))
						System.out.println(enfant.getTextContent());
						lesActions.put(enfanturl.getTextContent(),enfant.getTextContent())
				}
				
			}*/
			return lesActions;
		}
		
		/*public static void main (String[] args) throws ParserConfigurationException, SAXException, IOException{
			//ParseurXml p = new ParseurXml();
			String fichier="/Users/lihongyu/eclipse-workspace/framework/WebContent/WEB-INF/config.xml";
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			Document document = builder.parse(fichier);
			
			Element racine = document.getDocumentElement();
			NodeList bases = racine.getElementsByTagName("mapping");
			
			//parcour des elements
			for(int i=0; i< bases.getLength();i++) {
				Node base = bases.item(i);
				//element enfant
				NodeList elements= base.getChildNodes();
				for(int j=0; j<elements.getLength();j++) {
					Node enfant = elements.item(j);
					if(enfant.getNodeName().equals("url"))
						System.out.println(enfant.getTextContent());
					if(enfant.getNodeName().equals("action"))
						System.out.println(enfant.getTextContent());
				}
				
			}
			
		}*/
}
