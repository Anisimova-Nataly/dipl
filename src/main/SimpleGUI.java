package main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
	private JButton coll = new JButton("Зарегистрировать звонок");
	private JButton plan = new JButton("Планировщик выездов");
	private JButton priem = new JButton("Журнал амбулаторного приема");
	private JButton manipul = new JButton("Журнал лечебно-диагностических манипуляций");
	private JButton cards = new JButton("Амбулаторные карты");
	private JButton stat = new JButton("Статистика");
	private JLabel label = new JLabel("Помошник:");

	
	public SimpleGUI() {
	    super("Помошник");
	    this.setBounds(100,100,1000,500);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    Container container = this.getContentPane();
	    container.setLayout(new GridLayout(1,1,5,5));
	    container.add(label); 
	    container.setLayout(new GridLayout(3,2,5,5));
	
	    
	    container.add(coll);
	    container.add(plan);
	    container.add(priem);
	    container.add(manipul);
	    container.add(stat);
	    container.add(cards);
	    
	    //button.addActionListener(new ButtonEventListener());
	    //container.add(button);
	}
	/*
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String message = "";
			message += "Button was pressed\n";
			message += "Text is " + input.getText() + "\n";
			message += (radio1.isSelected()?"Radio #1":"Radio #2") 
                                + " is selected\n"; 
			message += "CheckBox is " + ((check.isSelected())
                                ?"checked":"unchecked"); 
			JOptionPane.showMessageDialog(null,
		    		message,
		    		"Output",
		    	    JOptionPane.PLAIN_MESSAGE);
		}
	}
*/
	public static void main(String[] args) {
		SimpleGUI app = new SimpleGUI();
		app.setVisible(true);
	}
}