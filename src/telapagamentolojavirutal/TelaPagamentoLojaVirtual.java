/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telapagamentolojavirutal;

import javax.swing.JOptionPane;

/**
 *
 * @author Whoami
 */
public class TelaPagamentoLojaVirtual extends javax.swing.JFrame {

    /**
     * Creates new form TelaPagamentoLojaVirtual
     */
    public TelaPagamentoLojaVirtual() {
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

        btnGroup1x2x3x = new javax.swing.ButtonGroup();
        btnGroupBandeira = new javax.swing.ButtonGroup();
        jPanelMain = new javax.swing.JPanel();
        jPanelFlag = new javax.swing.JPanel();
        btnMaster = new javax.swing.JToggleButton();
        btnVisa = new javax.swing.JToggleButton();
        btnCielo = new javax.swing.JToggleButton();
        btnAme = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        jButtonClean = new javax.swing.JButton();
        buttonVoltar = new javax.swing.JButton();
        buttonFechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn1 = new javax.swing.JRadioButton();
        btn2 = new javax.swing.JRadioButton();
        btn3 = new javax.swing.JRadioButton();
        jPanelAddress = new javax.swing.JPanel();
        jPanelDeliveryAddress = new javax.swing.JPanel();
        jLabelTittle = new javax.swing.JLabel();
        jLabelNumber = new javax.swing.JLabel();
        jLabelUF = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jLabelDistrict = new javax.swing.JLabel();
        jLabelCEP = new javax.swing.JLabel();
        txtEnd1 = new javax.swing.JTextField();
        txtNum1 = new javax.swing.JTextField();
        txtBairro1 = new javax.swing.JTextField();
        txtCEP1 = new javax.swing.JTextField();
        txtUF1 = new javax.swing.JTextField();
        jPanelInstallmentsAddress = new javax.swing.JPanel();
        jLabel = new javax.swing.JLabel();
        txtEnd2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNum2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUF2 = new javax.swing.JTextField();
        txtBairro2 = new javax.swing.JTextField();
        txtCEP2 = new javax.swing.JTextField();
        jLabelCard = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumCart = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMain.setBackground(new java.awt.Color(204, 204, 255));

        jPanelFlag.setBackground(new java.awt.Color(204, 204, 255));
        jPanelFlag.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        btnGroupBandeira.add(btnMaster);
        btnMaster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telapagamentolojavirutal/master.png"))); // NOI18N
        jPanelFlag.add(btnMaster);

        btnGroupBandeira.add(btnVisa);
        btnVisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telapagamentolojavirutal/visa.png"))); // NOI18N
        jPanelFlag.add(btnVisa);

        btnGroupBandeira.add(btnCielo);
        btnCielo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telapagamentolojavirutal/cielo.png"))); // NOI18N
        jPanelFlag.add(btnCielo);

        btnGroupBandeira.add(btnAme);
        btnAme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telapagamentolojavirutal/ame.png"))); // NOI18N
        jPanelFlag.add(btnAme);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new java.awt.GridLayout(1, 4));

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar);

        jButtonClean.setText("Limpar");
        jButtonClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCleanActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonClean);

        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonVoltar);

        buttonFechar.setText("Fechar");
        buttonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFecharActionPerformed(evt);
            }
        });
        jPanel1.add(buttonFechar);

        jLabel1.setText("Parcela");

        btnGroup1x2x3x.add(btn1);
        btn1.setText("1X");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btnGroup1x2x3x.add(btn2);
        btn2.setText("2X");

        btnGroup1x2x3x.add(btn3);
        btn3.setText("3X");

        jPanelAddress.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAddress.setLayout(new java.awt.GridLayout(1, 2, 1, 50));

        jLabelTittle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelTittle.setForeground(new java.awt.Color(255, 0, 0));
        jLabelTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTittle.setText("Endereço de Entrega");

        jLabelNumber.setText("Endereço:");

        jLabelUF.setText("Número:");

        jLabelAddress.setText("UF:");

        jLabelDistrict.setText("Bairro:");

        jLabelCEP.setText("CEP:");

        javax.swing.GroupLayout jPanelDeliveryAddressLayout = new javax.swing.GroupLayout(jPanelDeliveryAddress);
        jPanelDeliveryAddress.setLayout(jPanelDeliveryAddressLayout);
        jPanelDeliveryAddressLayout.setHorizontalGroup(
            jPanelDeliveryAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDeliveryAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDeliveryAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTittle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelDeliveryAddressLayout.createSequentialGroup()
                        .addGroup(jPanelDeliveryAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelUF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelAddress))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDeliveryAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDeliveryAddressLayout.createSequentialGroup()
                                .addGroup(jPanelDeliveryAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUF1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                    .addComponent(txtNum1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelDeliveryAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelDistrict, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelDeliveryAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBairro1)
                                    .addComponent(txtCEP1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                            .addComponent(txtEnd1))))
                .addContainerGap())
        );
        jPanelDeliveryAddressLayout.setVerticalGroup(
            jPanelDeliveryAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDeliveryAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTittle)
                .addGap(18, 18, 18)
                .addGroup(jPanelDeliveryAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumber)
                    .addComponent(txtEnd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanelDeliveryAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUF)
                    .addComponent(jLabelDistrict)
                    .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelDeliveryAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAddress)
                    .addComponent(jLabelCEP)
                    .addComponent(txtCEP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanelAddress.add(jPanelDeliveryAddress);

        jLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel.setForeground(new java.awt.Color(255, 0, 0));
        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel.setText("Endereço de Cobrança");

        jLabel2.setText("Endereço:");

        jLabel5.setText("Numero:");

        jLabel6.setText("Bairro:");

        jLabel7.setText("UF:");

        jLabel8.setText("CEP:");

        javax.swing.GroupLayout jPanelInstallmentsAddressLayout = new javax.swing.GroupLayout(jPanelInstallmentsAddress);
        jPanelInstallmentsAddress.setLayout(jPanelInstallmentsAddressLayout);
        jPanelInstallmentsAddressLayout.setHorizontalGroup(
            jPanelInstallmentsAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInstallmentsAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInstallmentsAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addGroup(jPanelInstallmentsAddressLayout.createSequentialGroup()
                        .addGroup(jPanelInstallmentsAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelInstallmentsAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEnd2)
                            .addGroup(jPanelInstallmentsAddressLayout.createSequentialGroup()
                                .addGroup(jPanelInstallmentsAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNum2)
                                    .addComponent(txtUF2, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelInstallmentsAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelInstallmentsAddressLayout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBairro2, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                                    .addGroup(jPanelInstallmentsAddressLayout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCEP2))))))
                    .addGroup(jPanelInstallmentsAddressLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelInstallmentsAddressLayout.setVerticalGroup(
            jPanelInstallmentsAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInstallmentsAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanelInstallmentsAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(jPanelInstallmentsAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtBairro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanelInstallmentsAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(txtUF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCEP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanelAddress.add(jPanelInstallmentsAddress);

        jLabelCard.setText("Número do cartão:");

        jLabel3.setText("Bandeira:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TELA DE PAGAMENTO DE UMA LOJA VIRTUAL");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelFlag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addComponent(jLabelCard)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumCart, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCard)
                    .addComponent(txtNumCart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFlag, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        trabalhoeventos.Principal p = new trabalhoeventos.Principal();
        dispose();
        p.setVisible(true);
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void buttonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFecharActionPerformed
        dispose();
    }//GEN-LAST:event_buttonFecharActionPerformed

    private void jButtonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCleanActionPerformed
        txtBairro1.setText("");
        txtBairro2.setText("");
        txtCEP1.setText("");
        txtCEP2.setText("");
        txtEnd1.setText("");
        txtEnd2.setText("");
        txtNum1.setText("");
        txtNumCart.setText("");
        txtNum2.setText("");
        txtUF1.setText("");
        txtUF2.setText("");
        btnGroup1x2x3x.clearSelection();
        btnGroupBandeira.clearSelection();
    }//GEN-LAST:event_jButtonCleanActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String vezes="";
        String bandeira="";
        if (btn1.isSelected()){
            vezes="1x";
        } else if (btn2.isSelected()) {
            vezes="2x";
        } else if (btn3.isSelected()){
            vezes="3x";
        } else {
            vezes="Não definido.";
        }
        if (btnMaster.isSelected()){
            bandeira="Mastercard";
        } else if (btnVisa.isSelected()){
            bandeira="Visa.";
        } else if (btnCielo.isSelected()){
            bandeira="Cielo.";
        } else if (btnAme.isSelected()){
            bandeira="Ame.";
        } else {
            bandeira="Não definida.";
        }
        
        JOptionPane.showMessageDialog(null, 
                "Numero do Cartão: \n" + txtNumCart.getText() +
                "\n**ENDEREÇO DE ENTREGA:**\n" + 
                txtEnd1.getText() + ", numero: " + txtNum1.getText() +
                "\nBairro: " + txtBairro1.getText() + " UF: " + txtUF1.getText() +
                "\nCEP: " + txtCEP1.getText() +
                "\n\n**ENDEREÇO DE COBRANÇA:**\n" +
                txtEnd2.getText() + ", numero: " + txtNum2.getText() +
                "\nBairro: " + txtBairro2.getText() + " UF: " + txtUF2.getText() +
                "\nCEP: " + txtCEP2.getText() +
                "\n\n**PAGAMENTO**\nParcelas: " + vezes +
                "\nBandeira: " + bandeira                
        );
                
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPagamentoLojaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPagamentoLojaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPagamentoLojaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPagamentoLojaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPagamentoLojaVirtual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn1;
    private javax.swing.JRadioButton btn2;
    private javax.swing.JRadioButton btn3;
    private javax.swing.JToggleButton btnAme;
    private javax.swing.JToggleButton btnCielo;
    private javax.swing.ButtonGroup btnGroup1x2x3x;
    private javax.swing.ButtonGroup btnGroupBandeira;
    private javax.swing.JToggleButton btnMaster;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JToggleButton btnVisa;
    private javax.swing.JButton buttonFechar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JButton jButtonClean;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCard;
    private javax.swing.JLabel jLabelDistrict;
    private javax.swing.JLabel jLabelNumber;
    private javax.swing.JLabel jLabelTittle;
    private javax.swing.JLabel jLabelUF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAddress;
    private javax.swing.JPanel jPanelDeliveryAddress;
    private javax.swing.JPanel jPanelFlag;
    private javax.swing.JPanel jPanelInstallmentsAddress;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JTextField txtBairro1;
    private javax.swing.JTextField txtBairro2;
    private javax.swing.JTextField txtCEP1;
    private javax.swing.JTextField txtCEP2;
    private javax.swing.JTextField txtEnd1;
    private javax.swing.JTextField txtEnd2;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtNumCart;
    private javax.swing.JTextField txtUF1;
    private javax.swing.JTextField txtUF2;
    // End of variables declaration//GEN-END:variables
}
