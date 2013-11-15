package roles;

import helpers.Help;

import java.util.ArrayList;
import java.util.Scanner;

import session.Course;
import session.Session;

public class StudentTutor extends Student implements TutorInterface{


	public StudentTutor(String firstName, String lastName, String iD,
			String email, ArrayList<Course> courses) {
		super(firstName, lastName, iD, email, courses);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateAttendance(Scanner sn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rollBack() {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void uploadAttendance(Scanner sn) {
		// TODO Auto-generated method stub
		
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