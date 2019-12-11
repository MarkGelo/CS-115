public class Zoning{
	private double length;
	private double width;
	private final double MAX_AREA_ZONE_1 = 2000;//max areas for each zone
	private final double MAX_AREA_ZONE_2 = 2500;
	private final double MAX_AREA_ZONE_3 = 3500;
	private final double MAX_AREA_ZONE_4 = 5000;
	private final double BASE_HEIGHT_ZONE_1 = 25;//constants for height and area limits
	private final double BASE_HEIGHT_ZONE_2 = 25;
	private final double BASE_HEIGHT_ZONE_3 = 35;
	private final double BASE_HEIGHT_ZONE_4 = 45;
	private final double BASE_HEIGHT_ZONE_5 = 52.5;
	
	public Zoning(){//default constructor
		length = 0;
		width = 0;
	}
	public Zoning(double newLength, double newWidth){//non default
		if (newLength < 0){//checks if negative
			length = 0;
		}
		else{
			length = newLength;
		}
		if (newWidth < 0){//checks if negative
			width = 0;
		}
		else{
			width = newWidth;
		}
	}
	public double getLength(){//accessor
		return length;
	}
	public double getWidth(){
		return width;
	}
	public void setLength(double nLength){//mutator
		if (nLength < 0){//checks if negative
			length = 0;
		}
		else{
			length = nLength;
		}
	}
	public void setWidth(double nWidth){
		if (nWidth < 0){//checks if negative
			width = 0;
		}
		else{
			width = nWidth;
		}
	}
	public double heightLimit(){
		double area = length * width;
		double heightLim;
		if (area <= MAX_AREA_ZONE_1){//zone 1
			heightLim = BASE_HEIGHT_ZONE_1;
		}
		else if(area <= MAX_AREA_ZONE_2){//zone 2
			heightLim = BASE_HEIGHT_ZONE_2 + (0.02 * (area - MAX_AREA_ZONE_1));
		}
		else if(area <= MAX_AREA_ZONE_3){//zone 3
			heightLim = BASE_HEIGHT_ZONE_3 + (0.01 * (area - MAX_AREA_ZONE_2));
		}
		else if(area <= MAX_AREA_ZONE_4){//zone 4
			heightLim = BASE_HEIGHT_ZONE_4 + (0.005 * (area - MAX_AREA_ZONE_3));
		}
		else{//zone 5 if doesnt fit with zone 1 to 4
			heightLim = BASE_HEIGHT_ZONE_5 + (0.0025 * (area - MAX_AREA_ZONE_4));
		}
		return heightLim;
	}
	public int unitCountLimit(){
		double area = length * width;
		int unitCount;
		if (area <= MAX_AREA_ZONE_1){//zone 1
			unitCount = 1;
		}
		else if(area <= MAX_AREA_ZONE_2){//zone 2
			unitCount = 2;
		}
		else if(area <= MAX_AREA_ZONE_3){//zone 3
			unitCount = 2;
		}
		else if(area <= MAX_AREA_ZONE_4){//zone 4
			unitCount = 3;
		}
		else{//zone 5 if doesnt fit with zone 1 to 4
			unitCount = 4;
		}
		return unitCount;
	}
	public String toString(){
		double area = length * width;
		return ("Length = " + length + " Width = " + width + " Area = " + area + " Height Limit = " + this.heightLimit() + " Unit Count Limit = " + this.unitCountLimit());
	}
}