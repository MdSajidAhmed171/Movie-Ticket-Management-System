//Importing all necessary Packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.text.*;

public class LoginPage extends JFrame
{
	Container c = getContentPane(); // getContentPane() method retrieves the content pane layer so that we can add an object to it.
	JPanel PSeatTypes = new JPanel(null); // store a group of seatType components
	JPanel PLogin = new JPanel(null); // store Login components
	JPanel PSeatDetails = new JPanel(null); // store a group of seat details components

	public boolean bCheck=true;

	JLabel LWelcome = new JLabel("Welcome to Cineplex."); // display the welcome strings line

	JLabel LUserName, LPassword; // declare variable for display the user name and password string 

	JLabel LMovieTicket1 = new JLabel("Movie Ticket Booking"); // display the strings line
	
	JTextField TFUserName; // text field for user name
	JPasswordField TPPassword; // text field for password

	JButton BLogin; // sign-in button

	final Object[] col1 ={ "Hall Name", "Movie Name", "Price", "Time" };
	final Object[] col2 ={ "Hall Name", "Movie Name", "Price", "Time" };

	final Object[][] row1 = { { "KureGhor", "Spider Man", "325", "11:30" }, { "KureGhor", "Thor", "225", "13:00" }, { "KureGhor", "Debi", "425 ", "08:30" }, { "KureGhor", "Poramon 2", "125 ", "15:50" }, { "KureGhor", "Nishwartha Bhalobasa", "225", "05:00" }, { "KureGhor", "Bird Box", "225 ", "05:30" }, { "KureGhor", "Black Panther", "325 ", "05:30" }, { "KureGhor", "Black Widow", "125", "12:00" }, { "KureGhor", "Venom", "225", "19:00" } };
	final Object[][] row2 = { { "KureGhor", "Spider Man", "375", "11:30" }, { "KureGhor", "Thor", "675", "13:00" }, { "KureGhor", "Debi", "475", "08:30" }, { "KureGhor", "Poramon 2", "375", "15:50" }, { "KureGhor", "Nishwartha Bhalobasa", "575", "05:00" }, { "KureGhor", "Bird Box", "475", "05:30" }, { "KureGhor", "Black Panther", "975", "05:30" }, { "KureGhor", "Black Widow", "575", "12:00" }, { "KureGhor", "Venom", "375", "19:00" } };
	
	JTable TMovieTicket = new JTable(row1, col1); // economic class movie ticket
	JTable TMovieTicket1 = new JTable(row2, col2); // business class movie ticket


	JScrollPane JSP1 = new JScrollPane(TMovieTicket, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED); // JscrollPane is used to make scrollable view of a component
	JScrollPane JSP2 = new JScrollPane(TMovieTicket1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED); // JscrollPane is used to make scrollable view of a component
	


	JLabel LEconomic = new JLabel("Economic", SwingConstants.LEFT);
	JLabel LBusiness = new JLabel("Business", SwingConstants.LEFT);
	JLabel LEconomic1 = new JLabel("Economic", SwingConstants.LEFT);
	JLabel LBusiness1 = new JLabel("Business",  SwingConstants.LEFT);

