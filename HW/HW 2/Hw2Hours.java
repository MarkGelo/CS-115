import java.util.Scanner;

public class Hw2Hours{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter lastname,firstname");
		String name = in.next();//whatever the user inputs, is set as the name
		System.out.println("Enter awake time in hours:");
		int hours = in.nextInt();
		int days = hours / 24;//since its an int, it would evaluate to a single digit, ex. 1.68 = 1
		int remainingHours = hours % 24;//calculates the remaining hours  36%24 = 12 hours left
		String[] parts = name.split(",");//splits the name by the comma
		String firstName = parts[1];
		String lastName = parts[0];
		System.out.println(firstName + ", you have been up for " + days + " days and " + remainingHours + " hours.");
		
	}
}