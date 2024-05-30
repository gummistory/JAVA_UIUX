package circle2;

import circle.Circle;

public class CircleChild extends Circle {
	
	public int angle; // 각도 입력 받기 
	
	// 부모 생성자를 호출 하는 방식 
	public CircleChild(int radius, int angle){
		super(radius);
		this.angle = angle; 
		
	}

	public double getArea() {
		return 2 * radius * PI * (angle/360.0);
	}
	
	
}
