/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.cadastro;

import controller.cadastro.CadastroFuncController;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 *
 * @author User
 */
public class CadastroFuncView extends javax.swing.JFrame {

    /**
     * Creates new form CadastroFuncView
     */
   
    private final CadastroFuncController controller;
    
    public CadastroFuncView() throws SQLException {
        initComponents();
        controller = new CadastroFuncController(this);
        iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DEPARTAMENTO = new javax.swing.JLabel();
        jComboBoxDepartamento = new javax.swing.JComboBox<>();
        jTextFieldCNH = new javax.swing.JTextField();
        jTextFieldMatricula = new javax.swing.JTextField();
        jLabelMatricula = new javax.swing.JLabel();
        jLabelCNH = new javax.swing.JLabel();
        jComboBoxCpf = new javax.swing.JComboBox<>();
        jLabelCPF = new javax.swing.JLabel();
        jTextFieldId_dept = new javax.swing.JTextField();
        jLabelCNH1 = new javax.swing.JLabel();
        jTextFieldData_de_admissao = new javax.swing.JTextField();
        jLabelPis1 = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldPis = new javax.swing.JTextField();
        jLabelPis = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonProximo = new javax.swing.JButton();
        jLabelCadastroFuncionario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNome1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DEPARTAMENTO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DEPARTAMENTO.setForeground(new java.awt.Color(102, 102, 102));
        DEPARTAMENTO.setText("DEPARTAMENTO");
        getContentPane().add(DEPARTAMENTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, -1, -1));

        jComboBoxDepartamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxDepartamentoItemStateChanged(evt);
            }
        });
        jComboBoxDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDepartamentoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 230, 40));
        getContentPane().add(jTextFieldCNH, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 60, 40));

        jTextFieldMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 230, 40));

        jLabelMatricula.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelMatricula.setForeground(new java.awt.Color(102, 102, 102));
        jLabelMatricula.setText("MATRÍCULA");
        getContentPane().add(jLabelMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, -1, -1));

        jLabelCNH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCNH.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCNH.setText("CNH");
        getContentPane().add(jLabelCNH, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, -1, -1));

        jComboBoxCpf.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxCpfItemStateChanged(evt);
            }
        });
        jComboBoxCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCpfActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 230, 40));

        jLabelCPF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCPF.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCPF.setText("NOME");
        getContentPane().add(jLabelCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));
        getContentPane().add(jTextFieldId_dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 60, 40));

        jLabelCNH1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCNH1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCNH1.setText("ID DEPARTAMENTO");
        getContentPane().add(jLabelCNH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, -1, -1));

        jTextFieldData_de_admissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldData_de_admissaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldData_de_admissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 230, 40));

        jLabelPis1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPis1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelPis1.setText("DATA DE ADMISSÃO");
        getContentPane().add(jLabelPis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, -1, -1));

        jLabelNome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNome.setText("CPF");
        getContentPane().add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, -1));

        jTextFieldPis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPisActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPis, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 230, 40));

        jLabelPis.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPis.setForeground(new java.awt.Color(102, 102, 102));
        jLabelPis.setText("PIS");
        getContentPane().add(jLabelPis, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, -1, -1));

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 230, 40));

        jButtonProximo.setText("SALVAR");
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonProximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 610, 170, 80));

        jLabelCadastroFuncionario.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelCadastroFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCadastroFuncionario.setText("CADASTRO FUNCIONÁRIO");
        getContentPane().add(jLabelCadastroFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/telacadastronovo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -100, 1080, 930));

        jLabelNome1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelNome1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNome1.setText("NOME");
        getContentPane().add(jLabelNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        try {
            // TODO add your handling code here:
            controller.salvaFunc();
        } catch (ParseException ex) {
            Logger.getLogger(CadastroFuncView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jComboBoxCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCpfActionPerformed
        //Quando clica nas opções de quartos será executado mudança no valor
       
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCpfActionPerformed

    private void jComboBoxDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDepartamentoActionPerformed

    private void jTextFieldPisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPisActionPerformed

    private void jTextFieldData_de_admissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldData_de_admissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldData_de_admissaoActionPerformed

    private void jTextFieldMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMatriculaActionPerformed

    private void jComboBoxCpfItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxCpfItemStateChanged
        this.controller.atualizaCpf();
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCpfItemStateChanged

    private void jComboBoxDepartamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxDepartamentoItemStateChanged
       this.controller.atualizaId_dept();
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDepartamentoItemStateChanged

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
            java.util.logging.Logger.getLogger(CadastroFuncView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadastroFuncView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CadastroFuncView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public JLabel getDEPARTAMENTO() {
        return DEPARTAMENTO;
    }

    public void setDEPARTAMENTO(JLabel DEPARTAMENTO) {
        this.DEPARTAMENTO = DEPARTAMENTO;
    }

    public JButton getjButtonProximo() {
        return jButtonProximo;
    }

    public void setjButtonProximo(JButton jButtonProximo) {
        this.jButtonProximo = jButtonProximo;
    }

    public JComboBox<String> getjComboBoxCpf() {
        return jComboBoxCpf;
    }

    public void setjComboBoxCpf(JComboBox<String> jComboBoxCpf) {
        this.jComboBoxCpf = jComboBoxCpf;
    }

    public JComboBox<String> getjComboBoxDepartamento() {
        return jComboBoxDepartamento;
    }

    public void setjComboBoxDepartamento(JComboBox<String> jComboBoxDepartamento) {
        this.jComboBoxDepartamento = jComboBoxDepartamento;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabelCNH() {
        return jLabelCNH;
    }

    public void setjLabelCNH(JLabel jLabelCNH) {
        this.jLabelCNH = jLabelCNH;
    }

    public JLabel getjLabelCNH1() {
        return jLabelCNH1;
    }

    public void setjLabelCNH1(JLabel jLabelCNH1) {
        this.jLabelCNH1 = jLabelCNH1;
    }

    public JLabel getjLabelCPF() {
        return jLabelCPF;
    }

    public void setjLabelCPF(JLabel jLabelCPF) {
        this.jLabelCPF = jLabelCPF;
    }

    public JLabel getjLabelCadastroFuncionario() {
        return jLabelCadastroFuncionario;
    }

    public void setjLabelCadastroFuncionario(JLabel jLabelCadastroFuncionario) {
        this.jLabelCadastroFuncionario = jLabelCadastroFuncionario;
    }

    public JLabel getjLabelNome() {
        return jLabelNome;
    }

    public void setjLabelNome(JLabel jLabelNome) {
        this.jLabelNome = jLabelNome;
    }

    public JLabel getjLabelNome1() {
        return jLabelNome1;
    }

    public void setjLabelNome1(JLabel jLabelNome1) {
        this.jLabelNome1 = jLabelNome1;
    }

    public JLabel getjLabelPis() {
        return jLabelPis;
    }

    public void setjLabelPis(JLabel jLabelPis) {
        this.jLabelPis = jLabelPis;
    }

    public JLabel getjLabelPis1() {
        return jLabelPis1;
    }

    public void setjLabelPis1(JLabel jLabelPis1) {
        this.jLabelPis1 = jLabelPis1;
    }

    public JTextField getjTextFieldCNH() {
        return jTextFieldCNH;
    }

    public void setjTextFieldCNH(JTextField jTextFieldCNH) {
        this.jTextFieldCNH = jTextFieldCNH;
    }

    public JTextField getjTextFieldData_de_admissao() {
        return jTextFieldData_de_admissao;
    }

    public void setjTextFieldData_de_admissao(JTextField jTextFieldData_de_admissao) {
        this.jTextFieldData_de_admissao = jTextFieldData_de_admissao;
    }

    public JTextField getjTextFieldId_dept() {
        return jTextFieldId_dept;
    }

    public void setjTextFieldId_dept(JTextField jTextFieldId_dept) {
        this.jTextFieldId_dept = jTextFieldId_dept;
    }

    public JTextField getjTextFieldNome() {
        return jTextFieldNome;
    }

    public void setjTextFieldNome(JTextField jTextFieldNome) {
        this.jTextFieldNome = jTextFieldNome;
    }

    public JTextField getjTextFieldPis() {
        return jTextFieldPis;
    }

    public void setjTextFieldPis(JTextField jTextFieldPis) {
        this.jTextFieldPis = jTextFieldPis;
    }

    public JLabel getjLabelMatricula() {
        return jLabelMatricula;
    }

    public void setjLabelMatricula(JLabel jLabelMatricula) {
        this.jLabelMatricula = jLabelMatricula;
    }

    public JTextField getjTextFieldMatricula() {
        return jTextFieldMatricula;
    }

    public void setjTextFieldMatricula(JTextField jTextFieldMatricula) {
        this.jTextFieldMatricula = jTextFieldMatricula;
    }

   private void iniciar() throws SQLException{
       this.controller.atualizaNome();
       this.controller.atualizaDepartamento();
   }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DEPARTAMENTO;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JComboBox<String> jComboBoxCpf;
    private javax.swing.JComboBox<String> jComboBoxDepartamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCNH;
    private javax.swing.JLabel jLabelCNH1;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCadastroFuncionario;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNome1;
    private javax.swing.JLabel jLabelPis;
    private javax.swing.JLabel jLabelPis1;
    private javax.swing.JTextField jTextFieldCNH;
    private javax.swing.JTextField jTextFieldData_de_admissao;
    private javax.swing.JTextField jTextFieldId_dept;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPis;
    // End of variables declaration//GEN-END:variables
}
