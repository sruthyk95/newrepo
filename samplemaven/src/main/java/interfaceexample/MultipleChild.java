package interfaceexample;

public class MultipleChild implements MultipleParentA,MultipleParentB{

	public static void main(String[] args) {
		MultipleChild obj=new MultipleChild();
		obj.display();
		obj.display1();
		
		// TODO Auto-generated method stub

	}

	@Override
	public void display1() {
		System.out.println("display1");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		System.out.println("display");
		// TODO Auto-generated method stub
		
	}

}
