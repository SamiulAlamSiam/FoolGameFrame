import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class GUIFoolGameFrame extends JFrame{
	
	private JLabel lblTitle,lblFool;
	private JButton btnYes, btnNo;
	Random random = new Random();
	Timer timer;
	
	public GUIFoolGameFrame()
	{
		this.setTitle("Fool Game");
		this.setSize(800, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.AddComponent(); 
	}   
	
	public void AddComponent()
	{
		lblTitle= new JLabel("Welcome To Fool Game");
		lblTitle.setBounds(250, 5, 250, 50);
		lblTitle.setFont(new Font("serif", Font.BOLD, 22));
		lblTitle.setForeground(Color.BLACK);
		add(lblTitle);
		
		lblFool= new JLabel("Are You Fool.......??");
		lblFool.setBounds(300, 135, 250, 50);
		lblFool.setFont(new Font("serif", Font.BOLD, 22));
		lblFool.setForeground(Color.BLACK);
		add(lblFool);
		
		
		btnYes= new JButton("Yes");
		btnYes.setBackground(Color.GREEN);
		btnYes.setBounds(250, 195, 100, 50);
		btnYes.setFont(new Font("serif", Font.BOLD, 22));
		btnYes.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				AgainFool af=new AgainFool(0);
				af.setVisible(true);
				setVisible(false);
				//JOptionPane.showMessageDialog(null, "Yes Button Clicked");
				
			}
		});
//		btnYes.setForeground(Color.CYAN);
		add(btnYes);
		
		btnNo= new JButton("No");
		btnNo.setBackground(Color.RED);
		btnNo.setBounds(375, 195, 100, 50);
		btnNo.setFont(new Font("serif", Font.BOLD, 22));
		btnNo.addMouseListener(new MouseListener() 
		{
			public void mouseEntered(MouseEvent arg0) 
			{
				int y=random.nextInt(450);
				int x=random.nextInt(700); 
				btnNo.setBounds(x, y, 100, 50);  	
			}
			public void mouseReleased(MouseEvent arg0) {}
			public void mousePressed(MouseEvent arg0) {}  
			public void mouseExited(MouseEvent arg0) {}
			public void mouseClicked(MouseEvent arg0) {}
		});
		
		btnNo.addFocusListener(new FocusListener() 
		{
			public void focusLost(FocusEvent e) {}
	
			public void focusGained(FocusEvent e) 
			{
				AgainFool af=new AgainFool(1);
				af.setVisible(true);
				setVisible(false);
				
			}
		});
//		btnNo.setForeground(Color.CYAN);
		add(btnNo);
	}

}
