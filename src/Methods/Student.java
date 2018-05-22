package Methods;

public class Student {
	
	
	//Constructor - used to assign values to a class property
	Student(String name, int sId, int age, double gpa, double fee)
	{
		this.name = name;
		this.sId = sId;
		this.age = age;
		this.gpa = gpa;
		this.fee = fee;
		
	}
	
	Student(String name)
	{
		this.name = name;
	}
	
	//Fields, properties, attributes, member variables
	private String name; 
	private int age;
	private int sId;
	private double gpa;
	private double fee;
	
	//getter and setter methods (right click/Source/Generate Getters and Setters, Select All)
	public double getFee() {
		return fee;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public double getGpa() {
		return gpa;
	}
	
	public double generateStudentBill() {
		return fee + (fee*.1);
	}
	
	//Display object information (Right click/Source/Generate toString())
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sId=" + sId + ", gpa=" + gpa + "]";
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	}

