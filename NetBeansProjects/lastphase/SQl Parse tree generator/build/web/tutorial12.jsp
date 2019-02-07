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
        <title>SQL PARSE TREE GENERATOR</title>
    </head>
    <body>
        <form name="frmprocess" id="process" method="post" action="./ProcessServlet">
            <div class="wrapper">
                <div class="banner" style="background-image: url('images/banner.jpg') ">
                    <h3 style="font-size: 30px;padding-top: 10px;padding-left: 190px;;font-family: cambria;color: orange">
                        SQL PARSE TREE GENERATOR
                    </h3>
                    <br/>
                    <p style="text-align: justify;font-size: 14px;padding-left: 190px;width: 550px;line-height: 20px;font-family: cambria;color: #3A3A3A">
                        Relational database systems are expected to be equipped by a query language that can assist its user to query the database instances. This way its user empowers itself and can populate the results as required. There are two kinds of query languages, relational algebra and relational calculus. 
                    </p>
                </div>
            </div>
            <div class="contain">
                <div class="menu"><%@include file="menus.jsp" %></div>
                <br/>
                <div style="height: 25px;width: 980px;margin: 0 auto;background-color: rgb(240,240,240);padding: 10px;">
                    Relational Algebra and SQL
                </div>
                <br/>
                <p style="line-height: 20px;text-align: justify">
                    Basic operations:
                    &bull; Selection ( &sigma;) Selects a subset of rows from relation.<br/>
                    &bull; Projection ( &pi;) Deletes unwanted columns from relation.<br/>
                    &bull; Cross-product (X ) Allows us to combine two relations.<br/>
                    &bull; Union ( U ) Tuples in reln. 1 and in reln. 2.<br/>
                </p>

                <br/>
                <div style="height: 25px;width: 980px;margin: 0 auto;background-color: rgb(240,240,240);padding: 10px;">
                    Example
                </div>
                <br/>
                <p style="line-height: 20px;text-align: justify">
                    1. An alias R2 T2 in the FROM-clause corresponds to a renaming ?T2
                    (R2).<br/>
                    2. It is possible that there is no WHERE clause. In that case, it is of
                    course unnecessary to include the selection ? in the relational algebra
                    expression.<br/>
                    3. If we omit the projection (?) we obtain the translation of the following
                    special case:<br/>
                    SELECT *
                    FROM R1, . . . , R2 T2, . . .
                    WHERE Where-condition<br/>

                    Its translation is as follows:<br/>
                <h4>

                    &pi; movieTitle &sigma; starName=name(StarsIn × MovieStar).
                    ^ birthdate=1960
                </h4>
                <br/>

                </p>
            </div>
            <div class="banner" ></div>
        </form>
    </body>
</html>
