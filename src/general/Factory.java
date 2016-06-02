package general;

import dao.ListOsmotraDao;
import dao.PhoneConsultationsJournalDao;
import impl.ListOsmotraDaoImpl;

import impl.PhoneConsultationsJournalDaoImpl;

import dao.JournalOutpatientReceptionDao;
import impl.JournalOutpatientReceptionDaoImpl;


public class Factory {

	public static Factory instance = new Factory();
	public PhoneConsultationsJournalDao zyrnalDao;
	public ListOsmotraDao listDao;
	public JournalOutpatientReceptionDao journalOutpatientReceptionDao;
	private Factory(){};
	public static Factory getInstance(){
		return Factory.instance;
	};

	public PhoneConsultationsJournalDao getPhoneConsultationsJournalDao(){
		if(zyrnalDao==null)zyrnalDao = new PhoneConsultationsJournalDaoImpl();
		return zyrnalDao;}

	public JournalOutpatientReceptionDao getJournalOutpatientReceptionDao(){
		if(journalOutpatientReceptionDao==null)journalOutpatientReceptionDao = new JournalOutpatientReceptionDaoImpl();
		return journalOutpatientReceptionDao;
		
	}

	public ListOsmotraDao getListOsmotraDao(){
		if(listDao==null)listDao = new ListOsmotraDaoImpl();
		return listDao;
	}
}
