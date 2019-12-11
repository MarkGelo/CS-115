import java.io.*;
import java.util.*;
public class FindDuplicates{
	private String fileName;//instance variable
	
	public FindDuplicates(String file){//non default constructor
		fileName = file;
	}
	public String getFileName(){ // accessor
		return fileName;
	}
	public void setFileName(String newFile){//mutator
		fileName = newFile;
	}
	public String getDuplicates(){//get the duplicates
		try{
		File text = new File(fileName + ".txt");
		Scanner in = new Scanner(text);
		int prevKey = 0;
		int key;
		int number = 0;
		String dup = "";
		System.out.println("DUPLICATES");
		while(in.hasNext()){//while it has another line
			number += 1;
			key = in.nextInt();//gets the key
			String a = in.nextLine();//gets the whole stuff after the key
			if (key == prevKey){//compares the key before
				dup = (dup + number + " " +  key + a + "\n");//if key is same, adds the line to a string
			}
			prevKey = key;//makes the key into prevkey
		}
		return dup;
		}catch(Exception io){//if theres an error - wrong input etc
			return ("Error");
		}
	}
	public String toString(){//string
		return ("File = " + fileName + ".txt");
	}
}