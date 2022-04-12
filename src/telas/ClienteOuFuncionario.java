/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author Bruno
 */
public class ClienteOuFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form ClienteOuFuncionario
     */
    public ClienteOuFuncionario() {
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

        COFpanel = new javax.swing.JPanel();
        COFimgLogo = new javax.swing.JLabel();
        COFBtnCliente = new javax.swing.JButton();
        COFBtnFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CineMarcus");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon.png")).getImage());

        COFpanel.setBackground(new java.awt.Color(255, 255, 255));

        COFimgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        COFimgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        COFBtnCliente.setBackground(new java.awt.Color(255, 255, 255));
        COFBtnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente.png"))); // NOI18N
        COFBtnCliente.setText("Cliente");
        COFBtnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        COFBtnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                COFBtnClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                COFBtnClienteMouseExited(evt);
            }
        });

        COFBtnFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        COFBtnFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionario.png"))); // NOI18N
        COFBtnFuncionario.setText("Funcionário");
        COFBtnFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                COFBtnFuncionarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                COFBtnFuncionarioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout COFpanelLayout = new javax.swing.GroupLayout(COFpanel);
        COFpanel.setLayout(COFpanelLayout);
        COFpanelLayout.setHorizontalGroup(
            COFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(COFpanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(COFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(COFimgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(COFpanelLayout.createSequentialGroup()
                        .addComponent(COFBtnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(COFBtnFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        COFpanelLayout.setVerticalGroup(
            COFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(COFpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(COFimgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addGroup(COFpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(COFBtnFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(COFBtnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(COFpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(COFpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void COFBtnClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COFBtnClienteMouseEntered
        COFBtnCliente.setBackground(new java.awt.Color(255, 0, 0));
    }//GEN-LAST:event_COFBtnClienteMouseEntered

    private void COFBtnClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COFBtnClienteMouseExited

        COFBtnCliente.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_COFBtnClienteMouseExited

    private void COFBtnFuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COFBtnFuncionarioMouseEntered

        COFBtnFuncionario.setBackground(new java.awt.Color(255, 0, 0));
    }//GEN-LAST:event_COFBtnFuncionarioMouseEntered

    private void COFBtnFuncionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COFBtnFuncionarioMouseExited

        COFBtnFuncionario.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_COFBtnFuncionarioMouseExited

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
            java.util.logging.Logger.getLogger(ClienteOuFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteOuFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteOuFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteOuFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteOuFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton COFBtnCliente;
    private javax.swing.JButton COFBtnFuncionario;
    private javax.swing.JLabel COFimgLogo;
    private javax.swing.JPanel COFpanel;
    // End of variables declaration//GEN-END:variables
}
