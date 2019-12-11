import java.util.Scanner;
public class hw1Exponent{
	public static double exponent(double a, double b){
		return Math.pow(a,b);//a^b
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("x^y");//shows the user what to do
		System.out.println("Type in x");
		double x = input.nextDouble();//user types in the number they want for x
		System.out.println("Type in y");
		double y = input.nextDouble();//user types in the number they want for y
		
		double answer = exponent(x,y);//calls the method to get the answer
		System.out.println(x + "^" + y + " = " + answer);//example 2^3 = 8
	}
}