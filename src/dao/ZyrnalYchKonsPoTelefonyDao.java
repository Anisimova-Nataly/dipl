package dao;

import java.sql.SQLException;
import java.util.List;

import table.ZyrnalYchKonsPoTelefony;

public interface ZyrnalYchKonsPoTelefonyDao {
	public void addZyrnalYchKonsPoTelefony(ZyrnalYchKonsPoTelefony zur) throws SQLException;
	public void deleteZyrnalYchKonsPoTelefony(ZyrnalYchKonsPoTelefony zur) throws SQLException;	
	public ZyrnalYchKonsPoTelefony getZyrnalYchKonsPoTelefony (int id) throws SQLException;
	public List<ZyrnalYchKonsPoTelefony> getZyrnalYchKonsPoTelefonys () throws SQLException;
}
