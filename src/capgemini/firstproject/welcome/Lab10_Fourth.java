package capgemini.firstproject.welcome;

public class Lab10_Fourth {
	
	public static void main(String[] args) {
		Lab10_Fourth obj=new Lab10_Fourth();
		creation c= obj::set;
		c.show();
	}
	
	void set() {
		System.out.println("This is Method Reference");
	}

}
interface creation{
	void show();
}
