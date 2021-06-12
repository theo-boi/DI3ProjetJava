package view.mainapp;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

/**
 * 
 * @brief View which represents the results of an Employee research.
 *
 */
public class ViewResultsEmployeeDetails extends JFrame {

	/**
	 * @brief serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/*********************************************************************/
	/***************************** ATTRIBUTES ****************************/
	/*********************************************************************/
	
	private JTabbedPane mainTabbedPane;
	
	private JPanel frameInfo;
	private JTable infoTable;
	
	private JPanel framePlanning;
	private JTable planningTable;
	
	private JPanel frameChecks;
	private JTable checksTable;

	
	/*********************************************************************/
	/****************************** BUILDERS *****************************/
	/*********************************************************************/
	
	public ViewResultsEmployeeDetails(Object[][][] dataEntry, String[][] titles) {
		build(dataEntry, titles);
	}
	
	
	/*********************************************************************/
	/***************************** GETS/SETS *****************************/
	/*********************************************************************/
	
	/*************************** mainTabbedPane **************************/
	
	/**
	 * @return the mainTabbedPane
	 */
	public JTabbedPane getMainTabbedPane() {
		return mainTabbedPane;
	}
	/**
	 * @param mainTabbedPane the mainTabbedPane to set
	 */
	public void setMainTabbedPane(JTabbedPane mainTabbedPane) {
		this.mainTabbedPane = mainTabbedPane;
	}
	
	/*************************** employeeMainInfo ************************/
	
	/**
	 * @return the employeeMainInfo
	 */
	public JTable getInfoTable() {
		return infoTable;
	}
	/**
	 * @param employeeMainInfo the employeeMainInfo to set
	 */
	public void setInfoTable(JTable infoTable) {
		this.infoTable = infoTable;
	}
	
	/**************************** framePlanning **************************/
	
	/**
	 * @return the framePlanning
	 */
	public JPanel getFramePlanning() {
		return framePlanning;
	}
	/**
	 * @param framePlanning the framePlanning to set
	 */
	public void setFramePlanning(JPanel framePlanning) {
		this.framePlanning = framePlanning;
	}
	
	/**************************** planningTable **************************/
	
	/**
	 * @return the planningTable
	 */
	public JTable getPlanningTable() {
		return planningTable;
	}
	/**
	 * @param planningTable the planningTable to set
	 */
	public void setPlanningTable(JTable planningTable) {
		this.planningTable = planningTable;
	}
	
	/***************************** frameChecks ***************************/
	
	/**
	 * @return the frameChecks
	 */
	public JPanel getFrameChecks() {
		return frameChecks;
	}
	/**
	 * @param frameChecks the frameChecks to set
	 */
	public void setFrameChecks(JPanel frameChecks) {
		this.frameChecks = frameChecks;
	}
	
	/***************************** checksTable ***************************/
	
	/**
	 * @return the checksTable
	 */
	public JTable getChecksTable() {
		return checksTable;
	}
	/**
	 * @param checksTable the checksTable to set
	 */
	public void setChecksTable(JTable checksTable) {
		this.checksTable = checksTable;
	}
	
	
	/*********************************************************************/
	/*************************** OTHER METHODS ***************************/
	/*********************************************************************/
	
	/**
	 * @brief Method which create main frame and panel.
	 */
	private void build(Object[][][] dataEntry, String[][] titles) {
		
		//create frame
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setBounds(300,300,500,500);
		this.setTitle("Employee Details");
		
		//create panel	
		buildContentMainTabbedPane(dataEntry, titles);

		this.add(mainTabbedPane);
		this.setVisible(true);
	}

	/**
	 * @brief Method which build main tabbedPane.
	 */
	private void buildContentMainTabbedPane(Object[][][] dataEntry, String[][] titles){
		initializeAttributes(dataEntry, titles);
		mainTabbedPane = new JTabbedPane();

		//Info
		mainTabbedPane.addTab("Info", frameInfo);
		
		//Planning
		mainTabbedPane.addTab("Planning", framePlanning);
		
		//CheckInOuts
		mainTabbedPane.addTab("CheckInOuts", frameChecks);
	
	}
	
	/**
	 * @brief Method used to initialize attributes.
	 * 
	 * @param dataEntry the dataEntry to set
	 * @param titles the titles to set
	 */
	private void initializeAttributes(Object[][][] dataEntry, String[][] titles) {
		
		//Frame info
		frameInfo = new JPanel();
		infoTable = new JTable(dataEntry[0], titles[0]);
		//frameInfo.add(infoTable.getTableHeader()); //should be done automatically by the next line ?
		frameInfo.add(infoTable); //<- bug
		
		//Frame planning
		framePlanning = new JPanel();
		planningTable = new JTable(dataEntry[1], titles[1]);
		//framePlanning.add(planningTable.getTableHeader()); //should be done automatically by the next line ?
		framePlanning.add(planningTable); //<- bug
		
		//Frame Checks
		frameChecks = new JPanel();
		checksTable = new JTable(dataEntry[2], titles[2]);
		//frameChecks.add(checksTable.getTableHeader()); //should be done automatically by the next line ?
		frameChecks.add(checksTable); //<- no bug but does not print entirely
		
	}
}
