/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Funcioa;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Produto;

/**
 *
 * @author Windows 7
 */
public class Listagem extends javax.swing.JFrame {

    /**
     * Creates new form listagem
     */
    public Listagem() {
        initComponents();
        mostrarProdutos(Funcioa.buscarTodos());
    }

    private void mostrarProdutos(ArrayList<Produto> listaProduto) {
        String col[] = {"Nome", "Cargo", "Salário"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        for (Produto p : listaProduto) {
            Object[] data = {
                p.getNome(),
                p.getCargo(),
                p.getSalario()};
            tableModel.addRow(data);
        }
        tabelaProdutos = new JTable(tableModel);
        uuu.setViewportView(tabelaProdutos);
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        cargo = new javax.swing.JLabel();
        salario = new javax.swing.JLabel();
        uuu = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        ccargo = new javax.swing.JTextField();
        csalario = new javax.swing.JTextField();
        csalario2 = new javax.swing.JTextField();
        filtrar = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        titulo.setText("Listagem");

        cargo.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        cargo.setText("Cargo");

        salario.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        salario.setText("Salario");

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        uuu.setViewportView(tabelaProdutos);

        ccargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccargoActionPerformed(evt);
            }
        });

        csalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csalarioActionPerformed(evt);
            }
        });

        csalario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csalario2ActionPerformed(evt);
            }
        });

        filtrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        filtrar.setText("Filtrar");
        filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarActionPerformed(evt);
            }
        });

        cadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cargo)
                                .addGap(78, 78, 78)
                                .addComponent(salario)
                                .addGap(180, 180, 180))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ccargo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(csalario, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(csalario2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addComponent(filtrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(uuu)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cadastrar)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ccargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(csalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(csalario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filtrar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(salario)))
                .addGap(11, 11, 11)
                .addComponent(uuu, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cadastrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ccargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ccargoActionPerformed

    private void csalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_csalarioActionPerformed

    private void csalario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csalario2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_csalario2ActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        // TODO add your handling code here:
        Funcioa.mostrarCadastro();
        this.setVisible(false);
    }//GEN-LAST:event_cadastrarActionPerformed

    private void filtrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarActionPerformed
        String cargo = ccargo.getText();
        String textoDe = csalario.getText();
        String textoAte = csalario2.getText();
        
        if (cargo.equals("") && textoAte.equals("") && textoDe.equals("")) {
            mostrarProdutos(Funcioa.buscarTodos());
        }else{
            mostrarProdutos(Funcioa.filtrar(cargo, textoDe, textoAte));
        }
        

    }//GEN-LAST:event_filtrarActionPerformed

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
            java.util.logging.Logger.getLogger(Listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JLabel cargo;
    private javax.swing.JTextField ccargo;
    private javax.swing.JTextField csalario;
    private javax.swing.JTextField csalario2;
    private javax.swing.JButton filtrar;
    private javax.swing.JLabel salario;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JLabel titulo;
    private javax.swing.JScrollPane uuu;
    // End of variables declaration//GEN-END:variables
}
