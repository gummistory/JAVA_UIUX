package circle;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Circle {
	
	protected int radius;
	protected final double PI = 3.14;
	
	
	public Circle(int radius){
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * PI;
	}

	
	
}
