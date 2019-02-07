package com.main.compare;

import com.main.controller.MysqlConnection;

public class AfterOptimization {

    public static double process(String optimizedString) {
        long preTime = System.currentTimeMillis();
        String[] split = optimizedString.split("\n");
        for (String query : split) {
            System.out.println("query = " + query);
            try {
                MysqlConnection.preStateMent(query).execute();
            } catch (Exception e) {
            }
        }
        long postTime = System.currentTimeMillis();
        return postTime - preTime;
    }
}
