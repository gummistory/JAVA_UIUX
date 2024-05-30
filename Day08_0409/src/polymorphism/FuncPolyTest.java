package polymorphism;

public class FuncPolyTest {
	public static void main(String[] args) {
		
		FireEngine fe = new FireEngine();
		Ambuance ab = new Ambuance(); 
		
		FuncPoly fp = new FuncPoly();
		
		fp.doWork(fe);
		fp.doWork(ab);
	}

}

