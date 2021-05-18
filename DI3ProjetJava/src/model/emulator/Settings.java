package model.emulator;

import java.time.LocalDateTime;
import java.util.concurrent.CopyOnWriteArrayList;

public class Settings 
{

	/* ================================================================= */
	/************************* CLASS ATTRIBUTS ***************************/
	/*********************************************************************/

	private String departmentName;
	private CopyOnWriteArrayList<Integer> listEmployeeID;
	private LocalDateTime dateTime;
	private int IPAdress;
	private int portNumber;

	/*********************************************************************/
	/*********************************************************************/
	/* ================================================================= */

	/* ================================================================= */
	/*************************** CONSTRUCTORS ****************************/
	/*********************************************************************/

	/**
	 * @brief Default Constructor
	 */
	public Settings() 
	{
		departmentName = new String();
		listEmployeeID = new CopyOnWriteArrayList<Integer>();
		dateTime = LocalDateTime.now();
		setIPadress(IPAdress);
		setPortNumber(portNumber);
	}

	/**
	 * @brief Copy Constructor
	 * @param departmentName
	 * @param listEmployeeID
	 * @param dateTime
	 * @param iPadress
	 * @param portNumber
	 */
	public Settings(String departmentName, CopyOnWriteArrayList<Integer> listEmployeeID, LocalDateTime dateTime,
			int iPAdress, int portNumber) 
	{
		super();
		this.departmentName = departmentName;
		this.listEmployeeID = listEmployeeID;
		this.dateTime = dateTime;
		IPAdress = iPAdress;
		this.portNumber = portNumber;
	}

	/*********************************************************************/
	/*********************************************************************/
	/* ================================================================= */

	/* ================================================================= */
	/********************** GETTERS AND SETTERS **************************/
	/*********************************************************************/

	/**
	 * @brief
	 * @return the departmentName
	 */
	public String getDepartmentName() 
	{
		return departmentName;
	}

	/**
	 * @brief
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) 
	{
		this.departmentName = departmentName;
	}

	/**
	 * @brief
	 * @return the listEmployeeID
	 */
	public CopyOnWriteArrayList<Integer> getListEmployeeID() 
	{
		return listEmployeeID;
	}

	/**
	 * @brief
	 * @param listEmployeeID the listEmployeeID to set
	 */
	public void setListEmployeeID(CopyOnWriteArrayList<Integer> listEmployeeID) 
	{
		this.listEmployeeID = listEmployeeID;
	}

	/**
	 * @brief
	 * @return the dateTime
	 */
	public LocalDateTime getDateTime() 
	{
		return dateTime;
	}

	/**
	 * @brief
	 * @param dateTime the dateTime to set
	 */
	public void setDateTime(LocalDateTime dateTime) 
	{
		this.dateTime = dateTime;
	}

	/**
	 * @brief
	 * @return the iPadress
	 */
	public int getIPadress() 
	{
		return IPAdress;
	}

	/**
	 * @brief
	 * @param iPadress the iPadress to set
	 */
	public void setIPadress(int iPAdress) 
	{
		IPAdress = iPAdress;
	}

	/**
	 * @brief
	 * @return the portNumber
	 */
	public int getPortNumber() 
	{
		return portNumber;
	}

	/**
	 * @brief
	 * @param portNumber the portNumber to set
	 */
	public void setPortNumber(int portNumber) 
	{
		this.portNumber = portNumber;
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