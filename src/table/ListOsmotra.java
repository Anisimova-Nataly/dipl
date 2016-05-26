package table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
CREATE TABLE list_osmotra(id integer PRIMARY KEY, date_time timestamp with time zone,
 reason text, complaints text, l_y text, bedsores text, visible_swelling text, st_loc text,
  chss text, ad text, pzk text, conclusion text, recommendations text, lobe boolean, sleep boolean,
   dynamics smallint, styl smallint, tongue smallint, skin smallint, stomach smallint,
    t_heart_id integer REFERENCES t_heart(id),  liver_id integer REFERENCES liver(id),
     pulse_id integer REFERENCES pulse(id), palpation_id integer REFERENCES palpation(id),
      diuresis_id integer REFERENCES diuresis(id),
       evaluation_xbs_shvo_id integer REFERENCES evaluation_xbs_shvo(id),
        swallowing_act_id integer REFERENCES swallowing_act(id),
         evaluation_shfa_id integer REFERENCES evaluation_shfa(id),
          external_evidence_id integer REFERENCES external_evidence(id),
           tyazest_id integer REFERENCES tyazest(id));
*/

@Entity
@Table(name = "list_osmotra")


public class ListOsmotra {
	 @Id	
	 @Column(name = "id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
		private int id;	
	 @Column(name = "date_time")
	 	private java.sql.Timestamp dateTime;
	 @Column(name = "reason")
	 	private String reason;
	 @Column(name = "complaints")
	 	private String complaints;
	 @Column(name = "l_y")
		private String lY;
	 @Column(name = "bedsores")
		private String bedsores;
	 @Column(name = "visible_swelling")
		private String visibleSwelling;
	 @Column(name = "st_loc")
		private String stLoc;
	 @Column(name = "chss")
		private String chss;
	 @Column(name = "ad")
		private String ad;
	 @Column(name = "pzk")
		private String pzk;
	 @Column(name = "conclusion")
		private String conclusion;
	 @Column(name = "recommendations")
		private String recommendations;
	 @Column(name = "lobe")
		private Boolean lobe;
	 @Column(name = "sleep")
		private Boolean sleep;
	 @Column(name = "dynamics")
		private Integer dynamics;
	 @Column(name = "styl")
		private Integer styl;
	 @Column(name = "tongue")
		private Integer tongue;
	 @Column(name = "skin")
		private Integer skin;
	 @Column(name = "stomach")
		private Integer stomach;	 
	 @Column(name = "t_heart_id")
		private Integer t_heart_id;
	 @Column(name = "liver_id")
		private Integer liver_id;
	 @Column(name = "pulse_id")
		private Integer pulse_id;
	 @Column(name = "palpation_id")
		private Integer palpation_id;
	 @Column(name = "diuresis_id")
		private Integer diuresis_id;
	 @Column(name = "evaluation_xbs_shvo_id")
		private Integer evaluation_xbs_shvo_id;
	 @Column(name = "evaluation_shfa_id")
		private Integer evaluation_shfa_id;
	 @Column(name = "swallowing_act_id")
		private Integer swallowing_act_id;
	 @Column(name = "external_evidence_id")
		private Integer external_evidence_id;
	 @Column(name = "tyazest_id")
		private Integer tyazest_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public java.sql.Timestamp getDateTime() {
		return dateTime;
	}
	public void setDateTime(java.sql.Timestamp dateTime) {
		this.dateTime = dateTime;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getComplaints() {
		return complaints;
	}
	public void setComplaints(String complaints) {
		this.complaints = complaints;
	}
	public String getlY() {
		return lY;
	}
	public void setlY(String lY) {
		this.lY = lY;
	}
	public String getBedsores() {
		return bedsores;
	}
	public void setBedsores(String bedsores) {
		this.bedsores = bedsores;
	}
	public String getVisibleSwelling() {
		return visibleSwelling;
	}
	public void setVisibleSwelling(String visibleSwelling) {
		this.visibleSwelling = visibleSwelling;
	}
	public String getStLoc() {
		return stLoc;
	}
	public void setStLoc(String stLoc) {
		this.stLoc = stLoc;
	}
	public String getChss() {
		return chss;
	}
	public void setChss(String chss) {
		this.chss = chss;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getPzk() {
		return pzk;
	}
	public void setPzk(String pzk) {
		this.pzk = pzk;
	}
	public String getConclusion() {
		return conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	public String getRecommendations() {
		return recommendations;
	}
	public void setRecommendations(String recommendations) {
		this.recommendations = recommendations;
	}
	public Boolean getLobe() {
		return lobe;
	}
	public void setLobe(Boolean lobe) {
		this.lobe = lobe;
	}
	public Boolean getSleep() {
		return sleep;
	}
	public void setSleep(Boolean sleep) {
		this.sleep = sleep;
	}
	public Integer getDynamics() {
		return dynamics;
	}
	public void setDynamics(Integer dynamics) {
		this.dynamics = dynamics;
	}
	public Integer getStyl() {
		return styl;
	}
	public void setStyl(Integer styl) {
		this.styl = styl;
	}
	public Integer getTongue() {
		return tongue;
	}
	public void setTongue(Integer tongue) {
		this.tongue = tongue;
	}
	public Integer getSkin() {
		return skin;
	}
	public void setSkin(Integer skin) {
		this.skin = skin;
	}
	public Integer getStomach() {
		return stomach;
	}
	public void setStomach(Integer stomach) {
		this.stomach = stomach;
	}
	public Integer getT_heart_id() {
		return t_heart_id;
	}
	public void setT_heart_id(Integer t_heart_id) {
		this.t_heart_id = t_heart_id;
	}
	public Integer getLiver_id() {
		return liver_id;
	}
	public void setLiver_id(Integer liver_id) {
		this.liver_id = liver_id;
	}
	public Integer getPulse_id() {
		return pulse_id;
	}
	public void setPulse_id(Integer pulse_id) {
		this.pulse_id = pulse_id;
	}
	public Integer getPalpation_id() {
		return palpation_id;
	}
	public void setPalpation_id(Integer palpation_id) {
		this.palpation_id = palpation_id;
	}
	public Integer getDiuresis_id() {
		return diuresis_id;
	}
	public void setDiuresis_id(Integer diuresis_id) {
		this.diuresis_id = diuresis_id;
	}
	public Integer getEvaluation_xbs_shvo_id() {
		return evaluation_xbs_shvo_id;
	}
	public void setEvaluation_xbs_shvo_id(Integer evaluation_xbs_shvo_id) {
		this.evaluation_xbs_shvo_id = evaluation_xbs_shvo_id;
	}
	public Integer getEvaluation_shfa_id() {
		return evaluation_shfa_id;
	}
	public void setEvaluation_shfa_id(Integer evaluation_shfa_id) {
		this.evaluation_shfa_id = evaluation_shfa_id;
	}
	public Integer getSwallowing_act_id() {
		return swallowing_act_id;
	}
	public void setSwallowing_act_id(Integer swallowing_act_id) {
		this.swallowing_act_id = swallowing_act_id;
	}
	public Integer getExternal_evidence_id() {
		return external_evidence_id;
	}
	public void setExternal_evidence_id(Integer external_evidence_id) {
		this.external_evidence_id = external_evidence_id;
	}
	public Integer getTyazest_id() {
		return tyazest_id;
	}
	public void setTyazest_id(Integer tyazest_id) {
		this.tyazest_id = tyazest_id;
	}
	 
	 
	 
	 
}
