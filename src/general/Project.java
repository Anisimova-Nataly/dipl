package general;


import dao.CardDao;
import dao.HeavyNarcoticJournalDao;
import dao.JournalOutpatientReceptionDao;
import dao.ListOsmotraDao;
import dao.PhoneConsultationsJournalDao;
import dao.TherapeuticDiagnosticManipulationsJournalDao;
//import main.SimpleGUI;
//import main.callListGUI;
import main.phonecollGUI;
import table.Card;
import table.HeavyNarcoticJournal;
import table.JournalOutpatientReception;
import table.ListOsmotra;
import table.PhoneConsultationsJournal;
import table.TherapeuticDiagnosticManipulationsJournal;

import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Project {



/*
	public static void main(String[] args) throws SQLException, InterruptedException {
		
		while (true){
			Project p = new Project();
			SimpleGUI s = new SimpleGUI(p);
			int rez =  s.main(p);
			boolean gotRes = false;
			System.out.println(rez);
			while (gotRes ==false) {
				if (rez == 2){//журнал звонков
					gotRes =true;
					rez= 0; 
					p = new Project();
					callListGUI c =new callListGUI(p);
					int rez1 = c.start(p);
					//boolean gotRes1 = false;
					//while (gotRes1 ==false) {
					//	TimeUnit.SECONDS.sleep(1);}
					if (rez1 == 1){
						//gotRes1=true;
						p.newCall();}
				}
				if (rez == 3){//журнал амбулаторного приема
					gotRes =true;
					rez= 0; 
					p = new Project();
					callListGUI c =new callListGUI(p);
					int rez1 = c.start(p);
					//boolean gotRes1 = false;
					//while (gotRes1 ==false) {
					//	TimeUnit.SECONDS.sleep(1);}
					if (rez1 == 1){
						//gotRes1=true;
						p.newCall();}
				} 
			TimeUnit.SECONDS.sleep(1);
			}
		}
		
	*/
		
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
	
	
		
		
		//}

	public void newCard(Card card) throws InterruptedException, SQLException {
		
		Factory factory = Factory.getInstance();
		CardDao cardDao = factory.getCardDao();
		cardDao.addCard(card);;
		
	//	callListGUI c = new callListGUI.start(this);
	//	List <PhoneConsultationsJournal> zurnal = zurDao.getPhoneConsultationsJournals();
	//	for(PhoneConsultationsJournal p : zurnal){
	//		System.out.println(p.getId() +"   "+ p.getReason()+"   "+p.getDate().toString());
	//	}
		
	}
	
	
	
	
	public void newCall() throws InterruptedException, SQLException {
	
		Factory factory = Factory.getInstance();
		PhoneConsultationsJournalDao zurDao = factory.getPhoneConsultationsJournalDao();
		phonecollGUI ph = new phonecollGUI();
		PhoneConsultationsJournal j =  ph.start();
		System.out.println(j.getReason());
		zurDao.addPhoneConsultationsJournal(j);
		
	//	callListGUI c = new callListGUI.start(this);
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

	public Object[][] listAmb()  throws InterruptedException, SQLException {
			
			Factory factory = Factory.getInstance();
			JournalOutpatientReceptionDao zurDao = factory.getJournalOutpatientReceptionDao();
			

			List <JournalOutpatientReception> zurnal = zurDao.getJournalOutpatientReceptions();
			Object[][] objs = new Object[zurnal.size()][5];
			int i=0;
			
			for(JournalOutpatientReception p : zurnal){
				//System.out.println(p.getId() +"   "+ p.getReason()+"   "+p.getDate().toString());
				objs[i][0]= p.getId();
				objs[i][1]= null;
				objs[i][2]= p.getInspectionDateTime();
				objs[i][3]= null;
				objs[i][4]= p.getContentRenderedServices();
				//objs[i][5]= p.getSpecialistid();
				//objs[i][6]= p.getConsultationResultId();
				
				i++;
			}
			return objs;
			
		}
	
	public Object[][] listManip()  throws InterruptedException, SQLException {
		
		Factory factory = Factory.getInstance();
		TherapeuticDiagnosticManipulationsJournalDao zurDao = factory.getTherapeuticDiagnosticManipulationsJournalDao();
		

		List <TherapeuticDiagnosticManipulationsJournal> zurnal = zurDao.getTherapeuticDiagnosticManipulationsJournals();
		Object[][] objs = new Object[zurnal.size()][8];
		int i=0;
		
		for(TherapeuticDiagnosticManipulationsJournal p : zurnal){
			//System.out.println(p.getId() +"   "+ p.getReason()+"   "+p.getDate().toString());
			objs[i][0]= p.getId();
			objs[i][1]= null;
			objs[i][2]= p.getComplication();
			objs[i][3]= null;
			objs[i][4]= p.getObservationmethod();
			objs[i][5]= null;
			objs[i][6]= null;
			objs[i][7]= null;
			
			
			//objs[i][5]= p.getSpecialistid();
			//objs[i][6]= p.getConsultationResultId();
			
			i++;
		}
		return objs;
		
	}

	public Object[][] listDrags()  throws InterruptedException, SQLException {
		
		Factory factory = Factory.getInstance();
		HeavyNarcoticJournalDao zurDao = factory.getHeavyNarcoticJournalDao();
		

		List <HeavyNarcoticJournal> zurnal = zurDao.getHeavyNarcoticJournals();
		Object[][] objs = new Object[zurnal.size()][7];
		int i=0;
		
		for(HeavyNarcoticJournal p : zurnal){
			//System.out.println(p.getId() +"   "+ p.getReason()+"   "+p.getDate().toString());
			objs[i][0]= p.getId();
			objs[i][1]= null;
			objs[i][2]= p.getValue2();
			objs[i][3]= p.getValue3();
			objs[i][4]= null;
			objs[i][5]= null;
			objs[i][6]= null;
			
			
			
			//objs[i][5]= p.getSpecialistid();
			//objs[i][6]= p.getConsultationResultId();
			
			i++;
		}
		return objs;	
	}
}
