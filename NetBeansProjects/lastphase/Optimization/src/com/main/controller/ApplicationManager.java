/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.controller;

import com.main.view.MainFrom;
import com.main.view.SplashScreen;
import java.util.Properties;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class ApplicationManager {

    private static MainFrom mainWindow;

    public ApplicationManager() throws Exception {
        mainWindow = new MainFrom();
    }

    public void start() {
        mainWindow.setVisible(true);
    }

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Properties props = new Properties();
                    props.put("logoString", " ");
                    SplashScreen splashScreen = new SplashScreen(mainWindow, true);
                    splashScreen.setVisible(true);
                    JFrame.setDefaultLookAndFeelDecorated(true);
                    JDialog.setDefaultLookAndFeelDecorated(true);
                    ApplicationManager applicationManager = new ApplicationManager();
                    applicationManager.start();
                } catch (Exception e) {
                    System.out.println("e = " + e);
                }
            }
        });
    }

    public void exitApplication() {
        System.exit(0);
    }
}
