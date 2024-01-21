package g.makeRelation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class stuIdCard {
	

	@Id
	@Column
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int cardno ;
	
	@Column
	private String softwarevirsion;
	
	@OneToOne(mappedBy = "card")
	private stuInfo student;
	
	public int getCardno() {
		return cardno;
	}

	public void setCardno(int cardno) {
		this.cardno = cardno;
	}

	public String getSoftwarevirsion() {
		return softwarevirsion;
	}

	public void setSoftwarevirsion(String softwarevirsion) {
		this.softwarevirsion = softwarevirsion;
	}

	public stuInfo getStudent() {
		return student;
	}

	public void setStudent(stuInfo student) {
		this.student = student;
	}


}
