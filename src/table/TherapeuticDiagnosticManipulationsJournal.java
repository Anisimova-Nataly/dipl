package table;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "therapeuticdiagnosticmanipulationsjournal")

/*CREATE TABLE therapeuticdiagnosticmanipulationsjournal(id integer PRIMARY KEY, 
 * cardid integer REFERENCES card(id), 
 * manipulationid integer REFERENCES manipulation(id),
 *  number integer, complication text,
 *   observationmethod boolean,
 *    UNIQUE(cardid, manipulationid));*/

public class TherapeuticDiagnosticManipulationsJournal {
	private Manipulation manipulation;
	@Id	
	 @Column(name = "id")
	 @GeneratedValue(strategy= GenerationType.AUTO)
		private int id;	
	 @Column(name = "number")
	 	private int number;
	 @Column(name = "complication")
	 	private String complication;
	 @Column(name = "observationmethod")
	 	private String observationmethod;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getComplication() {
		return complication;
	}
	public void setComplication(String complication) {
		this.complication = complication;
	}
	public String getObservationmethod() {
		return observationmethod;
	}
	public void setObservationmethod(String observationmethod) {
		this.observationmethod = observationmethod;
	}
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="manipulationid") 
	public Manipulation getManipulation() {
		return manipulation;
	}
	public void setManipulation(Manipulation manipulation) {
		this.manipulation = manipulation;
	}	 
}
