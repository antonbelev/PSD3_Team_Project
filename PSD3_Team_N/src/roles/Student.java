package roles;

import helpers.Help;

import java.util.ArrayList;
import java.util.Scanner;

import session.Course;

public class Student extends User{

	private ArrayList<Course> courses;
	
	public Student()
	{
		courses = new ArrayList<Course>();
	}

	public Student(String firstName, String lastName, String iD, String email,
			ArrayList<Course> courses) {
		super(firstName, lastName, iD, email);
		this.courses = courses;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
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
