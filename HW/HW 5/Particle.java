import java.text.*;
public class Particle{
	private double a;
	private double b;
	private double c;
	private double d;
	private final DecimalFormat DECIMAL = new DecimalFormat("0.000");//constant to format to 3 decimals
	public Particle(double A, double B, double C, double D){
		a = A;
		b = B;
		c = C;
		d = D;
	}
	public double getA(){//accessors
		return a;
	}
	public double getB(){
		return b;
	}
	public double getC(){
		return c;
	}
	public double getD(){
		return d;
	}
	public void setA(double newA){//mutators
		a = newA;
	}
	public void setB(double newB){
		b = newB;
	}
	public void setC(double newC){
		c = newC;
	}
	public void setD(double newD){
		d = newD;
	}
	public double location(double time){//calculates location
		double loc = a * Math.pow(time, 4) + b * Math.pow(time, 3) + c * Math.pow(time, 2) + d * time;
		return loc;
	}
	public double velocity(double time){//calculates velocity
		double vel = 4 * a * Math.pow(time, 3) + 3 * b * Math.pow(time, 2) + 2 * c * time;
		return vel;
	}
	public void table(double start, double end, double increment){//makes table
		if(increment <= 0){
			System.out.println("Cant have negative or 0 increment");
		}
		else if(end - start <= 0){
			System.out.println("Cant have the end time be less than or equal to start time");
		}
		else{
			System.out.println("Time" + "\t" + "Location" + "\t" + "Velocity");
			for (double i = start; i <= end ; i = i + increment){
				System.out.println(i + "\t" + DECIMAL.format(location(i)) + "\t"  + "\t" + DECIMAL.format(velocity(i)));
			}
		}
	}
	public String toString(){//returns location equation with the given values
		return ("location = " + a + "t^4 + " + b + "t^3 + " + c + "t^2 + " + d + "t");
	}
}