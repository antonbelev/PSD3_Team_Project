package session;

import java.util.ArrayList;

import roles.Student;
import roles.TutorInterface;

public class Lab extends Session{
	
	private ArrayList<TutorInterface> tutors;

	public Lab(Course course, ArrayList<TimeStamp> sessionTimes,
			ArrayList<Student> students, String location, int minCapacity,
			int maxCapacity, ArrayList<TutorInterface> tutors) {
		super(course, sessionTimes, students, location, minCapacity,
				maxCapacity);
		this.tutors = tutors;
	}

	public ArrayList<TutorInterface> getTutors() {
		return tutors;
	}

	public void setTutors(ArrayList<TutorInterface> tutors) {
		this.tutors = tutors;
	}
	
	
	
	

}
