package table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*CREATE TABLE tyazest(id integer PRIMARY KEY, value smallint);*/

@Entity
@Table(name = "tyazest")
public class Tyazest {	
	private ListOsmotra listOsmotra;
	
	@OneToOne(mappedBy="tyazest")
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
	
	@Column(name = "value")
	 	private char value;
	 	
}
