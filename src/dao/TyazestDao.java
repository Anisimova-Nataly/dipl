package dao;

import java.sql.SQLException;
import java.util.List;

import table.Tyazest;

public interface TyazestDao {
	public void addTyazest(Tyazest li) throws SQLException;
	public void deleteTyazest(Tyazest li) throws SQLException;	
	public Tyazest getTyazest (int id) throws SQLException;
	public List<Tyazest> getTyazest () throws SQLException;
	public void updateTyazest(Long id, Tyazest tyazest) throws SQLException;
}