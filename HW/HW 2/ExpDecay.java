import java.text.*;
public class ExpDecay{
	private double lambda;//instance variables
	private double initial;
	private final double SHORT = 5;//constants
	private final double MIDDLE = 25;
	private final double LONG = 50;
	private final DecimalFormat DECIMAL = new DecimalFormat("##0.######");//format
	public ExpDecay(){//default constructor
		lambda = 0;
		initial = 0;
	}
	public ExpDecay(double newLambda, double newInitial){//constructor
		lambda = newLambda;
		initial = newInitial;
	}
	public double getLambda(){//accessor
		return lambda;
	}
	public double getInitial(){
		return initial;
	}
	public void setLambda(double newLambda){//mutator
		lambda = newLambda;
	}
	public void setN0(double newInitial){
		initial = newInitial;
	}
	public String toString(){//string
		return ("Lambda = " + DECIMAL.format(lambda) + " Initial = " + DECIMAL.format(initial));
	}
	public double futureQuantity(double t){//calculates future quantity
		double quantity = initial * Math.pow(Math.exp(1.0),(-lambda) * t);
		return quantity;
	}
	public void displayTable(){//prints a table
		System.out.println("TIME" + "\t" + "LAMBDA" + "\t" + "N0" + "\t" + "FUTURE QUANTITY");
		System.out.println(DECIMAL.format(SHORT) + "\t" + DECIMAL.format(lambda) + "\t" + DECIMAL.format(initial) + "\t" + DECIMAL.format(futureQuantity(SHORT)));
		System.out.println(DECIMAL.format(MIDDLE) + "\t" + DECIMAL.format(lambda) + "\t" + DECIMAL.format(initial) + "\t" + DECIMAL.format(futureQuantity(MIDDLE)));
		System.out.println(DECIMAL.format(LONG) + "\t" + DECIMAL.format(lambda) + "\t" + DECIMAL.format(initial) + "\t" + DECIMAL.format(futureQuantity(LONG)));
	}
}