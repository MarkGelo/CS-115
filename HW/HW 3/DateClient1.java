import java.util.Scanner;
public class DateClient1
{
  public static void main( String [] args )
  {
     // add code to construct Data objects
	 // and test and output if they are a
	 // leap year or not
	 Scanner in = new Scanner(System.in);
	 // not leap year (not divisible by 4)
	Date notLeap = new Date(04,22,2001);
	System.out.println(notLeap.getYear() + " leap year? " + notLeap.leapYear());
	
	 // leap year (divisible by 4, but not by 100)
	Date leap = new Date(04,22,2004);
	System.out.println(leap.getYear() + " leap year? " + leap.leapYear());
	
	 // not leap year (divisible by 4 and by 100)
	Date notLeap2 = new Date(04,22,1900);
	System.out.println(notLeap2.getYear() + " leap year? " + notLeap2.leapYear());

	 // leap year (divisible by 4 and by 100 and by 400)
	Date leap2 = new Date(04,23,2400);
	System.out.println(leap2.getYear() + " leap year? " + leap2.leapYear());

	 // your birth year
	System.out.println("Input your birth year");
	int birth = in.nextInt();
	Date birthYear = new Date(04,22,birth);
	System.out.println(birthYear.getYear() + " leap year? " + birthYear.leapYear());
	
	//tests chinese zodiac
	Date currentYear = new Date(10,17,2018);
	System.out.println(currentYear.getYear() + " " + currentYear.animalYear());//this year, dog
	System.out.println(birthYear.getYear() + " " + birthYear.animalYear());//birth year, dragon
	Date rat = new Date(01,11,2008);
	Date ox = new Date(01,11,1997);
	Date tiger = new Date(01,11,1962);
	Date rabbit = new Date(01,11,1987);
	Date snake = new Date(01,11,2013);
	Date horse = new Date(01,11,2014);
	Date goat = new Date(01,11,1991);
	Date monkey = new Date(01,11,1968);
	Date rooster = new Date(01,11,1981);
	Date pig = new Date(01,11,1995);
	System.out.println(rat.getYear() + " " + rat.animalYear());//for all the other zodiacs
	System.out.println(ox.getYear() + " " + ox.animalYear());
	System.out.println(tiger.getYear() + " " + tiger.animalYear());
	System.out.println(rabbit.getYear() + " " + rabbit.animalYear());
	System.out.println(snake.getYear() + " " + snake.animalYear());
	System.out.println(horse.getYear() + " " + horse.animalYear());
	System.out.println(goat.getYear() + " " + goat.animalYear());
	System.out.println(monkey.getYear() + " " + monkey.animalYear());
	System.out.println(rooster.getYear() + " " + rooster.animalYear());
	System.out.println(pig.getYear() + " " + pig.animalYear());
	
  }
}





