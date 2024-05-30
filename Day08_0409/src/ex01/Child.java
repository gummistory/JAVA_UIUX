package ex01;

public class Child extends Parent {
	
	int z;
	
	Child(){
		super();
	}
	
	Child(int x, int y, int z){
		super(x, y);
		this.z = z; 
	}
	
	
	
	
//	void varTest() {
//		System.out.println(x);
//		System.out.println(this.x); // x = this.x 같음 
//		System.out.println(super.x); // 부모에 있는 x 
//	}

}
