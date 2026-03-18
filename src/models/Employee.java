package models;

import model.enums.EmployeeStatus;

public class Employee extends Person {
	
	private EmployeeStatus employeestatus;
	private double ApprovalLimit;
	
	public Employee() {
		super();
		employeestatus = EmployeeStatus.Atlaists;
		ApprovalLimit = 0.0;
	}
	
	public Employee(String name, String surname, String personcode, EmployeeStatus status, double approvalLimit) {
		
		super(name, surname, personcode);
		employeestatus = status;
		ApprovalLimit = approvalLimit;
		
	}

	public EmployeeStatus getEmployeestatus() {
		return employeestatus;
	}

	public void setEmployeestatus(EmployeeStatus employeestatus) {
		this.employeestatus = employeestatus;
	}

	public double getApprovalLimit() {
		return ApprovalLimit;
	}

	public void setApprovalLimit(double approvalLimit) {
		ApprovalLimit = approvalLimit;
	}

	@Override
	public String toString() {
		return "Employee [employeestatus=" + employeestatus + ", ApprovalLimit=" + ApprovalLimit + "]";
	}
	

}
