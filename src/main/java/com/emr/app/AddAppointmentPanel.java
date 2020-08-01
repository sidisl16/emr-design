package com.emr.app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.components.DateTimePicker;

public class AddAppointmentPanel extends JPanel {

	private JPanel addPatientPanel;
	private JPanel appointmentHeadingPanel;
	private JPanel appointmentHeadingTextContainer;
	private JLabel appointmentTextLbl;
	private JPanel addAppointmentBody;
	private JPanel saveCancelAppointmentContainer;
	private JPanel savePanel;
	private JLabel saveIcon;
	private JPanel cancelPanel;
	private JLabel cancelIcon;
	private JPanel footer;
	private JLabel copyrightInfo;
	private JPanel addappointmentFormbody;
	private JPanel appointmentScheduleContainer;
	private JPanel patientDetailsContainer;
	private JTextField nameTextField;
	private JLabel emailLbl;
	private JLabel assignLbl;
	private JLabel schedule;
	private JTextField emailTextField;
	private JTextField contactTextField;
	private JTextField ageTextField;
	private DatePickerSettings settings;
	private DateTimePicker dateTimePicker;
	private JComboBox assignDropdown;
	private JLabel nameLbl;
	private JLabel ageLbl;
	private JLabel genderLbl;
	private JLabel contactLbl;
	private JLabel addressLbl;
	private JTextArea addressTextArea;
	private JComboBox genderDropdown;

	/**
	 * Create the panel.
	 */
	public AddAppointmentPanel() {
		initComponents();
		initEvents();
	}

