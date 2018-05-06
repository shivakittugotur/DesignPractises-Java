package mainPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class CsvParser extends InputParser {
	public List<Student> ParseInput(File sourceFileName)
    {
		String output="";
		List<Student> students=new ArrayList<Student>();
        try {
        	FileReader freader = new FileReader(sourceFileName);
    		BufferedReader br = new BufferedReader(freader);
    		String s;
			while((s = br.readLine()) != null) {
				output+=s+",";
			}
    		freader.close();
    		StringTokenizer st1=new StringTokenizer(output,",");
    		System.out.println(output);
    		while (st1.hasMoreTokens()) {
    			Student student =new Student(st1.nextToken(),st1.nextToken(),st1.nextToken(),Integer.parseInt(st1.nextToken()));
    			students.add(student);
    		}
    		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
        catch( IOException e ) {
        	e.printStackTrace();
			System.exit(1);
        }
        return students;
		
    
    }


}
