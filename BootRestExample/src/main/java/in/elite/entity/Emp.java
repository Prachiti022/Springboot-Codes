package in.elite.entity;

public class Emp{
	private int id;
	private String empName;
	private String deptName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Emp(int id, String empName, String deptName) {
		super();
		this.id = id;
		this.empName = empName;
		this.deptName = deptName;
	}
	
}