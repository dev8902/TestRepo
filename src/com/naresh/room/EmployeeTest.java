/**
 * 
 */
package com.naresh.room;

/**
 * @author Naresh
 * 
 */
public class EmployeeTest {

	/**
	 * @param args
	 */
	static {
		System.out.println("Hello static method....");
		String[] hello = { "one", "two", "three" };
		main(hello);
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmployeeId(100);
		e.setEmployeeName("naresh");
		System.out.println("employee id:" + e.getEmployeeId()
				+ "  employeeName:" + e.getEmployeeName());

	}

}
