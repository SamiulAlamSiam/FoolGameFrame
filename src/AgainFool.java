import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class AgainFool extends JFrame{
	
	private JLabel lblTitle1;
	private JButton btnAgain, btnExit;
	private int mode=0;
	private JPanel panel;
	
	public AgainFool(int x)
	{
		mode=x;
		panel= new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(Color.BLACK,2),"Result"));
		panel.setBounds(0, 0, 790, 490);
		panel.setLayout(null); 
		add(panel);
		this.DComponent(); 	
	}
	
	public void DComponent()
	{
		if(mode==1) 
			this.setTitle("Not Fool");
		else
			this.setTitle("Fool");
		 
		this.setSize(800, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.addComponen();
	}
	
	public void addComponen()
	{
		if(mode==1)
		{
			lblTitle1= new JLabel("U R Not Fool !!");
			lblTitle1.setBackground(Color.GREEN);  
			panel.setBackground(Color.GREEN); 
		}
			
		else
		{
			lblTitle1= new JLabel("OOPS...!! U R Fool");
			lblTitle1.setBackground(Color.RED);
			panel.setBackground(Color.RED); 
		}
		
		lblTitle1.setBounds(300, 135, 250, 50);
		lblTitle1.setFont(new Font("serif", Font.BOLD, 22));
		lblTitle1.setForeground(Color.BLACK);
		this.panel.add(lblTitle1);
		
		
		btnAgain= new JButton("Again");
		btnAgain.setBackground(Color.GREEN);
		btnAgain.setBounds(250, 195, 100, 50);
		btnAgain.setFont(new Font("serif", Font.BOLD, 22));
		btnAgain.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				GUIFoolGameFrame gff=new GUIFoolGameFrame();
				gff.setVisible(true);
				setVisible(false);
			}
		});
//		btnYes.setForeground(Color.CYAN);
		this.panel.add(btnAgain);
		
		btnExit= new JButton("Exit");
		btnExit.setBackground(Color.RED);
		btnExit.setBounds(375, 195, 100, 50);
		btnExit.setFont(new Font("serif", Font.BOLD, 22));
		btnExit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);	
			}
		});
		this.panel.add(btnExit);
	}

}
