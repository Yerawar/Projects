package com.main.view;

import com.main.controller.MysqlConnection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author yuvraj
 */
public class ProjectServices {

    
    public static ArrayList<String> getQueries() {
        String searchQuery = "";
        searchQuery = "SELECT * FROM  tblquries  ";
        System.out.println("searchQuery = " + searchQuery);
        ArrayList<String> arrayList = new ArrayList<String>();
        try {
            ResultSet executeQuery = MysqlConnection.preStateMent(searchQuery).executeQuery();

            while (executeQuery.next()) {
                arrayList.add(executeQuery.getString("quries"));
            }
            executeQuery.close();
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
        return arrayList;
    }

}
