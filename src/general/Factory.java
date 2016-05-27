package general;

import dao.ListOsmotraDao;
import dao.ZyrnalYchKonsPoTelefonyDao;
import impl.ListOsmotraDaoImpl;
import impl.ZyrnalYchKonsPoTelefonyDaoImpl;

public class Factory {

	public static Factory instance = new Factory();
	public ZyrnalYchKonsPoTelefonyDao zyrnalDao;
	public ListOsmotraDao listDao;
	private Factory(){};
	public static Factory getInstance(){
		return Factory.instance;
	};
	public ZyrnalYchKonsPoTelefonyDao getZyrnalYchKonsPoTelefonyDao(){
		if(zyrnalDao==null)zyrnalDao = new ZyrnalYchKonsPoTelefonyDaoImpl();
		return zyrnalDao;
	}
	public ListOsmotraDao getListOsmotraDao(){
		if(listDao==null)listDao = new ListOsmotraDaoImpl();
		return listDao;
	}
}
