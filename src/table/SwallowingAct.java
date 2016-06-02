package table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*CREATE TABLE swallowingact(id integer PRIMARY KEY,
 *  value1 boolean,
 *  value2 boolean);*/

@Entity
@Table(name = "swallowingact")

public class SwallowingAct {
	@Id	
	 @Column(name = "id")
	 @GeneratedValue(strategy= GenerationType.AUTO)
		private int id;	
	 @Column(name = "value1")
	 	private boolean value1;
	 @Column(name = "value2")
	 	private boolean value2;
	
}
