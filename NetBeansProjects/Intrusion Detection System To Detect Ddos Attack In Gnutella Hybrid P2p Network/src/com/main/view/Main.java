/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.view;

import com.main.view.MainFrame;
import com.main.view.SplashScreen;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author seabirds
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    SplashScreen splashScreen = new SplashScreen(null, true);
                    splashScreen.setVisible(true);
                    JFrame.setDefaultLookAndFeelDecorated(true);
                    JDialog.setDefaultLookAndFeelDecorated(true);
                    MainFrom mf=new MainFrom();
                    mf.setVisible(true);
                    mf.setTitle("Intrusion Detection System To Detect Ddos Attack In Gnutella Hybrid P2p Network ");
                } catch (Exception e) {
                    System.out.println("e = " + e);
                }
            }
        });
    
    }
}
