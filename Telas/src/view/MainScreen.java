/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.client.ClientConsultScreen;
import view.client.ClientRegisterScreen;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import view.provider.ProviderConsultScreen;
import view.provider.ProviderRegisterScreen;
import view.sale.SaleRegisterScreen;

/**
 *
 * @author weth767
 */
public class MainScreen extends javax.swing.JFrame {
    
    private JDesktopPane panel;
   
    /**
     * Creates new form Main
     */
    public MainScreen() {
        initComponents();
        Dimension DimMax = Toolkit.getDefaultToolkit().getScreenSize();
        this.setMaximumSize(DimMax);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        panel = new JDesktopPane();
        setContentPane(panel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        menuClient = new javax.swing.JMenu();
        clientCreate = new javax.swing.JMenuItem();
        clientConsult = new javax.swing.JMenuItem();
        menuProvider = new javax.swing.JMenu();
        providerCreate = new javax.swing.JMenuItem();
        providerConsult = new javax.swing.JMenuItem();
        menuEmployee = new javax.swing.JMenu();
        employeeCreate = new javax.swing.JMenuItem();
        employeeConsult = new javax.swing.JMenuItem();
        menuProduct = new javax.swing.JMenu();
        productCreate = new javax.swing.JMenuItem();
        productConsult = new javax.swing.JMenuItem();
        menuBrand = new javax.swing.JMenu();
        brandCreate = new javax.swing.JMenuItem();
        brandConsult = new javax.swing.JMenuItem();
        menuCategory = new javax.swing.JMenu();
        categoryCreate = new javax.swing.JMenuItem();
        categoryConsult = new javax.swing.JMenuItem();
        menuFinances = new javax.swing.JMenu();
        financesRegisterSale = new javax.swing.JMenuItem();
        financesConsultSales = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        financesRegisterPurchase = new javax.swing.JMenuItem();
        financesConsultPurchases = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        financesPaymentRegister = new javax.swing.JMenuItem();
        financesPaymentConsult = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        financesReceiveRegister = new javax.swing.JMenuItem();
        financesReceiveConsult = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        financesCashier = new javax.swing.JMenuItem();
        menuReport = new javax.swing.JMenu();
        menuSaleReport = new javax.swing.JMenuItem();
        menuPurchaseReport = new javax.swing.JMenuItem();
        menuSaleMonthlyHistory = new javax.swing.JMenuItem();
        amountProductReport = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("ACEA");
        setName("mainScreen"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        menuClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/client-24.png"))); // NOI18N
        menuClient.setText("Cliente");

        clientCreate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        clientCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/add-24.png"))); // NOI18N
        clientCreate.setText("Cadastrar");
        clientCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientCreateActionPerformed(evt);
            }
        });
        menuClient.add(clientCreate);

