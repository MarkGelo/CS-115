import java.util.Scanner;

public class Lab4String{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Type the web address");
		String address = in.next();//gets the webaddress
		System.out.println("Address Length = " + address.length());//prints out the address length
		String first = address.substring(0,3);//end point is the dot, so output is www.
		String name = address.substring(4,address.length() - 4);// end points are dots
		String type = address.substring(address.length() - 3, address.length());//outputs the string after the dot
		System.out.println(first);//prints out the 3 types
		System.out.println(name);
		System.out.println(type);
	}
}