package collection;
import java.util.HashSet;
import java.util.Set;
public class SetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> s=new HashSet<String>();
		s.add("white");
		s.add("pink");
		s.add("blue");
		s.add("black");
		s.add("red");
		System.out.println(s);
		Set <String> s1=new HashSet<String>();
		s1.add("green");
		s1.add("violet");
		s1.add("yellow");
		s.addAll(s1);
		System.out.println(s);
		System.out.println(s.contains("green"));
		System.out.println(s1.containsAll(s));
		
		
		

	}

}
