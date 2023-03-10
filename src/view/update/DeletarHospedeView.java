/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.update;

import controller.update.DeletarHospedeController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class DeletarHospedeView extends javax.swing.JFrame {

    /**
     * Creates new form DeletarHospede
     */
    private final DeletarHospedeController controller;
    
    public DeletarHospedeView() {
        initComponents();
        controller = new DeletarHospedeController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldIdDeletar = new javax.swing.JTextField();
        jButtonDeletar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("DIGITE O ID REFERENTE AO HÓSPEDE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        getContentPane().add(jTextFieldIdDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 124, 34));

        jButtonDeletar.setText("DELETAR");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 120, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/cadastrologin.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        try {
            // TODO add your handling code here:
            controller.deletaHospede();
        } catch (SQLException ex) {
            Logger.getLogger(DeletarHospedeView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonDeletarActionPerformed

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
            java.util.logging.Logger.getLogger(DeletarHospedeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeletarHospedeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeletarHospedeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeletarHospedeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeletarHospedeView().setVisible(true);
            }
        });
    }

    public JTextField getjTextFieldIdDeletar() {
        return jTextFieldIdDeletar;
    }

    public void setjTextFieldIdDeletar(JTextField jTextFieldIdDeletar) {
        this.jTextFieldIdDeletar = jTextFieldIdDeletar;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldIdDeletar;
    // End of variables declaration//GEN-END:variables
}
