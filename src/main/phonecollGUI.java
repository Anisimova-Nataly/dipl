package main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import table.PhoneConsultationsJournal;

public class phonecollGUI extends JFrame {
	private JButton ok = new JButton("Сохранить");

	private JButton stat = new JButton("Статистика");
	private JLabel label = new JLabel("                               Регистрация звонка:");
	private JLabel label1 = new JLabel("      ");
	private JLabel label2 = new JLabel("      ");
	private JTextField inputReson = new JTextField("", 5);
	private JLabel Reson = new JLabel("Причина звонка:");
	private JTextField inputCard = new JTextField("", 5);
	private JLabel Card = new JLabel("Номер карты:");
	private JLabel Coller = new JLabel("Звонивший:");
	private JTextField inputColler = new JTextField("", 5);
	private JLabel Spec = new JLabel("Специалист:");
	private JTextField inputSpec = new JTextField("", 5);

	
	public static PhoneConsultationsJournal zurnal = new PhoneConsultationsJournal() ;
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
	    container.add(inputReson); 
	    container.add(Card);
	    container.add(inputCard);
	    container.add(Coller);
	    container.add(inputColler);
	    container.add(Spec);
	    container.add(inputSpec);
	
		    
	    ok.addActionListener(new ButtonEventListener());
	    container.add(ok);
	}
	
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String message = "";
			message += "Веедены данные";
			message += "Причина звонка " + inputReson.getText() + "\n";
			zurnal.setReason(inputReson.getText());
			JOptionPane.showMessageDialog(null,
		    		message,
		    		"Output",
		    	    JOptionPane.PLAIN_MESSAGE);
		}
	}

	public static PhoneConsultationsJournal start() {
		phonecollGUI app = new phonecollGUI();
		 System.out.println(zurnal.getReason());
		app.setVisible(true);
		return zurnal;
	}
}
