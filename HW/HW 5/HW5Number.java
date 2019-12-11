import java.util.Scanner;
public class HW5Number{
	public static void main(String[] args){
		try{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 4 integers, start, end, increment(not 0), perLine(greater than 0):");
		int start = in.nextInt();//creates variables for the start, end, increment, and perline
		int end = in.nextInt();
		int increment = in.nextInt();
		int perLine = in.nextInt();
		boolean stop = false;
		while (!stop){
			for (int i = 0; i < perLine; i++){//for the per line stuff
				System.out.print(start + " ");
				start += increment;
				if (end < 0){//for negative end
					if (start < end){//if the number is more than the end then stops and breaks
						stop = true;
						break;
					}
				}
				else{//for positive end
					if (start > end){//if the number is more than the end then stops and breaks
						stop = true;
						break;
					}
				}
			}
			System.out.println();//breaks the line after doing the number per line
		}
		}catch(Exception ex){
			System.out.println("Invalid input");
		}
	}
}