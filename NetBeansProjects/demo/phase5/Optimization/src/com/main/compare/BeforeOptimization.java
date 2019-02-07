/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.compare;

import com.main.controller.MysqlConnection;

/**
 *
 * @author yuvraj
 */
public class BeforeOptimization {

    public static double process(String string) {
        long preTime = System.currentTimeMillis();
        String[] split = string.split("\n");
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
