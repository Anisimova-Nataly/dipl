package general;


import dao.CardDao;
import dao.HeavyNarcoticJournalDao;
import dao.JournalOutpatientReceptionDao;
import dao.ListOsmotraDao;
import dao.PacientDao;
import dao.PhoneConsultationsJournalDao;
import dao.SpecialistDao;
import dao.TherapeuticDiagnosticManipulationsJournalDao;
//import main.SimpleGUI;
//import main.callListGUI;
import main.phonecollGUI;
import table.Card;
import table.HeavyNarcoticJournal;
import table.JournalOutpatientReception;
import table.ListOsmotra;
import table.Pacient;
import table.PhoneConsultationsJournal;
import table.Specialist;
import table.TherapeuticDiagnosticManipulationsJournal;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
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
	}
	public void newAmb(JournalOutpatientReception amb) throws InterruptedException, SQLException {
		
		Factory factory = Factory.getInstance();
		JournalOutpatientReceptionDao ambDao = factory.getJournalOutpatientReceptionDao();
		ambDao.addJournalOutpatientReception(amb);
	}
	public void newPacient(Pacient pac) throws InterruptedException, SQLException {
		
		Factory factory = Factory.getInstance();
		PacientDao pDao = factory.getPacientDao();
		pDao.addPacient(pac);
	}	
	
	public void delCard(int id) throws InterruptedException, SQLException {
		
		Factory factory = Factory.getInstance();
		CardDao cardDao = factory.getCardDao();
		cardDao.deleteCard(cardDao.getCard(id));	
	}
	
	
	
	public void newCall(PhoneConsultationsJournal ph) throws InterruptedException, SQLException {
	
		Factory factory = Factory.getInstance();
		PhoneConsultationsJournalDao zurDao = factory.getPhoneConsultationsJournalDao();
		System.out.println(ph.getReason());
		zurDao.addPhoneConsultationsJournal(ph);
		
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

public String[] listSpec()  throws InterruptedException, SQLException {
		
		Factory factory = Factory.getInstance();
		SpecialistDao zurDao = factory.getSpecialistDao();
	//	List<Specialist> zurnal = zurDao.getSpecialist();
		Specialist s = zurDao.getSpecialist(4);
		System.out.println(s.getValue1());
		int i = 0;
		
		String str[]=new String[1];
				str[0] = s.getValue1()+" "+s.getValue2()+s.getValue3();
		//String str[]=new String[zurnal.size()];
		//for(Specialist p : zurnal){
		//	str[i] = p.getValue1()+" "+p.getValue2()+p.getValue3();
		//	i++;
		//}
		return str;
		
	}
	
	public Object[][] listCards()  throws InterruptedException, SQLException {
		
		Factory factory = Factory.getInstance();
		CardDao zurDao = factory.getCardDao();
		List <Card> zurnal = zurDao.getCard();
		Object[][] objs = new Object[zurnal.size()][6];
		int i=0;
		SimpleDateFormat formatter = new SimpleDateFormat ("yyyy-MM-dd");
		for(Card p : zurnal){
			
			objs[i][0]= p.getId();
			objs[i][1]= p.getPacient().getSurname()+ " "+p.getPacient().getName()+" "+p.getPacient().getOtchestvo();
			objs[i][2]= formatter.format(p.getDate().getTime());
			objs[i][3]=null;
			objs[i][4]=null;
			objs[i][5]=null;
			i++;
		}
		return objs;
		
	}
	
	
	
public Object[][] listLists()  throws InterruptedException, SQLException {
		
		Factory factory = Factory.getInstance();
		ListOsmotraDao zurDao = factory.getListOsmotraDao();
		List <ListOsmotra> zurnal = zurDao.getListOsmotras();
		Object[][] objs = new Object[zurnal.size()][4];
		int i=0;
		SimpleDateFormat formatter = new SimpleDateFormat ("yyyy-MM-dd");
		for(ListOsmotra p : zurnal){
			
			objs[i][0]= p.getId();
			objs[i][2]= formatter.format(new java.sql.Date(p.getDateTime().getTime()).toString());
			objs[i][3]=null;
			objs[i][4]=null;
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
