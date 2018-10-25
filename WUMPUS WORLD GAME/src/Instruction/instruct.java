package Instruction;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.SwingConstants;

public class instruct {

	public JFrame frame;

		public instruct() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBounds(new Rectangle(5, 5, 5, 5));
		frame.getContentPane().setBackground(new Color(240, 248, 255));
		frame.setBounds(100, 100, 600, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tInstructions");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 31));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setAutoscrolls(true);
		lblNewLabel.setBackground(new Color(240, 248, 255));
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setBounds(203, 11, 169, 59);
		frame.getContentPane().add(lblNewLabel);
		
		JTextPane txtpnYouAre = new JTextPane();
		txtpnYouAre.setForeground(new Color(0, 0, 0));
		txtpnYouAre.setFont(new Font("Calibri", Font.PLAIN, 18));
		txtpnYouAre.setSelectionColor(Color.YELLOW);
		txtpnYouAre.setSelectedTextColor(Color.BLUE);
		txtpnYouAre.setBackground(new Color(240, 248, 255));
		txtpnYouAre.setText("1. You are the node with the triangle in it and purple color nodes are the neighbouring nodes.\r\n2. You can only move to or shoot at the the purple color nodes\r\n3. Kill the wumpus to win\r\n4. You have 3 arrows use them to kill them wumpus.\r\n5. When you perceive an awful smell there might be a wumpus around you. The wumpus kills you so beware of it.\r\n6. When you perceive a rustling there might be bats around you. Bats drop you in random rooms.\r\n7. When you feel a draft there might be a pit around you. Falling in a pit means the game is over.\t\t\r\n\t\t\t\t\r\n");
		txtpnYouAre.setBounds(10, 81, 564, 319);
		frame.getContentPane().add(txtpnYouAre);
	}
}
