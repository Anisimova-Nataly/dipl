package main;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

import general.Factory;
import general.Project;

public class SimpleGUI extends JFrame {
	private JButton coll = new JButton("Зарегистрировать звонок");
	private JButton plan = new JButton("Планировщик выездов");
	private JButton priem = new JButton("Журнал амбулаторного приема");
	private JButton manipul = new JButton("Журнал лечебно-диагностических манипуляций");
	private JButton cards = new JButton("Амбулаторные карты");
	private JButton stat = new JButton("Статистика");
	private JLabel label = new JLabel("                               Помощник:");
	private JLabel label1 = new JLabel("      ");
	private JLabel label2 = new JLabel("      ");
	public Project proj;
	static int rez = 0;
	static boolean isPressed = false;
	public SimpleGUI(Project p) {
	    super("Помощник");
	    this.setBounds(100,100,1000,500);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    proj = p;
	    Container container = this.getContentPane();
	  //  container.setLayout(new GridLayout(1,1,5,5));
	    container.setLayout(new GridLayout(3,3,15,15));   
	    
	    container.add(label2); 
	    container.add(label); 
	    container.add(label1); 	    
	    
	
	    
	    container.add(coll);
	    container.add(plan);
	    container.add(priem);
	    container.add(manipul);
	    container.add(stat);
	    container.add(cards);
	    
	    coll.addActionListener(new ButtonEventListener());
	    container.add(coll);
	}
	
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		rez = 2;
		isPressed = true; 

			
	}}

	public static int main(Project p ) throws InterruptedException {
		SimpleGUI app = new SimpleGUI(p );
		app.setVisible(true);
		while (isPressed==false) {
			TimeUnit.SECONDS.sleep(1);
		}	
		
		app.dispose();
		return rez;
	}
}