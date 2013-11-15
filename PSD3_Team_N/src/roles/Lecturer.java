package roles;

import helpers.Help;

import java.util.Scanner;

public class Lecturer extends User {

	public Lecturer(String firstName, String lastName, String iD, String email) {
		super(firstName, lastName, iD, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getHelp() {
		Help.getHelpMessages(this);			
	}

	@Override
	public void processCommand(String command, Scanner sn) {
		// TODO Auto-generated method stub
		
	}
	

}
