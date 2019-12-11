import java.util.Scanner;
public class SimulatorClient{
	public static void main(String[] args){
		try{
		Scanner in = new Scanner(System.in);
		System.out.print("Input File: ");//user inputs file
		String file = in.next();
		System.out.print("Manual Toll Booths: ");//input number of manual and automatic
		int manual = in.nextInt();
		System.out.print("Automatic Toll Booths: ");
		int automatic = in.nextInt();
		Simulator go = new Simulator(file, manual, automatic);//instantiate simulator
		go.start();//starts simulation
		System.out.println(go.tollLineStats());//prints out statistics
		System.out.println(go.doneStats());
		}catch(Exception ex){
		}
	}
}