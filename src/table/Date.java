package table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*CREATE TABLE date(id integer PRIMARY KEY, previousactivevisit date, call date);*/

@Entity
@Table(name = "date")

public class Date {
	private Date date;
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
	@Column(name="previousactivevisit")
	private java.util.Date previousactivevisit;
	public java.util.Date getPreviousactivevisit() {
		return previousactivevisit;
	}
	public void setPreviousactivevisit(java.util.Date previousactivevisit) {
		this.previousactivevisit = previousactivevisit;
	}
	@ManyToOne
	@JoinColumn(name="callplanningjournalid")
	public Date getDate(){
		return date;
	}
	public void setDate(Date date){
		this.date = date;	
	}
}
