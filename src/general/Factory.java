package general;

import dao.ListOsmotraDao;
import dao.ZyrnalYchKonsPoTelefonyDao;
import impl.ListOsmotraDaoImpl;
import impl.ZyrnalYchKonsPoTelefonyDaoImpl;
import dao.JournalOutpatientReceptionDao;
import impl.JournalOutpatientReceptionDaoImpl;

public class Factory {

	public static Factory instance = new Factory();
	public ZyrnalYchKonsPoTelefonyDao zyrnalDao;
	public ListOsmotraDao listDao;
	public JournalOutpatientReceptionDao journalOutpatientReceptionDao;
	private Factory(){};
	public static Factory getInstance(){
		return Factory.instance;
	};
	public JournalOutpatientReceptionDao getJournalOutpatientReceptionDao(){
		if(journalOutpatientReceptionDao==null)journalOutpatientReceptionDao = new JournalOutpatientReceptionDaoImpl();
		return journalOutpatientReceptionDao;
		
	}
	public ZyrnalYchKonsPoTelefonyDao getZyrnalYchKonsPoTelefonyDao(){
		if(zyrnalDao==null)zyrnalDao = new ZyrnalYchKonsPoTelefonyDaoImpl();
		return zyrnalDao;
	}
	public ListOsmotraDao getListOsmotraDao(){
		if(listDao==null)listDao = new ListOsmotraDaoImpl();
		return listDao;
	}
}
