package inheritance;

public class MultilevelChildC extends MultilevelParentB  {

	
		public void display2()
		{
			System.out.println("child c");
		}
		public static void main(String[] args) {
			
			 MultilevelChildC obj=new  MultilevelChildC();
			 obj .display();
			 obj.display1();
			 obj.display2();
	}

}
