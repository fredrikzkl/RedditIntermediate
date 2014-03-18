package telephoneKeypadsIntermediate;



import java.awt.*;

import javax.swing.*;

public class keypadMain {
	
	public static void CreateLeFrame(){
		JFrame window = new JFrame("Telephone Keypad");
		window.setLayout(new FlowLayout());
		
		JLabel textField1 = new JLabel("Type inn your message(Integers from 2-9): ");
		JTextField inputField = new JTextField(25);
		
		JTextArea outputField = new JTextArea(20,25);
		
		telephoneKeypadsListner navi = new telephoneKeypadsListner(inputField,outputField);
		
		window.add(textField1);
		window.add(inputField);
		window.add(outputField);
		inputField.addActionListener(navi);
		window.setSize(400,400);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	public static void main(String[] args) {
		CreateLeFrame();
		

	}

}
