/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaViaticos.principal;

import SistemaViaticos.controlador.CtrlMunicipios;
import SistemaViaticos.modelo.Municipio;
import SistemaViaticos.dialogs.diaMunicipios;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author AUXINVTIC
 */
public class diaEditMunicipio extends java.awt.Dialog {

    diaMunicipios pnl;
    
    public diaEditMunicipio(java.awt.Frame parent, boolean modal, Municipio municipio, diaMunicipios pnl) {
        super(parent, modal);
        initComponents();
        this.pnl = pnl;
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/ajustes.png"));
        setIconImage(icon);
        setTitle("Información del municipio seleccionado");
        setLocationRelativeTo(this);
        lblCodigo.setText(municipio.getCodigo());
        txtCodigo.setText(municipio.getCodigo());
        txtCodigo.setVisible(false);
        txtMunicipio.setText(municipio.getMunicipio());
        txtValorHosp.setText(String.valueOf(municipio.getValor_hospedaje()));
        txtValorAlim.setText(String.valueOf(municipio.getValor_alimentacion()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMunicipio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtValorHosp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtValorAlim = new javax.swing.JTextField();
        btnActualizarMunicipio = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actualizar municipio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Código:");

        txtCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCodigo.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nombre:");

        txtMunicipio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Costo hospedaje por dia:");

        txtValorHosp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Costo alimentación por dia:");

        txtValorAlim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnActualizarMunicipio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizarMunicipio.setForeground(new java.awt.Color(102, 102, 102));
        btnActualizarMunicipio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ref.png"))); // NOI18N
        btnActualizarMunicipio.setText("Actualizar");
        btnActualizarMunicipio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarMunicipio.setIconTextGap(6);
        btnActualizarMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarMunicipioActionPerformed(evt);
            }
        });

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigo.setText("0");

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(102, 102, 102));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setIconTextGap(6);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(txtValorHosp, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(txtValorAlim, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(btnActualizarMunicipio)
                .addGap(17, 17, 17)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(lblCodigo))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2))
                    .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3))
                    .addComponent(txtValorHosp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4))
                    .addComponent(txtValorAlim, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizarMunicipio)
                    .addComponent(btnCancelar)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 410, 250));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void btnActualizarMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarMunicipioActionPerformed
        CtrlMunicipios ctrl = new CtrlMunicipios();
        ctrl.actualizarMunicipio(this, this.pnl);
    }//GEN-LAST:event_btnActualizarMunicipioActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarMunicipio;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCodigo;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtMunicipio;
    public javax.swing.JTextField txtValorAlim;
    public javax.swing.JTextField txtValorHosp;
    // End of variables declaration//GEN-END:variables
}
