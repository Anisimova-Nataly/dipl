package dao;

import java.sql.SQLException;
import java.util.List;

import table.Clinic;

public interface ClinicDao {
	public void addClinic(Clinic li) throws SQLException;
	public void deleteClinic(Clinic li) throws SQLException;	
	public Clinic getClinic (int id) throws SQLException;
	public List<Clinic> getClinic () throws SQLException;
}