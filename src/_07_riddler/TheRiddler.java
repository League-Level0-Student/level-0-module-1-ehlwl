package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String r = JOptionPane.showInputDialog("What is greater than God,\r\n" + 
				"more evil than the devil,\r\n" + 
				"the poor have it,\r\n" + 
				"the rich need it,\r\n" + 
				"and if you eat it, you'll die?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(r.equals("nothing")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "nope! answer is nothing.");
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		r = JOptionPane.showInputDialog("Who makes it, has no need of it.\r\n" + 
				"Who buys it, has no use for it.\r\n" + 
				"Who uses it can neither see nor feel it.\r\n" + 
				"What is it?");
		if(r.equals("coffin")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "nope! answer is coffin.");
		}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
	}
}

