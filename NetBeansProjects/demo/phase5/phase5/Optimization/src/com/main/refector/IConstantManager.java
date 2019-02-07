/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.16000
 */
package com.main.refector;

/**
 *
 * @author namita
 */
public interface IConstantManager {

    final static String DATABASE_NAME = "db_customer";
    //--------------------------------------------//
    final static String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
    final static String DATABASE_URL = "jdbc:mysql://localhost:3306/" + DATABASE_NAME;
    final static String DATABASE_USERNAME = "root";
    final static String DATABASE_PASSWORD = "";
    //--------------------------------------------//

    final static String TITLE = "Cost Efficient Query Optimization In Mobile Environment";

    final static String STATUS = "\n"
            + "\n"
            + "<html>"
            + "<head>"
            + "<title></title>"
            + "</head>"
            + "<body>"
            + "<div style='width: 500px;height: 130px;border: solid 0px;font-family: verdana'>\n"
            + "    <div style='width: 500px;height: 130px;border: solid 1px;'>\n"
            + "        <table style='width: 100%'>\n"
            + "            <tr>\n"
            + "                <td>\n"
            + "                    <table>\n"
            + "                        <tr>\n"
            + "                            <td style='text-align: center;line-height: 80px;font-size: 40px;'>\n"
            + "                                <div style='width: 80px;height: 80px;border: solid 1px black;border-radius: 50px;'>\n"
            + "                                    10\n"
            + "                                </div>\n"
            + "                            </td>\n"
            + "                        </tr>\n"
            + "                        <tr>\n"
            + "                            <td style='text-align: center'>Post Count</td>\n"
            + "                        </tr>\n"
            + "                    </table>\n"
            + "                </td>\n"
            + "\n"
            + "                <td>\n"
            + "                    <table>\n"
            + "                        <tr>\n"
            + "                            <td style='text-align: center;line-height: 80px;font-size: 40px;'>\n"
            + "                                <div style='width: 80px;height: 80px;border: solid 1px black;border-radius: 50px;'>\n"
            + "                                    10\n"
            + "                                </div>\n"
            + "                            </td>\n"
            + "                        </tr>\n"
            + "                        <tr>\n"
            + "                            <td style='text-align: center'>Comment Count</td>\n"
            + "                        </tr>\n"
            + "                    </table>\n"
            + "                </td>\n"
            + "\n"
            + "                <td>\n"
            + "                    <table>\n"
            + "                        <tr>\n"
            + "                            <td style='text-align: center;line-height: 80px;font-size: 40px;'>\n"
            + "                                <div style='width: 80px;height: 80px;border: solid 1px black;border-radius: 50px;'>\n"
            + "                                    10\n"
            + "                                </div>\n"
            + "                            </td>\n"
            + "                        </tr>\n"
            + "                        <tr>\n"
            + "                            <td style='text-align: center'>User Count</td>\n"
            + "                        </tr>\n"
            + "                    </table>\n"
            + "                </td>\n"
            + "\n"
            + "            </tr>\n"
            + "        </table>\n"
            + "    </div>\n"
            + "</div>"
            + "</body>"
            + "</html>";
}
