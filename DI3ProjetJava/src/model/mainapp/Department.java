package model.mainapp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;

import model.shared.CheckInOut;

public class Department {

	/*********************************************************************/
	/***************************** ATTRIBUTES ****************************/
	/*********************************************************************/
	
	private String name;
	//a map in which each employee can be directly obtained from his ID
	private HashMap<Integer,Employee> listEmployees;


	/*********************************************************************/
	/****************************** BUILDERS *****************************/
	/*********************************************************************/

	/**
	 * @throws Exception 
	 */
	public Department() throws Exception {
		this("default");
	}
	
	/**
	 * @param name
	 * @throws Exception 
	 */
	public Department(String name) throws Exception {
		this(name, new Employee("default","default"));
	}
	
	/**
	 * @param name
	 * @param boss
	 * @throws Exception 
	 */
	public Department(String name, Employee boss) throws Exception {
		setName(name);
		boss.setDepartment(getName());
		setListEmployees(new HashMap<>());
		addEmployee(boss);
	}
	
	
	/*********************************************************************/
	/***************************** GETS/SETS *****************************/
	/*********************************************************************/

	/******************************** Name *******************************/
	
	public String getName() {
		return name;
	}
	
	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*************************** ListEmployees ***************************/
	
	/**
	 * @return
	 */
	public HashMap<Integer,Employee> getListEmployees() {
		return listEmployees;
	}
	
	/**
	 * @param listEmployees
	 */
	protected void setListEmployees(HashMap<Integer,Employee> listEmployees) {
		this.listEmployees = listEmployees;
	}
	
	/**
	 * @param employee
	 * @throws Exception 
	 */
	public void addEmployee(Employee employee) throws Exception {
		if (getListEmployees().containsKey(employee.getID()))
			throw new Exception("This employee is already in the department");
		
		employee.setDepartment(getName());
		getListEmployees().put(employee.getID(), employee);
	}

	
	/*********************************************************************/
	/*************************** OTHER METHODS ***************************/
	/*********************************************************************/
	
	@Override
	public String toString() {
		String msg = "Department\t[name=" + name + ",\n\t\t listEmployees=[\n\t\t\t\t";
		for(Employee employeeTmp : listEmployees.values()) {
			msg += employeeTmp.toString() + "\n\t\t\t\t";
		}
		msg = msg.substring(0,msg.length()-1);
		msg += "]\n\t\t]";
		return msg;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Department A = new Department("PolyGame");
			Department B = new Department("JavaTech", new Employee("default", "RH"));
			
			//add few employees to B
			B.addEmployee(new Employee());
			B.addEmployee(new Employee());
			
			//add few checks to A
			
			CheckInOut exempleCheck1 = new CheckInOut();
			exempleCheck1.setEmployeeID(1);
			SearchInMainapp.searchEmployee(A,1).getListChecks().add(exempleCheck1);
			
			CheckInOut exempleCheck2 = new CheckInOut();
			SearchInMainapp.searchEmployee(A,1).getListChecks().add(exempleCheck2);
			exempleCheck2.setEmployeeID(1);
			
			CheckInOut exempleCheck3 = new CheckInOut();
			SearchInMainapp.searchEmployee(A,1).getListChecks().add(exempleCheck3);
			exempleCheck3.setEmployeeID(1);
			
			//a has 1 employee that made 3 checks
			
			System.out.println(A.toString() + System.lineSeparator()); //show A

			
			SearchInMainapp.searchEmployee(B,3).setFirstname("Theo");
			SearchInMainapp.searchEmployee(B,3).setLastname("Boisseau");
			
			System.out.println(B.toString() + System.lineSeparator()); //show B
			
			//the employee that have ID=3
			System.out.println(B.getName() + " : { (ID=3) }\n" + SearchInMainapp.searchEmployee(B,3) + System.lineSeparator());
			//the employees that have "default" in their names
			System.out.println(B.getName() + " : { (firstname=\"default\") }\n" + SearchInMainapp.searchEmployee(B,"default",0) + System.lineSeparator());
			//the employees named "default" "default"
			System.out.println(B.getName() + " : { (firstname=\"default\")^(lastname=\"default\") }\n" + SearchInMainapp.searchEmployee(B,"default", "default")
				+ System.lineSeparator());
			//the employees who made checks today (until now)
			System.out.println(A.getName() + " : { (checkInOut<NOW) }\n"
				+ SearchInMainapp.searchEmployee(A,LocalDateTime.of(LocalDate.now(), LocalTime.of(00,00)), LocalDateTime.now()) + System.lineSeparator());
		} catch (RuntimeException e) {
			System.out.println("\nError : Tried to access to an absent Employee in the list");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
