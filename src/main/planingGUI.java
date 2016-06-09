package main;


import java.awt.EventQueue;


import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.awt.event.ActionEvent;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import com.toedter.calendar.JCalendar;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Font;
import javax.swing.JTable;
import java.awt.SystemColor;


public class planingGUI extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTable table;
	Date curr = new Date();

	JLabel lblNewLabel_1;
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat formatter = new SimpleDateFormat ("yyyy-MM-dd");


	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
	//системный дизайн
		//	javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					planingGUI frame = new planingGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public planingGUI() {
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		//contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		this.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("438px:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.LINE_GAP_ROWSPEC,
				RowSpec.decode("21px"),
				RowSpec.decode("219px:grow"),
				RowSpec.decode("23px"),}));
		
		JLabel lblNewLabel = new JLabel("ПЛАНИРОВЩИК");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 29));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		this.add(lblNewLabel, "4, 2");
		


final JCalendar calend = new JCalendar();
JLabel label = new JLabel("label");
label.setText(calend.getDate().toString());
calend.addPropertyChangeListener(new PropertyChangeListener() {
          @Override
          public void propertyChange(PropertyChangeEvent evt) {
        	  lblNewLabel_1.setText(formatter.format(calend.getDate()));
          }
      });
this.add(calend, "2, 6");
JButton btnNewButton = new JButton("<");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		cal.add(Calendar.DAY_OF_MONTH, -1);
		lblNewLabel_1.setText(formatter.format((cal.getTime())));
	}
});
this.add(btnNewButton, "2, 4");
JButton btnNewButton_1 = new JButton(">");
btnNewButton_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		cal.add(Calendar.DAY_OF_MONTH, +1);
		lblNewLabel_1.setText(formatter.format((cal.getTime())));
	}
});









lblNewLabel_1 = new JLabel(formatter.format((cal.getTime())));

		lblNewLabel_1.setFont(new Font("Dialog", Font.ITALIC, 17));
		lblNewLabel_1.setForeground(SystemColor.desktop);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(lblNewLabel_1, "4, 4");
		this.add(btnNewButton_1, "6, 4");

table = new JTable();
this.add(table, "4, 6, fill, fill");

	}

}
