package classesAndObjects;

public class Box {

//Constructor Box
	public Box(double costPerSqIn, double heightInIn, double lengthInIn, double depthInIn) {
		super();
		this.costPerSqIn = costPerSqIn;
		this.heightInIn = heightInIn;
		this.lengthInIn = lengthInIn;
		this.depthInIn = depthInIn;
	}
	
	public Box() {
		
	}
	
/*Write a "Box" class which has following properties:
cost of material per square inch, 
height in inches, 
length in inches, 
depth in inches. */

	private double costPerSqIn; 
	private double heightInIn;
	private double lengthInIn;
	private double depthInIn;
	
	
//Getters and Setters
	public double getCostPerSqIn() {
		return costPerSqIn;
	}
	public void setCostPerSqIn(double costPerSqIn) {
		this.costPerSqIn = costPerSqIn;
	}
	public double getHeightInIn() {
		return heightInIn;
	}
	public void setHeightInIn(double heightInIn) {
		this.heightInIn = heightInIn;
	}
	public double getLengthInIn() {
		return lengthInIn;
	}
	public void setLengthInIn(double lengthInIn) {
		this.lengthInIn = lengthInIn;
	}
	public double getDepthInIn() {
		return depthInIn;
	}
	public void setDepthInIn(double depthInIn) {
		this.depthInIn = depthInIn;
	}
	
//Define methods
	
	public double findVolume() {
		return lengthInIn*heightInIn*depthInIn;
	}
	
	public double findSurfaceArea() { //2lw+2lh+2wh
		return (2*lengthInIn)*(2*depthInIn)+(2*lengthInIn)*(2*heightInIn)+(2*depthInIn)*(2*heightInIn);
	}
	
	public double findCost() {
		return ((2*lengthInIn)*(2*depthInIn)+(2*lengthInIn)*(2*heightInIn)+(2*depthInIn)*(2*heightInIn))*costPerSqIn;		
	}
	
	@Override
	public String toString() {
		return "Box [costPerSqIn=" + costPerSqIn + ", heightInIn=" + heightInIn + ", lengthInIn=" + lengthInIn
				+ ", depthInIn=" + depthInIn + "]";
	}
	
}
