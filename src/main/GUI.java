package main;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import java.awt.TextField;
import javax.swing.event.ChangeListener;

import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;

public class GUI {

	private JFrame GUI;
	private JTextField txtChart;
	
	private JTextField txtTime;
	private JTextField txtStop;
	private JDesktopPane tabArrival;
	private JSpinner spinnerAPerson1;
	private JSpinner spinnerAPerson2;
	private JSpinner spinnerAPerson3;
	private JSpinner spinnerAPerson0;
	private JTextField txtAPeople;
	private JTextField txtATime;
	private JSpinner spinnerAPerson4;
	private JSpinner spinnerAPerson5;
	private JSpinner spinnerAPerson6;
	private JSpinner spinnerAPerson7;
	private JSpinner spinnerAPerson8;
	private JSpinner spinnerAPerson9;
	private JSpinner spinnerAPerson10;
	private JSpinner spinnerAPerson11;
	private JTextField txtArrival;
	private JButton btnClear;
	private String dataLog;

	private JTextField txtAPerson1;
	private JTextField txtAPerson2;
	private JTextField txtAPerson3;
	private JTextField txtAPerson4;
	private JTextField txtAPerson7;
	private JTextField txtAPerson8;
	private JTextField txtAPerson6;
	private JTextField txtAPerson5;
	private JTextField txtAPerson11;
	private JTextField txtAPerson10;
	private JTextField txtAPerson9;
	private JTextField txtAPerson0;
	private JDesktopPane tabDeparture;
	private JTextField txtDPeople;
	private JTextField txtDTime;
	private JTextField txtDeparture;
	private JSpinner spinner;
	private JSpinner spinner_1;
	private JSpinner spinner_2;
	private JSpinner spinner_3;
	private JSpinner spinner_4;
	private JSpinner spinner_5;
	private JSpinner spinner_6;
	private JSpinner spinner_7;
	private JSpinner spinner_8;
	private JSpinner spinner_9;
	private JSpinner spinner_10;
	private JSpinner spinner_11;
	private JButton button;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//*** System algorithm ***

					
					//*** Window ***
					GUI window = new GUI();
					window.GUI.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		
		GUI = new JFrame();
		GUI.setResizable(false);
		GUI.setTitle("Queue Efficiency Calculator");
		GUI.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Xenom Hercules\\OneDrive\\Documents\\workspace\\Projects\\Java\\Romanian River Shortest Route\\icon.png"));
		GUI.setBounds(100, 100, 1366, 768);
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GUI.getContentPane().setLayout(null);
		
		JTabbedPane tabPanel = new JTabbedPane(JTabbedPane.TOP);
		tabPanel.setBackground(Color.WHITE);
		tabPanel.setBounds(0, 95, 299, 638);
		GUI.getContentPane().add(tabPanel);
		
		tabArrival = new JDesktopPane();
		tabArrival.setLayout(null);
		tabArrival.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		tabArrival.setBackground(Color.WHITE);
		tabPanel.addTab("Arrival", null, tabArrival, null);
		
		txtAPeople = new JTextField();
		txtAPeople.setText("People");
		txtAPeople.setHorizontalAlignment(SwingConstants.CENTER);
		txtAPeople.setForeground(Color.WHITE);
		txtAPeople.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtAPeople.setEditable(false);
		txtAPeople.setColumns(10);
		txtAPeople.setBackground(new Color(255, 69, 0));
		txtAPeople.setBounds(12, 54, 184, 28);
		tabArrival.add(txtAPeople);
		
		txtATime = new JTextField();
		txtATime.setText("Time");
		txtATime.setHorizontalAlignment(SwingConstants.CENTER);
		txtATime.setForeground(Color.WHITE);
		txtATime.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtATime.setEditable(false);
		txtATime.setColumns(10);
		txtATime.setBackground(new Color(255, 69, 0));
		txtATime.setBounds(208, 54, 74, 28);
		tabArrival.add(txtATime);
		
		txtArrival = new JTextField();
		txtArrival.setText("ARRIVAL");
		txtArrival.setHorizontalAlignment(SwingConstants.CENTER);
		txtArrival.setForeground(Color.WHITE);
		txtArrival.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtArrival.setEditable(false);
		txtArrival.setColumns(10);
		txtArrival.setBackground(Color.RED);
		txtArrival.setBounds(12, 13, 270, 28);
		tabArrival.add(txtArrival);
		
