import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;




//import net.sf.json.JSONObject;



public class Post {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Object>m=new HashMap<String,Object>();
		m.put("name", "thirupathi");
		m.put("designation","Automation Tester");
		System.out.println(m);
		
		//JSONObject j=new JSONObject(m);
		JSONObject j=new JSONObject(m);
		//j.put("name", "thirupathi");
		//j.put("job", "testing");
		System.out.println(j);
		
		
		
		

	}

}
