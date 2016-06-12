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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class callJornal extends JPanel {
	private JTable table;
	 private Object[][] tbldata =null;
	 private String[] tblheader = { "ID", "ФИО пациента", "ФИО звонившего", "Дата", "Причина звонка", "ФИО принявшего звонок", "Результат" };
	 final callJornal me =  this;

	/**
	 * Create the panel.
	 * @throws SQLException 
	 * @throws InterruptedException 
	 */
	public callJornal(final Project proj, final MainFrame p) throws InterruptedException, SQLException {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Журнал приема звонков");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		add(lblNewLabel, BorderLayout.NORTH);
		
		table = new JTable();
		//
		//
	
		
		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.SOUTH);
		final JLabel lblNewLabel_1 = new JLabel("");
		JButton btnNewButton = new JButton("Новый звонок");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton.setForeground(Color.DARK_GRAY);
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("На главную");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StartPanal st;
				try {
					st = new StartPanal(p);
					st.setVisible(true);
					me.revalidate();
					p.contentPane.remove(me);
					p.contentPane.add(st,BorderLayout.CENTER);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 14));
		toolBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Загрузить журнал");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//p.progressBar.setVisible(true);
				p.progressBar.revalidate();
				p.revalidate();
				p.repaint();
				try {
					tbldata = proj.listCall();
				} catch (InterruptedException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			    JTable tbl = new JTable(tbldata, tblheader);
				me.add(new JScrollPane(tbl), BorderLayout.CENTER);
				me.remove(lblNewLabel_1);
			}
		});
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 14));
		toolBar.add(btnNewButton_2);
		
		
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		//String path = "tel.png";
		//URL imgURL = TestFrame.class.getResource(path);
		lblNewLabel_1.setIcon(new ImageIcon("src/img/tel.png"));
		add(lblNewLabel_1, BorderLayout.CENTER);

		
	}

}
