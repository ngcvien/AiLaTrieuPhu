/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example.view.helpCall;


import org.example.model.PlayAudioURL;
import org.example.model.QuestionModel;
import org.example.view.GameFrame;

import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.event.WindowListener;

/**
 *
 * @author Ngọc Viên
 */
public class HelpCallFrame extends javax.swing.JFrame {

    /**
     * Creates new form HelpCallFrame
     */
    public HelpCallFrame(QuestionModel question) {
        initComponents();
        evenHandler();
        setResizable(false);
        setLocationRelativeTo(null);
        this.question = question;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sonTungButon = new javax.swing.JButton();
        jackButon = new javax.swing.JButton();
        thangButon = new javax.swing.JButton();
        sonTungLable = new javax.swing.JLabel();
        jackLabel = new javax.swing.JLabel();
        thangLabel = new javax.swing.JLabel();
        bgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(sonTungButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 130, 30));
        getContentPane().add(jackButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 130, 30));

        thangButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thangButonActionPerformed(evt);
            }
        });
        getContentPane().add(thangButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 267, 180, 40));

        sonTungLable.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        sonTungLable.setForeground(new java.awt.Color(255, 255, 255));
        sonTungLable.setText("Son Tung - MTP");
        getContentPane().add(sonTungLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 273, -1, -1));

        jackLabel.setFont(new java.awt.Font("Gadugi", 1, 15)); // NOI18N
        jackLabel.setForeground(new java.awt.Color(255, 255, 255));
        jackLabel.setText("Jack-J97");
        getContentPane().add(jackLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 273, -1, -1));

        thangLabel.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        thangLabel.setForeground(new java.awt.Color(255, 255, 255));
        thangLabel.setText("Vu Dinh Trong Thang");
        getContentPane().add(thangLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 273, -1, -1));

        bgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/Goi dien thoai nguoi than (1).png"))); // NOI18N
        getContentPane().add(bgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void thangButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thangButonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thangButonActionPerformed
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(HelpCallFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HelpCallFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HelpCallFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HelpCallFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HelpCallFrame().setVisible(true);
//            }
//        });
//    }
    public static void display(QuestionModel question){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HelpCallFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpCallFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpCallFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpCallFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpCallFrame(question).setVisible(true);
            }
        });
    }
    private void evenHandler(){
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                GameFrame.setEableButon();
                setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

//                dispose();
            }
        });
        setTitle("Trợ giúp: Gọi điện cho người thân");

        makeButtonTransparent(thangButon);
        makeButtonTransparent(jackButon);
        makeButtonTransparent(sonTungButon);

        thangButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jackButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sonTungButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        thangButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayAudioURL.playClickAudio();
            }
        });
        jackButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayAudioURL.playClickAudio();
            }
        });
        sonTungButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayAudioURL.playClickAudio();
            }
        });

        jackButon.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jackMouseEnteredClip = PlayAudioURL.playStartAudio(getClass().getResource("/audio/tui nhay xuong ba luon bay gio.wav"),0);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PlayAudioURL.stopAudio(jackMouseEnteredClip);
            }
        });
        thangButon.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                thangMouseEntered = PlayAudioURL.playStartAudio(getClass().getResource("/audio/mot cai chet truyen thong.wav"),0);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PlayAudioURL.stopAudio(thangMouseEntered);
            }
        });
        sonTungButon.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sonTungMouseEntered = PlayAudioURL.playStartAudio(getClass().getResource("/audio/tra da voi son tung.wav"),0);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PlayAudioURL.stopAudio(sonTungMouseEntered);
            }
        });

        jackButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GameFrame.disableCall();
                PlayAudioURL.playClickAudio();
                PlayAudioURL.stopAudio(jackMouseEnteredClip);
                dispose();

                CallWithSO.display(question,"Jack",4000,
                        getClass().getResource("/audio/thien ly oi.wav"),
                        getClass().getResource("/background/khung chat voi Jack.png"));
            }
        });
        thangButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GameFrame.disableCall();
                PlayAudioURL.playClickAudio();
                PlayAudioURL.stopAudio(thangMouseEntered);
                dispose();
                CallWithSO.display(question,"Thắng",9000,
                        getClass().getResource("/audio/cho toi di theo.wav"),
                        getClass().getResource("/background/khung chat voi Thang.png"));

            }
        });
        sonTungButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GameFrame.disableCall();
                PlayAudioURL.playClickAudio();
                PlayAudioURL.stopAudio(sonTungMouseEntered);
                dispose();
                CallWithSO.display(question,"Sơn Tùng",5500,
                        getClass().getResource("/audio/dung lam trai tim anh dau.wav"),
                        getClass().getResource("/background/khung chat voi Son Tung.png"));

            }
        });
    }
    static void makeButtonTransparent(JButton button) {
        button.setContentAreaFilled(false);
        button.setOpaque(false);
    }
    private Clip sonTungMouseEntered;
    private Clip thangMouseEntered;
    private Clip jackMouseEnteredClip;
    private QuestionModel question;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgLabel;
    private javax.swing.JButton jackButon;
    private javax.swing.JLabel jackLabel;
    private javax.swing.JButton sonTungButon;
    private javax.swing.JLabel sonTungLable;
    private javax.swing.JButton thangButon;
    private javax.swing.JLabel thangLabel;
    // End of variables declaration//GEN-END:variables
}