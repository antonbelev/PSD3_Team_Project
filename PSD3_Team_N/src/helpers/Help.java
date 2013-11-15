package helpers;

import roles.Lecturer;
import roles.LecturerTutor;
import roles.Student;
import roles.StudentTutor;
import roles.TeachingAdmin;
import roles.User;

public abstract class Help {
	
	public static void getHelpMessages(User user)
	{
		String exit = "To exit (-exit)\n";
		String help = "To see the list of commands (-help)\n";
		
		String userSpecific = "";
		
		if (user instanceof Lecturer)
			userSpecific = getLecturerMessages();
		else if (user instanceof LecturerTutor)
			userSpecific = getLecturerTutorMessages();
		else if (user instanceof Student)
			userSpecific = getStudentMessages();
		else if (user instanceof StudentTutor)
			userSpecific = getStudentTutorMessages();
		else if (user instanceof TeachingAdmin)
			userSpecific = getTeachingAdminMessages();
		
		System.out.print(exit + help + userSpecific);	
		
	}

	private static String getTeachingAdminMessages() {
		String exportAttendance = "To export the attendance (-expatt)\n";
		String exportStudentRecord = "To export student information (-expstinf)\n";
		String cc = "To create a new course (-cc)\n";
		String cs = "To create a new session (-cs)\n";	
		String astc = "To assign new student to a course (-astc)\n";
		
		return exportAttendance + exportStudentRecord + cc + cs + astc;
	}

	private static String getStudentTutorMessages() {
		// TODO Auto-generated method stub
		return "";
	}

	private static String getStudentMessages() {
		// TODO Auto-generated method stub
		return "";
	}

	private static String getLecturerTutorMessages() {
		// TODO Auto-generated method stub
		return "";
	}

	private static String getLecturerMessages() {
		String createCourse = "To create a new course (-cc)\n";
		String createSession = "To create a new session (-cs)\n";
		
		return createCourse + createSession;
	}

}
