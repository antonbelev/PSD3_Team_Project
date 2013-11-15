package session;

import java.util.ArrayList;

import roles.Lecturer;
import roles.Student;

public class Lecture extends Session{
	
	private ArrayList<Lecturer> lecturers;

	public Lecture(ArrayList<Lecturer> lecturers) {
		super();
		this.lecturers = lecturers;
	}

	public ArrayList<Lecturer> getLecturers() {
		return lecturers;
	}

	public void setLecturers(ArrayList<Lecturer> lecturers) {
		this.lecturers = lecturers;
	}
	
	

}
