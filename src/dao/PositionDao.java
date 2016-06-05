package dao;

import java.sql.SQLException;
import java.util.List;

import table.Position;

public interface PositionDao {
	public void addPosition(Position li) throws SQLException;
	public void deletePosition(Position li) throws SQLException;	
	public Position getPosition (int id) throws SQLException;
	public List<Position> getPosition () throws SQLException;
}