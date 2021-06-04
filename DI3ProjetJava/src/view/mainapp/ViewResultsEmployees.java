package view.mainapp;

import java.awt.event.ActionEvent;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JTable;

public class ViewResultsEmployees extends ViewResults {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5485924175594067340L;

	
	/*********************************************************************/
	/****************************** BUILDERS *****************************/
	/*********************************************************************/

	/**
	 * @brief Constructor.
	 */
	public ViewResultsEmployees (Object[][] dataEntry, String[] titles) {
		initializeAttributes(dataEntry, titles);
		build();
	}

	
	/*********************************************************************/
	/*************************** OTHER METHODS ***************************/
	/*********************************************************************/
	
	protected void initializeAttributes(Object[][] dataEntry, String[] titles) {
		
		setDataEntry(dataEntry);
		sortDataByIDEmployees();
		setTitles(titles);
		dataTable = new JTable(dataEntry, titles);
		
	}
	
	
	protected void build() {
		
		//create frame
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setBounds(300,300,600,400);
		setTitle("Results of the employee research");
				
		//create panel	
		buildContentPanel();

		add(panel);
		setVisible(true);
		
	}
	
	private void sortDataByIDEmployees() {
		
		for (int i = 0; i < dataEntry.length; i++) {
			for (int j = 0; j < dataEntry.length; j++) {
				if (Integer.parseInt((String) dataEntry[i][0]) < Integer.parseInt((String) dataEntry[j][0])) {
					Object[] temp = dataEntry[i];
					dataEntry[i] = dataEntry[j];
					dataEntry[j] = temp;
				}
			}
		}
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		Object source = event.getSource();
		
	}

}
