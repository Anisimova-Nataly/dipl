package dao;

import java.sql.SQLException;
import java.util.List;

import table.Caller;

public interface CallerDao {
	public void addCaller(Caller li) throws SQLException;
	public void deleteCaller(Caller li) throws SQLException;	
	public Caller getCaller (int id) throws SQLException;
	public List<Caller> getCaller () throws SQLException;
	public void updateCaller(Long id, Caller caller) throws SQLException;
}