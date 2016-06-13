package dao;

import java.sql.SQLException;
import java.util.List;

import table.Specialist;

public interface SpecialistDao {
	public void addSpecialist(Specialist li) throws SQLException;
	public void deleteSpecialist(Specialist li) throws SQLException;	
	public Specialist getSpecialist (int id) throws SQLException;
	public List<Specialist> getSpecialist () throws SQLException;
	public void updateSpecialist(Long id, Specialist specialist) throws SQLException;
}