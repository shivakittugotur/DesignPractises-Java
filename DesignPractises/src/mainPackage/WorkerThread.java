package mainPackage;
import java.io.File;
import java.io.IOException;  
public class WorkerThread implements Runnable {  
    private String sourceFileName;  
    public WorkerThread(String sourceFileName){  
        this.sourceFileName=sourceFileName;  
    }  
     public void run() {
    	 File sourceFile =new File(sourceFileName);
    	 String outputFolder="src/OutputFiles/";
 		 File targetFile = new File(outputFolder+sourceFile.getName().substring(0, sourceFile.getName().indexOf('.'))+".json");
    	 FormatConverter formatConverter = new FormatConverter();
         try {
			if (!formatConverter.ConvertFormat(sourceFile, targetFile))
			 {
			     System.out.println("Conversion Failed");
			     
			 }
		} catch (IOException | InvalidInputException e) {
			System.out.println("Conversion Failed");
			e.printStackTrace();
		}
         System.out.println(targetFile.getName()+" is created");
         
    }  
   
}  

