import java.util.Scanner;
public class FindDuplicatesApp{
	public static void main(String[] args){
		FindDuplicates input1 = new FindDuplicates("input1");//creates objects for the test cases, 3 inputs
		FindDuplicates input2 = new FindDuplicates("input2");
		FindDuplicates input3 = new FindDuplicates("input3");
		
		System.out.println(input1);//string method
		System.out.println(input1.getDuplicates());//gets the duplicates
		
		System.out.println(input2);
		System.out.println(input2.getDuplicates());
		
		System.out.println(input3);
		System.out.println(input3.getDuplicates());
		
		Scanner in = new Scanner(System.in);//allows user to input his own
		System.out.print("Type the name of a text file: ");
		String file = in.next();
		FindDuplicates user = new FindDuplicates(file);
		System.out.println(user);
		System.out.println(user.getDuplicates());
	}
}