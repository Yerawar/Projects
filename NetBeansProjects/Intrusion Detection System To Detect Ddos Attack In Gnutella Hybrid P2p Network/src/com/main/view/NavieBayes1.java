/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.view;

import com.main.view.NavieFrame;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.text.DecimalFormat;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/**
 *
 * @author seabirds
 */
public class NavieBayes1 {

    String path;
    String dSet[][];
    ArrayList cls = new ArrayList();
    ArrayList clsCnt = new ArrayList();
    String colName[];
    String colType[];

    ArrayList cols = new ArrayList();
    ArrayList means = new ArrayList();

    NavieBayes1(String p) {
        path = p;
    }

    public void readData() {
        try {
            File fe = new File(path);
            FileInputStream fis = new FileInputStream(fe);
            byte data[] = new byte[fis.available()];
            fis.read(data);
            fis.close();

            String sg1[] = new String(data).split("\n");
            String col[] = sg1[0].split("\t");
            String colty[] = sg1[1].split("\t");
            colName = new String[col.length];
            colType = new String[col.length];

            for (int i = 0; i < col.length; i++) {
                colName[i] = col[i];
                colType[i] = colty[i];
            }

            dSet = new String[sg1.length - 2][col.length];

            for (int i = 2; i < sg1.length; i++) {
                String sg2[] = sg1[i].split("\t");
                for (int j = 0; j < sg2.length; j++) {
                    dSet[i - 2][j] = sg2[j];
                }
                String c1 = sg2[sg2.length - 1].trim();
                if (!cls.contains(c1)) {
                    cls.add(c1);
                }
            }
            System.out.println("cls " + cls);
            clsCnt = getClassCount();
            System.out.println("clsCnt " + clsCnt);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void classify() {
        try {
            NavieFrame nf = new NavieFrame(this);
            String txt1 = "";

            for (int i = 0; i < colType.length - 1; i++) {
                if (colType[i].equals("dis")) {
                    ArrayList at1 = getDiscrete(i);
                    System.out.println(colName[i]);
                    txt1 = txt1 + colName[i] + "\n";
                    for (int j1 = 0; j1 < cls.size(); j1++) {
                        String c1 = cls.get(j1).toString().trim();
                        System.out.println("\t" + c1);
                        txt1 = txt1 + "\t" + c1 + "\n";
                        for (int j2 = 0; j2 < at1.size(); j2++) {
                            String c2 = at1.get(j2).toString().trim();
                            int cnt1 = 0;
                            for (int j3 = 0; j3 < dSet.length; j3++) {
                                if (dSet[j3][i].trim().equals(c2) && dSet[j3][colType.length - 1].trim().equals(c1)) {
                                    cnt1++;
                                }
                            }
                            System.out.println("\t\t" + c2 + " : " + cnt1);
                            txt1 = txt1 + "\t\t" + c2 + " : " + cnt1 + "\n";
                        }
                    }
                }
                if (colType[i].equals("con")) {
                    System.out.println(colName[i]);
                    txt1 = txt1 + colName[i] + "\n";
                    cols.add(colName[i]);
                    String mn = "";
                    for (int j1 = 0; j1 < cls.size(); j1++) {
                        String c1 = cls.get(j1).toString().trim();
                        int cc = Integer.parseInt(clsCnt.get(j1).toString());
                        double val1[] = new double[cc];
                        int t = 0;
                        for (int j2 = 0; j2 < dSet.length; j2++) {
                            if (dSet[j2][colType.length - 1].trim().equals(c1)) {
                                val1[t++] = Double.parseDouble(dSet[j2][i]);
                            }
                        }

                        DescriptiveStatistics ds = new DescriptiveStatistics(val1);
                        double mean = ds.getMean();
                        double std = ds.getStandardDeviation();
                        DecimalFormat df = new DecimalFormat("#.###");
                        String m1 = df.format(mean);
                        String sd1 = df.format(std);
                        System.out.println("\t" + c1 + " : " + df.format(mean) + " : " + df.format(std));
                        txt1 = txt1 + "\t" + c1 + "\n";
                        txt1 = txt1 + "\t\t" + "Mean      : " + df.format(mean) + "\n";
                        txt1 = txt1 + "\t\t" + "Std. Dev. : " + df.format(std) + "\n";
                        mn = mn + m1 + "#" + sd1 + "@";
                    }
                    means.add(mn);
                }
            }

            nf.setVisible(true);
            nf.setResizable(false);
            nf.jTextArea1.setText(txt1);
            nf.setTitle("Navie Bayes");

            System.out.println(cols);
            System.out.println(means);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList getClassCount() {
        ArrayList at1 = new ArrayList();
        try {
            for (int i = 0; i < cls.size(); i++) {
                String c1 = cls.get(i).toString();
                int cn = 0;
                for (int j = 0; j < dSet.length; j++) {
                    if (dSet[j][colType.length - 1].trim().equals(c1)) {
                        cn++;
                    }
                }
                at1.add(cn);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return at1;
    }

    public ArrayList getDiscrete(int k) {
        ArrayList dis = new ArrayList();
        try {
            for (int i = 0; i < dSet.length; i++) {
                String g1 = dSet[i][k].trim();
                if (!dis.contains(g1)) {
                    dis.add(g1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dis;
    }
}
