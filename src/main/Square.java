package main;

public class Square {
	private double side;
	
	public Square() {
		side = 0.0;
	}
	
	public Square(double s) {
		side = s;
	}
	
	public double getArea() {
		return side*side;
	}
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + ", area=" + (side*side) + "]";
	}

}
