package dao;

import java.sql.SQLException;
import java.util.List;

import table.Pulse;

public interface PulseDao {
	public void addPulse(Pulse li) throws SQLException;
	public void deletePulse(Pulse li) throws SQLException;	
	public Pulse getPulse (int id) throws SQLException;
	public List<Pulse> getPulse () throws SQLException;
}