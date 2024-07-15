/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coffeesystem;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.*;

public class ForgotPassword extends javax.swing.JFrame {

    Border rounded = new LineBorder(new Color(102, 102, 102), 1, true);
    Border empty = new EmptyBorder(0, 10, 0, 0);
    Border border = new CompoundBorder(rounded, empty);
    
    public ForgotPassword() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        emailTextfield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        newPassFieldFP = new javax.swing.JPasswordField();
        confirmPassFieldFP = new javax.swing.JPasswordField();
        resetPassBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Forgot Password");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(234, 221, 207));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel1.setBackground(new java.awt.Color(232, 231, 230));
        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 8, 38));
        jLabel1.setText("Reset my password");

        emailTextfield.setBackground(new java.awt.Color(217, 217, 217));
        emailTextfield.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        emailTextfield.setForeground(new java.awt.Color(59, 44, 39));
        emailTextfield.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        emailTextfield.setPreferredSize(new java.awt.Dimension(430, 40));
        emailTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextfieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 8, 38));
        jLabel2.setText("Email");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(2, 8, 38));
        jLabel5.setText("New Password");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(2, 8, 38));
        jLabel6.setText("Confirm Password");

        newPassFieldFP.setBackground(new java.awt.Color(217, 217, 217));
        newPassFieldFP.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        newPassFieldFP.setForeground(new java.awt.Color(59, 44, 39));
        newPassFieldFP.setToolTipText("");
        newPassFieldFP.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        newPassFieldFP.setPreferredSize(new java.awt.Dimension(430, 40));

        confirmPassFieldFP.setBackground(new java.awt.Color(217, 217, 217));
        confirmPassFieldFP.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        confirmPassFieldFP.setForeground(new java.awt.Color(59, 44, 39));
        confirmPassFieldFP.setToolTipText("");
        confirmPassFieldFP.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        confirmPassFieldFP.setPreferredSize(new java.awt.Dimension(430, 40));

        resetPassBtn.setBackground(new java.awt.Color(140, 120, 81));
        resetPassBtn.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        resetPassBtn.setForeground(new java.awt.Color(255, 255, 254));
        resetPassBtn.setText("Reset Password");
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
                    .addComponent(confirmPassFieldFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPassFieldFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetPassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newPassFieldFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmPassFieldFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(resetPassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        emailTextfield.setBorder(border);
        newPassFieldFP.setBorder(border);
        confirmPassFieldFP.setBorder(border);

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

    private void emailTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextfieldActionPerformed

    private void resetPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetPassBtnActionPerformed
        // TODO add your handling code here:

        // Check if any field is empty
        if(emailTextfield.getText().isEmpty() || newPassFieldFP.getText().isEmpty() || confirmPassFieldFP.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill all the fields to continue");
        }
        // If no field is empty, Check if both new pass and confirm pass are equals
        else if(!methods.passwordHashing(newPassFieldFP.getText()).equals(methods.passwordHashing(confirmPassFieldFP.getText()))){
            JOptionPane.showMessageDialog(null, "New password don't match\nTry again");
        }
        // If both are equals, check if the email is registered
        else if(DBQuery.isRegistered(emailTextfield.getText())){
            // If email is registered, check if the new pass is equals with old pass
            if(methods.passwordHashing(newPassFieldFP.getText()).equals(DBQuery.getOldPass())){
                        JOptionPane.showMessageDialog(null, "New password must be different from your old password");
            }
            // If old and new pass is not equals, get the security question and open the securityQuestionFrame
            else{
                DBQuery.getSecurityQuestion();

                SecurityQuestion securityQnFrame = new SecurityQuestion();
                securityQnFrame.setVisible(true);
                securityQnFrame.pack();
                securityQnFrame.setLocationRelativeTo(null);
            }
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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPasswordField confirmPassFieldFP;
    public static javax.swing.JTextField emailTextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPasswordField newPassFieldFP;
    private javax.swing.JButton resetPassBtn;
    // End of variables declaration//GEN-END:variables
}