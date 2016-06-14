package main;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Component;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;

import dao.CardDao;
import dao.ListOsmotraDao;
import general.Factory;
import general.Project;

import main.tryTable.JTableModel;

import java.awt.Font;
import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Cards extends JPanel {
	private JTable table;
	 private static Object[][] tbldata =null;
	 private static String[] tblheader = { "ID карты", "ФИО пациента", "Год рождения","Просмотр","Листы осмотра","Удалить" };
	 final    Cards me =  this;
	  static int len;
	  static Project pr;
	   static MainFrame par;
	 
	 public static class JTableModel extends AbstractTableModel {
			private static final long serialVersionUID = 1L;
			private static final String[] COLUMN_NAMES = tblheader;
			private static final Class<?>[] COLUMN_TYPES = new Class<?>[] {Object.class, Object.class,Object.class, JButton.class, JButton.class,  JButton.class};
			
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
					case 1: return tbldata[rowIndex][1];
					case 2: return tbldata[rowIndex][2];
					case 3: final JButton button1 = new JButton(COLUMN_NAMES[columnIndex]);
							button1.addActionListener(new ActionListener() {
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
							return button1;
					case 4: final JButton button2 = new JButton(COLUMN_NAMES[columnIndex]);
					button2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							Lists li;
							try {
								Factory factory = Factory.getInstance();
								CardDao zurDao = factory.getCardDao();
								
								li = new Lists(pr, par,zurDao.getCard(Integer.parseInt(tbldata[rowIndex][0].toString())));
								li.setVisible(true);
								
								par.contentPane.removeAll();
								par.contentPane.revalidate();
								par.contentPane.add(li,BorderLayout.CENTER);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					});
					return button2;
					case 5: final JButton button3 = new JButton(COLUMN_NAMES[columnIndex]);
					button3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
						
							try {
								pr.delCard(Integer.parseInt(tbldata[rowIndex][0].toString()));
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
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
	 
	 
	 
	 
	 
	 
	 
	 
	/**
	 * Create the panel.
	 * @throws SQLException 
	 * @throws InterruptedException 
	 */
	public Cards(final Project proj, final MainFrame p) throws InterruptedException, SQLException {
		//System.out.print("hey!");
		setLayout(new BorderLayout(0, 0));
		pr = proj;
		par=p;
		JLabel lblNewLabel = new JLabel("Амбулаторные карты");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		add(lblNewLabel, BorderLayout.NORTH);
		
		table = new JTable();
		//
		//
	
		
		JToolBar toolBar = new JToolBar();
		add(toolBar, BorderLayout.SOUTH);
		final JLabel lblNewLabel_1 = new JLabel("");
		JButton btnNewButton = new JButton("Новая карта");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardNew n;
				try {
					n = new CardNew(proj,p);
					n.setVisible(true);
					me.revalidate();
					p.contentPane.remove(me);
					p.contentPane.add(n,BorderLayout.CENTER);
				} catch (InterruptedException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton.setForeground(Color.DARK_GRAY);
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("На главную");
		btnNewButton_1.addActionListener(new ActionListener() {
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
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 14));
		toolBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Загрузить список");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.progressBar.revalidate();
				p.revalidate();
				p.repaint();
				try {
					tbldata = proj.listCards();
					
					System.out.print(tbldata.length);
				} catch (InterruptedException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				len = tbldata.length;
				table = new JTable(new JTableModel()); 
				JScrollPane scrollPane = new JScrollPane(table);
				table.setFillsViewportHeight(true);	

				TableCellRenderer buttonRenderer = new JTableButtonRenderer();
				table.getColumn("Просмотр").setCellRenderer(buttonRenderer);
				table.getColumn("Листы осмотра").setCellRenderer(buttonRenderer);
				table.getColumn("Удалить").setCellRenderer(buttonRenderer);
				table.addMouseListener(new JTableButtonMouseListener(table));
			    //JTable tbl = new JTable(tbldata, tblheader);
			    me.remove(lblNewLabel_1);
				me.add(new JScrollPane(table), BorderLayout.CENTER);
				me.repaint();
				
			}
		});
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 14));
		toolBar.add(btnNewButton_2);
		
		
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		//String path = "tel.png";
		//URL imgURL = TestFrame.class.getResource(path);
		lblNewLabel_1.setIcon(new ImageIcon("src/img/cards.png"));
		add(lblNewLabel_1, BorderLayout.CENTER);

		
	}

}

