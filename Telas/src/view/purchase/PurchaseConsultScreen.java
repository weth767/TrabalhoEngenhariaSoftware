/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.purchase;

import view.sale.*;

/**
 *
 * @author weth767
 */
public class PurchaseConsultScreen extends javax.swing.JInternalFrame {

    /**
     * Creates new form SaleConsultScreen
     */
    public PurchaseConsultScreen() {
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

        labelFilter = new javax.swing.JLabel();
        textFilter = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnCleanTable = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        comboSearch = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        salesTable = new javax.swing.JTable();

        setClosable(true);
        setTitle("Consulta de Compra");

        labelFilter.setText("Filtro:");

        textFilter.setToolTipText("Informações a serem buscadas");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/search-24.png"))); // NOI18N
        btnSearch.setToolTipText("Consultar Pagamentos");
        btnSearch.setBorderPainted(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnCleanTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/clean-24.png"))); // NOI18N
        btnCleanTable.setToolTipText("Limpar Tabela");
        btnCleanTable.setBorderPainted(false);
        btnCleanTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanTableActionPerformed(evt);
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

        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/delete-24.png"))); // NOI18N
        btnRemove.setToolTipText("Apagar Pagamento");
        btnRemove.setBorderPainted(false);
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        comboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem Filtragem", "ID", "Datas", "Notas Fiscais", "Valores", "Status" }));
        comboSearch.setToolTipText("Filtro");

        salesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Data", "Hora", "Nota Fiscal", "Valor Total", "Forma de Pgt.", "Qnt. Parcelas", "Valor das Parc.", "Data de Venc.", "Fornecedor", "Usuário", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        salesTable.setToolTipText("Tabela de Compras");
        salesTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        salesTable.setSurrendersFocusOnKeystroke(true);
        salesTable.getTableHeader().setResizingAllowed(false);
        salesTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(salesTable);
        if (salesTable.getColumnModel().getColumnCount() > 0) {
            salesTable.getColumnModel().getColumn(0).setResizable(false);
            salesTable.getColumnModel().getColumn(0).setPreferredWidth(70);
            salesTable.getColumnModel().getColumn(1).setResizable(false);
            salesTable.getColumnModel().getColumn(1).setPreferredWidth(90);
            salesTable.getColumnModel().getColumn(2).setResizable(false);
            salesTable.getColumnModel().getColumn(2).setPreferredWidth(90);
            salesTable.getColumnModel().getColumn(3).setResizable(false);
            salesTable.getColumnModel().getColumn(3).setPreferredWidth(70);
            salesTable.getColumnModel().getColumn(4).setResizable(false);
            salesTable.getColumnModel().getColumn(4).setPreferredWidth(90);
            salesTable.getColumnModel().getColumn(5).setResizable(false);
            salesTable.getColumnModel().getColumn(5).setPreferredWidth(150);
            salesTable.getColumnModel().getColumn(6).setResizable(false);
            salesTable.getColumnModel().getColumn(6).setPreferredWidth(90);
            salesTable.getColumnModel().getColumn(7).setResizable(false);
            salesTable.getColumnModel().getColumn(7).setPreferredWidth(100);
            salesTable.getColumnModel().getColumn(8).setResizable(false);
            salesTable.getColumnModel().getColumn(8).setPreferredWidth(100);
            salesTable.getColumnModel().getColumn(9).setResizable(false);
            salesTable.getColumnModel().getColumn(9).setPreferredWidth(250);
            salesTable.getColumnModel().getColumn(10).setResizable(false);
            salesTable.getColumnModel().getColumn(10).setPreferredWidth(100);
            salesTable.getColumnModel().getColumn(11).setResizable(false);
            salesTable.getColumnModel().getColumn(11).setPreferredWidth(70);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCleanTable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemove)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(labelFilter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFilter)
                    .addComponent(textFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnCleanTable, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCleanTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanTableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCleanTableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCleanTable;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> comboSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFilter;
    private javax.swing.JTable salesTable;
    private javax.swing.JTextField textFilter;
    // End of variables declaration//GEN-END:variables
}
