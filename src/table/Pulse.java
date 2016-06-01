package table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*CREATE TABLE pulse(id integer PRIMARY KEY,
 *  value1 boolean,
 *  value2 boolean);*/

@Entity
@Table(name = "pulse")

public class Pulse {
	@Id	
	 @Column(name = "id")
	 @GeneratedValue(strategy= GenerationType.AUTO)
		private int id;	
	 @Column(name = "value1")
	 	private boolean value1;
	 @Column(name = "value2")
	 	private boolean value2;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isValue1() {
		return value1;
	}
	public void setValue1(boolean value1) {
		this.value1 = value1;
	}
	public boolean isValue2() {
		return value2;
	}
	public void setValue2(boolean value2) {
		this.value2 = value2;
	}
	
}
