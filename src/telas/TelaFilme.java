/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import cineMarcus.Filme;
import cineMarcus.Sessao;
import cineMarcus.SessaoController;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */

public class TelaFilme extends javax.swing.JFrame {
    private final List<Sessao> listaSessoes;
    private final SessaoController sessaoController;
    private final List<Boolean> listaSelected;

    
    private final Filme filme;
    /**
     * Creates new form TelaFilme
     * @param filme
     */
    public TelaFilme(Filme filme, TelaCinema cine) {
        initComponents();
        this.filme = filme;
        sessaoController = SessaoController.getInstance();
        listaSelected = new ArrayList<Boolean>(Collections.nCopies(90, false));
        this.listaSessoes = sessaoController.getSessoes().parallelStream().collect(Collectors.toList());
        carregaPoster();
        carregaLabels();
        btnComprar.setVisible(false);
    }
    
    public String transformaAssento(int idx){
        // 6
        int y = (idx/15)+1;
        int x = idx%15;
        
        if(x==0)x=y*15;
        
        return ('A'+y-1)+Integer.toString(x);
    }
    
    
    public void carregaLabels(){
        lblFilme.removeAll();
        lblFilme.setText(filme.getNome());
        
        txtSinopse.removeAll();
        txtSinopse.setText(filme.getSinopse());
        
        txtGenero.removeAll();
        txtGenero.setText(filme.getGenero());
        
        txtClass.removeAll();
        txtClass.setText(Integer.toString(filme.getClassificacao()));
        
        cmbSessoes.removeAllItems();
        cmbSessoes.addItem("Selecione uma Sessão");
        for (int i = 0; i < listaSessoes.size(); i++) {
            if(Objects.equals(listaSessoes.get(i).getFilmeId(), filme.getId())){
                cmbSessoes.addItem((listaSessoes.get(i).getData()));
            }
            
        }
    }
    public void carregaPoster(){
            JLabel labelFilme = new JLabel();
            labelFilme.setIcon(new ImageIcon(filme.getPoster()));
            labelFilme.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            labelFilme.setBounds(600, 25, 117, 150);
            pnlFilmes.add(labelFilme);
            
            pnlFilmes.revalidate();
            pnlFilmes.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void trocarAssento(JLabel assento, int idx){
        String imagem = "";
        if(listaSelected.get(idx)){
            
            assento.setIcon(new ImageIcon("src/imagens/assentoazul.png"));
            listaSelected.set(idx, false);
        }else{
            assento.setIcon(new ImageIcon("src/imagens/assentolaranja.png"));
            listaSelected.set(idx, true);
        }
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        pnlFilmes = new javax.swing.JPanel();
        lblFilme = new javax.swing.JLabel();
        cmbSessoes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSinopse = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        txtClass = new javax.swing.JTextField();
        pnlSessao = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSala = new javax.swing.JTextField();
        checkDub = new javax.swing.JCheckBox();
        pnlAssentos = new javax.swing.JPanel();
        btnComprar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnProcurar = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlFilmes.setBackground(new java.awt.Color(255, 255, 255));

        lblFilme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFilme.setText("Filme");

        cmbSessoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Sinopse");

        txtSinopse.setEditable(false);
        txtSinopse.setColumns(20);
        txtSinopse.setRows(5);
        jScrollPane1.setViewportView(txtSinopse);

        jLabel3.setText("Genero");

        jLabel4.setText("Classificação");

        txtGenero.setEditable(false);
        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });

