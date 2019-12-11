public class Vehicle{
	private static int sid = 0;
	private int id;//instance variables
	private int axles;
	private String toll;
	private int timeArrive;
	private int tollArrive;
	private int leaveToll;
	
	public Vehicle(int newAxle, String newToll, int arrive){//non default constructor
		id = sid;
		sid += 1;
		axles = newAxle;
		toll = newToll;
		timeArrive = arrive;
		tollArrive = timeArrive;
		leaveToll = tollArrive;
	}
	public int getId(){//accessors
		return id;
	}
	public int getAxles(){
		return axles;
	}
	public String getTollType(){
		return toll;
	}
	public int getArriveLineTime(){
		return timeArrive;
	}
	public int getTollArrive(){
		return tollArrive;
	}
	public int getLeaveTime(){
		return leaveToll;
	}
	
	public void setId(int newId){//mutators
		if(id > 0){
			id = newId;
		}
		else{
			id = sid;
			sid += 1;
		}
	}
	public void setAxles(int newAxles){
		if(newAxles > 0){
			axles = newAxles;
		}
		else{
			axles = 2;
		}
	}
	public void setToll(String newToll){
		if(newToll.equals("A") || newToll.equals("M")){
			toll = newToll;
		}
		else{
			toll = "M";
		}
	}
	public void setTimeArrive(int newTimeArrive){
		if(newTimeArrive > 0){
			timeArrive = newTimeArrive;
		}
		else{
			timeArrive = 2;
		}
	}
	public void setArriveBoothTime(int newTollArrive){
		if(newTollArrive > 0 && newTollArrive > timeArrive){
			tollArrive = newTollArrive;
		}
		else{
			newTollArrive = timeArrive;
		}
	}
	public void setLeaveTime(int newLeaveToll){
		if(newLeaveToll > 0 && newLeaveToll > tollArrive){
			leaveToll = newLeaveToll;
		}
		else{
			leaveToll = tollArrive;
		}
	}
	public String toString(){
		return ("Id: " + id + " Axles: " + axles + " Toll: " + toll + " Arrive: " + timeArrive + " Get to Toll: " + tollArrive + " Leave Toll: " + leaveToll);
	}
}