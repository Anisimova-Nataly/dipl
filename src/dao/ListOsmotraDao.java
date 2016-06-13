package dao;

import java.sql.SQLException;
import java.util.List;

import table.ListOsmotra;

public interface ListOsmotraDao {
	public void addListOsmotra(ListOsmotra li) throws SQLException;
	public void deleteListOsmotra(ListOsmotra li) throws SQLException;	
	public ListOsmotra getListOsmotra (int id) throws SQLException;
	public List<ListOsmotra> getListOsmotra () throws SQLException;
	public void updateListOsmotra(Long id, ListOsmotra listOsmotra) throws SQLException;
}
