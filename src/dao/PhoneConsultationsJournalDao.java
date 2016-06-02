package dao;

import java.sql.SQLException;
import java.util.List;

import table.PhoneConsultationsJournal;

public interface PhoneConsultationsJournalDao {
	public void addPhoneConsultationsJournal(PhoneConsultationsJournal zur) throws SQLException;
	public void deletePhoneConsultationsJournal(PhoneConsultationsJournal zur) throws SQLException;	
	public PhoneConsultationsJournal getPhoneConsultationsJournal (int id) throws SQLException;
	public List<PhoneConsultationsJournal> getPhoneConsultationsJournals () throws SQLException;
}
