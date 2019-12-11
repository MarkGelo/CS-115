import java.util.Scanner;
public class Arrays{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("How many days worth of high temperatures do you have to enter?");
		int days = Math.abs(in.nextInt());//just in case the user inputs negative number
		double[] temp = new double[days];//creates an array for the days and changes
		double[] change = new double[days];
		int maxDay1;
		int maxDay2;
		double maxChange;
		for (int i = 0; i < temp.length; i++){
			System.out.print("Enter high temperature for day " + (i + 1) + ": ");
			temp[i] = in.nextDouble();//asks user for temp for each day and puts them into array
		}
		for (int i = 0; i < temp.length - 1; i++){
			change[i] = temp[i+1] - temp[i];//calculates difference between each day into an array
		}
		maxChange = change[0];
		maxDay1 = 1;
		maxDay2 = 2;
		for (int i = 1; i < change.length; i++){
			if (Math.abs(change[i]) >= Math.abs(maxChange)){//checks which temp change is highest
				maxChange = change[i];//iif its the highest change, puts the tempchange and days into variables
				maxDay1 = i + 1;
				maxDay2 = i + 2;
			}
			else{
			}
		}
		System.out.println("The maximum day to day high temperature change is " + maxChange + " and occured between days " + maxDay1 + " and " + maxDay2);
	}
}