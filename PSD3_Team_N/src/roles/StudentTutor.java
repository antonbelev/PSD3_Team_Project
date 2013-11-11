package roles;

public class StudentTutor extends Student implements TutorInterface{

	public StudentTutor(String firstName, String lastName, String iD,
			String email) {
		super(firstName, lastName, iD, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateAttendance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rollBack() {
		// TODO Auto-generated method stub
		
	}

}
