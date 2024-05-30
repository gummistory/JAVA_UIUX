import circle.Circle;
import circle.Ractangle;
import circle2.CircleChild;

public class FigureAreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 모양의 넓이 구하는 예제 
		
		Circle c = new Circle(5);
		double circleArea = c.getArea();
		
		System.out.println(circleArea);
		
		
		Ractangle r = new Ractangle(10,20);
		int ractangleArea = r.getArea();
		System.out.println(ractangleArea);
		
		
		CircleChild c2 = new CircleChild(5, 90);
		double childArea = c2.getArea();
		System.out.println(childArea);
	}

}
	