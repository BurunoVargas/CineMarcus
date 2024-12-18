/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import cineMarcus.Login;
import cineMarcus.TipoPessoa;
import cineMarcus.exceptions.InvalidPasswordException;
import cineMarcus.exceptions.InvalidUserException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class TelaLogin extends javax.swing.JFrame {

    final private Login login;
    /**
     * Inicializa classe
     */
    public TelaLogin() {
        initComponents();
        setLocationRelativeTo(null);
        login = Login.getInstance();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPanel = new javax.swing.JPanel();
        LoginImgLogo = new javax.swing.JLabel();
        LoginBtnRegistrar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        LoginLblSenha = new javax.swing.JLabel();
        LoginLblLogin = new javax.swing.JLabel();
        btnLogar = new javax.swing.JButton();
        txtLogin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CineMarcus - Login");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon.png")).getImage());

        LoginPanel.setBackground(new java.awt.Color(255, 255, 255));

        LoginImgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginImgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        LoginBtnRegistrar.setBackground(new java.awt.Color(204, 204, 255));
        LoginBtnRegistrar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        LoginBtnRegistrar.setText("Não tem uma conta? Registre-se");
        LoginBtnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginBtnRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginBtnRegistrarMouseExited(evt);
            }
        });
        LoginBtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnRegistrarActionPerformed(evt);
            }
        });

        txtSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        LoginLblSenha.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        LoginLblSenha.setForeground(new java.awt.Color(255, 0, 0));
        LoginLblSenha.setText("Senha:");

        LoginLblLogin.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        LoginLblLogin.setForeground(new java.awt.Color(255, 0, 0));
        LoginLblLogin.setText("Login:");

        btnLogar.setText("Logar");
        btnLogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogarMouseExited(evt);
            }
        });
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });

        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LoginLblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginLblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addContainerGap(33, Short.MAX_VALUE)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LoginImgLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginBtnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(btnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LoginImgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginLblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginLblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnLogar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(LoginBtnRegistrar)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnRegistrarActionPerformed
        new ClienteOuFuncionario().setVisible(true);
    }//GEN-LAST:event_LoginBtnRegistrarActionPerformed

    private void LoginBtnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBtnRegistrarMouseEntered
        LoginBtnRegistrar.setBackground(new java.awt.Color(255, 0, 0));
    }//GEN-LAST:event_LoginBtnRegistrarMouseEntered

    private void LoginBtnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBtnRegistrarMouseExited
        LoginBtnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_LoginBtnRegistrarMouseExited

    /*
    *   Função responsável por verificar login do usuário, e caso for válido
    *   irá entrar nas outras classes
    */
    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed
        String nomeOuEmail = txtLogin.getText();
        String senha = new String(txtSenha.getPassword());
        
        if(nomeOuEmail.equals("") || senha.equals("")) {
          JOptionPane.showMessageDialog(null, "Nome de usuário e/ou senha não informados", "Erro", JOptionPane.PLAIN_MESSAGE);

        }else{
                try {
                    login.validaLogin(nomeOuEmail, senha);
                    JOptionPane.showMessageDialog(null, "Login efetivado com sucesso");
                    
                    if(login.getUsuarioLogado().getTipo() == TipoPessoa.ADMIN) {
                       new PainelDoAdmin().setVisible(true);
                     } else {
                        new TelaCinema().setVisible(true);
                    }
                    
                    dispose();
            } catch (InvalidUserException | InvalidPasswordException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
         }

    }//GEN-LAST:event_btnLogarActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void btnLogarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogarMouseEntered
        btnLogar.setBackground(new java.awt.Color(255, 0, 0));
    }//GEN-LAST:event_btnLogarMouseEntered

    private void btnLogarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogarMouseExited
        btnLogar.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnLogarMouseExited

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBtnRegistrar;
    private javax.swing.JLabel LoginImgLogo;
    private javax.swing.JLabel LoginLblLogin;
    private javax.swing.JLabel LoginLblSenha;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JButton btnLogar;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
