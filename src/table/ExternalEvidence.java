package table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*CREATE TABLE externalevidence(id integer PRIMARY KEY,
 *  value smallint);*/

@Entity
@Table(name = "externalevidence")

public class ExternalEvidence {
	private ListOsmotra listOsmotra;
	
	@OneToOne(mappedBy="externalevidence")
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
	}	 @Column(name = "value")
	 	private char value;

	public char getValue() {
		return value;
	}
	public void setValue(char value) {
		this.value = value;
	}
}
