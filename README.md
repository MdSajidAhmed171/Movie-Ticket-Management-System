# Movie-Ticket-Management-System

Detailed Design (Code):

Firstly, we choice Coding Standard for our project:

Variable Name: 

 We follow lower camel case for variable declaration, first word starts with small latter and after all the words start with capital latter for separator, no space between words like following example
Function Definitions: Function declarations follow the Allman style like this example.

Example : 

                   Function firstFunction (datatype avg1, datatype avg2) {
                      If (condition) {
                         Statement;
                      }
                      return $var;
                   }
                   
Here is our Class and methods:

•	In View Movie and Login part we have 5 class :  

LoginPage: LoginPage class extends the JFrame parent class, and then We can use JPanel, JLabel, JButton, JTable, JScrollPane from the built-in swing package for the frontend. We use SetBounds() built-in method for frontend position and SetBackground () for color. We call these variables and methods in LoginPage() constructor. We use the array for store Hall name, Movie name, Price, and Time.
main() method is also located there.

button1: This class controls the Sign-in button. If the username and password are correct, the movie ticket class will be opened. The Java ActionListener is notified whenever you click on the button or menu item. It is notified against ActionEvent. The ActionListener interface is found in java.awt.event package.         
check() method check the valid password.

mouse1, mouse2:  We control the position of economic and business level (frontend) by mouse2 class. And mouse1 class control to sign in to the MovieTicket class. We use MouseAdapter interface. Extend this class to create a MouseEvent (including drag and motion events) or/and MouseWheelEvent listener and override the methods for the events of interest.

•	Movie Ticket Booking:

MovieTicket: MovieTicket class extends the JFrame parents class and then We can use JPanel, JLabel, JButton, JTextField, JComBox from built in swing package for frontend. We use SetBounds() built in method for frontend position and SetBackground () for color.  We call this variables and methods in MovieTicket() constructor. We store the movie ticket information into the file and calculate total ticket.

button2: In this class the ticket has been prepared. We store the user’s information in array variable for example HallName, Movie name, SeatClass, Time, User age etc. We calculate the amount of ticket price based on age. We store the information in file. Then calculate the seat and if the sum of amount cross the limitation of size then system show that "Seats are full. Sorry!" else "Seats available. Do you want to Book now?"
save1: save1 class print the booking information using toString() method in the console from file.

•	Ticket Print: 
PrintTicket: PrintTicket class extends the JFrame parents class, and then We can use JPanel, JLabel from the built-in swing package for frontend. We call these variables and methods in PrintTicket() constructor. We use SetBounds() built-in method for frontend position and SetBackground () for color.












