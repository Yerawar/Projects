<%@page import="com.main.parser.ParseJoin"%>
<%@include file="import.jsp" %>
<%
    Object queryobject1 = request.getSession().getAttribute("query");
    String querystring1 = "";
    String projection = "";
    String selection = "";
    String tablename = "";

    if (queryobject1 != null) {
        querystring1 = (String) queryobject1;

        if (querystring1.toLowerCase().indexOf("union") != -1) {
            String[] union = querystring1.toLowerCase().split("union");

            projection = ParserQuery.makeProjection(union[0]);
            selection = ParserQuery.makeSelection(union[0]);
            tablename = ParserQuery.getTableName(union[0]);

            projection = projection + ParserQuery.makeProjection(union[1]);
            selection = selection + ParserQuery.makeSelection(union[1]);
            tablename = tablename + ParserQuery.getTableName(union[1]);

        } else {
            projection = ParserQuery.makeProjection(querystring1);
            selection = ParserQuery.makeSelection(querystring1);
            tablename = ParseJoin.getFromJoin(querystring1);
        }

%>

<div style="padding: 10px;">
    <script>
        jQuery(document).ready(function() {
            $("#org").jOrgChart({
                chartElement: '#chart',
                dragAndDrop: true
            });
        });
    </script>
    <body onload="prettyPrint();">
    <center>
        <ul id="org"  style="display:none;font-size: 11px;">
            <li>INPUT
                <ul>
                    <li >
                        <%=projection%>
                        <ul>
                            <li><%=selection%>
                                <%=tablename%>
                            </li>
                        </ul>
                    </li>
                </ul>
            </li>   
        </ul>     
    </center>

    <div id="chart" class="orgChart"></div>
    <script>
        jQuery(document).ready(function() {
            /* Custom jQuery for the example */
            $("#show-list").click(function(e) {
                e.preventDefault();

                $('#list-html').toggle('fast', function() {
                    if ($(this).is(':visible')) {
                        $('#show-list').text('Hide underlying list.');
                        $(".topbar").fadeTo('fast', 0.9);
                    } else {
                        $('#show-list').text('Show underlying list.');
                        $(".topbar").fadeTo('fast', 1);
                    }
                });
            });
            $('#list-html').text($('#org').html());
            $("#org").bind("DOMSubtreeModified", function() {
                $('#list-html').text('');

                $('#list-html').text($('#org').html());
                prettyPrint();
            });
        });
    </script>
</body>
</div>
<%
    } else {
        out.print("<br/>");
    }
%>