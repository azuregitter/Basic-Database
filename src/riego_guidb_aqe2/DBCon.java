/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riego_guidb_aqe2;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Gerome Riego
 */
public class DBCon {

    static Connection getCon() throws ClassNotFoundException {
        Connection con = null;
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gradeict", "root", "");           
        } catch (SQLException ex) {
            System.out.println("Connection Error" + ex);
        }

        return con;
    }

    static void closeCon(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {

            }
        }
    }
}
