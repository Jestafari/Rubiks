
package screens;

import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author JesTa
 */
public class Block extends javax.swing.JFrame {

    /**
     * Creates new form Block
     */
    public Block() {        
        initComponents();
    }
    
    Boolean check = false;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRoot = new javax.swing.JPanel();
        pnlSide = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        pnlCenter = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nonceBlock = new javax.swing.JTextField();
        hashBlock = new javax.swing.JTextField();
        mineBlock = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataBlock = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RUBIKS - EDUCATIONAL UI");
        setMinimumSize(new java.awt.Dimension(1280, 600));
        setPreferredSize(new java.awt.Dimension(1160, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(1425, 600));

        pnlRoot.setLayout(new java.awt.BorderLayout());

        pnlSide.setBackground(new java.awt.Color(7, 33, 43));
        pnlSide.setPreferredSize(new java.awt.Dimension(80, 0));

        jPanel1.setBackground(new java.awt.Color(7, 33, 43));
        jPanel1.setPreferredSize(new java.awt.Dimension(50, 170));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 30));

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_rubik's_cube_20px.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
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

        pnlCenter.setBackground(new java.awt.Color(3, 47, 64));
        pnlCenter.setMinimumSize(new java.awt.Dimension(1110, 600));
        pnlCenter.setPreferredSize(new java.awt.Dimension(1110, 600));
        pnlCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("WHAT IS IN A BLOCK?");
        pnlCenter.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 240, 40));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BLOCK:");
        pnlCenter.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("#");
        pnlCenter.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("GENESIS");
        pnlCenter.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 310, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NONCE:");
        pnlCenter.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DATA:");
        pnlCenter.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("HASH:");
        pnlCenter.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        nonceBlock.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        nonceBlock.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pnlCenter.add(nonceBlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 310, -1));

        hashBlock.setEditable(false);
        hashBlock.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        hashBlock.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pnlCenter.add(hashBlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 470, 30));

        mineBlock.setBackground(new java.awt.Color(0, 204, 255));
        mineBlock.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        mineBlock.setText("MINE");
        mineBlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mineBlockActionPerformed(evt);
            }
        });
        pnlCenter.add(mineBlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, -1));

        dataBlock.setColumns(20);
        dataBlock.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        dataBlock.setLineWrap(true);
        dataBlock.setRows(5);
        dataBlock.setText("<--- INTRODUCE DATA TO HASH --->");
        dataBlock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dataBlockKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(dataBlock);

        pnlCenter.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 310, 260));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Blockchain.jpg"))); // NOI18N
        pnlCenter.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 600, 320));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Blockchain.jpg"))); // NOI18N
        pnlCenter.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 600, 320));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Blockchain.jpg"))); // NOI18N
        pnlCenter.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 600, 330));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Blockchain.jpg"))); // NOI18N
        pnlCenter.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 330));

        pnlRoot.add(pnlCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlRoot, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        close();
        Principal p = new Principal();
        p.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void mineBlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mineBlockActionPerformed
        // TODO add your handling code here:
       Bloque b = new Bloque();
       String data = dataBlock.getText();       
       if(check) {
           this.hashBlock.setText(b.Hash(data));                     
           this.nonceBlock.setText(b.toString(b.Nonce()));
           nonceBlock.setBackground(Color.green);
           //dataBlock.setBackground(Color.green);
           hashBlock.setBackground(Color.green);
           check = false;
       }
              
    }//GEN-LAST:event_mineBlockActionPerformed

    private void dataBlockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dataBlockKeyTyped
        // TODO add your handling code here:
        check = true;
        nonceBlock.setBackground(Color.red);
        //dataBlock.setBackground(Color.red);
        hashBlock.setBackground(Color.red);
    }//GEN-LAST:event_dataBlockKeyTyped

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
            java.util.logging.Logger.getLogger(Block.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Block.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Block.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Block.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Block().setVisible(true);
            }
        });
    }
    
    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    } 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea dataBlock;
    public javax.swing.JTextField hashBlock;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JButton mineBlock;
    public javax.swing.JTextField nonceBlock;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlSide;
    // End of variables declaration//GEN-END:variables
}
