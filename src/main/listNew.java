package main;

import javax.swing.JPanel;
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
import java.awt.event.ActionListener;
import java.sql.SQLException;
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
	/**
	 * Create the panel.
	 */
	public listNew(final Project proj, final MainFrame p, final Card card) {
		setLayout(new BorderLayout(0, 0));
		
		JLabel label = new JLabel("Лист осмотра");
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
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel label_1 = new JLabel(formatter.format(new Date()));
		panel.add(label_1, "4, 2");
		
		JSeparator separator = new JSeparator();
		panel.add(separator, "2, 4");
		
		JSeparator separator_1 = new JSeparator();
		panel.add(separator_1, "4, 4");
		
		JLabel label_10 = new JLabel("Заключение");
		panel.add(label_10, "2, 6, right, default");
		
		textField_8 = new JTextField();
		panel.add(textField_8, "4, 6, fill, default");
		textField_8.setColumns(10);
		
		JLabel label_11 = new JLabel("Рекомендовано");
		panel.add(label_11, "2, 8, right, default");
		
		textField_9 = new JTextField();
		panel.add(textField_9, "4, 8, fill, default");
		textField_9.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		panel.add(separator_2, "2, 10");
		
		JSeparator separator_3 = new JSeparator();
		panel.add(separator_3, "4, 10");
		
		JLabel label_2 = new JLabel("причина выезда");
		panel.add(label_2, "2, 12, right, default");
		
		textField = new JTextField();
		panel.add(textField, "4, 12, fill, default");
		textField.setColumns(10);
		
		JLabel label_3 = new JLabel("жалобы");
		panel.add(label_3, "2, 14, right, default");
		
		textField_1 = new JTextField();
		panel.add(textField_1, "4, 14, fill, default");
		textField_1.setColumns(10);
		
		JLabel label_4 = new JLabel("л/у");
		panel.add(label_4, "2, 16, right, default");
		
		textField_2 = new JTextField();
		panel.add(textField_2, "4, 16, fill, default");
		textField_2.setColumns(10);
		
		JLabel label_5 = new JLabel("пролежни");
		panel.add(label_5, "2, 18, right, default");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"есть", "отсутствуют"}));
		panel.add(comboBox, "4, 18, fill, default");
		
		JLabel label_6 = new JLabel("видимые переферические отеки");
		panel.add(label_6, "2, 20, right, default");
		
		textField_3 = new JTextField();
		panel.add(textField_3, "4, 20, fill, default");
		textField_3.setColumns(10);
		
		JLabel label_7 = new JLabel("New label");
		panel.add(label_7, "2, 22, right, default");
		
		textField_4 = new JTextField();
		panel.add(textField_4, "4, 22, fill, default");
		textField_4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("St. loc.");
		panel.add(lblNewLabel, "2, 24, right, default");
		
		textField_5 = new JTextField();
		panel.add(textField_5, "4, 24, fill, default");
		textField_5.setColumns(10);
		
		JLabel label_8 = new JLabel("АД");
		panel.add(label_8, "2, 26, right, default");
		
		textField_6 = new JTextField();
		panel.add(textField_6, "4, 26, fill, default");
		textField_6.setColumns(10);
		
		JLabel label_9 = new JLabel("ПЖК");
		panel.add(label_9, "2, 28, right, default");
		
		textField_7 = new JTextField();
		panel.add(textField_7, "4, 28, fill, default");
		textField_7.setColumns(10);

	}

}
