package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JProgressBar;

public class MainFrame extends JFrame {

	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws InterruptedException 
	 */
	
	

	
	
	public MainFrame() throws InterruptedException {
		Status status = new Status();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		planingGUI pl = new planingGUI(null);
		StartPanal st = new StartPanal(this);
		
		//System.out.println(pl.cal.getTime());
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setVisible(false);
		contentPane.add(progressBar, BorderLayout.SOUTH);
		//while(true){
			System.out.println(status.main);
			//if(status.isNew==true){
				//if(status.main==true){
					contentPane.add(st,BorderLayout.CENTER);
					//}
				//else{if(status.planing==true){contentPane.add(pl,BorderLayout.CENTER);}}
				//status.isNew=false;
		//	}
			//TimeUnit.SECONDS.sleep(5);
			//contentPane.add(pl,BorderLayout.CENTER);
			//	} 
	}

}
