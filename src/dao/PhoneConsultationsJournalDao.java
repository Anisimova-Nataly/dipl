package dao;

import java.sql.SQLException;
import java.util.List;

import table.PhoneConsultationsJournal;

public interface PhoneConsultationsJournalDao {
	public void addPhoneConsultationsJournal(PhoneConsultationsJournal li) throws SQLException;
	public void deletePhoneConsultationsJournal(PhoneConsultationsJournal li) throws SQLException;	
	public PhoneConsultationsJournal getPhoneConsultationsJournal (int id) throws SQLException;
	public List<PhoneConsultationsJournal> getPhoneConsultationsJournal () throws SQLException;
	public void updatePhoneConsultationsJournal(Long id, PhoneConsultationsJournal phoneConsultationsJournal) throws SQLException;
}