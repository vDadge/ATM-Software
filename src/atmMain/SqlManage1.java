/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmMain;
import java.sql.*;

/**
 *
 * @author Vivek
 */
public class SqlManage1 {
    Connection con;
    SqlManage1() throws SQLException
    {
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "root");
    }
    
    
}
