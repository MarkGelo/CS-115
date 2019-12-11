import java.util.Scanner;
public class FederalTaxApp{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		FederalTax def = new FederalTax();//default federaltax object
		FederalTax negative = new FederalTax(-10);//tests negative
		FederalTax bracket1 = new FederalTax(10000);//one for each bracket to test
		FederalTax bracket2 = new FederalTax(50000);
		FederalTax bracket3 = new FederalTax(100000);
		FederalTax bracket4 = new FederalTax(200000);
		FederalTax bracket5 = new FederalTax(300000);
		
		System.out.println(def.toString());//tests default, negative and brackets
		System.out.println(negative.toString());
		System.out.println(bracket1.toString());
		System.out.println(bracket2.toString());
		System.out.println(bracket3.toString());
		System.out.println(bracket4.toString());
		System.out.println(bracket5.toString());
		
		System.out.println("Enter your taxable income:");//allows user to input his own tax
		double income = in.nextDouble();
		FederalTax userTax = new FederalTax(income);
		System.out.println(userTax.toString());
	}
}