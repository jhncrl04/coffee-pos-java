/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coffeesystem;

import java.awt.*;
import javax.swing.border.*;
import javax.swing.*;

/**
 *
 * @author johnc
 */
public class SecurityQuestion extends javax.swing.JFrame {
    
    Border rounded = new LineBorder(new Color(102, 102, 102), 1, true);
    Border empty = new EmptyBorder(0, 10, 0, 0);
    Border border = new CompoundBorder(rounded, empty);
    
    public SecurityQuestion() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        securityAnsField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        securityQuestionField = new javax.swing.JTextField();
        resetPassBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Confirm Account");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(234, 221, 207));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 450));

        jLabel1.setBackground(new java.awt.Color(232, 231, 230));
        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 8, 38));
        jLabel1.setText("Confirm Account");

        jLabel2.setBackground(new java.awt.Color(249, 244, 239));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 8, 38));
        jLabel2.setText("Security Question");

        securityAnsField.setBackground(new java.awt.Color(217, 217, 217));
        securityAnsField.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        securityAnsField.setForeground(new java.awt.Color(59, 44, 39));
        securityAnsField.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        securityAnsField.setPreferredSize(new java.awt.Dimension(430, 40));
        securityAnsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                securityAnsFieldActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(249, 244, 239));
        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 8, 38));
        jLabel3.setText("Security Answer");

        securityQuestionField.setEditable(false);
        securityQuestionField.setBackground(new java.awt.Color(217, 217, 217));
        securityQuestionField.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        securityQuestionField.setForeground(new java.awt.Color(59, 44, 39));
        securityQuestionField.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        securityQuestionField.setCaretColor(new java.awt.Color(217, 217, 217));
        securityQuestionField.setEnabled(false);
        securityQuestionField.setFocusable(false);
        securityQuestionField.setPreferredSize(new java.awt.Dimension(430, 40));
        securityQuestionField.setRequestFocusEnabled(false);
        securityQuestionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                securityQuestionFieldActionPerformed(evt);
            }
        });

        resetPassBtn.setBackground(new java.awt.Color(140, 120, 81));
        resetPassBtn.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        resetPassBtn.setForeground(new java.awt.Color(255, 255, 254));
        resetPassBtn.setText("Confirm Answer");
        resetPassBtn.setBorder(null);
        resetPassBtn.setPreferredSize(new java.awt.Dimension(120, 30));
        resetPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetPassBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resetPassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(securityQuestionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(securityAnsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addComponent(securityQuestionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addComponent(securityAnsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(resetPassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        securityAnsField.setBorder(border);
        securityQuestionField.setText(DBQuery.getSecurityQuestion());

        securityQuestionField.setBorder(border);
        securityQuestionField.setDisabledTextColor(new java.awt.Color(59,44,39));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void securityAnsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_securityAnsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_securityAnsFieldActionPerformed

    private void securityQuestionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_securityQuestionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_securityQuestionFieldActionPerformed

    private void resetPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetPassBtnActionPerformed
        // TODO add your handling code here:
        if(DBQuery.checkSecurityAns()){
            DBQuery.updatePassword(methods.passwordHashing(ForgotPassword.confirmPassFieldFP.getText()), ForgotPassword.emailTextfield.getText());
            
            ForgotPassword.emailTextfield.setText("");
            ForgotPassword.newPassFieldFP.setText("");
            ForgotPassword.confirmPassFieldFP.setText("");
            
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Sorry\nIncorrect security answer");
            this.dispose();
        }
    }//GEN-LAST:event_resetPassBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SecurityQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecurityQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecurityQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecurityQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecurityQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton resetPassBtn;
    public static javax.swing.JTextField securityAnsField;
    private javax.swing.JTextField securityQuestionField;
    // End of variables declaration//GEN-END:variables
}
