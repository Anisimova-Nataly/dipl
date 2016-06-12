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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*CREATE TABLE schedule(id integer PRIMARY KEY, exitid integer REFERENCES exit(id),
 *  value1 timestamp with time zone, numbervizov integer, kmperday integer,
 *   date date calldayid integer REFERENCES callday(id), UNIQUE(exitid));*/

@Entity
@Table(name = "schedule")


public class Schedule {
	private Schedule schedule;
	private List <Exit> exits;
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
	@Column(name="numbervizov")
	private Integer numbervizov;
	@Column(name="date")
	private java.util.Date date;
	@Column(name="kmperday")
	private Integer kmperday;
	@OneToOne(mappedBy="callday")
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	public Integer getNumbervizov() {
		return numbervizov;
	}
	public void setNumbervizov(Integer numbervizov) {
		this.numbervizov = numbervizov;
	}
	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	@OneToMany(targetEntity=Exit.class, mappedBy="exit", cascade=CascadeType.ALL,
		fetch=FetchType.LAZY)
	public List <Exit> getExits(){
		return exits;
	}
	public void setExits(List<Exit> exits){
		this.exits = exits;
	}
	public Integer getKmperday() {
		return kmperday;
	}
	public void setKmperday(Integer kmperday) {
		this.kmperday = kmperday;
	}
}
