package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/* You MUST use the above boolean variables in your code */

		/*
		 * Ask the user for these values using a confirm dialog like the one below
		 * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head",
		 * JOptionPane.YES_NO_OPTION);
		 */
		int weekday = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		if (weekday == 0) {
			isWeekday = true;
		} else if (weekday == 1) {
			isVacation = true;
		}
		/*
		 * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!�? If it is a weekday, and we are on vacation, print “sleep
		 * in�?.
		 */
		if (isWeekday = true) {
			JOptionPane.showMessageDialog(null, "Get up lazybones!");
		}
		if (isVacation = true) {
			JOptionPane.showMessageDialog(null, "sleep in        zzzzzzz");
		}

	}
}
