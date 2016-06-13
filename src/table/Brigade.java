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

/*CREATE TABLE brigade(id integer PRIMARY KEY, exitid integer REFERENCES exit(id), number integer,
 *  UNIQUE(exitid));*/

@Entity
@Table(name = "brigade")

public class Brigade {
	private List <Exit> exits; 
	@Id	
	 @Column(name = "id")
	 @GeneratedValue(strategy= GenerationType.AUTO)
		private int id;
	@Column(name =  "number")
	private Integer number;
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	@OneToMany(targetEntity=Exit.class, mappedBy="exit", cascade=CascadeType.ALL,
			fetch=FetchType.LAZY)
	public List <Exit> getExits(){
		return exits;
	}
	public void setExits(List<Exit> exits){
		this.exits = exits;
	}
}
