package table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*CREATE TABLE evaluationxbsshvo(id integer PRIMARY KEY,
 *  value1 boolean, 
 *  value2 smallint);*/

@Entity
@Table(name = "evaluationxbsshvo")

public class EvaluationXbsShvo {
	
	private EvaluationXbsShvo evaluationXbsShvoId;
	
	private ListOsmotra listOsmotra;
	
	@OneToOne(mappedBy="evaluationXbsShvo")
	public ListOsmotra getListOsmotra() {
		return listOsmotra;
	}
	public void setListOsmotra(ListOsmotra listOsmotra) {
		this.listOsmotra = listOsmotra;
	}
	
	@Id	
	@Column(name = "evaluationXbsShvoid")
	public EvaluationXbsShvo getevaluationXbsShvoId() {
		return evaluationXbsShvoId;
	}
	public void setevaluationXbsShvoId(int id) {
		this.evaluationXbsShvoId = evaluationXbsShvoId;
	}
	 @Column(name = "value1")
	 	private boolean value1;
	 @Column(name = "value2")
	 	private short value2;
	public boolean isValue1() {
		return value1;
	}
	public void setValue1(boolean value1) {
		this.value1 = value1;
	}
	public short getValue2() {
		return value2;
	}
	public void setValue2(short value2) {
		this.value2 = value2;
	}

}
