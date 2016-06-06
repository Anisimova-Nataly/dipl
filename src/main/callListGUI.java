package main;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.*;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

import general.Project;
import main.SimpleGUI.ButtonEventListener;
import table.PhoneConsultationsJournal;

public class callListGUI extends JFrame  {

    private static final long serialVersionUID = 1L;
   Project proj;
  
    private Object[][] tbldata =null;
    private String[] tblheader = { "ID", "ФИО пациента", "ФИО звонившего", "Дата", "Причина звонка", "ФИО принявшего звонок", "Результат" };
	private JLabel lable = new JLabel("Журнал учета консультаций по телефону");
	private JButton call = new JButton("Зарегистрировать звонок");
	static int rez = 0;
	static boolean isPressed = false;
    public callListGUI(Project p) throws InterruptedException, SQLException {
    	
	    super("Помощник");
	    this.setBounds(100,100,1000,500);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    proj = p;
	    tbldata = proj.listCall();
	    JTable tbl = new JTable(tbldata, tblheader);
	   
	    Container container = this.getContentPane();
	    container.setLayout(new GridLayout(3,1,15,15)); 
	    container.add(lable);
        container.add(new JScrollPane(tbl));
        container.add(call);
        call.addActionListener(new ButtonEventListener());
        tbl.setFillsViewportHeight(true);
        tbl.setGridColor(Color.GREEN);
        tbl.setAutoCreateRowSorter(true);
      //  tbl.getSelectionModel().addListSelectionListener((ListSelectionListener) this);
       // tbl.getColumnModel().addColumnModelListener((TableColumnModelListener) this);
        }

    class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		rez = 1;
		isPressed = true; 

			
	}}
        
        public static int start(Project p) throws InterruptedException, SQLException {
    		callListGUI app = new callListGUI(p);
    		app.setVisible(true);
    		while (isPressed==false) {
    			TimeUnit.SECONDS.sleep(1);
    		}	
    		
    		app.dispose();
    		return rez;
    		
        }}
