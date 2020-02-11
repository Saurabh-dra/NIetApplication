package capgemini.firstproject.welcome;

interface Power {
	double power(double a,double b); 
}

public class Lab10_First {
	
	public static void main(String[] args) {
		
		double x,y;
		x=2;
		y=2;
		
		Power p=(a,b)->{
			return (Math.pow(a, b));
		};
		System.out.println(p.power(x, y));
		
		
	}

}
