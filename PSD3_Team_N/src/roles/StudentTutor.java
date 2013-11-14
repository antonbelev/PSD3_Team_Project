package roles;

import java.util.ArrayList;

import session.Course;
import session.Session;

public class StudentTutor extends Student implements TutorInterface{


	public StudentTutor(String firstName, String lastName, String iD,
			String email, ArrayList<Course> courses) {
		super(firstName, lastName, iD, email, courses);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateAttendance(Session sesh) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rollBack() {
		// TODO Auto-generated method stub
		
	}

}