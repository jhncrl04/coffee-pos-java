/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coffeesystem;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;
import java.util.regex.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author johnc
 */
public class EditProduct extends javax.swing.JFrame {

    // Create a border for text fields
    Border rounded = new LineBorder(new Color(102, 102, 102), 1, true);
    Border empty = new EmptyBorder(0, 10, 0, 0);
    Border border = new CompoundBorder(rounded, empty);
    
    private static JFrame parentFrame;
    private static Vector data;
    
    public EditProduct(JFrame parentFrame,Vector data) {
        this.parentFrame = parentFrame;
        this.data = data;
        
        this.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e){
                parentFrame.setEnabled(true);
            }
        });
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        productNameTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        productSizeTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        productCategoryTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        productPriceTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        availableRB = new javax.swing.JRadioButton();
        notAvailableRB = new javax.swing.JRadioButton();
        updateBtn = new javax.swing.JButton();

        if(data.get(5).equals("Available")){
            availableRB.setSelected(true);
        }
        else if(data.get(5).equals("Not Available")){
            notAvailableRB.setSelected(true);
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(249, 244, 239));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 3, 18)); // NOI18N
        jLabel1.setText("Edit Product No: ");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel3.setText("Product Name:");
        jLabel3.setPreferredSize(new java.awt.Dimension(110, 35));

        productNameTF.setEditable(false);
        productNameTF.setBackground(new java.awt.Color(153, 153, 153));
        productNameTF.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        productNameTF.setForeground(new java.awt.Color(255, 255, 255));
        productNameTF.setEnabled(false);
        productNameTF.setFocusable(false);
        productNameTF.setPreferredSize(new java.awt.Dimension(275, 35));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel4.setText("Size:");
        jLabel4.setPreferredSize(new java.awt.Dimension(110, 35));

        productSizeTF.setBackground(new java.awt.Color(217, 217, 217));
        productSizeTF.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        productSizeTF.setForeground(new java.awt.Color(71, 54, 47));
        productSizeTF.setPreferredSize(new java.awt.Dimension(275, 35));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel5.setText("Category:");
        jLabel5.setPreferredSize(new java.awt.Dimension(110, 35));

        productCategoryTF.setBackground(new java.awt.Color(217, 217, 217));
        productCategoryTF.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        productCategoryTF.setForeground(new java.awt.Color(71, 54, 47));
        productCategoryTF.setPreferredSize(new java.awt.Dimension(275, 35));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel6.setText("Price:");
        jLabel6.setPreferredSize(new java.awt.Dimension(110, 35));

        productPriceTF.setBackground(new java.awt.Color(217, 217, 217));
        productPriceTF.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        productPriceTF.setForeground(new java.awt.Color(71, 54, 47));
        productPriceTF.setPreferredSize(new java.awt.Dimension(275, 35));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel7.setText("Availability:");
        jLabel7.setPreferredSize(new java.awt.Dimension(110, 35));

        availableRB.setBackground(new java.awt.Color(249, 244, 239));
        buttonGroup1.add(availableRB);
        availableRB.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        availableRB.setText("Available");

        notAvailableRB.setBackground(new java.awt.Color(249, 244, 239));
        buttonGroup1.add(notAvailableRB);
        notAvailableRB.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        notAvailableRB.setText("Not Available");

        updateBtn.setBackground(new java.awt.Color(140, 120, 81));
        updateBtn.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 254));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(productCategoryTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(availableRB)
                            .addGap(33, 33, 33)
                            .addComponent(notAvailableRB))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(productPriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(productNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(productSizeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productCategoryTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productSizeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productPriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(availableRB)
                    .addComponent(notAvailableRB))
                .addGap(40, 40, 40)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jLabel1.setText(jLabel1.getText() + " " + data.get(0));
        productNameTF.setBorder(border);
        productNameTF.setText((String) data.get(1));
        productNameTF.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        productSizeTF.setBorder(border);
        productSizeTF.setText((String) data.get(2));
        productCategoryTF.setBorder(border);

        productCategoryTF.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        productCategoryTF.setText((String) data.get(3));
        if(data.get(3).equals("Fruit Soda")){
            productCategoryTF.setBackground(new java.awt.Color(153, 153, 153));
            productCategoryTF.setEnabled(false);
        }
        else{
            productCategoryTF.setEnabled(true);
        }
        productPriceTF.setBorder(border);
        productPriceTF.setText((String) data.get(4));
        availableRB.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
            }
        });
        notAvailableRB.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        String productName = productNameTF.getText();
        String productCategory = productCategoryTF.getText();
        String productSize = productSizeTF.getText();
        String productPrice = productPriceTF.getText();
        boolean isAvailable = (methods.getSelectedButton(buttonGroup1).equals("Available"));
        
        if(!(productCategory.equalsIgnoreCase("Hot Coffee") || productCategory.equalsIgnoreCase("Iced Coffee") || productCategory.equalsIgnoreCase("Hot") || productCategory.equalsIgnoreCase("Iced") || productCategory.equalsIgnoreCase("Fruit Soda"))){
            JOptionPane.showMessageDialog(null, "Category must either be:\nHot Coffee or Iced Coffee\n or simply just Hot or Iced");
        }
        else if(!(Pattern.matches("^\\d+ oz$", productSize.toLowerCase()) || Pattern.matches("^\\d+$", productSize))){
            JOptionPane.showMessageDialog(null, "Invalid size\nPlease use the format: '# oz' or '#'");
        }
        else if(!(Pattern.matches("^PHP +\\d+$", productPrice) || Pattern.matches("^\\d+$", productPrice) || Pattern.matches("^PHP +\\d+\\.?\\d{2}+$", productPrice) || Pattern.matches("^\\d+\\.?\\d{2}+$", productPrice))){
            JOptionPane.showMessageDialog(null, "Invalid price:\nPrice must be in format of:\n'PHP ##.##' or '##.##'");
        }
        else{
            DBQuery.updateProductTb((int) data.get(0), productName, productCategory, productSize, productPrice, isAvailable);
            
            methods.clearTable(ProductPage.beveragesTable.getModel());
            DBQuery.loadProducts();
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(EditProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProduct(parentFrame, data).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JRadioButton availableRB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JRadioButton notAvailableRB;
    public static javax.swing.JTextField productCategoryTF;
    public static javax.swing.JTextField productNameTF;
    public static javax.swing.JTextField productPriceTF;
    public static javax.swing.JTextField productSizeTF;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
