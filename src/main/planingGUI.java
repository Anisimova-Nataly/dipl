package main;


import java.awt.BorderLayout;
import java.awt.EventQueue;


import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
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
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JToolBar;


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
	final planingGUI me =  this;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	/*public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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
*/
	/**
	 * Create the frame.
	 */
	public planingGUI(final MainFrame p) {
		
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
				RowSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.LINE_GAP_ROWSPEC,
				RowSpec.decode("21px"),
				RowSpec.decode("219px:grow"),
				RowSpec.decode("23px"),}));
		JButton btnNewButton_2 = new JButton("на главную ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//plan pl = new planingGUI(parent);
				StartPanal st = new StartPanal(p);
				st.setVisible(true);
				me.revalidate();
				p.contentPane.remove(me);
				p.contentPane.add(st,BorderLayout.CENTER);
				
			}
		});
		add(btnNewButton_2, "2, 2");
		
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
JPanel panel = new JPanel();
add(panel, "4, 4, fill, fill");
panel.setLayout(new GridLayout(1, 0, 0, 0));
JButton btnNewButton = new JButton("<");
panel.add(btnNewButton);









lblNewLabel_1 = new JLabel(formatter.format((cal.getTime())));
panel.add(lblNewLabel_1);

		lblNewLabel_1.setFont(new Font("Dialog", Font.ITALIC, 17));
		lblNewLabel_1.setForeground(SystemColor.desktop);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
JButton btnNewButton_1 = new JButton(">");
panel.add(btnNewButton_1);
btnNewButton_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		cal.add(Calendar.DAY_OF_MONTH, +1);
		lblNewLabel_1.setText(formatter.format((cal.getTime())));
	}
});
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		cal.add(Calendar.DAY_OF_MONTH, -1);
		lblNewLabel_1.setText(formatter.format((cal.getTime())));
	}
});
this.add(calend, "2, 8");

table = new JTable();
this.add(table, "4, 8, fill, fill");
JButton button_1 = new JButton("Карта");
button_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		try {
			tryMap map = new tryMap();
			map.setVisible(true);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
});
add(button_1, "2, 10");
JButton button = new JButton("Добавить");
add(button, "4, 10");

	}

}
