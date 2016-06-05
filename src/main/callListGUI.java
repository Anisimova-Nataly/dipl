package main;

import java.awt.Color;
import java.awt.Container;
import java.sql.SQLException;
import java.util.*;

import javax.swing.*;

import general.Project;
import table.PhoneConsultationsJournal;

public class callListGUI extends JFrame  {

    private static final long serialVersionUID = 1L;
   Project proj;
  
    private Object[][] tbldata =null;
    private String[] tblheader = { "ID", "ФИО пациента", "ФИО звонившего", "Дата", "Причина звонка", "ФИО принявшего звонок", "Результат" };
    

    public callListGUI(Project p) throws InterruptedException, SQLException {
    	
	    super("Помощник");
	    this.setBounds(100,100,1000,500);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    proj = p;
	    tbldata = proj.listCall();
	    JTable tbl = new JTable(tbldata, tblheader);
	   
	    Container container = this.getContentPane();
        add(new JScrollPane(tbl));
        tbl.setFillsViewportHeight(true);
        tbl.setGridColor(Color.GREEN);
        tbl.setAutoCreateRowSorter(true);
      //  tbl.getSelectionModel().addListSelectionListener((ListSelectionListener) this);
       // tbl.getColumnModel().addColumnModelListener((TableColumnModelListener) this);
        }

        
        
        public static void start(Project p) throws InterruptedException, SQLException {
    		callListGUI app = new callListGUI(p);
    		app.setVisible(true);

    		
        }}
