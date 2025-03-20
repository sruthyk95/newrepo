package abstraction;

public class AbstractChild extends AbstractionParent {
	public void show()
	{
	System.out.println("show");	
	}

	public static void main(String[] args) {
		/* AbstractChild obj=new  AbstractChild();
		 obj.display();
		 obj.display2();*/
		
		AbstractionParent obj=new AbstractChild ();
		obj.display();
		obj.display2();
		
		// TODO Auto-generated method stub

	}
	
	public void display() {
		System.out.println("abstract");
	}

}
