package session;

import java.util.ArrayList;

import roles.Student;
import roles.TutorInterface;

public class Lab extends Session{
	
	private ArrayList<TutorInterface> tutors;
	
	public Lab()
	{
		
	}

	public Lab(ArrayList<TutorInterface> tutors) {
		super();
		this.tutors = tutors;
	}


	public ArrayList<TutorInterface> getTutors() {
		return tutors;
	}

	public void setTutors(ArrayList<TutorInterface> tutors) {
		this.tutors = tutors;
	}
	
	
	
	

}
