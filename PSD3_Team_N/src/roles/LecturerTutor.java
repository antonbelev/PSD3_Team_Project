package roles;

import helpers.Help;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import session.Lab;
import session.Session;
import session.Session.AttendanceEnum;

public class LecturerTutor extends Lecturer implements TutorInterface {

	private ArrayList<Session> prototypeSessions;

	public LecturerTutor(String firstName, String lastName, String iD,
			String email) {
		super(firstName, lastName, iD, email);
		// Create some hard-coded data
		prototypeSessions = new ArrayList<Session>();
		Student s1 = new Student("Anton", "Belev", "12345", "anto@gla.ac.uk",
				null);
		Student s2 = new Student("Daniel", "Fairclough", "55555",
				"dan@gla.ac.uk", null);
		Student s3 = new Student("Lewis", "Mcgeechan", "99999",
				"lewis@gla.ac.uk", null);
		Student s4 = new Student("Silvia", "Sotirova", "66666",
				"sis@gla.ac.uk", null);
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);

		Session lab1 = new Lab();
		lab1.setSessionName("lab1");
		Session lab2 = new Lab();
		lab2.setSessionName("lab2");
		Session tut1 = new Lab();
		tut1.setSessionName("tut1");
		Session tut2 = new Lab();
		tut2.setSessionName("tut2");
		this.prototypeSessions.add(lab1);
		this.prototypeSessions.add(lab2);
		this.prototypeSessions.add(tut1);
		this.prototypeSessions.add(tut2);
		for (Session s : prototypeSessions) {
			for (Student stud : students)
				s.getStudentAttendance().put(stud, AttendanceEnum.NOTSET);
		}
	}

	@Override
	public void updateAttendance(Scanner sn) {
		System.out.println("Please select one of the following sessions:");

		for (Session s : prototypeSessions) {
			System.out.println("Session name: " + s.getSessionName());
		}
		System.out.print("Pick session: ");
		String sessionName = sn.next();
		Session session = null;

		for (Session s : prototypeSessions) {
			if (s.getSessionName().equals(sessionName)) {
				session = s;
				break;
			}
		}
		updateAttendance(session, sn);
	}

	public void updateAttendance(Session sesh, Scanner sn) {

		System.out.println("Student attendace monitoring for session: "
				+ sesh.getSessionName());

		System.out.println("Enter -ls to see list of students in this session");
		System.out.println("Enter -input to enter attendance for each student");
		System.out.println("Enter -quit to leave attendance monitor");

		String nextCommand = sn.next();

		do{
			if (nextCommand.equals("-ls")) {
				System.out.println("Student name : Student ID : Attendance");
				for (Student s : sesh.getStudentAttendance().keySet()) {
					System.out.println(s.getFirstName() + " " + s.getLastName()
							+ " : " + s.getID() + " : "
							+ sesh.getStudentAttendance().get(s));
				}

			} else if (nextCommand.equals("-input")) {
				System.out.println("Student name : Student ID");
				for (Student s : sesh.getStudentAttendance().keySet()) {
					System.out.println(s.getFirstName() + " " + s.getLastName()
							+ " : " + s.getID());
					System.out.print("Input attendance for session"
							+ sesh.getSessionName() + "(T/F/MV): ");
					String att = sn.next();
					AttendanceEnum attEnum = null;
					switch (att.toUpperCase()) {
					case "T":
						attEnum = AttendanceEnum.PRESENT;
						break;
					case "F":
						attEnum = AttendanceEnum.ABSENT;
						break;
					case "MV":
						attEnum = AttendanceEnum.MV;
					}
					sesh.getStudentAttendance().put(s, attEnum);
				}
			} else if (nextCommand.equals("-quit")) {
				System.out.println("Leaving Attendance Monitor");
			} else {
				System.out.println("Bad input");
			}
			nextCommand = sn.next();
		} while (!nextCommand.equals("-quit"));

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
				// From here we can pass studentID & attEnum to a session
				// dictionary for attendance
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
		case "-quit": {
			//do nothing hack
			break;
		}

		default:
			System.out.println("Invalid command");
			break;
		}
	}

}