		spinnerAPerson0 = new JSpinner();
		spinnerAPerson0.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
			}
		});
		
		spinnerAPerson0.setBounds(208, 89, 74, 28);
		tabArrival.add(spinnerAPerson0);
		
		spinnerAPerson1 = new JSpinner();
		spinnerAPerson1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
			}
		});
		
		spinnerAPerson1.setBounds(208, 124, 74, 28);
		tabArrival.add(spinnerAPerson1);
		
		spinnerAPerson2 = new JSpinner();
		spinnerAPerson2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
			}
		});
		
		spinnerAPerson2.setBounds(208, 159, 74, 28);
		tabArrival.add(spinnerAPerson2);
		
		spinnerAPerson3 = new JSpinner();
		spinnerAPerson3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
			}
		});
		
		spinnerAPerson3.setBounds(208, 194, 74, 28);
		tabArrival.add(spinnerAPerson3);
		
		spinnerAPerson4 = new JSpinner();
		spinnerAPerson4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
			}
		});
		
		spinnerAPerson4.setBounds(208, 229, 74, 28);
		tabArrival.add(spinnerAPerson4);
		
		spinnerAPerson5 = new JSpinner();
		spinnerAPerson5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
			}
		});
		
		spinnerAPerson5.setBounds(208, 264, 74, 28);
		tabArrival.add(spinnerAPerson5);
		
		spinnerAPerson6 = new JSpinner();
		spinnerAPerson6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
			}
		});
		
		spinnerAPerson6.setBounds(208, 299, 74, 28);
		tabArrival.add(spinnerAPerson6);
		
		spinnerAPerson7 = new JSpinner();
		spinnerAPerson7.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
			}
		});
		
		spinnerAPerson7.setBounds(208, 334, 74, 28);
		tabArrival.add(spinnerAPerson7);
		
		spinnerAPerson8 = new JSpinner();
		spinnerAPerson8.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				
			}
		});
		
		spinnerAPerson8.setBounds(208, 369, 74, 28);
		tabArrival.add(spinnerAPerson8);
		
		spinnerAPerson9 = new JSpinner();
		spinnerAPerson9.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				
			}
		});
		
		spinnerAPerson9.setBounds(208, 404, 74, 28);
		tabArrival.add(spinnerAPerson9);
		
		spinnerAPerson10 = new JSpinner();
		spinnerAPerson10.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
			}
		});
		
		spinnerAPerson10.setBounds(208, 439, 74, 28);
		tabArrival.add(spinnerAPerson10);
		
		spinnerAPerson11 = new JSpinner();
		spinnerAPerson11.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
			}
		});
		
		spinnerAPerson11.setBounds(208, 474, 74, 28);
		tabArrival.add(spinnerAPerson11);
		
		JButton btnApply = new JButton("APPLY");
		btnApply.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btnApply.setForeground(Color.DARK_GRAY);
		btnApply.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnApply.setBounds(77, 561, 141, 34);
		tabArrival.add(btnApply);
		
		txtAPerson1 = new JTextField();
		txtAPerson1.setBounds(12, 124, 184, 28);
		tabArrival.add(txtAPerson1);
		txtAPerson1.setColumns(10);
		
		txtAPerson2 = new JTextField();
		txtAPerson2.setColumns(10);
		txtAPerson2.setBounds(12, 159, 184, 28);
		tabArrival.add(txtAPerson2);
		
		txtAPerson3 = new JTextField();
		txtAPerson3.setColumns(10);
		txtAPerson3.setBounds(12, 194, 184, 28);
		tabArrival.add(txtAPerson3);
		
		txtAPerson4 = new JTextField();
		txtAPerson4.setColumns(10);
		txtAPerson4.setBounds(12, 229, 184, 28);
		tabArrival.add(txtAPerson4);
		
		txtAPerson7 = new JTextField();
		txtAPerson7.setColumns(10);
		txtAPerson7.setBounds(12, 334, 184, 28);
		tabArrival.add(txtAPerson7);
		
		txtAPerson8 = new JTextField();
		txtAPerson8.setColumns(10);
		txtAPerson8.setBounds(12, 369, 184, 28);
		tabArrival.add(txtAPerson8);
		
		txtAPerson6 = new JTextField();
		txtAPerson6.setColumns(10);
		txtAPerson6.setBounds(12, 299, 184, 28);
		tabArrival.add(txtAPerson6);
		
		txtAPerson5 = new JTextField();
		txtAPerson5.setColumns(10);
		txtAPerson5.setBounds(12, 264, 184, 28);
		tabArrival.add(txtAPerson5);
		
		txtAPerson11 = new JTextField();
		txtAPerson11.setColumns(10);
		txtAPerson11.setBounds(12, 474, 184, 28);
		tabArrival.add(txtAPerson11);
		
		txtAPerson10 = new JTextField();
		txtAPerson10.setColumns(10);
		txtAPerson10.setBounds(12, 439, 184, 28);
		tabArrival.add(txtAPerson10);
		
		txtAPerson9 = new JTextField();
		txtAPerson9.setColumns(10);
		txtAPerson9.setBounds(12, 404, 184, 28);
		tabArrival.add(txtAPerson9);
		
		txtAPerson0 = new JTextField();
		txtAPerson0.setColumns(10);
		txtAPerson0.setBounds(12, 89, 184, 28);
		tabArrival.add(txtAPerson0);
		
		tabDeparture = new JDesktopPane();
		tabDeparture.setLayout(null);
		tabDeparture.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		tabDeparture.setBackground(Color.WHITE);
		tabPanel.addTab("Departure", null, tabDeparture, null);
		
		txtDPeople = new JTextField();
		txtDPeople.setText("People");
		txtDPeople.setHorizontalAlignment(SwingConstants.CENTER);
		txtDPeople.setForeground(Color.WHITE);
		txtDPeople.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtDPeople.setEditable(false);
		txtDPeople.setColumns(10);
		txtDPeople.setBackground(new Color(255, 69, 0));
		txtDPeople.setBounds(12, 54, 184, 28);
		tabDeparture.add(txtDPeople);
		
		txtDTime = new JTextField();
		txtDTime.setText("Time");
		txtDTime.setHorizontalAlignment(SwingConstants.CENTER);
		txtDTime.setForeground(Color.WHITE);
		txtDTime.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtDTime.setEditable(false);
		txtDTime.setColumns(10);
		txtDTime.setBackground(new Color(255, 69, 0));
		txtDTime.setBounds(208, 54, 74, 28);
		tabDeparture.add(txtDTime);
		
		txtDeparture = new JTextField();
		txtDeparture.setText("DEPARTURE");
		txtDeparture.setHorizontalAlignment(SwingConstants.CENTER);
		txtDeparture.setForeground(Color.WHITE);
		txtDeparture.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtDeparture.setEditable(false);
		txtDeparture.setColumns(10);
		txtDeparture.setBackground(Color.RED);
		txtDeparture.setBounds(12, 13, 270, 28);
		tabDeparture.add(txtDeparture);
		
		spinner = new JSpinner();
		spinner.setBounds(208, 89, 74, 28);
		tabDeparture.add(spinner);
		
		spinner_1 = new JSpinner();
		spinner_1.setBounds(208, 124, 74, 28);
		tabDeparture.add(spinner_1);
		
		spinner_2 = new JSpinner();
		spinner_2.setBounds(208, 159, 74, 28);
		tabDeparture.add(spinner_2);
		
		spinner_3 = new JSpinner();
		spinner_3.setBounds(208, 194, 74, 28);
		tabDeparture.add(spinner_3);
		
		spinner_4 = new JSpinner();
		spinner_4.setBounds(208, 229, 74, 28);
		tabDeparture.add(spinner_4);
		
		spinner_5 = new JSpinner();
		spinner_5.setBounds(208, 264, 74, 28);
		tabDeparture.add(spinner_5);
		
		spinner_6 = new JSpinner();
		spinner_6.setBounds(208, 299, 74, 28);
		tabDeparture.add(spinner_6);
		
		spinner_7 = new JSpinner();
		spinner_7.setBounds(208, 334, 74, 28);
		tabDeparture.add(spinner_7);
		
		spinner_8 = new JSpinner();
		spinner_8.setBounds(208, 369, 74, 28);
		tabDeparture.add(spinner_8);
		
		spinner_9 = new JSpinner();
		spinner_9.setBounds(208, 404, 74, 28);
		tabDeparture.add(spinner_9);
		
		spinner_10 = new JSpinner();
		spinner_10.setBounds(208, 439, 74, 28);
		tabDeparture.add(spinner_10);
		
		spinner_11 = new JSpinner();
		spinner_11.setBounds(208, 474, 74, 28);
		tabDeparture.add(spinner_11);
		
		button = new JButton("APPLY");
		button.setForeground(Color.DARK_GRAY);
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(77, 561, 141, 34);
		tabDeparture.add(button);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(12, 124, 184, 28);
		tabDeparture.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(12, 159, 184, 28);
		tabDeparture.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(12, 194, 184, 28);
		tabDeparture.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(12, 229, 184, 28);
		tabDeparture.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(12, 334, 184, 28);
		tabDeparture.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(12, 369, 184, 28);
		tabDeparture.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(12, 299, 184, 28);
		tabDeparture.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(12, 264, 184, 28);
		tabDeparture.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(12, 474, 184, 28);
		tabDeparture.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(12, 439, 184, 28);
		tabDeparture.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(12, 404, 184, 28);
		tabDeparture.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(12, 89, 184, 28);
		tabDeparture.add(textField_16);
		
		JDesktopPane tabStop = new JDesktopPane();
		tabStop.setLayout(null);
		tabStop.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		tabStop.setBackground(Color.WHITE);
		tabPanel.addTab("Stop", null, tabStop, null);
		
		txtTime = new JTextField();
		txtTime.setToolTipText("Total Cost");
		txtTime.setText("Time");
		txtTime.setHorizontalAlignment(SwingConstants.CENTER);
		txtTime.setForeground(Color.WHITE);
		txtTime.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtTime.setEditable(false);
		txtTime.setColumns(10);
		txtTime.setBackground(Color.GRAY);
		txtTime.setBounds(12, 61, 126, 28);
		tabStop.add(txtTime);
		
		TextField txtSTime = new TextField();;
		txtSTime.setEditable(false);
		txtSTime.setBounds(144, 61, 140, 28);
		tabStop.add(txtSTime);
		
		txtStop = new JTextField();
		txtStop.setText("STOP");
		txtStop.setHorizontalAlignment(SwingConstants.CENTER);
		txtStop.setForeground(Color.WHITE);
		txtStop.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtStop.setEditable(false);
		txtStop.setColumns(10);
		txtStop.setBackground(Color.RED);
		txtStop.setBounds(12, 13, 272, 28);
		tabStop.add(txtStop);
		
		JDesktopPane Stage = new JDesktopPane();
		Stage.setLayout(null);
		Stage.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Stage.setBackground(Color.WHITE);
		Stage.setBounds(311, 95, 1049, 638);
		GUI.getContentPane().add(Stage);
		
		//Stage.getGraphics().drawLine(50, 378, 12, 137);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(UIManager.getColor("Panel.background"));
		desktopPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		desktopPane.setBounds(12, 601, 1025, 37);
		Stage.add(desktopPane);
		
		dataLog = "";
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setBounds(12, 37, 1001, 525);
		desktopPane.add(scrollPane);
		
		JTextPane txtLog = new JTextPane();
		txtLog.setEditable(false);
		scrollPane.setViewportView(txtLog);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setForeground(Color.DARK_GRAY);
		btnRefresh.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnRefresh.setBounds(12, 7, 129, 25);
		desktopPane.add(btnRefresh);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataLog = "";
				txtLog.setText( dataLog );
			}
		});
		btnClear.setForeground(Color.DARK_GRAY);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClear.setBounds(153, 7, 88, 25);
		desktopPane.add(btnClear);
		
		JButton btnShowLog = new JButton("Show Log");
		btnShowLog.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (btnShowLog.getText() == "Show Log") {
					desktopPane.setBounds(12, 63, 1025, 575);
					btnShowLog.setText("Hide Log");
				}
				else if (btnShowLog.getText() == "Hide Log") {
					desktopPane.setBounds(12, 601, 1025, 37);
					btnShowLog.setText("Show Log");
					
				}
			}
		});
		btnShowLog.setForeground(Color.DARK_GRAY);
		btnShowLog.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnShowLog.setBounds(884, 7, 129, 25);
		desktopPane.add(btnShowLog);
		
		txtChart = new JTextField();
		txtChart.setText("CHART");
		txtChart.setHorizontalAlignment(SwingConstants.CENTER);
		txtChart.setForeground(Color.WHITE);
		txtChart.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtChart.setEditable(false);
		txtChart.setColumns(10);
		txtChart.setBackground(Color.RED);
		txtChart.setBounds(12, 13, 1025, 37);
		Stage.add(txtChart);
		
		JDesktopPane Header = new JDesktopPane();
		Header.setLayout(null);
		Header.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Header.setBackground(Color.WHITE);
		Header.setBounds(0, 0, 1360, 57);
		GUI.getContentPane().add(Header);
		
		JLabel Logo = new JLabel("");
		Logo.setIcon(new ImageIcon("C:\\Users\\Xenom Hercules\\OneDrive\\Documents\\workspace\\Projects\\Java\\Romanian River Shortest Route\\icon.png"));
		Logo.setBounds(0, 0, 50, 57);
		Header.add(Logo);
		
		JLabel lblQEC = new JLabel("QEC - Queue Efficiency Calculator");
		lblQEC.setForeground(Color.RED);
		lblQEC.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblQEC.setBounds(59, 13, 359, 31);
		Header.add(lblQEC);
		
		JLabel Identity = new JLabel("IF 38 08 - Basic Modelling and Simulation");
		Identity.setHorizontalAlignment(SwingConstants.TRAILING);
		Identity.setForeground(Color.RED);
		Identity.setFont(new Font("Tahoma", Font.BOLD, 18));
		Identity.setBounds(738, 13, 610, 31);
		Header.add(Identity);
		
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 57, 1360, 32);
		GUI.getContentPane().add(toolBar);
	}
	
	public void systemAlgorithm(){
	}
}
