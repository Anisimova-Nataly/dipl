package dao;

import java.sql.SQLException;
import java.util.List;

import table.EvaluationShfa;

public interface EvaluationShfaDao {
	public void addEvaluationShfa(EvaluationShfa li) throws SQLException;
	public void deleteEvaluationShfa(EvaluationShfa li) throws SQLException;	
	public EvaluationShfa getEvaluationShfa (int id) throws SQLException;
	public List<EvaluationShfa> getEvaluationShfa () throws SQLException;
	public void updateEvaluationShfa(Long id, EvaluationShfa evaluationShfa) throws SQLException;
}