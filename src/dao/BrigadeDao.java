package dao;

import java.sql.SQLException;
import java.util.List;

import table.Brigade;

public interface BrigadeDao {
	public void addBrigade(Brigade li) throws SQLException;
	public void deleteBrigade(Brigade li) throws SQLException;	
	public Brigade getBrigade (int id) throws SQLException;
	public List<Brigade> getBrigade () throws SQLException;
	public void updateBrigade(Long id, Brigade brigade) throws SQLException;
}