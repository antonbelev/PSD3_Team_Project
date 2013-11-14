package roles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import session.Course;
import session.Lab;
import session.Session;
import session.Tutorial;

public class TeachingAdmin extends User {

	public TeachingAdmin(String firstName, String lastName, String iD,
			String email) {
		super(firstName, lastName, iD, email);
		// TODO Auto-generated constructor stub
	}

	public String exportStudentAttendance(Course course) {
		String csvHeader = "First name,Surname,ID number";
		String csvLine = "";
		ArrayList<Student> students = course.getStudents();
		ArrayList<Session> sessions = course.getSessions();

		for (Session s : sessions) {
			if ((s instanceof Lab) || (s instanceof Tutorial)) {
				csvHeader += "," + s.getSessionName();
			}
		}
		csvHeader += "/n";

		for (Student stud : students) {
			csvLine += stud.getFirstName() + "," + stud.getLastName() + ","
					+ stud.getID();

			ArrayList<Course> currentStudentCourses = stud.getCourses();
			Course currentCourse = null;
			for (Course c : currentStudentCourses) {
				if (course.equals(c)) {
					currentCourse = c;
					break;
				}
			}
			try {
				for (Session s : currentCourse.getSessions()) {
					if ((s instanceof Lab) || (s instanceof Tutorial)) {
						csvLine += "," + s.getAttendance().toString();
					}
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}

			csvLine += "/n";
			csvHeader += csvLine;
		}
		return csvHeader;
	}

	public String exportStudentInformation(Student s) {
		String csvHeader = "Course,ID Number,Coursework,Exam,Total/n";
		String csvLine = "";

		for (Course c : s.getCourses()) {
			int total = c.getCourseWorkMark() + c.getExamMark();
			csvLine += c.getName() + "," + c.getCourseId() + ","
					+ c.getCourseWorkMark() + "," + c.getExamMark() + ","
					+ total + "/n";
			csvHeader += csvLine;
		}

		return csvHeader;

	}

	public void csvFileGenerator(String fileName, String content) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName
					+ ".csv"));
			out.write(content);
			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
