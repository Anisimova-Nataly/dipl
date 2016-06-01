package dao;

import java.sql.SQLException;
import java.util.List;

import table.EvaluationXbsShvo;

public interface EvaluationXbsShvoDao {
	public void addEvaluationXbsShvo(EvaluationXbsShvo li) throws SQLException;
	public void deleteEvaluationXbsShvo(EvaluationXbsShvo li) throws SQLException;	
	public EvaluationXbsShvo getEvaluationXbsShvo (int id) throws SQLException;
	public List<EvaluationXbsShvo> getEvaluationXbsShvo () throws SQLException;
}