
public class Area {
	int side;
	Area (int i)
	{
	side = i;     // this is constructor part
	}
 int RoomArea()
 {
	 return(side*side);  // this is method
 }
 	public static void main(String args[]) 
 	{
 		Area obj1 = new Area(10);
 		System.out.println(obj1.RoomArea());
		
	}
}
