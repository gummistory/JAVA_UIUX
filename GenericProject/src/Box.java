import java.util.ArrayList;

// 제네릭스
// 클래스 멤버의 타입 컴파일 시에 정의 하는 방법
// 사용 가능한 데이터의 타입을 제한 한다.
// 타입의 안정성을 주기 위해서 사용한다.
// 제네릭스타입은 참조형만 가능하다.
// 제네릭스 타입 자체를 제한해서 사용 할 수 있다. 

public class Box <T> {

		ArrayList<T> list = new ArrayList<>();
		
		void add(T item) {  // 다형성 적용 
			list.add(item);
		}
		
		T get(int i) {
			return list.get(i);
		}
		
		int size() {
			return list.size();
		}
		
		public String toStirng() {
			return list.toString();
		}
}
