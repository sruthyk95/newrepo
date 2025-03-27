package inheritance;

public class HierarchialChildA extends HierarchialParent{
	public void display1() {
		System.out.println("child A");
	}

	public static void main(String[] args) {
		HierarchialChildA obj=new HierarchialChildA	();
		obj.display();
		obj.display1();
	

	}

}
