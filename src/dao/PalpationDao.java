package dao;

import java.sql.SQLException;
import java.util.List;

import table.Palpation;

public interface PalpationDao {
	public void addPalpation(Palpation li) throws SQLException;
	public void deletePalpation(Palpation li) throws SQLException;	
	public Palpation getPalpation (int id) throws SQLException;
	public List<Palpation> getPalpation () throws SQLException;
	public void updatePalpation(Long id, Palpation palpation) throws SQLException;
}