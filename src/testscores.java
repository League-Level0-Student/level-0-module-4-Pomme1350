import javax.swing.JOptionPane;

public class testscores {
public static void main(String[] args) {
	String score =JOptionPane.showInputDialog(null,"What is your test score?(what was your percentage...)");
	double percentage=Double.parseDouble(score);
	if(percentage>=75) {
		JOptionPane.showMessageDialog(null, "You did Great!!!");
	}
	else if(percentage<75) {
		JOptionPane.showMessageDialog(null, "You did ok...kinda...");
	}
}
}
