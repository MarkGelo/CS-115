import java.util.Scanner;
public class PersonClient{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Input time arrive in elevator: ");//allows user to input stuff
		int arrive = in.nextInt();
		System.out.print("Input what floor they are in: ");
		int floor = in.nextInt();
		Person user = new Person(arrive, floor);
		System.out.println(user);
		//tests mutators
		user.setElevatorLeave(5);
		user.setLeaveElevator(7);
		System.out.println(user);
		
	}
}