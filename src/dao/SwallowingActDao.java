package dao;

import java.sql.SQLException;
import java.util.List;

import table.SwallowingAct;

public interface SwallowingActDao {
	public void addSwallowingAct(SwallowingAct li) throws SQLException;
	public void deleteSwallowingAct(SwallowingAct li) throws SQLException;	
	public SwallowingAct getSwallowingAct (int id) throws SQLException;
	public List<SwallowingAct> getSwallowingAct () throws SQLException;
}