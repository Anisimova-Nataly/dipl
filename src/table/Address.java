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

/*CREATE TABLE address(id integer PRIMARY KEY, region text, city text, district text,
 *  street text, house integer, corps integer, flat integer);*/

@Entity
@Table(name = "address")

public class Address {
	private Address address;
	private Pacient pacient;
	private Clinic clinic;
	@Id	
	 @Column(name = "id")
	 @GeneratedValue(strategy= GenerationType.AUTO)
		private int id;	
	 @Column(name = "region")
	 	private String region;
	 @Column(name = "city")
	 	private String city;
	 @Column(name = "district")
	 	private String district;
	 @Column(name = "street")
	 	private String street;
	 @Column(name = "house")
	 	private String house;
	 @Column(name = "corps")
	 	private String corps;
	 @Column(name = "flat")
	 	private int flat;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public String getCorps() {
		return corps;
	}
	public void setCorps(String corps) {
		this.corps = corps;
	}
	public int getFlat() {
		return flat;
	}
	public void setFlat(int flat) {
		this.flat = flat;
	}
	@ManyToOne
	@JoinColumn(name="pacientid")
	public Address getAddress(){
		return address;
	}
	public void setAddress(Address address){
		this.address = address;	
	}
	public Pacient getPacient() {
		return pacient;
	}
	public void setPacient(Pacient pacient) {
		this.pacient = pacient;
	}
	@OneToOne(mappedBy="address")
	public Clinic getClinic() {
		return clinic;
	}
	public void setClinic(Clinic clinic) {
		this.clinic = clinic;
	}
}
