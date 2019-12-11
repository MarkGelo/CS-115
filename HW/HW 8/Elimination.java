import java.util.Scanner;
import java.util.Random;
public class Elimination{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		boolean start = true;
		int[] score = new int[12];//instantiates
		String[] show = new String[12];
		for(int i = 0; i < show.length; i++){
			show[i] = " ";//for the marks X X X , not marked yet
			score[i] = i + 1; // for the scores in backend
		}
		int roll1;
		int roll2;
		boolean choice;
		String move;
		while(start){
			choice = true;
			System.out.println("1 2 3 4 5 6 7 8 9 10 11 12");
			System.out.println(show[0] + " " + show[1] + " " + show[2] + " " + show[3] + " " + show[4] + " " + show[5] + " " + show[6] + " " + show[7] + " " + show[8] + " " + show[9] + "  " + show[10] + "  " + show[11]);
			roll1 = rand.nextInt(11) + 1;
			roll2 = rand.nextInt(11) + 1;//random rolls between 1 and 12
			System.out.println("Dice Roll: " + roll1 + " " + roll2);
			while(choice){
				System.out.println("What is your move (V = values, S = sum, Q = quit");
				move = in.next();
				if(move.equals("Q") || move.equals("q")){//if quit
					choice = false;
					start = false;
				}
				else if(move.equals("S") || move.equals("s")){//if sum
					if(roll1 + roll2 > 12){//if sum greater than 12, cant do anything, asks user again
					}
					else if(score[roll1 + roll2 - 1] == 0){//if sum is marked already, asks user again
					}
					else{
						score[roll1 + roll2 - 1] = 0;//makes the value of the sum 0 
						show[roll1 + roll2 - 1] = "X";//makes an X
						choice = false;
					}
				}
				else if(move.equals("V") || move.equals("v")){//if values
					if(roll1 == roll2){//if same numbers, cant do this option, rules
					}
					else if(score[roll1 - 1] == 0 || score[roll2 - 1] == 0){//if one of the number is already marked, cant do this, rules
					}
					else{
						score[roll1 - 1] = 0;//makes the value of the numbers 0
						score[roll2 - 1] = 0;
						show[roll1 - 1] = "X";//makes an X
						show[roll2 - 1] = "X";
						choice = false;
					}
				}
				else{
					System.out.println("Not a valid move");
					choice = false;
				}
			}
			System.out.println("Game over");
			int total = 0;
			for(int i = 0; i < score.length; i++){//calculates the total of the remaining numbers
				total += score[i];
			}
			System.out.println("Score = " + total);
		}
	}
}