package assignments;

import java.util.Date;

import roles.Student;
import session.Course;

public class SingleAssignment extends Assignment {

	private Student student;

	public SingleAssignment(Date deadline, String feedback, Course course,
			double weight, double mark, Student student) {
		super(deadline, feedback, course, weight, mark);
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
}
