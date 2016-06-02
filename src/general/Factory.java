package general;

import dao.ListOsmotraDao;
import dao.PhoneConsultationsJournalDao;
import impl.ListOsmotraDaoImpl;
import impl.PhoneConsultationsJournalDaoImpl;

public class Factory {

	public static Factory instance = new Factory();
	public PhoneConsultationsJournalDao zyrnalDao;
	public ListOsmotraDao listDao;
	private Factory(){};
	public static Factory getInstance(){
		return Factory.instance;
	};
	public PhoneConsultationsJournalDao getPhoneConsultationsJournalDao(){
		if(zyrnalDao==null)zyrnalDao = new PhoneConsultationsJournalDaoImpl();
		return zyrnalDao;
	}
	public ListOsmotraDao getListOsmotraDao(){
		if(listDao==null)listDao = new ListOsmotraDaoImpl();
		return listDao;
	}
}
