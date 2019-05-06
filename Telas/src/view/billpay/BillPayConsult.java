/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.billpay;

/**
 *
 * @author weth767
 */
public class BillPayConsult extends javax.swing.JInternalFrame {

    /**
     * Creates new form BillReceiveConsult
     */
    public BillPayConsult() {
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

        textFilter = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnPayBill = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        billPaysTable = new javax.swing.JTable();
        labelFilter = new javax.swing.JLabel();
        comboBillReceive = new javax.swing.JComboBox<>();

        setTitle("Consulta de Contas à Pagar");
        setToolTipText("Tela de Consulta de Contas à Pagar");

        textFilter.setToolTipText("Informações a serem buscadas");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/search-24.png"))); // NOI18N
        btnSearch.setToolTipText("Consultar Conta à Pagar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnPayBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/payment-24.png"))); // NOI18N
        btnPayBill.setToolTipText("Retornar dados para a tela de Pagar Conta");
        btnPayBill.setBorderPainted(false);
        btnPayBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayBillActionPerformed(evt);
            }
        });

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/cancel-24.png"))); // NOI18N
        btnCancel.setToolTipText("Cancelar Operação");
        btnCancel.setBorderPainted(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        billPaysTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NF", "CNPJ Fornecedor", "Data de Vencimento", "Valor da Parcela", "Parcelas Restantes", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        billPaysTable.setToolTipText("Tabela de Contas à Pagar");
        jScrollPane1.setViewportView(billPaysTable);
        if (billPaysTable.getColumnModel().getColumnCount() > 0) {
            billPaysTable.getColumnModel().getColumn(0).setResizable(false);
            billPaysTable.getColumnModel().getColumn(0).setPreferredWidth(70);
            billPaysTable.getColumnModel().getColumn(1).setResizable(false);
            billPaysTable.getColumnModel().getColumn(1).setPreferredWidth(120);
            billPaysTable.getColumnModel().getColumn(2).setResizable(false);
            billPaysTable.getColumnModel().getColumn(2).setPreferredWidth(130);
            billPaysTable.getColumnModel().getColumn(3).setResizable(false);
            billPaysTable.getColumnModel().getColumn(3).setPreferredWidth(120);
            billPaysTable.getColumnModel().getColumn(4).setResizable(false);
            billPaysTable.getColumnModel().getColumn(4).setPreferredWidth(130);
            billPaysTable.getColumnModel().getColumn(5).setResizable(false);
            billPaysTable.getColumnModel().getColumn(5).setPreferredWidth(70);
        }

        labelFilter.setText("Filtro");

        comboBillReceive.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem Filtragem", "ID", "Datas de Vencimento", "Forma de Pagamento", "Valores de Parcela", "Status" }));
        comboBillReceive.setToolTipText("Filtro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(labelFilter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBillReceive, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(262, 262, 262)
                                .addComponent(btnPayBill)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancel)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelFilter)
                        .addComponent(comboBillReceive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPayBill, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPayBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPayBillActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable billPaysTable;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnPayBill;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> comboBillReceive;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFilter;
    private javax.swing.JTextField textFilter;
    // End of variables declaration//GEN-END:variables
}