	public LoginPage()
	{
		
		setPreferredSize(new Dimension(796,572)); // full page dimension

		PSeatTypes.setBackground(Color.white); // set the background color
		PLogin.setBackground(Color.white); // set the background color
		PSeatDetails.setBackground(Color.white); // set the background color

		JSP1.setBounds(0, 340, 790, 200); // set the JSP1(economic class movie ticket) position
		JSP2.setBounds(0, 340, 790, 200); // set the JSP2(business class movie ticket) position
		

		PSeatTypes.setBounds(0,0,500, 340); //set the position of seat types
		PLogin.setBounds(500,0,350, 340); //set the position of seat types
		PSeatDetails.setBounds(0,340,790,200); //set the position of seat types


		LUserName = new JLabel("         User Name ");  // Initialize variable display the user name
		LPassword = new JLabel("         Password "); // Initialize variable display the password
		TFUserName = new JTextField(10); // Initialize the size of text field
		TPPassword = new JPasswordField(10); // Initialize the size of password field
		BLogin = new JButton("Sign In"); // Initialize variable display the sign in button

		LUserName.setBounds(40, 100, 100, 21); //set the position of user name
		LPassword.setBounds(40, 140, 100, 21); //set the position of password
		TFUserName.setBounds(160, 100, 100, 21); //set the position of user name field
		TPPassword.setBounds(160, 140, 100, 21); //set the position of password field
		BLogin.setBounds(160, 200, 100,25); //set the position of sign in button

		LMovieTicket1.setBounds(60, 60, 138, 20);
		
		PLogin.add(LUserName);
		PLogin.add(TFUserName);
		PLogin.add(LPassword);
		PLogin.add(TPPassword);
		PLogin.add(BLogin);

		PSeatDetails.add(JSP1);
		PSeatDetails.add(JSP2);
	

		JSP1.setVisible(true);
		JSP2.setVisible(false);
		
		LBusiness.setBounds(265, 170, 300, 125);
		LEconomic.setBounds(0, 170, 250, 125);
		LBusiness1.setBounds(280, 200, 135, 60);
		LEconomic1.setBounds(50, 200, 147, 60);

		PSeatTypes.add(LEconomic);
		PSeatTypes.add(LBusiness);
		PSeatTypes.add(LEconomic1);
		PSeatTypes.add(LBusiness1);

		LBusiness.setVisible(false);
		LEconomic1.setVisible(false);
		LBusiness1.setVisible(true);
		LEconomic.setVisible(true);


		LWelcome.setBounds(60, 60, 220, 25);
		

		c.add(PSeatTypes);
		c.add(PLogin);
		c.add(PSeatDetails);

		PSeatTypes.add(LWelcome);
		

		pack();// The pack() method is defined in Window class in Java and it sizes the frame so that all its contents are at or above their preferred sizes.
		setVisible(true); // setVisible(true) method makes the frame appear on the screen.


		LMovieTicket1.addMouseListener(new mouse3(this, true)); // The this keyword can also be passed as an argument in the method. It is mainly used in the event handling
		
		LBusiness1.addMouseListener(new mouse2(this, true)); // The this keyword can also be passed as an argument in the method. It is mainly used in the event handling
		LEconomic1.addMouseListener(new mouse2(this, false)); // The this keyword can also be passed as an argument in the method. It is mainly used in the event handling
		
		BLogin.addActionListener(new button1(this)); // The this keyword can also be passed as an argument in the method. It is mainly used in the event handling
		
	}

	public static void main(String args[])
	{
		new LoginPage();
	}
}


class button1 implements ActionListener
{
	LoginPage type;
	char[] cCheck, cPassword={'a','d','m','i','n','\0'}; // '\0' serves as a reserved character used to signify the end of a string
	JFrame f;
	String sCheck,sCheck1="admin";

	public button1(LoginPage type)
	{
		this.type = type;
	}
	public void actionPerformed(ActionEvent e)
	{
		cCheck=type.TPPassword.getPassword();
		sCheck = type.TFUserName.getText();
		if ((sCheck1.equals(sCheck)) && check()) // if password & user name is correct then show the Movie ticket level
		{
			type.PLogin.add(type.LMovieTicket1); // add movie ticket level
			type.PLogin.remove(type.LUserName); // remove user name after login
			type.PLogin.remove(type.TFUserName); // remove user name after login
			type.PLogin.remove(type.LPassword); // remove user name after login
			type.PLogin.remove(type.TPPassword); // remove user name after login
			type.PLogin.remove(type.BLogin); // remove user name after login

			type.c.repaint(); //  repaint container class components
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid username or password. Try again"); // notification
		}
	}
	public boolean check() // check the password valid or not
	{
		if (cCheck.length >= 6 || cCheck.length < 4) {
			return false;
		}
		for(int i=0;i<=4;i++) {
			if(cCheck[i]!=cPassword[i])
				return false;
		}
		return true;
	}
}



class mouse3 extends MouseAdapter
{
	LoginPage type;
	boolean bCheck;

	public mouse3(LoginPage type, boolean bCheck)
	{
		this.type = type;
		this.bCheck = bCheck;
	}
	public void mouseEntered(MouseEvent e)
	{
		type.LMovieTicket1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
	}
	public void mouseClicked(MouseEvent e)
	{
		if (bCheck)
			new MovieTicket(type);
	}
}


class mouse2 extends MouseAdapter
{
	LoginPage type;
	boolean bCheck;

	public mouse2(LoginPage type, boolean bCheck)
	{
		this.type = type;
		this.bCheck = bCheck;
	}
	public void mouseEntered(MouseEvent e)
	{
		type.LEconomic1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		type.LBusiness1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	public void mouseClicked(MouseEvent e)
	{
		if(type.bCheck)
		{
			if (bCheck)
			{
				type.LBusiness1.setVisible(false);
				type.LBusiness.setVisible(true);
				type.LEconomic.setVisible(false);
				type.LEconomic1.setVisible(true);
				type.JSP1.setVisible(false);
				type.JSP2.setVisible(true);
				
			}
			else
			{
				type.LEconomic1.setVisible(false);
				type.LBusiness.setVisible(false);
				type.LBusiness1.setVisible(true);
				type.LEconomic.setVisible(true);
				type.JSP1.setVisible(true);
				type.JSP2.setVisible(true);
			}
		}
		
	}
}

