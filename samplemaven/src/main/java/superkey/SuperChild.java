package superkey;

public class SuperChild extends SuperVariable{
	String colour="red";
	public void display()
	{
		System.out.println(colour);
		System.out.println(super.colour);
	}

	public static void main(String[] args) {
		SuperChild obj=new SuperChild();	
				obj.display();
		// TODO Auto-generated method stub

	}

}
