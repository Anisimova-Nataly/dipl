package main;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.JTabbedPane;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JTable;
import javax.swing.JTextField;
import com.toedter.calendar.JCalendar;

import dao.CardDao;
import general.Factory;
import general.Project;

public class Plan extends JPanel {
	private JTable table;
	private static Object[][] tbldata =null;
	 private static String[] tblheader = { "ID выезда", "ФИО пациента","Просмотр карты","Удалить" };
	  static int len;
	JLabel label_2;
	JLabel label_1;
	Date curr = new Date();
	  static Project pr;
	   static MainFrame par;

	public static class JTableModel extends AbstractTableModel {
		private static final long serialVersionUID = 1L;
		private static final String[] COLUMN_NAMES = tblheader;
		private static final Class<?>[] COLUMN_TYPES = new Class<?>[] {Object.class, Object.class, JButton.class,  JButton.class};
		
		@Override public int getColumnCount() {
			return COLUMN_NAMES.length;
		}

		@Override public int getRowCount() {
			return len;
		}
		
		@Override public String getColumnName(int columnIndex) {
	        return COLUMN_NAMES[columnIndex];
	    }
		
		@Override public Class<?> getColumnClass(int columnIndex) {
			return COLUMN_TYPES[columnIndex];
		}

		@Override public Object getValueAt(final int rowIndex, final int columnIndex) {
			switch (columnIndex) {
				case 0: return tbldata[rowIndex][0];
				case 1: try {
					return pr.getCard(Integer.parseInt((tbldata[rowIndex][1].toString()))).getPacient().getSurname();
				} catch (NumberFormatException | InterruptedException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				case 3: final JButton button1 = new JButton(COLUMN_NAMES[columnIndex]);
						button1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								try {
									pr.delExit(Integer.parseInt(tbldata[rowIndex][0].toString()));
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						});
						return button1;
				case 2: final JButton button3 = new JButton(COLUMN_NAMES[columnIndex]);
				button3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					
						CardEdit edit;
						try {
							Factory factory = Factory.getInstance();
							CardDao zurDao = factory.getCardDao();
							
							edit = new CardEdit(pr, par,zurDao.getCard(Integer.parseInt(tbldata[rowIndex][0].toString())));
							edit.setVisible(true);
							
							par.contentPane.removeAll();
							par.contentPane.revalidate();
							par.contentPane.add(edit,BorderLayout.CENTER);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					
						
						
					}
				});
				return button3;
				default: return "Error";
			}
		}	
	}

 private static class JTableButtonRenderer implements TableCellRenderer {		
		@Override public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
			JButton button = (JButton)value;
			if (isSelected) {
				button.setForeground(table.getSelectionForeground());
				button.setBackground(table.getSelectionBackground());
		    } else {
		    	button.setForeground(table.getForeground());
		    	button.setBackground(UIManager.getColor("Button.background"));
		    }
			return button;	
		}
	}
 
	private static class JTableButtonMouseListener extends MouseAdapter {
		private final JTable table;
		
		public JTableButtonMouseListener(JTable table) {
			this.table = table;
		}

		public void mouseClicked(MouseEvent e) {
			int column = table.getColumnModel().getColumnIndexAtX(e.getX());
			int row    = e.getY()/table.getRowHeight(); 

			if (row < table.getRowCount() && row >= 0 && column < table.getColumnCount() && column >= 0) {
			    Object value = table.getValueAt(row, column);
			    if (value instanceof JButton) {
			    	((JButton)value).doClick();
			    }
			}
		}
	}
 
	
	
	
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat formatter = new SimpleDateFormat ("yyyy-MM-dd");
	final Plan me =  this;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Plan(final MainFrame p,final Project proj) {
		
		pr = proj;
		par=p;
		setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.SOUTH);
		
		JButton button = new JButton("На главную");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				StartPanal st;
				try {
					st = new StartPanal(p);
					st.setVisible(true);
					me.revalidate();
					p.contentPane.remove(me);
					p.contentPane.add(st,BorderLayout.CENTER);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}

				
				
			}
		});
		toolBar.add(button);
		
		JButton button_1 = new JButton("Карта");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					tryMap map = new tryMap();
					map.setVisible(true);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		toolBar.add(button_1);
		
		JLabel label = new JLabel("ПЛАНИРОВЩИК");
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 40));
		add(label, BorderLayout.NORTH);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Маршрут", null, panel_6, null);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		
		try {
			tbldata = proj.listExs();
		} catch (InterruptedException | SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		len = tbldata.length;
		table = new JTable(new JTableModel()); 
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);	

		TableCellRenderer buttonRenderer = new JTableButtonRenderer();
		table.getColumn("Просмотр карты").setCellRenderer(buttonRenderer);
		table.getColumn("Удалить").setCellRenderer(buttonRenderer);
		table.addMouseListener(new JTableButtonMouseListener(table));
		panel_6.add(table, BorderLayout.CENTER);
		
		JToolBar toolBar_2 = new JToolBar();
		panel_6.add(toolBar_2, BorderLayout.NORTH);
		
		label_2 = new JLabel(formatter.format(curr));
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		toolBar_2.add(label_2);
		
		JButton button_4 = new JButton("Добавить выезд");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				viezdNew st;
				try {
					st = new viezdNew(p,proj);
					st.setVisible(true);
					me.revalidate();
					p.contentPane.remove(me);
					p.contentPane.add(st,BorderLayout.CENTER);
				} catch (InterruptedException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
				
			}
		});
		toolBar_2.add(button_4);
		
		JPanel panel_4 = new JPanel();
		panel_6.add(panel_4, BorderLayout.SOUTH);
		
		JLabel label_3 = new JLabel("Километраж:");
		panel_4.add(label_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		panel_4.add(textField);
		
		JButton button_5 = new JButton("Сохранить");
		panel_4.add(button_5);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Дата", null, panel_7, null);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar_1 = new JToolBar();
		panel_7.add(toolBar_1, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		toolBar_1.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton button_2 = new JButton("<");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal.add(Calendar.DAY_OF_MONTH, -1);
				label_1.setText(formatter.format((cal.getTime())));
				label_2.setText(formatter.format((cal.getTime())));
			}
		});
		panel_2.add(button_2);
		
		label_1 = new JLabel(formatter.format(curr));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(SystemColor.desktop);
		label_1.setFont(new Font("Dialog", Font.ITALIC, 17));
		panel_2.add(label_1);
		
		JButton button_3 = new JButton(">");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal.add(Calendar.DAY_OF_MONTH, +1);
				label_1.setText(formatter.format((cal.getTime())));
				label_2.setText(formatter.format((cal.getTime())));
			}
		});
		panel_2.add(button_3);
		
		final JCalendar calendar = new JCalendar();
		calendar.getMonthChooser().getComboBox().setFont(new Font("Dialog", Font.BOLD, 12));
		calendar.getYearChooser().getSpinner().setFont(new Font("Dialog", Font.BOLD, 20));
		calendar.addPropertyChangeListener(new PropertyChangeListener() {
	          @Override
	          public void propertyChange(PropertyChangeEvent evt) {
	        	  cal.add(Calendar.DAY_OF_MONTH, -1);
	        	  label_1.setText(formatter.format(calendar.getDate()));
	        	  label_2.setText(formatter.format(calendar.getDate()));
	          }


	      });
		panel_7.add(calendar, BorderLayout.CENTER);

	}

}
