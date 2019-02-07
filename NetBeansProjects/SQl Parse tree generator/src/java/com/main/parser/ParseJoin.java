/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.parser;

import com.main.process.IConstantManager;
import com.main.process.ParserQuery;
import static com.main.process.ParserQuery.JOINT;

public class ParseJoin implements IConstantManager {

    public static void main(String[] args) {
        String sql = "select tblcustomer.first_name,tblproductpurchase.customer_id from tblcustomer INNER JOIN tblproductpurchase on  tblcustomer.id = tblproductpurchase.id order by tblcustomer.first_name;";
        String fromJoin = getFromJoin(sql);
        System.out.println("fromJoin = " + fromJoin);
    }

    public static boolean isOrderBy(String string) {
        if (string.toUpperCase().indexOf("ORDER BY") != -1) {
            return true;
        }
        return false;
    }

    public static boolean isGroupBy(String string) {
        if (string.toUpperCase().indexOf(IConstantManager.GROUP_BY) != -1) {
            return true;
        }
        return false;
    }

    public static String getFromJoin(String input) {
        try {

            String sql = ParserQuery.getFrom(input).toUpperCase();
            if (sql.trim().toUpperCase().indexOf(IConstantManager.INNER_JOIN) != -1) {
                return parseJoin(sql, IConstantManager.INNER_JOIN);
            } else if (sql.trim().toUpperCase().indexOf(IConstantManager.LEFT_OUTER_JOIN) != -1) {
                return parseJoin(sql, IConstantManager.LEFT_OUTER_JOIN);
            } else if (sql.trim().toUpperCase().indexOf(IConstantManager.FULL_OUTER_JOIN) != -1) {
                return parseJoin(sql, IConstantManager.FULL_OUTER_JOIN);
            } else if (sql.trim().toUpperCase().indexOf(IConstantManager.RIGHT_OUTER_JOIN) != -1) {
                return parseJoin(sql, IConstantManager.RIGHT_OUTER_JOIN);
            } else if (sql.trim().toUpperCase().indexOf(IConstantManager.LEFT_OUTER_JOIN) != -1) {
                return parseJoin(sql, IConstantManager.LEFT_OUTER_JOIN);
            } else if (sql.trim().toUpperCase().indexOf(IConstantManager.CROSS_JOIN) != -1) {
                return parseJoin(sql, IConstantManager.CROSS_JOIN);
            }
            return parseOuterJoin(sql);
        } catch (Exception e) {
            return "OPERATION FAIL" + e.getMessage();
        }
    }

    public static String parseJoin(String sql, String type) {
        String finalOne = "";
        String query = sql.toUpperCase();
        String appendOn = "";
        String appendOrder = "";
        int on = query.indexOf(IConstantManager.ON);
        if (on != -1) {
            String[] split = query.split(IConstantManager.ON);
            String preOn = split[0].trim();
            String postOn = split[1].trim();
            if (isOrderBy(postOn)) {
                String[] postOrder = postOn.split(IConstantManager.ORDER_BY);
                String prePostOrder = postOrder[0];
                String postPostOrder = postOrder[1];
                appendOn = "<ul>"
                        + "<li>="
                        + "<ul>"
                        + "<li>" + prePostOrder.split("=")[0] + "</li>"
                        + "<li>" + prePostOrder.split("=")[1] + "<ul><li>ORDER BY<ul><li>" + postPostOrder + "</li></ul></li></ul></li>"
                        + "</ul>"
                        + "</li>"
                        + "</ul>";
            } else if (isGroupBy(postOn)) {
                String[] postGroup = postOn.split(IConstantManager.GROUP_BY);
                String prePostOrder = postGroup[0];
                String postPostOrder = postGroup[1];
                appendOn = "<ul>"
                        + "<li>="
                        + "<ul>"
                        + "<li>" + prePostOrder.split("=")[0] + "</li>"
                        + "<li>" + prePostOrder.split("=")[1] + "<ul><li>GROUP_BY<ul><li>" + postPostOrder + "</li></ul></li></ul></li>"
                        + "</ul>"
                        + "</li>"
                        + "</ul>";
            } else {
                String[] preOnSplit = postOn.split("=");
                appendOn = "<ul><li>=<ul><li>" + preOnSplit[0] + "</li><li>" + preOnSplit[1] + "</li></ul></li></ul>";
            }
            String[] innerSplit = preOn.split(type);
            String preInnerTbl1 = innerSplit[0];
            String preInnerTbl2 = innerSplit[1];
            finalOne = JOINT + "<ul><li >" + preInnerTbl1 + "</li><li >" + preInnerTbl2 + appendOn + "</li></ul>";
        }
        return finalOne;
    }

    public static String parseOuterJoin(String from) {
        System.out.println("from = " + from);
        if (from.indexOf(",") != 0 && from.toUpperCase().indexOf("ORDER BY") == -1) {
            String[] multiTable = from.split(",");
            if (multiTable.length == 2) {
                from = JOINT + "<ul><li >" + multiTable[0] + "</li><li >" + multiTable[1] + "</li></ul>";
            }
        }

        if (from.toUpperCase().indexOf("ORDER BY") != -1) {
            String[] split = from.toUpperCase().split("ORDER BY");
            String preTable = split[0];
            String postTable = split[1];

            if (preTable.indexOf(",") == -1) {
                from = preTable + "<ul><li >ORDER BY<ul><li >" + postTable + "</li></ul></li></ul>  ";
            } else {
                String[] multiTable = preTable.split(",");
                if (multiTable.length == 2) {
                    from = JOINT + "<ul><li >" + multiTable[0] + "</li><li >" + multiTable[1] + "<ul><li>ORDER BY<ul><li>" + postTable + "</li></ul></li></ul></li></ul>";
                }
            }
        }
        return from;
    }

}
