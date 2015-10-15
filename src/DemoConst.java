
public class DemoConst {
	int i;
	DemoConst()   // this is constructor here class and method name must be same
	{
		i=22;
		System.out.println("It is a constructor output");
	
		
	}
	/*void DemoConst1()
	{
		System.out.println("It is a method  output");
		
	}*/
	public static void main(String args []) {
		DemoConst obj1 = new DemoConst();
		//obj1.DemoConst1();
		System.out.println(obj1.i);
	}

}
