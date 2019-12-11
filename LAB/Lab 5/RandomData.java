public class RandomData{
	public static int getInt(char type, int a, int b){
		int val;
		switch (type){//switch statement
			case 'u': case 'U'://checks if u or U for uniform
				val = (int)Math.floor(a + Math.random() * (b + 1 - a));
				break;
			case 'e': case 'E'://checks for e or E for exponential
				val = (int)Math.floor((-1) * a * Math.log(Math.random()));
				break;
			case 'n': case 'N'://checks for N or n for normal
				val = (int)Math.floor(a + b * Math.cos(2 * Math.PI * Math.random()) * Math.sqrt((-2)*Math.log(Math.random())));
				break;
			default: //if doesnt fit with anything else, assumes uniform
				val = (int)Math.floor(a + Math.random() * (b + 1 - a));
				break;
		}
		return val;
	}
}