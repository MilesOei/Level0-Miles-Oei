// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;
 
/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */
 
public class SecretMessageBox {
 
	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
		
	
	// 1. Set the passcode in a String variable
	String pass = "asdf";
	// 2. Using a pop-up, ask for a secret message and store it in a variable
 String secretMessage = JOptionPane.showInputDialog("Enter a secret message");
	// 3. Ask your friend for the passcode and store it in a variable
 String passAttempt = JOptionPane.showInputDialog("Please enter the password");
	// 4. If the passcode matches, show the secret message
 if(pass.equals(passAttempt)) {
	 JOptionPane.showMessageDialog(null, secretMessage);
 } else {
	 //5. If the passcode does not match, pop-up "INTRUDER!!"
 JOptionPane.showMessageDialog(null, "INTRUDER!!!!");
 
 
 }
	}
	// [optional] 6. Have your friend also enter a username, and make sure it is correct before releasing the secret message.
 
}
 
 
