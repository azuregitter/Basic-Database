/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riego_guidb_aqe2;

import com.mysql.jdbc.Connection;
import java.sql.*;






/**
 *
 * @author Gerome Riego
 */
public class RIEGO_GUIDB_AQE2 {
    private Statement se;
    private ResultSet rs;
    private Connection con;

    

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {
        final Connection connection = DBCon.getCon();
        if (connection != null) {
            String dbname = "information";
            System.out.println("Connection Successful");
            Database db = new Database(connection);
            db.setVisible(true);
        } else {
            System.out.println( "Cannot Connect to Database");
        }
    }
}
