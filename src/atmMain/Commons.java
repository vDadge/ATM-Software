/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmMain;

/**
 *
 * @author Vivek
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Commons {
	public Component Frame() {
		JFrame frame = new JFrame();
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.orange);
		
		//------------------LOGO----------------------------------
		JLabel atm = new JLabel("ATM");
		atm.setBounds(0, 30, 600, 120);
		atm.setHorizontalAlignment(JLabel.CENTER);
		atm.setFont(new Font("Serif", Font.BOLD, 120));
		JLabel man = new JLabel("SOFTWARE");
		man.setBounds(0, 140, 600, 20);
		man.setHorizontalAlignment(JLabel.CENTER);
		man.setFont(new Font("Serif", Font.BOLD, 20));
		frame.add(man);
		frame.add(atm);
		//-----------------------------------------------
		return frame;
	}
       
}
