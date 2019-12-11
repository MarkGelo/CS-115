public class Person{
	private static int sid = 0;//static instance variable
	private int id;//instance variables
	private int arrivalTime;
	private int floor;
	private int elevatorLeave;
	private int leaveElevator;
	
	public Person(int timeArrive, int nfloor){//non default constructors
		id = sid;
		sid += 1;//makes sure each id is unique
		if(timeArrive > 0){
			arrivalTime = timeArrive;//checks for valid values
		}
		else{
			arrivalTime = 1;
		}
		if(nfloor > 0){
			floor = nfloor;
		}
		else{
			floor = 1;
		}
		elevatorLeave = arrivalTime + 1;
		leaveElevator = elevatorLeave + 2;
	}
	//accessors
	public int getId(){
		return id;
	}
	public int getArrivalTime(){
		return arrivalTime;
	}
	public int getFloor(){
		return floor;
	}
	public int getElevatorLeave(){
		return elevatorLeave;
	}
	public int getLeaveElevator(){
		return leaveElevator;
	}
	//mutators
	public void setId(int newId){
		if(newId > 0){//checks for valid values
			id = newId;
		}
		else{
			id = newId;
			System.err.println("ERROR " + this.toString());
		}
	}
	public void setArrivalTime(int newTime){
		if(newTime > 0){
			arrivalTime = newTime;
		}
		else{
			arrivalTime = newTime;
			System.err.println("ERROR " + this.toString());
		}
	}
	public void setFloor(int newFloor){
		if(newFloor > 0){//checks for valid values
			floor = newFloor;
		}
		else{
			floor = newFloor;
			System.err.println("ERROR " + this.toString());
		}
	}
	public void setElevatorLeave(int newElevatorLeave){
		if(newElevatorLeave > 0 && newElevatorLeave >  arrivalTime){
			elevatorLeave = newElevatorLeave;
		}
		else{
			elevatorLeave = newElevatorLeave;
			System.err.println("ERROR " + this.toString());
		}
	}
	public void setLeaveElevator(int newLeaveElevator){//checks for logic
		if(newLeaveElevator > 0 && newLeaveElevator > elevatorLeave){
			leaveElevator = newLeaveElevator;
		}
		else{
			leaveElevator = newLeaveElevator;
			System.err.println("ERROR " + this.toString());
		}
	}
	public String toString(){
		return ("ID: " + id + " Time Arrived: " + arrivalTime + " Floor: " + floor + " Time Elevator Left: " + elevatorLeave + " Time they leave elevator: " + leaveElevator);
	}
}