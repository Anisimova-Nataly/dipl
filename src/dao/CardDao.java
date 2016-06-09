package dao;

import java.sql.SQLException;
import java.util.List;

import table.Card;

public interface CardDao {
	public void addCard(Card li) throws SQLException;
	public void deleteCard(Card li) throws SQLException;	
	public Card getCard (int id) throws SQLException;
	public List<Card> getCard () throws SQLException;
}