import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MovieTicket extends JFrame
{
	JComboBox CBHall, CBMovie, CBClass, CBAdult, CBChildren, CBInfant;
	JLabel LHall, LMovie, LBookingDate, LClass, LAdult, LChildren, LInfant, LBookingDetails, LPassengerDetails, LDate, LNotes;
	JTextField TFBookingDate;
	
	JButton BFindTicket;
	JPanel PPanel1, PPanel2;

	LoginPage type1;

	public MovieTicket(LoginPage type1)
	{
		Container c =getContentPane();
		c.setLayout(new BorderLayout());
		String[] sItem1={"KureGhor"};
		String[] sItem2={"Spider Man","Bangkok","Thor","Debi","Black Panther","Poramon 2","Nishwartha Bhalobasa","Black Widow","Bird Box","Venom"};
		String[] sItem3={"Economic","Business"};

		this.type1 = type1;
		PPanel1 = new JPanel(null);
		PPanel1.setPreferredSize(new Dimension(500,200));

		LBookingDetails = new JLabel("<html><b><font color=\"#C71585\">Booking Details</font></b></html>");
		LHall = new JLabel("Hall name  :");
		LMovie = new JLabel("Movie Name :");
		LBookingDate = new JLabel("Booking Date:");
		LClass = new JLabel("Class         :");

		CBHall = new JComboBox(sItem1);
		CBMovie = new JComboBox(sItem2);
		CBClass = new JComboBox(sItem3);

		TFBookingDate = new JTextField(10);
		LDate = new JLabel("(DD/MM/YYYY)");
		LDate.setForeground(Color.red);



		BFindTicket = new JButton("Find Ticket");

		LBookingDetails.setBounds(20,3,100,20);

		LHall.setBounds(20,40,100,20);
		CBHall.setBounds(100,40,100,20);

		LMovie.setBounds(20,100,100,20);
		CBMovie.setBounds(100,100,100,20);

		LBookingDate.setBounds(14,160,100,20);
		TFBookingDate.setBounds(100,160,100,20);
		LDate.setBounds(210,160,100,20);

		LClass.setBounds(20,220,100,20);
		CBClass.setBounds(100,220,100,20);

		BFindTicket.setBounds(50,270,100,25);


		PPanel1.add(LBookingDetails);
		PPanel1.add(LHall);
		PPanel1.add(CBHall);
		PPanel1.add(LMovie);
		PPanel1.add( CBMovie);
		PPanel1.add(LBookingDate);
		PPanel1.add(TFBookingDate);
		PPanel1.add(LDate);
		PPanel1.add(LClass);
		PPanel1.add(CBClass);
		PPanel1.add(BFindTicket);
		
		PPanel1.setBackground(Color.white);

		c.add(PPanel1,BorderLayout.WEST);

		PPanel2 = new JPanel(null);
		PPanel2.setPreferredSize(new Dimension(320,160));

		LPassengerDetails=new JLabel("<html><b><font color=\"#C71585\">PassengerDetails</font></b></html>");

		LAdult = new JLabel("Adults(12+)");

		LChildren = new JLabel("Children(2-11)");
		LInfant = new JLabel("Infants(under 2)");

		String[] item4={"1","2","3","4","5","6"};
		CBAdult = new JComboBox(item4);

		String[] item5={"0","1","2","3","4"};
		CBChildren = new JComboBox(item5);

		String[] item6={"0","1","2","3"};
		CBInfant = new JComboBox(item6);

		
		LNotes = new JLabel("<html><body><p>NOTE: Bookings with International Credit Cards <p> have temporarily been suspended.This Service<p> will resume shortly and we will have a notice<p> posted on our website.We regret any <p>inconvenience caused to our passengers.</body></html>");

		LPassengerDetails.setBounds(40,3,100,20);

		LAdult.setBounds(40,40,100,20);
		CBAdult.setBounds(140,40,100,20);

		LChildren.setBounds(40,105,100,20);
		CBChildren.setBounds(140,105,100,20);

		LInfant.setBounds(40,170,100,20);
		CBInfant.setBounds(140,170,100,20);

	
		LNotes.setBounds(55,240,380,180);

		PPanel2.add(LPassengerDetails);
		PPanel2.add(LAdult);
		PPanel2.add(LChildren);
		PPanel2.add(LInfant);
		PPanel2.add(CBAdult);
		PPanel2.add(CBChildren);
		PPanel2.add(CBInfant);

		PPanel2.add(LNotes);
		

		PPanel2.setBackground(Color.white);

		c.add(PPanel2,BorderLayout.EAST);

		setSize(795,580);
		setVisible(true);

		BFindTicket.addActionListener(new button2(this, type1));
	}
	public static void main(String args[])
	{
		LoginPage type1=null;
		new MovieTicket(type1);
	}
}

