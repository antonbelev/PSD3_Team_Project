package assignments;

import java.util.Date;

import session.Course;

public abstract class Assignment {
	
	private Date deadline;
	private String feedback;
	private Course course;
	private double weight;
	private double mark;
	
	
	public Assignment(Date deadline, String feedback, Course course,
			double weight, double mark) {
		super();
		this.deadline = deadline;
		this.feedback = feedback;
		this.course = course;
		this.weight = weight;
		this.mark = mark;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	
	
	

	
}
