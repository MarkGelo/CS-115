import java.util.Scanner;
public class ZoningApp{
	public static void main(String[] args){
		Zoning def = new Zoning();//tests default constructor and height and unit count limits
		System.out.println(def);
		
		Scanner in = new Scanner(System.in);//allows user to input his own length and width
		System.out.print("Enter your lot length:");
		double length = in.nextDouble();
		System.out.print("Enter your lot width:");
		double width = in.nextDouble();
		Zoning userLot = new Zoning(length, width);
		System.out.println(userLot);//gives you the values, also the height and unit count limits
		
		System.out.print("Enter your lot length:");
		length = in.nextDouble();
		System.out.print("Enter your lot width:");
		width = in.nextDouble();
		Zoning userLot1 = new Zoning(length, width);
		System.out.println(userLot1);
		
		Zoning neg = new Zoning(-50,165);//tests negative length
		System.out.println(neg);
		
	}
}