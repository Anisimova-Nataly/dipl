package dao;

import java.sql.SQLException;
import java.util.List;

import table.Schedule;

public interface ScheduleDao {
	public void addSchedule(Schedule li) throws SQLException;
	public void deleteSchedule(Schedule li) throws SQLException;	
	public Schedule getSchedule (int id) throws SQLException;
	public List<Schedule> getSchedule () throws SQLException;
}