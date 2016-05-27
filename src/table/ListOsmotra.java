package table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
CREATE TABLE listosmotra(id integer PRIMARY KEY, datetime timestamp with time zone,
 reason text, complaints text, ly text, bedsores text, visibleswelling text, stloc text,
  chss text, ad text, pzk text, conclusion text, recommendations text, lobe boolean, sleep boolean,
   dynamics smallint, styl smallint, tongue smallint, skin smallint, stomach smallint,
    theartid integer REFERENCES theart(id),  liverid integer REFERENCES liver(id),
     pulseid integer REFERENCES pulse(id), palpationid integer REFERENCES palpation(id),
      diuresisid integer REFERENCES diuresis(id),
       evaluationxbsshvoid integer REFERENCES evaluationxbsshvo(id),
        swallowingactid integer REFERENCES swallowingact(id),
         evaluationshfaid integer REFERENCES evaluationshfa(id),
          externalevidenceid integer REFERENCES externalevidence(id),
           tyazestid integer REFERENCES tyazest(id));
*/

@Entity
@Table(name = "listosmotra")


public class ListOsmotra {
	 @Id	
	 @Column(name = "id")
	 @GeneratedValue(strategy= GenerationType.AUTO)
		private int id;	
	 @Column(name = "datetime")
	 	private java.sql.Timestamp dateTime;
	 @Column(name = "reason")
	 	private String reason;
	 @Column(name = "complaints")
	 	private String complaints;
	 @Column(name = "ly")
		private String lY;
	 @Column(name = "bedsores")
		private String bedsores;
	 @Column(name = "visibleswelling")
		private String visibleSwelling;
	 @Column(name = "stloc")
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
	 @Column(name = "theartid")
		private Integer theartid;
	 @Column(name = "liverid")
		private Integer liverid;
	 @Column(name = "pulseid")
		private Integer pulseid;
	 @Column(name = "palpationid")
		private Integer palpationid;
	 @Column(name = "diuresisid")
		private Integer diuresisid;
	 @Column(name = "evaluationxbsshvoid")
		private Integer evaluationxbsshvoid;
	 @Column(name = "evaluationshfaid")
		private Integer evaluationshfaid;
	 @Column(name = "swallowingactid")
		private Integer swallowingactid;
	 @Column(name = "externalevidenceid")
		private Integer externalevidenceid;
	 @Column(name = "tyazestid")
		private Integer tyazestid;
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
	public Integer getTheartid() {
		return theartid;
	}
	public void setTheartid(Integer theartid) {
		this.theartid = theartid;
	}
	public Integer getLiverid() {
		return liverid;
	}
	public void setLiverid(Integer liverid) {
		this.liverid = liverid;
	}
	public Integer getPulseid() {
		return pulseid;
	}
	public void setPulseid(Integer pulseid) {
		this.pulseid = pulseid;
	}
	public Integer getPalpationid() {
		return palpationid;
	}
	public void setPalpationid(Integer palpationid) {
		this.palpationid = palpationid;
	}
	public Integer getDiuresisid() {
		return diuresisid;
	}
	public void setDiuresisid(Integer diuresisid) {
		this.diuresisid = diuresisid;
	}
	public Integer getEvaluationxbsshvoid() {
		return evaluationxbsshvoid;
	}
	public void setEvaluationxbsshvoid(Integer evaluationxbsshvoid) {
		this.evaluationxbsshvoid = evaluationxbsshvoid;
	}
	public Integer getEvaluationshfaid() {
		return evaluationshfaid;
	}
	public void setEvaluationshfaid(Integer evaluationshfaid) {
		this.evaluationshfaid = evaluationshfaid;
	}
	public Integer getSwallowingactid() {
		return swallowingactid;
	}
	public void setSwallowingactid(Integer swallowingactid) {
		this.swallowingactid = swallowingactid;
	}
	public Integer getExternalevidenceid() {
		return externalevidenceid;
	}
	public void setExternalevidenceid(Integer externalevidenceid) {
		this.externalevidenceid = externalevidenceid;
	}
	public Integer getTyazestid() {
		return tyazestid;
	}
	public void setTyazestid(Integer tyazestid) {
		this.tyazestid = tyazestid;
	}
	 
	 
	 
	 
}
