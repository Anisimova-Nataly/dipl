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
	private ExternalEvidence externalevidenceid;
	private ListOsmotra listOsmotra;
	
	@OneToOne(mappedBy="externalevidence")
	public ListOsmotra getListOsmotra() {
		return listOsmotra;
	}
	public void setListOsmotra(ListOsmotra listOsmotra) {
		this.listOsmotra = listOsmotra;
	}
	@Id	
	 @GeneratedValue(strategy= GenerationType.AUTO)
	 @Column(name = "externalevidenceid")
		public ExternalEvidence getexternalevidenceId() {
			return externalevidenceid;
		}
		public void setdiuresisId(int id) {
			this.externalevidenceid = externalevidenceid;
		}
	 @Column(name = "value")
	 	private char value;

	public char getValue() {
		return value;
	}
	public void setValue(char value) {
		this.value = value;
	}
}
