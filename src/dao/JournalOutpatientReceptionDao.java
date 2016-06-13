package dao;

import java.sql.SQLException;
import java.util.List;

import table.JournalOutpatientReception;

public interface JournalOutpatientReceptionDao {
	public void addJournalOutpatientReception(JournalOutpatientReception li) throws SQLException;
	public void deleteJournalOutpatientReception(JournalOutpatientReception li) throws SQLException;	
	public JournalOutpatientReception getJournalOutpatientReception (int id) throws SQLException;
	public List<JournalOutpatientReception> getJournalOutpatientReception () throws SQLException;
	public void updateJournalOutpatientReception(Long id, JournalOutpatientReception journalOutpatientReception) throws SQLException;
}