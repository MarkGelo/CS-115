class TestResultsClient {
	public static void main(String[] args) {
		char [] answers = { 'e','e','b','b','?','b','c','d','a','e' };

		char [] answersA = { 'a','e','b','b','?','b','c','d','a','e' };
		StudentAnswerSheet a = new StudentAnswerSheet("Matt", answersA);
		System.out.println(a + " " + a.getScore(answers));

		char [] answersB = { '?','?','?','?','?','?','c','d','a','e' };
		StudentAnswerSheet b = new StudentAnswerSheet("John", answersB);
		System.out.println(b + " " + b.getScore(answers));

		char [] answersC = { 'a','a','a','a','a','a','c','d','a','e' };
		StudentAnswerSheet c = new StudentAnswerSheet("Mary", answersC);
		System.out.println(c + " " + c.getScore(answers));

		char [] answersD = { 'e','e','b','b','?','b','c','d','a','e' };
		StudentAnswerSheet d = new StudentAnswerSheet("Fred", answersD);
		System.out.println(d + " " + d.getScore(answers));
		System.out.println("\n");

		TestResults roster = new TestResults(5);
		roster.addStudentAnswerSheet(a);
		roster.addStudentAnswerSheet(b);
		roster.addStudentAnswerSheet(c);
		roster.addStudentAnswerSheet(d);

		System.out.println(roster);
		System.out.println(roster.highestScoringStudent(answers));
	}
}