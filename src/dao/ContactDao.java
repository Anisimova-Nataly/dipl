package dao;

import java.sql.SQLException;
import java.util.List;

import table.Contact;

public interface ContactDao {
	public void addContact(Contact li) throws SQLException;
	public void deleteContact(Contact li) throws SQLException;	
	public Contact getContact (int id) throws SQLException;
	public List<Contact> getContact () throws SQLException;
}