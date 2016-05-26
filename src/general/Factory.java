package general;

import dao.ZyrnalYchKonsPoTelefonyDao;
import impl.ZyrnalYchKonsPoTelefonyDaoImpl;

public class Factory {

	public static Factory instance = new Factory();
	public ZyrnalYchKonsPoTelefonyDao zyrnalDao;
	
	private Factory(){};
	public static Factory getInstance(){
		return Factory.instance;
	};
	public ZyrnalYchKonsPoTelefonyDao getZyrnalYchKonsPoTelefonyDao(){
		if(zyrnalDao==null)zyrnalDao = new ZyrnalYchKonsPoTelefonyDaoImpl();
		return zyrnalDao;
	}
}
