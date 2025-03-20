package exceptionhandling;

public class ExceptionExample {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
		int c=a/b;
		}
		/*catch(ArithmeticException e)
		{
			b=2;
			int s=a/b;
			System.out.println(s);
			System.out.println(e);
		}*/
		finally {
			System.out.println("exception");
		}
		
		// TODO Auto-generated method stub

	}

}
