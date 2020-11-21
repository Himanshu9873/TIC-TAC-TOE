package game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StartWindow extends JFrame
{
  JLabel lb,lbimg;
  JRadioButton rb1,rb2;
  JPanel panel1,panel2;
  Container container;
  JButton b1,b2;
  
  StartWindow()
  {   
    super();
	setLocationRelativeTo(null);
	container=getContentPane();
	
	panel1=new JPanel();
	panel1.setBounds(50,30,400,50);
	panel1.setBorder(BorderFactory.createLineBorder(Color.black));
	panel1.setLayout(null);
	container.add(panel1);
	
    lb = new JLabel("TIC TAC TOE ");
    rb1 = new JRadioButton("Single Player");
    rb2 = new JRadioButton("Multi Player");
    b1=new JButton("Start");
    b2=new JButton("Exit");
    ButtonGroup bg = new ButtonGroup();
    
	lb.setFont(new Font("Tahoma",Font.BOLD,30));
    lb.setBounds(90,10,200,30);
	panel1.add(lb);
	
	panel2=new JPanel();
	panel2.setBounds(50,180,400,220);
	panel2.setBorder(BorderFactory.createBevelBorder(1));
	panel2.setLayout(null);
	container.add(panel2);
	
	rb1.setFont(new Font("Tahoma",Font.BOLD,18));
    rb1.setBounds(260,150,150,30);
	panel2.add(rb1);
	bg.add(rb1);
	
	rb2.setFont(new Font("Tahoma",Font.BOLD,18));
    rb2.setBounds(260,235,150,30);
    panel2.add(rb2);
    bg.add(rb2);
    
    ImageIcon icon=new ImageIcon("C:\\Users\\Akansha\\eclipse-workspace\\Tic Tac Toe\\src\\game\\img.png");
    lbimg=new JLabel(icon);
    lbimg.setBounds(15,70,250,300);
    panel2.add(lbimg);
    	
    b1.setFont(new Font("Tahoma",Font.BOLD,15));
    b1.setBounds(80,350,100,40);
	b1.setBorder(BorderFactory.createLineBorder(Color.black));
	panel2.add(b1);

    b2.setFont(new Font("Tahoma",Font.BOLD,15));
    b2.setBounds(300,350,100,40);
    b2.setBorder(BorderFactory.createLineBorder(Color.black));
	panel2.add(b2);

    //Start Button.....
    b1.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
        	if(rb2.isSelected())
        	{
        		new MultiPlayer();
        		dispose();
        	}
        	else if(rb1.isSelected())
        	{
        		new SinglePlayer();
        		dispose();
        	}
        	else
        		JOptionPane.showMessageDialog(null, "Choose Correct Option...."," ",JOptionPane.PLAIN_MESSAGE);

        }
    });
    
    //Exit button.....
    b2.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            dispose();
        }
    });

	
    setSize(500,500);
    setVisible(true);
	setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
  public static void main(String...s)    
  {
    StartWindow start=new StartWindow();
    start.setTitle("TIC TAC TOE");
  }
}
