package main;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import general.Project;
import table.Card;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class listNew extends JPanel {
	 final listNew me =  this;
	/**
	 * Create the panel.
	 */
	public listNew(final Project proj, final MainFrame p, final Card card) {
		setLayout(new BorderLayout(0, 0));
		
		JLabel label = new JLabel("Лист осмотра");
		label.setFont(new Font("Dialog", Font.BOLD, 30));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		add(label, BorderLayout.NORTH);
		
		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.SOUTH);
		
		JButton button = new JButton("Отмена");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lists n;
				try {
					n = new Lists(proj,p,card);
					me.revalidate();
					p.contentPane.remove(me);
					p.contentPane.add(n,BorderLayout.CENTER);
					n.setVisible(true);
				} catch (InterruptedException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				

				
			}
		});
		toolBar.add(button);
		
		JButton button_1 = new JButton("Сохранить");
		toolBar.add(button_1);
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new FormLayout(new ColumnSpec[] {},
			new RowSpec[] {}));

	}

}
