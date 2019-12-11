import java.io.*;
import java.util.Scanner;
public class StringStatsClient{
	public static void main(String[] args){
		try{
		Scanner in = new Scanner(System.in);
		System.out.println("What is the name of the input file?");
		String file = in.next();//gets name of txt file
		File user = new File(file);
		Scanner txt = new Scanner(user);//reads txt file
		int words = 0;
		int lines = 0;
		String text;
		StringStats wordsText = new StringStats();//uses the class i made
		while(txt.hasNext()){//if theres a next line
			lines += 1;
			text = txt.nextLine();//inputs the whole line to the variable
			wordsText.setLine(text);//sets the line
			words += wordsText.wordCount();//uses the method in the class i made to calculate words
		}
		System.out.print("Total Lines = " + lines + " Total Words = " + words);//prints it out for user
		}catch(Exception ex){
			System.out.println("Error");//if theres an error
		}
	}
}