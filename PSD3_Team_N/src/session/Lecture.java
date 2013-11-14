package session;

import java.util.ArrayList;

import roles.Lecturer;
import roles.Student;

public class Lecture extends Session{
	
	private ArrayList<Lecturer> lecturers;

	public Lecture(Course course, ArrayList<TimeStamp> sessionTimes,
			ArrayList<Student> students, AttendanceEnum attendance,
			String sessionName, String location, int minCapacity,
			int maxCapacity, ArrayList<Lecturer> lecturers) {
		super(course, sessionTimes, students, attendance, sessionName,
				location, minCapacity, maxCapacity);
		this.lecturers = lecturers;
	}

	public ArrayList<Lecturer> getLecturers() {
		return lecturers;
	}

	public void setLecturers(ArrayList<Lecturer> lecturers) {
		this.lecturers = lecturers;
	}
	
	

}
