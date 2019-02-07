<link href="css/style.css" rel="stylesheet">
<link rel="stylesheet" href="css/jquery.jOrgChart.css"/>
<link href="css/prettify.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="js/prettify.js"></script>
<script type="text/javascript" src="js/jquery-ui.min.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script src="js/jquery.jOrgChart.js"></script>
<style>
    label{
        margin: 20px;
        margin-top: 10px;
        background-color: rgb(245,245,245);
        height: 80px;
    }

</style>
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
                <div style="height: 25px;width: 980px;margin: 0 auto;background-color: rgb(240,240,240);padding: 10px;"><h3>Relational algebra</h3></div>
                <br/>
                <p style="line-height: 20px;text-align: justify">
                    Relational algebra is a procedural query language, which takes instances of relations as input and yields instances of relations as output. It uses operators to perform queries. An operator can be either unary or binary. They accept relations as their input and yields relations as their output. Relational algebra is performed recursively on a relation and intermediate results are also considered relations.
                    Fundamental operations of Relational algebra:  
                </p>

                <br/>
                <ul style="margin-left: 30px;">
                    <li>Select</li>
                    <li>Project</li>
                    <li>Union</li>
                    <li>Set different</li>
                    <li>Cartesian product</li>
                </ul>
                <br/>
                <div style="height: 25px;width: 980px;margin: 0 auto;background-color: rgb(240,240,240);padding: 10px;">
                    <h3> Select Operation (&sigma;)</h3>
                </div>
                <br/>
                <p style="line-height: 20px;text-align: justify"> 
                    Selects tuples that satisfy the given predicate from a relation.
                    Notation ?p(r)
                    Where p stands for selection predicate and r stands for relation. p is prepositional logic formulae which may use connectors like and, or and not. These terms may use relational operators like: =, ?, ?, < ,  >,  ?.
                    For example:
                </p>
                <br/>
                <label>
                    &sigma;subject="database"(Books)
                </label>
                <br/>
                <br/>
                <label>
                    &sigma;subject="database" and price="450"(Books)
                </label>
                <br/>
                <br/>
                <label>
                    &sigma;subject="database" and price < "450" or year > "2010"(Books)
                </label>
                <br/>
                <br/>
                <div style="height: 25px;width: 980px;margin: 0 auto;background-color: rgb(240,240,240);padding: 10px;">
                    <h3> Project Operation (&Pi;)</h3>
                </div>
                <br/>
                <p style="line-height: 20px;text-align: justify"> 
                    Projects column(s) that satisfy given predicate.
                    Notation: &Pi;A1, A2, An (r)
                    Where a1, a2 , an are attribute names of relation r.
                    Duplicate rows are automatically eliminated, as relation is a set.
                    for example:
                </p>
                <br/>
                <br/>
                <label>
                    &Pi;subject, author (Books)
                </label>

                <br/>
                <br/>
                <div style="height: 25px;width: 980px;margin: 0 auto;background-color: rgb(240,240,240);padding: 10px;">
                    <h3> Union Operation (U)</h3>
                </div>
                <br/>
                <br/>
                <label>
                    r U s = { t | t E r or t E s} 
                </label>
                <br/>
                <br/>
                <p style="line-height: 30px">
                    Notion: r U s
                    <br/>&bull;Where r and s are either database relations or relation result set (temporary relation).
                    <br/>&bull;For a union operation to be valid, the following conditions must hold:
                    <br/>&bull;r, s must have same number of attributes.
                    <br/>&bull;Attribute domains must be compatible.
                    <br/>&bull;Duplicate tuples are automatically eliminated.
                </p>
                
                <br/>
                <br/>
                <div style="height: 25px;width: 980px;margin: 0 auto;background-color: rgb(240,240,240);padding: 10px;">
                    <h3> Cartesian Product (X)</h3>
                </div>
                <br/>
                <br/>
                <label>
                    &Pi; author = 'tutorialspoint'(Books X Articles) 
                </label>
                <br/>
                <br/>
                <br/>
                <br/>
            </div>
            <div class="banner" ></div>
        </form>
    </body>
</html>
