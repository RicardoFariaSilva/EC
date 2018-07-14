/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import javax.swing.ImageIcon;

/**
 *
 * @author 0dr4c1r
 */
public class TelaElasticidade extends javax.swing.JFrame {

    /**
     * Creates new form TelaElasticidade
     */
    public TelaElasticidade() {
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

        lblTitulo = new javax.swing.JLabel();
        lblDemanda = new javax.swing.JLabel();
        lblOferta = new javax.swing.JLabel();
        dropDemanda = new javax.swing.JComboBox<>();
        dropOferta = new javax.swing.JComboBox<>();
        btnVoltar = new javax.swing.JToggleButton();
        painelGrafico = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblTitulo.setText("Elasticidade de preço");

        lblDemanda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDemanda.setText("Demanda:");

        lblOferta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblOferta.setText("Oferta:");

        dropDemanda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Igual à 0", "Menor que 1", "Igual à 1", "Maior que 1", "Igual ao infinito" }));
        dropDemanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropDemandaActionPerformed(evt);
            }
        });

        dropOferta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Igual à 0", "Menor que 1", "Igual à 1", "Maior que 1", "Igual ao infinito" }));
        dropOferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropOfertaActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelGraficoLayout = new javax.swing.GroupLayout(painelGrafico);
        painelGrafico.setLayout(painelGraficoLayout);
        painelGraficoLayout.setHorizontalGroup(
            painelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        painelGraficoLayout.setVerticalGroup(
            painelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
        );

        jButton1.setText("Gerar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Gerar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(236, 236, 236))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOferta)
                            .addComponent(lblDemanda))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dropDemanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dropOferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(182, 182, 182))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(26, 26, 26)
                .addComponent(painelGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDemanda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropDemanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOferta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropOferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(34, 34, 34)
                .addComponent(btnVoltar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dropDemandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropDemandaActionPerformed
        // TODO add your handling code here:
        int selecionado = dropDemanda.getSelectedIndex();
        
        switch(selecionado){
            case 0:
                jLabel1.setIcon(new ImageIcon("src/imgs/elasticidade/EDigual_0.jpg"));
                break;
            case 1:
                jLabel1.setIcon(new ImageIcon("src/imgs/elasticidade/EDmenor_1.jpg"));
                break;
            case 2:
                jLabel1.setIcon(new ImageIcon("src/imgs/elasticidade/EDigual_1.jpg"));
                break;
            case 3:
                jLabel1.setIcon(new ImageIcon("src/imgs/elasticidade/EDmaior_1.jpg"));
                break;
            case 4:
                jLabel1.setIcon(new ImageIcon("src/imgs/elasticidade/EDinfinito.jpg"));
                break;
        }
    }//GEN-LAST:event_dropDemandaActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
        TelaMicro telaMicro = new TelaMicro();
        telaMicro.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void dropOfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropOfertaActionPerformed
        // TODO add your handling code here:
        int selecionado = dropOferta.getSelectedIndex();
        
        switch(selecionado){
            case 0:
                jLabel1.setIcon(new ImageIcon("src/imgs/elasticidade/EOigual_0.jpg"));
                break;
            case 1:
                jLabel1.setIcon(new ImageIcon("src/imgs/elasticidade/EOmenor_1.jpg"));
                break;
            case 2:
                jLabel1.setIcon(new ImageIcon("src/imgs/elasticidade/EOigual_1.jpg"));
                break;
            case 3:
                jLabel1.setIcon(new ImageIcon("src/imgs/elasticidade/EOmaior_1.jpg"));
                break;
            case 4:
                jLabel1.setIcon(new ImageIcon("src/imgs/elasticidade/EOinfinito.jpg"));
                break;
        }
    }//GEN-LAST:event_dropOfertaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaElasticidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaElasticidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaElasticidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaElasticidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaElasticidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnVoltar;
    private javax.swing.JComboBox<String> dropDemanda;
    private javax.swing.JComboBox<String> dropOferta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDemanda;
    private javax.swing.JLabel lblOferta;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel painelGrafico;
    // End of variables declaration//GEN-END:variables
}
