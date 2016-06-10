package table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*CREATE TABLE contact(id integer PRIMARY KEY, surname text, name text,
 *  otchestvo text, phonenumber bigint, relationdegree text);*/

@Entity
@Table(name = "contact")


public class Contact {
	private Contact contact;
	private Pacient pacient;
	
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
	 @Column(name = "phonenumber")
	 	private java.math.BigInteger phonenumber;
	 @Column(name = "relationdegree")
	 	private String relationdegree;
	 @ManyToOne
		@JoinColumn(name="pacientid")
	public Contact getContact(){
		return contact;
	}
	public void setContact(Contact contact){
		this.contact = contact;	
	}
	public Pacient getPacient() {
		return pacient;
	}
	public void setPacient(Pacient pacient) {
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
	public java.math.BigInteger getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(java.math.BigInteger phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getRelationdegree() {
		return relationdegree;
	}
	public void setRelationdegree(String relationdegree) {
		this.relationdegree = relationdegree;
	}

}
