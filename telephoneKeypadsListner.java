package telephoneKeypadsIntermediate;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class telephoneKeypadsListner implements ActionListener {
	
	
	
	private JTextField inputbox;
	private JTextArea leOutput;
	String spaces = " ";

	public telephoneKeypadsListner(JTextField inputbox, JTextArea leOutput) {
		this.inputbox = inputbox;
		this.leOutput = leOutput;
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String input;
		input = inputbox.getText();
		String[] parts = input.split(" ");
		for (String a:parts){
			System.out.print(a);
		}
		
		
		
		//int inputInt = Integer.parseInt(nigg);
		
		
		
		
	}

}
