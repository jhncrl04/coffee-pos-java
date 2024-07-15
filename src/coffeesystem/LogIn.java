/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coffeesystem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;

public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();
    }

    static String userEmail;
    static String hashedPassword;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginEmailTextfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        loginPasswordTextfield = new javax.swing.JPasswordField();
        forgotPassBtn = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();
        logInButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jab's Coffee");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(71, 54, 47));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login-image.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(190, 150, 114));
        jLabel2.setText("Log In");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(190, 150, 114));
        jLabel3.setText("E-mail");
        jLabel3.setPreferredSize(new java.awt.Dimension(90, 50));

        loginEmailTextfield.setBackground(new java.awt.Color(59, 44, 39));
        loginEmailTextfield.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        loginEmailTextfield.setForeground(new java.awt.Color(167, 160, 157));
        loginEmailTextfield.setToolTipText("");
        loginEmailTextfield.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        loginEmailTextfield.setCaretColor(new java.awt.Color(167, 160, 157));
        loginEmailTextfield.setPreferredSize(new java.awt.Dimension(440, 50));
        loginEmailTextfield.setSelectedTextColor(new java.awt.Color(59, 44, 39));
        loginEmailTextfield.setSelectionColor(new java.awt.Color(167, 160, 157));
        loginEmailTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginEmailTextfieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(190, 150, 114));
        jLabel4.setText("Password");
        jLabel4.setPreferredSize(new java.awt.Dimension(90, 50));

        loginPasswordTextfield.setBackground(new java.awt.Color(59, 44, 39));
        loginPasswordTextfield.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        loginPasswordTextfield.setForeground(new java.awt.Color(167, 160, 157));
        loginPasswordTextfield.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        loginPasswordTextfield.setCaretColor(new java.awt.Color(167, 160, 157));
        loginPasswordTextfield.setPreferredSize(new java.awt.Dimension(440, 50));
        loginPasswordTextfield.setSelectedTextColor(new java.awt.Color(59, 44, 39));
        loginPasswordTextfield.setSelectionColor(new java.awt.Color(167, 160, 157));

        forgotPassBtn.setBackground(new java.awt.Color(71, 54, 47));
        forgotPassBtn.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        forgotPassBtn.setForeground(new java.awt.Color(167, 160, 157));
        forgotPassBtn.setText("Forgot Password?");
        forgotPassBtn.setBorder(null);
        forgotPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPassBtnActionPerformed(evt);
            }
        });

        signUpButton.setBackground(new java.awt.Color(190, 150, 114));
        signUpButton.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(232, 231, 230));
        signUpButton.setText("Sign Up");
        signUpButton.setBorder(null);
        signUpButton.setPreferredSize(new java.awt.Dimension(265, 50));
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        logInButton.setBackground(new java.awt.Color(190, 150, 114));
        logInButton.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        logInButton.setForeground(new java.awt.Color(232, 231, 230));
        logInButton.setText("Log In");
        logInButton.setBorder(null);
        logInButton.setPreferredSize(new java.awt.Dimension(265, 50));
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loginPasswordTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loginEmailTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(logInButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(102, 102, 102))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(forgotPassBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginEmailTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginPasswordTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(forgotPassBtn)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logInButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(203, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1281, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginEmailTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginEmailTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginEmailTextfieldActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
        SignUp SignUpFrame = new SignUp();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        // TODO add your handling code here:
        
        if(loginEmailTextfield.getText().matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")){
            userEmail = loginEmailTextfield.getText();
            hashedPassword = methods.passwordHashing(loginPasswordTextfield.getText());
            
            if (DBQuery.isRegistered(userEmail, hashedPassword)){

                DBQuery.getUserInfo();
                DBQuery.updateLastLogin(userEmail);
                if(DBQuery.getUserRole(loginEmailTextfield.getText()).equalsIgnoreCase("admin")){
                    Dashboard adminMenuFrame = new Dashboard();
                    adminMenuFrame.setVisible(true);
                    adminMenuFrame.pack();
                    adminMenuFrame.setLocationRelativeTo(null);

                    methods.setDashboardLabels();

                    this.dispose();
                }
                else{
                    Menu MenuFrame = new Menu();
                    MenuFrame.setVisible(true);
                    MenuFrame.pack();
                    MenuFrame.setLocationRelativeTo(null);

                    this.dispose();
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Wrong email or password");
            loginPasswordTextfield.setText("");
        }
    }//GEN-LAST:event_logInButtonActionPerformed

    private void forgotPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPassBtnActionPerformed
        // TODO add your handling code here:
        
        ForgotPassword forgotPassFrame = new ForgotPassword();
        forgotPassFrame.setVisible(true);
        forgotPassFrame.pack();
        forgotPassFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_forgotPassBtnActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton forgotPassBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logInButton;
    private javax.swing.JTextField loginEmailTextfield;
    private javax.swing.JPasswordField loginPasswordTextfield;
    private javax.swing.JButton signUpButton;
    // End of variables declaration//GEN-END:variables
}
