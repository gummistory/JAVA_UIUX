package lambdaStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LambdaTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i<10; i++) {
			list.add(i);
		}
		
		// 데이터 읽어오기 
		// 1. Iterator 방식으로 읽어오기 
		// 2. 향상된 for 문 형식
		
		Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            System.out.println(i);
        }
        System.out.println("=========================");
        // 향상된 for 문을 사용하여 리스트 요소 순회
        for (int i : list) {
            System.out.println(i);
        }
        
        System.out.println("=========================");
        
        // 함수형 인터페이스 
        list.forEach(i->System.out.println(i));   // list 에서 i값 받아오기  
        
        // remove  // 2의 배수 또는 3의 배수를 삭제 
        System.out.println("=========================");
        
        list.removeIf(x -> x % 2 == 0  || x % 3 == 0);
        System.out.println(list);
        
        System.out.println("=========================");

        // i 를 가져오고 i에 곱하기 10해서 모든 값을 바꿔준다. 
        
       list.replaceAll(i -> i * 10);
        System.out.println(list);
        
        // map 
        
        Map<String,String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");
        
       Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
       
       while(it.hasNext()) {
    	   Map.Entry<String, String>entry = it.next();
    	   System.out.println("key : " + entry.getKey() +  ", value : " + entry.getValue());
    	   
           System.out.println("=========================");

       }
       for(Map.Entry<String, String> entry : map.entrySet()) {
    	   System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
       }
       
       map.forEach((key, value)-> System.out.println("key : " + key + "value : "+ value));
//       map.replaceAll((key, value) -> {
//    	   if("2".equals(value) || "3".equals(value)) {
//    		   return "X";
//    	   }
//    	   return value;
//       } 
	}

}
