package main;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import general.Project;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import table.Caller;
import table.ConsultationResult;
import table.PhoneConsultationsJournal;

import javax.swing.DefaultComboBoxModel;

public class callNew extends JPanel {
	final callNew me =  this;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	JComboBox comboBox;
	JComboBox comboBox_1;
	JRadioButton radioButton;
	Object[][] cards;
	private JTextField textField_3;
	/**
	 * Create the panel.
	 * @throws SQLException 
	 * @throws InterruptedException 
	 */
	public callNew(final Project proj, final MainFrame p) throws InterruptedException, SQLException {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Прием звонка");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		panel.add(toolBar, BorderLayout.SOUTH);
		
		JButton btnNewButton_1 = new JButton("Отмена");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					callJornal c;
					try {
						c = new callJornal(proj, p);
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
		
		JButton btnNewButton = new JButton("Сохранить");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PhoneConsultationsJournal ph = new PhoneConsultationsJournal();
				ph.setCardid( Integer.parseInt(cards[comboBox.getSelectedIndex()][0].toString()));
				ph.setReason((String) comboBox_1.getSelectedItem());
				Caller caller = new Caller();
				caller.setName(textField_2.getText());
				caller.setSurname(textField.getText());
				caller.setOtchestvo(textField_1.getText());
				caller.setPhoneConsultationsJournal(ph);
				ConsultationResult res = new ConsultationResult();
				res.setPsychologicalhelp(radioButton.isSelected());
				res.setReccommendations(textField_3.getText());
				try {
					proj.newResult(res);
					proj.newCaller(caller);
				} catch (InterruptedException | SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			
				ph.setCallerid(caller.getId());
				

				ph.setConsultationResultId(res.getId());
				ph.setSpecialistid(4);
				ph.setDate( new java.sql.Date( new java.util.Date().getTime()) );
				try {
			
					proj.newCall(ph);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				callJornal c;
				try {
					c = new callJornal(proj, p);
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
		
		JButton button = new JButton("Сохранить и назначить выезд");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PhoneConsultationsJournal ph = new PhoneConsultationsJournal();
				ph.setCardid( Integer.parseInt(cards[comboBox.getSelectedIndex()][0].toString()));
				ph.setReason((String) comboBox_1.getSelectedItem());
				Caller caller = new Caller();
				caller.setName(textField_2.getText());
				caller.setSurname(textField.getText());
				caller.setOtchestvo(textField_1.getText());
				caller.setPhoneConsultationsJournal(ph);
				ConsultationResult res = new ConsultationResult();
				res.setPsychologicalhelp(radioButton.isSelected());
				res.setReccommendations(textField_3.getText());
				try {
					proj.newResult(res);
					proj.newCaller(caller);
				} catch (InterruptedException | SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			
				ph.setCallerid(caller.getId());
				

				ph.setConsultationResultId(res.getId());
				ph.setSpecialistid(4);
				ph.setDate( new java.sql.Date( new java.util.Date().getTime()) );
				try {
			
					proj.newCall(ph);
					
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				Plan pl;
				pl = new Plan(p,proj);
				pl.setVisible(true);
				me.revalidate();
				p.contentPane.remove(me);
				p.contentPane.add(pl,BorderLayout.CENTER);
				
			}	
		});
		toolBar.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
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
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),}));
		
		JLabel label = new JLabel("Пациент");
		panel_1.add(label, "2, 2, right, default");
		
		 comboBox = new JComboBox();
		cards =proj.listCards();
		String[] str = new String[cards.length];
		for(int i =0;i<cards.length;i++){
			str[i] = (String) cards[i][1];
			i++;
		}
		comboBox.setModel(new DefaultComboBoxModel(str));
		panel_1.add(comboBox, "4, 2, fill, default");
		
		JSeparator separator = new JSeparator();
		panel_1.add(separator, "2, 4");
		
		JSeparator separator_1 = new JSeparator();
		panel_1.add(separator_1, "4, 4");
		
		JLabel label_1 = new JLabel("Звонивший");
		panel_1.add(label_1, "2, 6, right, default");
		
		JLabel lblNewLabel_2 = new JLabel("Фамилияl");
		panel_1.add(lblNewLabel_2, "2, 8, right, default");
		
		textField = new JTextField();
		panel_1.add(textField, "4, 8, fill, default");
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Имя");
		panel_1.add(lblNewLabel_3, "2, 10, right, default");
		
		textField_2 = new JTextField();
		panel_1.add(textField_2, "4, 10, fill, default");
		textField_2.setColumns(10);
		
		JLabel label_3 = new JLabel("Отчество");
		panel_1.add(label_3, "2, 12, right, default");
		
		textField_1 = new JTextField();
		panel_1.add(textField_1, "4, 12, fill, default");
		textField_1.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		panel_1.add(separator_2, "2, 14");
		
		JSeparator separator_3 = new JSeparator();
		panel_1.add(separator_3, "4, 14");
		
		JLabel lblNewLabel_1 = new JLabel("Причина звонка");
		panel_1.add(lblNewLabel_1, "2, 16, right, default");
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Изменение даты выезда", "Отмена выезда", "Усиление боли", "Ухудшение общего состояния", "Усиление отдышки", "Даны рекомендации"}));
		panel_1.add(comboBox_1, "4, 16, fill, default");
		
		JSeparator separator_4 = new JSeparator();
		panel_1.add(separator_4, "2, 18");
		
		JSeparator separator_5 = new JSeparator();
		panel_1.add(separator_5, "4, 18");
		
		JLabel label_2 = new JLabel("Результат");
		panel_1.add(label_2, "2, 20, right, default");
		
		textField_3 = new JTextField();
		panel_1.add(textField_3, "4, 20, fill, default");
		textField_3.setColumns(10);
		
		radioButton = new JRadioButton("Оказана психологическая поддержка");
		panel_1.add(radioButton, "4, 22");
		
		JSeparator separator_7 = new JSeparator();
		panel_1.add(separator_7, "2, 26");
		
		JSeparator separator_6 = new JSeparator();
		panel_1.add(separator_6, "4, 26");
		
		JLabel label_4 = new JLabel("Звонок принял");
		panel_1.add(label_4, "2, 28, right, default");
		
		JComboBox comboBox_2 = new JComboBox();
		
		
		
		comboBox_2.setModel(new DefaultComboBoxModel(proj.listSpec()));
		panel_1.add(comboBox_2, "4, 28, fill, default");

	}

}
