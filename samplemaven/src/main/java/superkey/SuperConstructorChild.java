package superkey;

public class SuperConstructorChild extends SuperConstructor {
	public SuperConstructorChild() 
	{
		 super(4,9);
		System.out.println("default constructor");
	}

	public static void main(String[] args) {
		
		SuperConstructorChild obj=new SuperConstructorChild();
		
	}

}
