package session;

import java.util.ArrayList;

import roles.Student;
import roles.TutorInterface;

public class Tutorial extends Session {
	
	private ArrayList<TutorInterface> tutors;

	public Tutorial(Course course, ArrayList<TimeStamp> sessionTimes,
			ArrayList<Student> students, AttendanceEnum attendance,
			String sessionName, String location, int minCapacity,
			int maxCapacity, ArrayList<TutorInterface> tutors) {
		super(course, sessionTimes, students, attendance, sessionName,
				location, minCapacity, maxCapacity);
		this.tutors = tutors;
	}

	public ArrayList<TutorInterface> getTutors() {
		return tutors;
	}

	public void setTutors(ArrayList<TutorInterface> tutors) {
		this.tutors = tutors;
	}
	
	

}
