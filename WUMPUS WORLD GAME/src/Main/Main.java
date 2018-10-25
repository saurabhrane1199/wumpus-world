package Main;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Astar.Frame;
import Astar.Point;
import Instruction.instruct;
import wumpus.Wumpus;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener
{
	Point[] p = new Point[2];
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JButton b1,b2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
					frame.setTitle("WUMPUS WORLD GAME");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1179, 680);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 b1 = new JButton("New Game");
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		b1.setFont(new Font("Bebas Neue", Font.PLAIN, 35));
		b1.setForeground(SystemColor.menuText);
		b1.setBackground(SystemColor.yellow);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		b1.setBounds(412, 145, 341, 92);
		contentPane.add(b1);
		
		 b2 = new JButton("Instructions");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				instruct i = new instruct();
				i.frame.setVisible(true);
			}
		});
		b2.setBackground(SystemColor.yellow);
		b2.setFont(new Font("Bebas Neue", Font.PLAIN, 35));
		b2.setBounds(412, 302, 341, 78);
		contentPane.add(b2);
		
		JButton btnAstarImplementation = new JButton("A-STAR");
		btnAstarImplementation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(int i=0;i<2;i++){
					try {
						String str1 = JOptionPane.showInputDialog("Enter the x coordinate of the "+(i==0?"player":"wumpus")+" for the 7*7 map");
						String str2 = JOptionPane.showInputDialog("Enter the y coordinate of the "+(i==0?"player":"wumpus")+ " for the 7*7 map");
						int coord_x = Integer.parseInt(str1);
						int coord_y = Integer.parseInt(str2);
						p[i]=new Point(coord_x,coord_y);
					}catch(Exception e) {
						JOptionPane.showMessageDialog(null, "ENTER THE COORDINATES PROPERLY", "ERROR", i);
					}                           // input dialog returns always a string
				}
					new Frame(7,7,1,p[0],p[1]);
			}
		});
		btnAstarImplementation.setFont(new Font("Bebas Neue", Font.PLAIN, 35));
		btnAstarImplementation.setBackground(SystemColor.yellow);
		btnAstarImplementation.setBounds(412, 442, 341, 78);
		contentPane.add(btnAstarImplementation);
		
		JLabel lblNewLabel = new JLabel(" ");
		lblNewLabel.setIcon(new ImageIcon("/images/icon.png"));
		lblNewLabel.setBounds(0, 0, 1185, 644);
		contentPane.add(lblNewLabel);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			Wumpus w = new Wumpus();
			Thread t = new Thread(w);
			t.start();
			dispose();
	}
	
	}	
}
