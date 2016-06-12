package main;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JTable;
import javax.swing.JTextField;
import com.toedter.calendar.JCalendar;

import general.Project;

public class Plan extends JPanel {
	private JTextField textField;
	private JTable table;
	JLabel label_2;
	JLabel label_1;
	Date curr = new Date();

	
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat formatter = new SimpleDateFormat ("yyyy-MM-dd");
	final Plan me =  this;

	/**
	 * Create the panel.
	 */
	public Plan(final MainFrame p,Project proj) {
		setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.SOUTH);
		
		JButton button = new JButton("На главную");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				StartPanal st;
				try {
					st = new StartPanal(p);
					st.setVisible(true);
					me.revalidate();
					p.contentPane.remove(me);
					p.contentPane.add(st,BorderLayout.CENTER);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}

				
				
			}
		});
		toolBar.add(button);
		
		JButton button_1 = new JButton("Карта");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					tryMap map = new tryMap();
					map.setVisible(true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		toolBar.add(button_1);
		
		JLabel label = new JLabel("ПЛАНИРОВЩИК");
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 40));
		add(label, BorderLayout.NORTH);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Маршрут", null, panel_6, null);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		panel_6.add(table, BorderLayout.CENTER);
		
		JToolBar toolBar_2 = new JToolBar();
		panel_6.add(toolBar_2, BorderLayout.NORTH);
		
		label_2 = new JLabel(formatter.format(curr));
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		toolBar_2.add(label_2);
		
		JButton button_4 = new JButton("Добавить выезд");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		toolBar_2.add(button_4);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Дата", null, panel_7, null);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar_1 = new JToolBar();
		panel_7.add(toolBar_1, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		toolBar_1.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton button_2 = new JButton("<");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal.add(Calendar.DAY_OF_MONTH, -1);
				label_1.setText(formatter.format((cal.getTime())));
				label_2.setText(formatter.format((cal.getTime())));
			}
		});
		panel_2.add(button_2);
		
		label_1 = new JLabel(formatter.format(curr));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(SystemColor.desktop);
		label_1.setFont(new Font("Dialog", Font.ITALIC, 17));
		panel_2.add(label_1);
		
		JButton button_3 = new JButton(">");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal.add(Calendar.DAY_OF_MONTH, +1);
				label_1.setText(formatter.format((cal.getTime())));
				label_2.setText(formatter.format((cal.getTime())));
			}
		});
		panel_2.add(button_3);
		
		final JCalendar calendar = new JCalendar();
		calendar.getMonthChooser().getComboBox().setFont(new Font("Dialog", Font.BOLD, 12));
		calendar.getYearChooser().getSpinner().setFont(new Font("Dialog", Font.BOLD, 20));
		calendar.addPropertyChangeListener(new PropertyChangeListener() {
	          @Override
	          public void propertyChange(PropertyChangeEvent evt) {
	        	  cal.add(Calendar.DAY_OF_MONTH, -1);
	        	  label_1.setText(formatter.format(calendar.getDate()));
	        	  label_2.setText(formatter.format(calendar.getDate()));
	          }


	      });
		panel_7.add(calendar, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setToolTipText("");
		tabbedPane.addTab("Бригада", null, panel_1, null);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel_1.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));
		
		JPanel panel_5 = new JPanel();
		panel_3.add(panel_5);
		
		JLabel label_3 = new JLabel("Километраж:");
		panel_5.add(label_3);
		
		textField = new JTextField();
		panel_5.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Сохранить");
		panel_5.add(btnNewButton);

	}

}
