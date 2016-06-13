package main;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import general.Project;
import table.Manipulation;
import table.TherapeuticDiagnosticManipulationsJournal;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class manipNew extends JPanel {
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	JComboBox comboBox_2;
	JComboBox comboBox_3;
	JComboBox comboBox;
	Object[][] cards;
	final manipNew me =  this;
	/**
	 * Create the panel.
	 * @throws SQLException 
	 * @throws InterruptedException 
	 */
	public manipNew(final Project proj, final MainFrame p) throws InterruptedException, SQLException {
		setLayout(new BorderLayout(0, 0));
		
		JLabel label = new JLabel("Журнал манипуляций");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("Dialog", Font.BOLD, 40));
		add(label, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("566px:grow"),},
			new RowSpec[] {
				RowSpec.decode("373px:grow"),
				RowSpec.decode("31px"),}));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, "1, 1, fill, fill");
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
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
				FormSpecs.DEFAULT_ROWSPEC,
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
		
		JLabel label_1 = new JLabel("Пациент");
		panel_1.add(label_1, "2, 2, right, default");
		cards =proj.listCards();
		String[] str = new String[cards.length];
		for(int i =0;i<cards.length;i++){
			str[i] = (String) cards[i][1];
			i++;
		}
		
		 comboBox_2 = new JComboBox();
		 comboBox_2.setModel(new DefaultComboBoxModel(str));
		panel_1.add(comboBox_2, "4, 2, fill, default");
		
		JSeparator separator_1 = new JSeparator();
		panel_1.add(separator_1, "2, 4");
		
		JSeparator separator = new JSeparator();
		panel_1.add(separator, "4, 4");
		
		JLabel label_4 = new JLabel("Название манипуляции");
		panel_1.add(label_4, "2, 8, right, default");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Плевральная пункция", "Дренирование плевральной полости", "Лапорацентез"}));
		panel_1.add(comboBox_1, "4, 8, fill, default");
		
		JLabel label_3 = new JLabel("Результат манипуляции");
		panel_1.add(label_3, "2, 10, right, default");
		
		textField_2 = new JTextField();
		panel_1.add(textField_2, "4, 10, fill, default");
		textField_2.setColumns(10);
		
		JLabel label_5 = new JLabel("Диагноз после манипуляции");
		panel_1.add(label_5, "2, 12, right, default");
		
		textField_3 = new JTextField();
		panel_1.add(textField_3, "4, 12, fill, default");
		textField_3.setColumns(10);
		
		JLabel label_2 = new JLabel("Осложнения");
		panel_1.add(label_2, "2, 14, right, default");
		
		textField_1 = new JTextField();
		panel_1.add(textField_1, "4, 14, fill, default");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Способ наблюдения за пациентом");
		panel_1.add(lblNewLabel, "2, 16, right, default");
		
		 comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"амбулаторно", "стационарно"}));
		panel_1.add(comboBox, "4, 16, fill, default");
		
		JSeparator separator_2 = new JSeparator();
		panel_1.add(separator_2, "2, 18");
		
		JSeparator separator_3 = new JSeparator();
		panel_1.add(separator_3, "4, 18");
		
		JLabel label_6 = new JLabel("Манипуляцию производил");
		panel_1.add(label_6, "2, 20, right, default");
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(proj.listSpec()));
		panel_1.add(comboBox_3, "4, 20, fill, default");
		
		JToolBar toolBar = new JToolBar();
		panel.add(toolBar, "1, 2, fill, top");
		
		JButton btnNewButton = new JButton("Отмена");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				manipJornal c;
				try {
					c = new manipJornal(proj, p);
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
				TherapeuticDiagnosticManipulationsJournal j = new TherapeuticDiagnosticManipulationsJournal();
				j.setComplication(textField_1.getText());
				//j.setObservationmethod(comboBox.getSelectedItem().toString());
				Manipulation manip= new Manipulation();
				manip.setDatetime(new Timestamp(System.currentTimeMillis()));
				manip.setDiagnosisafter(textField_2.getText());
				manip.setResult(textField_3.getText());
				j.setManipulation(manip);
				try {
					proj.newMan(manip);
				} catch (InterruptedException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					proj.newManip(j);
				} catch (InterruptedException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				

				manipJornal c;
				try {
					c = new manipJornal(proj, p);
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

	}

}
