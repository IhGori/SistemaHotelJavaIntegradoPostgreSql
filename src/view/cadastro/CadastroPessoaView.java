/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.cadastro;

import controller.cadastro.CadastroPessoaController;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 * @author User
 */
public class CadastroPessoaView extends javax.swing.JFrame {

    /**
     * Creates new form CadastroPessoaView
     */
   
    private final CadastroPessoaController controller;
    
    public CadastroPessoaView() {
        initComponents();
        controller = new CadastroPessoaController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSexo = new javax.swing.JLabel();
        jTextFieldSexo = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldDDD = new javax.swing.JTextField();
        jLabelDDD = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldNumero_telefone = new javax.swing.JTextField();
        jTextFieldCEP = new javax.swing.JTextField();
        jLabelCEP = new javax.swing.JLabel();
        jTextFieldNumero_residencia = new javax.swing.JTextField();
        jLabelNumero = new javax.swing.JLabel();
        jLabelDataNascimento = new javax.swing.JLabel();
        jTextFieldDataNascimento = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldLogradouro = new javax.swing.JTextField();
        jLabelCPF = new javax.swing.JLabel();
        jTextFieldCPF = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jTextFieldMunicipio = new javax.swing.JTextField();
        jLabelMunicipio = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldEstado = new javax.swing.JTextField();
        jLabelMunicipio1 = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonProximo = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jLabelCadastroFuncionario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNome1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSexo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSexo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSexo.setText("SEXO");
        getContentPane().add(jLabelSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));
        getContentPane().add(jTextFieldSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 230, 40));

        jLabelEndereco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelEndereco.setForeground(new java.awt.Color(102, 102, 102));
        jLabelEndereco.setText("LOGRADOURO");
        getContentPane().add(jLabelEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, -1, -1));
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 230, 40));
        getContentPane().add(jTextFieldDDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 50, 40));

        jLabelDDD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelDDD.setForeground(new java.awt.Color(102, 102, 102));
        jLabelDDD.setText("DDD");
        getContentPane().add(jLabelDDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        jLabelTelefone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTelefone.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTelefone.setText("TELEFONE");
        getContentPane().add(jLabelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));

        jTextFieldNumero_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumero_telefoneActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNumero_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 230, 40));
        getContentPane().add(jTextFieldCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 200, 40));

        jLabelCEP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCEP.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCEP.setText("CEP");
        getContentPane().add(jLabelCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));
        getContentPane().add(jTextFieldNumero_residencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 100, 40));

        jLabelNumero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelNumero.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNumero.setText("N??MERO");
        getContentPane().add(jLabelNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, -1, -1));

        jLabelDataNascimento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelDataNascimento.setForeground(new java.awt.Color(102, 102, 102));
        jLabelDataNascimento.setText("DATA NASCIMENTO ");
        getContentPane().add(jLabelDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        jTextFieldDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataNascimentoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 230, 40));

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(102, 102, 102));
        jLabelEmail.setText("EMAIL");
        getContentPane().add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));
        getContentPane().add(jTextFieldLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 350, 40));

        jLabelCPF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCPF.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCPF.setText("CPF");
        getContentPane().add(jLabelCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, -1, -1));
        getContentPane().add(jTextFieldCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 230, 40));
        getContentPane().add(jTextFieldBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 200, 40));
        getContentPane().add(jTextFieldMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 200, 40));

        jLabelMunicipio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelMunicipio.setForeground(new java.awt.Color(102, 102, 102));
        jLabelMunicipio.setText("MUNICIPIO");
        getContentPane().add(jLabelMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, -1, -1));

        jLabelBairro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelBairro.setForeground(new java.awt.Color(102, 102, 102));
        jLabelBairro.setText("BAIRRO");
        getContentPane().add(jLabelBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        jTextFieldEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 200, 40));

        jLabelMunicipio1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelMunicipio1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelMunicipio1.setText("ESTADO");
        getContentPane().add(jLabelMunicipio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, -1, -1));

        jLabelNome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNome.setText("NOME");
        getContentPane().add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 230, 40));

        jButtonProximo.setText("SALVAR");
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonProximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 610, 170, 80));

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jLabelUsuario.setText("USU??RIO");
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 600, -1, 20));
        getContentPane().add(jPasswordFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 630, 230, 40));
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 630, 230, 40));

        jLabelSenha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSenha.setText("SENHA");
        getContentPane().add(jLabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, -1, 20));

        jLabelCadastroFuncionario.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelCadastroFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCadastroFuncionario.setText("CADASTRO PESSOA");
        getContentPane().add(jLabelCadastroFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

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
            controller.salvaPessoa();
        } catch (ParseException ex) {
            Logger.getLogger(CadastroPessoaView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataNascimentoActionPerformed

    private void jTextFieldEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstadoActionPerformed

    private void jTextFieldNumero_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumero_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumero_telefoneActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroPessoaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPessoaView().setVisible(true);
            }
        });
    }

    public JButton getjButtonProximo() {
        return jButtonProximo;
    }

    public void setjButtonProximo(JButton jButtonProximo) {
        this.jButtonProximo = jButtonProximo;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabelBairro() {
        return jLabelBairro;
    }

    public void setjLabelBairro(JLabel jLabelBairro) {
        this.jLabelBairro = jLabelBairro;
    }

    public JLabel getjLabelCEP() {
        return jLabelCEP;
    }

    public void setjLabelCEP(JLabel jLabelCEP) {
        this.jLabelCEP = jLabelCEP;
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

    public JLabel getjLabelDDD() {
        return jLabelDDD;
    }

    public void setjLabelDDD(JLabel jLabelDDD) {
        this.jLabelDDD = jLabelDDD;
    }

    public JLabel getjLabelDataNascimento() {
        return jLabelDataNascimento;
    }

    public void setjLabelDataNascimento(JLabel jLabelDataNascimento) {
        this.jLabelDataNascimento = jLabelDataNascimento;
    }

    public JLabel getjLabelEmail() {
        return jLabelEmail;
    }

    public void setjLabelEmail(JLabel jLabelEmail) {
        this.jLabelEmail = jLabelEmail;
    }

    public JLabel getjLabelEndereco() {
        return jLabelEndereco;
    }

    public void setjLabelEndereco(JLabel jLabelEndereco) {
        this.jLabelEndereco = jLabelEndereco;
    }

    public JLabel getjLabelMunicipio() {
        return jLabelMunicipio;
    }

    public void setjLabelMunicipio(JLabel jLabelMunicipio) {
        this.jLabelMunicipio = jLabelMunicipio;
    }

    public JLabel getjLabelMunicipio1() {
        return jLabelMunicipio1;
    }

    public void setjLabelMunicipio1(JLabel jLabelMunicipio1) {
        this.jLabelMunicipio1 = jLabelMunicipio1;
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

    public JLabel getjLabelNumero() {
        return jLabelNumero;
    }

    public void setjLabelNumero(JLabel jLabelNumero) {
        this.jLabelNumero = jLabelNumero;
    }

    public JLabel getjLabelSenha() {
        return jLabelSenha;
    }

    public void setjLabelSenha(JLabel jLabelSenha) {
        this.jLabelSenha = jLabelSenha;
    }

    public JLabel getjLabelSexo() {
        return jLabelSexo;
    }

    public void setjLabelSexo(JLabel jLabelSexo) {
        this.jLabelSexo = jLabelSexo;
    }

    public JLabel getjLabelTelefone() {
        return jLabelTelefone;
    }

    public void setjLabelTelefone(JLabel jLabelTelefone) {
        this.jLabelTelefone = jLabelTelefone;
    }

    public JLabel getjLabelUsuario() {
        return jLabelUsuario;
    }

    public void setjLabelUsuario(JLabel jLabelUsuario) {
        this.jLabelUsuario = jLabelUsuario;
    }

    public JPasswordField getjPasswordFieldSenha() {
        return jPasswordFieldSenha;
    }

    public void setjPasswordFieldSenha(JPasswordField jPasswordFieldSenha) {
        this.jPasswordFieldSenha = jPasswordFieldSenha;
    }

    public JTextField getjTextFieldBairro() {
        return jTextFieldBairro;
    }

    public void setjTextFieldBairro(JTextField jTextFieldBairro) {
        this.jTextFieldBairro = jTextFieldBairro;
    }

    public JTextField getjTextFieldCEP() {
        return jTextFieldCEP;
    }

    public void setjTextFieldCEP(JTextField jTextFieldCEP) {
        this.jTextFieldCEP = jTextFieldCEP;
    }

    public JTextField getjTextFieldCPF() {
        return jTextFieldCPF;
    }

    public void setjTextFieldCPF(JTextField jTextFieldCPF) {
        this.jTextFieldCPF = jTextFieldCPF;
    }

    public JTextField getjTextFieldDDD() {
        return jTextFieldDDD;
    }

    public void setjTextFieldDDD(JTextField jTextFieldDDD) {
        this.jTextFieldDDD = jTextFieldDDD;
    }

    public JTextField getjTextFieldDataNascimento() {
        return jTextFieldDataNascimento;
    }

    public void setjTextFieldDataNascimento(JTextField jTextFieldDataNascimento) {
        this.jTextFieldDataNascimento = jTextFieldDataNascimento;
    }

    public JTextField getjTextFieldEmail() {
        return jTextFieldEmail;
    }

    public void setjTextFieldEmail(JTextField jTextFieldEmail) {
        this.jTextFieldEmail = jTextFieldEmail;
    }

    public JTextField getjTextFieldEstado() {
        return jTextFieldEstado;
    }

    public void setjTextFieldEstado(JTextField jTextFieldEstado) {
        this.jTextFieldEstado = jTextFieldEstado;
    }

    public JTextField getjTextFieldLogradouro() {
        return jTextFieldLogradouro;
    }

    public void setjTextFieldLogradouro(JTextField jTextFieldLogradouro) {
        this.jTextFieldLogradouro = jTextFieldLogradouro;
    }

    public JTextField getjTextFieldMunicipio() {
        return jTextFieldMunicipio;
    }

    public void setjTextFieldMunicipio(JTextField jTextFieldMunicipio) {
        this.jTextFieldMunicipio = jTextFieldMunicipio;
    }

    public JTextField getjTextFieldNome() {
        return jTextFieldNome;
    }

    public void setjTextFieldNome(JTextField jTextFieldNome) {
        this.jTextFieldNome = jTextFieldNome;
    }

    public JTextField getjTextFieldNumero_residencia() {
        return jTextFieldNumero_residencia;
    }

    public void setjTextFieldNumero_residencia(JTextField jTextFieldNumero_residencia) {
        this.jTextFieldNumero_residencia = jTextFieldNumero_residencia;
    }

    public JTextField getjTextFieldNumero_telefone() {
        return jTextFieldNumero_telefone;
    }

    public void setjTextFieldNumero_telefone(JTextField jTextFieldNumero_telefone) {
        this.jTextFieldNumero_telefone = jTextFieldNumero_telefone;
    }

    public JTextField getjTextFieldSexo() {
        return jTextFieldSexo;
    }

    public void setjTextFieldSexo(JTextField jTextFieldSexo) {
        this.jTextFieldSexo = jTextFieldSexo;
    }

    public JTextField getjTextFieldUsuario() {
        return jTextFieldUsuario;
    }

    public void setjTextFieldUsuario(JTextField jTextFieldUsuario) {
        this.jTextFieldUsuario = jTextFieldUsuario;
    }


  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCadastroFuncionario;
    private javax.swing.JLabel jLabelDDD;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelMunicipio;
    private javax.swing.JLabel jLabelMunicipio1;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNome1;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCEP;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldDDD;
    private javax.swing.JTextField jTextFieldDataNascimento;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldLogradouro;
    private javax.swing.JTextField jTextFieldMunicipio;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero_residencia;
    private javax.swing.JTextField jTextFieldNumero_telefone;
    private javax.swing.JTextField jTextFieldSexo;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
