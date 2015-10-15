
public class ConstructDemo {
	int side;
	ConstructDemo(int i)
	{
		side = i;
	}
	
	public static void main(String args []) {
		ConstructDemo obj1 = new ConstructDemo(10);
		//obj1.DemoConst1();
		System.out.println(obj1.side);
	}

}
