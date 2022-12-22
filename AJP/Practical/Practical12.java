// Write a program to demonstrate the use of JTextField and JPasswordField using  Listerner Interface.

import javax.swing.*;
import java.awt.event.*;

public class Practical12 extends JPanel 
{

// create an object of the JLabel class
	JLabel lblName;
	JLabel lblPasswd;

// create an object of the JPassword class
	JTextField txtName;
	JPasswordField txtPasswd;

	public Practical12()
	{
		lblName = new JLabel("Enter the User Name: ");
		txtName = new JTextField(10);
		lblPasswd = new JLabel("Enter the Password: ");
		txtPasswd = new JPasswordField(10);
		txtPasswd.setEchoChar('*');

	// Add tooltips to the text fields
		txtName.setToolTipText("Enter User Name");
		txtPasswd.setToolTipText("Enter Password");

	//Add labels to the Panel.
		add(lblName);
		add(txtName);
		add(lblPasswd);
		add(txtPasswd);
	}

	public static void main(String[] args)
	{
	// calls the PassDemo constructor.
		Practical12 demo = new Practical12();

	// set the text on the frame
		JFrame frm = new JFrame("Password Demo");
		frm.setContentPane(demo);

	/* setSize() method is used to specify the width and height of the frame */
		frm.setSize(275,300);

	// To display the Frame
		frm.setVisible(true);
		WindowListener listener = new WindowAdapter()
		{
			public void windowClosing(WindowEvent winEvt)
			{
				System.exit(0);
			}
		};  // End of WindowAdaptor() method

	// Window listener activates the windowClosing() method
		frm.addWindowListener(listener);
	}  // End of main() method
}         // End of class declaration