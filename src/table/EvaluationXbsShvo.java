package table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*CREATE TABLE evaluationxbsshvo(id integer PRIMARY KEY,
 *  value1 boolean, 
 *  value2 smallint);*/

@Entity
@Table(name = "evaluationxbsshvo")

public class EvaluationXbsShvo {
	@Id	
	 @Column(name = "id")
	 @GeneratedValue(strategy= GenerationType.AUTO)
		private int id;	
	 @Column(name = "value1")
	 	private boolean value1;
	 @Column(name = "value2")
	 	private short value2;
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
	public short getValue2() {
		return value2;
	}
	public void setValue2(short value2) {
		this.value2 = value2;
	}

}
