
import java.util.*;
 class Room {
   int height;
   int width;
   int breadth;
   Room(int height, int width, int breadth){
	   this.height = height;
	   this.width = width;
	   this.breadth = breadth;
	   }


	public int volume() {
		return height * width * breadth;
		}
 }
   public class RoomDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub Room[] rooms = { new Room(10, 12, 8), new Room(15, 10, 10) };
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Height");
		int height=sc.nextInt();
		
		System.out.println("Enter Width");
		int width=sc.nextInt();
		
		System.out.println("Enter Breadth");
		int breadth=sc.nextInt();
		 Room room = new Room(height, width, breadth);
	     
		   System.out.println("volume: " + room.volume());
		   
	}
     
}
