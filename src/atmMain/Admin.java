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
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Admin {
     
	public void adminView() {
		Commons commons = new Commons();
		JFrame frame = new JFrame();
                frame.setLocationRelativeTo(null);
                frame.getContentPane().setBackground(Color.orange);
                frame.setLayout(null);
                frame.setSize(600, 600);
		
		//-------------ADDUSERS---------------------
		JButton add = new JButton("ADD USERS");
		add.setBounds(150, 250, 300, 50);
		add.setFont(new Font("Rockwell", Font.BOLD, 25));
		frame.add(add);
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AddUser user = new AddUser();
				try {
					user.addView();
				} catch (SQLException e1) {
					e1.printStackTrace();
				} catch (ClassNotFoundException ex) {
                                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                            }
				frame.dispose();
			}
		});
		//------------------------------------------
		
		//--------------EXIT---------------------------
		JButton exit = new JButton("EXIT");
		exit.setBounds(150, 400, 300, 50);
		exit.setFont(new Font("Rockwell", Font.BOLD, 25));
		frame.add(exit);
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		//---------------------------------------------
		frame.setVisible(true);
              
                
	}
   
    }
