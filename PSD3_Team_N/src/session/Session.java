package session;

import java.util.ArrayList;

import roles.Student;

public abstract class Session {
	
	private Course course;
	private ArrayList<TimeStamp> sessionTimes;
	private ArrayList<Student> students;
	
	private String location;
	private int minCapacity;
	private int maxCapacity;


	public Session(Course course, ArrayList<TimeStamp> sessionTimes,
			ArrayList<Student> students, String location, int minCapacity,
			int maxCapacity) {
		super();
		this.course = course;
		this.sessionTimes = sessionTimes;
		this.students = students;
		this.location = location;
		this.minCapacity = minCapacity;
		this.maxCapacity = maxCapacity;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public ArrayList<TimeStamp> getSessionTimes() {
		return sessionTimes;
	}

	public void setSessionTimes(ArrayList<TimeStamp> sessionTimes) {
		this.sessionTimes = sessionTimes;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getMinCapacity() {
		return minCapacity;
	}

	public void setMinCapacity(int minCapacity) {
		this.minCapacity = minCapacity;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	
	
	
	

}
