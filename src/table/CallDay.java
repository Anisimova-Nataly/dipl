/*Здесь будет связь с shedule*/

package table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*CREATE TABLE callday(id integer PRIMARY KEY,
 *  value1 integer,
 *  value2 integer);*/

@Entity
@Table(name = "callday")

public class CallDay {
	private CallDay calldayid;
	
	private ListOsmotra listOsmotra;
	
	@OneToOne(mappedBy="callday")
	public ListOsmotra getCallDay() {
		return listOsmotra;
	}
	public void setListOsmotra(ListOsmotra listOsmotra) {
		this.listOsmotra = listOsmotra;
	}
		@Id	
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id")
	public CallDay getCallDayId() {
		return calldayid;
	}
	public void setliverId(int id) {
		this.calldayid = calldayid;
	}
	
	@Column(name = "value1")
	 	private Integer value1;
	 @Column(name = "value2")
	 	private Integer value2;
}
