package table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*CREATE TABLE evaluationshfa(id integer PRIMARY KEY, 
 * value smallint);*/

@Entity
@Table(name = "evaluationshfa")

public class EvaluationShfa {
	private EvaluationShfa evaluationshfaid;
	private ListOsmotra listOsmotra;
	
	@OneToOne(mappedBy="evaluationshfa")
	public ListOsmotra getListOsmotra() {
		return listOsmotra;
	}
	public void setListOsmotra(ListOsmotra listOsmotra) {
		this.listOsmotra = listOsmotra;	
}
	@Id	
	 @GeneratedValue(strategy= GenerationType.AUTO)
	 @Column(name = "evaluationshfaid")
		public EvaluationShfa getEvaluationShfaId() {
			return evaluationshfaid;
		}
		public void setEvaluationShfaId(int id) {
			this.evaluationshfaid = evaluationshfaid;
		}	
	 @Column(name = "value")
	 	private char value;

	public char isValue() {
		return value;
	}
	public void setValue1(char value) {
		this.value = value;
	}
}