package com.emr.app;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.stream.IntStream;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.google.common.base.Strings;

public class HomeScreen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel titleBar;
	private int mouseX;
	private int mouseY;
	private JPanel iconmaxmizeClose;
	private JPanel maximizeBtn;
	private JLabel maximizeIcon;
	private JPanel closeBtn;
	private JPanel minBtn;
	private JLabel closeIcon;
	private JLabel minIcon;
	private JPanel sideMenuBar;
	private JPanel brandTitle;
	private JLabel brandLogo;
	private JPanel midTitlePanel;
	private JLabel midTitle;
	private JPanel initialsPanel;
	private JLabel userNameText;
	private JPanel menuContainer;
	private JPanel userPanel;
	private JLabel nameBackLbl;
	private JPanel homeBtn;
	private JLabel homeIcon;
	private JLabel lblHome;
	private JPanel historyBtn;
	private JLabel historyIcon;
	private JLabel historyLbl;
	private JPanel inventoryBtn;
	private JPanel usersBtn;
	private JLabel inventoryIcon;
	private JLabel inventoryLbl;
	private JLabel usersIcon;
	private JLabel usersLbl;
	private JPanel settingsBtn;
	private JPanel subMenuContainer;
	private JLabel settingsIcon;
	private JLayeredPane bodyLayeredPan;
	private JPanel appointmentPanel;
	private JPanel addPatientPanel;
	private JPanel patientPanel;
	private JPanel patientHeadingPanel;
	private JPanel patientProfilePanel;
	private JLabel patientLogoIcon;
	private JPanel sideMenuPanel;
	private JLabel patientProfileText;
	private JPanel cancelPanel;
	private JPanel sideMenuContainer;
	private JPanel closeCasePanel;
	private JLabel closeCaseIcon;
	private JPanel viewPanel;
	private JLabel viewIcon;
	private JPanel downloadPanel;
	private JLabel downloadIcon;
	private JPanel savePanel;
	private JLabel saveIcon;
	private JLabel cancelIcon;
	private JPanel patientBodyPanel;
	private JPanel footer;
	private JLabel copyrightInfo;
	private JPanel patientContentContainer;
	private JTabbedPane patientTabbedPane;
	private JScrollPane patientDetailsScrollPane;
	private JPanel panel;
	private JPanel patientDetailsPanel;
	private JLabel patientNameLbl;
	private JTextField patientNameTextField;
	private JTextField contactTextField;
	private JTextField ageTextField;
	private JTextField emailTextField;
	private JTextField pulseRatetextField;
	private JTextField heightTextField;
	private JTextField weightTextField;
	private JTextField bmiTextField;
	private JLabel bpSystolicLbl;
	private JTextField bpSysTextField;
	private JLabel mmhgSysLbl;
	private JLabel bpDiastolicLbl;
	private JTextField bpDiasTextField;
	private JLabel tempLbl_;
	private JTextField tempTextField;
	private JLabel tempfarnLbl;
	private JLabel mmhgSysLbl_1;
	private JPanel ccTextPanel;
	private JLabel ccTextLbl;
	private JTextField ccTextTextField;
	private JScrollPane ccTableScrollPane;
	private JTable ccTable;
	private DefaultTableModel ccTableDataModel;
	private JPanel ccClearTabelPanel;
	private JLabel ccClearAllLbl;
	private JPanel medicineAdvicePanel;
	private JPanel testAdvicepanel;
	private JLabel searchMedicineLbl;
	private JLabel searchExaminationLbl;
	private JTextField searchExaminationtxtField;
	private JTable medicinetable;
	private JTable examinationTable;
	private JComboBox medicineComboBox;
	private DefaultComboBoxModel defaultComboBoxModel;
	private JScrollPane examinationTableScrollPane;
	private DefaultTableModel examinationTableModel;
	private JLabel legendLbl;
	private CheckBoxTableDataModel medicineTableDataModel;
	private JScrollPane medicineTableScrollPane;
	private JPanel patientAdvicePanel;
	private JLabel bmiLbl;
	private JLabel weightKgLbl;
	private JLabel weightLbl;
	private JLabel heightCmLbl;
	private JLabel heightLbl;
	private JLabel minLbl;
	private JLabel pulseRateLbl;
	private JPanel vitalsPanel;
	private JTextArea diagnosisTextArea;
	private JPanel diagnosisPanel;
	private JPanel chiefComplaintsPanel;
	private JComboBox genderComboBox;
	private JLabel emailLbl;
	private JTextArea addressTextArea;
	private JLabel addressLbl;
	private JLabel ageLbl;
	private JLabel contactLbl;
	private JLabel genderLbl;
	private JPanel patientProfilePanel2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen frame = new HomeScreen();
					frame.setVisible(true);
					frame.initEvents();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomeScreen() {
		initComponents();
		/**
		 * Router.INSTANCE.setLayeredPane(bodyLayeredPan);
		 * 
		 * appointmentPanel = new AppointmentPanel();
		 * Router.INSTANCE.registerRoute(appointmentPanel);
		 * bodyLayeredPan.add(appointmentPanel, BorderLayout.CENTER);
		 * 
		 * addPatientPanel = new AddAppointmentPanel();
		 * Router.INSTANCE.registerRoute(addPatientPanel);
		 * bodyLayeredPan.add(addPatientPanel, BorderLayout.CENTER);
		 **/
		patientPanel = new JPanel();
		// Router.INSTANCE.registerRoute(patientPanel);
		bodyLayeredPan.add(patientPanel, BorderLayout.CENTER);

		patientPanel.setBackground(Color.decode("#ffffff"));
		patientPanel.setLayout(new BorderLayout(0, 0));

		patientHeadingPanel = new JPanel();
		patientHeadingPanel.setBorder(new LineBorder(Color.decode("#bfbfbf")));
		patientHeadingPanel.setBackground(Color.decode("#4d94ff"));
		patientHeadingPanel.setPreferredSize(new Dimension(70, 70));

		patientPanel.add(patientHeadingPanel, BorderLayout.NORTH);
		patientHeadingPanel.setLayout(new BorderLayout(0, 0));

		patientProfilePanel = new JPanel();
		patientProfilePanel.setOpaque(false);
		patientProfilePanel.setPreferredSize(new Dimension(450, 10));
		patientHeadingPanel.add(patientProfilePanel, BorderLayout.WEST);
		patientProfilePanel.setLayout(null);

		patientLogoIcon = new JLabel("S");
		patientLogoIcon.setForeground(Color.decode("#262626"));
		patientLogoIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		patientLogoIcon.setHorizontalAlignment(SwingConstants.CENTER);
		patientLogoIcon.setFont(new Font("Open Sans", Font.BOLD, 35));
		patientLogoIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/com/emr/app/images/patient-logo.png")));
		patientLogoIcon.setBounds(22, 0, 64, 68);
		patientProfilePanel.add(patientLogoIcon);

		patientProfileText = new JLabel();
		patientProfileText.setText("PAT-32345  |  Siddharth Kumar   |  30 Male");
		patientProfileText.setHorizontalTextPosition(SwingConstants.CENTER);
		patientProfileText.setHorizontalAlignment(SwingConstants.CENTER);
		patientProfileText.setForeground(Color.decode("#ffffff"));
		patientProfileText.setFont(new Font("Open Sans", Font.BOLD, 14));
		patientProfileText.setBounds(85, 12, 320, 47);
		patientProfilePanel.add(patientProfileText);

		sideMenuPanel = new JPanel();
		sideMenuPanel.setPreferredSize(new Dimension(400, 10));
		sideMenuPanel.setOpaque(false);
		patientHeadingPanel.add(sideMenuPanel, BorderLayout.EAST);
		sideMenuPanel.setLayout(null);

		sideMenuContainer = new JPanel();
		sideMenuContainer.setOpaque(false);
		sideMenuContainer.setBounds(12, 12, 357, 44);
		sideMenuPanel.add(sideMenuContainer);
		sideMenuContainer.setLayout(null);

		closeCasePanel = new JPanel();
		closeCasePanel.setToolTipText("Close Case");

		closeCasePanel.setBounds(77, 0, 44, 44);
		sideMenuContainer.add(closeCasePanel);
		closeCasePanel.setLayout(new BorderLayout(0, 0));
		closeCasePanel.setBackground(Color.decode("#4d94ff"));

		closeCaseIcon = new JLabel("");
		closeCaseIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/com/emr/app/images/close-32.png")));
		closeCaseIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		closeCaseIcon.setHorizontalAlignment(SwingConstants.CENTER);
		closeCasePanel.add(closeCaseIcon, BorderLayout.CENTER);

		viewPanel = new JPanel();
		viewPanel.setToolTipText("View Prescription");
		viewPanel.setBackground(Color.decode("#4d94ff"));
		viewPanel.setBounds(133, 0, 44, 44);
		sideMenuContainer.add(viewPanel);
		viewPanel.setLayout(new BorderLayout(0, 0));

		viewIcon = new JLabel("");
		viewIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/com/emr/app/images/view-32.png")));
		viewIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		viewIcon.setHorizontalAlignment(SwingConstants.CENTER);
		viewPanel.add(viewIcon, BorderLayout.CENTER);

		downloadPanel = new JPanel();
		downloadPanel.setToolTipText("Download Prescription");
		downloadPanel.setBackground(Color.decode("#4d94ff"));
		downloadPanel.setBounds(189, 0, 44, 44);
		sideMenuContainer.add(downloadPanel);
		downloadPanel.setLayout(new BorderLayout(0, 0));

		downloadIcon = new JLabel("");
		downloadIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/com/emr/app/images/download-32.png")));
		downloadIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		downloadIcon.setHorizontalAlignment(SwingConstants.CENTER);
		downloadPanel.add(downloadIcon, BorderLayout.CENTER);

		savePanel = new JPanel();
		savePanel.setToolTipText("Save Data");
		savePanel.setBackground(Color.decode("#4d94ff"));
		savePanel.setBounds(245, 0, 44, 44);
		sideMenuContainer.add(savePanel);
		savePanel.setLayout(new BorderLayout(0, 0));

		saveIcon = new JLabel("");
		saveIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		saveIcon.setHorizontalAlignment(SwingConstants.CENTER);
		saveIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/com/emr/app/images/save-32.png")));
		savePanel.add(saveIcon, BorderLayout.CENTER);

		cancelPanel = new JPanel();
		cancelPanel.setToolTipText("Go Back");
		cancelPanel.setBackground(Color.decode("#4d94ff"));
		cancelPanel.setBounds(301, 0, 44, 44);
		cancelPanel.setLayout(new BorderLayout(0, 0));
		sideMenuContainer.add(cancelPanel);

		cancelIcon = new JLabel("");
		cancelIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/com/emr/app/images/back-32.png")));
		cancelIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		cancelIcon.setHorizontalAlignment(SwingConstants.CENTER);
		cancelPanel.add(cancelIcon, BorderLayout.CENTER);

		patientBodyPanel = new JPanel();
		patientBodyPanel.setBackground(Color.decode("#ffffff"));
		patientBodyPanel.setLayout(new BorderLayout(0, 0));

		footer = new JPanel();
		footer.setBackground(Color.decode("#ffffff"));
		footer.setPreferredSize(new Dimension(10, 20));
		footer.setLayout(new BorderLayout(0, 0));

		copyrightInfo = new JLabel("Copyright \u00a9" + " 2020 Orange Inc.");
		copyrightInfo.setFont(new Font("Open Sans", Font.BOLD, 12));
		copyrightInfo.setHorizontalAlignment(SwingConstants.CENTER);
		footer.add(copyrightInfo, BorderLayout.CENTER);
		patientBodyPanel.add(footer, BorderLayout.SOUTH);

		patientPanel.add(patientBodyPanel, BorderLayout.CENTER);

		patientContentContainer = new JPanel();
		patientContentContainer.setBackground(Color.decode("#ffffff"));
		patientBodyPanel.add(patientContentContainer, BorderLayout.CENTER);
		patientContentContainer.setLayout(new BorderLayout(0, 0));

		patientTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		patientTabbedPane.setBorder(null);
		patientTabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		patientTabbedPane.setBackground(Color.decode("#ffffff"));
		patientTabbedPane.setFont(new Font("Open Sans", Font.BOLD, 12));

		patientProfilePanel2 = new JPanel();
		patientProfilePanel2.setBackground(Color.decode("#ffffff"));
		patientTabbedPane.addTab("Patient Profile", patientProfilePanel2);
		patientProfilePanel2.setLayout(null);

		patientDetailsPanel = new JPanel();
		patientDetailsPanel.setFont(new Font("Open Sans", Font.PLAIN, 12));
		patientDetailsPanel.setBorder(new TitledBorder(new LineBorder(Color.decode("#262626")), "Patient Details",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		patientDetailsPanel.setOpaque(false);
		patientDetailsPanel.setBounds(12, 12, 600, 250);
		patientProfilePanel2.add(patientDetailsPanel);
		patientDetailsPanel.setLayout(null);

		patientNameLbl = new JLabel("Name");
		patientNameLbl.setBounds(12, 37, 61, 23);
		patientDetailsPanel.add(patientNameLbl);

		patientNameTextField = new JTextField();
		patientNameTextField.setBorder(new LineBorder(Color.decode("#262626")));
		patientNameTextField.setFont(new Font("Open Sans", Font.PLAIN, 12));
		patientNameTextField.setBounds(74, 35, 191, 27);
		patientDetailsPanel.add(patientNameTextField);
		patientNameTextField.setColumns(10);

		genderLbl = new JLabel("Gender");
		genderLbl.setBounds(12, 93, 61, 23);
		patientDetailsPanel.add(genderLbl);

		contactLbl = new JLabel("Contact No.");
		contactLbl.setBounds(316, 91, 74, 23);
		patientDetailsPanel.add(contactLbl);

		contactTextField = new JTextField();
		contactTextField.setBorder(new LineBorder(Color.decode("#262626")));
		contactTextField.setColumns(10);
		contactTextField.setBounds(391, 89, 191, 27);
		patientDetailsPanel.add(contactTextField);

		ageLbl = new JLabel("Age");
		ageLbl.setBounds(316, 37, 61, 23);
		patientDetailsPanel.add(ageLbl);

		ageTextField = new JTextField();
		ageTextField.setBorder(new LineBorder(Color.decode("#262626")));
		ageTextField.setFont(new Font("Open Sans", Font.PLAIN, 12));
		ageTextField.setColumns(10);
		ageTextField.setBounds(391, 33, 191, 27);
		patientDetailsPanel.add(ageTextField);

		addressLbl = new JLabel("Address");
		addressLbl.setBounds(12, 145, 61, 23);
		patientDetailsPanel.add(addressLbl);

		addressTextArea = new JTextArea();
		addressTextArea.setBorder(new LineBorder(Color.decode("#262626")));
		addressTextArea.setBounds(74, 148, 191, 90);
		patientDetailsPanel.add(addressTextArea);

		emailLbl = new JLabel("Email");
		emailLbl.setBounds(316, 147, 74, 23);
		patientDetailsPanel.add(emailLbl);

		emailTextField = new JTextField();
		emailTextField.setBorder(new LineBorder(Color.decode("#262626")));
		emailTextField.setColumns(10);
		emailTextField.setBounds(391, 145, 191, 27);
		patientDetailsPanel.add(emailTextField);

		genderComboBox = new JComboBox();
		genderComboBox.setBorder(new LineBorder(Color.decode("#262626")));
		genderComboBox.setBounds(74, 91, 191, 26);
		patientDetailsPanel.add(genderComboBox);

		chiefComplaintsPanel = new JPanel();
		chiefComplaintsPanel.setBorder(new TitledBorder(new LineBorder(Color.decode("#262626")), "Chief Complaints",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		chiefComplaintsPanel.setBackground(Color.decode("#ffffff"));
		chiefComplaintsPanel.setBounds(12, 289, 600, 250);
		patientProfilePanel2.add(chiefComplaintsPanel);
		chiefComplaintsPanel.setLayout(new BorderLayout(0, 0));

		ccTextPanel = new JPanel();
		ccTextPanel.setBorder(null);
		ccTextPanel.setBackground(Color.WHITE);
		ccTextPanel.setPreferredSize(new Dimension(10, 30));
		chiefComplaintsPanel.add(ccTextPanel, BorderLayout.NORTH);
		ccTextPanel.setLayout(null);

		ccTextLbl = new JLabel("Enter Chief Complaints");
		ccTextLbl.setFont(new Font("Open Sans", Font.BOLD, 12));
		ccTextLbl.setBounds(12, 0, 149, 30);
		ccTextPanel.add(ccTextLbl);

		ccTextTextField = new JTextField();
		ccTextTextField.setColumns(10);
		ccTextTextField.setBorder(new LineBorder(Color.decode("#262626")));
		ccTextTextField.setBounds(165, 0, 300, 30);
		ccTextPanel.add(ccTextTextField);

		ccClearTabelPanel = new JPanel();
		ccClearTabelPanel.setBackground(Color.decode("#4d94ff"));
		ccClearTabelPanel.setBounds(493, 0, 73, 30);
		ccTextPanel.add(ccClearTabelPanel);
		ccClearTabelPanel.setLayout(new BorderLayout(0, 0));

		ccClearAllLbl = new JLabel("Clear All");
		ccClearAllLbl.setForeground(Color.WHITE);
		ccClearAllLbl.setHorizontalTextPosition(SwingConstants.CENTER);
		ccClearAllLbl.setHorizontalAlignment(SwingConstants.CENTER);
		ccClearAllLbl.setFont(new Font("Open Sans", Font.BOLD, 12));
		ccClearTabelPanel.add(ccClearAllLbl, BorderLayout.CENTER);

		ccTableScrollPane = new JScrollPane();
		chiefComplaintsPanel.add(ccTableScrollPane, BorderLayout.CENTER);

		ccTable = new JTable();
		ccTable.setRowHeight(25);
		// ccTable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		ccTableDataModel = (DefaultTableModel) ccTable.getModel();
		ccTableDataModel.addColumn("Sl No.");
		ccTableDataModel.addColumn("Chief Complaints");
		ccTableScrollPane.setViewportView(ccTable);

		diagnosisPanel = new JPanel();
		diagnosisPanel.setBorder(new TitledBorder(new LineBorder(Color.decode("#262626")), "Diagnosis",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		diagnosisPanel.setBackground(Color.decode("#ffffff"));
		diagnosisPanel.setBounds(650, 289, 600, 250);
		patientProfilePanel2.add(diagnosisPanel);
		diagnosisPanel.setLayout(null);

		diagnosisTextArea = new JTextArea();
		diagnosisTextArea.setWrapStyleWord(true);
		diagnosisTextArea.setLineWrap(true);
		diagnosisTextArea.setBounds(12, 24, 576, 214);
		diagnosisPanel.add(diagnosisTextArea);

		vitalsPanel = new JPanel();
		vitalsPanel.setBackground(Color.decode("#ffffff"));
		vitalsPanel.setBorder(new TitledBorder(new LineBorder(Color.decode("#262626")), "Vitals", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		vitalsPanel.setBounds(650, 12, 600, 250);
		patientProfilePanel2.add(vitalsPanel);
		vitalsPanel.setLayout(null);

		pulseRateLbl = new JLabel("Pulse rate");
		pulseRateLbl.setBounds(32, 34, 61, 23);
		vitalsPanel.add(pulseRateLbl);

		pulseRatetextField = new JTextField();
		pulseRatetextField.setFont(new Font("Open Sans", Font.PLAIN, 12));
		pulseRatetextField.setColumns(10);
		pulseRatetextField.setBorder(new LineBorder(Color.decode("#262626")));
		pulseRatetextField.setBounds(111, 32, 95, 27);
		vitalsPanel.add(pulseRatetextField);

		minLbl = new JLabel("/ min");
		minLbl.setBounds(211, 34, 61, 23);
		vitalsPanel.add(minLbl);

		heightTextField = new JTextField();
		heightTextField.setFont(new Font("Open Sans", Font.PLAIN, 12));
		heightTextField.setColumns(10);
		heightTextField.setBorder(new LineBorder(Color.decode("#262626")));
		heightTextField.setBounds(399, 32, 95, 27);
		vitalsPanel.add(heightTextField);

		heightLbl = new JLabel("Height");
		heightLbl.setBounds(320, 34, 61, 23);
		vitalsPanel.add(heightLbl);

		heightCmLbl = new JLabel("cm");
		heightCmLbl.setBounds(499, 34, 61, 23);
		vitalsPanel.add(heightCmLbl);

		weightTextField = new JTextField();
		weightTextField.setFont(new Font("Open Sans", Font.PLAIN, 12));
		weightTextField.setColumns(10);
		weightTextField.setBorder(new LineBorder(Color.decode("#262626")));
		weightTextField.setBounds(399, 81, 95, 27);
		vitalsPanel.add(weightTextField);

		weightLbl = new JLabel("Weight");
		weightLbl.setBounds(320, 83, 61, 23);
		vitalsPanel.add(weightLbl);

		weightKgLbl = new JLabel("Kg");
		weightKgLbl.setBounds(499, 83, 61, 23);
		vitalsPanel.add(weightKgLbl);

		bmiTextField = new JTextField();
		bmiTextField.setFont(new Font("Open Sans", Font.PLAIN, 12));
		bmiTextField.setColumns(10);
		bmiTextField.setBorder(new LineBorder(Color.decode("#262626")));
		bmiTextField.setBounds(399, 125, 95, 27);
		vitalsPanel.add(bmiTextField);

		bmiLbl = new JLabel("BMI");
		bmiLbl.setBounds(320, 127, 61, 23);
		vitalsPanel.add(bmiLbl);

		bpSystolicLbl = new JLabel("BP Systolic");
		bpSystolicLbl.setBounds(32, 83, 61, 23);
		vitalsPanel.add(bpSystolicLbl);

		bpSysTextField = new JTextField();
		bpSysTextField.setFont(new Font("Open Sans", Font.PLAIN, 12));
		bpSysTextField.setColumns(10);
		bpSysTextField.setBorder(new LineBorder(Color.decode("#262626")));
		bpSysTextField.setBounds(111, 81, 95, 27);
		vitalsPanel.add(bpSysTextField);

		mmhgSysLbl = new JLabel("mm Hg");
		mmhgSysLbl.setBounds(211, 83, 61, 23);
		vitalsPanel.add(mmhgSysLbl);

		bpDiastolicLbl = new JLabel("BP Diastolic");
		bpDiastolicLbl.setBounds(32, 127, 73, 23);
		vitalsPanel.add(bpDiastolicLbl);

		bpDiasTextField = new JTextField();
		bpDiasTextField.setFont(new Font("Open Sans", Font.PLAIN, 12));
		bpDiasTextField.setColumns(10);
		bpDiasTextField.setBorder(new LineBorder(Color.decode("#262626")));
		bpDiasTextField.setBounds(111, 125, 95, 27);
		vitalsPanel.add(bpDiasTextField);

		tempLbl_ = new JLabel("Temp.");
		tempLbl_.setBounds(32, 176, 61, 23);
		vitalsPanel.add(tempLbl_);

		tempTextField = new JTextField();
		tempTextField.setFont(new Font("Open Sans", Font.PLAIN, 12));
		tempTextField.setColumns(10);
		tempTextField.setBorder(new LineBorder(Color.decode("#262626")));
		tempTextField.setBounds(111, 174, 95, 27);
		vitalsPanel.add(tempTextField);

		tempfarnLbl = new JLabel("\u00b0F");
		tempfarnLbl.setBounds(211, 176, 61, 23);
		vitalsPanel.add(tempfarnLbl);

		mmhgSysLbl_1 = new JLabel("mm Hg");
		mmhgSysLbl_1.setBounds(211, 127, 61, 23);
		vitalsPanel.add(mmhgSysLbl_1);

		patientAdvicePanel = new JPanel();
		patientAdvicePanel.setBackground(Color.decode("#ffffff"));
		patientTabbedPane.addTab("Advice", patientAdvicePanel);
		patientAdvicePanel.setLayout(null);

		medicineAdvicePanel = new JPanel();
		medicineAdvicePanel.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64)), "Medicine Advice",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		medicineAdvicePanel.setBackground(Color.WHITE);
		medicineAdvicePanel.setBounds(43, 12, 1199, 279);
		patientAdvicePanel.add(medicineAdvicePanel);
		medicineAdvicePanel.setLayout(null);

		searchMedicineLbl = new JLabel("Search Medicine");
		searchMedicineLbl.setBounds(12, 27, 97, 22);
		medicineAdvicePanel.add(searchMedicineLbl);

		medicineTableScrollPane = new JScrollPane();
		medicineTableScrollPane.setBounds(519, 23, 657, 221);
		medicineAdvicePanel.add(medicineTableScrollPane);

		medicineTableDataModel = new CheckBoxTableDataModel();
		medicineTableDataModel.addColumn("Sl No.");
		medicineTableDataModel.addColumn("Medicine");
		medicineTableDataModel.addColumn("Days");
		medicineTableDataModel.addColumn("BF");
		medicineTableDataModel.addColumn("AF");
		medicineTableDataModel.addColumn("BL");
		medicineTableDataModel.addColumn("AL");
		medicineTableDataModel.addColumn("EV");
		medicineTableDataModel.addColumn("BD");
		medicineTableDataModel.addColumn("AD");

		medicinetable = new JTable(medicineTableDataModel);
		medicinetable.setRowHeight(25);
		medicineTableScrollPane.setViewportView(medicinetable);

		legendLbl = new JLabel(
				"BF - Before breakfast, AF - After breakfast, BL - Before lunch, AL - After lunch, EV - Evening, BD - Before dinner, AD - After dinner");
		legendLbl.setHorizontalAlignment(SwingConstants.CENTER);
		legendLbl.setFont(new Font("Open Sans", Font.PLAIN, 12));
		legendLbl.setBounds(472, 250, 727, 17);
		medicineAdvicePanel.add(legendLbl);

		medicineComboBox = new JComboBox();
		defaultComboBoxModel = new DefaultComboBoxModel();
		medicineComboBox.setEditable(true);
		medicineComboBox.setModel(defaultComboBoxModel);
		medicineComboBox.setFont(new Font("Open Sans", Font.BOLD, 12));
		medicineComboBox.setBounds(111, 25, 382, 26);
		medicineAdvicePanel.add(medicineComboBox);

		testAdvicepanel = new JPanel();
		testAdvicepanel.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64)), "Examination",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		testAdvicepanel.setBackground(Color.WHITE);
		testAdvicepanel.setBounds(43, 291, 1199, 249);
		patientAdvicePanel.add(testAdvicepanel);
		testAdvicepanel.setLayout(null);

		searchExaminationLbl = new JLabel("Search Examination");
		searchExaminationLbl.setBounds(12, 26, 116, 22);
		testAdvicepanel.add(searchExaminationLbl);

		searchExaminationtxtField = new JTextField();
		searchExaminationtxtField.setColumns(10);
		searchExaminationtxtField.setBorder(new LineBorder(Color.DARK_GRAY));
		searchExaminationtxtField.setBounds(135, 22, 370, 32);
		testAdvicepanel.add(searchExaminationtxtField);

		examinationTableScrollPane = new JScrollPane();
		examinationTableScrollPane.setBounds(517, 22, 657, 221);
		testAdvicepanel.add(examinationTableScrollPane);

		examinationTable = new JTable();
		examinationTableModel = (DefaultTableModel) examinationTable.getModel();
		examinationTableModel.addColumn("Sl No.");
		examinationTableModel.addColumn("Examination");

		examinationTableScrollPane.setViewportView(examinationTable);

		patientContentContainer.add(patientTabbedPane, BorderLayout.CENTER);
	}

	private void initComponents() {
		setTitle("Orange EMR");
		setFont(new Font("Open Sans", Font.BOLD, 12));
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(HomeScreen.class.getResource("/com/emr/app/images/breakfast-30.png")));
		setBackground(Color.decode("#ffffff"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize((int) screenSize.getWidth(), (int) screenSize.getHeight());
		// setBounds(100, 100, 950, 550);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Open Sans", Font.PLAIN, 12));
		contentPane.setBackground(Color.decode("#ffffff"));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		titleBar = new JPanel();
		titleBar.setBorder(new LineBorder(new Color(166, 166, 166), 0));
		titleBar.setBackground(Color.decode("#262626"));
		titleBar.setPreferredSize(new Dimension(10, 30));
		contentPane.add(titleBar, BorderLayout.NORTH);
		titleBar.setLayout(new BorderLayout(0, 0));

		iconmaxmizeClose = new JPanel();
		iconmaxmizeClose.setAlignmentX(0.0f);
		iconmaxmizeClose.setAlignmentY(0.0f);
		iconmaxmizeClose.setBackground(Color.decode("#262626"));
		iconmaxmizeClose.setPreferredSize(new Dimension(105, 10));
		iconmaxmizeClose.setBorder(null);
		titleBar.add(iconmaxmizeClose, BorderLayout.EAST);
		iconmaxmizeClose.setLayout(null);

		maximizeBtn = new JPanel();
		maximizeBtn.setBorder(null);
		maximizeBtn.setBackground(Color.decode("#262626"));
		maximizeBtn.setPreferredSize(new Dimension(35, 10));
		maximizeBtn.setBounds(35, 0, 35, 30);
		iconmaxmizeClose.add(maximizeBtn);
		maximizeBtn.setLayout(new BorderLayout(0, 0));

		maximizeIcon = new JLabel("");
		maximizeIcon.setHorizontalAlignment(SwingConstants.CENTER);
		maximizeIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		maximizeIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/maximize-24.png")));
		maximizeBtn.add(maximizeIcon, BorderLayout.CENTER);

		closeBtn = new JPanel();
		closeBtn.setBorder(null);
		closeBtn.setBackground(Color.decode("#262626"));
		closeBtn.setPreferredSize(new Dimension(35, 10));
		closeBtn.setBounds(70, 0, 35, 30);
		iconmaxmizeClose.add(closeBtn);
		closeBtn.setLayout(new BorderLayout(0, 0));

		closeIcon = new JLabel("");
		closeIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/close-24.png")));
		closeIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		closeIcon.setHorizontalAlignment(SwingConstants.CENTER);
		closeBtn.add(closeIcon, BorderLayout.CENTER);

		minBtn = new JPanel();
		minBtn.setBorder(null);
		minBtn.setBackground(Color.decode("#262626"));
		minBtn.setPreferredSize(new Dimension(35, 10));
		minBtn.setBounds(0, 0, 35, 30);
		iconmaxmizeClose.add(minBtn);
		minBtn.setLayout(new BorderLayout(0, 0));

		minIcon = new JLabel("");
		minIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/min-20.png")));
		minIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		minIcon.setHorizontalAlignment(SwingConstants.CENTER);
		minBtn.add(minIcon, BorderLayout.CENTER);

		brandTitle = new JPanel();
		brandTitle.setBackground(Color.decode("#262626"));
		brandTitle.setPreferredSize(new Dimension(80, 10));
		titleBar.add(brandTitle, BorderLayout.WEST);
		brandTitle.setLayout(new BorderLayout(0, 0));

		brandLogo = new JLabel("Orange");
		brandLogo.setFont(new Font("Open Sans", Font.BOLD, 12));
		brandLogo.setForeground(Color.decode("#ffffff"));
		brandLogo.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/breakfast-30.png")));
		brandTitle.add(brandLogo, BorderLayout.CENTER);

		midTitlePanel = new JPanel();
		midTitlePanel.setBackground(Color.decode("#262626"));
		titleBar.add(midTitlePanel, BorderLayout.CENTER);
		midTitlePanel.setLayout(new BorderLayout(0, 0));

		midTitle = new JLabel("Electronic Medical Record");
		midTitle.setHorizontalAlignment(SwingConstants.CENTER);
		midTitle.setForeground(Color.decode("#ffffff"));
		midTitle.setFont(new Font("Open Sans", Font.BOLD, 12));
		midTitlePanel.add(midTitle, BorderLayout.CENTER);

		sideMenuBar = new JPanel();
		sideMenuBar.setPreferredSize(new Dimension(80, 10));
		sideMenuBar.setBackground(Color.decode("#0d0d0d"));
		contentPane.add(sideMenuBar, BorderLayout.WEST);
		sideMenuBar.setLayout(new BorderLayout(0, 0));

		userPanel = new JPanel();
		userPanel.setBorder(null);
		userPanel.setBackground(Color.decode("#0d0d0d"));
		userPanel.setPreferredSize(new Dimension(10, 120));
		sideMenuBar.add(userPanel, BorderLayout.NORTH);
		userPanel.setLayout(new BorderLayout(0, 0));

		initialsPanel = new JPanel();
		initialsPanel.setBackground(Color.decode("#0d0d0d"));
		initialsPanel.setPreferredSize(new Dimension(10, 80));
		userPanel.add(initialsPanel, BorderLayout.NORTH);
		initialsPanel.setLayout(null);

		nameBackLbl = new JLabel("V");
		nameBackLbl.setForeground(Color.decode("#ffffff"));
		nameBackLbl.setFont(new Font("Open Sans", Font.BOLD, 40));
		nameBackLbl.setHorizontalTextPosition(SwingConstants.CENTER);
		nameBackLbl.setHorizontalAlignment(SwingConstants.CENTER);
		nameBackLbl.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/nameBack-64.png")));
		nameBackLbl.setBounds(0, 12, 80, 70);
		initialsPanel.add(nameBackLbl);

		userNameText = new JLabel("Dr. Vikash");
		userNameText.setPreferredSize(new Dimension(54, 10));
		userNameText.setForeground(Color.decode("#ffffff"));
		userNameText.setHorizontalAlignment(SwingConstants.CENTER);
		userNameText.setFont(new Font("Open Sans", Font.BOLD, 12));
		userPanel.add(userNameText, BorderLayout.CENTER);

		menuContainer = new JPanel();
		menuContainer.setBackground(Color.decode("#0d0d0d"));
		sideMenuBar.add(menuContainer, BorderLayout.CENTER);
		menuContainer.setLayout(new BorderLayout(0, 0));

		settingsBtn = new JPanel();
		settingsBtn.setPreferredSize(new Dimension(10, 53));
		settingsBtn.setLayout(new BorderLayout(0, 0));
		settingsBtn.setBackground(Color.decode("#0d0d0d"));
		// settingsBtn.setBorder(new LineBorder(Color.decode("#737373")));
		menuContainer.add(settingsBtn, BorderLayout.SOUTH);

		settingsIcon = new JLabel("");
		settingsIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/settings-32.png")));
		settingsIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		settingsIcon.setHorizontalAlignment(SwingConstants.CENTER);
		settingsBtn.add(settingsIcon, BorderLayout.CENTER);

		subMenuContainer = new JPanel();
		subMenuContainer.setBackground(Color.decode("#0d0d0d"));
		menuContainer.add(subMenuContainer, BorderLayout.CENTER);
		subMenuContainer.setLayout(null);

		homeBtn = new JPanel();
		homeBtn.setBorder(new LineBorder(Color.decode("#737373")));
		homeBtn.setBounds(0, 38, 80, 53);
		homeBtn.setBackground(Color.decode("#0d0d0d"));
		subMenuContainer.add(homeBtn);
		homeBtn.setLayout(new BorderLayout(0, 0));

		homeIcon = new JLabel("");
		homeIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/home-32.png")));
		homeIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		homeIcon.setHorizontalAlignment(SwingConstants.CENTER);
		homeBtn.add(homeIcon, BorderLayout.NORTH);

		lblHome = new JLabel("Home");
		lblHome.setForeground(Color.decode("#d9d9d9"));
		lblHome.setFont(new Font("Open Sans", Font.BOLD, 12));
		lblHome.setHorizontalTextPosition(SwingConstants.CENTER);
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		homeBtn.add(lblHome, BorderLayout.SOUTH);

		historyBtn = new JPanel();
		historyBtn.setBorder(new LineBorder(Color.decode("#737373")));
		historyBtn.setBackground(Color.decode("#0d0d0d"));
		historyBtn.setBounds(0, 103, 80, 53);
		subMenuContainer.add(historyBtn);
		historyBtn.setLayout(new BorderLayout(0, 0));

		historyIcon = new JLabel("");
		historyIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		historyIcon.setHorizontalAlignment(SwingConstants.CENTER);
		historyIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/history-32.png")));
		historyBtn.add(historyIcon, BorderLayout.NORTH);

		historyLbl = new JLabel("History");
		historyLbl.setHorizontalTextPosition(SwingConstants.CENTER);
		historyLbl.setHorizontalAlignment(SwingConstants.CENTER);
		historyLbl.setForeground(new Color(217, 217, 217));
		historyLbl.setFont(new Font("Open Sans", Font.BOLD, 12));
		historyBtn.add(historyLbl, BorderLayout.SOUTH);

		inventoryBtn = new JPanel();
		inventoryBtn.setBorder(new LineBorder(Color.decode("#737373")));
		inventoryBtn.setBackground(Color.decode("#0d0d0d"));
		inventoryBtn.setBounds(0, 168, 80, 53);
		subMenuContainer.add(inventoryBtn);
		inventoryBtn.setLayout(new BorderLayout(0, 0));

		inventoryIcon = new JLabel("");
		inventoryIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/inventory-32.png")));
		inventoryIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		inventoryIcon.setHorizontalAlignment(SwingConstants.CENTER);
		inventoryBtn.add(inventoryIcon, BorderLayout.NORTH);

		inventoryLbl = new JLabel("Inventory");
		inventoryLbl.setHorizontalTextPosition(SwingConstants.CENTER);
		inventoryLbl.setHorizontalAlignment(SwingConstants.CENTER);
		inventoryLbl.setForeground(new Color(217, 217, 217));
		inventoryLbl.setFont(new Font("Open Sans", Font.BOLD, 12));
		inventoryBtn.add(inventoryLbl, BorderLayout.SOUTH);

		usersBtn = new JPanel();
		usersBtn.setBorder(new LineBorder(Color.decode("#737373")));
		usersBtn.setBackground(Color.decode("#0d0d0d"));
		usersBtn.setBounds(0, 233, 80, 53);
		subMenuContainer.add(usersBtn);
		usersBtn.setLayout(new BorderLayout(0, 0));

		usersIcon = new JLabel("");
		usersIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/icons/users-32.png")));
		usersIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		usersIcon.setHorizontalAlignment(SwingConstants.CENTER);
		usersBtn.add(usersIcon, BorderLayout.NORTH);

		usersLbl = new JLabel("Users");
		usersLbl.setHorizontalTextPosition(SwingConstants.CENTER);
		usersLbl.setHorizontalAlignment(SwingConstants.CENTER);
		usersLbl.setFont(new Font("Open Sans", Font.BOLD, 12));
		usersLbl.setForeground(new Color(217, 217, 217));
		usersBtn.add(usersLbl, BorderLayout.SOUTH);

		bodyLayeredPan = new JLayeredPane();
		contentPane.add(bodyLayeredPan, BorderLayout.CENTER);
		bodyLayeredPan.setLayout(new CardLayout(0, 0));

	}

	public void initEvents() {

		titleBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {

				int x = e.getXOnScreen();
				int y = e.getYOnScreen();

				setLocation(x - mouseX, y - mouseY);

			}
		});

		titleBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});

		maximizeBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(Color.decode("#4d4d4d"), maximizeBtn);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(Color.decode("#262626"), maximizeBtn);
			}
		});

		closeBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(Color.decode("#4d4d4d"), closeBtn);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(Color.decode("#262626"), closeBtn);
			}
		});

		minBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(Color.decode("#4d4d4d"), minBtn);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(Color.decode("#262626"), minBtn);
			}
		});

		closeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});

		maximizeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (getExtendedState() != JFrame.MAXIMIZED_BOTH) {
					setExtendedState(JFrame.MAXIMIZED_BOTH);
				} else {
					setExtendedState(JFrame.NORMAL);
					setBounds(100, 100, 950, 550);
				}
			}
		});

		minBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setExtendedState(JFrame.ICONIFIED);
			}
		});

		homeBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(Color.decode("#4d4d4d"), homeBtn);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(Color.decode("#0d0d0d"), homeBtn);
			}
		});

		historyBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(Color.decode("#4d4d4d"), historyBtn);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(Color.decode("#0d0d0d"), historyBtn);
			}
		});

		inventoryBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(Color.decode("#4d4d4d"), inventoryBtn);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(Color.decode("#0d0d0d"), inventoryBtn);
			}
		});

		usersBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(Color.decode("#4d4d4d"), usersBtn);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(Color.decode("#0d0d0d"), usersBtn);
			}
		});

		settingsBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(Color.decode("#4d4d4d"), settingsBtn);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(Color.decode("#0d0d0d"), settingsBtn);
			}
		});

		cancelPanel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(Color.decode("#99c2ff"), cancelPanel);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(Color.decode("#4d94ff"), cancelPanel);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				Router.INSTANCE.route(AppointmentPanel.class);
			}
		});

		savePanel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(Color.decode("#99c2ff"), savePanel);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(Color.decode("#4d94ff"), savePanel);
			}
		});

		downloadPanel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(Color.decode("#99c2ff"), downloadPanel);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(Color.decode("#4d94ff"), downloadPanel);
			}
		});

		viewPanel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(Color.decode("#99c2ff"), viewPanel);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(Color.decode("#4d94ff"), viewPanel);
			}
		});

		closeCasePanel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(Color.decode("#99c2ff"), closeCasePanel);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(Color.decode("#4d94ff"), closeCasePanel);
			}
		});

		ccTextTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				if (key == KeyEvent.VK_ENTER && !Strings.isNullOrEmpty(ccTextTextField.getText())) {
					ccTableDataModel
							.addRow(new Object[] { ccTableDataModel.getRowCount() + 1, ccTextTextField.getText() });
					ccTextTextField.setText("");
					ccTable.repaint();
				}
			}
		});

		ccTable.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_DELETE) {
					int selectedRows[] = ccTable.getSelectedRows();
					int count = 0;
					for (int i = 0; i < selectedRows.length; i++) {
						ccTableDataModel.removeRow(selectedRows[i] - count);
						count++;
					}

					int rows = ccTableDataModel.getRowCount();
					for (int i = 0; i < rows; i++) {
						ccTableDataModel.setValueAt(i + 1, i, 0);
					}

				}
			}
		});

		ccClearTabelPanel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(Color.decode("#99c2ff"), ccClearTabelPanel);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(Color.decode("#4d94ff"), ccClearTabelPanel);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				IntStream.range(0, ccTableDataModel.getRowCount()).forEach(index -> ccTableDataModel.removeRow(0));
			}
		});

		medicineComboBox.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				
				
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					medicineTableDataModel.addRow(new Object[] { medicineTableDataModel.getRowCount() + 1,
							medicineComboBox.getSelectedItem().toString() });
				}
				
				String str = medicineComboBox.getEditor().getItem().toString();
				System.out.println(str);

				if (str.length() > 3) {
					defaultComboBoxModel.removeAllElements();
					medicineComboBox.showPopup();
					defaultComboBoxModel.addElement(str);
					defaultComboBoxModel.addElement("saksjas");
					defaultComboBoxModel.addElement("sasas");
					defaultComboBoxModel.addElement("swewew");
				}
			}
		});
		medicinetable.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_DELETE) {
					int selectedRows[] = medicinetable.getSelectedRows();
					int count = 0;
					for (int i = 0; i < selectedRows.length; i++) {
						medicineTableDataModel.removeRow(selectedRows[i] - count);
						count++;
					}

					int rows = medicineTableDataModel.getRowCount();
					for (int i = 0; i < rows; i++) {
						medicineTableDataModel.setValueAt(i + 1, i, 0);
					}

				}
			}
		});

	}

	private void changeColor(Color color, Component component) {
		component.setBackground(color);
	}
}

class DateLabelFormatter extends AbstractFormatter {

	private String datePattern = "yyyy-MM-dd";
	private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

	@Override
	public Object stringToValue(String text) throws ParseException {
		return dateFormatter.parseObject(text);
	}

	@Override
	public String valueToString(Object value) throws ParseException {
		if (value != null) {
			Calendar cal = (Calendar) value;
			return dateFormatter.format(cal.getTime());
		}

		return "";
	}

}