class button2 implements ActionListener
{
	MovieTicket type;
	LoginPage type1;
	button2(MovieTicket type, LoginPage type1)
	{
		this.type = type;
		this.type1 = type1;
	}
	public void actionPerformed(ActionEvent e)
	{
		String sHall = (String)type.CBHall.getSelectedItem();
		String sMovie = (String)type.CBMovie.getSelectedItem();
		String sClass = (String)type.CBClass.getSelectedItem();
		String sBookingDate = type.TFBookingDate.getText();
		Integer iPrice=0;
		String sTime="";


		Integer iAdult = Integer.parseInt((String)type.CBAdult.getSelectedItem());
		Integer iChildren = Integer.parseInt((String)type.CBChildren.getSelectedItem());
		Integer iInfant = Integer.parseInt((String)type.CBInfant.getSelectedItem());

		int i = 0;

		if(sClass.equals("Economic"))
		{
			try{
				while(i<20)
				{
					if(type1.row2[i][1].equals(sMovie))
					{
						iPrice = Integer.parseInt((String)type1.row2[i][2]);
						sTime = (String)type1.row2[i][3];
						break;
					}
					i++;
				}
			}catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null, "You have no rights to access");
				System.exit(0);
			}
		}
		else
		{
			try
			{
				while(i<20)
				{
					if(type1.row2[i][1].equals(sMovie))
					{
						iPrice = Integer.parseInt((String)type1.row2[i][2]);
						sTime = (String)type1.row2[i][3];
						break;
					}
					i++;
				}
			}catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null, "You have no rights to access it");
				System.exit(0);
			}
		}
		type.setTitle(iPrice + " " + sTime);

		iPrice = (iPrice*iAdult)+(iPrice*(iChildren/2));

		int iCount=0;
		int iSeatCount=0;

		String[] sTempHall=new String[1250];
		String[] sTempMovie=new String[1250];
		String[] sTempClass=new String[1250];
		String[] sTempBookingDate=new String[1250];
		String[] sTempTime=new String[1250];
		Integer[] iTempAdult=new Integer[1250];
		Integer[] iTempChildren=new Integer[1250];
		Integer[] iTempInfant=new Integer[1250];
		Integer[] iTempPrice=new Integer[1250];

		try
		{
//read from data
			Save1 save1;
			ObjectInputStream OIS1 = new ObjectInputStream(new FileInputStream("save1"));
			do
			{
				save1 = (Save1)OIS1.readObject();
				sTempHall[iCount] = save1.sHall;
				sTempMovie[iCount] = save1.sMovie;
				sTempClass[iCount] = save1.sClass;
				sTempBookingDate[iCount] = save1.sBookingDate;
				sTempTime[iCount] = save1.sTime;
				iTempAdult[iCount] = save1.iAdult;
				iTempChildren[iCount] = save1.iChildren;
				iTempInfant[iCount] = save1.iInfant;
				iTempPrice[iCount] = save1.iPrice;

				iCount++;
				if(save1.sBookingDate.equals(sBookingDate))
					if(save1.sMovie.equals(sMovie))
						iSeatCount=iSeatCount + save1.iAdult + save1.iChildren + save1.iInfant;
			}while(save1!=null);
			OIS1.close();

		}
		catch(Exception e1)
		{
		}

		iSeatCount = iSeatCount + iAdult + iChildren + iInfant;

		if(iSeatCount > 100)
		{
			JOptionPane.showMessageDialog(null,"Seats are full. Sorry!");
		}
		else
		{
			int iChoice = JOptionPane.showConfirmDialog(null,"Seats available. Do you want to Book now?");
			if(iChoice == JOptionPane.YES_OPTION)
			{
				new PrintTicket1(sHall, sMovie, sClass, iAdult, iChildren, iInfant, sBookingDate, iPrice, sTime);
			try
			{
//write into data
				Save1 save2=new Save1(sHall, sMovie, sClass, iAdult, iChildren, iInfant, sBookingDate, iPrice, sTime);
				ObjectOutputStream OOS1 = new ObjectOutputStream(new FileOutputStream("save1"));
				for(i=0;i<iCount;i++)
				{
					Save1 temp1=new Save1(sTempHall[i], sTempMovie[i], sTempClass[i], iTempAdult[i], iTempChildren[i], iTempInfant[i], sTempBookingDate[i], iTempPrice[i], sTempTime[i]);
					OOS1.writeObject(temp1);
					System.out.println(temp1);
				}
				OOS1.writeObject(save2);
				OOS1.close();
			}catch(Exception e1)
			{
				System.out.println(e1);
			}
			}
			else
			{
			}
		}
	}
}


class Save1 implements Serializable // To serialize an object means to convert its state to a byte stream so that the byte stream can be reverted back into a copy of the object
{
	String sHall, sMovie, sClass, sBookingDate, sTime;
	Integer iPrice, iAdult, iChildren, iInfant;

	public Save1(String sHall, String sMovie, String sClass, Integer iAdult, Integer iChildren, Integer iInfant, String sBookingDate, Integer iPrice, String sTime)
	{
		this.sHall=sHall;
		this.sMovie=sMovie;
		this.sClass=sClass;
		this.iAdult=iAdult;
		this.iChildren=iChildren;
		this.iInfant=iInfant;
		this.sBookingDate=sBookingDate;
		this.iPrice=iPrice;
		this.sTime=sTime;
	}
	public String toString()
	{
		return sMovie+" "+sMovie+" "+sClass+" "+iAdult+" "+iChildren+" "+iInfant+" "+sBookingDate+" "+iPrice+" "+sTime;
	}
}
