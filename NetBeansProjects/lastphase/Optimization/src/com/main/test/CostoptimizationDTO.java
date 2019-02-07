package com.main.test;

public class CostoptimizationDTO implements Comparable {

    String query;
    Integer cost;
    String row;
    String columns;
    String time;

    public CostoptimizationDTO() {
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getColumns() {
        return columns;
    }

    public void setColumns(String columns) {
        this.columns = columns;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public int compareTo(Object o) {
        int costbasic = ((CostoptimizationDTO) o).getCost();
        return this.cost - costbasic;
    }

    @Override
    public String toString() {
        return query + "\nROW -> " + row + " COLUMNS->" + columns + " TIME -> " + time + "  COST -> " + cost;
    }

}
