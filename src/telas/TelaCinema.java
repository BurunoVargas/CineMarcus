/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import cineMarcus.Filme;
import cineMarcus.FilmeController;
import cineMarcus.SessaoController;
import java.awt.Cursor;
import java.awt.Dimension;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author ruan
 */
public class TelaCinema extends javax.swing.JFrame {
    private final FilmeController filmeController;
    private final SessaoController sessaoController;
    private final List<Filme> listaFilmes;
    /**
     * Creates new form TelaCinema
     */
    public TelaCinema() {
        
        initComponents();
        filmeController = FilmeController.getInstance();
        sessaoController = SessaoController.getInstance();
        listaFilmes = filmeController.getFilmes().parallelStream().collect(Collectors.toList());
        carregarFilmes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void carregarFilmes(){
        pnlFilmes.removeAll();
        
        for (int i = 0; i < listaFilmes.size(); i++) {          
            Filme filme = listaFilmes.get(i);

            int x = 25 + (167 * (i / 2));
            int y = 25 + (209 * (i % 2));
            
            JLabel labelFilme = new JLabel();
            TelaCinema self = this;
            labelFilme.setIcon(new ImageIcon(filme.getPoster()));
            labelFilme.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    new TelaFilme(filme, self).setVisible(true);
                }
            });
            labelFilme.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            labelFilme.setBounds(x, y, 117, 150);
            pnlFilmes.add(labelFilme);
            
            if (i == listaFilmes.size() - 1) {
                pnlFilmes.setPreferredSize(new Dimension(x + 132, 409));
            }
            
            pnlFilmes.revalidate();
            pnlFilmes.repaint();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInfo = new javax.swing.JButton();
        pnlFilmes = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnInfo.setText("Minhas Informações");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        pnlFilmes.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jLabel2.setText("Filmes em Cartaz");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 289, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(207, 207, 207)
                        .addComponent(btnInfo))
                    .addComponent(pnlFilmes))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInfo)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlFilmes, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        new TelaMinhaInfo().setVisible(true);
    }//GEN-LAST:event_btnInfoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCinema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCinema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCinema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCinema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCinema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInfo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane pnlFilmes;
    // End of variables declaration//GEN-END:variables
}
