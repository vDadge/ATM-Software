package atmMain;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class Pin {
	public void pinView(String cardNum) {
		Commons common = new Commons();
		JFrame frame = (JFrame)common.Frame();
		Font txt = new Font("", Font.BOLD, 15);
		Home home = new Home();
		Admin admin = new Admin();
		
		//---------------PASSWORD----------------
		JLabel pswd = new JLabel("ENTER YOUR PIN");
		pswd.setBounds(50, 270, 250, 20);
		pswd.setFont(txt);
		JPasswordField pswdField = new JPasswordField();
		pswdField.setBounds(50, 300, 500, 35);
		pswdField.setFont(txt);
		frame.add(pswdField);
		frame.add(pswd);
		//-----------------------------------------
		
		//-----------------BUTTON-----------------
		JButton conts = new JButton("COUNTINUE");
		conts.setBounds(200, 400, 200, 50);
		conts.setFont(new Font("Rockwell", Font.BOLD, 25));
		frame.add(conts);
		conts.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					SQLManage man = new SQLManage();
					ResultSet rst = man.check(cardNum, pswdField.getText());
					if(rst.next()) {
						if(rst.getString("card").equals("admin")) {
							admin.adminView();
							frame.dispose();
						}
						else {
							home.homeView(rst.getInt("id"));
							frame.dispose();
						}
					}
					else {
						Fail fail = new Fail();
						fail.failView("WRONG PIN!!!");
						frame.dispose();
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				} catch (ClassNotFoundException ex) {
                                Logger.getLogger(Pin.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}
			
		});
		//----------------------------------------
		frame.setVisible(true);
	}
}