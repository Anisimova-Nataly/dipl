package dao;

import java.sql.SQLException;
import java.util.List;

import table.Liver;

public interface LiverDao {
	public void addLiver(Liver li) throws SQLException;
	public void deleteLiver(Liver li) throws SQLException;	
	public Liver getLiver (int id) throws SQLException;
	public List<Liver> getLiver () throws SQLException;
	public void updateLiver(Long id, Liver liver) throws SQLException;
}