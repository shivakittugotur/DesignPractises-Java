package mainPackage;

import java.io.File;
import java.io.IOException;

public class FormatConverter {
	 private  DocumentStorage _documentStorage;
     private  InputParser _inputParser;
     private  DocumentSerializer _documentSerializer;
     public FormatConverter()
     {
         _documentStorage = new FileDocumentStorage();
         _documentSerializer = new JsonSerializer();

        
     }
     boolean ConvertFormat(File sourceFileName, File targetFileName) throws IOException, InvalidInputException
     {
         
         if(sourceFileName.toString().endsWith(".xml"))
        	 _inputParser=new InputParser();
         if(sourceFileName.toString().endsWith(".csv"))
        	 _inputParser=new CsvParser();
         Object[] doc = (_inputParser.ParseInput(sourceFileName)).toArray();
         Object serializedDoc = _documentSerializer.Serilize(doc);

         try
         {
             _documentStorage.PersistDocument(serializedDoc, targetFileName);
         }
         catch (Exception e)
         {
             return false;
         }
         return true;
     }
 }

