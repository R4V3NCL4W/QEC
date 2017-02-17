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
import javax.xml.crypto.Data;

import model.Storage;

import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.SpinnerNumberModel;

public class GUI {

	private JFrame GUI;
	private JTextField txtChart;
	private JDesktopPane tabArrival;
	private JSpinner spinnerAPerson1;
	private JSpinner spinnerAPerson2;
	private JSpinner spinnerAPerson3;
	private JSpinner spinnerAPerson0;
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
	private JDesktopPane tabDeparture;
	private JTextField txtDTime;
	private JSpinner spinnerDPerson0;
	private JSpinner spinnerDPerson1;
	private JSpinner spinnerDPerson2;
	private JSpinner spinnerDPerson3;
	private JSpinner spinnerDPerson4;
	private JSpinner spinnerDPerson5;
	private JSpinner spinnerDPerson6;
	private JSpinner spinnerDPerson7;
	private JSpinner spinnerDPerson8;
	private JSpinner spinnerDPerson9;
	private JSpinner spinnerDPerson10;
	private JSpinner spinnerDPerson11;
	private JButton btnDApply;
	private JTextField txtDeparture;
	private JTextField txtStop;
	private JTextField txtStime;
	
	public static Data myData;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//*** System algorithm ***

					Calculation myCalc
					
					
					
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
		tabPanel.setBounds(0, 95, 163, 638);
		GUI.getContentPane().add(tabPanel);
		
		tabArrival = new JDesktopPane();
		tabArrival.setLayout(null);
		tabArrival.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		tabArrival.setBackground(Color.WHITE);
		tabPanel.addTab("Arrival", null, tabArrival, null);
		
		txtATime = new JTextField();
		txtATime.setText("Time");
		txtATime.setHorizontalAlignment(SwingConstants.CENTER);
		txtATime.setForeground(Color.WHITE);
		txtATime.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtATime.setEditable(false);
		txtATime.setColumns(10);
		txtATime.setBackground(new Color(255, 69, 0));
		txtATime.setBounds(12, 54, 116, 28);
		tabArrival.add(txtATime);
		
		txtArrival = new JTextField();
		txtArrival.setText("ARRIVAL");
		txtArrival.setHorizontalAlignment(SwingConstants.CENTER);
		txtArrival.setForeground(Color.WHITE);
		txtArrival.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtArrival.setEditable(false);
		txtArrival.setColumns(10);
		txtArrival.setBackground(Color.RED);
		txtArrival.setBounds(12, 13, 116, 28);
		tabArrival.add(txtArrival);
		
