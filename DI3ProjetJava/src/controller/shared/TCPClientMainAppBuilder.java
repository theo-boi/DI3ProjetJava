package controller.shared;

import java.net.*;
import java.util.ArrayList;

import model.shared.EmployeeInfo;

import java.io.*; 

public class TCPClientMainAppBuilder extends ExchangeViaSocket {
	
	protected InetAddress IPaddress;
	protected int numPort;
	protected Socket s; 
	protected InetSocketAddress isA; 
	protected ArrayList<EmployeeInfo> listEmployees;
	
	TCPClientMainAppBuilder(ArrayList<EmployeeInfo> listEmployees, InetAddress IPaddress, int numPort) { 
		this.IPaddress = IPaddress;
		this.numPort = numPort;
		this.listEmployees = listEmployees;
		s = null; 
		isA = null; 
		sOut = null;
		sIn = null;
		ois = null;
		oos = null;
	} 
	
	protected void setSocket() throws IOException { 
		isA = new InetSocketAddress(IPaddress, numPort); 
		s = new Socket(isA.getHostName(), isA.getPort());

	} 

}