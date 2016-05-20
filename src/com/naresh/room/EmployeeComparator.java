package com.naresh.room;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getEmployeeId()>o1.getEmployeeId()){
			return 1;
		}else if(o1.getEmployeeId()==o2.getEmployeeId()){
			return 0;
		}else{
		return -1;
		}
	}

}
