import javax.swing.JOptionPane;

public class ownadventure {
	public static void main(String[] args) {
		String optionone = JOptionPane.showInputDialog(null,
				"You go out in the jungle for no reason. You come to an end because a steep 200 foot cliff is infront of you. You think of two things to do. Climb down with rope from your backpack or find another way.(type 1 or 2");
		if (optionone.equals("1")) {
			String optiontwo = JOptionPane.showInputDialog(null,
					"You choose to climb down with rope. As you do it, you realize your rope is breaking... ooops... You will either quickly go in a cave next to you or climb without a rope but we all know what the smarter choice is.(Pick 1 or 2)");
			if (optiontwo.equals("1")) {
				JOptionPane.showInputDialog(null,
						"You go into the cave and you find a unicorn there that gives you a ride home. THE END!!!");
			}
			if (optiontwo.equals("2")) {
				JOptionPane.showInputDialog(null, "You climb without a rope and die. THE END!!!");
			}
		} else if (optionone.equals("2")) {
			String optionthree = JOptionPane.showInputDialog(null,
					"You try to find another way. you come to a fork in the road. You can either go left or right.");
			if(optionthree.equals("Right")) {
				JOptionPane.showInputDialog(null,"You fall in a swamp and get eaten by a crocadile..a. THE END!!!");
			}
			if(optionthree.equals("Left")) {
				JOptionPane.showInputDialog(null,"You find a unicorn that takes you home. THE END!!!");
			}
		}

	}
}
