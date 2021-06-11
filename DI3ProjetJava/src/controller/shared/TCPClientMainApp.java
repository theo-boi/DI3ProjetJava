package controller.shared;

import java.io.*;
import java.net.InetAddress;
import java.util.ArrayList;

import model.shared.EmployeeInfo; 

public class TCPClientMainApp extends TCPClientMainAppBuilder implements Runnable {
	
	
	 public TCPClientMainApp(ArrayList<EmployeeInfo> listEmployees, InetAddress IPaddress, int numPort) {
		super(listEmployees, IPaddress, numPort);
	}

	public void run() { 
		boolean dataSent = false;
		while (!dataSent) {
			 try  { 
				 System.out.println("The client mainApp launched...");
				 setSocket(); 
				 System.out.println("Hello, the client mainApp is connected");
				 sOut = s.getOutputStream();
				 oos = new ObjectOutputStream(sOut);
				 oos.writeObject(listEmployees);
				 oos.flush();
				 sIn = s.getInputStream();
				 ois = new ObjectInputStream(sIn);
				 if(ois.readBoolean()) {
					 dataSent = true;
				 }
				 oos.close();
				 ois.close();
				 s.close();
			 } catch(IOException e) { 
				 System.out.println("IOException TCPClientMainApp : " + e.getMessage());
				 if(this.s != null && s.isConnected()) {
					 try {
						s.close();
					} catch (IOException e1) {
						System.out.println("IOException TCPClientMainApp : " + e1.getMessage());
					}
				 }
				 try {
					Thread.sleep(10000);
				} catch (InterruptedException e1) {
					System.out.println("InterruptedException TCPClientMainApp : " + e1.getMessage());
				}
			 } 
		}
	}
	 
}
