import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Simulator {
	public static final int MAX_LINE_LENGTH=25,		// maximum length of a TollBooth Line
							SIMULATION_LENGTH=7200;	// number of seconds in the simulation
	public static final String AUTO="A", MANUAL="M";	// Vehicle Toll Type Designations (from input file)
	private static final int MANUAL_DELAY=4, AUTO_DELAY=2;	// observed booth delay (in seconds) per axle
	private static final int MAX_SIMULATION_VEHICLES=20000;	// for size of array to store done Vehicles

	private TollBoothLine [] manualLine;		// array of MANUAL Toll Booth Line
	private TollBoothLine [] automaticLine;		// array of AUTOMATIC Toll Booth Line
	private Scanner input;				// Scanner object for reading input file
	private int second;					// the simulation loop counter
	private Vehicle [] doneArray;		// array to store DONE Vehicles for later statistics calculation
	private int doneCount;				// number of Vehicles DONE
	

	public Simulator (String fileName, int manualTollCount, int autoTollCount) throws FileNotFoundException
	{	
		manualLine = new TollBoothLine[manualTollCount]; 
		automaticLine = new TollBoothLine[autoTollCount]; 
		doneArray = new Vehicle[MAX_SIMULATION_VEHICLES];

		second=1;
		doneCount=0;

		for (int i=0;i<manualTollCount ;i++ )
			manualLine[i]=new TollBoothLine(MAX_LINE_LENGTH);
		for (int i=0;i<autoTollCount ;i++ )
			automaticLine[i]=new TollBoothLine(MAX_LINE_LENGTH);

		File inputFile = new File( fileName );
		input = new Scanner(inputFile);
	}

	// Method to run the simulation
	public void start()
	{
		Vehicle v = readNewCar(input);
		while(second<=SIMULATION_LENGTH)
		{
			// add new Vehicles
			while (v!=null && second == v.getArriveLineTime())
			{
				TollBoothLine temp = findShortLine(v.getTollType());
				if (!temp.addVehicleEnd(v))
					System.out.println(v.getTollType() + " Lines Full");
				// if first Vehicle in line, set its booth and leave times
				if (temp.getLength() == 1)	
				{
					Vehicle vv = temp.copyVehicleStart();
					vv.setArriveBoothTime(second);
					if (vv.getTollType().equals(MANUAL))
						vv.setLeaveTime(second+vv.getAxles()*MANUAL_DELAY);
					else
						vv.setLeaveTime(second+vv.getAxles()*AUTO_DELAY);
					temp.replaceVehicleStart(vv);
				}
				v = readNewCar(input);
			}

			// remove Vehicles that are done from all MANUAL lines
			for (int i=0; i<manualLine.length; i++ )
				while (manualLine[i].getLength()>0 &&
					manualLine[i].copyVehicleStart().getLeaveTime() == second)
				{
					doneArray[doneCount]=manualLine[i].removeVehicleStart();
					doneArray[doneCount].setLeaveTime(second);
				
					// if still a Vehicle in line, set its booth and leave times
					if (manualLine[i].getLength() > 0)
					{
						Vehicle temp = manualLine[i].copyVehicleStart();
						temp.setArriveBoothTime(second);
						temp.setLeaveTime(second + temp.getAxles()*MANUAL_DELAY);
						manualLine[i].replaceVehicleStart(temp);
					}
				
					doneCount++;
				}

			// remove Vehicles that are done from all AUTOMATIC lines
			for (int i=0; i<automaticLine.length; i++ )
				while (automaticLine[i].getLength()>0 && 
					automaticLine[i].copyVehicleStart().getLeaveTime() == second)

				{
					doneArray[doneCount]=automaticLine[i].removeVehicleStart();
					doneArray[doneCount].setLeaveTime(second);

					// if still a Vehicle in line, set its booth and leave times
					if (automaticLine[i].getLength() > 0)
					{
						Vehicle temp = automaticLine[i].copyVehicleStart();
						temp.setArriveBoothTime(second);
						temp.setLeaveTime(second + temp.getAxles()*AUTO_DELAY);
						automaticLine[i].replaceVehicleStart(temp);
					}

					doneCount++;
				}
			second++;
		}
	}


	// Method to read, create and return a Vehicle, or return null
	public Vehicle readNewCar(Scanner in){
		try{
			int arrive = in.nextInt();
			int axle = in.nextInt();
			String toll = in.next();
			Vehicle v = new Vehicle(axle, toll, arrive);
			return v;
		}catch(Exception ex){
			return null;
		}
	}

	// Method to find and return the shortest TollBoothLine of the given tollType
	public TollBoothLine findShortLine(String toll){
		if(toll.equals("M") || toll.equals("m")){
			int lowest = manualLine[0].getLength();
			int line = 0;
			for(int i = 0; i < manualLine.length; i++){
				if(manualLine[i].getLength() < lowest){
					lowest = manualLine[i].getLength();
					line = i;
				}
				else{
				}
			}
			return manualLine[line];
		}
		else if(toll.equals("A") || toll.equals("a")){
			int lowest = automaticLine[0].getLength();
			int line = 0;
			for(int i = 0; i < automaticLine.length; i++){
				if(automaticLine[i].getLength() < lowest){
					lowest = automaticLine[i].getLength();
					line = i;
				}
				else{
				}
			}
			return automaticLine[line];
		}
		else{
			return automaticLine[0];
		}
	}
	
	// Method to calculate and output the Toll Line Statistics
	public String tollLineStats(){
		String out = "";
		for(int i = 0; i < manualLine.length; i++){
			out = out + "Manual Line #" + (i + 1) + " Maximum Length=" + manualLine[i].getMax() + "\n";
		}
		for(int i = 0; i < automaticLine.length; i++){
			out = out + "Automatic Line #" + (i + 1) + " Maximum Length=" + automaticLine[i].getMax() + "\n";
		}
		return out;
	}

	// Method to calculate and output the DONE Vehicle Statistics
	public String doneStats(){
		int doneManual = 0;
		int doneAutomatic = 0;
		int totalManual = 0;
		int totalAutomatic = 0;
		int maxManual = 0;
		int maxAutomatic = 0;
		int timeManual;
		int timeAuto;
		for(int i = 0; i < doneCount; i++){
			if(doneArray[i].getTollType().equals("M")){
				timeManual = doneArray[i].getTollArrive() - doneArray[i].getArriveLineTime();
				totalManual += timeManual;
				doneManual += 1;
				if(timeManual > maxManual){
					maxManual = timeManual;
				}
			}
			else if(doneArray[i].getTollType().equals("A")){
				timeAuto = doneArray[i].getTollArrive() - doneArray[i].getArriveLineTime();
				totalAutomatic += timeAuto;
				doneAutomatic += 1;
				if(timeAuto > maxAutomatic){
					maxAutomatic = timeAuto;
				}
			}
			else{
			}
		}
		double avgManual = totalManual / (double)doneManual;
		double avgAutomatic = totalAutomatic / (double)doneAutomatic;
		String out = "";
		out = out + "Max Manual Wait = " + maxManual + "\n";
		out = out + "Max Automatic Wait = " + maxAutomatic + "\n";
		out = out + "Avg Manual Wait = " + avgManual + "\n";
		out = out + "Avg Auto Wait = " + avgAutomatic + "\n";
		return out;
	}

}