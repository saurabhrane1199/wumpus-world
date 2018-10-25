package guitrial;



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.*;

public class trialframe extends JFrame implements ActionListener
{

	private JPanel contentPane;
	JButton b1,b2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trialframe frame = new trialframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public trialframe() {
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
		b1.setBackground(SystemColor.info);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		b1.setBounds(412, 145, 341, 92);
		contentPane.add(b1);
		
		 b2 = new JButton("Instructions");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		b2.setBackground(SystemColor.info);
		b2.setFont(new Font("Bebas Neue", Font.PLAIN, 35));
		b2.setBounds(412, 302, 341, 78);
		contentPane.add(b2);
		
		JButton btnAstarImplementation = new JButton("A-STAR IMPLEMENTATION");
		btnAstarImplementation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAstarImplementation.setFont(new Font("Bebas Neue", Font.PLAIN, 35));
		btnAstarImplementation.setBackground(SystemColor.info);
		btnAstarImplementation.setBounds(412, 442, 341, 78);
		contentPane.add(btnAstarImplementation);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Saurabh's HP\\Desktop\\ads_project\\futuristic-technology-abstract-background_4kbrmfuze__F0000.png"));
		lblNewLabel.setBounds(0, 0, 1185, 644);
		contentPane.add(lblNewLabel);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			Wumpu w = new Wumpu();
			Thread t = new Thread(w);
			t.start();
			dispose();
	}
	
	}	
}
