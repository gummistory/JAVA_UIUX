import java.util.HashMap;
import java.util.Map;

public class HashMapTest2 {

	public static void main(String[] args) {
		
		Map<String,String> cities = new HashMap<>();
		cities.put("Tokyo", "Japan");
		cities.put("Beijing", "China");
		cities.put("Washington", "USA");
		cities.put("Seoul", "Korea");
		cities.put("Valletta", "Malta");
		cities.put("Paris", "France");
		
		
		// 향상된 for 문 구조로 읽어오기 
		for(Map.Entry<String, String> entry : cities.entrySet()) {
			System.out.println("key : " + entry.getKey() + ", value : "+ entry.getValue());
			
		}

	}
	
	
}

