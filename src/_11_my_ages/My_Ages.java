package _11_my_ages;

import javax.swing.JOptionPane;

public class My_Ages {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("whats your age?");
		int age = Integer.parseInt(a);
		for(int i = 1; i < age+1; i++) {
			System.out.println(i);
		}
	}
}
