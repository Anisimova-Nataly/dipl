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

public class listNew extends JPanel {

	/**
	 * Create the panel.
	 */
	public listNew() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel label = new JLabel("Лист осмотра");
		label.setFont(new Font("Dialog", Font.BOLD, 30));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		add(label, BorderLayout.NORTH);
		
		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.SOUTH);
		
		JButton button = new JButton("Отмена");
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
