public class StringStats{
	private String text;//instance variable
	public StringStats(){//default constructor
		text = "";
	}
	public void setLine(String newLine){//mutator
		text = newLine;
	}
	public int wordCount(){//word count
		if (text.isEmpty()){//if line is empty, 0 words
			return 0;
		}
		String[] count = text.split("\\s+");//splits the line by spaces
		return count.length;//returns the length/words
	}
	
}