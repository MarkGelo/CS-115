import java.text.*;
public class InvestCalc{
	private double interestRate;//instance variable
	private double principal;
	private final double SHORT = 5;//constants
	private final double MIDDLE = 10;
	private final double LONG = 20;
	private final NumberFormat DOLLAR = NumberFormat.getCurrencyInstance();//format
	private final DecimalFormat PERCENT = new DecimalFormat("##0.00%");
	private final DecimalFormat DECIMAL = new DecimalFormat("##0.##");
	public InvestCalc(){//default constructor
		interestRate = 0;
		principal = 0;
	}
	public InvestCalc(double interest, double p){//constructor
		interestRate = interest;
		principal = p;
	}
	public double getInterestRate(){//accessor
		return interestRate;
	}
	public double getPrincipal(){
		return principal;
	}
	public void setRate(double newInterest){//mutator
		interestRate = newInterest;
	}
	public void setPrincipal(double newPrincipal){
		principal = newPrincipal;
	}
	public String toString(){//string
		return ("Interest Rate = " + PERCENT.format(interestRate) + " Principal = " + DOLLAR.format(principal));
	}
	public double futureValue(double year){//calculates future value
		double newRate;
		if (principal >= 10000){//if principal 10000 or more, increase interest rate by 0.5%
			newRate = interestRate + 0.005;
		}
		else{
			newRate = interestRate;
		}
		double fV = principal * Math.pow(1 + newRate, year);
		return fV;
	}
	public void displayTable(){//prints a table
		System.out.println("YEAR" + "\t" + "INTEREST RATE" + "\t" + "PRINCIPAL" + "\t" + "FUTURE VALUE");
		System.out.println(DECIMAL.format(SHORT) + "\t" + PERCENT.format(interestRate) + "\t" + "\t" + DOLLAR.format(principal) + "\t" + DOLLAR.format(futureValue(SHORT)));
		System.out.println(DECIMAL.format(MIDDLE) + "\t" + PERCENT.format(interestRate) + "\t" + "\t" + DOLLAR.format(principal) + "\t" + DOLLAR.format(futureValue(MIDDLE)));
		System.out.println(DECIMAL.format(LONG) + "\t" + PERCENT.format(interestRate) + "\t" + "\t" + DOLLAR.format(principal) + "\t" + DOLLAR.format(futureValue(LONG)));
	}
}