package dao;

import java.sql.SQLException;
import java.util.List;

import table.TherapeuticDiagnosticManipulationsJournal;

public interface TherapeuticDiagnosticManipulationsJournalDao {
	public void addTherapeuticDiagnosticManipulationsJournal(TherapeuticDiagnosticManipulationsJournal li) throws SQLException;
	public void deleteTherapeuticDiagnosticManipulationsJournal(TherapeuticDiagnosticManipulationsJournal li) throws SQLException;	
	public TherapeuticDiagnosticManipulationsJournal getTherapeuticDiagnosticManipulationsJournal (int id) throws SQLException;
	public List<TherapeuticDiagnosticManipulationsJournal> getTherapeuticDiagnosticManipulationsJournal () throws SQLException;
	public void updateTherapeuticDiagnosticManipulationsJournal(Long id, TherapeuticDiagnosticManipulationsJournal therapeuticDiagnosticManipulationsJournal) throws SQLException;
}