public class WaitLine{
	private Person[] line;
	private int limitLine;//instance variables
	private int currentLine;
	private int maxLine;
	public WaitLine(int size){//non default constructor
		limitLine = size;
		line = new Person[size];
		currentLine = 0;
		maxLine = currentLine;
	}
	public int getLength(){//accessor
		return currentLine;
	}
	public boolean addPersonEnd(Person p){//add person to end of line
		try{
			line[currentLine] = p;
			currentLine += 1;
			if (currentLine > maxLine){
				maxLine += 1;
			}
			return true;
		}catch(Exception ex){//if not enough space, return false
			return false;
		}
	}
	public Person removePersonStart(){//removes person at start
		try{
			Person[] out = new Person[1];
			out[0] = line[0];
			for(int i = 0; i < currentLine-1; i++){
				line[i] = line[i+1];
			}
			currentLine -= 1;
			return out[0];
		}catch(Exception ex){//if no person at line, returns null
			return null;
		}
	}
	public String toString(){//string method
		String out = "";
		for(int i = 0; i < currentLine ; i++){
			out = out + line[i] + "\n";
		}
		out = out + "Max Length line actually gets: " + maxLine;
		return out;
	}
}