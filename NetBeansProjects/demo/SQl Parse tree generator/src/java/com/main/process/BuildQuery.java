/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.process;

import javax.servlet.http.HttpServletRequest;

public class BuildQuery {

    static String id;
    static String code;
    static String first_name;
    static String last_name;
    static String email_address;

    //customer
    static String p_id;
    static String customer_id;
    static String customer_code;
    static String item_name;
    static String item_qty;

    public static String buildQuery() {
        String string = "";
        if (!id.equals("")) {
            string = "SELECT * FROM tblcustomer  where id = " + id;
            System.out.println("string = " + string);
        }
        if (!code.equals("")) {
            string = "SELECT * FROM tblcustomer  where customer_code = '" + customer_code + "'";
            System.out.println("string = " + string);
        }
        if (!first_name.equals("")) {
            string = "SELECT * FROM tblcustomer  where first_name = '" + first_name + "'";
            System.out.println("string = " + string);
        }
        if (!last_name.equals("")) {
            string = "SELECT * FROM tblcustomer  where last_name = '" + last_name + "'";
            System.out.println("string = " + string);
        }
        if (!email_address.equals("")) {
            string = "SELECT * FROM tblcustomer  where email_address = '" + email_address + "'";
            System.out.println("string = " + string);
        }

        if (!id.equals("") && !code.equals("") && !first_name.equals("") && !last_name.equals("") && !email_address.equals("")) {
            string = "SELECT * FROM tblcustomer  where "
                    + " id = " + id + "  AND "
                    + " customer_code = '" + customer_code + "'  AND  "
                    + " first_name	 = '" + first_name + "'	  AND "
                    + " last_name = '" + last_name + "'   AND "
                    + " email_address = '" + email_address + "' "
                    + "";
        }

        if (!p_id.equals("")) {
            string = "SELECT * FROM tblproductpurchase  where id = " + p_id;
            System.out.println("string = " + string);
        }
        if (!customer_id.equals("")) {
            string = "SELECT * FROM tblproductpurchase  where customer_id = '" + customer_id + "'";;
            System.out.println("string = " + string);
        }
        if (!customer_code.equals("")) {
            string = "SELECT * FROM tblproductpurchase  where customer_code = '" + customer_code + "'";;
            System.out.println("string = " + string);
        }
        if (!item_name.equals("")) {
            string = "SELECT * FROM tblproductpurchase  where item_name = '" + item_name + "'";;
            System.out.println("string = " + string);
        }
        if (!item_qty.equals("")) {
            string = "SELECT * FROM tblproductpurchase  where item_qty = '" + item_qty + "'";;
            System.out.println("string = " + string);
        }

        if (!p_id.equals("") && !customer_code.equals("") && !item_name.equals("") && !item_qty.equals("")) {
            string = "SELECT * FROM  tblproductpurchase  where "
                    + " id = " + id + "  AND "
                    + " customer_code = '" + customer_code + "'  AND  "
                    + " first_name	 = '" + first_name + "'	  AND "
                    + " last_name = '" + last_name + "'  "
                    + "";
        }

        if (!id.equals("") && !customer_id.equals("")) {
            string = "SELECT * FROM  tblcustomer c , tblproductpurchase p WHERE p.id != 0  AND c.id != 0";
            if (!code.equals("")) {
                string = string + " AND c.customer_code = '" + customer_code + "'";
                System.out.println("string = " + string);
            }
            if (!first_name.equals("")) {
                string = string + " AND  c.first_name = '" + first_name + "'";
                System.out.println("string = " + string);
            }
            if (!last_name.equals("")) {
                string = string + " AND  c.last_name = '" + last_name + "'";
                System.out.println("string = " + string);
            }
            if (!email_address.equals("")) {
                string = string + " AND  c.email_address = '" + email_address + "'";
                System.out.println("string = " + string);
            }
            if (!customer_code.equals("")) {
                string = string + " AND p.customer_code = '" + customer_code + "'";;
                System.out.println("string = " + string);
            }
            if (!item_name.equals("")) {
                string = string + " AND  p.item_name = '" + item_name + "'";;
                System.out.println("string = " + string);
            }
            if (!item_qty.equals("")) {
                string = string + " AND  p.item_qty = '" + item_qty + "'";;
                System.out.println("string = " + string);
            }

        }

        return string;
    }

    public static void mapper(HttpServletRequest request) {
        //customer
        id = request.getParameter("id");
        code = request.getParameter("code");
        first_name = request.getParameter("first_name");
        last_name = request.getParameter("last_name");
        email_address = request.getParameter("email_address");

        //customer
        p_id = request.getParameter("p_id");
        customer_id = request.getParameter("customer_id");
        customer_code = request.getParameter("customer_code");
        item_name = request.getParameter("item_name");
        item_qty = request.getParameter("item_qty");
    }

}
