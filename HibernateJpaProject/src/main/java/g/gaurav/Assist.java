package g.gaurav;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Assist {
    @Id
    @Column
	private int roll;
    @Column
	private String name;
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
	@Override 
	public String toString() {
		return this.getRoll()+" "+ this.getName();
		
	}
}
