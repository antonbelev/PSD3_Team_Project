package roles;

import java.util.ArrayList;

import session.Course;

public class Student extends User{

	private ArrayList<Course> courses;

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


}
