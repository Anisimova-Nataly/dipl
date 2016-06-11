package table;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/*CREATE TABLE pacient(id integer PRIMARY KEY, contactid integer REFERENCES contact(id),
 *  addresid integer REFERENCES addres(id), surname text, name text, otchestvo text, birthdate date,
 *   sex text, phonenumber bigint,
 *   livingwith text, maritalstatus text, socialpackage boolean, diagnosis text, metastasis text,
 *    otherdiseases text, familytree text, diseasehistory text, operations text, xt text,
 *  lt text, research text, UNIQUE(contactid, addresid));*/

public class Pacient {
	private List <Address> addresses;
	private List <Contact> contacts;
	private Pacient pacient;
	@OneToOne(mappedBy="pacient")
	public Pacient getPacient() {
		return pacient;
	}
	public void setPacient(Pacient pacient) {
		this.pacient = pacient;
	}
	
	@Id	
	 @Column(name = "id")
	 @GeneratedValue(strategy= GenerationType.AUTO)
		private int id;	
	 @Column(name = "surname")
	 	private String surname;
	 @Column(name = "name")
	 	private String name;
	 @Column(name = "otchestvo")
	 	private String otchestvo;
	 @Column(name = "birthdate")
	 	private java.util.Date birthdate;
	 @Column(name = "sex")
	 	private String sex;
	 @Column(name = "phonenumber")
	 	private java.math.BigInteger phonenumber;
	 @Column(name = "livingwith")
	 	private String livingwith;
	 @Column(name = "maritalstatus")
	 	private String maritalstatus;
	 @Column(name = "socialpackage")
	 	private boolean socialpackage;
	 @Column(name = "otherdiseases")
	 	private String otherdiseases;
	 @Column(name = "familytree")
	 	private String familytree;
	 @Column(name = "diseasehistory")
	 	private String diseasehistory;
	 @Column(name = "operations")
	 	private String operations;
	 @Column(name = "xt")
	 	private String xt;
	 @Column(name = "lt")
	 	private String lt;
	 @Column(name = "research")
	 	private String research;
	 @OneToMany(targetEntity=Address.class, mappedBy="address", cascade=CascadeType.ALL,
			fetch=FetchType.LAZY)
		public List <Address> getAddresses(){
			return addresses;
		}
		public void setAddresses(List<Address> address){
			this.addresses = addresses;
		}
	@OneToMany(targetEntity=Contact.class, mappedBy="contact", cascade=CascadeType.ALL,
				fetch=FetchType.LAZY)
		public List <Contact> getContacts(){
			return contacts;
		}
		public void setContacts(List<Contact> contact){
			this.contacts = contacts;
		}
	@ManyToOne
	@JoinColumn(name="heavynarcoticjournal")
	public Pacient getPacient1(){
		return pacient;
	}
	public void setPacient1(Pacient pacient){
		this.pacient = pacient;	
	}
	@ManyToOne
	@JoinColumn(name="clinic")
	public Pacient getPacient2(){
		return pacient;
	}
	public void setPacient2(Pacient pacient){
		this.pacient = pacient;	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOtchestvo() {
		return otchestvo;
	}
	public void setOtchestvo(String otchestvo) {
		this.otchestvo = otchestvo;
	}
	public java.util.Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(java.util.Date birthdate) {
		this.birthdate = birthdate;
	}
	public java.math.BigInteger getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(java.math.BigInteger phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getLivingwith() {
		return livingwith;
	}
	public void setLivingwith(String livingwith) {
		this.livingwith = livingwith;
	}
	public String getMaritalstatus() {
		return maritalstatus;
	}
	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}
	public String getOtherdiseases() {
		return otherdiseases;
	}
	public void setOtherdiseases(String otherdiseases) {
		this.otherdiseases = otherdiseases;
	}
	public String getFamilytree() {
		return familytree;
	}
	public void setFamilytree(String familytree) {
		this.familytree = familytree;
	}
	public String getDiseasehistory() {
		return diseasehistory;
	}
	public void setDiseasehistory(String diseasehistory) {
		this.diseasehistory = diseasehistory;
	}
	public String getOperations() {
		return operations;
	}
	public void setOperations(String operations) {
		this.operations = operations;
	}
	public String getXt() {
		return xt;
	}
	public void setXt(String xt) {
		this.xt = xt;
	}
	public String getLt() {
		return lt;
	}
	public void setLt(String lt) {
		this.lt = lt;
	}
	public String getResearch() {
		return research;
	}
	public void setResearch(String research) {
		this.research = research;
	}
	public boolean isSocialpackage() {
		return socialpackage;
	}
	public void setSocialpackage(boolean socialpackage) {
		this.socialpackage = socialpackage;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
