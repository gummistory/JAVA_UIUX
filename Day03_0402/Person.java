package project2;

import java.util.Objects;

// id와 이름이 전부 같아아 같은 사람으로 취급하겠다. 
public class Person {
	long id;
	String name;

	public Person(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		Person other = null; //지역변수니까 null필수
		
		
		if(obj instanceof Person) {
			other = (Person)obj;
			
		}
		return this.id == other.id && (this.name).equals(other.name);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id,name);
	}

}

// equals를 오버라이드 하면 hashCode도 오버라이드해야한다. 
///return Objects.hash(id,name); = 해시 코드가 같아지게 만들어줌.