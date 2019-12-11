import java.util.Scanner;
public class Sphere{
	public static double volume(double r){//calculates volume
		double volume;//initializes the variable
		volume = (4d/3d) * Math.PI * Math.pow(r,3);
		return volume;
	}
	public static double area(double r){//calculates surface area
		double area;//initializes the variable
		area = 4 * Math.PI * Math.pow(r,2);
		return area;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Type a radius to get a sphere's volume and area");//tells the user what to do
		double radius = input.nextDouble();//the user puts in the radiu
		double volume = volume(radius);
		double area = area(radius);
		System.out.println("Volume = " + volume);//prints out the volume and area
		System.out.println("Area = " + area);
	}
}