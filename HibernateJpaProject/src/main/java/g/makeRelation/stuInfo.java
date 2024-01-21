package g.makeRelation;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class stuInfo {
	
	@Id
	@Column
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int roll;
	
	@OneToOne
	private stuIdCard card;
	 
	@Column
	private String name;
   
	@OneToMany(mappedBy="student")
	private List<course> courseList;
	public List<course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<course> courseList) {
		this.courseList = courseList;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public stuIdCard getCard() {
		return card;
	}

	public void setCard(stuIdCard card) {
		this.card = card;
	}
	
	@Override
	public String toString() {
		return this.getRoll()+" "+ this.getName()+" "+this.getCard().getCardno()+" "+this.getCard().getSoftwarevirsion();
		
	}

}
