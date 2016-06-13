package table;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import javax.persistence.*;


/*
CREATE TABLE phoneconsultationsjournal(id integer PRIMARY KEY,
 consultationresultid integer REFERENCES consultationresult(id),
 callerid integer REFERENCES caller(id), specialistid integer REFERENCES specialist(id),
  cardid integer REFERENCES card(id),
  reason text, date date, UNIQUE(consultationresultid, callerid, specialistid, cardid));
*/
@Entity
@Table(name = "phoneconsultationsjournal")


public class PhoneConsultationsJournal{
	private PhoneConsultationsJournal phoneConsultationsJournal;
	private List <Card> cards;
 @Id	
 @Column(name = "id")
 @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
 @Column(name = "consultationresultid")
	private int consultationResultId;
 @Column(name = "callerid")
	private int callerid;
 @Column(name = "specialistid")
	private int specialistid;
 @Column(name = "cardid")
	private int cardid; 
 @Column(name = "date")
	private Date	date; 
 @Column(name = "reason")
	private String	reason;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getConsultationResultId() {
	return consultationResultId;
}
public void setConsultationResultId(int consultationResultId) {
	this.consultationResultId = consultationResultId;
}
public int getCallerid() {
	return callerid;
}
public void setCallerid(int callerid) {
	this.callerid = callerid;
}
public int getSpecialistid() {
	return specialistid;
}
public void setSpecialistid(int specialistid) {
	this.specialistid = specialistid;
}
public int getCardid() {
	return cardid;
}
public void setCardid(int cardid) {
	this.cardid = cardid;
}
public Date getDate() {
	return date;
}
public void setDate() {
	java.util.Calendar cal = Calendar.getInstance();
	java.util.Date utilDate = new java.util.Date(); // your util date
	cal.setTime(utilDate);
	cal.set(Calendar.HOUR_OF_DAY, 0);
	cal.set(Calendar.MINUTE, 0);
	cal.set(Calendar.SECOND, 0);
	cal.set(Calendar.MILLISECOND, 0);    

	this.date =  new java.sql.Date(cal.getTime().getTime());
}
public void setDate(Date date) {
	this.date = date;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
} 
@OneToMany(targetEntity=Card.class, mappedBy="card", cascade=CascadeType.ALL,
fetch=FetchType.LAZY)
public List <Card> getCards(){
return cards;
}
public void setCards(List<Card> cards){
this.cards = cards;
}	
@OneToOne(mappedBy="caller")
public PhoneConsultationsJournal getPhoneConsultationsJournalCaller() {
	return phoneConsultationsJournal;
}
public void setPhoneConsultationsJournalCaller(PhoneConsultationsJournal phoneConsultationsJournal) {
	this.phoneConsultationsJournal = phoneConsultationsJournal;
}
@ManyToOne
@JoinColumn(name="cardid")
public PhoneConsultationsJournal getPhoneConsultationsJournal(){
	return phoneConsultationsJournal;
}
public void setPhoneConsultationsJournal(PhoneConsultationsJournal phoneConsultationsJournal){
	this.phoneConsultationsJournal = phoneConsultationsJournal;	
}
}