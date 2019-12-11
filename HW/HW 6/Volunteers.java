public class Volunteers{
	private int[] volunteers;
	public Volunteers(){//default constructor
		volunteers = new int[31];//31 days in month
	}
	public Volunteers(int daysInMonth){//non default
		volunteers = new int[daysInMonth];
	}
	public boolean addVolunteers(int dayNumber, int count){//adds volunteers
		try{
			volunteers[dayNumber] += count;//adds volunteers to the day
			return true;
		}catch(Exception ex){//if invalid daynumber or count, returns false
			return false;
		}
	}
	public int minDay(){
		int min = volunteers[0];
		for (int i = 0 ; i < volunteers.length ; i++){//find the day with the minimum volunteers
			if (volunteers[i] < min){
				min = volunteers[i];
			}
			else{
			}
		}
		return min;
	}
	public int[] daysBelowGoal(){//finds the days with below 10 volunteers
		int count = 0;
		for (int i = 0; i < volunteers.length; i++){//counts how many days there are with less than 10
			if (volunteers[i] < 10){
				count += 1;
			}
			else{
			}
		}
		int[] daysBelow = new int[count];//instantiates an array for the days
		int temp = 0;
		for (int i = 0; i < volunteers.length; i++){//inputs the days into the array
			if (volunteers[i] < 10){
				daysBelow[temp] = i;
				temp += 1;
			}
			else{
			}
		}
		return daysBelow;
	}
}