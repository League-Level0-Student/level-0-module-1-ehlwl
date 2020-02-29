package _02_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String m = JOptionPane.showInputDialog("what is the month of your birthday?");
		String d = JOptionPane.showInputDialog("what is the date of your birthday?");
		if(m.equals("2")) {
			if(d.equals("29")) {
				System.out.println("Happy birthday!!!!!");
				System.out.println("Maybe you wait 4years for your birthday.");
			}
			else {
				System.out.println("Your birthday already passed.");
			}
		
		}
		else {
			System.out.println("Have a nice day with waiting for birthday!");
		}
		
		
		
	}
	
}
