package table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*CREATE TABLE heavynarcoticjournal(id integer PRIMARY KEY,
 *  pacientid integer REFERENCES pacient(id),
 *   appoitmentneinvformid integer REFERENCES appoitmentneinvform(id),
 *    appoitmentinvformid integer REFERENCES appoitmentinvform(id),
 *     appoitmenttramadolid integer REFERENCES appoitmenttramadol(id),
 *      listosmotraid integer REFERENCES listosmotra(id),
 *       value1 integer,
 *        value2 date,
 *         value3 text,
 *          UNIQUE(pacientid, appoitmentneinvformid, appoitmentinvformid, appoitmenttramadolid, listosmotraid));*/

@Entity
@Table(name = "heavynarcoticjournal")


public class HeavyNarcoticJournal {
	@Id	
	 @Column(name = "id")
	 @GeneratedValue(strategy= GenerationType.AUTO)
		private int id;	
	 @Column(name = "value1")
	 	private int value1;
	 @Column(name = "value2")
	 	private java.sql.Date value2;
	 @Column(name = "value3")
	 	private String value3;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getValue1() {
		return value1;
	}
	public void setValue1(int value1) {
		this.value1 = value1;
	}
	public java.sql.Date getValue2() {
		return value2;
	}
	public void setValue2(java.sql.Date value2) {
		this.value2 = value2;
	}
	public String getValue3() {
		return value3;
	}
	public void setValue3(String value3) {
		this.value3 = value3;
	}	 
}
