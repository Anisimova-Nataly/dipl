package dao;

import java.sql.SQLException;
import java.util.List;

import table.ExternalEvidence;

public interface ExternalEvidenceDao {
	public void addExternalEvidence(ExternalEvidence li) throws SQLException;
	public void deleteExternalEvidence(ExternalEvidence li) throws SQLException;	
	public ExternalEvidence getExternalEvidence (int id) throws SQLException;
	public List<ExternalEvidence> getExternalEvidence () throws SQLException;
	public void updateExternalEvidence(Long id, ExternalEvidence ExternalEvidence) throws SQLException;
}