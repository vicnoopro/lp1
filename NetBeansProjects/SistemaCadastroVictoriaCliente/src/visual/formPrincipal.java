/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import javax.swing.JOptionPane;

/**
 *
 * @author 13826640608
 */
public class formPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form formPrincipal
     */
    public formPrincipal() {
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

        barraMenu = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuCliente = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Cadastro");

        menuCadastro.setText("Cadastro");

        menuCliente.setText("Cliente");
        menuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCliente);

        barraMenu.add(menuCadastro);

        menuAjuda.setText("Ajuda");
        menuAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAjudaActionPerformed(evt);
            }
        });

        menuSobre.setText("Sobre");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(menuSobre);

        barraMenu.add(menuAjuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuClienteActionPerformed

    private void menuAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAjudaActionPerformed
 
      
    }//GEN-LAST:event_menuAjudaActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        // TODO add your handling code here:
        
          JOptionPane.showMessageDialog(null, "Sistema de Cadastro\nDireitos Reservados");
    }//GEN-LAST:event_menuSobreActionPerformed

    public static void main(String[] args) {
        formPrincipal form = new formPrincipal();
        form.setLocationRelativeTo(null);
        form.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuCliente;
    private javax.swing.JMenuItem menuSobre;
    // End of variables declaration//GEN-END:variables
}