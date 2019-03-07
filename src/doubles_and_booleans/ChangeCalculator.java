package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickels=JOptionPane.showInputDialog(null,"How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
		int nickelnumber=Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
		String Dimes=JOptionPane.showInputDialog(null,"How many Dimes do you have?");
		int dimenumber=Integer.parseInt(Dimes);
		// Ask the user how many quarters they have, and convert their answer
		String quarters=JOptionPane.showInputDialog(null,"How many Quarters do you have?");
		int quarternumber=Integer.parseInt(quarters);
		// Calculate how much money the user has and save it in a double variable 
		
				double dollars =nickelnumber *0.05 + dimenumber*0.1 + dimenumber *0.25;
		// Tell the user how much money they have
				JOptionPane.showMessageDialog(null, "You have " + dollars);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}
}

