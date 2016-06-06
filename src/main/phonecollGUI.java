package main;

import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

import table.PhoneConsultationsJournal;

public class phonecollGUI extends JFrame {
	private JButton ok = new JButton("Сохранить");

	private JLabel label = new JLabel("                               Регистрация звонка:");
	private JLabel label1 = new JLabel("      ");
	private JLabel Reson = new JLabel("Причина звонка:");
	private JTextField inputCard = new JTextField("", 5);
	private JLabel Card = new JLabel("ФИО пациента:");
	private JLabel Coller = new JLabel("Звонивший:");
	private JTextField inputColler = new JTextField("", 5);
	private JLabel Spec = new JLabel("Специалист:");
	String[] spec = {
			"Иванов Иван Иванович",
			"Пертов Петр Петрович",
			"Васечкин Василий Николаевич"
		};
	JComboBox comboBoxSpec = new JComboBox(spec);
	String[] value = {
			"Изменение даты выезда",
			"Отмена выезда",
			"Усиление боли",
			"Ухудшение общего состояния",
			"Усиление отдышки",
			"Даны рекомендации"
		};
	JComboBox comboBoxVal = new JComboBox(value);
	
	public static PhoneConsultationsJournal zurnal = new PhoneConsultationsJournal() ;
	static boolean isPressed = false;
	public phonecollGUI() {
	    super("Помощник");
	    this.setBounds(100,100,1000,500);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    Container container = this.getContentPane();
	  //  container.setLayout(new GridLayout(1,1,5,5));
	    container.setLayout(new GridLayout(6,2,15,15));   
	    

	    container.add(label); 
	    container.add(label1); 	    
	    container.add(Reson);
	    container.add(comboBoxVal); 
	    container.add(Card);
	    container.add(inputCard);
	    container.add(Coller);
	    container.add(inputColler);
	    container.add(Spec);
	    container.add(comboBoxSpec);
	
		    
	    ok.addActionListener(new ButtonEventListener());
	    container.add(ok);
	}
	
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String message = "";
			message += "Веедены данные";
			message += "Причина звонка " + comboBoxVal.getSelectedItem().toString() + "\n";
			zurnal.setReason(comboBoxVal.getSelectedItem().toString());
			isPressed = true;
			JOptionPane.showMessageDialog(null,
		    		message,
		    		"Output",
		    	    JOptionPane.PLAIN_MESSAGE);
		}
	}

	public PhoneConsultationsJournal start() throws InterruptedException {
		phonecollGUI app = new phonecollGUI();
		zurnal = new PhoneConsultationsJournal();
		isPressed = false;
		app.setVisible(true);
		while (isPressed==false) {
			TimeUnit.SECONDS.sleep(1);
		}	
		 //System.out.println(zurnal.getReason());
		app.setVisible(false);
		app.dispose();
		return zurnal;
		
	}
}
