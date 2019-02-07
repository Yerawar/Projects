<%@include file="import.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.rmi.server.ExportException"%>
<link href="css/style.css" rel="stylesheet">
<style>
    input{
        width: 180px;
        height: 28px;
        border: solid 1px gray;
        margin-bottom: 10px;
        margin-right:  5px;
    }
</style>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Query Optimization</title>
    </head>
    <body>
        <form name="frmprocess" id="process" method="post" action="./SearchServlet">
            <div style="width: 100%;height: 100%">
                <div class="banner" style="background-image: url('images/banner.jpg') ">
                    <h3 style="font-size: 30px;padding-top: 10px;padding-left: 190px;;font-family: cambria;color: orange">
                        <!--                        Data Mining Methods For Improving Business Process Modeling-->
                    </h3>
                    <br/>
                    <p style="text-align: justify;font-size: 14px;padding-left: 190px;width: 550px;line-height: 20px;font-family: cambria;color: #3A3A3A">
                    </p>
                </div>
                <hr/>
                <br/>
                <br/>
                <br/>
                <center>
                    <table border='0'>
                        <tr>
                            <td colspan="3" align='center'>
                                <h2>
                                    SEARCH FORM
                                </h2>    
                            </td>
                        </tr>
                        <tr><td>&nbsp;</td></tr>
                        <tr>
                            <td>
                                <table>
                                    <tr>
                                        <td>CUSTOMER</td>
                                        <td><input type="text" name="id" placeholder="Enter Id" autofocus=""></td>
                                        <td><input type="text" name="code"  placeholder="Customer Code"></td>
                                        <td><input type="text" name="first_name"  placeholder="First Name"></td>
                                        <td><input type="text" name="last_name"  placeholder="Last Name"></td>
                                        <td><input type="text" name="email_address"  placeholder="Email Address"></td>
                                    </tr>
                                    <tr>
                                        <td>PRODUCT PURCHASE</td>
                                        <td><input type="text" name="p_id" placeholder="Purchase Id"></td>
                                        <td><input type="text" name="customer_id" placeholder="Customer Id"></td>
                                        <td><input type="text" name="customer_code"  placeholder="Customer Code"></td>
                                        <td><input type="text" name="item_name"  placeholder="Item Name"></td>
                                        <td><input type="text" name="item_qty"  placeholder="Item Qty"></td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <tr style="height: 40px;">
                            <td>
                                <input type="submit" value="Search" style="width: 100%;border: solid 1px gray;height: 30px;margin-top: 10px;">
                            </td>
                        </tr>
                    </table>
                </center>
            </div>
        </form>
    </body>
</html>
