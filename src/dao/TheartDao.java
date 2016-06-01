package dao;

import java.sql.SQLException;
import java.util.List;

import table.Theart;

public interface TheartDao {
	public void addTheart(Theart li) throws SQLException;
	public void deleteTheart(Theart li) throws SQLException;	
	public Theart getTheart (int id) throws SQLException;
	public List<Theart> getTheart () throws SQLException;
}