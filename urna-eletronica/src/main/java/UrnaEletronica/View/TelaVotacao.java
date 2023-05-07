/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UrnaEletronica.View;

import UrnaEletronica.Model.CandidatoBergamota;
import UrnaEletronica.Model.CandidatoTangerina;
//port Imagens.*;


/**
 *
 * @author ARIEL
 */
public class TelaVotacao extends javax.swing.JFrame {

    /**
     * Creates new form TelaVotacao
     */
    public TelaVotacao() {
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

        jFrame1 = new javax.swing.JFrame();
        jFileChooser1 = new javax.swing.JFileChooser();
        txtBergamota = new javax.swing.JButton();
        txtTangerina = new javax.swing.JButton();
        nomeDaFruta = new javax.swing.JLabel();
        txtMexerica = new javax.swing.JButton();
        imagemTangerina = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtBergamota.setText("3 - BERGAMOTA");
        txtBergamota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBergamotaActionPerformed(evt);
            }
        });

        txtTangerina.setText("1 - TANGERINA");
        txtTangerina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTangerinaActionPerformed(evt);
            }
        });

        nomeDaFruta.setText("Qual o nome dessa fruta?");

        txtMexerica.setText("2 - MEXERICA");
        txtMexerica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMexericaActionPerformed(evt);
            }
        });

        imagemTangerina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UrnaEletronica/View/tangerinapadrao.jpg.jpg"))); // NOI18N
        imagemTangerina.setText("jLabel1");
        imagemTangerina.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                imagemTangerinaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeDaFruta, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagemTangerina, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTangerina, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMexerica, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBergamota, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(nomeDaFruta)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTangerina, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMexerica, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(txtBergamota, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(imagemTangerina, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(119, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTangerinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTangerinaActionPerformed
        // TODO add your handling code here:
        
       CandidatoTangerina candidato1 = new CandidatoTangerina("Tangerina");
      // candidato1.getNomeDoCandidato(txtTangerina.getText());
       candidato1.getNomeDoCandidato(txtTangerina.getText());
       candidato1.salvarVotosEmCandidatos();
       TelaConfirmacao confirmacao = new TelaConfirmacao();
       confirmacao.jTextField2.setText(txtTangerina.getText());
       //confirmacao.jTextField1.setText(txtCPF.getText());
       setVisible(false);
       confirmacao.setVisible(true);
       
       
       
       
    }//GEN-LAST:event_txtTangerinaActionPerformed

    private void txtMexericaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMexericaActionPerformed
        // TODO add your handling code here:
        
       CandidatoTangerina candidato2 = new CandidatoTangerina("Mexerica");
      // candidato1.getNomeDoCandidato(txtTangerina.getText());
       candidato2.getNomeDoCandidato(txtMexerica.getText());
       candidato2.salvarVotosEmCandidatos();
        
       
       
    }//GEN-LAST:event_txtMexericaActionPerformed

    private void txtBergamotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBergamotaActionPerformed
        // TODO add your handling code here:
         CandidatoBergamota candidato3 = new CandidatoBergamota("Bergamota");
      // candidato1.getNomeDoCandidato(txtTangerina.getText());
       candidato3.getNomeDoCandidato(txtBergamota.getText());
       candidato3.salvarVotosEmCandidatos();
    }//GEN-LAST:event_txtBergamotaActionPerformed

    private void imagemTangerinaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_imagemTangerinaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_imagemTangerinaAncestorAdded

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
            java.util.logging.Logger.getLogger(TelaVotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVotacao().setVisible(true);
            }
        });
    }
    
    public void receptor(String receptor) {
        txtTangerina.setText(receptor);
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagemTangerina;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel nomeDaFruta;
    public javax.swing.JButton txtBergamota;
    public javax.swing.JButton txtMexerica;
    public javax.swing.JButton txtTangerina;
    // End of variables declaration//GEN-END:variables
}
