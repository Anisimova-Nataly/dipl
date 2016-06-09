package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JProgressBar;

public class MainFrame extends JFrame {

	public JPanel contentPane;
	public JProgressBar progressBar;
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
		super("Помощник");
		ImageIcon icon = new ImageIcon("/Bowl_hygeia_darkred.svg");
		setIconImage(icon.getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	//	planingGUI pl = new planingGUI(null);
		StartPanal st = new StartPanal(this);
		
		//System.out.println(pl.cal.getTime());
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		progressBar = new JProgressBar();
		progressBar.setIndeterminate(true);
		progressBar.setVisible(false);
		contentPane.add(progressBar, BorderLayout.SOUTH);

					contentPane.add(st,BorderLayout.CENTER);
					System.out.println(this);
	
	}

}
