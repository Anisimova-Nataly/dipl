package main;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;

import general.Project;

import java.awt.Font;
import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.JButton;

public class callJornal extends JPanel {
	private JTable table;
	 private Object[][] tbldata =null;
	 private String[] tblheader = { "ID", "ФИО пациента", "ФИО звонившего", "Дата", "Причина звонка", "ФИО принявшего звонок", "Результат" };
		

	/**
	 * Create the panel.
	 * @throws SQLException 
	 * @throws InterruptedException 
	 */
	public callJornal(Project proj) throws InterruptedException, SQLException {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Журнал приема звонков");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		add(lblNewLabel, BorderLayout.NORTH);
		
		table = new JTable();
		tbldata = proj.listCall();
		JTable tbl = new JTable(tbldata, tblheader);
		add(new JScrollPane(tbl), BorderLayout.CENTER);
	
		
		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Новый звонок");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton.setForeground(Color.DARK_GRAY);
		toolBar.add(btnNewButton);

		
	}

}
