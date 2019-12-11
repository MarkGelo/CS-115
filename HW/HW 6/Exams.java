import java.util.Scanner;
public class Exams{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("How many exam scores do you have to enter?");
		int number = in.nextInt();//gets the amount of scores to enter
		double total = 0;
		double scores[] = new double[number];//instantiates variable
		for(int i = 0 ; i < scores.length ; i++){//asks amount of times based on exam scores to enter
			System.out.print("Enter score #" + (i+1) + ":");
			scores[i] = Math.abs(in.nextDouble());//inputs the scores into the array, makes sure its positive by doing abs value
			total += scores[i];//adds up the scores 
		}
		double avg = total / number;//calculates avg
		System.out.println("The average score is: " + avg);
		int count = 0;
		for(int i = 0 ; i < scores.length ; i++){
			if (scores[i] > avg){//to get the number of scores higher than avg
				count += 1;
			}
			else{
			}
		}
		System.out.println("There are " + count + " scores larger than the average");
	}
}