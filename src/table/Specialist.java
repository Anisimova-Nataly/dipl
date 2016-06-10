package table;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*CREATE TABLE specialist(id integer PRIMARY KEY, 
 * positionid integer REFERENCES position(id), 
 * value1 text, 
 * value2 text, 
 * value3 text, 
 * value4 bigint, 
 * UNIQUE (positionid));*/

@Entity
@Table(name = "specialist")

public class Specialist {
	private List <Position> positions;
	
	@Id	
	 @Column(name = "id")
	 @GeneratedValue(strategy= GenerationType.AUTO)
		private int id;	
	 @Column(name = "value1")
	 	private String value1;
	 @Column(name = "value2")
	 	private String value2;
	 @Column(name = "value3")
	 	private String value3;
	 @Column(name = "value4")
	 	private long value4;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getValue1() {
		return value1;
	}
	public void setValue1(String value1) {
		this.value1 = value1;
	}
	public String getValue2() {
		return value2;
	}
	public void setValue2(String value2) {
		this.value2 = value2;
	}
	public String getValue3() {
		return value3;
	}
	public void setValue3(String value3) {
		this.value3 = value3;
	}
	public long getValue4() {
		return value4;
	}
	public void setValue4(long value4) {
		this.value4 = value4;
	}
	@OneToMany(targetEntity=Position.class, mappedBy="position", cascade=CascadeType.ALL,
		fetch=FetchType.LAZY)
		public List <Position> getPositions(){
			return positions;
		}
		public void setPositions(List<Position> positions){
			this.positions = positions;
		}
}
