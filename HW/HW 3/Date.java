/* A simple Date class
   Anderson, Franceschi
*/


public class Date
{
  private int month;
  private int day;
  private int year;

  /** default constructor
  *  sets month to 1, day to 1 and year to 2000
  */
  public Date( )
  {
    setDate( 1, 1, 2000 );
  }

  /** overloaded constructor
  *  @param mm    initial value for month
  *  @param dd    initial value for day
  *  @param yyyy  initial value for year
  *
  *  passes parameters to setDate method
  */
  public Date( int mm, int dd, int yyyy )
  {
    setDate( mm, dd, yyyy );
  }

  /* accessor methods */
  int getMonth( ) { return month; }
  int getDay( )   { return day; }
  int getYear( )  { return year; }

  /** mutator method */
  /** setMonth
  *  @param mm new value for month
  *  if mm is between 1 and 12, sets month to mm
  *  otherwise, sets month to 1
  */
  public void setMonth( int mm )
  {
    month = ( mm >= 1 && mm <= 12 ? mm : 1 );
  }

  /** setDay
  *  @param dd new value for day
  *  if dd is legal day for current month, sets day to dd
  *  otherwise, sets day to 1
  */
  public void setDay( int dd )
  {
    int [] validDays = { 0,  31, 29, 31, 30,
                         31, 30, 31, 31, 30,
                         31, 30, 31 };
    day = ( dd >= 1 && dd <= validDays[month] ? dd : 1 );
  }

  /** setYear
  *  @param yyyy new value for year
  *  sets year to yyyy
  */
  public void setYear( int yyyy )
  {
    year = yyyy;
  }

  /** setDate
  *  @param mm    new value for month
  *  @param dd    new value for day
  *  @param yyyy  new value for year
  *  passes parameters to setMonth, setDay, and setYear
  */
  public void setDate( int mm, int dd, int yyyy )
  {
    setYear(yyyy);
    setMonth( mm );
    setDay( dd );
  }

  /** toString
  *  @return String
  *  returns date in mm/dd/yyyy format
  */
  public String toString( )
  {
    return month + "/" + day + "/" + year;
  }

  /** equals
  *  @param   d  Date object to compare to this
  *  @return  true if d is equal to this
  *           false, otherwise
  */
  public boolean equals( Date d )
  {
    if ( month == d.month
         && day == d.day
         && year == d.year )
      return true;
    else
      return false;
  }
  
  public boolean leapYear(){//checks if leap year or not
	  int test = year % 4;//leap year
	  int test2 = year % 100;//not leap
	  int test3 = year % 400;//leap year
	  boolean leap;
	  if (test3 == 0){//if divisible by 400, leap year
		  leap = true;
	  }
	  else if(test2 == 0){//else if divisible by 100, not leap year
		  leap = false;
	  }
	  else if(test == 0){//else if divisible by 4, leap year
		  leap = true;
	  }
	  else{//if not any of that, not leap year
		  leap = false;
	  }
	  return leap;
  }
  public String animalYear(){//checks what zodiac you are based on year
	  int test = (year - 1900) % 12;//on pdf, says starts at 1900, then used modulo by 12
	  //modulo to get the # years after the year of rat
	  String animal;
	  if(test == 11){//11 years after rat is boar
		  animal = "Boar";
	  }
	  else if(test == 10){//10 years after rat, dog
		  animal = "Dog";
	  }
	  else if(test == 9){//9 years after rat, rooster
		  animal = "Rooster";
	  }
	  else if(test == 8){//8 years after rat, monkey
		  animal = "Monkey";
	  }
	  else if(test == 7){//7 years after rat, ram
		  animal = "Ram";
	  }
	  else if(test == 6){//6 years after rat, horse
		  animal = "Horse";
	  }
	  else if(test == 5){//5 years after rat, snake
		  animal = "Snake";
	  }
	  else if(test == 4){//4 years after rat, dragon
		  animal = "Dragon";
	  }
	  else if(test == 3){//3 years after rat, rabbit
		  animal = "Rabbit";
	  }
	  else if(test == 2){//2 years after rat, tiger
		  animal = "Tiger";
	  }
	  else if(test == 1){//1 year after rat, ox
		  animal = "Ox";
	  }
	  else{//basically just if test == 0, 0 years after rat, rat
		  animal = "Rat";
	  }
	  return ("Year of the " + animal);
  }

}

