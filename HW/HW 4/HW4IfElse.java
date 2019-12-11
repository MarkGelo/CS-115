import java.util.Scanner;
public class HW4IfElse{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a positive three digit number : ");
		String number = in.next();
		int num = Integer.parseInt(number);//gets the integer for if/else
		if (num >= 100 && num <= 999){//checks if three digit number
			String num1 = number.substring(0,1);//gets the first, second, third digits
			String num2 = number.substring(1,2);
			String num3 = number.substring(2,3);
		
			String numberReversed = num3 + num2 + num1;//reverses the digits
			System.out.println("Your number reversed : " + numberReversed);
		}
		else{//not 3 digit number - prints out error
			System.out.println("Error, not three-digit number");
		}
		
	}
}