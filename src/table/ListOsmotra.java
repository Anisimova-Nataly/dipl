/*связь с нарк. учетом нужна*/

package table;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
	
	private Liver liver;
	private Theart theart;
	private Pulse pulse;
	private Palpation palpation;
	private Diuresis diuresis;
	private EvaluationXbsShvo evaluationXbsShvo;
	private SwallowingAct swallowingAct;
	private EvaluationShfa evaluationShfa;
	private ExternalEvidence externalEvidence;
	private Tyazest tyazest;
	
	private Card card;
	private ListOsmotra listOsmotra;
	
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
	 @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
		@JoinColumn(name="pulseid") 
		public Pulse getPulse() {
			return pulse;
		}
		public void setPulse(Pulse pulse) {
			this.pulse = pulse;
		}
	
	 @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
		@JoinColumn(name="palpationid") 
		public Palpation getPalpation() {
			return palpation;
		}
		public void setPalpation(Palpation palpation) {
			this.palpation = palpation;
		}
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
		@JoinColumn(name="diuresisid") 
		public Diuresis getDiuresis() {
			return diuresis;
		}
		public void setDiuresis(Diuresis diuresis) {
			this.diuresis = diuresis;
		}		
	
	 @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
		@JoinColumn(name="evaluationxbsshvoid") 
		public EvaluationXbsShvo getEvaluationXbsShvo() {
			return evaluationXbsShvo;
		}
		public void setEvaluationxbsshvo(EvaluationXbsShvo evaluationXbsShvo) {
			this.evaluationXbsShvo = evaluationXbsShvo;
		} 
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
		@JoinColumn(name="evaluationshfaid") 
		public EvaluationShfa getEvaluationShfa() {
			return evaluationShfa;
		}
		public void setEvaluationShfa(EvaluationShfa evaluationShfa) {
			this.evaluationShfa = evaluationShfa;
		} 
	  
	 @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
		@JoinColumn(name="swallowingactid") 
		public SwallowingAct getSwallowingAct() {
			return swallowingAct;
		}
		public void setSwallowingact(SwallowingAct swallowingAct) {
			this.swallowingAct = swallowingAct;
		} 
		 
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
		@JoinColumn(name="externalevidenceid") 
		public ExternalEvidence getExternalEvidence() {
			return externalEvidence;
		}
		public void setExternalEvidence(ExternalEvidence externalEvidence) {
			this.externalEvidence = externalEvidence;
		}	
	
		@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
		@JoinColumn(name="tyazestid") 
		public Tyazest getTyazest() {
			return tyazest;
		}
		public void setTyazest(Tyazest tyazest) {
			this.tyazest = tyazest;
		}	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public java.sql.Timestamp getDateTime() {
		return dateTime;
	}
	public void setDateTime() {
		this.dateTime = new Timestamp(System.currentTimeMillis());
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
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="theartid") 
	public Theart getTheart() {
		return theart;
	}
	public void setTheart(Theart theart) {
		this.theart = theart;
	}	 
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="liverid") 
	public Liver getLiver() {
		return liver;
	}
	public void setLiver(Liver liver) {
		this.liver = liver;
	}	 
	
	@ManyToOne
	@JoinColumn(name="cardid")
	public ListOsmotra getListOsmotra(){
		return listOsmotra;
	}
	public void setListOsmotra(ListOsmotra listOsmotra){
		this.listOsmotra = listOsmotra;	
	}
	
}
