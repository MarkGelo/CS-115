import java.util.Scanner;
public class BallApp{
	public static void main(String[] args){
		try{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter bounce percentage:");//allows user to input his own stuff
		double percent = in.nextDouble();
		System.out.print("Enter initial height:");
		double height = in.nextDouble();
		System.out.print("Enter number of bounces:");
		int bounce = in.nextInt();
		Ball user = new Ball(percent);
		user.bounceTable(height, bounce);//prints out table
		}catch(Exception ex){
			System.out.println("Invalid input");
		}
	}
}