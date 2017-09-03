package db;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.jws.WebService;


import interfaces.ControllerInt;

@WebService(endpointInterface = "interfaces.ControllerInt") 
public class Controller implements ControllerInt {
	
	@Override
	public String createMicroservice(String port) {
		String s = "";
		String homeDir = System.getenv("HOME");
		String[] cmd = { "/tmp/createContainer.sh", port };
		try {
			Process p = Runtime.getRuntime().exec(cmd);
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
			BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			String line = "";
			while ((line = stdInput.readLine()) != null) {
				s += line;
			}
			while ((line = stdError.readLine()) != null) {
				s += line;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s);
		return s;

	}

	@Override
	public String deleteMicroservice(String container) {
		String s = "";
		String homeDir = System.getenv("HOME");
		String[] cmd = { "/tmp/deleteContainer.sh", container };
		try {
			Process p = Runtime.getRuntime().exec(cmd);
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
			BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			String line = "";
			while ((line = stdInput.readLine()) != null) {
				s += line;
			}
			while ((line = stdError.readLine()) != null) {
				s += line;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s);
		return s;
	}

	@Override
	public String getTest() {
		return "Test";

	}


}
