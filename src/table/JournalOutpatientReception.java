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
	private List <Specialist> specialists;
	private List <Card> cards;
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
	@OneToMany(targetEntity=Specialist.class, mappedBy="specialist", cascade=CascadeType.ALL,
			fetch=FetchType.LAZY)
	public List <Specialist> getSpecialists(){
		return specialists;
	}
	public void setSpecialists(List<Specialist> specialist){
		this.specialists = specialists;
	}
	@OneToMany(targetEntity=Card.class, mappedBy="card", cascade=CascadeType.ALL,
			fetch=FetchType.LAZY)
	public List <Card> getCards(){
		return cards;
	}
	public void setCards(List<Card> card){
		this.cards = cards;
	}
}
