package main;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;

import general.Project;

import javax.swing.JButton;


import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import javax.swing.ImageIcon;
import java.awt.GridLayout;


public class StartPanal extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MainFrame parent;
	Project proj = new Project();
	/**
	 * Create the panel.
	 * @throws SQLException 
	 * @throws InterruptedException 
	 */
	public StartPanal(MainFrame p) throws InterruptedException, SQLException {
		proj.listCards();
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
				Cards c;
				try {
					c = new Cards(proj,parent);
					c.setVisible(true);
					me.revalidate();
					parent.contentPane.remove(me);
					parent.contentPane.add(c,BorderLayout.CENTER);
				} catch (InterruptedException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				
			}
		});
		panel.setLayout(new MigLayout("", "[333px][333px]", "[111px][111px][111px][111px]"));
		panel.add(btnNewButton, "cell 0 0,grow");
		
		JButton btnNewButton_1 = new JButton("Журнал манипуляций");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				manipJornal man;
				try {
					man = new manipJornal(proj,parent);
					man.setVisible(true);
					me.revalidate();
					parent.contentPane.remove(me);
					parent.contentPane.add(man,BorderLayout.CENTER);
				} catch (InterruptedException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				
				
			}
		});
		panel.add(btnNewButton_1, "cell 1 0,grow");
		
		JButton btnNewButton_2 = new JButton("Журнал амбулаторного приема");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ambJornal amb;
				try {
					amb = new ambJornal(proj,parent);
					amb.setVisible(true);
					me.revalidate();
					parent.contentPane.remove(me);
					parent.contentPane.add(amb,BorderLayout.CENTER);
				} catch (InterruptedException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			}
		});
		panel.add(btnNewButton_2, "cell 0 1,grow");
			
		JButton btnNewButton_3 = new JButton("Планировщик");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Plan pl = new Plan(parent,proj);
				pl.setVisible(true);
				me.revalidate();
				parent.contentPane.remove(me);
				parent.contentPane.add(pl,BorderLayout.CENTER);
				
			}
		});
		panel.add(btnNewButton_3, "cell 1 1,grow");
		
		JButton btnNewButton_5 = new JButton("Журнал приема звонков");
		
			
			btnNewButton_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					callJornal call;
					try {
						call = new callJornal(proj, parent);
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
			panel.add(btnNewButton_5, "cell 0 2,grow");
		
		JLabel label = new JLabel("");
		panel.add(label, "cell 1 3,grow");

	}
}
