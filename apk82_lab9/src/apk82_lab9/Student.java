package apk82_lab9;

public class Student extends Person {
	private String program;
	private int year;
	private double fee;
	
	public Student(String name, String address, String program, int year, double fee) {
		setName(name);
		setAddress(address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "The name of this student is " + this.getName() +" Their address is " + this.getAddress() + " Their program is " + this.getProgram() + " Their year is " + this.getYear()+ " Their fee is " + this.getFee();
	}
}
