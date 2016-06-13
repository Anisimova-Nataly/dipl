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

/*CREATE TABLE caller(id integer PRIMARY KEY, surname text, name text, otchestvo text);*/

@Entity
@Table(name = "caller")

public class Caller {
	private PhoneConsultationsJournal phoneConsultationsJournal;
	@Id	
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id")
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="surname")
	private String surname;
	@Column(name="name")
	private String name;
	@Column(name="otchestvo")
	private String otchestvo;
	@OneToOne(mappedBy="caller")
	public PhoneConsultationsJournal getPhoneConsultationsJournal() {
		return phoneConsultationsJournal;
	}
	public void setPhoneConsultationsJournal(PhoneConsultationsJournal phoneConsultationsJournal) {
		this.phoneConsultationsJournal = phoneConsultationsJournal;
	}
}
