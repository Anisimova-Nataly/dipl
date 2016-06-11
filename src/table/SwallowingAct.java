package table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*CREATE TABLE swallowingact(id integer PRIMARY KEY,
 *  value1 boolean,
 *  value2 boolean);*/

@Entity
@Table(name = "swallowingact")

public class SwallowingAct {
	
	private ListOsmotra listOsmotra;
	
	@OneToOne(mappedBy="swallowingact")
	public ListOsmotra getListOsmotra() {
		return listOsmotra;
	}
	public void setListOsmotra(ListOsmotra listOsmotra) {
		this.listOsmotra = listOsmotra;
	}
	
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
	 @Column(name = "value1")
	 	private boolean value1;
	 @Column(name = "value2")
	 	private boolean value2;
	
}
