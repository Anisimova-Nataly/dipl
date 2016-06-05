package general;


import dao.ListOsmotraDao;
import dao.PhoneConsultationsJournalDao;
import main.SimpleGUI;
import main.callListGUI;
import main.phonecollGUI;
import table.ListOsmotra;
import table.PhoneConsultationsJournal;

import java.sql.SQLException;
import java.util.List;

public class Project {

	private Object [][] objs;


	public static void main(String[] args) throws SQLException, InterruptedException {
		Project p = new Project();
		int rez =  SimpleGUI.main(p);
		System.out.println(rez);
		if (rez == 1){p.newCall();} 
	
		
		//System.out.println("List");
	//	ListOsmotraDao listDao = factory.getListOsmotraDao();
	//	ListOsmotra li = new ListOsmotra();
	//	li.setDiuresisid(12);
	//	li.setAd("sdfsfbb");

		//listDao.addListOsmotra(li);
		
		//List<ListOsmotra> list = listDao.getListOsmotras();
		
	
		
		
	//	for(ListOsmotra l : list){
		//	l.getId();
		//System.out.println(l.getDateTime());
		//}
		
		//ListOsmotra z = listDao.getListOsmotra(1);
		//System.out.println(z.getId() +"   "+ z.getDiuresisid()+"   "+z.getAd());
		//System.out.println("Zur");
		//PhoneConsultationsJournalDao zurDao = factory.getPhoneConsultationsJournalDao();
		//PhoneConsultationsJournal j =  phonecollGUI.start();
		//System.out.println(j.getReason());
		//zurDao.addPhoneConsultationsJournal(phonecollGUI.start());
		//List<PhoneConsultationsJournal> zurnal = zurDao.getPhoneConsultationsJournals();
		//for(PhoneConsultationsJournal p : zurnal){
		//System.out.println(p.getId() +"   "+ p.getReason()+"   "+p.getDate().toString());
		
		
	//	}
		
	
		
		
		}

	public void newCall() throws InterruptedException, SQLException {
	
		Factory factory = Factory.getInstance();
		PhoneConsultationsJournalDao zurDao = factory.getPhoneConsultationsJournalDao();
		PhoneConsultationsJournal j =  phonecollGUI.start();
		System.out.println(j.getReason());
		callListGUI c = new callListGUI(this);
		callListGUI.start(this);
		zurDao.addPhoneConsultationsJournal(phonecollGUI.start());
	//	List <PhoneConsultationsJournal> zurnal = zurDao.getPhoneConsultationsJournals();
	//	for(PhoneConsultationsJournal p : zurnal){
	//		System.out.println(p.getId() +"   "+ p.getReason()+"   "+p.getDate().toString());
	//	}
		
	}
	
	
	public Object[][] listCall() throws InterruptedException, SQLException {
		
		Factory factory = Factory.getInstance();
		PhoneConsultationsJournalDao zurDao = factory.getPhoneConsultationsJournalDao();
		

		List <PhoneConsultationsJournal> zurnal = zurDao.getPhoneConsultationsJournals();
		Object[][] objs = new Object[zurnal.size()][7];
		int i=0;
		
		for(PhoneConsultationsJournal p : zurnal){
			//System.out.println(p.getId() +"   "+ p.getReason()+"   "+p.getDate().toString());
			objs[i][0]= p.getId();
			objs[i][1]= p.getCardid();
			objs[i][2]= p.getCallerid();
			objs[i][3]= p.getDate();
			objs[i][4]= p.getReason();
			objs[i][5]= p.getSpecialistid();
			objs[i][6]= p.getConsultationResultId();
			
			i++;
		}
		return objs;
		
	}

}
