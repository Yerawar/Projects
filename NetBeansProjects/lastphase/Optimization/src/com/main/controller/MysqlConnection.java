package com.main.controller;

import com.main.refector.IConstantManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class MysqlConnection implements IConstantManager {

    //// line top be modified
    private static Connection connection;

    static {
        try {
            Class.forName(DATABASE_DRIVER);
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static PreparedStatement preStateMent(String query) {
        try {
            return connection.prepareStatement(query);
        } catch (Exception e) {
            System.out.println("PreparedStatement preStateMent(String query) line number ");
        }
        return null;
    }

    public static String getDate() {
        String[] split = new Date().toString().split(" ");
        String date = "" + split[2] + "-" + split[1] + "-" + split[5];
        System.out.println("date = " + date);
        return date;
    }

    public static void main(String[] args) {
//        getConnection();
//        try {
//            preStateMent("INSERT INTO tbl_product(`pCategory`)"
//                    + "VALUES"
//                    + " ('');").execute();
//            System.out.println("i am here ");
//        } catch (Exception e) {
//        }
    }

    public static Integer chkUserName(String columnname, String tblName, String value) {
        String sql_query = "SELECT * FROM `" + tblName + "` WHERE `" + columnname + "` = '" + value + "'";
        System.out.println("sql_query = " + sql_query);
        try {
            ResultSet executeQuery = preStateMent(sql_query).executeQuery();
            while (executeQuery.next()) {
                return 1;
            }
            executeQuery.close();;
            return 0;
        } catch (Exception e) {
        }
        return 0;
    }
}
