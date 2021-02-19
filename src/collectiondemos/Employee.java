package collectiondemos;

public class Employee {
	private String empName;
	private String empCity;
	private String empDept;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public Employee(String empName, String empCity, String empDept) {
		super();
		this.empName = empName;
		this.empCity = empCity;
		this.empDept = empDept;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empCity=" + empCity + ", empDept=" + empDept + "]";
	}
	
	
	
	
}
