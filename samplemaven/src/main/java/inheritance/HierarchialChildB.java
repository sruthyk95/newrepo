package inheritance;

public class HierarchialChildB extends HierarchialParent {
	public void display2() {
		System.out.println("child B");
	}

	public static void main(String[] args) {
		HierarchialChildB obj=new HierarchialChildB();	
		obj.display();
		obj.display2();

	}

}
