package general;


import dao.ListOsmotraDao;
import dao.PhoneConsultationsJournalDao;
import main.phonecollGUI;
import table.ListOsmotra;
import table.PhoneConsultationsJournal;

import java.sql.SQLException;
import java.util.List;

public class Progect {

	public static void main(String[] args) throws SQLException {
		Factory factory = Factory.getInstance();
		System.out.println("List");
		ListOsmotraDao listDao = factory.getListOsmotraDao();
		ListOsmotra li = new ListOsmotra();
	//	li.setDiuresisid(12);
	//	li.setAd("sdfsfbb");

		//listDao.addListOsmotra(li);
		
		List<ListOsmotra> list = listDao.getListOsmotras();
		
	
		
		
		for(ListOsmotra l : list){
			l.getId();
		System.out.println(l.getDateTime());}
		
		ListOsmotra z = listDao.getListOsmotra(1);
		System.out.println(z.getId() +"   "+ z.getDiuresisid()+"   "+z.getAd());
		
		
		
		System.out.println("Zur");
PhoneConsultationsJournalDao zurDao = factory.getPhoneConsultationsJournalDao();

	
		
		
		zurDao.addPhoneConsultationsJournal(phonecollGUI.start());
		
		List<PhoneConsultationsJournal> zurnal = zurDao.getPhoneConsultationsJournals();
		
	
		
		
		for(PhoneConsultationsJournal p : zurnal){

		

		System.out.println(p.getId() +"   "+ p.getReason()+"   "+p.getDate().toString());
		
		
		}}

}
