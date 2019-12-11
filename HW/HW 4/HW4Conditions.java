import java.util.Scanner;
public class HW4Conditions{
	public static void main(String[] args){
		try{
		Scanner in = new Scanner(System.in);
		boolean start = true;
		int number;
		while (start){
			System.out.println("Enter an integer between 0 and 100");
			number = in.nextInt();
			if (number >= 0 && number <= 100){//when user finally inputs correct integer, sets start to false to stop looping
				start = false;
			}
			else{//tells user wrong input, try again
				System.out.println("Not an integer between 0 and 100! Try again");
			}
		}
		}catch (Exception ex){//if didnt enter a number, would say invalid input
			System.out.println("Invalid input");
		}
	}
}