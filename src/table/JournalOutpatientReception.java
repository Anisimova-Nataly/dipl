package table;

//import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*CREATE TABLE journaloutpatientreception(id integer PRIMARY KEY,
 *  cardid integer REFERENCES card(id), 
 *  specialistid integer REFERENCES specialist(id), 
 *  number integer, 
 *  inspectiondatetime timestamp with time zone, 
 *  contentrenderedservices text, 
 *  UNIQUE(cardid, specialistid));*/

@Entity
@Table(name = "journaloutpatientreception")


public class JournalOutpatientReception {
	@Id	
	 @Column(name = "id")
	 @GeneratedValue(strategy= GenerationType.AUTO)
		private int id;	
	 @Column(name = "number")
	 	private int number;
	 @Column(name = "inspectiondatetime")
	 	private java.sql.Timestamp inspectionDateTime;
	 @Column(name = "contentrenderedservices")
	 	private String contentRenderedServices;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public java.sql.Timestamp getInspectionDateTime() {
		return inspectionDateTime;
	}
	public void setInspectionDateTime(java.sql.Timestamp inspectionDateTime) {
		this.inspectionDateTime = inspectionDateTime;
	}
	public String getContentRenderedServices() {
		return contentRenderedServices;
	}
	public void setContentRenderedServices(String contentRenderedServices) {
		this.contentRenderedServices = contentRenderedServices;
	}
}
