public class Point{
	private double x;
	private double y;
	public Point(){//default constructor
		x = 0;
		y = 0;
	}
	public Point(double newX, double newY){//non default
		x = newX;
		y = newY;
	}
	public double getX(){//get methods
		return x;
	}
	public double getY(){
		return y;
	}
	public void setX(double nX){//mutators
		x = nX;
	}
	public void setY(double nY){
		y = nY;
	}
	public void move(double deltaX, double deltaY){//moves the point
		x = x + deltaX;
		y = y + deltaY;
	}
	public double distanceFrom(double pointX, double pointY){//calculates distance from a point
		double changeX = x - pointX;
		double changeY = y - pointY;
		double distance = Math.sqrt(Math.pow(changeX, 2) + Math.pow(changeY, 2));
		return distance;
	}
	public int whichQuadrant(){//returns which quadrant it is in
		int quadrant;
		if (x > 0 && y > 0){//quadrant 1
			quadrant = 1;
		}
		else if(x < 0 && y > 0){//quadrant 2
			quadrant = 2;
		}
		else if(x < 0 && y < 0){//quadrant 3
			quadrant = 3;
		}
		else if(x > 0 && y < 0){//quadrant 4
			quadrant = 4;
		}
		else{//in axis or origin so quadrant 0
			quadrant = 0;
		}
		return quadrant;
	}
	public String toString(){//string method
		return ("Coordinate = (" + x + "," + y + ")");
	}
	public boolean equals(Point a){//equals method
		if (x == a.getX() && y == a.getY()){
			return true;
		}
		else{
			return false;
		}
	}
}