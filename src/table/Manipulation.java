package table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*CREATE TABLE manipulation(id integer PRIMARY KEY, datetime timestamp with time zone,
 *  result text, diagnosisafter text);*/

@Entity
@Table(name = "manipulation")

public class Manipulation {
	private TherapeuticDiagnosticManipulationsJournal therapeuticDiagnosticManipulationsJournal;
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
	 @OneToOne(mappedBy="manipulation")
	 public TherapeuticDiagnosticManipulationsJournal getTherapeuticDiagnosticManipulationsJournal() {
		return therapeuticDiagnosticManipulationsJournal;
	}
	public void setTherapeuticDiagnosticManipulationsJournal(TherapeuticDiagnosticManipulationsJournal therapeuticDiagnosticManipulationsJournal) {
		this.therapeuticDiagnosticManipulationsJournal = therapeuticDiagnosticManipulationsJournal;
	}
	public java.sql.Timestamp getDatetime() {
		return datetime;
	}
	public void setDatetime(java.sql.Timestamp datetime) {
		this.datetime = datetime;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getDiagnosisafter() {
		return diagnosisafter;
	}
	public void setDiagnosisafter(String diagnosisafter) {
		this.diagnosisafter = diagnosisafter;
	}
}
