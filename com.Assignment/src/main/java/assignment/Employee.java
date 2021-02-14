package assignment;
public class Employee {
	private int EmpId;
	private double Sal = 0;
	private double Basic;
	private double Allowance;
	private double Deductions;
	private String FirstName;
	private String LastName;
	private String Address;
	private String Pincode;
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public double getSal() {
		return Sal;
	}
	public void setSal(double sal) {
		Sal = sal;
	}
	public double getBasic() {
		return Basic;
	}
	public void setBasic(double basic) {
		Basic = basic;
	}
	public double getAllowance() {
		return Allowance;
	}
	public void setAllowance(double allowance) {
		Allowance = allowance;
	}
	public double getDeductions() {
		return Deductions;
	}
	public void setDeductions(double deductions) {
		Deductions = deductions;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPincode() {
		return Pincode;
	}
	public void setPincode(String pincode) {
		Pincode = pincode;
	}
	
	public double calcSalary(Employee e) {
		double Sal=0;
		Sal=Sal+e.getBasic()+e.getAllowance()-e.getDeductions();
		return Sal;
		
	}
}
