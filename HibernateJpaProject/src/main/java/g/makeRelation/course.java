package g.makeRelation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class course {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int courseid;
	
	private String coursename;
	
	@ManyToOne
	private stuInfo student;

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public stuInfo getStudent() {
		return student;
	}

	public void setStudent(stuInfo student) {
		this.student = student;
	}

}
