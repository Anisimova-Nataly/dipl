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

/*CREATE TABLE clinic(id integer PRIMARY KEY, pacientid integer REFERENCES pacient(id),
 *  addresid integer REFERENCES addres(id), number text, UNIQUE (pacientid));*/

@Entity
@Table(name = "clinic")

public class Clinic {
	private Clinic clinic;
	private List <Pacient> pacients;
	private List <Specialist> specialists; 
	@Id	
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id")
	private Integer id;
	@Column(name = "number")
	private String number;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="clinicid") 
	public Clinic getClinic() {
		return clinic;
	}
	public void setClinic(Clinic clinic) {
		this.clinic = clinic;
	}
	@OneToMany(targetEntity=Pacient.class, mappedBy="pacient", cascade=CascadeType.ALL,
			fetch=FetchType.LAZY)
	public List <Pacient> getPacients(){
		return pacients;
	}
	public void setPacients(List<Pacient> pacients){
		this.pacients = pacients;
	}
	@OneToMany(targetEntity=Specialist.class, mappedBy="specialist", cascade=CascadeType.ALL,
			fetch=FetchType.LAZY)
	public List <Specialist> getSpecialists(){
		return specialists;
	}
	public void setSpecialists(List<Specialist> specialists){
		this.specialists = specialists;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}
