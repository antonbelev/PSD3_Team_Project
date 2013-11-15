package session;

import java.util.ArrayList;
import java.util.HashMap;

import roles.Student;

public abstract class Session {
	
	public enum AttendanceEnum
	{
		PRESENT("present"), MV("mv"), ABSENT("absent");
		
		private AttendanceEnum(final String text) {
	        this.text = text;
	    }
		private final String text;
	    @Override
	    public String toString() {
	        return text;
	    }
	}
	
	private Course course;
	private TimeStamp sessionTime;
	//private ArrayList<Student> students;
	//private AttendanceEnum attendance;
	private HashMap<Student, AttendanceEnum> studentAttendance;
	
	private String sessionName;
	
	private String location;
	private int minCapacity;
	private int maxCapacity;
	
	public Session()
	{
		studentAttendance = new HashMap<Student, AttendanceEnum>();
	}

	public Session(Course course, TimeStamp sessionTime,
			ArrayList<Student> students, AttendanceEnum attendance,
			String sessionName, String location, int minCapacity,
			int maxCapacity) {
		super();
		this.course = course;
		this.sessionTime = sessionTime;
		//this.students = students;
		//this.attendance = attendance;
		this.sessionName = sessionName;
		this.location = location;
		this.minCapacity = minCapacity;
		this.maxCapacity = maxCapacity;
	}	

	public HashMap<Student, AttendanceEnum> getStudentAttendance() {
		return studentAttendance;
	}

	public void setStudentAttendance(
			HashMap<Student, AttendanceEnum> studentAttendance) {
		this.studentAttendance = studentAttendance;
	}

	public String getSessionName() {
		return sessionName;
	}

	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}

	/*public AttendanceEnum getAttendance() {
		return attendance;
	}

	public void setAttendance(AttendanceEnum attendance) {
		this.attendance = attendance;
	}
	
	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}*/

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public TimeStamp getSessionTime() {
		return sessionTime;
	}

	public void setSessionTime(TimeStamp sessionTime) {
		this.sessionTime = sessionTime;
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

	
	
	
	
	
	

}
