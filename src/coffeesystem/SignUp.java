/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coffeesystem;

import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {
    public SignUp() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fnameTextField = new javax.swing.JTextField();
        lnameTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        backButton = new javax.swing.JButton();
        createAccountButton = new javax.swing.JButton();
        securityQuestionCombobox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        securityAnswerTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(71, 54, 47));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login-image.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(190, 150, 114));
        jLabel2.setText("Sign Up");
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 64));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(190, 150, 114));
        jLabel3.setText("First Name");
        jLabel3.setPreferredSize(new java.awt.Dimension(130, 40));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(190, 150, 114));
        jLabel4.setText("Last Name");
        jLabel4.setPreferredSize(new java.awt.Dimension(130, 40));

        fnameTextField.setBackground(new java.awt.Color(59, 44, 39));
        fnameTextField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        fnameTextField.setForeground(new java.awt.Color(167, 160, 157));
        fnameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        fnameTextField.setCaretColor(new java.awt.Color(167, 160, 157));
        fnameTextField.setPreferredSize(new java.awt.Dimension(440, 50));
        fnameTextField.setSelectedTextColor(new java.awt.Color(59, 44, 39));
        fnameTextField.setSelectionColor(new java.awt.Color(232, 231, 230));

        lnameTextField.setBackground(new java.awt.Color(59, 44, 39));
        lnameTextField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lnameTextField.setForeground(new java.awt.Color(167, 160, 157));
        lnameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        lnameTextField.setCaretColor(new java.awt.Color(167, 160, 157));
        lnameTextField.setPreferredSize(new java.awt.Dimension(440, 50));
        lnameTextField.setSelectedTextColor(new java.awt.Color(59, 44, 39));
        lnameTextField.setSelectionColor(new java.awt.Color(232, 231, 230));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(190, 150, 114));
        jLabel5.setText("E-mail");
        jLabel5.setPreferredSize(new java.awt.Dimension(130, 40));

        emailTextField.setBackground(new java.awt.Color(59, 44, 39));
        emailTextField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        emailTextField.setForeground(new java.awt.Color(167, 160, 157));
        emailTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        emailTextField.setCaretColor(new java.awt.Color(167, 160, 157));
        emailTextField.setPreferredSize(new java.awt.Dimension(440, 50));
        emailTextField.setSelectedTextColor(new java.awt.Color(59, 44, 39));
        emailTextField.setSelectionColor(new java.awt.Color(232, 231, 230));
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(190, 150, 114));
        jLabel6.setText("Password");
        jLabel6.setPreferredSize(new java.awt.Dimension(130, 40));

        passwordTextField.setBackground(new java.awt.Color(59, 44, 39));
        passwordTextField.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(167, 160, 157));
        passwordTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        passwordTextField.setCaretColor(new java.awt.Color(167, 160, 157));
        passwordTextField.setPreferredSize(new java.awt.Dimension(440, 50));
        passwordTextField.setSelectedTextColor(new java.awt.Color(59, 44, 39));
        passwordTextField.setSelectionColor(new java.awt.Color(232, 231, 230));
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(190, 150, 114));
        backButton.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(232, 231, 230));
        backButton.setText("Back to Login");
        backButton.setBorder(null);
        backButton.setPreferredSize(new java.awt.Dimension(265, 50));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        createAccountButton.setBackground(new java.awt.Color(190, 150, 114));
        createAccountButton.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        createAccountButton.setForeground(new java.awt.Color(232, 231, 230));
        createAccountButton.setText("Create Account");
        createAccountButton.setBorder(null);
        createAccountButton.setPreferredSize(new java.awt.Dimension(265, 50));
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });

        securityQuestionCombobox.setBackground(new java.awt.Color(59, 44, 39));
        securityQuestionCombobox.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        securityQuestionCombobox.setForeground(new java.awt.Color(167, 160, 157));
        securityQuestionCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What was the name of your first pet?", "In what city were you born?", "What is your maternal grandmother's maiden name?", "What is the name of your favorite childhood teacher?", "What is the name of the street you grew up on?", "What is the name of your oldest cousin?", "What is the name of your favorite fictional character?", "What is the make and model of your first mobile phone?", "What is your favorite food?" }));
        securityQuestionCombobox.setBorder(null);
        securityQuestionCombobox.setPreferredSize(new java.awt.Dimension(440, 50));
        securityQuestionCombobox.setRequestFocusEnabled(false);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(190, 150, 114));
        jLabel7.setText("<html>Security<br>Question</html>");
        jLabel7.setPreferredSize(new java.awt.Dimension(130, 40));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(190, 150, 114));
        jLabel8.setText("<html>Security<br>Answer</html>");
        jLabel8.setPreferredSize(new java.awt.Dimension(130, 40));

        securityAnswerTextField.setBackground(new java.awt.Color(59, 44, 39));
        securityAnswerTextField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        securityAnswerTextField.setForeground(new java.awt.Color(167, 160, 157));
        securityAnswerTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        securityAnswerTextField.setCaretColor(new java.awt.Color(167, 160, 157));
        securityAnswerTextField.setPreferredSize(new java.awt.Dimension(440, 50));
        securityAnswerTextField.setSelectedTextColor(new java.awt.Color(59, 44, 39));
        securityAnswerTextField.setSelectionColor(new java.awt.Color(232, 231, 230));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(createAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(securityAnswerTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(passwordTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(emailTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lnameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fnameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(securityQuestionCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(0, 57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(securityQuestionCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(securityAnswerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        
        LogIn LogInFrame = new LogIn();
        LogInFrame.setVisible(true);
        LogInFrame.pack();
        LogInFrame.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed
        // TODO add your handling code here:
        
        // Check if any input field is empty
        if(emailTextField.getText().matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")){
            if (fnameTextField.getText().isEmpty() || emailTextField.getText().isEmpty() || passwordTextField.getText().isEmpty() || securityAnswerTextField.getText().isEmpty()){
                javax.swing.JOptionPane.showMessageDialog(rootPane, "Please input your information in each field");
            } // If there isn't pass the query to sql
            else{

                String userFname = fnameTextField.getText();
                String userLname = lnameTextField.getText();
                String userEmail = emailTextField.getText();
                String hashedPassword = methods.passwordHashing(passwordTextField.getText());
                String userSecurityQuestion = securityQuestionCombobox.getSelectedItem().toString();
                String userSecurityAnswer = securityAnswerTextField.getText();

                if(!DBQuery.isEmailUsed(userEmail)){
                    String createAccountQuery = "INSERT INTO userTB(FName, LName, email, hashedPassword, securityQuestion, securityAnswer, userRole) VALUES ('"+ userFname +"', '"+ userLname +"', '"+ userEmail +"', '"+ hashedPassword +"', '"+ userSecurityQuestion +"', '"+ userSecurityAnswer +"', 'employee')";
                    DBQuery.setDataOrDelete(createAccountQuery, "You're now registered\nYou may now log in");

                    fnameTextField.setText("");
                    lnameTextField.setText("");
                    emailTextField.setText("");
                    passwordTextField.setText("");
                    securityQuestionCombobox.setSelectedIndex(0);
                    securityAnswerTextField.setText("");
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid inputs please\nPlease review all your inputs");
        }
    }//GEN-LAST:event_createAccountButtonActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton createAccountButton;
    public static javax.swing.JTextField emailTextField;
    public static javax.swing.JTextField fnameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField lnameTextField;
    public static javax.swing.JPasswordField passwordTextField;
    public static javax.swing.JTextField securityAnswerTextField;
    public static javax.swing.JComboBox<String> securityQuestionCombobox;
    // End of variables declaration//GEN-END:variables
}