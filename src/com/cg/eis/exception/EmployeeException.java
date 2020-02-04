package com.cg.eis.exception;

@SuppressWarnings("serial")
public class EmployeeException extends Exception{
	public EmployeeException(String message) {
		super(message);
	}
	public void checked(int salary) throws EmployeeException {
		if(salary<3000)
			throw new EmployeeException("Salary is below 3000");
	}
}
