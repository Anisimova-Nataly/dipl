package table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/*CREATE TABLE callplanningjournal(id integer PRIMARY KEY, 
 * scheduleid integer REFERENCES schedule(id),
 *  exitid integer REFERENCES exit(id), 
 *  dateid integer REFERENCES date(id), 
 *  cardid integer REFERENCES card(id), 
 *  number integer, 
 *  tyazestid integer REFERENCES tyazest(id), 
 *  consultationresultid integer REFERENCES consultationresult(id), 
 *  UNIQUE(scheduleid, exitid, dateid, cardid));*/

@Entity
@Table(name = "callplanningjournal")

public class CallPlanningJournal {
	@Id	
	 @Column(name = "id")
	 @GeneratedValue(strategy= GenerationType.AUTO)
		private int id;	
	 @Column(name = "number")
	 	private int number;

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
}