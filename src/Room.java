
/*this is constructoroverloading example
 * taking different arguments and several constructors */
public class Room {
	float length;
	float breadth;
	Room (int i)
	{
		length = i;
		breadth = i;
		
	}
	Room (float k)
	{
		length = k;
		breadth = k;
	}
	Room (int i, int j)
	{
		length = i;
		breadth = j;
		
	}
	float RoomArea()
	{
		return length*breadth;
	}
	public static void main(String args []) {
		Room obj1 = new Room(10.56f);
		System.out.println("Room Area is" +	obj1.RoomArea());
		Room obj2 = new Room(10,12);
		System.out.println("Room Area is" +	obj2.RoomArea());
	}

}
