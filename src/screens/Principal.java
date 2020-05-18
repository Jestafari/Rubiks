package screens;

import java.awt.event.*;
import java.awt.*;
import screens.*;

/**
 *
 * @author JesTa
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRoot = new javax.swing.JPanel();
        pnlCenter = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlSide = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RUBIK'S - EDUCATIONAL UI");
        setPreferredSize(new java.awt.Dimension(1160, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(1425, 600));

        pnlRoot.setLayout(new java.awt.BorderLayout());

        pnlCenter.setBackground(new java.awt.Color(3, 47, 64));
        pnlCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo CCT.jpg"))); // NOI18N
        pnlCenter.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, 120));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("This application being a contribution, primarily to IT students in CCT College and secondly to tech enthusiasts and");
        pnlCenter.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 1010, 30));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("society in general, not only for the technological advantage but for its growing demands in the technology business world.");
        pnlCenter.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1070, 30));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Our propose with this user interface is to help IT students to understand part of the basics features of blockchain");
        pnlCenter.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 1030, 30));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("and functionality since the technology had been gaining strength at the IT field due to the wide range of applications");
        pnlCenter.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 1050, 30));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("that can be improved its introduction, it is important that students can have a tools which provide them a view of the");
        pnlCenter.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 1050, 30));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("technology that is making a milestone in the world of technology as we see it today and give them the opportunity to");
        pnlCenter.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 1040, 30));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Rubik`s app was developed by a small group made up of two members technology students with their minds always");
        pnlCenter.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 1070, 30));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("explore it.");
        pnlCenter.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 100, 30));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("scheming thinking that new or old things can be better known, as was our clear idea of demonstrating how Blockchain");
        pnlCenter.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 1040, 30));

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("small demo where the internal part of the technology is shown working.");
        pnlCenter.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 630, 30));

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("technology is managed, since it is a not so new technology but lately very resonant. So we had the idea to make this");
        pnlCenter.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 1040, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Key.jpg"))); // NOI18N
        pnlCenter.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 580, 600));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Key.jpg"))); // NOI18N
        pnlCenter.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 600, 600));

        pnlRoot.add(pnlCenter, java.awt.BorderLayout.CENTER);

        pnlSide.setBackground(new java.awt.Color(7, 33, 43));
        pnlSide.setPreferredSize(new java.awt.Dimension(80, 0));

        jPanel1.setBackground(new java.awt.Color(7, 33, 43));
        jPanel1.setPreferredSize(new java.awt.Dimension(50, 170));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 30));

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_rubik's_cube_20px.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(jButton1);

        pnlSide.add(jPanel1);

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_home_20px.png"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pnlSide.add(jButton2);

        jButton3.setBackground(new java.awt.Color(0, 204, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_document_20px.png"))); // NOI18N
        jButton3.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        pnlSide.add(jButton3);

        jButton4.setBackground(new java.awt.Color(0, 204, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_cube_20px.png"))); // NOI18N
        jButton4.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pnlSide.add(jButton4);

        jButton5.setBackground(new java.awt.Color(0, 204, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_blockchain_technology_20px.png"))); // NOI18N
        jButton5.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        pnlSide.add(jButton5);

        pnlRoot.add(pnlSide, java.awt.BorderLayout.WEST);

        getContentPane().add(pnlRoot, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        close();
        Home h = new Home();
        h.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        close();
        Documentation d = new Documentation();
        d.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Block b = new Block();
        b.setVisible(true);
        Bloque bk = new Bloque();
        b.nonceBlock.setText(bk.toString(bk.getNonce()));
        //b.dataBlock.setText(bk.getData());
        close();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Blockchain bc = new Blockchain();
        bc.setVisible(true);
        Bloque bk = new Bloque();
        bc.nonceBlock1.setText(bk.toString(bk.getNonce()));
        bc.dataBlock1.setText(bk.getData());
        bc.preHashBlock1.setText(bk.getpHash());
        close();
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    
    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlSide;
    // End of variables declaration//GEN-END:variables
}