        txtClass.setEditable(false);
        txtClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClassActionPerformed(evt);
            }
        });

        jLabel1.setText("Preco");

        txtPreco.setEditable(false);
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        jLabel5.setText("Data");

        txtData.setEditable(false);

        jLabel6.setText("Sala");

        txtSala.setEditable(false);
        txtSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalaActionPerformed(evt);
            }
        });

        checkDub.setText("Dublado");
        checkDub.setContentAreaFilled(false);
        checkDub.setEnabled(false);
        checkDub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDubActionPerformed(evt);
            }
        });

        pnlAssentos.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout pnlAssentosLayout = new javax.swing.GroupLayout(pnlAssentos);
        pnlAssentos.setLayout(pnlAssentosLayout);
        pnlAssentosLayout.setHorizontalGroup(
            pnlAssentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlAssentosLayout.setVerticalGroup(
            pnlAssentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        jLabel7.setText("Assentos");

        javax.swing.GroupLayout pnlSessaoLayout = new javax.swing.GroupLayout(pnlSessao);
        pnlSessao.setLayout(pnlSessaoLayout);
        pnlSessaoLayout.setHorizontalGroup(
            pnlSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSessaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkDub)
                    .addGroup(pnlSessaoLayout.createSequentialGroup()
                        .addGroup(pnlSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(pnlSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSala, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(pnlSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSessaoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSessaoLayout.createSequentialGroup()
                                .addComponent(btnComprar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(pnlAssentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSessaoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(148, 148, 148))))
        );
        pnlSessaoLayout.setVerticalGroup(
            pnlSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSessaoLayout.createSequentialGroup()
                .addGroup(pnlSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSessaoLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(pnlSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlSessaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(checkDub)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSessaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlAssentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(btnComprar)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btnProcurar.setText("Procurar");
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFilmesLayout = new javax.swing.GroupLayout(pnlFilmes);
        pnlFilmes.setLayout(pnlFilmesLayout);
        pnlFilmesLayout.setHorizontalGroup(
            pnlFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFilmesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFilmesLayout.createSequentialGroup()
                        .addGroup(pnlFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlFilmesLayout.createSequentialGroup()
                        .addGroup(pnlFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProcurar)
                            .addGroup(pnlFilmesLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbSessoes, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(pnlSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlFilmesLayout.setVerticalGroup(
            pnlFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFilmesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFilme)
                .addGap(27, 27, 27)
                .addGroup(pnlFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFilmesLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFilmesLayout.createSequentialGroup()
                        .addGroup(pnlFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(cmbSessoes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnProcurar))
                    .addComponent(pnlSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlFilmes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        int idx = cmbSessoes.getSelectedIndex();
        String txt = cmbSessoes.getItemAt(idx);

        if(txt.equals("Selecione uma Sessão")){
            JOptionPane.showMessageDialog(null, "Selecione uma Sessão válida", "Erro", JOptionPane.ERROR_MESSAGE);
        }else{
            btnComprar.setVisible(true);
            for (int i = 0; i < listaSessoes.size(); i++) {
                Sessao sess = listaSessoes.get(i);
                if(Objects.equals(listaSessoes.get(i).getFilmeId(), filme.getId()) && listaSessoes.get(i).getData().equals(txt)){

                    txtData.setText(txt);
                    txtPreco.setText(Double.toString(sess.getPreco()));
                    txtSala.setText(Integer.toString(sess.getSala()));
                    if(sess.isDub()){
                        checkDub.setSelected(true);
                    }else{
                        checkDub.setSelected(false);
                    }

                }
                
                
            }
        }
        
        // Insere os assentos
        
        for(int i=0; i<listaSessoes.size();i++){
            Sessao sess = listaSessoes.get(i);
            
            if(Objects.equals(sess.getFilmeId(), filme.getId()) && sess.getData().equals(txt)){
                List<Boolean> listaAssentos = sess.getAssentos();
                
                int x = 0;
                int y = 35;
                boolean pulou=false;
                for(int j=1; j<=90; j++){
                    
                    // Calcula as coordenadas
                    
                    // Pula Linha
                    
                    if(j%15==0){
                        x+=20;
                        pulou=true;
                        final JLabel labelAssento = new JLabel();
                        if(listaAssentos.get(j-1)==false){
                            labelAssento.setIcon(new ImageIcon("src/imagens/assentoazul.png")); 
                        }else{
                            labelAssento.setIcon(new ImageIcon("src/imagens/assentovermelho.png")); 
                        }
                        
                        labelAssento.setBounds(x, y, 16, 16);
                        
                        if(!listaAssentos.get(j-1)){
                            final int idxassento = j-1;
                            labelAssento.addMouseListener(new java.awt.event.MouseAdapter() {
                                 @Override
                                 public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    final String imagem;
                                    if(listaSelected.get(idxassento)){
                                        imagem = "src/imagens/assentoazul.png";
                                        listaSelected.set(idxassento, false);
                                    }else{
                                        imagem = "src/imagens/assentolaranja.png";
                                        listaSelected.set(idxassento, true);
                                    }  
                                     labelAssento.setIcon(new ImageIcon(imagem)); 
                                 }
                             }); 
                        } 
                        
                        pnlAssentos.add(labelAssento);
                        pnlAssentos.revalidate();
                        pnlAssentos.repaint();
                        
                    }else{
                        if(pulou){
                            x=20;
                            y+=25;
                            pulou=false;
                        }else{
                            x+=20;
                        }

                        JLabel labelAssento = new JLabel();
                        if(listaAssentos.get(j-1)==false){
                            labelAssento.setIcon(new ImageIcon("src/imagens/assentoazul.png")); 
                        }else{
                            labelAssento.setIcon(new ImageIcon("src/imagens/assentovermelho.png")); 
                        }
                        labelAssento.setBounds(x, y, 16, 16);
                        
                        
                        if(!listaAssentos.get(j-1)){
                            final int idxassento = j-1;
                            labelAssento.addMouseListener(new java.awt.event.MouseAdapter() {
                                 @Override
                                 public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    final String imagem;
                                    if(listaSelected.get(idxassento)){
                                        imagem = "src/imagens/assentoazul.png";
                                        listaSelected.set(idxassento, false);
                                    }else{
                                        imagem = "src/imagens/assentolaranja.png";
                                        listaSelected.set(idxassento, true);
                                    }  
                                     labelAssento.setIcon(new ImageIcon(imagem)); 
                                    
                                 }
                             }); 
                        }     
                        
                        
                        pnlAssentos.add(labelAssento);
                        pnlAssentos.revalidate();
                        pnlAssentos.repaint();
                    }
                    
                    
                }
                
                
            }
        }
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void checkDubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkDubActionPerformed

    private void txtSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void txtClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClassActionPerformed

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed

        boolean flag=false;
        ArrayList<String> selecionado = new ArrayList<String>();
        
        for(boolean item: listaSelected) {
                System.out.println(item);
            }
        
        
        for(int i=0; i<listaSelected.size(); i++){
            if(listaSelected.get(i)){
                selecionado.add(transformaAssento(i+1));
                flag = true;
            }
        }
        if(!flag){
            JOptionPane.showMessageDialog(null, "Selecione ao menos um assento", "Erro", JOptionPane.ERROR_MESSAGE);
        }else{
            for(String item: selecionado) {
                System.out.println(item);
            }
        }
            
            
    }//GEN-LAST:event_btnComprarActionPerformed

       
    /**
     * 
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
            java.util.logging.Logger.getLogger(TelaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JCheckBox checkDub;
    private javax.swing.JComboBox<String> cmbSessoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFilme;
    private javax.swing.JPanel pnlAssentos;
    private javax.swing.JPanel pnlFilmes;
    private javax.swing.JPanel pnlSessao;
    private javax.swing.JTextField txtClass;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtSala;
    private javax.swing.JTextArea txtSinopse;
    // End of variables declaration//GEN-END:variables
}
