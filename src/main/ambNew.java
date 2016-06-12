package main;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import general.Project;
import table.JournalOutpatientReception;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class ambNew extends JPanel {
	 final ambNew me =  this;
		JComboBox comboBox;
		JComboBox comboBox_1;
		JComboBox comboBox_2;
		Object[][] cards;
	/**
	 * Create the panel.
	 * @throws SQLException 
	 * @throws InterruptedException 
	 */
	public ambNew(final Project proj, final MainFrame p) throws InterruptedException, SQLException {
		setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Отменить");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				ambJornal c;
				try {
					c = new ambJornal(proj, p);
					c.setVisible(true);
					me.revalidate();
					p.contentPane.remove(me);
					p.contentPane.add(c,BorderLayout.CENTER);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Сохранить");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JournalOutpatientReception j = new JournalOutpatientReception();
				
				j.setInspectionDateTime(new Timestamp(System.currentTimeMillis()));
				System.out.println((String)comboBox_1.getSelectedItem());
				j.setContentRenderedServices((String) comboBox_1.getSelectedItem());
		
				//j.set
				try {
					proj.newAmb(j);
				} catch (InterruptedException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				ambJornal c;
				try {
					c = new ambJornal(proj, p);
					c.setVisible(true);
					me.revalidate();
					p.contentPane.remove(me);
					p.contentPane.add(c,BorderLayout.CENTER);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			
			}
		});
		toolBar.add(btnNewButton_1);
		
		JLabel label = new JLabel("Журнал амбулаторного приема");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("Dialog", Font.BOLD, 25));
		add(label, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblNewLabel = new JLabel("Пациент");
		panel.add(lblNewLabel, "2, 2, right, default");
		
		cards =proj.listCards();
		String[] str = new String[cards.length];
		for(int i =0;i<cards.length;i++){
			str[i] = (String) cards[i][1];
			i++;
		}
		 comboBox = new JComboBox();
		 comboBox.setModel(new DefaultComboBoxModel(str));
		panel.add(comboBox, "4, 2, fill, default");
		
		JSeparator separator = new JSeparator();
		panel.add(separator, "2, 4");
		
		JSeparator separator_1 = new JSeparator();
		panel.add(separator_1, "4, 4");
		
		JLabel label_1 = new JLabel("Объем оказанных услуг");
		panel.add(label_1, "2, 6, right, default");
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Осмотр", "Рекомендации", "Манипуляция"}));
		panel.add(comboBox_1, "4, 6, fill, default");
		
		JSeparator separator_2 = new JSeparator();
		panel.add(separator_2, "2, 8");
		
		JSeparator separator_3 = new JSeparator();
		panel.add(separator_3, "4, 8");
		
		JLabel label_2 = new JLabel("Врач");
		panel.add(label_2, "2, 10, right, default");
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(proj.listSpec()));
		panel.add(comboBox_2, "4, 10, fill, default");

	}

}
