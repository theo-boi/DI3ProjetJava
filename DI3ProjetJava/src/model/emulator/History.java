package model.emulator;

import java.time.LocalTime;
import java.util.Hashtable;
import java.util.concurrent.CopyOnWriteArrayList;

import model.shared.CheckInOut;
import model.shared.Employee;

public class History 
{
	/* ================================================================= */
	/************************* CLASS ATTRIBUTES **************************/
	/*********************************************************************/
	
	private Settings settings;
	// All CheckInOut per employee from the first day
	private Hashtable<Employee, CopyOnWriteArrayList<CheckInOut>> checksPerEmployee;
	// All CheckInOut per employee during a day. The table is reset to 0 at the end of day.
	private Hashtable<LocalTime, Hashtable<Employee, CopyOnWriteArrayList<CheckInOut>>> checksPerEmployeePerDay;
	/*********************************************************************/
	/*********************************************************************/
	/* ================================================================= */

	/* ================================================================= */
	/*************************** CONSTRUCTORS ****************************/
	/*********************************************************************/
	
	/**
	 * @brief Default Constructor
	 */
	public History() {
		settings = new Settings();
		checksPerEmployee = new Hashtable<Employee, CopyOnWriteArrayList<CheckInOut>>();
		checksPerEmployeePerDay = new Hashtable<LocalTime, Hashtable<Employee, CopyOnWriteArrayList<CheckInOut>>>();
	}

	/**
	 * @param settings
	 * @param checksPerEmployee
	 * @param checksPerEmployeePerDay
	 */
	public History(Settings settings, Hashtable<Employee, CopyOnWriteArrayList<CheckInOut>> checksPerEmployee,
			Hashtable<LocalTime, Hashtable<Employee, CopyOnWriteArrayList<CheckInOut>>> checksPerEmployeePerDay) {
		super();
		this.settings = settings;
		this.checksPerEmployee = checksPerEmployee;
		this.checksPerEmployeePerDay = checksPerEmployeePerDay;
	}
	/*********************************************************************/
	/*********************************************************************/
	/* ================================================================= */

	/* ================================================================= */
	/********************** GETTERS AND SETTERS **************************/
	/*********************************************************************/

	/**
	 * @return the settings
	 */
	public Settings getSettings() {
		return settings;
	}

	/**
	 * @param settings the settings to set
	 */
	public void setSettings(Settings settings) {
		this.settings = settings;
	}

	/**
	 * @return the checksPerEmployee
	 */
	public Hashtable<Employee, CopyOnWriteArrayList<CheckInOut>> getChecksPerEmployee() {
		return checksPerEmployee;
	}

	/**
	 * @param checksPerEmployee the checksPerEmployee to set
	 */
	public void setChecksPerEmployee(Hashtable<Employee, CopyOnWriteArrayList<CheckInOut>> checksPerEmployee) {
		this.checksPerEmployee = checksPerEmployee;
	}

	/**
	 * @return the checksPerEmployeePerDay
	 */
	public Hashtable<LocalTime, Hashtable<Employee, CopyOnWriteArrayList<CheckInOut>>> getChecksPerEmployeePerDay() {
		return checksPerEmployeePerDay;
	}

	/**
	 * @param checksPerEmployeePerDay the checksPerEmployeePerDay to set
	 */
	public void setChecksPerEmployeePerDay(
			Hashtable<LocalTime, Hashtable<Employee, CopyOnWriteArrayList<CheckInOut>>> checksPerEmployeePerDay) {
		this.checksPerEmployeePerDay = checksPerEmployeePerDay;
	}
	/*********************************************************************/
	/*********************************************************************/
	/* ================================================================= */

	/* ================================================================= */
	/***************************** METHODS *******************************/
	/*********************************************************************/

	/*********************************************************************/
	/*********************************************************************/
	/* ================================================================= */

}
