import java.util.Scanner;
public class PointApp{
	public static void main(String[] args){
		Point one = new Point(0,0);//makes objects to test quadrant and distancefrom methods
		Point two = new Point(5,0);
		Point three = new Point(0,-4);
		Point four = new Point(2,2);
		Point five = new Point(-2,2);
		Point six = new Point(-2,-2);
		Point seven = new Point(2,-2);
		
		System.out.println(one + "Quadrant " + one.whichQuadrant());//tests out quadrant method
		System.out.println(two + "Quadrant " + two.whichQuadrant());
		System.out.println(three + "Quadrant " + three.whichQuadrant());
		System.out.println(four + "Quadrant " + four.whichQuadrant());
		System.out.println(five + "Quadrant " + five.whichQuadrant());
		System.out.println(six + "Quadrant " + six.whichQuadrant());
		System.out.println(seven + "Quadrant " + seven.whichQuadrant());
		//tests distanceFrom method
		System.out.println("Distance from " + four + " to (0,0) is " + four.distanceFrom(0,0));
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an x value: ");//allows the user to input his own coords
		double x = in.nextDouble();
		System.out.print("Enter an y value: ");
		double y = in.nextDouble();
		Point user = new Point(x,y);
		System.out.println(user + "Quadrant " + user.whichQuadrant());
		
		System.out.println("Another set of coordinate to find it's distance from your point");//allows the user to input his own coords
		System.out.print("Enter an x value: ");
		x = in.nextDouble();
		System.out.print("Enter an y value: ");
		y = in.nextDouble();
		System.out.println("Distance from " + user + " to (" + x + "," + y + ") is " + user.distanceFrom(x,y));
	}
}