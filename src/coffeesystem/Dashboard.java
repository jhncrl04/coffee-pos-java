/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coffeesystem;

import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;
import java.time.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saleButtonGroup = new javax.swing.ButtonGroup();
        mainFrame = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        myProfileFrameBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        dashboardBtn = new javax.swing.JButton();
        ourMenuBtn = new javax.swing.JButton();
        productBtn = new javax.swing.JButton();
        orderListBtn = new javax.swing.JButton();
        userListBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dailySalesLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        monthlySalesLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        annualSalesLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dailyPurchasesLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        monthlyPurchasesLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        annualPurchasesLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        salesTable = new javax.swing.JTable();
        dailySalesRB = new javax.swing.JRadioButton();
        monthlySalesRB = new javax.swing.JRadioButton();
        annualSalesRB = new javax.swing.JRadioButton();
        specifyDateRB = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();
        sortingCB = new javax.swing.JComboBox<>();
        dailySalesCB = new javax.swing.JComboBox<>();
        monthlySalesCB = new javax.swing.JComboBox<>();
        annualSalesCB = new javax.swing.JComboBox<>();

        dailySalesRB.setSelected(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 720));

        jSeparator2.setPreferredSize(new java.awt.Dimension(0, 10));

        myProfileFrameBtn.setBackground(new java.awt.Color(230, 230, 230));
        myProfileFrameBtn.setFont(new java.awt.Font("Leelawadee UI", 2, 18)); // NOI18N
        myProfileFrameBtn.setForeground(new java.awt.Color(113, 96, 64));
        myProfileFrameBtn.setText("My Profile");
        myProfileFrameBtn.setBorder(null);
        myProfileFrameBtn.setFocusable(false);
        myProfileFrameBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        myProfileFrameBtn.setPreferredSize(new java.awt.Dimension(170, 40));
        myProfileFrameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myProfileFrameBtnActionPerformed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(230, 230, 230));
        logoutBtn.setFont(new java.awt.Font("Leelawadee UI", 2, 18)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(113, 96, 64));
        logoutBtn.setText("Log Out");
        logoutBtn.setBorder(null);
        logoutBtn.setFocusable(false);
        logoutBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        logoutBtn.setPreferredSize(new java.awt.Dimension(170, 40));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        dashboardBtn.setBackground(new java.awt.Color(232, 231, 230));
        dashboardBtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        dashboardBtn.setForeground(new java.awt.Color(113, 96, 64));
        dashboardBtn.setText("Dashboard");
        dashboardBtn.setBorder(null);
        dashboardBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        dashboardBtn.setPreferredSize(new java.awt.Dimension(170, 40));
        dashboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBtnActionPerformed(evt);
            }
        });

        ourMenuBtn.setBackground(new java.awt.Color(232, 231, 230));
        ourMenuBtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        ourMenuBtn.setForeground(new java.awt.Color(113, 96, 64));
        ourMenuBtn.setText("Our Menu");
        ourMenuBtn.setBorder(null);
        ourMenuBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        ourMenuBtn.setPreferredSize(new java.awt.Dimension(170, 40));
        ourMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ourMenuBtnActionPerformed(evt);
            }
        });

        productBtn.setBackground(new java.awt.Color(232, 231, 230));
        productBtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        productBtn.setForeground(new java.awt.Color(113, 96, 64));
        productBtn.setText("Products");
        productBtn.setBorder(null);
        productBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        productBtn.setPreferredSize(new java.awt.Dimension(170, 40));
        productBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productBtnActionPerformed(evt);
            }
        });

        orderListBtn.setBackground(new java.awt.Color(230, 230, 230));
        orderListBtn.setFont(new java.awt.Font("Leelawadee UI", 3, 18)); // NOI18N
        orderListBtn.setForeground(new java.awt.Color(113, 96, 64));
        orderListBtn.setText("Orders");
        orderListBtn.setBorder(null);
        orderListBtn.setFocusable(false);
        orderListBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        orderListBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        orderListBtn.setPreferredSize(new java.awt.Dimension(170, 40));
        orderListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderListBtnActionPerformed(evt);
            }
        });

        userListBtn.setBackground(new java.awt.Color(230, 230, 230));
        userListBtn.setFont(new java.awt.Font("Leelawadee UI", 3, 18)); // NOI18N
        userListBtn.setForeground(new java.awt.Color(113, 96, 64));
        userListBtn.setText("Users");
        userListBtn.setBorder(null);
        userListBtn.setFocusable(false);
        userListBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        userListBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        userListBtn.setPreferredSize(new java.awt.Dimension(170, 40));
        userListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userListBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myProfileFrameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(userListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(orderListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(productBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ourMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(myProfileFrameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(ourMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(dashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(productBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(orderListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(userListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setPreferredSize(new java.awt.Dimension(980, 800));

        jPanel2.setBackground(new java.awt.Color(249, 244, 239));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 900));

        jPanel3.setBackground(new java.awt.Color(140, 120, 81));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(2, 8, 38), 2, true));

        jLabel1.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(249, 244, 239));
        jLabel1.setText("Sales");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(249, 244, 239));
        jLabel2.setText("Daily Sales");

        dailySalesLabel.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        dailySalesLabel.setForeground(new java.awt.Color(249, 244, 239));
        dailySalesLabel.setText("PHP 0.00");
        dailySalesLabel.setPreferredSize(new java.awt.Dimension(120, 25));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(249, 244, 239));
        jLabel4.setText("Monthly Sales");

        monthlySalesLabel.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        monthlySalesLabel.setForeground(new java.awt.Color(249, 244, 239));
        monthlySalesLabel.setText("PHP 0.00");
        monthlySalesLabel.setPreferredSize(new java.awt.Dimension(120, 25));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(249, 244, 239));
        jLabel11.setText("Annual Sales");

        annualSalesLabel.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        annualSalesLabel.setForeground(new java.awt.Color(249, 244, 239));
        annualSalesLabel.setText("PHP 0.00");
        annualSalesLabel.setPreferredSize(new java.awt.Dimension(120, 25));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(annualSalesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dailySalesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(monthlySalesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dailySalesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthlySalesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(annualSalesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        if(DBQuery.totalDailySale() > 0){
            dailySalesLabel.setText("PHP " + DBQuery.totalDailySale());
        }
        if(DBQuery.totalMonthlySale() > 0){
            monthlySalesLabel.setText("PHP " + DBQuery.totalMonthlySale());
        }
        if(DBQuery.totalAnnualSale() > 0){
            annualSalesLabel.setText("PHP " + DBQuery.totalAnnualSale());
        }

        jPanel4.setBackground(new java.awt.Color(140, 120, 81));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(2, 8, 38), 2, true));

        jLabel6.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(249, 244, 239));
        jLabel6.setText("Purchases");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(249, 244, 239));
        jLabel7.setText("Daily Purchases");

        dailyPurchasesLabel.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        dailyPurchasesLabel.setForeground(new java.awt.Color(249, 244, 239));
        dailyPurchasesLabel.setText("0 pcs");
        dailyPurchasesLabel.setPreferredSize(new java.awt.Dimension(120, 25));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(249, 244, 239));
        jLabel9.setText("Monthly Purchases");

        monthlyPurchasesLabel.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        monthlyPurchasesLabel.setForeground(new java.awt.Color(249, 244, 239));
        monthlyPurchasesLabel.setText("0 pcs");
        monthlyPurchasesLabel.setPreferredSize(new java.awt.Dimension(120, 25));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(249, 244, 239));
        jLabel13.setText("Annual Puchases");

        annualPurchasesLabel.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        annualPurchasesLabel.setForeground(new java.awt.Color(249, 244, 239));
        annualPurchasesLabel.setText("0 pcs");
        annualPurchasesLabel.setPreferredSize(new java.awt.Dimension(120, 25));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dailyPurchasesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(monthlyPurchasesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(annualPurchasesLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dailyPurchasesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthlyPurchasesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(annualPurchasesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        dailyPurchasesLabel.setText(DBQuery.totalDailyPurchase() + " pcs");
        monthlyPurchasesLabel.setText(DBQuery.totalMonthlyPurchase() + " pcs");
        annualPurchasesLabel.setText(DBQuery.totalAnnualPurchase() + " pcs");

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel3.setText("Sales Table");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        salesTable.setBackground(new java.awt.Color(240, 240, 240));
        salesTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(221, 221, 221), 3, true));
        salesTable.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        salesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Beverages", "Size", "Price", "Qnty", "Total Sales", "Date"
            }
        ){
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return false;
            }
        });
        salesTable.setRowHeight(25);
        jScrollPane2.setViewportView(salesTable);
        JTableHeader header = salesTable.getTableHeader();

        Dimension d = header.getPreferredSize();
        header.setPreferredSize(new Dimension(d.width, 30));
        header.setFont(new java.awt.Font("SansSerif", 1, 15));
        header.setBackground(new java.awt.Color(240,240,240));

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );

        for(int i = 0; i < salesTable.getColumnCount(); i++){
            salesTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        dailySalesRB.setBackground(new java.awt.Color(249, 244, 239));
        saleButtonGroup.add(dailySalesRB);
        dailySalesRB.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        dailySalesRB.setText("Daily Sales");
        dailySalesRB.setPreferredSize(new java.awt.Dimension(110, 35));
        dailySalesRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailySalesRBActionPerformed(evt);
            }
        });

        monthlySalesRB.setBackground(new java.awt.Color(249, 244, 239));
        saleButtonGroup.add(monthlySalesRB);
        monthlySalesRB.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        monthlySalesRB.setText("Monthly Sales");
        monthlySalesRB.setPreferredSize(new java.awt.Dimension(110, 35));
        monthlySalesRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlySalesRBActionPerformed(evt);
            }
        });

        annualSalesRB.setBackground(new java.awt.Color(249, 244, 239));
        saleButtonGroup.add(annualSalesRB);
        annualSalesRB.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        annualSalesRB.setText("Annual Sales");
        annualSalesRB.setPreferredSize(new java.awt.Dimension(110, 35));
        annualSalesRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annualSalesRBActionPerformed(evt);
            }
        });

        specifyDateRB.setBackground(new java.awt.Color(249, 244, 239));
        saleButtonGroup.add(specifyDateRB);
        specifyDateRB.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        specifyDateRB.setText("Specified Date");
        specifyDateRB.setPreferredSize(new java.awt.Dimension(110, 35));
        specifyDateRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specifyDateRBActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(140, 120, 81));
        jButton7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 254));
        jButton7.setText("Refresh");
        jButton7.setPreferredSize(new java.awt.Dimension(120, 35));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        sortingCB.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        sortingCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sort by Product Name(Asc)", "Sort by Product Name(Desc)", "Sort by Quantity(Asc)", "Sort by Quantity(Desc)", "Sort by Total Sales(Asc)", "Sort by Total Sales (Desc)" }));
        sortingCB.setPreferredSize(new java.awt.Dimension(180, 35));
        sortingCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortingCBActionPerformed(evt);
            }
        });

        dailySalesCB.setPreferredSize(new java.awt.Dimension(110, 25));

        monthlySalesCB.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        monthlySalesCB.setPreferredSize(new java.awt.Dimension(110, 25));

        annualSalesCB.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        annualSalesCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2023", "2022", "2021", "2020" }));
        annualSalesCB.setPreferredSize(new java.awt.Dimension(110, 25));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(sortingCB, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dailySalesRB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dailySalesCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(monthlySalesRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(monthlySalesCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(annualSalesCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(annualSalesRB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(specifyDateRB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(129, 129, 129)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1037, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dailySalesRB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthlySalesRB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annualSalesRB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortingCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(specifyDateRB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthlySalesCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dailySalesCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annualSalesCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        dailySalesRB.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                dailySalesCB.setVisible(true);
                monthlySalesCB.setVisible(false);
                annualSalesCB.setVisible(false);

                Dashboard.dailySalesCB.setSelectedIndex(LocalDate.now().getDayOfMonth() - 1);
            }
        });
        monthlySalesRB.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                dailySalesCB.setVisible(false);
                monthlySalesCB.setVisible(true);
                annualSalesCB.setVisible(false);

                Dashboard.monthlySalesCB.setSelectedIndex(LocalDate.now().getMonth().getValue() - 1);
            }
        });
        annualSalesRB.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                dailySalesCB.setVisible(false);
                monthlySalesCB.setVisible(false);
                annualSalesCB.setVisible(true);
            }
        });
        specifyDateRB.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                dailySalesCB.setVisible(true);
                monthlySalesCB.setVisible(true);
                annualSalesCB.setVisible(true);
            }
        });
        DBQuery.loadSales("productTB.productName ASC");
        boolean isLeapYear = (Year.now().getValue() % 4 == 0) ? true : false;

        for(int i = 1; i <= LocalDate.now().getMonth().length(isLeapYear) - (LocalDate.now().getMonth().length(isLeapYear) - LocalDate.now().getDayOfMonth()); i++){
            Dashboard.dailySalesCB.addItem(String.valueOf(i));
        }
        Dashboard.dailySalesCB.setSelectedIndex(LocalDate.now().getDayOfMonth() - 1);
        monthlySalesCB.setVisible(false);

        for (final Month month : Month.values()) {
            Dashboard.monthlySalesCB.addItem(month.toString());
        }
        Dashboard.monthlySalesCB.setSelectedIndex(LocalDate.now().getMonth().getValue() - 1);
        annualSalesCB.setVisible(false);

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout mainFrameLayout = new javax.swing.GroupLayout(mainFrame);
        mainFrame.setLayout(mainFrameLayout);
        mainFrameLayout.setHorizontalGroup(
            mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFrameLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1194, Short.MAX_VALUE))
        );
        mainFrameLayout.setVerticalGroup(
            mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        jScrollPane1.getVerticalScrollBar().setUnitIncrement(20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myProfileFrameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myProfileFrameBtnActionPerformed
        // TODO add your handling code here:
        Account accountFrame = new Account();
        accountFrame.setVisible(true);
        accountFrame.pack();
        accountFrame.setLocationRelativeTo(null);
                
        Account.ourMenuBtn.setText("Dashboard");
        Account.productBtn.setText("Products");
        Account.orderListBtn.setVisible(true);
        Account.userListBtn.setVisible(true);
                
        this.dispose();
    }//GEN-LAST:event_myProfileFrameBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        int confirmLogout = JOptionPane.showConfirmDialog(null, "Do you want to logout?", "Log Out", JOptionPane.YES_NO_OPTION);
        
        if (confirmLogout == JOptionPane.YES_NO_OPTION){
            LogIn LogInFrame = new LogIn();
            LogInFrame.setVisible(true);
            LogInFrame.pack();
            LogInFrame.setLocationRelativeTo(null);
            
            this.dispose();
        }
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void dailySalesRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailySalesRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dailySalesRBActionPerformed

    private void monthlySalesRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlySalesRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthlySalesRBActionPerformed

    private void annualSalesRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annualSalesRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_annualSalesRBActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here: 
        methods.clearTable(salesTable.getModel());
        String[] sortList = {"productTB.productName ASC", "productTB.productName DESC", "totalProductQnty ASC", "totalProductQnty DESC", "totalSales ASC", "totalSales DESC"};
                
        DBQuery.loadSales(sortList[sortingCB.getSelectedIndex()]);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void specifyDateRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specifyDateRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_specifyDateRBActionPerformed

    private void sortingCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortingCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortingCBActionPerformed

    private void dashboardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dashboardBtnActionPerformed

    private void ourMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ourMenuBtnActionPerformed
        // TODO add your handling code here:
        Menu menuFrame = new Menu();
        menuFrame.setVisible(true);
        menuFrame.pack();
        menuFrame.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_ourMenuBtnActionPerformed

    private void productBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productBtnActionPerformed
        // TODO add your handling code here:
        ProductPage productFrame = new ProductPage();
        productFrame.setVisible(true);
        productFrame.pack();
        productFrame.setLocationRelativeTo(null);

        this.dispose();

    }//GEN-LAST:event_productBtnActionPerformed

    private void orderListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderListBtnActionPerformed
        // TODO add your handling code here:
        OrderPage orderPageFrame = new OrderPage();
        orderPageFrame.setVisible(true);
        orderPageFrame.pack();
        orderPageFrame.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_orderListBtnActionPerformed

    private void userListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userListBtnActionPerformed
        // TODO add your handling code here:
        UserPage userFrame = new UserPage();
        userFrame.setVisible(true);
        userFrame.pack();
        userFrame.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_userListBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel annualPurchasesLabel;
    public static javax.swing.JComboBox<String> annualSalesCB;
    public static javax.swing.JLabel annualSalesLabel;
    public static javax.swing.JRadioButton annualSalesRB;
    public static javax.swing.JLabel dailyPurchasesLabel;
    public static javax.swing.JComboBox<String> dailySalesCB;
    public static javax.swing.JLabel dailySalesLabel;
    public static javax.swing.JRadioButton dailySalesRB;
    public static javax.swing.JButton dashboardBtn;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel mainFrame;
    public static javax.swing.JLabel monthlyPurchasesLabel;
    public static javax.swing.JComboBox<String> monthlySalesCB;
    public static javax.swing.JLabel monthlySalesLabel;
    public static javax.swing.JRadioButton monthlySalesRB;
    private javax.swing.JButton myProfileFrameBtn;
    public static javax.swing.JButton orderListBtn;
    public static javax.swing.JButton ourMenuBtn;
    public static javax.swing.JButton productBtn;
    public static javax.swing.ButtonGroup saleButtonGroup;
    public static javax.swing.JTable salesTable;
    public static javax.swing.JComboBox<String> sortingCB;
    public static javax.swing.JRadioButton specifyDateRB;
    public static javax.swing.JButton userListBtn;
    // End of variables declaration//GEN-END:variables
}
