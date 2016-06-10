package table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*CREATE TABLE position(id integer PRIMARY KEY, 
 * value text);*/

@Entity
@Table(name = "position")

public class Position {
	private Specialist specialist;
	
	@Id	
	 @Column(name = "id")
	 @GeneratedValue(strategy= GenerationType.AUTO)
		private int id;	
	 @Column(name = "value")
	 	private String value;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@ManyToOne
	@JoinColumn(name="specialistid")
	public Specialist getSpecialist() {
		return specialist;
	}
	public void setSpecialist(Specialist specialist) {
		this.specialist = specialist;
	}
}
