/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.16000
 */
package com.main.process;

public interface IConstantManager {

    //-------------------- ------------------------//
    //    final static String DATABASE_NAME = "sqlcqo";
    //    final static String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
    //    final static String DATABASE_URL = "jdbc:mysql://127.9.32.2:3306/" + DATABASE_NAME;
    //    final static String DATABASE_USERNAME = "admin1bVqeTH";
    //    final static String DATABASE_PASSWORD = "6MBImmDQb5uh";
    //-------------------- ------------------------//
    final static String DATABASE_NAME = "db_customer";
    final static String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
    final static String DATABASE_URL = "jdbc:mysql://localhost:3306/" + DATABASE_NAME;
    final static String DATABASE_USERNAME = "root";
    final static String DATABASE_PASSWORD = "";
    //----------------ALGEBRA CONSTANT ----------------------------//
    public static final String SIGMA = "<b><span style='color:red'>&sigma;</span></b>";
    public static final String PI = "<b><span style='color:red'>&pi;</span></b>";
    public static final String CROSS = "<b><span style='color:red'>|x|</span></b>";
    public static final String JOINT = "<b><span style='color:red'>X</span></b>";
    public static final String AND = "<b><span style='color:red;font-size:25px;'>^</span></b>";
    public static final String GROUPBY = "<b><span style='color:red;font-size:25px;'>Y</span></b>";
    public static final String UNION = "<b><span style='color:red;'>U</span></b>";
    public static final String INTERSECTION = "<b><span style='color:red;'>&ohm;</span></b>";
    //----------------JOIN CONSTANT ----------------------------//
    public static final String LEFT_OUTER_JOIN = "LEFT OUTER JOIN";
    public static final String FULL_OUTER_JOIN = "FULL_OUTER JOIN";
    public static final String RIGHT_OUTER_JOIN = "RIGHT_OUTER JOIN";
    public static final String INNER_JOIN = "INNER JOIN";
    public static final String CROSS_JOIN = "CROSS JOIN";
    public static final String ORDER_BY = "ORDER BY";
    public static final String ON = "ON";
    public static final String LIMIT = "LIMIT";
    public static final String GROUP_BY = "GROUP BY";
    public static final String HAVING = "HAVING";
}
