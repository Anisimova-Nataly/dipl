package general;


import dao.ListOsmotraDao;
import table.ListOsmotra;


import java.sql.SQLException;
import java.util.List;

public class Progect {

	public static void main(String[] args) throws SQLException {
		Factory factory = Factory.getInstance();
		ListOsmotraDao listDao = factory.getListOsmotraDao();
		ListOsmotra li = new ListOsmotra();
	//	li.setDiuresisid(12);
		li.setAd("sdfsfbb");
		
		listDao.addListOsmotra(li);
		
		List<ListOsmotra> list = listDao.getListOsmotras();
		System.out.println("It is me!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	
		
		
		for(ListOsmotra l : list){
			l.getId();
		System.out.println(l.getDateTime());}
		
		ListOsmotra z = listDao.getListOsmotra(1);
		System.out.println(z.getId() +"   "+ z.getDiuresisid()+"   "+z.getAd());
	}

}
