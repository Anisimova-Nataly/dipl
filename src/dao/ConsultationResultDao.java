package dao;

import java.sql.SQLException;
import java.util.List;

import table.ConsultationResult;

public interface ConsultationResultDao {
	public void addConsultationResult(ConsultationResult li) throws SQLException;
	public void deleteConsultationResult(ConsultationResult li) throws SQLException;	
	public ConsultationResult getConsultationResult (int id) throws SQLException;
	public List<ConsultationResult> getConsultationResult () throws SQLException;
	public void updateConsultationResult(Long id, ConsultationResult consultationResult) throws SQLException;
}