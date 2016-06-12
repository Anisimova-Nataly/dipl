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

@Entity
@Table(name = "therapeuticdiagnosticmanipulationsjournal")

/*CREATE TABLE therapeuticdiagnosticmanipulationsjournal(id integer PRIMARY KEY, 
 * cardid integer REFERENCES card(id), 
 * manipulationid integer REFERENCES manipulation(id),
 *  number integer, complication text,
 *   observationmethod boolean,
 *    UNIQUE(cardid, manipulationid));*/

public class TherapeuticDiagnosticManipulationsJournal {
	private List <Manipulation> manipulations;
	@Id	
	 @Column(name = "id")
	 @GeneratedValue(strategy= GenerationType.AUTO)
		private int id;	
	 @Column(name = "number")
	 	private int number;
	 @Column(name = "complication")
	 	private String complication;
	 @Column(name = "observationmethod")
	 	private Boolean observationmethod;
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
	public Boolean getObservationmethod() {
		return observationmethod;
	}
	public void setObservationmethod(Boolean observationmethod) {
		this.observationmethod = observationmethod;
	}
	@OneToMany(targetEntity=Manipulation.class, mappedBy="manipulation", cascade=CascadeType.ALL,
			fetch=FetchType.LAZY)
	public List <Manipulation> getManipulations(){
		return manipulations;
	}
	public void setManipulations(List<Manipulation> manipulations){
		this.manipulations = manipulations;
	}
}
