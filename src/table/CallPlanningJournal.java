package table;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/*CREATE TABLE callplanningjournal(id integer PRIMARY KEY, 
 * scheduleid integer REFERENCES schedule(id),
 *  exitid integer REFERENCES exit(id), 
 *  dateid integer REFERENCES date(id), 
 *  cardid integer REFERENCES card(id), 
 *  number integer, 
 *  tyazestid integer REFERENCES tyazest(id), 
 *  consultationresultid integer REFERENCES consultationresult(id), 
 *  UNIQUE(scheduleid, exitid, dateid, cardid));*/

@Entity
@Table(name = "callplanningjournal")

public class CallPlanningJournal {
	private CallPlanningJournal callPlanningJournal;
	private List <Card> cards;
	private List <Date> dates;
	private List <Exit> exits;
	@Id	
	 @Column(name = "id")
	 @GeneratedValue(strategy= GenerationType.AUTO)
		private int id;	
	 @Column(name = "number")
	 	private int number;
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
	 @OneToMany(targetEntity=Card.class, mappedBy="card", cascade=CascadeType.ALL,
			fetch=FetchType.LAZY)
	 public List <Card> getCards(){
		return cards;
	}
	 public void setCards(List<Card> cards){
		this.cards = cards;
	}
	 @OneToMany(targetEntity=Date.class, mappedBy="date", cascade=CascadeType.ALL,
			fetch=FetchType.LAZY)
	 public List <Date> getDates(){
		return dates;
	}
	 public void setDates(List<Date> dates){
		this.dates = dates;
	} 
	@OneToMany(targetEntity=Exit.class, mappedBy="exit", cascade=CascadeType.ALL,
		fetch=FetchType.LAZY)
	public List <Exit> getExit(){
		return exits;
	}
	public void setExits(List<Exit> exits){
		this.exits = exits;
	}
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="consultationresultid") 
	public CallPlanningJournal getCallPlanningJournalconsultationresultid() {
		return callPlanningJournal;
	}
	public void setCallPlanningJournalconsultationresultid(CallPlanningJournal callPlanningJournal) {
		this.callPlanningJournal = callPlanningJournal;
	}	 
	@ManyToOne
	@JoinColumn(name="cardid")
	public CallPlanningJournal getCallPlanningJournal(){
		return callPlanningJournal;
	}
	public void setCallPlanningJournal(CallPlanningJournal callPlanningJournal){
		this.callPlanningJournal = callPlanningJournal;	
	}
}