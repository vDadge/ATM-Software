/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmMain;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Vivek
 */
public class AddUser1 {
    public void addView1()
    {
        
                   JFrame j3=new JFrame();
                   j3.setLayout(null);
                   j3.setSize(700,700);
                   j3.setVisible(true);
               
               
       
              JLabel name = new JLabel("Name : ");
		name.setBounds(50, 150, 100, 25);
		 
		JTextField nmField = new JTextField();
		nmField.setBounds(50, 180, 500, 30);
		j3.add(nmField);
		j3.add(name);
                
                //-------------ATMNUMBER------------------
		JLabel atmno = new JLabel("ATM Card Number : ");
		atmno.setBounds(50, 250, 500, 25);
		 
		JTextField atmField = new JTextField();
		atmField.setBounds(50, 280, 500, 30);
		j3.add(atmField);
		j3.add(atmno);
                
                //-------------ATMPIN------------------
		JLabel atmpin = new JLabel("ATM Card PIN : ");
		atmpin.setBounds(50, 350, 500, 25);
		 
		JTextField pinField = new JTextField();
		pinField.setBounds(50, 380, 200, 30);
		j3.add(pinField);
		j3.add(atmpin);
                
                
                
                //-------------BALANCE------------------
		JLabel bal = new JLabel("BALANCE : ");
		bal.setBounds(300, 350, 500, 25);
		JTextField balField = new JTextField();
		balField.setBounds(300, 380, 150, 30);
		j3.add(balField);
		j3.add(bal);
                
             JButton sbmt = new JButton("SUBMIT");
		sbmt.setBounds(50, 450, 150, 25);
		j3.add(sbmt);
    }
    public static void main(String args[])
    {
        AddUser1 aa=new AddUser1();
        aa.addView1();
    }
}
