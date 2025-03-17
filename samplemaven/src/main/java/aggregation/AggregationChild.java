package aggregation;

public class AggregationChild {
	String city;
	String state;
	AggregationParent1 ref;//reference variable
	public AggregationChild(String city,String state,AggregationParent1  ref)
	{
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
	public void display()
	{
	System.out.println(ref.name+"  "+ref.rollno);
	System.out.println(city+" "+state);
	}

	public static void main(String[] args) {
		AggregationParent1 obj=new AggregationParent1("sruthy",17,56);
		AggregationChild obj1=new AggregationChild("kollam","kerala",obj);
		obj1.display();
		

	}

}
