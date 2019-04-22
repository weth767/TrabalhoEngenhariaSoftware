/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.purchase;

/**
 *
 * @author weth767
 */
public class PurchaseRegisterScreen extends javax.swing.JInternalFrame {

    /**
     * Creates new form PurchaseRegisterScreen
     */
    public PurchaseRegisterScreen() {
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

        btnAddProduct = new javax.swing.JButton();
        btnRemoveProduct = new javax.swing.JButton();
        spinnerPortionAmount = new javax.swing.JSpinner();
        textAmount = new javax.swing.JTextField();
        labelProduct = new javax.swing.JLabel();
        textDueDate = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        labelAmount = new javax.swing.JLabel();
        labelProductName = new javax.swing.JLabel();
        textProductName = new javax.swing.JTextField();
        btnSearchProduct = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        purchaseTable = new javax.swing.JTable();
        labelValue = new javax.swing.JLabel();
        textProductValue = new javax.swing.JTextField();
        labelSaledAmount = new javax.swing.JLabel();
        textSaledAmount = new javax.swing.JTextField();
        labelSale = new javax.swing.JLabel();
        labelInvoiceNumber = new javax.swing.JLabel();
        textInvoiceNumber = new javax.swing.JTextField();
        labelTotalValue = new javax.swing.JLabel();
        textTotalValue = new javax.swing.JTextField();
        labelSaleDate = new javax.swing.JLabel();
        textSaleDate = new javax.swing.JFormattedTextField();
        labelSaleTime = new javax.swing.JLabel();
        textSaleTime = new javax.swing.JFormattedTextField();
        jSeparator3 = new javax.swing.JSeparator();
        labelReceiveForm = new javax.swing.JLabel();
        labelPortionValue = new javax.swing.JLabel();
        textPortionValue = new javax.swing.JTextField();
        comboReceiveForm = new javax.swing.JComboBox<>();
        labelPortionNumber = new javax.swing.JLabel();
        labelBrand = new javax.swing.JLabel();
        textBrand = new javax.swing.JTextField();
        labeldueDate = new javax.swing.JLabel();
        labelBarcode = new javax.swing.JLabel();
        btnConfirmPurchase = new javax.swing.JButton();
        textBarcode = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        
        labelAllotment = new javax.swing.JLabel();
        textAllotment = new javax.swing.JTextField();
        textUser = new javax.swing.JTextField();
        labelProvider = new javax.swing.JLabel();
        labelClientName = new javax.swing.JLabel();
        textProviderName = new javax.swing.JTextField();
        btnSearchProvider = new javax.swing.JButton();
        labelUser = new javax.swing.JLabel();

        btnRemoveProduct.setPreferredSize(new java.awt.Dimension(20, 20));

        setClosable(true);
        setTitle("Cadastro de Compra");
        setToolTipText("Tela de Cadastro de Compra");

        textAmount.setEditable(false);
        textAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelProduct.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelProduct.setText("Produto(s)");

        try {
            textDueDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textDueDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelAmount.setText("Estoque");

        labelProductName.setText("Descrição");

        textProductName.setEditable(false);
        textProductName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        purchaseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição Completa", "Valor Unitário", "Quantidade", "ValorTotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        purchaseTable.getTableHeader().setResizingAllowed(false);
        purchaseTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(purchaseTable);

        labelValue.setText("Valor");

        textProductValue.setEditable(false);
        textProductValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelSaledAmount.setText("Quantidade");

        textSaledAmount.setEditable(false);
        textSaledAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelSale.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelSale.setText("Finalização da Compra");

        labelInvoiceNumber.setText("Nota Fiscal");

        textInvoiceNumber.setEditable(false);
        textInvoiceNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelTotalValue.setText("Valor Total");

        textTotalValue.setEditable(false);
        textTotalValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelSaleDate.setText("Data da Compra");

        textSaleDate.setEditable(false);
        try {
            textSaleDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textSaleDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelSaleTime.setText("Hora da Compra");

        textSaleTime.setEditable(false);
        try {
            textSaleTime.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textSaleTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelReceiveForm.setText("Forma de Pagamento");

        labelPortionValue.setText("Valor das Parcelas");

        textPortionValue.setEditable(false);
        textPortionValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        comboReceiveForm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "À Vista", "Cartão Crédito", "Cartão Débito", "Nota", " " }));

        labelPortionNumber.setText("Número de Parcelas");

        labelBrand.setText("Marca");

        textBrand.setEditable(false);

        labeldueDate.setText("Data de Vencimento");

        labelBarcode.setText("Cód.Barras");

        btnConfirmPurchase.setText("Confirmar Compra");

        textBarcode.setEditable(false);

        btnCancel.setText("Cancelar");

        labelAllotment.setText("Lote");

        textAllotment.setEditable(false);

        textUser.setEditable(false);
        textUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelProvider.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelProvider.setText("Fornecedor");

        labelClientName.setText("Nome");

        textProviderName.setEditable(false);
        textProviderName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelUser.setText("Usuário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(btnConfirmPurchase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelClientName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textProviderName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(labelProvider)
                                .addGap(12, 12, 12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchProvider, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(labelUser))
                            .addComponent(textUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelReceiveForm)
                            .addComponent(labelSaleDate)
                            .addComponent(labelPortionValue)
                            .addComponent(labelInvoiceNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textPortionValue, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textInvoiceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(labelSale))
                            .addComponent(textSaleDate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboReceiveForm, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelPortionNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinnerPortionAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labeldueDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelSaleTime)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textSaleTime, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTotalValue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAmount)
                            .addComponent(labelProductName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(labelBrand)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelBarcode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textBarcode))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelValue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textProductValue, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelSaledAmount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textSaledAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelAllotment)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textAllotment))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelProduct)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(294, 294, 294)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelProvider)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textProviderName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelClientName)))
                    .addComponent(btnSearchProvider, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(labelProduct))
                    .addComponent(btnSearchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelProductName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelBrand)
                        .addComponent(labelBarcode)
                        .addComponent(textBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAmount)
                    .addComponent(textAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelValue)
                    .addComponent(textProductValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSaledAmount)
                    .addComponent(textSaledAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAllotment)
                    .addComponent(textAllotment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelInvoiceNumber)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelSaleDate)
                                        .addGap(6, 6, 6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textInvoiceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(textSaleDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelReceiveForm)
                                    .addComponent(comboReceiveForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelPortionValue)
                                    .addComponent(textPortionValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelTotalValue)
                                    .addComponent(textTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textSaleTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelSaleTime))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelPortionNumber)
                                    .addComponent(spinnerPortionAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labeldueDate)
                                    .addComponent(textDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(labelSale)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfirmPurchase, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirmPurchase;
    private javax.swing.JButton btnRemoveProduct;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JButton btnSearchProvider;
    private javax.swing.JComboBox<String> comboReceiveForm;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelAllotment;
    private javax.swing.JLabel labelAmount;
    private javax.swing.JLabel labelBarcode;
    private javax.swing.JLabel labelBrand;
    private javax.swing.JLabel labelClientName;
    private javax.swing.JLabel labelInvoiceNumber;
    private javax.swing.JLabel labelPortionNumber;
    private javax.swing.JLabel labelPortionValue;
    private javax.swing.JLabel labelProduct;
    private javax.swing.JLabel labelProductName;
    private javax.swing.JLabel labelProvider;
    private javax.swing.JLabel labelReceiveForm;
    private javax.swing.JLabel labelSale;
    private javax.swing.JLabel labelSaleDate;
    private javax.swing.JLabel labelSaleTime;
    private javax.swing.JLabel labelSaledAmount;
    private javax.swing.JLabel labelTotalValue;
    private javax.swing.JLabel labelUser;
    private javax.swing.JLabel labelValue;
    private javax.swing.JLabel labeldueDate;
    private javax.swing.JTable purchaseTable;
    private javax.swing.JSpinner spinnerPortionAmount;
    private javax.swing.JTextField textAllotment;
    private javax.swing.JTextField textAmount;
    private javax.swing.JTextField textBarcode;
    private javax.swing.JTextField textBrand;
    private javax.swing.JFormattedTextField textDueDate;
    private javax.swing.JTextField textInvoiceNumber;
    private javax.swing.JTextField textPortionValue;
    private javax.swing.JTextField textProductName;
    private javax.swing.JTextField textProductValue;
    private javax.swing.JTextField textProviderName;
    private javax.swing.JFormattedTextField textSaleDate;
    private javax.swing.JFormattedTextField textSaleTime;
    private javax.swing.JTextField textSaledAmount;
    private javax.swing.JTextField textTotalValue;
    private javax.swing.JTextField textUser;
    // End of variables declaration//GEN-END:variables
}
