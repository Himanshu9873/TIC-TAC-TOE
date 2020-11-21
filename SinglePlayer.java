package game;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SinglePlayer extends JFrame implements ActionListener {
    ArrayList<Integer> cpuPosi = new ArrayList<>();
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10,exit;
    JTextField lb;

    public SinglePlayer() {
        setTitle("SinglePlayer");
        setSize(350,500);
		setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        Font f=new Font("Arial",Font.BOLD,25);

        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        b5 = new JButton();
        b6 = new JButton();
        b7 = new JButton();
        b8 = new JButton();
        b9 = new JButton();
        b10 = new JButton("Restart");
        exit = new JButton("Exit");
        b1.setBounds(10, 10, 100, 100);
        b2.setBounds(110, 10, 100, 100);
        b3.setBounds(210, 10, 100, 100);
        b4.setBounds(10, 110, 100, 100);
        b5.setBounds(110, 110, 100, 100);
        b6.setBounds(210, 110, 100, 100);
        b7.setBounds(10, 210, 100, 100);
        b8.setBounds(110, 210, 100, 100);
        b9.setBounds(210, 210, 100, 100);
        b10.setBounds(70, 390, 100, 50);
        exit.setBounds(200, 390, 100, 50);
		
        b1.setFont(f);
        b2.setFont(f);
        b3.setFont(f);
        b4.setFont(f);
        b5.setFont(f);
        b6.setFont(f);
        b7.setFont(f);
        b8.setFont(f);
        b9.setFont(f);
        
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(exit);

        lb = new JTextField("Result...");
        lb.setBounds(20, 330, 280, 50);
        lb.setEditable(false);
        lb.setFont(f);
        add(lb);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent a)
                {
                    dispose();
                    new SinglePlayer();
                }
                });
		exit.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent a)
                {
                    dispose();
                    new StartWindow();
                }
                });
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {         
        if (ae.getSource() == b1) {
            b1.setText("X");
            b1.setEnabled(false);
            cpuPosi.add(0);
        }
        if (ae.getSource() == b2) {
            b2.setText("X");
            b2.setEnabled(false);
            cpuPosi.add(1);
        }
        if (ae.getSource() == b3) {
            b3.setText("X");
            b3.setEnabled(false);
            cpuPosi.add(2);
        }
        if (ae.getSource() == b4) {
            b4.setText("X");
            b4.setEnabled(false);
            cpuPosi.add(3);
        }
        if (ae.getSource() == b5) {
            b5.setText("X");
            b5.setEnabled(false);
            cpuPosi.add(4);
        }
        if (ae.getSource() == b6) {
            b6.setText("X");
            b6.setEnabled(false);
            cpuPosi.add(5);
        }
        if (ae.getSource() == b7) {
            b7.setText("X");
            b7.setEnabled(false);
            cpuPosi.add(6);
        }
        if (ae.getSource() == b8) {
            b8.setText("X");
            b8.setEnabled(false);
            cpuPosi.add(7);
        }
        if (ae.getSource() == b9) {
            b9.setText("X");
            b9.setEnabled(false);
            cpuPosi.add(8);
        }
        if(cpuPosi.size()<8)
        {
            Random run = new Random();
        int cpuPos = run.nextInt(9);
        while (cpuPosi.contains(cpuPos)) {
            cpuPos = run.nextInt(9);
        }
            computerTrn(cpuPos);
        }
        win();
    }

    public void computerTrn(int cpuPos) {
        if (cpuPos == 0) {
            b1.setText("0");
            b1.setEnabled(false);
        }
        if (cpuPos == 1) {
            b2.setText("0");
            b2.setEnabled(false);
        }
        if (cpuPos == 2) {
            b3.setText("0");
            b3.setEnabled(false);
        }
        if (cpuPos == 3) {
            b4.setText("0");
            b4.setEnabled(false);
        }
        if (cpuPos == 4) {
            b5.setText("0");
            b5.setEnabled(false);
        }
        if (cpuPos == 5) {
            b6.setText("0");
            b6.setEnabled(false);
        }
        if (cpuPos == 6) {
            b7.setText("0");
            b7.setEnabled(false);
        }
        if (cpuPos == 7) {
            b8.setText("0");
            b8.setEnabled(false);
        }
        if (cpuPos == 8) {
            b9.setText("0");
            b9.setEnabled(false);
        }
        cpuPosi.add(cpuPos);
        win();
    }

    public int check() {
        if (b1.getText() == "X" && b2.getText() == "X" && b3.getText() == "X") {
            return 1;
        } else if (b1.getText() == "X" && b4.getText() == "X" && b7.getText() == "X") {
            return 1;
        } else if (b1.getText() == "X" && b5.getText() == "X" && b9.getText() == "X") {
            return 1;
        } else if (b2.getText() == "X" && b5.getText() == "X" && b8.getText() == "X") {
            return 1;
        } else if (b3.getText() == "X" && b6.getText() == "X" && b9.getText() == "X") {
            return 1;
        } else if (b3.getText() == "X" && b5.getText() == "X" && b7.getText() == "X") {
            return 1;
        } else if (b4.getText() == "X" && b5.getText() == "X" && b6.getText() == "X") {
            return 1;
        } else if (b7.getText() == "X" && b8.getText() == "X" && b9.getText() == "X") {
            return 1;
        } else if (b1.getText() == "0" && b2.getText() == "0" && b3.getText() == "0") {
            return 2;
        } else if (b1.getText() == "0" && b4.getText() == "0" && b7.getText() == "0") {
            return 2;
        } else if (b1.getText() == "0" && b5.getText() == "0" && b9.getText() == "0") {
            return 2;
        } else if (b2.getText() == "0" && b5.getText() == "0" && b8.getText() == "0") {
            return 2;
        } else if (b3.getText() == "0" && b6.getText() == "0" && b9.getText() == "0") {
            return 2;
        } else if (b3.getText() == "0" && b5.getText() == "0" && b7.getText() == "0") {
            return 2;
        } else if (b4.getText() == "0" && b5.getText() == "0" && b6.getText() == "0") {
            return 2;
        } else if (b7.getText() == "0" && b8.getText() == "0" && b9.getText() == "0") {
            return 2;
        } else {
            return 0;
        }
    }

    public void win() {
        int result = check();
            if (result == 1) {
                lb.setText("Congrates....You Win...");
                setEnbld();
            } else if (result == 2) {
                lb.setText("Computer Win....");
                setEnbld();
            } else {
                if (cpuPosi.size()==9) {
                    lb.setText("Game Over...");
                }
            }
    }

    public void setEnbld() {
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
    }
    
    public static void main(String[] args) 
	{
        new SinglePlayer();
    }
}