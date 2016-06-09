package main;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

import general.Project;

import javax.swing.JButton;


import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;


public class StartPanal extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MainFrame parent;
	Project proj = new Project();
	/**
	 * Create the panel.
	 */
	public StartPanal(MainFrame p) {
		parent = p;
		final StartPanal me =  this;
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Помощник");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Liberation Serif", Font.BOLD, 54));
		lblNewLabel.setForeground(Color.DARK_GRAY);
		add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("Амбулаторные карты");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.setLayout(new MigLayout("", "[331px][331px]", "[122px][122px][122px]"));
		panel.add(btnNewButton, "cell 0 0,grow");
		
		JButton btnNewButton_1 = new JButton("Журнал манипуляций");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_1, "cell 1 0,grow");
		
		JButton btnNewButton_2 = new JButton("Журнал амбулаторного приема");
		panel.add(btnNewButton_2, "cell 0 1,grow");
			
		JButton btnNewButton_3 = new JButton("Планировщик");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				planingGUI pl = new planingGUI();
				pl.setVisible(true);
				me.revalidate();
				parent.contentPane.remove(me);
				parent.contentPane.add(pl,BorderLayout.CENTER);
				
			}
		});
		panel.add(btnNewButton_3, "cell 1 1,grow");
		
		JButton btnNewButton_4 = new JButton("Статистика");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton_4, "cell 0 2,grow");
		
		JButton btnNewButton_5 = new JButton("Журнал приема звонков");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				parent.progressBar.setVisible(true);
				parent.progressBar.revalidate();
				callJornal call;
				try {
					call = new callJornal(proj);
					call.setVisible(true);
					me.revalidate();
					
					
					parent.contentPane.remove(me);
					parent.contentPane.add(call,BorderLayout.CENTER);
				} catch (InterruptedException e1) {
					
					e1.printStackTrace();
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}

			}
		});
		panel.add(btnNewButton_5, "cell 1 2,grow");

	}
}
