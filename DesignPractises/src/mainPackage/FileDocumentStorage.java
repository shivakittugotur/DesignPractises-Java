package mainPackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class FileDocumentStorage extends DocumentStorage{
	 public void PersistDocument(Object serializedDoc, File targetFileName)
    {
		 FileWriter fwriter;
   	 try {
			fwriter = new FileWriter(targetFileName);
			 fwriter.write(serializedDoc.toString());
	    	 fwriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
   	 System.out.println(serializedDoc.toString());   
    }
}