package main;

import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import general.Project;
import table.Card;
import table.ListOsmotra;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;

public class listNew extends JPanel {
	 final listNew me =  this;
	 SimpleDateFormat formatter = new SimpleDateFormat ("yyyy-MM-dd");
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
	/**
	 * Create the panel.
	 * @throws SQLException 
	 * @throws InterruptedException 
	 */
	public listNew(final Project proj, final MainFrame p, final Card card) throws InterruptedException, SQLException {
		setLayout(new BorderLayout(0, 0));
		
		JLabel label = new JLabel("Новый лист осмотра");
		label.setFont(new Font("Dialog", Font.BOLD, 30));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		add(label, BorderLayout.NORTH);
		
		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.SOUTH);
		
		JButton button = new JButton("Отмена");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lists n;
				try {
					n = new Lists(proj,p,card);
					me.revalidate();
					p.contentPane.remove(me);
					p.contentPane.add(n,BorderLayout.CENTER);
					n.setVisible(true);
				} catch (InterruptedException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				

				
			}
		});
		toolBar.add(button);
		
		JButton button_1 = new JButton("Сохранить");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListOsmotra j = new ListOsmotra();
	
				j.setDateTime(new Timestamp(System.currentTimeMillis()));
				
				try {
					proj.newList(j);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				

			
			}
		});
		
		
		
		toolBar.add(button_1);
		
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
		
		JLabel label_1 = new JLabel(formatter.format(new Date()));
		panel.add(label_1, "4, 2");
		
		JLabel label_12 = new JLabel("Заполнял");
		panel.add(label_12, "2, 4, right, default");
		
		JComboBox comboBox_1 = new JComboBox(new DefaultComboBoxModel(proj.listSpec()));
		panel.add(comboBox_1, "4, 4, fill, default");
		
		JSeparator separator = new JSeparator();
		panel.add(separator, "2, 6");
		
		JSeparator separator_1 = new JSeparator();
		panel.add(separator_1, "4, 6");
		
		JLabel label_10 = new JLabel("Заключение");
		panel.add(label_10, "2, 8, right, default");
		
		textField_8 = new JTextField();
		panel.add(textField_8, "4, 8, fill, default");
		textField_8.setColumns(10);
		
		JLabel label_11 = new JLabel("Рекомендовано");
		panel.add(label_11, "2, 10, right, default");
		
		textField_9 = new JTextField();
		panel.add(textField_9, "4, 10, fill, default");
		textField_9.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		panel.add(separator_2, "2, 12");
		
		JSeparator separator_3 = new JSeparator();
		panel.add(separator_3, "4, 12");
		
		JLabel label_2 = new JLabel("причина выезда");
		panel.add(label_2, "2, 14, right, default");
		
		textField = new JTextField();
		panel.add(textField, "4, 14, fill, default");
		textField.setColumns(10);
		
		JLabel label_3 = new JLabel("жалобы");
		panel.add(label_3, "2, 16, right, default");
		
		textField_1 = new JTextField();
		panel.add(textField_1, "4, 16, fill, default");
		textField_1.setColumns(10);
		
		JLabel label_14 = new JLabel("Динамика");
		panel.add(label_14, "2, 18, right, default");
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"положительная", "отрицательная", "без динамики"}));
		panel.add(comboBox_2, "4, 18, fill, default");
		
		JLabel label_13 = new JLabel("Состояние");
		panel.add(label_13, "2, 20, right, default");
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"крайне тяжелое", "тяжелое", "средней тяжести", "удовлетворительное"}));
		panel.add(comboBox_3, "4, 20, fill, default");
		
		JLabel label_15 = new JLabel("Оценка интенсивности ХБС по ШБО");
		panel.add(label_15, "2, 22, right, default");
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"0б-нет боли", "1б-слабая", "2б-умеренная", "3б-сильная", "4б-самая сильная"}));
		panel.add(comboBox_4, "4, 22, fill, default");
		
		JLabel label_16 = new JLabel("Хбс купируется приемом");
		panel.add(label_16, "2, 24, right, default");
		
		textField_10 = new JTextField();
		panel.add(textField_10, "4, 24, fill, default");
		textField_10.setColumns(10);
		
		JLabel label_17 = new JLabel("Оценка качества жизни по ШФА");
		panel.add(label_17, "2, 26, right, default");
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"1б-нормальная", "2б-незначительно снижена", "3б-умеренно снижена", "4б-значительно снижена", "5б-минимальная"}));
		panel.add(comboBox_5, "4, 26, fill, default");
		
		JSeparator separator_4 = new JSeparator();
		panel.add(separator_4, "2, 28");
		
		JSeparator separator_5 = new JSeparator();
		panel.add(separator_5, "4, 28");
		
		JLabel label_19 = new JLabel("Кожные покровы");
		panel.add(label_19, "2, 30, right, default");
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"бледные", "бледно-розовые", "обычной окраски", "желтушные"}));
		panel.add(comboBox_7, "4, 30, fill, default");
		
		JLabel label_20 = new JLabel("В легких дыхание");
		panel.add(label_20, "2, 32, right, default");
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"визикулярное", "жесткое", "проводится во все отделы", "ослабленное"}));
		panel.add(comboBox_8, "4, 32, fill, default");
		
		JLabel label_21 = new JLabel("Тоны сердца");
		panel.add(label_21, "2, 34, right, default");
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"ритмичные", "звучные", "приглушенные", "глухие"}));
		panel.add(comboBox_9, "4, 34, fill, default");
		
		JLabel label_22 = new JLabel("Пульс на переферии");
		panel.add(label_22, "2, 36, right, default");
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"нормального наполнения", "ослабленный"}));
		panel.add(comboBox_10, "4, 36, fill, default");
		
		JLabel label_23 = new JLabel("Язык");
		panel.add(label_23, "2, 38, right, default");
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"чистый", "влажный", "сухой", "обложен налетом"}));
		panel.add(comboBox_11, "4, 38, fill, default");
		
		JRadioButton radioButton = new JRadioButton("Акт глотания не нарушен");
		panel.add(radioButton, "4, 40");
		
		JLabel label_27 = new JLabel("Диурез");
		panel.add(label_27, "2, 42, right, default");
		
		JComboBox comboBox_15 = new JComboBox();
		comboBox_15.setModel(new DefaultComboBoxModel(new String[] {"Самостоятельный", "По катетеру", "Эпицистома", "Нефростома"}));
		panel.add(comboBox_15, "4, 42, fill, default");
		
		JLabel label_26 = new JLabel("Стул");
		panel.add(label_26, "2, 44, right, default");
		
		JComboBox comboBox_14 = new JComboBox();
		comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"Регулярный", "Со склонностью к поносам", "Со склонностью к запорам", "колостома"}));
		panel.add(comboBox_14, "4, 44, fill, default");
		
		JLabel label_24 = new JLabel("Живот");
		panel.add(label_24, "2, 46, right, default");
		
		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"обычной формы", "увеличен: асцит", "увеличен: печень"}));
		panel.add(comboBox_12, "4, 46, fill, default");
		
		JLabel label_25 = new JLabel("При пальпации");
		panel.add(label_25, "2, 48, right, default");
		
		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"мягкий", "напряженный", "болезненный", "безболезненный"}));
		panel.add(comboBox_13, "4, 48, fill, default");
		
		JLabel label_18 = new JLabel("Сон");
		panel.add(label_18, "2, 50, right, default");
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"нарушен", "не нарушен"}));
		panel.add(comboBox_6, "4, 50, fill, default");
		
		JLabel label_4 = new JLabel("л/у");
		panel.add(label_4, "2, 52, right, default");
		
		textField_2 = new JTextField();
		panel.add(textField_2, "4, 52, fill, default");
		textField_2.setColumns(10);
		
		JLabel label_5 = new JLabel("пролежни");
		panel.add(label_5, "2, 54, right, default");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"есть", "отсутствуют"}));
		panel.add(comboBox, "4, 54, fill, default");
		
		JLabel label_6 = new JLabel("видимые переферические отеки");
		panel.add(label_6, "2, 56, right, default");
		
		textField_3 = new JTextField();
		panel.add(textField_3, "4, 56, fill, default");
		textField_3.setColumns(10);
		
		JLabel label_7 = new JLabel("New label");
		panel.add(label_7, "2, 58, right, default");
		
		textField_4 = new JTextField();
		panel.add(textField_4, "4, 58, fill, default");
		textField_4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("St. loc.");
		panel.add(lblNewLabel, "2, 60, right, default");
		
		textField_5 = new JTextField();
		panel.add(textField_5, "4, 60, fill, default");
		textField_5.setColumns(10);
		
		JLabel label_8 = new JLabel("АД");
		panel.add(label_8, "2, 62, right, default");
		
		textField_6 = new JTextField();
		panel.add(textField_6, "4, 62, fill, default");
		textField_6.setColumns(10);
		
		JLabel label_9 = new JLabel("ПЖК");
		panel.add(label_9, "2, 64, right, default");
		
		textField_7 = new JTextField();
		panel.add(textField_7, "4, 64, fill, default");
		textField_7.setColumns(10);

	}

}
