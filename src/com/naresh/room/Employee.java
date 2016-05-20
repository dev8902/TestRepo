/**
 * 
 */
package com.naresh.room;

/**
 * @author Naresh
 * 
 */
public class Employee implements Comparable<Employee> {
	public Employee(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		// TODO Auto-generated constructor stub
	}

	private int employeeId;
	private String employeeName;

	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId
	 *            the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName
	 *            the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.employeeId > o.employeeId) {
			return 1;
		} else if (this.employeeId == o.employeeId) {
			return 0;
		} else {
			return -1;
		}
	}

}
