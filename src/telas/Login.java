/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author Bruno
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Final
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
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
        LoginTxtSenha = new javax.swing.JPasswordField();
        LoginLblSenha = new javax.swing.JLabel();
        javax.swing.JTextField LoginTxtLogin = new javax.swing.JTextField();
        LoginLblLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CineMarcus");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon.png")).getImage());

        LoginPanel.setBackground(new java.awt.Color(255, 255, 255));

        LoginImgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginImgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        LoginBtnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
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

        LoginTxtSenha.setForeground(new java.awt.Color(204, 204, 204));
        LoginTxtSenha.setText("senhasenha");
        LoginTxtSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        LoginLblSenha.setFont(new java.awt.Font("Cinemark", 0, 20)); // NOI18N
        LoginLblSenha.setForeground(new java.awt.Color(255, 0, 0));
        LoginLblSenha.setText("Senha");

        LoginTxtLogin.setForeground(new java.awt.Color(153, 153, 153));
        LoginTxtLogin.setText("Nome de usuário/Email");
        LoginTxtLogin.setToolTipText("");
        LoginTxtLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        LoginTxtLogin.setName(""); // NOI18N
        LoginTxtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginTxtLoginActionPerformed(evt);
            }
        });

        LoginLblLogin.setFont(new java.awt.Font("Cinemark", 0, 20)); // NOI18N
        LoginLblLogin.setForeground(new java.awt.Color(255, 0, 0));
        LoginLblLogin.setText("Login");

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginImgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LoginPanelLayout.createSequentialGroup()
                            .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LoginLblSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LoginLblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LoginTxtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LoginTxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(51, 51, 51))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                            .addGap(146, 146, 146)
                            .addComponent(LoginBtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginImgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginLblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginTxtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginLblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(LoginTxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(LoginBtnRegistrar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnRegistrarActionPerformed
        new ClienteOuFuncionario().setVisible(true);
    }//GEN-LAST:event_LoginBtnRegistrarActionPerformed

    private void LoginTxtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginTxtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginTxtLoginActionPerformed

    private void LoginBtnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBtnRegistrarMouseEntered
        LoginBtnRegistrar.setBackground(new java.awt.Color(255, 0, 0));
    }//GEN-LAST:event_LoginBtnRegistrarMouseEntered

    private void LoginBtnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBtnRegistrarMouseExited
        LoginBtnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_LoginBtnRegistrarMouseExited

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBtnRegistrar;
    private javax.swing.JLabel LoginImgLogo;
    private javax.swing.JLabel LoginLblLogin;
    private javax.swing.JLabel LoginLblSenha;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPasswordField LoginTxtSenha;
    // End of variables declaration//GEN-END:variables
}