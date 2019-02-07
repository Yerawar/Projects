<%@include file="import.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%    Object object = request.getSession().getAttribute("query");
    String query = "";
    String alge = "";
    if (object != null) {
        query = (String) object;
        alge = ParserQuery.makeTree(query).toUpperCase().
                replace(IConstantManager.LEFT_OUTER_JOIN, IConstantManager.CROSS).
                replace(IConstantManager.FULL_OUTER_JOIN, IConstantManager.CROSS).
                replace(IConstantManager.RIGHT_OUTER_JOIN, IConstantManager.CROSS).
                replace(IConstantManager.INNER_JOIN, IConstantManager.CROSS).
                replace(IConstantManager.CROSS_JOIN, IConstantManager.CROSS);
    }
%>
<link href="css/style.css" rel="stylesheet">
<link rel="stylesheet" href="css/jquery.jOrgChart.css"/>
<link href="css/prettify.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="js/prettify.js"></script>
<script type="text/javascript" src="js/jquery-ui.min.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script src="js/jquery.jOrgChart.js"></script>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Query Optimization</title>
    </head>
    <body>
        <form name="frmprocess" id="process" method="post" action="./ProcessServlet">
            <div style="width: 100%;height: 100%">
                <div class="banner" style="background-image: url('images/banner.jpg') ">
                    <h3 style="font-size: 30px;padding-top: 10px;padding-left: 190px;;font-family: cambria;color: orange">
                        Query Optimization for CrowdDB using Materialized View
                    </h3>
                    <br/>
                    <p style="text-align: justify;font-size: 14px;padding-left: 190px;width: 550px;line-height: 20px;font-family: cambria;color: #3A3A3A">

                    </p>
                </div>
                <div class="contain">
                    <table style="border-collapse: collapse;width: 100%" border='0'>
                        <tr><td colspan="3">&nbsp;</td></tr>
                        <tr><td colspan="3"  align='center' style="height: 40px;background-color: rgb(240,240,240)">Optimization of SQL query</td>  </tr>
                        <tr><td colspan="3">&nbsp;</td></tr>
                        <tr>
                            <td colspan="3">
                                <table style="width: 100%"> 
                                    <tr>
                                        <td style="width: 150px;background-color: rgb(240,240,240)">&nbsp;&nbsp;Enter query</td>
                                        <td>&nbsp;</td>
                                        <td>
                                            <textarea autofocus=""  name="txtInputQuery" id="txtInputQuery" style="width: 100%;height: 100px;resize: none;padding: 10px;"><%=query%></textarea>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" align='center'>
                                <a href="index.jsp">BACK</a>
                            </td>  
                        </tr>
                        <tr><td colspan="3">&nbsp;</td>  </tr>
                        <tr><td colspan="3"  align='center' style="height: 40px;background-color: rgb(250,250,250)"><%=alge%></td>  </tr>
                        <tr><td colspan="3">&nbsp;</td>  </tr>
                        <tr >
                            <td style="width: 100%"  valign="top">
                                <table style="width: 100%;border-collapse: collapse;border-color: rgb(220,220,220)" border='1'>
                                    <tr style="background-color: rgb(220,220,220);border-bottom: solid 1px rgb(192,192,192)">
                                        <th style="height: 35px;">TREE GENERATION</th>
                                    </tr>
                                    <tr>
                                        <td style="min-width: 100%">
                                            <div style="overflow: auto;width: 100%;font-size: 10px;min-height: 450px;height: auto">
                                                <%@include file="algebratree.jsp" %>
                                            </div>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                            <td>&nbsp;&nbsp;</td>
                            <td  style="width: 50%" valign="top">
                                <div style="overflow: auto">
                                    <table style="width: 100%;border-collapse: collapse;height: 250px;border-color: rgb(220,220,220)" border='1'>
                                        <tr style="background-color: rgb(220,220,220)">
                                            <th style="height: 35px;border-bottom: solid 1px rgb(192,192,192)">QUERY RESULT</th>
                                        </tr>
                                        <tr>
                                            <td>
                                                <div style="overflow: auto;width: 500px;height: 450px;">
                                                    <%@include file="queryresult.jsp" %>
                                                </div>
                                            </td>
                                        </tr>
                                    </table>
                                </div>
                            </td>
                        </tr>
                    </table>
                    <br/><br/>
                </div>
        </form>
    </body>
</html>
