package dao;

import java.sql.SQLException;
import java.util.List;

import table.Diuresis;

public interface DiuresisDao {
	public void addDiuresis(Diuresis li) throws SQLException;
	public void deleteDiuresis(Diuresis li) throws SQLException;	
	public Diuresis getDiuresis (int id) throws SQLException;
	public List<Diuresis> getDiuresis () throws SQLException;
}