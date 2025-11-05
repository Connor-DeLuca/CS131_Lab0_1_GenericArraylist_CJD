package main;

public class PointThreeD {
	private double xPoint;
	private double yPoint;
	private double zPoint;
	
	public PointThreeD() {
		xPoint = 0.0;
		yPoint = 0.0;
		zPoint = 0.0;
	}
	
	public PointThreeD(double x, double y, double z) {
		xPoint = x;
		yPoint = y;
		zPoint = z;
	}

	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}

	public double getxPoint() {
		return xPoint;
	}

	public void setxPoint(double xPoint) {
		this.xPoint = xPoint;
	}

	public double getyPoint() {
		return yPoint;
	}

	public void setyPoint(double yPoint) {
		this.yPoint = yPoint;
	}

	public double getzPoint() {
		return zPoint;
	}

	public void setzPoint(double zPoint) {
		this.zPoint = zPoint;
	}
	
	

}
