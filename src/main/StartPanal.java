package main;

import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import javax.swing.SpringLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class StartPanal extends JPanel {
	MainFrame parent;
	
	/**
	 * Create the panel.
	 */
	public StartPanal(MainFrame p) {
		parent = p;
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Помошник");
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
				System.out.println("me");
				parent.contentPane.add(new planingGUI(null),BorderLayout.EAST);
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
		panel.add(btnNewButton_5, "cell 1 2,grow");

	}
}
