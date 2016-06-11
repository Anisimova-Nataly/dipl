package main;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import general.Project;
import table.Card;
import table.Pacient;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;

public class CardNew extends JPanel {
	final CardNew me =  this;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	JComboBox comboBox_1;
	JRadioButton rdbtnNewRadioButton;
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat formatter = new SimpleDateFormat ("yyyy-MM-dd");
	SimpleDateFormat formatter1 = new SimpleDateFormat ("dd.mm.yyyy");
	/**
	 * Create the panel.
	 */
	public CardNew(final Project proj, final MainFrame p) {
		setLayout(new BorderLayout(0, 0));
		
		JLabel label = new JLabel("Новая амбулаторная карта");
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("Dialog", Font.BOLD, 25));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		add(label, BorderLayout.NORTH);
		
		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Сохранить");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Card card = new Card();
				card.setReasondesease(textField_10.getText());
				card.setDate(cal.getTime());
				if(!textField_9.getText().isEmpty()){
				card.setPhonecontact(BigInteger.valueOf(Long.parseLong(textField_9.getText())));}
				try {
					card.setFirstvisit(formatter1.parse(textField_7.getText()));
					card.setFirstvisit(formatter1.parse(textField_8.getText()));
				} catch (ParseException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				Pacient pac = new Pacient();
				pac.setSurname(textField.getText());
				pac.setName(textField_1.getText());
				pac.setOtchestvo(textField_2.getText());
				pac.setSex(comboBox_1.getSelectedItem().toString());;
				pac.setSocialpackage(rdbtnNewRadioButton.isSelected());
				
				try {
					pac.setBirthdate(formatter1.parse(textField_6.getText()));
				} catch (ParseException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				try {
					proj.newCard(card);
					proj.newPacient(pac);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.print(card.getDate().getTime());
				Cards c;
				try {
					c = new Cards(proj, p);
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
		
		JButton btnNewButton_1 = new JButton("Отмена");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cards c;
				try {
					c = new Cards(proj, p);
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
		add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
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
				RowSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
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
		
		JLabel label_7 = new JLabel("Карту заполнил");
		panel.add(label_7, "2, 2, right, default");
		
		JComboBox comboBox_4 = new JComboBox();
		panel.add(comboBox_4, "4, 2, fill, default");
		
		JLabel label_8 = new JLabel("Вставить сюда запись даты");
		panel.add(label_8, "4, 4");
		
		JSeparator separator_8 = new JSeparator();
		panel.add(separator_8, "2, 6");
		
		JSeparator separator_9 = new JSeparator();
		panel.add(separator_9, "4, 6");
		
		JSeparator separator_6 = new JSeparator();
		panel.add(separator_6, "2, 8");
		
		JSeparator separator_7 = new JSeparator();
		panel.add(separator_7, "4, 8");
		
		JLabel lblNewLabel = new JLabel("Фамилия");
		panel.add(lblNewLabel, "2, 10, right, default");
		
		textField = new JTextField();
		panel.add(textField, "4, 10, fill, default");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Имя");
		panel.add(lblNewLabel_1, "2, 12, right, default");
		
		textField_1 = new JTextField();
		panel.add(textField_1, "4, 12, fill, default");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Отчество");
		panel.add(lblNewLabel_2, "2, 14, right, default");
		
		textField_2 = new JTextField();
		panel.add(textField_2, "4, 14, fill, default");
		textField_2.setColumns(10);
		
		JLabel label_1 = new JLabel("Пол");
		panel.add(label_1, "2, 16, right, default");
		
		 comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Мужской", "Женский"}));
		panel.add(comboBox_1, "4, 16, fill, default");
		
		JLabel lblNewLabel_11 = new JLabel("Дата рождения");
		panel.add(lblNewLabel_11, "2, 18, right, default");
		
		textField_6 = new JFormattedTextField(new SimpleDateFormat("dd.mm.yyyy"));
		panel.add(textField_6, "4, 18, fill, default");
		textField_6.setColumns(10);
		
		 rdbtnNewRadioButton = new JRadioButton("Социальный пакет");
		panel.add(rdbtnNewRadioButton, "4, 20");
		
		JSeparator separator_1 = new JSeparator();
		panel.add(separator_1, "2, 22");
		
		JSeparator separator = new JSeparator();
		panel.add(separator, "4, 22");
		
		JLabel label_9 = new JLabel("Диагноз");
		panel.add(label_9, "2, 24, right, default");
		
		textField_11 = new JTextField();
		panel.add(textField_11, "4, 24, fill, default");
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Метастазы");
		panel.add(lblNewLabel_8, "2, 26, right, default");
		
		textField_12 = new JTextField();
		panel.add(textField_12, "4, 26, fill, default");
		textField_12.setColumns(10);
		
		JLabel label_10 = new JLabel("Другие заболевания");
		panel.add(label_10, "2, 28, right, default");
		
		textField_13 = new JTextField();
		panel.add(textField_13, "4, 28, fill, default");
		textField_13.setColumns(10);
		
		JLabel label_11 = new JLabel("Семейное древо");
		panel.add(label_11, "2, 30, right, default");
		
		textField_14 = new JTextField();
		panel.add(textField_14, "4, 30, fill, default");
		textField_14.setColumns(10);
		
		JLabel label_12 = new JLabel("История заболевания");
		panel.add(label_12, "2, 32, right, default");
		
		textField_15 = new JTextField();
		panel.add(textField_15, "4, 32, fill, default");
		textField_15.setColumns(10);
		
		JLabel label_2 = new JLabel("Телефон");
		panel.add(label_2, "2, 34, right, default");
		
		textField_5 = new JTextField();
		panel.add(textField_5, "4, 34, fill, default");
		textField_5.setColumns(10);
		
		JLabel label_13 = new JLabel("Операции");
		panel.add(label_13, "2, 36, right, default");
		
		textField_16 = new JTextField();
		panel.add(textField_16, "4, 36, fill, default");
		textField_16.setColumns(10);
		
		JLabel label_14 = new JLabel("ХТ");
		panel.add(label_14, "2, 38, right, default");
		
		textField_17 = new JTextField();
		panel.add(textField_17, "4, 38, fill, default");
		textField_17.setColumns(10);
		
		JLabel label_15 = new JLabel("ЛТ");
		panel.add(label_15, "2, 40, right, default");
		
		textField_18 = new JTextField();
		panel.add(textField_18, "4, 40, fill, default");
		textField_18.setColumns(10);
		
		JLabel label_16 = new JLabel("Исследования");
		panel.add(label_16, "2, 42, right, default");
		
		textField_19 = new JTextField();
		panel.add(textField_19, "4, 42, fill, default");
		textField_19.setColumns(10);
		
		JSeparator separator_10 = new JSeparator();
		panel.add(separator_10, "2, 44");
		
		JSeparator separator_11 = new JSeparator();
		panel.add(separator_11, "4, 44");
		
		JLabel label_3 = new JLabel("Адрес");
		panel.add(label_3, "2, 46, right, default");
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, "4, 46, fill, fill");
		panel_2.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JComboBox comboBox_2 = new JComboBox();
		panel_2.add(comboBox_2, "2, 2, fill, default");
		
		JButton button = new JButton("Добавить");
		panel_2.add(button, "2, 4");
		
		JLabel lblNewLabel_3 = new JLabel("Семейное положение");
		panel.add(lblNewLabel_3, "2, 48, right, default");
		
		textField_3 = new JTextField();
		panel.add(textField_3, "4, 48, fill, default");
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("С кем проживает");
		panel.add(lblNewLabel_4, "2, 50, right, default");
		
		textField_4 = new JTextField();
		panel.add(textField_4, "4, 50, fill, default");
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Контакты");
		panel.add(lblNewLabel_5, "2, 52, right, default");
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, "4, 52, fill, fill");
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JComboBox comboBox = new JComboBox();
		panel_1.add(comboBox, "2, 2, fill, default");
		
		JButton btnNewButton_2 = new JButton("Добавить\n");
		panel_1.add(btnNewButton_2, "2, 4");
		
		JSeparator separator_2 = new JSeparator();
		panel.add(separator_2, "2, 54");
		
		JSeparator separator_3 = new JSeparator();
		panel.add(separator_3, "4, 54");
		
		JLabel lblNewLabel_6 = new JLabel("Поликлиника");
		panel.add(lblNewLabel_6, "2, 56, right, default");
		
		JComboBox comboBox_3 = new JComboBox();
		panel.add(comboBox_3, "4, 56, fill, default");
		
		JLabel lblNewLabel_7 = new JLabel("Дата направления");
		panel.add(lblNewLabel_7, "2, 58, right, default");
		
		
		textField_7 = new JFormattedTextField(new SimpleDateFormat("dd.mm.yyyy"));
		panel.add(textField_7, "4, 58, fill, default");
		textField_7.setColumns(10);
		
		JLabel label_4 = new JLabel("Дата первого посещения");
		panel.add(label_4, "2, 60, right, default");
		
		textField_8 = new JFormattedTextField(new SimpleDateFormat("dd.mm.yyyy"));
		panel.add(textField_8, "4, 60, fill, default");
		textField_8.setColumns(10);
		
		JLabel label_5 = new JLabel("Контакт по телефону");
		panel.add(label_5, "2, 62, right, default");
		
		textField_9 = new JTextField();
		panel.add(textField_9, "4, 62, fill, default");
		textField_9.setColumns(10);
		
		JLabel label_6 = new JLabel("Причина направления");
		panel.add(label_6, "2, 64, right, default");
		
		textField_10 = new JTextField();
		panel.add(textField_10, "4, 64, fill, default");
		textField_10.setColumns(10);
		
		JSeparator separator_4 = new JSeparator();
		panel.add(separator_4, "2, 66");
		
		JSeparator separator_5 = new JSeparator();
		panel.add(separator_5, "4, 66");

	}

}
