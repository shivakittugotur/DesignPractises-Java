package mainPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
interface InputPersistor{
	 public void PersistDocument(Object serializedDoc, File targetFileName);
}
public abstract class DocumentStorage implements InputPersistor {
	
	String GetData(File sourceFileName) throws IOException
     {
         String output="";
        try {
        	FileReader freader = new FileReader(sourceFileName);
    		BufferedReader br = new BufferedReader(freader);
    		String s;
    		while((s = br.readLine()) != null) {
    		output+=s;
    		}
    		freader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
         return output;
     }

     public abstract void PersistDocument(Object serializedDoc, File targetFileName);
}

