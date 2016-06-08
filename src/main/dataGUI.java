package main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import java.awt.Choice;
import java.awt.Label;
import java.util.Calendar;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dataGUI extends JDialog {

	private final JPanel contentPanel = new JPanel();
	static Calendar cal = Calendar.getInstance();
	JSpinner spinnerDay;
	JSpinner spinnerYear;
	JComboBox comboBox;
	public static boolean isPressed= false;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		isPressed = false;
		try {
			
			dataGUI dialog = new dataGUI();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//cal.add(Calendar.DAY_OF_MONTH, );
		//return cal;
	}

	/**
	 * Create the dialog.
	 */
	public dataGUI() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new MigLayout("", "[28px][grow][][70px]", "[20px][][][][][]"));
		{
			JLabel lblNewLabel = new JLabel("Вберите дату");
			lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 29));
			contentPanel.add(lblNewLabel, "cell 1 0,alignx right,aligny center");
		}
		{
			JLabel lblNewLabel_1 = new JLabel("День");
			lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
			contentPanel.add(lblNewLabel_1, "cell 1 2");
		}
		{
			 spinnerDay = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
			contentPanel.add(spinnerDay, "cell 2 2,growx");
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Месяц");
			lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 20));
			contentPanel.add(lblNewLabel_2, "cell 1 3,alignx left");
		}
		{
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"}));
			contentPanel.add(comboBox, "cell 2 3,growx");
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Год");
			lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 20));
			contentPanel.add(lblNewLabel_3, "cell 1 4");
		}
		{
			 spinnerYear = new JSpinner(new SpinnerNumberModel(1990, 1990, 2100, 1));
			contentPanel.add(spinnerYear, "cell 2 4,growx");
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						isPressed = true; 
						cal.set(Integer.parseInt(spinnerYear.getValue().toString()), comboBox.getSelectedIndex(), Integer.parseInt(spinnerDay.getValue().toString()));
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
