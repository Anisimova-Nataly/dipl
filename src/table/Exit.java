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

@Entity
@Table(name = "exit")

/*CREATE TABLE exit(id integer PRIMARY KEY, specialistid integer REFERENCES specialist(id),
 *  pacientid integer REFERENCES pacient(id), date timestamp with time zone, timeofarrival time,
 *   timeaway interval, traveltime interval, kilometers integer, reasoncall text,
 *    number integer, appointmentnarcotic boolean,
 *     consultationresultid integer REFERENCES cosultationresult(id), UNIQUE(specialistid));*/

public class Exit {
	private ConsultationResult consultationResult;
	private Exit exit;
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
	@Column(name="date")
	private java.util.Date date;
	@Column(name="timeofarrival")
	private java.sql.Time timeofarrival;
	@Column(name="timeaway")
	private java.sql.Timestamp timeaway;
	@Column(name="traveltime")
	private java.sql.Timestamp traveltime;
	@Column(name="kilometers")
	private Integer kilometers;
	@Column(name="reasoncall")
	private String reasoncall;
	@Column(name="number")
	private Integer number;
	@Column(name="appointmentnarcotic")
	private boolean appointmentnarcotic;
	@ManyToOne
	@JoinColumn(name="callplanningjournalid")
	public Exit getExitcallplanningjournalid(){
		return exit;
	}
	public void setExitcallplanningjournalid(Exit exit){
		this.exit = exit;	
	}
	@ManyToOne
	@JoinColumn(name="scheduleid")
	public Exit getExitscheduleid(){
		return exit;
	}
	public void setExitscheduleid(Exit exit){
		this.exit = exit;	
	}
	@OneToOne(mappedBy="exit")
	public ConsultationResult getConsultationResult() {
		return consultationResult;
	}
	public void setConsultationResult(ConsultationResult consultationResult) {
		this.consultationResult = consultationResult;
	}
	@ManyToOne
	@JoinColumn(name="brigadeid")
	public Exit getExitBrigadeid(){
		return exit;
	}
	public void setExitBrigadeid(Exit exit){
		this.exit = exit;	
	}
	@ManyToOne
	@JoinColumn(name="cardid")
	public Exit getExitCardid(){
		return exit;
	}
	public void setExitCardid(Exit exit){
		this.exit = exit;	
	}
}
