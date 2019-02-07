package com.main.test;

import com.main.controller.MysqlConnection;
import it.sauronsoftware.base64.Base64;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PlanGeneration {

    public static ArrayList<String> arrayList = new ArrayList<>();

   
    
    
    public static void makeQuries(String inpString) {
        try {
            String query = "SELECT * FROM `tbloptimization` WHERE quries = '" + Base64.encode(inpString) + "'";
            String quries = "";
            String columns = "";
            String table = "";
            String joinon = "";
            String order = "";

            try {
                ResultSet executeQuery = MysqlConnection.preStateMent(query).executeQuery();
                while (executeQuery.next()) {
                    quries = Base64.decode(executeQuery.getString("quries")).toLowerCase();
                    columns = Base64.decode(executeQuery.getString("columns")).toLowerCase();
                    table = Base64.decode(executeQuery.getString("table")).toLowerCase();
                    joinon = Base64.decode(executeQuery.getString("joinon")).toLowerCase();
                    order = Base64.decode(executeQuery.getString("order")).toLowerCase();
                }
                executeQuery.close();
            } catch (Exception e) {
            }

            String[] split = table.split(",");
            String query2 = "SELECT * FROM " + split[0];
            String query3 = "SELECT * FROM " + split[1];

            String tblclm1 = "";
            String tblclm2 = "";

            String[] split_column = columns.split(",");
            for (String string : split_column) {
                String[] splitbyclm = string.split("\\.");
                String alize = splitbyclm[0].toLowerCase().trim();
                if (alize.equals(split[0].toLowerCase().trim())) {
                    tblclm1 = tblclm1 + splitbyclm[1] + ",";
                }
                if (alize.equals(split[1].toLowerCase().trim())) {
                    tblclm2 = tblclm2 + splitbyclm[1] + ",";
                }
            }

            tblclm1 = tblclm1.substring(0, tblclm1.lastIndexOf(","));
            tblclm2 = tblclm2.substring(0, tblclm2.lastIndexOf(","));

            String query4 = "SELECT " + tblclm1 + " FROM " + split[0] + " UNION " + " SELECT " + tblclm2 + " FROM " + split[1];
            String query5 = "SELECT  " + tblclm1 + "  FROM " + split[0];
            String query6 = "SELECT " + tblclm2 + "  FROM " + split[1];
            String query7 = "SELECT " + tblclm1 + " FROM " + split[0] + " UNION ALL" + " SELECT " + tblclm2 + " FROM " + split[1];

            arrayList.add(query2);
            arrayList.add(query3);
            arrayList.add(query4);
            arrayList.add(query5);
            arrayList.add(query6);
            arrayList.add(query7);
        } catch (Exception e) {
        }
    }

}
