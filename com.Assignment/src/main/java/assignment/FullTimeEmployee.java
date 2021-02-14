package assignment;
public class FullTimeEmployee extends Employee {
	public double calcSalary(Employee e) {
		double Sal=0;
		Sal=Sal+e.getBasic()+e.getAllowance()-e.getDeductions();
		return Sal;
		
	}
}