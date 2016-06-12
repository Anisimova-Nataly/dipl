package table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*CREATE TABLE manipulation(id integer PRIMARY KEY, datetime timestamp with time zone,
 *  result text, diagnosisafter text);*/

@Entity
@Table(name = "manipulation")

public class Manipulation {
	private Manipulation manipulation;
	@Id	
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id")
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	 @Column(name = "datetime")
	 private java.sql.Timestamp datetime;
	 @Column(name = "result")
	 private String result;
	 @Column(name = "diagnosisafter")
	 private String diagnosisafter;
	 @ManyToOne
		@JoinColumn(name="therapeuticdiagnosticmanipulationsjournalid")
	public Manipulation getManipulation(){
		return manipulation;
	}
	public void setManipulation(Manipulation manipulation){
		this.manipulation = manipulation;	
	}
}