        clientConsult.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        clientConsult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/search-24.png"))); // NOI18N
        clientConsult.setText("Consultar");
        clientConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientConsultActionPerformed(evt);
            }
        });
        menuClient.add(clientConsult);

        menuBar.add(menuClient);

        menuProvider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/provider-24.png"))); // NOI18N
        menuProvider.setText("Fornecedor");

        providerCreate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        providerCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/add-24.png"))); // NOI18N
        providerCreate.setText("Cadastrar");
        providerCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                providerCreateActionPerformed(evt);
            }
        });
        menuProvider.add(providerCreate);

        providerConsult.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        providerConsult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/search-24.png"))); // NOI18N
        providerConsult.setText("Consultar");
        providerConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                providerConsultActionPerformed(evt);
            }
        });
        menuProvider.add(providerConsult);

        menuBar.add(menuProvider);

        menuEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/employee-24.png"))); // NOI18N
        menuEmployee.setText("Funcionário");

        employeeCreate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        employeeCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/add-24.png"))); // NOI18N
        employeeCreate.setText("Cadastrar");
        employeeCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeCreateActionPerformed(evt);
            }
        });
        menuEmployee.add(employeeCreate);

        employeeConsult.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        employeeConsult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/search-24.png"))); // NOI18N
        employeeConsult.setText("Consultar");
        employeeConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeConsultActionPerformed(evt);
            }
        });
        menuEmployee.add(employeeConsult);

        menuBar.add(menuEmployee);

        menuProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/product-24.png"))); // NOI18N
        menuProduct.setText("Produto");

        productCreate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        productCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/add-24.png"))); // NOI18N
        productCreate.setText("Cadastrar");
        productCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productCreateActionPerformed(evt);
            }
        });
        menuProduct.add(productCreate);

        productConsult.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        productConsult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/search-24.png"))); // NOI18N
        productConsult.setText("Consultar");
        productConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productConsultActionPerformed(evt);
            }
        });
        menuProduct.add(productConsult);

        menuBar.add(menuProduct);

        menuBrand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/brand-24.png"))); // NOI18N
        menuBrand.setText("Marca");

        brandCreate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        brandCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/add-24.png"))); // NOI18N
        brandCreate.setText("Cadastrar");
        brandCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandCreateActionPerformed(evt);
            }
        });
        menuBrand.add(brandCreate);

        brandConsult.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        brandConsult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/search-24.png"))); // NOI18N
        brandConsult.setText("Consultar");
        brandConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandConsultActionPerformed(evt);
            }
        });
        menuBrand.add(brandConsult);

        menuBar.add(menuBrand);

        menuCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/category-24.png"))); // NOI18N
        menuCategory.setText("Categoria");

        categoryCreate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        categoryCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/add-24.png"))); // NOI18N
        categoryCreate.setText("Cadastrar");
        categoryCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryCreateActionPerformed(evt);
            }
        });
        menuCategory.add(categoryCreate);

        categoryConsult.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        categoryConsult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/search-24.png"))); // NOI18N
        categoryConsult.setText("Consultar");
        categoryConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryConsultActionPerformed(evt);
            }
        });
        menuCategory.add(categoryConsult);

        menuBar.add(menuCategory);

        menuFinances.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/finances-24.png"))); // NOI18N
        menuFinances.setText("Financeiro");

        financesRegisterSale.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        financesRegisterSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/sale-24.png"))); // NOI18N
        financesRegisterSale.setText("Venda");
        financesRegisterSale.setToolTipText("");
        financesRegisterSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                financesRegisterSaleActionPerformed(evt);
            }
        });
        menuFinances.add(financesRegisterSale);

        financesConsultSales.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        financesConsultSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/search-24.png"))); // NOI18N
        financesConsultSales.setText("Consultar Vendas");
        financesConsultSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                financesConsultSalesActionPerformed(evt);
            }
        });
        menuFinances.add(financesConsultSales);
        menuFinances.add(jSeparator1);

        financesRegisterPurchase.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        financesRegisterPurchase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/purchase-24.png"))); // NOI18N
        financesRegisterPurchase.setText("Compra");
        financesRegisterPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                financesRegisterPurchaseActionPerformed(evt);
            }
        });
        menuFinances.add(financesRegisterPurchase);

        financesConsultPurchases.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        financesConsultPurchases.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/search-24.png"))); // NOI18N
        financesConsultPurchases.setText("Consultar Compras");
        financesConsultPurchases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                financesConsultPurchasesActionPerformed(evt);
            }
        });
        menuFinances.add(financesConsultPurchases);
        menuFinances.add(jSeparator2);

        financesPaymentRegister.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        financesPaymentRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/payment-24.png"))); // NOI18N
        financesPaymentRegister.setText("Pagamento");
        financesPaymentRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                financesPaymentRegisterActionPerformed(evt);
            }
        });
        menuFinances.add(financesPaymentRegister);

        financesPaymentConsult.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        financesPaymentConsult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/search-24.png"))); // NOI18N
        financesPaymentConsult.setText("Consultar Pagamentos");
        financesPaymentConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                financesPaymentConsultActionPerformed(evt);
            }
        });
        menuFinances.add(financesPaymentConsult);
        menuFinances.add(jSeparator4);

        financesReceiveRegister.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        financesReceiveRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/receive-24.png"))); // NOI18N
        financesReceiveRegister.setText("Recebimento");
        financesReceiveRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                financesReceiveRegisterActionPerformed(evt);
            }
        });
        menuFinances.add(financesReceiveRegister);

        financesReceiveConsult.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        financesReceiveConsult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/search-24.png"))); // NOI18N
        financesReceiveConsult.setText("Consultar Recebimentos");
        financesReceiveConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                financesReceiveConsultActionPerformed(evt);
            }
        });
        menuFinances.add(financesReceiveConsult);
        menuFinances.add(jSeparator3);

        financesCashier.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        financesCashier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/cashier-24.png"))); // NOI18N
        financesCashier.setText("Caixa");
        financesCashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                financesCashierActionPerformed(evt);
            }
        });
        menuFinances.add(financesCashier);

        menuBar.add(menuFinances);

        menuReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/report-24.png"))); // NOI18N
        menuReport.setText("Relatórios");

        menuSaleReport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuSaleReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/sale-24.png"))); // NOI18N
        menuSaleReport.setText("Relatório de Vendas");
        menuSaleReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaleReportActionPerformed(evt);
            }
        });
        menuReport.add(menuSaleReport);

        menuPurchaseReport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuPurchaseReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/purchase-24.png"))); // NOI18N
        menuPurchaseReport.setText("Relatório de Compras");
        menuPurchaseReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPurchaseReportActionPerformed(evt);
            }
        });
        menuReport.add(menuPurchaseReport);

        menuSaleMonthlyHistory.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuSaleMonthlyHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/report-24.png"))); // NOI18N
        menuSaleMonthlyHistory.setText("Relatório de Ficha Mensal");
        menuSaleMonthlyHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaleMonthlyHistoryActionPerformed(evt);
            }
        });
        menuReport.add(menuSaleMonthlyHistory);

        amountProductReport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        amountProductReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/product-24.png"))); // NOI18N
        amountProductReport.setText("Relatório de Estoque de Produtos");
        amountProductReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountProductReportActionPerformed(evt);
            }
        });
        menuReport.add(amountProductReport);

        menuBar.add(menuReport);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int answer = JOptionPane.showConfirmDialog(this,"Deseja realmente sair do sistema?",
                "Verificação de saída", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(answer == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void clientCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientCreateActionPerformed
        ClientRegisterScreen crscreen = new ClientRegisterScreen();
        panel.add(crscreen);
        crscreen.setVisible(true);
        crscreen.show();
    }//GEN-LAST:event_clientCreateActionPerformed

    private void clientConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientConsultActionPerformed
        ClientConsultScreen ccscreen = new ClientConsultScreen(this);
        panel.add(ccscreen);
        ccscreen.setVisible(true);
        ccscreen.show();
    }//GEN-LAST:event_clientConsultActionPerformed

    private void providerCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_providerCreateActionPerformed
        ProviderRegisterScreen prscreen = new ProviderRegisterScreen();
        panel.add(prscreen);
        prscreen.setVisible(true);
        prscreen.show();
    }//GEN-LAST:event_providerCreateActionPerformed

    private void providerConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_providerConsultActionPerformed
        ProviderConsultScreen pcscreen = new ProviderConsultScreen();
        panel.add(pcscreen);
        pcscreen.setVisible(true);
        pcscreen.show();
    }//GEN-LAST:event_providerConsultActionPerformed

    private void financesRegisterSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_financesRegisterSaleActionPerformed
        SaleRegisterScreen srscreen = new SaleRegisterScreen();
        panel.add(srscreen);
        srscreen.setVisible(true);
        srscreen.show();
    }//GEN-LAST:event_financesRegisterSaleActionPerformed

    private void brandCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandCreateActionPerformed
        
    }//GEN-LAST:event_brandCreateActionPerformed

    private void brandConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandConsultActionPerformed
        
    }//GEN-LAST:event_brandConsultActionPerformed

    private void employeeCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeCreateActionPerformed
        
    }//GEN-LAST:event_employeeCreateActionPerformed

    private void employeeConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeConsultActionPerformed
        
    }//GEN-LAST:event_employeeConsultActionPerformed

    private void productCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productCreateActionPerformed
        
    }//GEN-LAST:event_productCreateActionPerformed

    private void productConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productConsultActionPerformed
        
    }//GEN-LAST:event_productConsultActionPerformed

    private void categoryCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryCreateActionPerformed
        
    }//GEN-LAST:event_categoryCreateActionPerformed

    private void categoryConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryConsultActionPerformed
       
    }//GEN-LAST:event_categoryConsultActionPerformed

    private void financesRegisterPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_financesRegisterPurchaseActionPerformed
        
    }//GEN-LAST:event_financesRegisterPurchaseActionPerformed

    private void financesPaymentRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_financesPaymentRegisterActionPerformed
        
    }//GEN-LAST:event_financesPaymentRegisterActionPerformed

    private void financesReceiveRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_financesReceiveRegisterActionPerformed
        
    }//GEN-LAST:event_financesReceiveRegisterActionPerformed

    private void financesCashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_financesCashierActionPerformed
        
    }//GEN-LAST:event_financesCashierActionPerformed

    private void menuPurchaseReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPurchaseReportActionPerformed
       
    }//GEN-LAST:event_menuPurchaseReportActionPerformed

    private void menuSaleMonthlyHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaleMonthlyHistoryActionPerformed
        
    }//GEN-LAST:event_menuSaleMonthlyHistoryActionPerformed

    private void menuSaleReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaleReportActionPerformed
        
    }//GEN-LAST:event_menuSaleReportActionPerformed

    private void amountProductReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountProductReportActionPerformed
        
    }//GEN-LAST:event_amountProductReportActionPerformed

    private void financesConsultSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_financesConsultSalesActionPerformed
        
    }//GEN-LAST:event_financesConsultSalesActionPerformed

    private void financesConsultPurchasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_financesConsultPurchasesActionPerformed
        
    }//GEN-LAST:event_financesConsultPurchasesActionPerformed

    private void financesPaymentConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_financesPaymentConsultActionPerformed
        
    }//GEN-LAST:event_financesPaymentConsultActionPerformed

    private void financesReceiveConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_financesReceiveConsultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_financesReceiveConsultActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem amountProductReport;
    private javax.swing.JMenuItem brandConsult;
    private javax.swing.JMenuItem brandCreate;
    private javax.swing.JMenuItem categoryConsult;
    private javax.swing.JMenuItem categoryCreate;
    private javax.swing.JMenuItem clientConsult;
    private javax.swing.JMenuItem clientCreate;
    private javax.swing.JMenuItem employeeConsult;
    private javax.swing.JMenuItem employeeCreate;
    private javax.swing.JMenuItem financesCashier;
    private javax.swing.JMenuItem financesConsultPurchases;
    private javax.swing.JMenuItem financesConsultSales;
    private javax.swing.JMenuItem financesPaymentConsult;
    private javax.swing.JMenuItem financesPaymentRegister;
    private javax.swing.JMenuItem financesReceiveConsult;
    private javax.swing.JMenuItem financesReceiveRegister;
    private javax.swing.JMenuItem financesRegisterPurchase;
    private javax.swing.JMenuItem financesRegisterSale;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuBrand;
    private javax.swing.JMenu menuCategory;
    private javax.swing.JMenu menuClient;
    private javax.swing.JMenu menuEmployee;
    private javax.swing.JMenu menuFinances;
    private javax.swing.JMenu menuProduct;
    private javax.swing.JMenu menuProvider;
    private javax.swing.JMenuItem menuPurchaseReport;
    private javax.swing.JMenu menuReport;
    private javax.swing.JMenuItem menuSaleMonthlyHistory;
    private javax.swing.JMenuItem menuSaleReport;
    private javax.swing.JMenuItem productConsult;
    private javax.swing.JMenuItem productCreate;
    private javax.swing.JMenuItem providerConsult;
    private javax.swing.JMenuItem providerCreate;
    // End of variables declaration//GEN-END:variables
}
