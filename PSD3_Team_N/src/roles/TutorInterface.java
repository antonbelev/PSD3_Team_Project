package roles;

import java.util.Scanner;

import session.Session;

public interface TutorInterface {
	
	public void updateAttendance(Scanner sn);
	public void rollBack(); //stop being tutor
	public void uploadAttendance(Scanner sn);
}
