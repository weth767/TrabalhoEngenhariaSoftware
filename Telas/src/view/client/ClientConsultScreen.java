package view.client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author weth767
 */
public class ClientConsultScreen extends javax.swing.JInternalFrame {
    
    private JFrame mainScreen;
    /**
     * Creates new form ClientConsultScreen
     */
    public ClientConsultScreen(JFrame mainScreen) {
        initComponents();
        this.mainScreen = mainScreen;
        DefaultTableModel model = (DefaultTableModel) clientsTable.getModel();
        model.setRowCount(0);
        model.addRow(new Object[]{1, "João Paulo de Souza", "104.125.619-13", "13.258.207-6", "Masculino", 
        "joao_paulo767@hotmail.com","15/04/2019", null, "(37)9 9965-5305", "06/03/1997", 2000.00, "Estudante", "Paraná",
        "Umuarama", "87501-690", "Jardim Carolina", "Rua Mundo Novo", "3474", "Próximo ao Supermercado Ronqui",
        "Casa", true});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        clientsTable = new javax.swing.JTable();
        labelFilter = new javax.swing.JLabel();
        textFilter = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnCleanTable = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        comboSearch = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Consulta de Clientes");
        setMaximumSize(null);
        setRequestFocusEnabled(false);

        clientsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "RG", "Sexo", "E-mail", "Data de Cadastro", "Telefone", "Celular", "Data de Nascimento", "Sálario", "Local de Trabalho", "Estado", "Cidade", "CEP", "Bairro", "Rua", "Número", "Referência", "Complemento", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientsTable.setToolTipText("Tabela de clientes");
        clientsTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        clientsTable.setSurrendersFocusOnKeystroke(true);
        clientsTable.getTableHeader().setResizingAllowed(false);
        clientsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(clientsTable);
        if (clientsTable.getColumnModel().getColumnCount() > 0) {
            clientsTable.getColumnModel().getColumn(0).setResizable(false);
            clientsTable.getColumnModel().getColumn(0).setPreferredWidth(70);
            clientsTable.getColumnModel().getColumn(1).setResizable(false);
            clientsTable.getColumnModel().getColumn(1).setPreferredWidth(250);
            clientsTable.getColumnModel().getColumn(2).setResizable(false);
            clientsTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            clientsTable.getColumnModel().getColumn(3).setResizable(false);
            clientsTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            clientsTable.getColumnModel().getColumn(4).setResizable(false);
            clientsTable.getColumnModel().getColumn(4).setPreferredWidth(85);
            clientsTable.getColumnModel().getColumn(5).setResizable(false);
            clientsTable.getColumnModel().getColumn(5).setPreferredWidth(250);
            clientsTable.getColumnModel().getColumn(6).setResizable(false);
            clientsTable.getColumnModel().getColumn(6).setPreferredWidth(130);
            clientsTable.getColumnModel().getColumn(7).setResizable(false);
            clientsTable.getColumnModel().getColumn(7).setPreferredWidth(130);
            clientsTable.getColumnModel().getColumn(8).setResizable(false);
            clientsTable.getColumnModel().getColumn(8).setPreferredWidth(130);
            clientsTable.getColumnModel().getColumn(9).setResizable(false);
            clientsTable.getColumnModel().getColumn(9).setPreferredWidth(130);
            clientsTable.getColumnModel().getColumn(10).setResizable(false);
            clientsTable.getColumnModel().getColumn(10).setPreferredWidth(100);
            clientsTable.getColumnModel().getColumn(11).setResizable(false);
            clientsTable.getColumnModel().getColumn(11).setPreferredWidth(200);
            clientsTable.getColumnModel().getColumn(12).setResizable(false);
            clientsTable.getColumnModel().getColumn(12).setPreferredWidth(150);
            clientsTable.getColumnModel().getColumn(13).setResizable(false);
            clientsTable.getColumnModel().getColumn(13).setPreferredWidth(250);
            clientsTable.getColumnModel().getColumn(14).setResizable(false);
            clientsTable.getColumnModel().getColumn(14).setPreferredWidth(100);
            clientsTable.getColumnModel().getColumn(15).setResizable(false);
            clientsTable.getColumnModel().getColumn(15).setPreferredWidth(220);
            clientsTable.getColumnModel().getColumn(16).setResizable(false);
            clientsTable.getColumnModel().getColumn(16).setPreferredWidth(220);
            clientsTable.getColumnModel().getColumn(17).setResizable(false);
            clientsTable.getColumnModel().getColumn(17).setPreferredWidth(70);
            clientsTable.getColumnModel().getColumn(18).setResizable(false);
            clientsTable.getColumnModel().getColumn(18).setPreferredWidth(300);
            clientsTable.getColumnModel().getColumn(19).setResizable(false);
            clientsTable.getColumnModel().getColumn(19).setPreferredWidth(150);
            clientsTable.getColumnModel().getColumn(20).setResizable(false);
            clientsTable.getColumnModel().getColumn(20).setPreferredWidth(50);
        }
        clientsTable.getAccessibleContext().setAccessibleName("");

        labelFilter.setText("Filtro:");

        textFilter.setToolTipText("Informação de filtragem de cliente");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/search-24.png"))); // NOI18N
        btnSearch.setToolTipText("Consulta de clientes");
        btnSearch.setBorderPainted(false);

        btnCleanTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/clean-24.png"))); // NOI18N
        btnCleanTable.setToolTipText("Limpar as linhas da tabela(não apaga os dados)");
        btnCleanTable.setBorderPainted(false);

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/cancel-24.png"))); // NOI18N
        btnCancel.setToolTipText("Cancelar Operação");
        btnCancel.setBorderPainted(false);

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/update-24.png"))); // NOI18N
        btnUpdate.setToolTipText("Atualizar cliente");
        btnUpdate.setBorderPainted(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/delete-24.png"))); // NOI18N
        btnRemove.setToolTipText("Apagar um cliente");
        btnRemove.setBorderPainted(false);

        comboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome", "CPF", "RG", "Data de Cadastro", "Sexo", "Data de Nascimento", "E-mail", "Telefone", "Celular", "CEP", "Estado", "Cidade", "Bairro", "Rua", "Local de Trabalho", "Salário", "Status" }));
        comboSearch.setToolTipText("Filtro de busca de clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCleanTable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemove)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
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
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCleanTable, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        ClientUpdateScreen cup = new ClientUpdateScreen(this);
        cup.setVisible(true);
        mainScreen.add(cup);
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCleanTable;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTable clientsTable;
    private javax.swing.JComboBox<String> comboSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFilter;
    private javax.swing.JTextField textFilter;
    // End of variables declaration//GEN-END:variables
}
