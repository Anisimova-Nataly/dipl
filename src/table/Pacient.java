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
	 	private boolean relationdegree;
	 @Column(name = "phonenumber")
	 	private java.math.BigInteger phonenumber;
	 @Column(name = "livingwith")
	 	private String livingwith;
	 @Column(name = "maritalstatus")
	 	private String maritalstatus;
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
	
}