		spinnerAPerson0 = new JSpinner();
		spinnerAPerson0.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinnerAPerson0.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
			}
		});
		
		spinnerAPerson0.setBounds(12, 89, 116, 28);
		tabArrival.add(spinnerAPerson0);
		
		spinnerAPerson1 = new JSpinner();
		spinnerAPerson1.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinnerAPerson1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
			}
		});
		
		spinnerAPerson1.setBounds(12, 124, 116, 28);
		tabArrival.add(spinnerAPerson1);
		
		spinnerAPerson2 = new JSpinner();
		spinnerAPerson2.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinnerAPerson2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
			}
		});
		
		spinnerAPerson2.setBounds(12, 159, 116, 28);
		tabArrival.add(spinnerAPerson2);
		
		spinnerAPerson3 = new JSpinner();
		spinnerAPerson3.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinnerAPerson3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
			}
		});
		
		spinnerAPerson3.setBounds(12, 194, 116, 28);
		tabArrival.add(spinnerAPerson3);
		
		spinnerAPerson4 = new JSpinner();
		spinnerAPerson4.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinnerAPerson4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
			}
		});
		
		spinnerAPerson4.setBounds(12, 229, 116, 28);
		tabArrival.add(spinnerAPerson4);
		
		spinnerAPerson5 = new JSpinner();
		spinnerAPerson5.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinnerAPerson5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
			}
		});
		
		spinnerAPerson5.setBounds(12, 264, 116, 28);
		tabArrival.add(spinnerAPerson5);
		
		spinnerAPerson6 = new JSpinner();
		spinnerAPerson6.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinnerAPerson6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
			}
		});
		
		spinnerAPerson6.setBounds(12, 299, 116, 28);
		tabArrival.add(spinnerAPerson6);
		
		spinnerAPerson7 = new JSpinner();
		spinnerAPerson7.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinnerAPerson7.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
			}
		});
		
		spinnerAPerson7.setBounds(12, 334, 116, 28);
		tabArrival.add(spinnerAPerson7);
		
		spinnerAPerson8 = new JSpinner();
		spinnerAPerson8.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinnerAPerson8.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				
			}
		});
		
		spinnerAPerson8.setBounds(12, 369, 116, 28);
		tabArrival.add(spinnerAPerson8);
		
		spinnerAPerson9 = new JSpinner();
		spinnerAPerson9.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinnerAPerson9.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				
			}
		});
		
		spinnerAPerson9.setBounds(12, 404, 116, 28);
		tabArrival.add(spinnerAPerson9);
		
		spinnerAPerson10 = new JSpinner();
		spinnerAPerson10.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinnerAPerson10.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
			}
		});
		
		spinnerAPerson10.setBounds(12, 439, 116, 28);
		tabArrival.add(spinnerAPerson10);
		
		spinnerAPerson11 = new JSpinner();
		spinnerAPerson11.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinnerAPerson11.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
			}
		});
		
		spinnerAPerson11.setBounds(12, 474, 116, 28);
		tabArrival.add(spinnerAPerson11);
		
		JButton btnAApply = new JButton("APPLY");
		btnAApply.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btnAApply.setForeground(Color.DARK_GRAY);
		btnAApply.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAApply.setBounds(12, 561, 116, 34);
		tabArrival.add(btnAApply);
		
		tabDeparture = new JDesktopPane();
		tabDeparture.setLayout(null);
		tabDeparture.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		tabDeparture.setBackground(Color.WHITE);
		tabPanel.addTab("Departure", null, tabDeparture, null);
		
		txtDTime = new JTextField();
		txtDTime.setText("Time");
		txtDTime.setHorizontalAlignment(SwingConstants.CENTER);
		txtDTime.setForeground(Color.WHITE);
		txtDTime.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtDTime.setEditable(false);
		txtDTime.setColumns(10);
		txtDTime.setBackground(new Color(255, 69, 0));
		txtDTime.setBounds(12, 54, 116, 28);
		tabDeparture.add(txtDTime);
		
		spinnerDPerson0 = new JSpinner();
		spinnerDPerson0.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinnerDPerson0.setBounds(12, 89, 116, 28);
		tabDeparture.add(spinnerDPerson0);
		
		spinnerDPerson1 = new JSpinner();
		spinnerDPerson1.setModel(new SpinnerNumberModel(new Double(0), null, null, new Double(1)));
		spinnerDPerson1.setBounds(12, 124, 116, 28);
		tabDeparture.add(spinnerDPerson1);
		
		spinnerDPerson2 = new JSpinner();
		spinnerDPerson2.setBounds(12, 159, 116, 28);
		tabDeparture.add(spinnerDPerson2);
		
		spinnerDPerson3 = new JSpinner();
		spinnerDPerson3.setBounds(12, 194, 116, 28);
		tabDeparture.add(spinnerDPerson3);
		
		spinnerDPerson4 = new JSpinner();
		spinnerDPerson4.setBounds(12, 229, 116, 28);
		tabDeparture.add(spinnerDPerson4);
		
		spinnerDPerson5 = new JSpinner();
		spinnerDPerson5.setBounds(12, 264, 116, 28);
		tabDeparture.add(spinnerDPerson5);
		
		spinnerDPerson6 = new JSpinner();
		spinnerDPerson6.setBounds(12, 299, 116, 28);
		tabDeparture.add(spinnerDPerson6);
		
		spinnerDPerson7 = new JSpinner();
		spinnerDPerson7.setBounds(12, 334, 116, 28);
		tabDeparture.add(spinnerDPerson7);
		
		spinnerDPerson8 = new JSpinner();
		spinnerDPerson8.setBounds(12, 369, 116, 28);
		tabDeparture.add(spinnerDPerson8);
		
		spinnerDPerson9 = new JSpinner();
		spinnerDPerson9.setBounds(12, 404, 116, 28);
		tabDeparture.add(spinnerDPerson9);
		
		spinnerDPerson10 = new JSpinner();
		spinnerDPerson10.setBounds(12, 439, 116, 28);
		tabDeparture.add(spinnerDPerson10);
		
		spinnerDPerson11 = new JSpinner();
		spinnerDPerson11.setBounds(12, 474, 116, 28);
		tabDeparture.add(spinnerDPerson11);
		
		btnDApply = new JButton("APPLY");
		btnDApply.setForeground(Color.DARK_GRAY);
		btnDApply.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDApply.setBounds(12, 561, 116, 34);
		tabDeparture.add(btnDApply);
		
		txtDeparture = new JTextField();
		txtDeparture.setText("DEPARTURE");
		txtDeparture.setHorizontalAlignment(SwingConstants.CENTER);
		txtDeparture.setForeground(Color.WHITE);
		txtDeparture.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtDeparture.setEditable(false);
		txtDeparture.setColumns(10);
		txtDeparture.setBackground(Color.RED);
		txtDeparture.setBounds(12, 13, 116, 28);
		tabDeparture.add(txtDeparture);
		
		JDesktopPane tabStop = new JDesktopPane();
		tabStop.setLayout(null);
		tabStop.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		tabStop.setBackground(Color.WHITE);
		tabPanel.addTab("Stop", null, tabStop, null);
		
		TextField txtSTime = new TextField();;
		txtSTime.setBounds(12, 95, 116, 28);
		tabStop.add(txtSTime);
		
		txtStop = new JTextField();
		txtStop.setText("STOP");
		txtStop.setHorizontalAlignment(SwingConstants.CENTER);
		txtStop.setForeground(Color.WHITE);
		txtStop.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtStop.setEditable(false);
		txtStop.setColumns(10);
		txtStop.setBackground(Color.RED);
		txtStop.setBounds(12, 13, 116, 28);
		tabStop.add(txtStop);
		
		txtStime = new JTextField();
		txtStime.setText("Time");
		txtStime.setHorizontalAlignment(SwingConstants.CENTER);
		txtStime.setForeground(Color.WHITE);
		txtStime.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtStime.setEditable(false);
		txtStime.setColumns(10);
		txtStime.setBackground(new Color(255, 69, 0));
		txtStime.setBounds(12, 54, 116, 28);
		tabStop.add(txtStime);
		
		JButton btnSApply = new JButton("APPLY");
		btnSApply.setForeground(Color.DARK_GRAY);
		btnSApply.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSApply.setBounds(12, 561, 141, 34);
		tabStop.add(btnSApply);
		
		JDesktopPane Stage = new JDesktopPane();
		Stage.setLayout(null);
		Stage.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Stage.setBackground(Color.WHITE);
		Stage.setBounds(175, 95, 1185, 638);
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
		txtChart.setBounds(12, 13, 1161, 37);
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
