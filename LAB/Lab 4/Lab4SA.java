import java.util.Scanner;
public class Lab4SA{
	public static double surfaceArea(double weight, double height){//method for calculating body surface area
		double bodySurfaceArea = Math.pow(weight,0.425) * Math.pow(height,0.725) * 0.007184; //used double because Math is double already
		return bodySurfaceArea;
	}
	public static double spandexCost(double bsa, double cost){//method for calculating total spandex cost
		double totalcost = bsa * cost;
		return totalcost;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Type in your weight in kilograms");
		double weight = in.nextDouble();//gets the users weight in kg
		System.out.println("Type in your height in centimeters");
		double height = in.nextDouble();//gets the users height in cm
		System.out.println("Type in the cost of costume per meter squared");
		double cost = in.nextDouble();//gets the spandex cost per m^2
		double BodySurfaceArea = surfaceArea(weight, height);//gets the surface area and stores it in a variable
		System.out.println("Body Surface Area = " + BodySurfaceArea);//prints out the body surface area
		System.out.println("Spandex cost = " + spandexCost(BodySurfaceArea, cost)); //prints out the total spandex cost
		
		
	}
}