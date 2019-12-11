public class WaitLineClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaitLine l = new WaitLine(4);
		Person p = new Person(1, 5);
		if (l.addPersonEnd(p)) System.out.println("Person Added at End");
		else  System.out.println("Person Not Added, Line Full");
		System.out.println(l.toString());
		p.setFloor(10);    // make sure this does not change the Person in the line 
		System.out.println(l.toString());
		
		Person q = new Person(4, 3);
		if (l.addPersonEnd(q)) System.out.println("Person Added at End");
		else  System.out.println("Person Not Added, Line Full");	
		System.out.println(l.toString());
		q=null;    // make sure this does not null the Vehicle in the line
		System.out.println(l.toString());
		
		Person r = new Person(7, 15);
		if (l.addPersonEnd(r)) System.out.println("Person Added at End");
		else  System.out.println("Person Not Added, Line Full");
		System.out.println(l.toString());
		
		Person s = new Person(12, 5);
		if (l.addPersonEnd(s)) System.out.println("Person Added at End");
		else  System.out.println("Person Not Added, Line Full");
		System.out.println(l.toString());
		
		Person t = new Person(15, 8);
		if (l.addPersonEnd(t)) System.out.println("Person Added at End");
		else  System.out.println("Person Not Added, Line Full");
		System.out.println(l.toString());
	
		Person u = new Person(15, 8);
		if (l.addPersonEnd(u)) System.out.println("Person Added at End");
		else  System.out.println("Person Not Added, Line Full");
		System.out.println(l.toString());
		
		System.out.println("\nLine Length=" + l.getLength());
		
		System.out.println("\nPerson Removed at Start: " + l.removePersonStart());
		System.out.println(l.toString());
		System.out.println("Line Length=" + l.getLength());
		
		if (l.addPersonEnd(u)) System.out.println("Person Added at End");
		else  System.out.println("Person Not Added, Line Full");
		System.out.println(l.toString());
	}
}