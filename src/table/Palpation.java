package table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*CREATE TABLE palpation(id integer PRIMARY KEY,
 *  value1 boolean,
 *   value2 boolean);*/

@Entity
@Table(name = "palpation")

public class Palpation {
	private ListOsmotra listOsmotra;
	
	@OneToOne(mappedBy="palpation")
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
	public boolean isValue1() {
		return value1;
	}
	public void setValue1(boolean value1) {
		this.value1 = value1;
	}
	public boolean isValue2() {
		return value2;
	}
	public void setValue2(boolean value2) {
		this.value2 = value2;
	}
}
