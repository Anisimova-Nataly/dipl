package dao;

import java.sql.SQLException;
import java.util.List;

import table.HeavyNarcoticJournal;

public interface HeavyNarcoticJournalDao {
	public void addHeavyNarcoticJournal(HeavyNarcoticJournal li) throws SQLException;
	public void deleteHeavyNarcoticJournal(HeavyNarcoticJournal li) throws SQLException;	
	public HeavyNarcoticJournal getHeavyNarcoticJournal (int id) throws SQLException;
	public List<HeavyNarcoticJournal> getHeavyNarcoticJournal () throws SQLException;
	public void updateHeavyNarcoticJournal(Long id, HeavyNarcoticJournal heavyNarcoticJournal) throws SQLException;
}
