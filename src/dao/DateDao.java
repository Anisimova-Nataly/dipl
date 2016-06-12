package dao;

import java.sql.SQLException;
import java.util.List;

import table.Date;

public interface DateDao {
	public void addDate(Date li) throws SQLException;
	public void deleteDate(Date li) throws SQLException;	
	public Date getDate (int id) throws SQLException;
	public List<Date> getDate () throws SQLException;
}