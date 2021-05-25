package model.mainapp;

import java.time.LocalDateTime;
import java.util.concurrent.CopyOnWriteArrayList;

import model.shared.*;

public class Search {
	//search checks
	public CopyOnWriteArrayList<CheckInOut> searchCheckInOut(Employee employee, LocalDateTime beforeCheck, LocalDateTime afterCheck);
	public CopyOnWriteArrayList<CheckInOut> searchCheckInOut(Department department, LocalDateTime beforeCheck, LocalDateTime afterCheck);
	public CopyOnWriteArrayList<CheckInOut> searchCheckInOut(LocalDateTime beforeCheck, LocalDateTime afterCheck); //overall

	
	//search employees
	
	//implements the functions above
	//per date of check
	public CopyOnWriteArrayList<Employee> searchEmployee(Department department, LocalDateTime beforeCheck, LocalDateTime afterCheck);
	public CopyOnWriteArrayList<Employee> searchEmployee(LocalDateTime beforeCheck, LocalDateTime afterCheck); //overall
	//necessarily only one employee per ID
	//per ID
	public Employee searchEmployee(Department department, Integer ID);
	public Employee searchEmployee(Integer ID); //overall
	//per name
	public CopyOnWriteArrayList<Employee> searchEmployee(Department department, String firstName, String LastName);
	public CopyOnWriteArrayList<Employee> searchEmployee(Department department, String name);
	public CopyOnWriteArrayList<Employee> searchEmployee(String firstName, String LastName);
	public CopyOnWriteArrayList<Employee> searchEmployee(String name); //overall
}