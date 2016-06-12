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
import table.PhoneConsultationsJournal;

import javax.swing.DefaultComboBoxModel;

public class callNew extends JPanel {
	final callNew me =  this;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
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
		
		JButton btnNewButton = new JButton("Сохранить");
		toolBar.add(btnNewButton);
		
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
				RowSpec.decode("default:grow"),}));
		
		JLabel label = new JLabel("Пациент");
		panel_1.add(label, "2, 2, right, default");
		
		JComboBox comboBox = new JComboBox();
		Object[][] cards =proj.listCards();
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
		
		textField = new JTextField();
		panel_1.add(textField, "4, 6, fill, default");
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		panel_1.add(textField_2, "4, 8, fill, default");
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1, "4, 10, fill, default");
		textField_1.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		panel_1.add(separator_2, "2, 12");
		
		JSeparator separator_3 = new JSeparator();
		panel_1.add(separator_3, "4, 12");
		
		JLabel lblNewLabel_1 = new JLabel("Причина звонка");
		panel_1.add(lblNewLabel_1, "2, 14, right, default");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Изменение даты выезда", "Отмена выезда", "Усиление боли", "Ухудшение общего состояния", "Усиление отдышки", "Даны рекомендации"}));
		panel_1.add(comboBox_1, "4, 14, fill, default");
		
		JSeparator separator_4 = new JSeparator();
		panel_1.add(separator_4, "2, 16");
		
		JSeparator separator_5 = new JSeparator();
		panel_1.add(separator_5, "4, 16");
		
		JLabel label_2 = new JLabel("Результат");
		panel_1.add(label_2, "2, 18, right, default");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Даны рекомендации");
		panel_1.add(rdbtnNewRadioButton, "4, 18");
		
		JRadioButton radioButton = new JRadioButton("Оказана психологическая поддержка");
		panel_1.add(radioButton, "4, 20");
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, "4, 22, fill, fill");
		panel_2.setLayout(new MigLayout("", "[225px][225px]", "[39px]"));
		
		JLabel label_3 = new JLabel("Дата выезда");
		panel_2.add(label_3, "cell 0 0,grow");
		
		textField_3 = new JTextField();
		panel_2.add(textField_3, "cell 1 0,grow");
		textField_3.setColumns(10);
		
		JSeparator separator_7 = new JSeparator();
		panel_1.add(separator_7, "2, 24");
		
		JSeparator separator_6 = new JSeparator();
		panel_1.add(separator_6, "4, 24");
		
		JLabel label_4 = new JLabel("Звонок принял");
		panel_1.add(label_4, "2, 26, right, default");
		
		JComboBox comboBox_2 = new JComboBox();
		
		
		
		comboBox_2.setModel(new DefaultComboBoxModel(proj.listSpec()));
		panel_1.add(comboBox_2, "4, 26, fill, default");

	}

}
