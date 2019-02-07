package com.main.compare;

import com.main.refector.IConstantManager;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class CostAnalysisChart extends ApplicationFrame {

    double cost1;
    double cost2;

    public CostAnalysisChart(String applicationTitle, String chartTitle, double cost1, double cost2) {
        super(applicationTitle);
        this.cost1 = cost1;
        this.cost2 = cost2;
        JFreeChart barChart = ChartFactory.createBarChart(
                chartTitle,
                "Category",
                "Time (Mili Sec)",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        setContentPane(chartPanel);
    }

    private CategoryDataset createDataset() {
        final String kmeans = "Before Optimization";
        final String fastCluster = "After Optimization";
        final DefaultCategoryDataset dataset
                = new DefaultCategoryDataset();

        dataset.addValue(cost1, kmeans, kmeans);
        dataset.addValue(cost2, fastCluster, fastCluster);
        return dataset;
    }

    private CategoryDataset createDataset(double kmeans, double fastcluster) {
        final String fiat = "Before Optimization";
        final String audi = "After Optimization";
        final DefaultCategoryDataset dataset
                = new DefaultCategoryDataset();

        dataset.addValue(kmeans, fiat, fiat);
        dataset.addValue(fastcluster, audi, audi);
        return dataset;
    }

    public static void showGraph(double cost1, double cost2) {
        CostAnalysisChart chart = new CostAnalysisChart(IConstantManager.TITLE, "Time Statistics", cost1, cost2);
        chart.pack();
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);
    }

    public static void main(String[] args) {
        showGraph(1.1, 2.2);
    }
}
