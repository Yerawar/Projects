package com.main.view;

import com.main.compare.AfterOptimization;
import com.main.compare.BeforeOptimization;
import com.main.compare.CostAnalysisChart;
import com.main.controller.MysqlConnection;
import com.main.refector.IConstantManager;
import com.main.refector.LCWDTO;
import com.main.refector.LWCAlgorithm;
import com.main.test.CostoptimizationDTO;
import com.main.test.PlanGeneration;
import it.sauronsoftware.base64.Base64;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;

public class ProcessOptimization extends javax.swing.JFrame {

    String beforeString = "";
    String optimizedString = "";

    public ProcessOptimization() {
        initComponents();
        planOptimize.setEnabled(false);
        planUnOptimize.setEnabled(false);
        jButton3.setEnabled(false);
        jButton1.setEnabled(false);
        btnShowPlan.setEnabled(false);
        btnGeneratePlan.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnLoadDataset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        planOptimize = new javax.swing.JRadioButton();
        planUnOptimize = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        btnGeneratePlan = new javax.swing.JButton();
        btnShowPlan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Training Set");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setText("CONNECT DATASET :");

        btnLoadDataset.setText("Load Dataset");
        btnLoadDataset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadDatasetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLoadDataset)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoadDataset))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel3.setForeground(new java.awt.Color(102, 102, 102));

        jButton3.setText("PROCESS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(planOptimize);
        planOptimize.setText("Optimize Plan 1");
        planOptimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planOptimizeActionPerformed(evt);
            }
        });

        buttonGroup1.add(planUnOptimize);
        planUnOptimize.setText("Plan 2 Unoptimize");
        planUnOptimize.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                planUnOptimizeItemStateChanged(evt);
            }
        });
        planUnOptimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planUnOptimizeActionPerformed(evt);
            }
        });

        jButton1.setText("ANALYSIS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(planOptimize)
                .addGap(18, 18, 18)
                .addComponent(planUnOptimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(planOptimize)
                    .addComponent(planUnOptimize)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BEFORE OPTIMIZATION");

        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("AFTER OPTIMIZATION");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        btnGeneratePlan.setText("GENERATE PLAN");
        btnGeneratePlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneratePlanActionPerformed(evt);
            }
        });

        btnShowPlan.setText("Show Plan");
        btnShowPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowPlanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
            .addComponent(btnGeneratePlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnShowPlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(btnGeneratePlan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addGap(18, 18, 18)
                .addComponent(btnShowPlan))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        btnShowPlan.setEnabled(true);
        String[] split = jTextArea1.getText().trim().split("\n");
        ArrayList<String> list = new ArrayList<>();
        for (String string : split) {
            list.add(string);
        }
        ArrayList<LCWDTO> process = LWCAlgorithm.process(list);
        String resut = "";
        for (LCWDTO lcwdto : process) {
            resut = resut + "" + lcwdto.getFrequncy() + "-" + lcwdto.getWord() + "\n";
        }
        jTextArea2.setText(resut);
        optimizedString = resut;
        
        planUnOptimize.setEnabled(true);
        planOptimize.setEnabled(true);
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnLoadDatasetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadDatasetActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("jdbc:mysql://localhost:3306/" + IConstantManager.DATABASE_NAME);
        ArrayList<String> arrayList = ProjectServices.getQueries();
        String string = "";
        for (String query : arrayList) {
            string = string.trim() + "\n" + Base64.decode(query).trim() + "\n";
        }
        jTextArea3.setText(string);
        beforeString = string;
        jButton3.setEnabled(true);
        btnGeneratePlan.setEnabled(true);
    }//GEN-LAST:event_btnLoadDatasetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        showCost();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void planUnOptimizeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_planUnOptimizeItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_planUnOptimizeItemStateChanged

    private void btnGeneratePlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneratePlanActionPerformed
        // TODO add your handling code here:
        String trim = jTextArea3.getText().trim();
        String[] split = trim.split("\n");
        for (String string : split) {
            PlanGeneration.makeQuries(string);
        }
        ArrayList<String> arrayList = PlanGeneration.arrayList;
        String queires = "";
        for (String string : arrayList) {
            queires = queires + string + "\n";
        }
        jTextArea1.setText(queires);
    }//GEN-LAST:event_btnGeneratePlanActionPerformed

    private void planUnOptimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planUnOptimizeActionPerformed
        // TODO add your handling code here:
        processNormal();
    }//GEN-LAST:event_planUnOptimizeActionPerformed

    private void planOptimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planOptimizeActionPerformed
        // TODO add your handling code here:
        processForOptimization();
    }//GEN-LAST:event_planOptimizeActionPerformed

    private void btnShowPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowPlanActionPerformed
        // TODO add your handling code here:
        Collections.sort(arrayList);
        new ShowOptimization(this, true,arrayList).setVisible(true);
    }//GEN-LAST:event_btnShowPlanActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProcessOptimization().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeneratePlan;
    private javax.swing.JButton btnLoadDataset;
    private javax.swing.JButton btnShowPlan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton planOptimize;
    private javax.swing.JRadioButton planUnOptimize;
    // End of variables declaration//GEN-END:variables

    ArrayList<CostoptimizationDTO> arrayList = new ArrayList<CostoptimizationDTO>();

    private void showCost() {
        double cost1 = BeforeOptimization.process(beforeString);
        double cost2 = AfterOptimization.process(optimizedString);
        CostAnalysisChart.showGraph(cost1, cost2);
    }

    private void processForOptimization() {
        String trim = jTextArea2.getText().trim();
        String[] split = trim.split("\n");
        StringBuilder processQuery = new StringBuilder();
        for (String string : split) {
            processQuery.append(processQuery(string.split("-")[1])).append("\n\n");
        }
        new DataresultDialog(this, true, "PROCESS FOR PER SPLIT SEMI JOIN", processQuery.toString()).setVisible(true);
    }

    private void processNormal() {
        String trim = jTextArea1.getText().trim();
        String[] split = trim.split("\n");
        StringBuilder processQuery = new StringBuilder();
        for (String string : split) {
            processQuery.append(processQuery(string)).append("\n\n");
        }
        new DataresultDialog(this, true, "PROCESS FOR PER SPLIT SEMI JOIN", processQuery.toString()).setVisible(true);
    }

    private String processQuery(String querystring) {
        StringBuilder result = new StringBuilder();;
        try {
            long preTime = System.currentTimeMillis();
            ResultSet resultSet = MysqlConnection.preStateMent(querystring).executeQuery();
            int columncount = resultSet.getMetaData().getColumnCount();
            int row = 0;
            while (resultSet.next()) {
                row++;
            }
            long postTime = System.currentTimeMillis();
            Integer cost = columncount * row;
            CostoptimizationDTO costoptimizationDTO = new CostoptimizationDTO();
            costoptimizationDTO.setQuery(querystring);
            costoptimizationDTO.setCost(cost);
            costoptimizationDTO.setColumns(columncount + "");
            costoptimizationDTO.setRow(row + "");
            costoptimizationDTO.setTime((postTime - preTime) + "");
            arrayList.add(costoptimizationDTO);
            result.append(querystring).append("\n").append("columncount=>").append(columncount).append("\n").append("row count => ").append(row).append("\n").append("time => ").append((postTime - preTime)).append(" milis").append("\n").append(" cost => ").append(cost.toString());
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
        return result.toString();
    }

}
