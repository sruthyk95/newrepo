package superkey;

public class SuperMethodChild extends SuperMethod {
	public void display2()
	{
		super.display();
		System.out.println("world");
	}

	public static void main(String[] args) {
		
		SuperMethodChild obj=new SuperMethodChild();
		obj.display2();
		
	}

}
