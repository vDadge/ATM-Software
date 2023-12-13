/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmMain;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Vivek
 */
public class Admin1 {

     
    public void adminView1() {
       
		 
		JFrame f2 = new JFrame();
                f2.setLayout(null);
                f2.setSize(700,700);
               
		
		//-------------ADDUSERS---------------------
		JButton add = new JButton("ADD USERS");
		add.setBounds(200, 150, 200, 50);
		add.setFont(new Font("Rockwell", Font.BOLD, 25));
		f2.add(add);
                add.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        AddUser1 au=new AddUser1();
                        au.addView1();
                    }
                });
		 
		 
		//------------------------------------------
		
		//--------------EXIT---------------------------
		JButton exit = new JButton("EXIT");
		exit.setBounds(250, 250, 100, 50);
		exit.setFont(new Font("Rockwell", Font.BOLD, 25));
		f2.add(exit);
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		//---------------------------------------------
		f2.setVisible(true);
              
                
	}
    
}
