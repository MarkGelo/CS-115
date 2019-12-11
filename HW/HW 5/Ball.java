public class Ball{
	private double percent;
	private final double DEFAULT_BOUNCE = 0.5;
	public Ball(){//default
		percent = DEFAULT_BOUNCE;
	}
	public Ball(double bouncePercent){//non default
		if (bouncePercent >= 1){//ball cant have 100%+ bounce
			percent = DEFAULT_BOUNCE;
		}
		else if(bouncePercent < 0){//if negative bounce
			percent = DEFAULT_BOUNCE;
		}
		else{
			percent = bouncePercent;
		}
	}
	public double getBouncePercent(){//accessor
		return percent;
	}
	public void setBouncePrecent(double newBounce){//mutator
		if (newBounce < 1 && newBounce >= 0){
			percent = newBounce;
		}
		else{
			percent = DEFAULT_BOUNCE;
		}
	}
	public void bounceTable(double initialHeight, int bounceCount){
		double effect = percent;
		double height;
		double numBounce;
		if (initialHeight < 0){//if negative initial height, makes it positive
			height = Math.abs(initialHeight);
		}
		else{
			height = initialHeight;
		}
		if (bounceCount < 0){//if negative bounce, makes it positive
			numBounce = Math.abs(bounceCount);
		}
		else{
			numBounce = bounceCount;
		}
		System.out.println("Bounce #" + "\t" + "Height");
		for (int i = 0; i <= numBounce ; i++){//prints table
			System.out.print(i + " \t" + height);
			height = height * effect;
			System.out.println();
		}
	}
	public String toString(){
		return ("Bounce Percentage: " + percent);
	}
	
	
}