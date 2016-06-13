package dao;

import java.sql.SQLException;
import java.util.List;

import table.Pacient;

public interface PacientDao {
	public void addPacient(Pacient li) throws SQLException;
	public void deletePacient(Pacient li) throws SQLException;	
	public Pacient getPacient (int id) throws SQLException;
	public List<Pacient> getPacient () throws SQLException;
	public void updatePacient(Long id, Pacient pacient) throws SQLException;
}