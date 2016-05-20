/**
 * 
 */
package com.naresh.room;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Naresh
 * 
 */
public class EmployeeTest {

	/**
	 * @param args
	 */

	public static String getMessage() {
		return "Hello";
	}

	public static void main(String[] args) {
		Employee e = new Employee(105, "naresh");
		Employee e1 = new Employee(104, "ramesh");
		Employee e2 = new Employee(103, "rajesh");
		Employee e3 = new Employee(101, "raghu");
		List<Employee> list = new ArrayList<Employee>();
		list.add(e);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		Collections.sort(list);
		for (Employee emp : list) {
			System.out.println("Hello: Mr." + emp.getEmployeeName());
			System.out.println("Id:" + emp.getEmployeeId() + "  Name:"
					+ emp.getEmployeeName());
			System.out.println("==========================");
		}

	}

}
