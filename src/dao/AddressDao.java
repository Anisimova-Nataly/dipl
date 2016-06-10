package dao;

import java.sql.SQLException;
import java.util.List;

import table.Address;

public interface AddressDao {
	public void addAddress(Address li) throws SQLException;
	public void deleteAddress(Address li) throws SQLException;	
	public Address getAddress (int id) throws SQLException;
	public List<Address> getAddress () throws SQLException;
}