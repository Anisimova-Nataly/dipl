package dao;

import java.sql.SQLException;
import java.util.List;

import table.Exit;

public interface ExitDao {
	public void addExit(Exit li) throws SQLException;
	public void deleteExit(Exit li) throws SQLException;	
	public Exit getExit (int id) throws SQLException;
	public List<Exit> getExit () throws SQLException;
	public void updateExit(Long id, Exit Exit) throws SQLException;
}