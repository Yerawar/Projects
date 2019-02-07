<%@page import="java.rmi.server.ExportException"%>
<table style="border-collapse: collapse;width: 100%;border: solid 0px;" border="1">
    <%@include file="import.jsp" %>
    <%
        Object queryobject = request.getSession().getAttribute("query");
        long time1 = System.currentTimeMillis();
        long time2 = 0;
        try {
            String querystring = "";
            if (queryobject != null) {
                querystring = (String) queryobject;
            }

            ResultSet resultSet = MySQLConnection.preStateMent(querystring).executeQuery();
            int columncount = resultSet.getMetaData().getColumnCount();
            out.print("<tr><td colspan='" + columncount + "'>&nbsp;</td></tr>");
            String tablerow = "";
            String tablecolumn = "";
            String header = "";
            for (int index = 1; index <= columncount; index++) {
                try {
                    header = header + "<th>" + resultSet.getMetaData().getColumnLabel(index) + "</th>";
                } catch (Exception e) {

                }
            }
            while (resultSet.next()) {
                try {
                    for (int index = 1; index <= columncount; index++) {
//                        String clm = resultSet.getMetaData().getColumnName(index);
                        tablecolumn = tablecolumn + "<td align='center' style=font-size:13px>" + resultSet.getString(index).toLowerCase() + "</td>";
                    }
                    tablerow = tablerow + "<tr>" + tablecolumn + "</tr>";
                    tablecolumn = "";
                } catch (Exception e) {

                }
            }
            out.print("<tr>" + header.toUpperCase() + "</tr>");
            out.print(tablerow);
            out.print("<tr><td colspan='" + columncount + "'>&nbsp;</td></tr>");
            time2 = System.currentTimeMillis();
        } catch (SQLException e) {
            if (queryobject != null) {
                out.print("<p style='color:red;padding:10px;'>" + e.getMessage() + "<p>");
            } else {
                out.print("<tr><td><br/></td></tr>");
            }
        }
        long resulttime = time2 - time1;
        out.print("<center><p style=color:red>"+resulttime + "  mili sec </p> </center>");
    %>
</table>
