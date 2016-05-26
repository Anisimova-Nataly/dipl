package general;


import dao.ZyrnalYchKonsPoTelefonyDao;
import table.ZyrnalYchKonsPoTelefony;

import java.sql.SQLException;
import java.util.List;

public class Progect {

	public static void main(String[] args) throws SQLException {
		Factory factory = Factory.getInstance();
		ZyrnalYchKonsPoTelefonyDao zurnalDao = factory.getZyrnalYchKonsPoTelefonyDao();
		ZyrnalYchKonsPoTelefony zu = new ZyrnalYchKonsPoTelefony();
		zu.setId_card(12);
		zu.setId_rez_kons(13);
		zu.setValue1("dfgdfgd");
		zurnalDao.addZyrnalYchKonsPoTelefony(zu);
		
		List<ZyrnalYchKonsPoTelefony> zurnal = zurnalDao.getZyrnalYchKonsPoTelefonys();
		System.out.println("It is me!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	
		
		/*
		for(ZyrnalYchKonsPoTelefony z : zurnal){
			z.getId();
		System.out.println("me");}
		*/
		ZyrnalYchKonsPoTelefony z = zurnalDao.getZyrnalYchKonsPoTelefony(1);
		System.out.println(z.getId() +"   "+ z.getId_card()+"   "+z.getValue1());
	}

}