	private void initComponents() {
		setBackground(Color.decode("#ffffff"));
		setLayout(new BorderLayout(0, 0));

		appointmentHeadingPanel = new JPanel();
		appointmentHeadingPanel.setBorder(new LineBorder(Color.decode("#bfbfbf")));
		appointmentHeadingPanel.setBackground(Color.decode("#4d94ff"));
		appointmentHeadingPanel.setPreferredSize(new Dimension(70, 50));
		appointmentHeadingPanel.setLayout(new BorderLayout(0, 0));

		appointmentHeadingTextContainer = new JPanel();
		appointmentHeadingTextContainer.setBackground(Color.decode("#4d94ff"));
		appointmentHeadingTextContainer.setPreferredSize(new Dimension(200, 10));
		appointmentHeadingPanel.add(appointmentHeadingTextContainer, BorderLayout.WEST);
		appointmentHeadingTextContainer.setLayout(new BorderLayout(0, 0));

		appointmentTextLbl = new JLabel("Schedule Appointment");
		appointmentTextLbl.setForeground(Color.decode("#ffffff"));
		appointmentTextLbl.setHorizontalTextPosition(SwingConstants.CENTER);
		appointmentTextLbl.setHorizontalAlignment(SwingConstants.CENTER);
		appointmentTextLbl.setFont(new Font("Open Sans", Font.BOLD, 16));
		appointmentHeadingTextContainer.add(appointmentTextLbl, BorderLayout.CENTER);

		saveCancelAppointmentContainer = new JPanel();
		saveCancelAppointmentContainer.setBackground(Color.decode("#4d94ff"));
		saveCancelAppointmentContainer.setPreferredSize(new Dimension(110, 10));
		appointmentHeadingPanel.add(saveCancelAppointmentContainer, BorderLayout.EAST);
		saveCancelAppointmentContainer.setLayout(null);

		savePanel = new JPanel();
		savePanel.setToolTipText("Save");
		savePanel.setBackground(Color.decode("#4d94ff"));
		savePanel.setBounds(0, 0, 53, 48);
		saveCancelAppointmentContainer.add(savePanel);
		savePanel.setLayout(new BorderLayout(0, 0));

		saveIcon = new JLabel("");
		saveIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/com/emr/app/images/save-32.png")));
		saveIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		saveIcon.setHorizontalAlignment(SwingConstants.CENTER);
		savePanel.add(saveIcon, BorderLayout.CENTER);

		cancelPanel = new JPanel();
		cancelPanel.setToolTipText("Add new Appointment");
		cancelPanel.setBackground(Color.decode("#4d94ff"));
		cancelPanel.setBounds(57, 0, 53, 48);
		saveCancelAppointmentContainer.add(cancelPanel);
		cancelPanel.setLayout(new BorderLayout(0, 0));

		cancelIcon = new JLabel("");
		cancelIcon.setIcon(new ImageIcon(HomeScreen.class.getResource("/com/emr/app/images/back-32.png")));
		cancelIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		cancelIcon.setHorizontalAlignment(SwingConstants.CENTER);
		cancelPanel.add(cancelIcon, BorderLayout.CENTER);

		add(appointmentHeadingPanel, BorderLayout.NORTH);

		addAppointmentBody = new JPanel();
		addAppointmentBody.setBackground(Color.decode("#ffffff"));
		addAppointmentBody.setLayout(new BorderLayout(0, 0));
		add(addAppointmentBody, BorderLayout.CENTER);

		footer = new JPanel();
		footer.setBackground(Color.decode("#ffffff"));
		footer.setPreferredSize(new Dimension(10, 20));
		addAppointmentBody.add(footer, BorderLayout.SOUTH);
		footer.setLayout(new BorderLayout(0, 0));

		copyrightInfo = new JLabel("Copyright \u00a9" + " 2020 Orange Inc.");
		copyrightInfo.setFont(new Font("Open Sans", Font.BOLD, 12));
		copyrightInfo.setHorizontalAlignment(SwingConstants.CENTER);
		footer.add(copyrightInfo, BorderLayout.CENTER);

		addappointmentFormbody = new JPanel();
		addappointmentFormbody.setBorder(new EmptyBorder(30, 30, 30, 30));
		addappointmentFormbody.setBackground(Color.decode("#ffffff"));
		addAppointmentBody.add(addappointmentFormbody, BorderLayout.CENTER);
		addappointmentFormbody.setLayout(new BorderLayout(0, 0));

		appointmentScheduleContainer = new JPanel();
		appointmentScheduleContainer.setBorder(new TitledBorder(new LineBorder(Color.decode("#262626")), "Assign",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		appointmentScheduleContainer.setBackground(Color.decode("#ffffff"));
		appointmentScheduleContainer.setPreferredSize(new Dimension(10, 100));
		addappointmentFormbody.add(appointmentScheduleContainer, BorderLayout.SOUTH);
		appointmentScheduleContainer.setLayout(null);

		assignLbl = new JLabel("Assign");
		assignLbl.setFont(new Font("Open Sans", Font.BOLD, 12));
		assignLbl.setBounds(12, 45, 64, 17);
		appointmentScheduleContainer.add(assignLbl);

		schedule = new JLabel("Schedule");
		schedule.setFont(new Font("Open Sans", Font.BOLD, 12));
		schedule.setBounds(373, 45, 71, 17);
		appointmentScheduleContainer.add(schedule);

		settings = new DatePickerSettings();
		dateTimePicker = new DateTimePicker(settings, null);
		settings.setDateRangeLimits(LocalDate.now(), LocalDate.now().plus(300, ChronoUnit.MONTHS));
		dateTimePicker.setDateTimePermissive(LocalDateTime.now());
		dateTimePicker.setBounds(437, 41, 242, 26);

		appointmentScheduleContainer.add(dateTimePicker);

		assignDropdown = new JComboBox();
		assignDropdown.setBorder(new LineBorder(Color.decode("#262626")));
		assignDropdown.setBackground(Color.decode("#ffffff"));
		assignDropdown.setFont(new Font("Open Sans", Font.BOLD, 12));
		assignDropdown.setBounds(66, 40, 231, 26);
		appointmentScheduleContainer.add(assignDropdown);

		patientDetailsContainer = new JPanel();
		patientDetailsContainer.setBackground(Color.decode("#ffffff"));
		patientDetailsContainer.setBorder(new TitledBorder(new LineBorder(Color.decode("#262626")), "Patient Details",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		addappointmentFormbody.add(patientDetailsContainer, BorderLayout.CENTER);
		patientDetailsContainer.setLayout(null);

		nameLbl = new JLabel("Name");
		nameLbl.setFont(new Font("Open Sans", Font.BOLD, 12));
		nameLbl.setBounds(12, 47, 51, 17);
		patientDetailsContainer.add(nameLbl);

		nameTextField = new JTextField();
		nameTextField.setBorder(new LineBorder(Color.GRAY));
		nameTextField.setBounds(68, 45, 230, 30);
		patientDetailsContainer.add(nameTextField);
		nameTextField.setColumns(10);

		ageLbl = new JLabel("Age");
		ageLbl.setFont(new Font("Open Sans", Font.BOLD, 12));
		ageLbl.setBounds(363, 47, 51, 17);
		patientDetailsContainer.add(ageLbl);

		genderLbl = new JLabel("Gender");
		genderLbl.setFont(new Font("Open Sans", Font.BOLD, 12));
		genderLbl.setBounds(12, 94, 51, 17);
		patientDetailsContainer.add(genderLbl);

		contactLbl = new JLabel("Contact No");
		contactLbl.setFont(new Font("Open Sans", Font.BOLD, 12));
		contactLbl.setBounds(363, 94, 72, 17);
		patientDetailsContainer.add(contactLbl);

		addressLbl = new JLabel("Address");
		addressLbl.setFont(new Font("Open Sans", Font.BOLD, 12));
		addressLbl.setBounds(12, 139, 51, 17);
		patientDetailsContainer.add(addressLbl);

		addressTextArea = new JTextArea();
		addressTextArea.setBorder(new LineBorder(Color.decode("#262626")));
		addressTextArea.setBounds(68, 138, 230, 90);
		patientDetailsContainer.add(addressTextArea);

		emailLbl = new JLabel("Email");
		emailLbl.setFont(new Font("Open Sans", Font.BOLD, 12));
		emailLbl.setBounds(363, 139, 51, 17);
		patientDetailsContainer.add(emailLbl);

		emailTextField = new JTextField();
		emailTextField.setColumns(10);
		emailTextField.setBounds(443, 137, 230, 30);
		patientDetailsContainer.add(emailTextField);

		contactTextField = new JTextField();
		contactTextField.setColumns(10);
		contactTextField.setBounds(443, 92, 230, 30);
		patientDetailsContainer.add(contactTextField);

		ageTextField = new JTextField();
		ageTextField.setColumns(10);
		ageTextField.setBounds(443, 45, 230, 30);
		patientDetailsContainer.add(ageTextField);

		genderDropdown = new JComboBox();
		genderDropdown.setFont(new Font("Open Sans", Font.BOLD, 12));
		genderDropdown.setBorder(new LineBorder(Color.decode("#262626")));
		genderDropdown.setBackground(Color.decode("#ffffff"));
		genderDropdown.setBounds(67, 89, 231, 26);
		patientDetailsContainer.add(genderDropdown);
	}

	private void initEvents() {
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

		cancelPanel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(Color.decode("#99c2ff"), cancelPanel);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(Color.decode("#4d94ff"), cancelPanel);
			}
		});
	}

	private void changeColor(Color color, Component component) {
		component.setBackground(color);
	}
}
