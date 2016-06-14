package main;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JCalendar;

import dao.CallerDao;
import dao.ExitDao;
import general.Factory;
import general.Project;
import table.Exit;

import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.SQLException;
import java.util.Date;
import java.awt.event.ActionEvent;

public class viezdNew extends JPanel {
	private JTextField textField;
	JComboBox comboBox;
	Object[][] cards;
	Exit ex = new Exit();

	/**
	 * Create the panel.
	 * @throws SQLException 
	 * @throws InterruptedException 
	 */
	public viezdNew(final MainFrame p,final Project proj) throws InterruptedException, SQLException {
		 final viezdNew me =  this;
		setLayout(new BorderLayout(0, 0));
		ex.setDate(new Date());
		JLabel label = new JLabel("Новый выезд");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("Dialog", Font.BOLD, 40));
		add(label, BorderLayout.NORTH);
		
		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Сохранить");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				ex.setReasoncall(textField.getText());
				ex.setCardid( Integer.parseInt(cards[comboBox.getSelectedIndex()][0].toString()));;
				Factory factory = Factory.getInstance();
				ExitDao exDao = factory.getExtDao();
				try {
					exDao.addExit(ex);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				Plan c;
				c = new Plan(p, proj);
				c.setVisible(true);
				me.revalidate();
				p.contentPane.remove(me);
				p.contentPane.add(c,BorderLayout.CENTER);
				
			}
		});
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Отмена");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Plan c;
				c = new Plan(p, proj);
				c.setVisible(true);
				me.revalidate();
				p.contentPane.remove(me);
				p.contentPane.add(c,BorderLayout.CENTER);
			}
		});
		toolBar.add(btnNewButton_1);
		
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
				RowSpec.decode("default:grow"),}));
		
		JLabel label_1 = new JLabel("Пациент");
		panel.add(label_1, "2, 2, right, default");
		
		 comboBox = new JComboBox();
	
		cards =proj.listCards();
		String[] str = new String[cards.length];
		for(int i =0;i<cards.length;i++){
			str[i] = (String) cards[i][1];
			i++;
		}
		
		comboBox.setModel(new DefaultComboBoxModel(str));
		panel.add(comboBox, "4, 2, fill, default");
		
		JLabel lblNewLabel = new JLabel(" Причина выезда");
		panel.add(lblNewLabel, "2, 4, right, default");
		
		textField = new JTextField();
		panel.add(textField, "4, 4, fill, default");
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("Дата");
		panel.add(label_2, "2, 6");
		
		final JCalendar calendar = new JCalendar();
		calendar.getYearChooser().getSpinner().setFont(new Font("Dialog", Font.BOLD, 20));
		calendar.getMonthChooser().getComboBox().setFont(new Font("Dialog", Font.BOLD, 12));
		calendar.addPropertyChangeListener(new PropertyChangeListener() {
	          @Override
	          public void propertyChange(PropertyChangeEvent evt) {
	        	  ex.setDate(calendar.getDate());
	          }
	      });
		panel.add(calendar, "4, 6, fill, fill");

	}

}
