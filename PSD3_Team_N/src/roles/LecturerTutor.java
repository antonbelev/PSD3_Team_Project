package roles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import helpers.Help;
import session.Session;
import session.Session.AttendanceEnum;

public class LecturerTutor extends Lecturer implements TutorInterface {

	public LecturerTutor(String firstName, String lastName, String iD,
			String email) {
		super(firstName, lastName, iD, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateAttendance(Scanner sn) {
		/*
		 * System.out.println("Student attendace monitoring for session:");
		 * 
		 * System.out.println("Enter -ls to see list of students in this session"
		 * );
		 * System.out.println("Enter -input to enter attendance for each student"
		 * ); System.out.println("Enter -quit to leave attendance monitor");
		 * 
		 * 
		 * if (sn.next().equals("-ls")){
		 * System.out.println("Student name : Student ID : Attendance"); for
		 * (Student s : sesh.getStudentAttendance().keySet()){
		 * System.out.println(s.getFirstName() +" "+ s.getLastName()+ " : " +
		 * s.getID() + " : " + sesh.getStudentAttendance().get(s)); }
		 * 
		 * }else if (sn.next().equals("-input")){
		 * System.out.println("Student name : Student ID"); for (Student s :
		 * sesh.getStudentAttendance().keySet()){
		 * System.out.println(s.getFirstName() +" "+ s.getLastName()+ " : " +
		 * s.getID()); System.out.print("Input attendance for session" +
		 * sesh.getSessionName() + "(T/F/MV): "); String att = sn.next();
		 * AttendanceEnum attEnum = null; switch (att.toUpperCase()) { case "T":
		 * attEnum = AttendanceEnum.PRESENT; break; case "F": attEnum =
		 * AttendanceEnum.ABSENT; break; case "MV": attEnum = AttendanceEnum.MV;
		 * } sesh.getStudentAttendance().put(s, attEnum); } }else if
		 * (sn.next().equals("-quit")){
		 * System.out.println("Leaving Attendance Monitor"); }else{
		 * System.out.println("Bad input"); }
		 */

	}

	@Override
	public void uploadAttendance(Scanner sn) {
		System.out
		.println("You can enter attendance from a barcode scanned CSV file");
		System.out.println("Please enter the file name");
		String csvFile = sn.next();
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		String[] headers;
		String studentID = "";
		AttendanceEnum attEnum = null;

		try {

			br = new BufferedReader(new FileReader(csvFile));
			line = br.readLine();
			headers = line.split(cvsSplitBy);
			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] values = line.split(cvsSplitBy);
				values[0] = studentID;

				switch (values[1].toUpperCase()) {
				case "PRESENT":
					attEnum = AttendanceEnum.PRESENT;
					break;
				case "ABSENT":
					attEnum = AttendanceEnum.ABSENT;
					break;
				case "MV":
					attEnum = AttendanceEnum.MV;
				}
				// From here we can pass studentID & attEnum to a session dictionary for attendance
			}
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void rollBack() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getHelp() {
		Help.getHelpMessages(this);
	}

	@Override
	public void processCommand(String command, Scanner sn) {
		switch (command) {
		case "-help": {
			getHelp();
			break;
		}
		case "-updatt": {
			updateAttendance(sn);
			break;
		}

		default:
			System.out.println("Invalid command");
			break;
		}
	}

}
