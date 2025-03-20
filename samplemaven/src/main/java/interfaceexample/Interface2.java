package interfaceexample;

public class Interface2 implements Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2 obj=new Interface2();
		obj.display();
		obj.show();

	}

	@Override
	public void display() {
		System.out.println("display");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		System.out.println("show");
		// TODO Auto-generated method stub
		
	}

}
