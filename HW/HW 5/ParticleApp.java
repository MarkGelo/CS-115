import java.util.Scanner;
public class ParticleApp{
	public static void main(String[] args){
		try{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the values for a, b, c ,d : " );
		double a = in.nextDouble();//gets a b c d
		double b = in.nextDouble();
		double c = in.nextDouble();
		double d = in.nextDouble();
		Particle user = new Particle(a, b, c, d);
		System.out.println(user);
		
		System.out.println();
		System.out.print("Enter the start time: ");
		double start = in.nextDouble();
		System.out.print("Enter the end time: ");
		double end = in.nextDouble();
		System.out.print("Enter the increment: ");
		double increment = in.nextDouble();//gets variables for table
		user.table(start, end, increment);
		}catch(Exception ex){
			System.out.println("Invalid input");
		}
	}
}