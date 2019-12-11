public class StudentAnswerSheet{
	private char[] studentAnswer = new char[10];//instance variable
	private String studentName;
	private double score = 0;
	
	public StudentAnswerSheet(String name, char[] ans){
		studentName = name;
		for (int i = 0; i < ans.length ; i++){//copies the array
			studentAnswer[i] = ans[i];
		}
	}
	public String getName(){//accessor
		return studentName;
	}
	public double getScore(char[] ans){//gets the score
		if (studentAnswer.length != ans.length){//if number of questions doesnt match, neg infinity
			double negInf = Double.NEGATIVE_INFINITY;
			score = negInf;
		}
		else{
			for (int i = 0; i < ans.length; i++){//checks for answers if right or not
				if(ans[i] == '?' && studentAnswer[i] == '?'){
				}
				else if (ans[i] == studentAnswer[i]){
					score += 1;
				}
				else if(studentAnswer[i] == '?'){
				}
				else{
					score -= .25;
				}
			}
		}
		return score;
	}
	public StudentAnswerSheet clone(){//clones
		StudentAnswerSheet clone = new StudentAnswerSheet(studentName, studentAnswer);
		return clone;
	}
	public String toString(){//returns the string and the answers
		String out = (studentName + " ");
		for (int i = 0; i < studentAnswer.length; i++){
			out += (studentAnswer[i] + " ");
		}
		return out;
		
	}
}