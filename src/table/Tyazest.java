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
	private Tyazest tyazestid;
	
	private ListOsmotra listOsmotra;
	
	@OneToOne(mappedBy="tyazest")
	public ListOsmotra getListOsmotra() {
		return listOsmotra;
	}
	public void setListOsmotra(ListOsmotra listOsmotra) {
		this.listOsmotra = listOsmotra;
	}
	@Id	
	 @GeneratedValue(strategy= GenerationType.AUTO)
	 @Column(name = "tyazestid")
	public Tyazest getTyazestId() {
		return tyazestid;
	}
	public void setTyazestId(int id) {
		this.tyazestid = tyazestid;
	}
	
	@Column(name = "value")
	 	private char value;
	 	
}
