public class TestResults{
	private StudentAnswerSheet[] students;
	private int count = 0;
	
	public TestResults(int number){//constructor
		if (number <= 0){//cannt be 0 or negative so makes it 1
			number = 1;
		}
		students = new StudentAnswerSheet[number];
	}
	
	public boolean addStudentAnswerSheet(StudentAnswerSheet x){//adds answer sheet
		try{
		students[count] = x;//adds answer sheet
		count += 1;
		return true;
		}catch(Exception ex){//if no room, false
			return false;
		}
	}
	
	public String highestScoringStudent(char[] answerKey){
		if (count > 0){
		double highest = 0;
		String nameHighest = "";
		for (int i = 0; i < count; i++){
			if(students[i].getScore(answerKey) > highest){//finds out highest score
				highest = students[i].getScore(answerKey);
				nameHighest = students[i].getName();
			}
			else{
			}
		}
		return nameHighest;
		}
		else{//if theres no student in roster, returns an empty string
			return "";
		}
	}
	
	public String toString(){
		String out = "";
		for (int i = 0; i < count; i++){
			out = (out + students[i] + "\n");//prints out the string
		}
		return out;
	}
	
}