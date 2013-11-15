package session;

import java.util.ArrayList;
import java.util.Date;

import roles.Lecturer;
import roles.Student;
import assignments.Assignment;

public class Course {
	
	private String name;
	private String courseId;
	private Lecturer lecturer;
	private Date startDate;
	private Date endDate;
	private String courseLevel;
	private int credits;
	
	private ArrayList<Student> students;	
	private ArrayList<Session> sessions;
	private ArrayList<Assignment> assignments;
	
	private int courseWorkMark;
	private int examMark;
	
	private boolean hasExams;
	private boolean hasAttendenceMonitoring;
	
	public Course()
	{
		sessions = new ArrayList<Session>();
		students = new ArrayList<Student>();
		assignments = new ArrayList<Assignment>();
	}
	
	public Course(String name, String courseId, Lecturer lecturer,
			Date startDate, Date endDate, String courseLevel, int credits,
			ArrayList<Student> students, ArrayList<Session> sessions,
			ArrayList<Assignment> assignments, int courseWorkMark,
			int examMark, boolean hasExams, boolean hasAttendenceMonitoring) {
		super();
		this.name = name;
		this.courseId = courseId;
		this.lecturer = lecturer;
		this.startDate = startDate;
		this.endDate = endDate;
		this.courseLevel = courseLevel;
		this.credits = credits;
		this.students = students;
		this.sessions = sessions;
		this.assignments = assignments;
		this.courseWorkMark = courseWorkMark;
		this.examMark = examMark;
		this.hasExams = hasExams;
		this.hasAttendenceMonitoring = hasAttendenceMonitoring;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public int getCourseWorkMark() {
		return courseWorkMark;
	}

	public void setCourseWorkMark(int courseWorkMark) {
		this.courseWorkMark = courseWorkMark;
	}

	public int getExamMark() {
		return examMark;
	}

	public void setExamMark(int examMark) {
		this.examMark = examMark;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public ArrayList<Assignment> getAssignments() {
		return assignments;
	}

	public void setAssignments(ArrayList<Assignment> assignments) {
		this.assignments = assignments;
	}

	public Lecturer getLecturer() {
		return lecturer;
	}

	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getCourseLevel() {
		return courseLevel;
	}

	public void setCourseLevel(String courseLevel) {
		this.courseLevel = courseLevel;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public ArrayList<Session> getSessions() {
		return sessions;
	}

	public void setSessions(ArrayList<Session> sessions) {
		this.sessions = sessions;
	}

	public ArrayList<Assignment> getAssessments() {
		return assignments;
	}

	public void setAssessments(ArrayList<Assignment> assignments) {
		this.assignments = assignments;
	}

	public boolean isHasExams() {
		return hasExams;
	}

	public void setHasExams(boolean hasExams) {
		this.hasExams = hasExams;
	}

	public boolean isHasAttendenceMonitoring() {
		return hasAttendenceMonitoring;
	}

	public void setHasAttendenceMonitoring(boolean hasAttendenceMonitoring) {
		this.hasAttendenceMonitoring = hasAttendenceMonitoring;
	}
	
	public boolean equals(Course course)
	{
		return this.courseId == course.courseId;
	}
	
	
	
	

}
