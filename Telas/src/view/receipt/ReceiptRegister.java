/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.receipt;

/**
 *
 * @author weth767
 */
public class ReceiptRegister extends javax.swing.JInternalFrame {

    /**
     * Creates new form ReceiptRegister
     */
    public ReceiptRegister() {
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

        labelDate = new javax.swing.JLabel();
        textDate = new javax.swing.JFormattedTextField();
        labelCashier = new javax.swing.JLabel();
        textCashier = new javax.swing.JTextField();
        labelDiscount = new javax.swing.JLabel();
        textDiscount = new javax.swing.JTextField();
        labelAdditions = new javax.swing.JLabel();
        textAdditions = new javax.swing.JTextField();
        labelBillReceiveValue = new javax.swing.JLabel();
        textBillReceiveValue = new javax.swing.JTextField();
        labelReceiveValue = new javax.swing.JLabel();
        textReceiptValue = new javax.swing.JTextField();
        labelReceiptMethod = new javax.swing.JLabel();
        textReceiptMethod = new javax.swing.JTextField();
        labelPortionNumber = new javax.swing.JLabel();
        textPortionNumber = new javax.swing.JTextField();
        labelDueDate = new javax.swing.JLabel();
        textDueDate = new javax.swing.JTextField();
        labelRemainingValue = new javax.swing.JLabel();
        textRemaining = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de Recebimento");
        setToolTipText("Tela de Cadastro de Recebimento");

        labelDate.setText("Data");

        textDate.setEditable(false);
        try {
            textDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelCashier.setText("Caixa");

        textCashier.setEditable(false);

        labelDiscount.setText("Desconto");

        labelAdditions.setText("Acrescimos");

        labelBillReceiveValue.setText("Valor à receber");

        textBillReceiveValue.setEditable(false);

        labelReceiveValue.setText("Valor Recebido");

        labelReceiptMethod.setText("Forma de Recebimento");

        textReceiptMethod.setEditable(false);

        labelPortionNumber.setText("Nº Parcelas");

        labelDueDate.setText("Data de Vencimento");

        textDueDate.setEditable(false);

        labelRemainingValue.setText("Valor Restante");

        textRemaining.setEditable(false);

        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/receive-24.png"))); // NOI18N
        btnRegister.setToolTipText("Confirmar Recebimento");
        btnRegister.setBorderPainted(false);

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/cancel-24.png"))); // NOI18N
        btnCancel.setToolTipText("Cancelar Operação");
        btnCancel.setBorderPainted(false);

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/search-24.png"))); // NOI18N
        btnSearch.setToolTipText("Buscar Conta à Receber");
        btnSearch.setBorderPainted(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(btnRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelBillReceiveValue)
                                        .addGap(55, 55, 55)
                                        .addComponent(textBillReceiveValue, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelDate)
                                        .addGap(114, 114, 114)
                                        .addComponent(textDate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelDiscount)
                                            .addComponent(labelDueDate))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textDueDate, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(textDiscount))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCashier, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelAdditions, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelReceiveValue, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelRemainingValue, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelReceiptMethod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textReceiptMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(labelPortionNumber)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textCashier, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(textAdditions)
                            .addComponent(textReceiptValue)
                            .addComponent(textPortionNumber)
                            .addComponent(textRemaining)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSearch)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDate)
                    .addComponent(textDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCashier)
                    .addComponent(textCashier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textReceiptMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelReceiptMethod)
                        .addComponent(labelPortionNumber))
                    .addComponent(textPortionNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textAdditions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAdditions))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textReceiptValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelReceiveValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textRemaining, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelRemainingValue)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelBillReceiveValue)
                            .addComponent(textBillReceiveValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDiscount)
                            .addComponent(textDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDueDate))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel labelAdditions;
    private javax.swing.JLabel labelBillReceiveValue;
    private javax.swing.JLabel labelCashier;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelDiscount;
    private javax.swing.JLabel labelDueDate;
    private javax.swing.JLabel labelPortionNumber;
    private javax.swing.JLabel labelReceiptMethod;
    private javax.swing.JLabel labelReceiveValue;
    private javax.swing.JLabel labelRemainingValue;
    private javax.swing.JTextField textAdditions;
    private javax.swing.JTextField textBillReceiveValue;
    private javax.swing.JTextField textCashier;
    private javax.swing.JFormattedTextField textDate;
    private javax.swing.JTextField textDiscount;
    private javax.swing.JTextField textDueDate;
    private javax.swing.JTextField textPortionNumber;
    private javax.swing.JTextField textReceiptMethod;
    private javax.swing.JTextField textReceiptValue;
    private javax.swing.JTextField textRemaining;
    // End of variables declaration//GEN-END:variables
}
