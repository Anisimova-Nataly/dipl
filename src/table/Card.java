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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

/*CREATE TABLE card(id integer PRIMARY KEY,
 *  listosmotraid integer REFERENCES listosmotra(id),
 *   pacientid integer REFERENCES pacient(id),
 *    datereferral date,
 *     phonecontact bigint,
 *      firstvisit date,
 *       reasondesease text, date date,
 *  signature text,
 *  UNIQUE(listosmotraid));*/

@Entity
@Table(name = "card")

public class Card {
	//private List <Specialist> specialists;
//	private Card card;
	private Pacient pacient;
	private List <ListOsmotra> listOsmotras;
	private List <Exit> exits;
	private List <JournalOutpatientReception> journalOutpatientReceptions;
	private List <CallPlanningJournal> callPlanningJournals;
	private List <PhoneConsultationsJournal> phoneConsultationsJournals;
	@Id	
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "id")
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name = "datereferral")
 	private java.util.Date datereferral;
	@Column(name = "phonecontact")
 	private java.math.BigInteger phonecontact;
	@Column(name = "firstvisit")
 	private java.util.Date firstvisit;
	@Column(name = "reasondesease")
 	private String reasondesease;
	@Column(name = "date")
 	private java.util.Date date;
	@Column(name = "signature")
 	private String signature;
	
	@OneToMany(targetEntity=Exit.class, mappedBy="exit", cascade=CascadeType.ALL,
			fetch=FetchType.LAZY)
	public List <Exit> getExits(){
		return exits;
	}
	public void setExits(List<Exit> exits){
		this.exits = exits;
	}
	public java.util.Date getDatereferral() {
		return datereferral;
	}
	public void setDatereferral(java.util.Date datereferral) {
		this.datereferral = datereferral;
	}
	public java.math.BigInteger getPhonecontact() {
		return phonecontact;
	}
	public void setPhonecontact(java.math.BigInteger phonecontact) {
		this.phonecontact = phonecontact;
	}
	public java.util.Date getFirstvisit() {
		return firstvisit;
	}
	public void setFirstvisit(java.util.Date firstvisit) {
		this.firstvisit = firstvisit;
	}
	public String getReasondesease() {
		return reasondesease;
	}
	public void setReasondesease(String reasondesease) {
		this.reasondesease = reasondesease;
	}
	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}	
	@OneToMany(targetEntity=PhoneConsultationsJournal.class, mappedBy="phoneconsultationsjournal", cascade=CascadeType.ALL,
			fetch=FetchType.LAZY)
	public List <PhoneConsultationsJournal> getJPhoneConsultationsJournals(){
		return phoneConsultationsJournals;
	}
	public void setPhoneConsultationsJournals(List<PhoneConsultationsJournal> phoneConsultationsJournals){
		this.phoneConsultationsJournals = phoneConsultationsJournals;
	}
	@OneToMany(targetEntity=CallPlanningJournal.class, mappedBy="callplanningjournal", cascade=CascadeType.ALL,
			fetch=FetchType.LAZY)
	public List <CallPlanningJournal> getJCallPlanningJournals(){
		return callPlanningJournals;
	}
	public void setJCallPlanningJournals(List<CallPlanningJournal> callPlanningJournals){
		this.callPlanningJournals = callPlanningJournals;
	}
	@OneToMany(targetEntity=JournalOutpatientReception.class, mappedBy="journaloutpatientreception", cascade=CascadeType.ALL,
			fetch=FetchType.LAZY)
	public List <JournalOutpatientReception> getJournalOutpatientReceptions(){
		return journalOutpatientReceptions;
	}
	public void setJournalOutpatientReceptions(List<JournalOutpatientReception> journalOutpatientReceptions){
		this.journalOutpatientReceptions = journalOutpatientReceptions;
	}
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="pacientid") 
	public Pacient getPacient() {
		return pacient;
	}
	public void setPacient(Pacient pacient) {
		this.pacient = pacient;
	}
	@OneToMany(targetEntity=ListOsmotra.class, mappedBy="cardid", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	public List <ListOsmotra> getListOsmotras(){
		return listOsmotras;
	}
	public void setListOsmotras(List <ListOsmotra> listOsmotras){
		this.listOsmotras = listOsmotras;
	}
}
