package table;

import javax.persistence.*;


@Entity
@Table(name = "zyrnal_ych_kons_po_telefony")


public class ZyrnalYchKonsPoTelefony{
 @Id	
 @Column(name = "id")
 @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
 @Column(name = "id_rez_kons")
	private int id_rez_kons;
 @Column(name = "id_zvon")
	private int id_zvon;
 @Column(name = "id_spec")
	private int id_spec;
 @Column(name = "id_card")
	private int id_card; 
 @Column(name = "value1")
	private String	value1; 
 @Column(name = "value2")
	private String	value2; 

	public void setValue1(String val1){
		this.value1= val1;
	}
	public void setValue2(String val2){
		this.value2= val2;
	}
	public void setId(int val){
		this.id= val;
	}
	public void setId_rez_kons(int val){
		this.id_rez_kons= val;
	}
	public void setId_zvon(int val){
		this.id_zvon= val;
	}
	public void setId_spec(int val){
		this.id_spec= val;
	}
	public void setId_card(int val){
		this.id_card= val;
	}
	public int getId(){
		return id;
	}
	public String getValue1(){
		return value1;
	}
	public String getValue2(){
		return value2;
	}
	public int getId_rez_kons(){
		return id_rez_kons;
	}
	public int getId_zvon(){
		return id_zvon;
	}
	public int getId_spec(){
		return id_spec;
	}
	public int getId_card(){
		return id_card;
	}
	
	
}
