import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;


public class SwingJRadio extends JFrame {

	public SwingJRadio() {
		
		JRadioButton option1 = new JRadioButton("Player 1");
		JRadioButton option2 = new JRadioButton("Player 2");
		JRadioButton option3 = new JRadioButton("Player 3");
		
		ButtonGroup group = new ButtonGroup();
		group.add(option1);
		group.add(option2);
		group.add(option3);
		
		setLayout(new FlowLayout());
		
		add(option1);
		add(option2);
		add(option3);
		
		pack();
	}
	 public static void main(String[] args) {
		 SwingUtilities.invokeLater(new Runnable() {
			 
			@Override
			public void run() {
				new SwingJRadio().setVisible(true);
			}
		 });
	 }
}
