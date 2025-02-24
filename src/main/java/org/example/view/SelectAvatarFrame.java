/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example.view;

import org.example.model.PlayAudio;
import org.example.model.PlayAudioURL;
import org.example.model.PlayerModel;
import org.example.service.PlayerService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 * @author Ngọc Viên
 */
public class SelectAvatarFrame extends javax.swing.JFrame {

    /**
     * Creates new form SelectAvatarFrame
     */
    public SelectAvatarFrame(PlayerModel player, int frame,JLabel avatarLabel) {
        this.avatarLabel = avatarLabel;
        this.frame = frame;
        playerService = new PlayerService();
        this.player = player;
        initComponents();
        evenhandler();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        avtButon1 = new javax.swing.JButton();
        avtButon2 = new javax.swing.JButton();
        avtButon3 = new javax.swing.JButton();
        avtButon4 = new javax.swing.JButton();
        avtButon5 = new javax.swing.JButton();
        avtButon6 = new javax.swing.JButton();
        avtButon7 = new javax.swing.JButton();
        avtButon8 = new javax.swing.JButton();
        avtButon9 = new javax.swing.JButton();
        avtButon10 = new javax.swing.JButton();
        avtButon11 = new javax.swing.JButton();
        avtButon12 = new javax.swing.JButton();
        avtButon13 = new javax.swing.JButton();
        avtButon14 = new javax.swing.JButton();
        avtButon15 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        backgoundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(avtButon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 60, 60));
        getContentPane().add(avtButon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 50, 60, 60));
        getContentPane().add(avtButon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 60, 60));
        getContentPane().add(avtButon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 60, 60));
        getContentPane().add(avtButon5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 60, 60));
        getContentPane().add(avtButon6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 60, 60));
        getContentPane().add(avtButon7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 60, 60));
        getContentPane().add(avtButon8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 60, 60));
        getContentPane().add(avtButon9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 60, 60));
        getContentPane().add(avtButon10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 60, 60));
        getContentPane().add(avtButon11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 60, 60));
        getContentPane().add(avtButon12, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 285, 60, 60));
        getContentPane().add(avtButon13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 60, 60));
        getContentPane().add(avtButon14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 60, 60));
        getContentPane().add(avtButon15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 60, 60));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hãy chọn Avatar của bạn");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 464, -1, -1));

        backgoundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/select avatar bg.png"))); // NOI18N
        getContentPane().add(backgoundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
//            java.util.logging.Logger.getLogger(SelectAvatarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SelectAvatarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SelectAvatarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SelectAvatarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SelectAvatarFrame().setVisible(true);
//            }
//        });
//    }
    public static void display(PlayerModel player, int frame,JLabel avatarLabel) {
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
            java.util.logging.Logger.getLogger(SelectAvatarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectAvatarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectAvatarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectAvatarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectAvatarFrame(player, frame,avatarLabel).setVisible(true);
            }
        });
    }

    public static String getAvtPathByIndex(int index) {
        String path = "src/main/resources/avatar/" + index + ".png";
        return path;
    }

    private void evenhandler() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        //lam trong suot
        {
            makeButtonTransparent(avtButon1);
            makeButtonTransparent(avtButon2);
            makeButtonTransparent(avtButon3);
            makeButtonTransparent(avtButon4);
            makeButtonTransparent(avtButon5);
            makeButtonTransparent(avtButon6);
            makeButtonTransparent(avtButon7);
            makeButtonTransparent(avtButon8);
            makeButtonTransparent(avtButon9);
            makeButtonTransparent(avtButon10);
            makeButtonTransparent(avtButon11);
            makeButtonTransparent(avtButon12);
            makeButtonTransparent(avtButon13);
            makeButtonTransparent(avtButon14);
            makeButtonTransparent(avtButon15);
        }
        //doi con tro
        {
            avtButon1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            avtButon2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            avtButon3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            avtButon4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            avtButon5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            avtButon6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            avtButon7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            avtButon8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            avtButon9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            avtButon10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            avtButon11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            avtButon12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            avtButon13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            avtButon14.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            avtButon15.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }

        //them hanh dong
        if (frame == 1&&avatarLabel==null)
        {
            avtButon1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("1");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    dispose();
                    GameFrame.display(player);
                }
            });
            avtButon2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("2");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    dispose();
                    GameFrame.display(player);
                }
            });
            avtButon3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("3");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    dispose();
                    GameFrame.display(player);
                }
            });
            avtButon4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("4");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    dispose();
                    GameFrame.display(player);
                }
            });
            avtButon5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("5");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    dispose();
                    GameFrame.display(player);
                }
            });
            avtButon6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("6");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    dispose();
                    GameFrame.display(player);
                }
            });
            avtButon7.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("7");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    dispose();
                    GameFrame.display(player);
                }
            });
            avtButon8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("8");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    dispose();
                    GameFrame.display(player);
                }
            });
            avtButon9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("9");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    dispose();
                    GameFrame.display(player);
                }
            });
            avtButon10.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("10");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    dispose();
                    GameFrame.display(player);
                }
            });
            avtButon11.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("11");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    dispose();
                    GameFrame.display(player);
                }
            });
            avtButon12.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("12");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    dispose();
                    GameFrame.display(player);
                }
            });
            avtButon13.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("13");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    dispose();
                    GameFrame.display(player);
                }
            });
            avtButon14.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("14");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    dispose();
                    GameFrame.display(player);
                }
            });
            avtButon15.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("15");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    dispose();
                    GameFrame.display(player);
                }
            });
        } else
        {
            avtButon1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("1");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    avatarLabel.setIcon(new ImageIcon(getClass().getResource("/avatar/"+player.getAvatarPath()+".png")));
                    dispose();
                }
            });
            avtButon2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("2");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    avatarLabel.setIcon(new ImageIcon(getClass().getResource("/avatar/"+player.getAvatarPath()+".png")));
                    dispose();
                }
            });
            avtButon3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("3");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    avatarLabel.setIcon(new ImageIcon(getClass().getResource("/avatar/"+player.getAvatarPath()+".png")));
                    dispose();
                }
            });
            avtButon4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("4");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    avatarLabel.setIcon(new ImageIcon(getClass().getResource("/avatar/"+player.getAvatarPath()+".png")));
                    dispose();
                }
            });
            avtButon5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("5");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    avatarLabel.setIcon(new ImageIcon(getClass().getResource("/avatar/"+player.getAvatarPath()+".png")));
                    dispose();
                }
            });
            avtButon6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("6");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    avatarLabel.setIcon(new ImageIcon(getClass().getResource("/avatar/"+player.getAvatarPath()+".png")));
                    dispose();
                }
            });
            avtButon7.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("7");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    avatarLabel.setIcon(new ImageIcon(getClass().getResource("/avatar/"+player.getAvatarPath()+".png")));
                    dispose();
                }
            });
            avtButon8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("8");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    avatarLabel.setIcon(new ImageIcon(getClass().getResource("/avatar/"+player.getAvatarPath()+".png")));
                    dispose();
                }
            });
            avtButon9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("9");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    avatarLabel.setIcon(new ImageIcon(getClass().getResource("/avatar/"+player.getAvatarPath()+".png")));
                    dispose();
                }
            });
            avtButon10.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("10");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    avatarLabel.setIcon(new ImageIcon(getClass().getResource("/avatar/"+player.getAvatarPath()+".png")));
                    dispose();
                }
            });
            avtButon11.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("11");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    avatarLabel.setIcon(new ImageIcon(getClass().getResource("/avatar/"+player.getAvatarPath()+".png")));
                    dispose();
                }
            });
            avtButon12.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("12");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    avatarLabel.setIcon(new ImageIcon(getClass().getResource("/avatar/"+player.getAvatarPath()+".png")));
                    dispose();
                }
            });
            avtButon13.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("13");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    avatarLabel.setIcon(new ImageIcon(getClass().getResource("/avatar/"+player.getAvatarPath()+".png")));
                    dispose();
                }
            });
            avtButon14.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("14");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    avatarLabel.setIcon(new ImageIcon(getClass().getResource("/avatar/"+player.getAvatarPath()+".png")));
                    dispose();
                }
            });
            avtButon15.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PlayAudioURL.playClickAudio();
                    player.setAvatarPath("15");
                    try {
                        playerService.updateAvatar(player);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    avatarLabel.setIcon(new ImageIcon(getClass().getResource("/avatar/"+player.getAvatarPath()+".png")));
                    dispose();
                }
            });
        }


    }

    static void makeButtonTransparent(JButton button) {
        button.setContentAreaFilled(false);
        button.setOpaque(false);
    }

    private JLabel avatarLabel;
    private int frame;
    private PlayerService playerService;
    private PlayerModel player;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avtButon1;
    private javax.swing.JButton avtButon10;
    private javax.swing.JButton avtButon11;
    private javax.swing.JButton avtButon12;
    private javax.swing.JButton avtButon13;
    private javax.swing.JButton avtButon14;
    private javax.swing.JButton avtButon15;
    private javax.swing.JButton avtButon2;
    private javax.swing.JButton avtButon3;
    private javax.swing.JButton avtButon4;
    private javax.swing.JButton avtButon5;
    private javax.swing.JButton avtButon6;
    private javax.swing.JButton avtButon7;
    private javax.swing.JButton avtButon8;
    private javax.swing.JButton avtButon9;
    private javax.swing.JLabel backgoundLabel;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
