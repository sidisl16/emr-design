package com.emr.app;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

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
	private AppointmentPanel appointmentPanel;
	private RoutingPanel addPatientPanel;
	private PatientPanel patientPanel;
	private JProgressBar progressBar;

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
	
	public HomeScreen() {
		initComponents();
		Router.INSTANCE.setLayeredPane(bodyLayeredPan);
		appointmentPanel = new AppointmentPanel();
		appointmentPanel.setProgressDialog(progressBar);
		Router.INSTANCE.registerRoute(appointmentPanel);
		bodyLayeredPan.add(appointmentPanel, BorderLayout.CENTER);
		addPatientPanel = new AddAppointmentPanel();
		Router.INSTANCE.registerRoute(addPatientPanel);
		bodyLayeredPan.add(addPatientPanel, BorderLayout.CENTER);
		patientPanel = new PatientPanel();
		patientPanel.setProgressDialog(progressBar);
		Router.INSTANCE.registerRoute(patientPanel);
		bodyLayeredPan.add(patientPanel, BorderLayout.CENTER);
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
		minIcon = new JLabel();
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

		progressBar = new JProgressBar();
		progressBar.setPreferredSize(new Dimension(148, 3));
		progressBar.setForeground(Color.ORANGE);
		progressBar.setBorderPainted(false);
		progressBar.setBorder(null);
		progressBar.setBackground(Color.decode("#262626"));
		progressBar.setValue(0);
		midTitlePanel.add(progressBar, BorderLayout.SOUTH);

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
	}

	private void changeColor(Color color, Component component) {
		component.setBackground(color);
	}
}

class DateLabelFormatter extends AbstractFormatter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
