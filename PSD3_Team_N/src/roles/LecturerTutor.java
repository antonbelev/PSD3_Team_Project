package roles;

import session.Session;

public class LecturerTutor extends Lecturer implements TutorInterface{

	public LecturerTutor(String firstName, String lastName, String iD,
			String email) {
		super(firstName, lastName, iD, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateAttendance(Session sesh) {
		System.out.println("Student attendace monitoring for session:");
		System.out.println("Enter ls to see list of students in this session");
		System.out.println("Enter input to enter attendance for each student");
		
		
		
		System.out.println("Student name : Student ID");
		for (Student s : sesh.getStudents ()){
			System.out.println(s.getFirstName() +" "+ s.getLastName()+ " : " + s.getID());
		}
		// TODO Auto-generated method stub
		
	}
		

	@Override
	public void rollBack() {
		// TODO Auto-generated method stub
		
	}

}
