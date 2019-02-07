package com.main.process;

public class ParserQuery implements IConstantManager {

    public static void main(String[] args) {
        String sql = "SELECT * FROM  `tblcustomer` c , tblproductpurchase p ";
        String select = getSelect(sql);
        String from = getFrom(sql);
        System.out.println("form= " + from);
    }

    public static String makeTree(String sql) {
        String select = getSelect(sql);
        String from = getFromForAlgrbra(sql);
        String where = "" + (getWhere(sql).trim().length() != 0 ? "( <b  style=font-size:25px;>" + SIGMA + "</b><sub>" + getWhere(sql) + "</sub> ) " : "") + "";

        if (sql.toUpperCase().indexOf("UNION") != -1) {
            String[] split = sql.toUpperCase().split("UNION");
            String sql1 = split[0];
            String sql2 = split[1];
            String parse1 = "<b style=font-size:25px;>" + PI + "</b>"
                    + "<sub>" + getSelect(sql1) + "</sub>"
                    + "" + "" + (getWhere(sql1).trim().length() != 0 ? "( <b  style=font-size:25px;>" + SIGMA + "</b><sub>" + getWhere(sql1) + "</sub> ) " : "") + ""
                    + "(" + getFromForAlgrbra(sql1);

            String parse2 = "<b style=font-size:25px;>" + PI + "</b>"
                    + "<sub>" + getSelect(sql2) + "</sub>"
                    + "" + "" + (getWhere(sql2).trim().length() != 0 ? "( <b  style=font-size:25px;>" + SIGMA + "</b><sub>" + getWhere(sql2) + "</sub> ) " : "") + ""
                    + "(" + getFromForAlgrbra(sql2);
            return parse1 + "     (" + UNION + ")    " + parse2;
        } else {

            return "<b style=font-size:25px;>" + PI + "</b>"
                    + "<sub>" + select + "</sub>"
                    + "" + where + ""
                    + "" + from;
        }
    }

    public static String makeProjection(String sql) {
        String select = getSelect(sql).trim().length() != 0 ? "<b style=font-size:20px;>" + PI + "</b><sub  style=font-size:12px;>" + getSelect(sql) + "</sub>" : "";
        return select;
    }

    public static String makeSelection(String sql) {
        String where = getWhere(sql).trim().length() != 0 ? "<b style=font-size:20px;>" + SIGMA + "</b><sub  style=font-size:12px;>" + getWhere(sql) + getHaving(sql) + "</sub>" : "";;
        return where;
    }

    public static String getTableName(String sql) {
        String from = getFrom(sql);
        return "" + from;
    }

    public static String parse(String sql) {
        String select = getSelect(sql);
        String from = getFrom(sql);
        String where = getWhere(sql);
        return "";
    }

    private static String getSelect(String sql) {
        String select = "";

        try {
            select = sql.substring(sql.toLowerCase().indexOf("select") + ("select".length()), sql.toLowerCase().indexOf("from"));
        } catch (Exception e) {
        }
        return select;
    }

    private static String getFromForAlgrbra(String sql) {
        String from = "";
        String cartition = "";
        try {
            if (sql.toLowerCase().indexOf("where") != -1) {
                from = sql.substring(sql.toLowerCase().indexOf("from") + ("from".length()), sql.toLowerCase().indexOf("where"));
            } else {
                from = sql.substring(sql.toLowerCase().indexOf("from") + ("from".length()), sql.length());
            }
            if (from.split((",")).length >= 2) {
                for (String object : from.split(",")) {
                    cartition = "" + cartition + JOINT + object;
                }
                from = "" + cartition.replaceFirst(JOINT, "") + "";
            }
        } catch (Exception e) {
        }
        return from;
    }

    public static String getFrom(String sql) {
        String from = "";
        String cartition = "";
        try {
            if (sql.toLowerCase().indexOf("where") != -1) {
                from = sql.substring(sql.toLowerCase().indexOf("from") + ("from".length()), sql.toLowerCase().indexOf("where"));
            } else {
                from = sql.substring(sql.toLowerCase().indexOf("from") + ("from".length()), sql.length());
            }
        } catch (Exception e) {
        }
        return from;
    }

    private static String getWhere(String sql) {
        String where = "";
        try {
            if (sql.toLowerCase().indexOf("where") != -1) {
                where = sql.substring(sql.toLowerCase().indexOf("where") + ("where".length()), sql.length());
                where = where.toLowerCase().replaceAll("and", AND);
                if (sql.toLowerCase().indexOf("group by") != -1) {
                    where = where.toLowerCase().replaceAll("group by", GROUPBY);
                }
            }
            if (sql.toLowerCase().indexOf("having") != -1) {
                where = where.toLowerCase().replaceAll("having" + getHaving(sql), "");
            }
        } catch (Exception e) {
        }
        return where;
    }

    private static String getHaving(String sql) {
        String where = "";
        try {
            if (sql.toLowerCase().indexOf("having") != -1) {
                where = sql.substring(sql.toLowerCase().indexOf("having") + ("having".length()), sql.length());
                where = where.toLowerCase().replaceAll("and", AND);
                if (sql.toLowerCase().indexOf("group by") != -1) {
                    where = where.toLowerCase().replaceAll("group by", GROUPBY);
                }
            }
        } catch (Exception e) {
        }
        return where;
    }
}
