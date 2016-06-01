package dao;

import java.sql.SQLException;
import java.util.List;

import table.CallPlanningJournal;

public interface CallPlanningJournalDao {
	public void addCallPlanningJournal(CallPlanningJournal li) throws SQLException;
	public void deleteCallPlanningJournal(CallPlanningJournal li) throws SQLException;	
	public CallPlanningJournal getCallPlanningJournal (int id) throws SQLException;
	public List<CallPlanningJournal> getCallPlanningJournal () throws SQLException;
}