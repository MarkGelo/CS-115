import java.util.Scanner;
public class hw1Debt{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);//allows user to input from keyboard
		double income;//initializes the variables
		double monthlydebt;
		System.out.println("Type in your income");
		income = input.nextDouble();//whatever the user types in is the income
		System.out.println("Type in the total of your other monthly debts");
		monthlydebt = input.nextDouble();//whatever the user types in is their monthly debt
		
		double lowerLimit = .36 * income - monthlydebt;//calculates the lower limit
		double upperLimit = .42 * income - monthlydebt;//calculates the upper limit
		System.out.println("The lower limit is " + lowerLimit);//prints out the lowerlimit
		System.out.println("The upper limit is " + upperLimit);//prints out the upper limit
	}
}