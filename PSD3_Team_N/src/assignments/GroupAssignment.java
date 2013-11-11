package assignments;

import java.util.ArrayList;
import java.util.Date;

import roles.Student;
import session.Course;

public class GroupAssignment extends Assignment {
	
	private ArrayList<Student> students;

	public GroupAssignment(Date deadline, String feedback, Course course,
			double weight, double mark) {
		super(deadline, feedback, course, weight, mark);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	

}
