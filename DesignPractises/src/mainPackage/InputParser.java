package mainPackage;
import java.io.File;
import java.util.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
public class InputParser {
	public List<Student> ParseInput(File inputFile)
    {
		List<Student> students=new ArrayList<Student>();
		try {
	        
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
//	         System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("Student");
	         System.out.println("----------------------------");
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               Student student =new Student(eElement.getElementsByTagName("StudentId").item(0).getTextContent(),eElement.getElementsByTagName("FirstName").item(0).getTextContent(),eElement.getElementsByTagName("LastName").item(0).getTextContent(),Integer.parseInt(eElement.getElementsByTagName("Age").item(0).getTextContent()));
	               students.add(student);
	            }
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
		return students;
    
    }
}
