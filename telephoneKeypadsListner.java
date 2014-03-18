package telephoneKeypadsIntermediate;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class telephoneKeypadsListner implements ActionListener {
	
	
	static ArrayList<String> indexes = new ArrayList<String>();
	
	
	private JTextField inputbox;
	private JTextArea leOutput;
	String spaces = " ";

	public telephoneKeypadsListner(JTextField inputbox, JTextArea leOutput) {
		this.inputbox = inputbox;
		this.leOutput = leOutput;
		
	}
	
	
	public static void CreateArray(String s){
		
		for(String substring: s.split(" ")){
			
			String a = "2485083572085748";
			int count = 0;
			for (int i = 0, len = a.length(); i < len; i++) {
			    if (Character.isDigit(a.charAt(i))) {
			        count++;
			    }
			}
			
			
	        indexes.add(substring);
	        }
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String input;
		input = inputbox.getText();
		
		CreateArray(input);
		
		
		
		
		
		
		
		
		
		
		
	}

}
