package dao;

import java.sql.SQLException;
import java.util.List;

import table.Manipulation;

public interface ManipulationDao {
	public void addManipulation(Manipulation li) throws SQLException;
	public void deleteManipulation(Manipulation li) throws SQLException;	
	public Manipulation getManipulation (int id) throws SQLException;
	public List<Manipulation> getManipulation () throws SQLException;
	public void updateManipulation(Long id, Manipulation manipulation) throws SQLException;
}