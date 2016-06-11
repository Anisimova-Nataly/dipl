package table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*CREATE TABLE consultationresult(id integer PRIMARY KEY, reccommendations text,
 *  psychologicalhelp boolean, leavingteam date);*/

@Entity
@Table(name = "consultationresult")

public class ConsultationResult {
	@Id	
	 @Column(name = "id")
	 @GeneratedValue(strategy= GenerationType.AUTO)
		private int id;
	@Column(name="reccommendations")
		private String reccommendations;
	@Column(name="psychologicalhelp")
		private boolean psychologicalhelp;
	@Column(name="leavingteam")
		private java.util.Date leavingteam;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReccommendations() {
		return reccommendations;
	}
	public void setReccommendations(String reccommendations) {
		this.reccommendations = reccommendations;
	}
	public boolean isPsychologicalhelp() {
		return psychologicalhelp;
	}
	public void setPsychologicalhelp(boolean psychologicalhelp) {
		this.psychologicalhelp = psychologicalhelp;
	}
	public java.util.Date getLeavingteam() {
		return leavingteam;
	}
	public void setLeavingteam(java.util.Date leavingteam) {
		this.leavingteam = leavingteam;
	}
}
