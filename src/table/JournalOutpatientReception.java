package table;

import java.util.List;

import javax.persistence.CascadeType;
//import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*CREATE TABLE journaloutpatientreception(id integer PRIMARY KEY,
 *  cardid integer REFERENCES card(id), 
 *  specialistid integer REFERENCES specialist(id), 
 *  number integer, 
 *  inspectiondatetime timestamp with time zone, 
 *  contentrenderedservices text, 
 *  UNIQUE(cardid, specialistid));*/

@Entity
@Table(name = "journaloutpatientreception")


public class JournalOutpatientReception {
	private JournalOutpatientReception journalOutpatientReception;
	@Id	
	 @Column(name = "id")
	 @GeneratedValue(strategy= GenerationType.AUTO)
		private int id;	
	 @Column(name = "number")
	 	private int number;
	 @Column(name = "inspectiondatetime")
	 	private java.sql.Timestamp inspectionDateTime;
	 @Column(name = "contentrenderedservices")
	 	private String contentRenderedServices;
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
	public java.sql.Timestamp getInspectionDateTime() {
		return inspectionDateTime;
	}
	public void setInspectionDateTime(java.sql.Timestamp inspectionDateTime) {
		this.inspectionDateTime = inspectionDateTime;
	}
	public String getContentRenderedServices() {
		return contentRenderedServices;
	}
	public void setContentRenderedServices(String contentRenderedServices) {
		this.contentRenderedServices = contentRenderedServices;
	}
	@ManyToOne
	@JoinColumn(name="specialistid")
	public JournalOutpatientReception getJournalOutpatientReceptionspecialistid(){
		return journalOutpatientReception;
	}
	public void setJournalOutpatientReceptionspecialistid(JournalOutpatientReception journalOutpatientReception){
		this.journalOutpatientReception = journalOutpatientReception;	
	}
	@ManyToOne
	@JoinColumn(name="cardid")
	public JournalOutpatientReception getJournalOutpatientReception(){
		return journalOutpatientReception;
	}
	public void setJournalOutpatientReception(JournalOutpatientReception journalOutpatientReception){
		this.journalOutpatientReception = journalOutpatientReception;	
	}
}
