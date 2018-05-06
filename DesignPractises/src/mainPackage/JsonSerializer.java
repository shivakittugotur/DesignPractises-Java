package mainPackage;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
interface DocumentSerializer{
	public Object Serilize(Object doc);
}
public class JsonSerializer implements DocumentSerializer{
	
	public Object Serilize(Object doc)
    {
		GsonBuilder gsonBuilder = new GsonBuilder();
	    Gson gson = gsonBuilder.create();
	    return gson.toJson(doc);

        
    }
	
}
