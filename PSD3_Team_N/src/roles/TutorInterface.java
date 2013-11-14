package roles;

import session.Session;

public interface TutorInterface {
	
	public void updateAttendance(Session sesh);
	public void rollBack(); //stop being tutor

}
