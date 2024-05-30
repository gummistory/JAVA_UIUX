import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		
		Map<String,String> cities = new HashMap<>();
		cities.put("Tokyo", "Japan");
		cities.put("Beijing", "China");
		cities.put("Washington", "USA");
		cities.put("Seoul", "Korea");
		cities.put("Valletta", "Malta");
		cities.put("Paris", "France");
		
		Iterator<Map.Entry<String,String>> it = cities.entrySet().iterator();
		
		// Map.Entry -> getKey, getValue() 
		
		// iterator 방식 
		while(it.hasNext()) {
			Map.Entry<String, String> entry = it.next(); // 반환타입이 스트링으로 바뀜 (Map.Entry<String,String>)
			System.out.println("key : " + entry.getKey() + ",    value : " + entry.getValue());
			
			
		}
		
	
		
	}
	
}
