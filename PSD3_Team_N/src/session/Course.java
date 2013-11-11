package session;

import java.util.ArrayList;
import java.util.Date;

import roles.Lecturer;
import assignments.Assignment;

public class Course {
	
	private String name;
	private Lecturer lecturer;
	private Date startDate;
	private Date endDate;
	private String courseLevel;
	private int credits;
	
	private ArrayList<Session> sessions;
	private ArrayList<Assignment> assignments;
	private boolean hasExams;
	private boolean hasAttendenceMonitoring;
	
	public Course(String name, Lecturer lecturer, Date startDate, Date endDate,
			String courseLevel, int credits, ArrayList<Session> sessions,
			ArrayList<Assignment> assignments, boolean hasExams, boolean hasAttendenceMonitoring) {
		super();
		this.name = name;
		this.lecturer = lecturer;
		this.startDate = startDate;
		this.endDate = endDate;
		this.courseLevel = courseLevel;
		this.credits = credits;
		this.sessions = sessions;
		this.assignments = assignments;
		this.hasExams = hasExams;
		this.hasAttendenceMonitoring = hasAttendenceMonitoring;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	
	
	

}
