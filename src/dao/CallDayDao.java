package dao;

import java.sql.SQLException;
import java.util.List;

import table.CallDay;

public interface CallDayDao {
	public void addCallDay(CallDay li) throws SQLException;
	public void deleteCallDay(CallDay li) throws SQLException;	
	public CallDay getCallDay (int id) throws SQLException;
	public List<CallDay> getCallDay () throws SQLException;
	public void updateCallDay(Long id, CallDay callDay) throws SQLException;
}