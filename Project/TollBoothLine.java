public class TollBoothLine{
	private Vehicle[] tollBooth;//instance variables
	private int limit;
	private int current;
	private int max;
	
	public TollBoothLine(int size){//non default constructor
		tollBooth = new Vehicle[size];
		limit = size;
		current = 0;
		max = current;
	}
	
	public int getLength(){//accessors
		return current;
	}
	public int getMax(){
		return max;
	}
	
	public boolean addVehicleEnd(Vehicle v){//add vehicle to end of line
		try{
			tollBooth[current] = v;
			current += 1;
			if(current > max){
				max += 1;
			}
			return true;
		}catch(Exception ex){
			max += 1;
			return false;
		}
		
	}
	public Vehicle removeVehicleStart(){//remove vehicle at start
		try{
			Vehicle[] out = new Vehicle[1];
			out[0] = tollBooth[0];
			for(int i = 0; i < current-1; i++){//move up all vehicles by one
				tollBooth[i] = tollBooth[i+1];
			}
			current -= 1;
			return out[0];
		}catch(Exception ex){
			return null;
		}
	}
	public Vehicle copyVehicleStart(){//copy vehicle at start
		try{
			return tollBooth[0];
		}catch(Exception ex){
			return null;
		}
	}
	public boolean replaceVehicleStart(Vehicle v){//replace vehicle at start with another
		try{
			tollBooth[0] = v;
			return true;
		}catch(Exception ex){
			return false;
		}
	}
	public String toString(){
		String out = "";
		for(int i = 0; i < tollBooth.length; i++){
			out = out + tollBooth[i] + "\n";
		}
		return out;
	}
}