
/*Связь с pacient будет позже!*/


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
	private Card cardid;
	private List <ListOsmotra> listOsmotras;
	
	@Id	
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id")
	public Card getcardId() {
		return cardid;
	}
	public void setliverId(int id) {
		this.cardid = cardid;
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
	
	
	
	@OneToMany(targetEntity=ListOsmotra.class, mappedBy="listOsmotra", cascade=CascadeType.ALL,
	fetch=FetchType.LAZY)
	public List <ListOsmotra> getListOsmotras(){
		return listOsmotras;
	}
	public void setListOsmotras(List<ListOsmotra> listOsmotras){
		this.listOsmotras = listOsmotras;
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
	
}
