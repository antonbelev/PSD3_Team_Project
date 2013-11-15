package roles;

import helpers.Help;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import session.Course;
import session.Lab;
import session.Session;
import session.Session.AttendanceEnum;
import session.Tutorial;

public class TeachingAdmin extends User {

	/*
	 * List<Course> and List<Sessions> are used only in the prototype.
	 */

	private ArrayList<Course> prototypeCourses;
	private ArrayList<Session> prototypeSessions;
	private ArrayList<Student> prototypeStudents;

	public TeachingAdmin(String firstName, String lastName, String iD,
			String email) {
		super(firstName, lastName, iD, email);
		this.prototypeCourses = new ArrayList<Course>();
		this.prototypeSessions = new ArrayList<Session>();
		this.prototypeStudents = new ArrayList<Student>();
	}

	public ArrayList<Course> getPrototypeCourses() {
		return prototypeCourses;
	}

	public void setPrototypeCourses(ArrayList<Course> prototypeCourses) {
		this.prototypeCourses = prototypeCourses;
	}

	public ArrayList<Session> getPrototypeSessions() {
		return prototypeSessions;
	}

	public void setPrototypeSessions(ArrayList<Session> prototypeSessions) {
		this.prototypeSessions = prototypeSessions;
	}

	public String exportStudentAttendance(Course course) {
		
		System.out.println("Entered exportStudentAttendance");
		
		String csvHeader = "First name,Surname,ID number";
		String csvLine = "";
		ArrayList<Student> students = course.getStudents();
		ArrayList<Session> sessions = course.getSessions();

		for (Session s : sessions) {
			if ((s instanceof Lab) || (s instanceof Tutorial)) {
				csvHeader += "," + s.getSessionName();
			}
		}
		csvHeader += "\n";

		for (Student stud : students) {
			csvLine += stud.getFirstName() + "," + stud.getLastName() + ","
					+ stud.getID();
			
			System.out.println("Student " + stud.getFirstName());

			ArrayList<Course> currentStudentCourses = stud.getCourses();
			Course currentCourse = null;
			for (Course c : currentStudentCourses) {
				System.out.println("Course " + c.getName());
				if (course.equals(c)) {
					currentCourse = c;
					break;
				}
			}
			try {
				for (Session s : currentCourse.getSessions()) {
					System.out.println("Session " + s.getSessionName());
					if ((s instanceof Lab) || (s instanceof Tutorial)) {
						csvLine += "," + s.getStudentAttendance().get(stud).toString();
					}
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}

			csvLine += "\n";
			csvHeader += csvLine;
		}
		return csvHeader;
	}

	public String exportStudentInformation(Student s) {
		String csvHeader = "Course,ID Number,Coursework,Exam,Total\n";
		String csvLine = "";

		for (Course c : s.getCourses()) {
			int total = c.getCourseWorkMark() + c.getExamMark();
			csvLine += c.getName() + "," + c.getCourseId() + ","
					+ c.getCourseWorkMark() + "," + c.getExamMark() + ","
					+ total + "\n";
			csvHeader += csvLine;
		}

		return csvHeader;

	}

	public void csvFileGenerator(String fileName, String content) {
		try {
			File file = new File(fileName + ".csv");
			file.delete();	
			System.out.println("Entered file generator");
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName
					+ ".csv"));
			out.write(content);
			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void getHelp() {
		Help.getHelpMessages(this);
	}

	@Override
	public void processCommand(String command, Scanner sc) {
		switch (command) {
		case "-help": {
			getHelp();
			break;
		}
		case "-expatt": {
			processExpAtt(sc);
			break;
		}
		case "-cc": {
			createCourse(sc);
			break;
		}
		case "-cs": {
			createSession(sc);
			break;
		}
		case "-astc": {
			assignStudentToCourse(sc);
			break;
		}
		default:
			System.out.println("Invalid command");
			break;
		}
	}

	private void processExpAtt(Scanner sn) {
		sn = new Scanner(new InputStreamReader(System.in));
		System.out.print("Course name: ");
		String name = sn.next();
		Course course = null;

		for (Course c : prototypeCourses) {
			if (c.getName().equals(name)) {
				course = c;
				break;
			}
		}
		
		csvFileGenerator("attendance_" + course.getName() , exportStudentAttendance(course));
	}

	private void assignStudentToCourse(Scanner sn) {
		sn = new Scanner(new InputStreamReader(System.in));
		Student newStudent = new Student();
		System.out.print("Student first name: ");
		String firstName = sn.next();
		System.out.print("Student last name: ");
		String lastName = sn.next();
		System.out.print("Student id: ");
		String id = sn.next();
		System.out.print("Assign to course: ");
		String courseName = sn.next();
		System.out.print("Assign to session: ");

		Course course = null;
		
		for (Course c : prototypeCourses) {
			if (c.getName().equals(courseName)) {
				course = c;
				break;
			}
		}
		
		newStudent.setFirstName(firstName);
		newStudent.setLastName(lastName);
		newStudent.setID(id);
		newStudent.getCourses().add(course);
		course.getStudents().add(newStudent);
		
		ArrayList<Session> currentCourseSessions = course.getSessions();
		for (Session s : currentCourseSessions)
		{	
			System.out.print("Input attendance (T/F/MV): ");
			String att = sn.next();
			AttendanceEnum attEnum = null;
			switch (att.toUpperCase())
			{
				case "T":
					attEnum = AttendanceEnum.PRESENT;
					break;
				case "F":
					attEnum = AttendanceEnum.ABSENT;
					break;
				case "MV":
					attEnum = AttendanceEnum.MV;
			}	
			s.getStudentAttendance().put(newStudent, attEnum);
		}
	}

	private void createSession(Scanner sn) {
		sn = new Scanner(new InputStreamReader(System.in));
		Session newSession = null;
		System.out.print("Session type (lab/tut): ");
		String type = sn.next();
		System.out.print("Session name: ");
		String name = sn.next();
		System.out.print("Course assossiated with: ");
		String courseName = sn.next();
		Course sessionCourse = null;
		
		System.out.println("courses size " + prototypeCourses.size());
		
		for (Course c : prototypeCourses) {
			System.out.println("course name " + c.getName() + " courseName " + courseName);
			if (c.getName().equals(courseName)) {
				sessionCourse = c;
				break;
			}
		}

		switch (type) {
		case "lab":
			newSession = new Lab();
			break;
		case "tut":
			newSession = new Tutorial();
		}
		
		newSession.setCourse(sessionCourse);
		newSession.setSessionName(name);
		sessionCourse.getSessions().add(newSession);
		

		this.prototypeSessions.add(newSession);

	}

	private void createCourse(Scanner sn) {
		sn = new Scanner(new InputStreamReader(System.in));
		Course newCourse = new Course();
		System.out.print("Course name: ");
		String name = sn.next();
		System.out.print("Course id: ");
		String id = sn.next();
		newCourse.setCourseId(id);
		newCourse.setName(name);
		this.prototypeCourses.add(newCourse);
	}

}
