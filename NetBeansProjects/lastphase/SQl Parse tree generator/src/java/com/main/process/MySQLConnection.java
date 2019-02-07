package com.main.process;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQLConnection implements IConstantManager {

    private static Connection connection;

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName(DATABASE_DRIVER);
        System.out.println("connection");
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
            System.out.println("slicing");
        }
        return connection;
    }

    public static void main(String[] args) {
        try {
            ResultSet executeQuery = preStateMent("SELECT * FROM  `tblcustomer`  WHERE  `customer_code` LIKE  '%1400%'").executeQuery();
            while (executeQuery.next()) {
                System.out.println("executeQuery = " + executeQuery.getString(1));
                System.out.println("executeQuery = " + executeQuery.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static PreparedStatement preStateMent(String sql) throws SQLException, ClassNotFoundException {
        return getConnection().prepareStatement(sql);
    }

}
