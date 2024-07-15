/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeesystem;

import java.sql.*;
import javax.swing.*;
import java.util.*;
import coffeesystem.LogIn;
import java.awt.Color;
import java.awt.Component;
import javax.swing.table.DefaultTableModel;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

// This is where we pass the query
public class DBQuery{
    
    static Connection con = CoffeeSystem.getCon();
    
    // Sign Up Frame Queries
    public static void setDataOrDelete(String Query, String msg){
        try {
            Statement st = con.createStatement();
            st.executeUpdate(Query);
            if (!msg.equals("")){
                JOptionPane.showMessageDialog(null, msg);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static boolean isEmailUsed(String email) {
        try {
            String Query = "SELECT email FROM userTB WHERE email = '" + email + "'";
            
            PreparedStatement ps = con.prepareStatement(Query);
            ResultSet rs = ps.executeQuery(Query);
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Email already used\nPlease use another email");
                SignUp.fnameTextField.setText("");
                SignUp.lnameTextField.setText("");
                SignUp.emailTextField.setText("");
                SignUp.passwordTextField.setText("");
                SignUp.securityQuestionCombobox.setSelectedIndex(0);
                SignUp.securityAnswerTextField.setText("");
                        
                return true;
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
    
    // Log In Frame Queries
    public static boolean isRegistered (String email, String hashedPass){
        String Query = "SELECT LOWER(email), hashedPassword FROM userTB WHERE email = '" + LogIn.userEmail + "' AND hashedPassword = '" + LogIn.hashedPassword + "'";
        
        try {
            PreparedStatement ps = con.prepareStatement(Query);
            ResultSet rs = ps.executeQuery(Query);
            
            if(rs.next()){
                return true;
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
    public static void getUserInfo(){
        String getFNameQuery = "SELECT * FROM userTB WHERE email = '" + LogIn.userEmail + "' AND hashedPassword = '" + LogIn.hashedPassword + "'";
        try {
            PreparedStatement ps = con.prepareStatement(getFNameQuery);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                CoffeeSystem.userFName = rs.getString("FName");
                CoffeeSystem.userLName = rs.getString("LName");
                CoffeeSystem.userID = rs.getInt("userID");
                CoffeeSystem.userEmail = rs.getString("Email");
                CoffeeSystem.hashedPassword = rs.getString("hashedPassword");
                CoffeeSystem.userContact = rs.getString("contactNo");
                CoffeeSystem.userGender = rs.getString("gender");
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static String getUserRole(String email){
        String Query = "SELECT userRole FROM userTB WHERE email = '"+ email +"' ";
                
        try {
            PreparedStatement ps = con.prepareStatement(Query);
            ResultSet rs = ps.executeQuery(Query);
            
            if(rs.next()){
                return rs.getString("userRole");
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return "";        
    }
    public static void updateLastLogin(String email){
        try{
            DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            String formattedDateTime = LocalDateTime.now().format(dateTimeFormat);
            
            PreparedStatement ps = con.prepareStatement("UPDATE userTB SET lastLogin = ? WHERE email = ?");
            ps.setString(1, formattedDateTime);
            ps.setString(2, email);
            
            ps.executeUpdate();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
    }
    
    // Menu Frame Queries
    public static double getProductPrice(String Query){
        try {
            PreparedStatement ps = con.prepareStatement(Query);
            ResultSet rs = ps.executeQuery(Query);
            
            if(rs.next()){
                return rs.getDouble("price");
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return 0;
    }
    public static int getLastTransactionId (){
        String checkLastIdentifierQuery = "SELECT MAX(transactionID) AS 'transactionID' FROM transactionTB";
        
        try{
            PreparedStatement ps = con.prepareStatement(checkLastIdentifierQuery);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                return rs.getInt("transactionID");
            }
        }
        catch (Exception e) {        
            JOptionPane.showMessageDialog(null, e);
        }
        return 0;
    }
    public static int getProductId(String Query){
        try{
            PreparedStatement ps = con.prepareStatement(Query);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                return rs.getInt("productID");
            }
        }
        catch (Exception e) {        
            JOptionPane.showMessageDialog(null, e);
        }
        return 0;
    }
    public static int addCustomerID (){
        String addNewCustomerID = "SELECT MAX(customerID) AS 'customerID' FROM orderTB";
        
        try{
            PreparedStatement ps = con.prepareStatement(addNewCustomerID);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                if(rs.getString("customerID") == null){
                    return 1;
                }
                return rs.getInt("customerID");
            }
        }
        catch (Exception e) {        
            JOptionPane.showMessageDialog(null, e);
        }
        return 0;
    }
    public static void insertTransactionToDatabase(double transactionPrice, String paymentMethod, String serviceOption, String address){
        try{
            PreparedStatement stmt = con.prepareStatement("INSERT INTO transactionTB (totalTransactionPrice, transacTotalProductCount, paymentMethod, serviceOption, address, dateOfTransaction, customerID) VALUES ( ?, ?, ?, ?, ?, ?, ?)");
            
            int customerID = addCustomerID();
            int transactionProductCount = 0;
            
            // Sum of all the product count inside the bag
            for(int i = 0; i < Menu.bagContent.getRowCount(); i++){
                transactionProductCount += (int) Menu.bagContent.getValueAt(i, 2);
            }
            
            stmt.setString(1, String.valueOf(transactionPrice));
            stmt.setString(2, String.valueOf(transactionProductCount));
            stmt.setString(3, paymentMethod);
            stmt.setString(4, serviceOption);
            stmt.setString(5, address);
            stmt.setString(6, LocalDate.now().toString());
            stmt.setInt(7, customerID);
            
            if (Payment.addressTextField.getText().isEmpty()){
                stmt.setNull(5, java.sql.Types.VARCHAR);
            }
                
            stmt.executeUpdate();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e + "Transaction to db");
        }
    }
    public static void insertOrdersToDB(){
        int transactionID = getLastTransactionId();
        int productId = 0;
        int customerID = addCustomerID();
            
        for (int i = 0; i < Menu.bagContent.getRowCount(); i++){   
            String getProductidQuery = "SELECT productID FROM productTB WHERE productName = '" + Menu.bagContent.getValueAt(i, 0) + "' AND productOzSize = CAST(SUBSTRING('" + Menu.bagContent.getValueAt(i, 1) + "', 1, 2) AS UNSIGNED)";
                    
            productId = getProductId(getProductidQuery);
                    
            double orderPrice = Double.parseDouble(Menu.bagContent.getValueAt(i, 3).toString());
              
            try{
                PreparedStatement stmt = con.prepareStatement("INSERT INTO orderTB ( productQnty, orderPrice, orderDate, transactionID, productID, customerID, clearedFromAdminSide) VALUES ( ?, ?, ?, ?, ?, ?, ?)");
          
                stmt.setString(1, String.valueOf(Menu.bagContent.getValueAt(i, 2)));
                stmt.setString(2, String.valueOf(orderPrice));
                stmt.setString(3, LocalDate.now().toString());
                stmt.setString(4, String.valueOf(transactionID));
                stmt.setString(5, String.valueOf(productId));
                stmt.setInt(6, customerID);
                stmt.setBoolean(7, false);
                
                stmt.executeUpdate();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e + "orderTODB");
            }
        }
        methods.clearTable(Menu.bagContent.getModel());
    }
    public static void loadMenu(String productName, JComboBox combobox){
        try{
            productName = productName.replaceAll("\\<.*?\\>", " ").trim();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM productTB WHERE productName = ? AND isAvailable = true");
            ps.setString(1, productName);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                if(!rs.getString("productCategory").equals("Fruit Soda")){
                    combobox.addItem(rs.getString("productOzSize") + " oz " + rs.getString("productCategory").split(" ")[0]);
                }
                else if(rs.getString("productCategory").equals("Fruit Soda")){
                    combobox.addItem(rs.getString("productOzSize") + " oz ");
                }
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static boolean isProductAvailable(String productName, String productSizeCategory, JComboBox combobox){
        try{
            PreparedStatement ps = con.prepareStatement("SELECT isAvailable FROM productTB WHERE productName = ? AND productOzSize = ? AND productCategory = ?");
            ps.setString(1, productName);
            ps.setString(2, productSizeCategory.split(" ")[0].substring(0, 2));
            ps.setString(3, productSizeCategory.split(" ")[2]);
            if(productSizeCategory.split(" ")[2].equals("Hot") || productSizeCategory.split(" ")[2].equals("Iced")){
                ps.setString(3, productSizeCategory.split(" ")[2] + " Coffee");
            }
            else{
                ps.setString(3, "Fruit Soda");
            }
            System.out.println(ps);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                boolean isProductAvailable = rs.getBoolean("isAvailable");
                return isProductAvailable;
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return false; 
    }
    
    // Account Frame Queries
    public static void updateUserInfo(){
        try {
            PreparedStatement stmt = con.prepareStatement("UPDATE userTB SET FName = ?, LName = ?, email = ?, contactNo = ?, gender = ? WHERE userID = ?");
            stmt.setString(1, Account.newFNameField.getText());
            stmt.setString(2, Account.newLNameField.getText());
            stmt.setString(3, Account.newEmailField.getText());
            stmt.setString(4, Account.newContactField.getText());
            stmt.setString(5, methods.getSelectedButton(Account.genderBtnGrp));
            stmt.setInt(6, CoffeeSystem.userID);
            
            if (Account.newContactField.getText().isEmpty()){
                stmt.setNull(4, java.sql.Types.VARCHAR);
            }
            if (methods.getSelectedButton(Account.genderBtnGrp) == null){
                stmt.setNull(5, java.sql.Types.VARCHAR);
            }
            
            stmt.executeUpdate();
            
            if (stmt.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Success!\nYour info are all updated");
                
                LogIn.userEmail = Account.newEmailField.getText();
                
                getUserInfo();
                
                Account.newFNameField.setText(CoffeeSystem.userFName);
                Account.newLNameField.setText(CoffeeSystem.userLName);
                Account.newEmailField.setText(CoffeeSystem.userEmail);
                Account.newContactField.setText(CoffeeSystem.userContact);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static void updatePassword(String hashedPassword, String email){
        try {
            PreparedStatement stmt = con.prepareStatement("UPDATE userTB SET hashedPassword = ? WHERE email = ?");
            stmt.setString(1, hashedPassword);
            stmt.setString(2, email);
            
            stmt.executeUpdate();
            
            if (stmt.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Success!\nNew password is set");
                
                CoffeeSystem.hashedPassword = hashedPassword;
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    // Forgot Pass Queries
    public static boolean isRegistered (String email){
        String Query = "SELECT LOWER(email) FROM userTB WHERE email = '" + email + "'";
        
        try{
            PreparedStatement ps = con.prepareStatement(Query);
            ResultSet rs = ps.executeQuery(Query);
            
            if(rs.next()){
                return true;
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
    public static String getOldPass(){
        String Query = "SELECT * FROM userTB WHERE email = '" + ForgotPassword.emailTextfield.getText() + "'";
        
        try{
            PreparedStatement ps = con.prepareStatement(Query);
            ResultSet rs = ps.executeQuery(Query);
            
            if(rs.next()){
                return rs.getString("hashedPassword");
            }
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e); 
        }
        return "";
    }
    public static String getSecurityQuestion(){
        String Query = "SELECT * FROM userTB WHERE email = '" + ForgotPassword.emailTextfield.getText() + "'";
        
        try{
            PreparedStatement ps = con.prepareStatement(Query);
            ResultSet rs = ps.executeQuery(Query);
            
            if(rs.next()){
                return rs.getString("securityQuestion");
            }
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e); 
        }
        return null;
    }
    public static boolean checkSecurityAns(){
        String Query = "SELECT securityAnswer FROM userTB WHERE email = '" + ForgotPassword.emailTextfield.getText() + "'";
        
        try{
            PreparedStatement ps = con.prepareStatement(Query);
            ResultSet rs = ps.executeQuery(Query);
            
            if(rs.next()){
                if(rs.getString("securityAnswer").equalsIgnoreCase(SecurityQuestion.securityAnsField.getText())){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
    
    // Dashboard Queries
    public static double totalDailySale(){
        String Query = "SELECT SUM(totalTransactionPrice) AS 'totalDailySale' FROM transactionTB WHERE dateOfTransaction = '"+LocalDate.now().toString()+"'";
        
        try{
            PreparedStatement ps = con.prepareStatement(Query);
            ResultSet rs = ps.executeQuery(Query);
            
            if(rs.next()){
                return rs.getDouble("totalDailySale");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return 0;
    }
    public static double totalMonthlySale(){
        String Query = "SELECT SUM(totalTransactionPrice) AS 'totalMonthlySale' FROM transactionTB WHERE dateOfTransaction LIKE CONCAT(SUBSTRING('"+LocalDate.now().toString()+"', 1, 7), '%')";
        
        try{
            PreparedStatement ps = con.prepareStatement(Query);
            ResultSet rs = ps.executeQuery(Query);
            
            if(rs.next()){
                return rs.getDouble("totalMonthlySale");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return 0;
    }
    public static double totalAnnualSale(){
        String Query = "SELECT SUM(totalTransactionPrice) AS 'totalAnnualSale' FROM transactionTB WHERE dateOfTransaction LIKE CONCAT(SUBSTRING('"+LocalDate.now().toString()+"', 1, 4), '%')";
        
        try{
            PreparedStatement ps = con.prepareStatement(Query);
            ResultSet rs = ps.executeQuery(Query);
            
            if(rs.next()){
                return rs.getDouble("totalAnnualSale");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return 0;
    }
    public static int totalDailyPurchase(){
        String Query = "SELECT SUM(transacTotalProductCount) AS 'totalDailyPurchase' FROM transactionTB WHERE dateOfTransaction = '"+LocalDate.now().toString()+"'";
        
        try{
            PreparedStatement ps = con.prepareStatement(Query);
            ResultSet rs = ps.executeQuery(Query);
            
            if(rs.next()){
                return rs.getInt("totalDailyPurchase");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return 0;
    }
    public static int totalMonthlyPurchase(){
        String Query = "SELECT SUM(transacTotalProductCount) AS 'totalMonthlyPurchase' FROM transactionTB WHERE dateOfTransaction LIKE CONCAT(SUBSTRING('"+LocalDate.now().toString()+"', 1, 7), '%')";
        
        try{
            PreparedStatement ps = con.prepareStatement(Query);
            ResultSet rs = ps.executeQuery(Query);
            
            if(rs.next()){
                return rs.getInt("totalMonthlyPurchase");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return 0;
    }
    public static int totalAnnualPurchase(){
        String Query = "SELECT SUM(transacTotalProductCount) AS 'AnnualPurchase' FROM transactionTB WHERE dateOfTransaction LIKE CONCAT(SUBSTRING('"+LocalDate.now().toString()+"', 1, 4), '%')";
        
        try{
            PreparedStatement ps = con.prepareStatement(Query);
            ResultSet rs = ps.executeQuery(Query);
            
            if(rs.next()){
                return rs.getInt("AnnualPurchase");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return 0;
    }
    public static void loadSales(String orderBy){
        String Query = "SELECT productTB.productName, productTB.productCategory, productTB.productOzSize, SUM(orderTB.productQnty) AS 'totalProductQnty', SUM(orderPrice) AS 'totalSales', orderTB.orderDate FROM orderTB INNER JOIN productTB ON orderTB.productID = productTB.productID WHERE orderTB.orderDate LIKE ? AND clearedFromAdminSide = false GROUP BY productTB.productName, productTB.productCategory, productTB.productOzSize, orderTB.orderDate ORDER BY " + orderBy;
        
        DefaultTableModel dt = (DefaultTableModel) Dashboard.salesTable.getModel();
        
        try{
            PreparedStatement ps = con.prepareStatement(Query);
            
            if(methods.getSelectedButton(Dashboard.saleButtonGroup).equals("Daily Sales")){
                if(Dashboard.dailySalesCB.getItemCount() != 0){
                    String month = (LocalDate.now().getMonth().getValue() < 10) ? "0" + String.valueOf(LocalDate.now().getMonth().getValue()) : String.valueOf(LocalDate.now().getMonth().getValue());
                    String date = (( Integer.parseInt(Dashboard.dailySalesCB.getSelectedItem().toString())) < 10) ? "0" + Dashboard.dailySalesCB.getSelectedItem().toString() : Dashboard.dailySalesCB.getSelectedItem().toString();
                    
                    ps.setString(1, String.format("%s-%s-%s", String.valueOf(Year.now().getValue()), month, date));
                }
                else{
                    ps.setString(1, LocalDate.now().toString());
                }
            }
            else if(methods.getSelectedButton(Dashboard.saleButtonGroup).equals("Monthly Sales")){
                if(Dashboard.monthlySalesCB.getItemCount() != 0){
                    String month = (Dashboard.monthlySalesCB.getSelectedIndex() < 10) ? "0" + String.valueOf(Dashboard.monthlySalesCB.getSelectedIndex() + 1) : String.valueOf(Dashboard.monthlySalesCB.getSelectedIndex() + 1);
                    
                    
                    ps.setString(1, String.format("%s-%s-%s", String.valueOf(Year.now().getValue()), month, '%'));
                }
                else{
                    ps.setString(1, String.format("%s-%s-%s", String.valueOf(Year.now().getValue()), LocalDate.now().toString().substring(0, 7), '%'));
                }
                
            }
            else if(methods.getSelectedButton(Dashboard.saleButtonGroup).equals("Annual Sales")){
                ps.setString(1, Dashboard.annualSalesCB.getSelectedItem().toString() + '%');
            }
            else{
                String month = (LocalDate.now().getMonth().getValue() < 10) ? "0" + String.valueOf(LocalDate.now().getMonth().getValue()) : String.valueOf(LocalDate.now().getMonth().getValue());
                    String date = (( Integer.parseInt(Dashboard.dailySalesCB.getSelectedItem().toString())) < 10) ? "0" + Dashboard.dailySalesCB.getSelectedItem().toString() : Dashboard.dailySalesCB.getSelectedItem().toString();
                    
                    ps.setString(1, String.format("%s-%s-%s", Dashboard.annualSalesCB.getSelectedItem().toString(), month, date));
            }
            
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            
            while(rs.next()){
                String productName = rs.getString("productTB.productName");
                String productSize = rs.getString("productTB.productCategory") + " " + rs.getString("productTB.productOzSize") + "Oz";
                double price = getProductPrice("SELECT price FROM productTB WHERE productName = '"+ productName +"' AND productCategory = '" + rs.getString("productTB.productCategory") + "' AND productOzSize = '" + rs.getInt("productTB.productOzSize") + "' ");
                int productQnty = rs.getInt("totalProductQnty");
                int totalSales = rs.getInt("totalSales");
                String orderDate = rs.getString("orderTB.orderDate");

                Vector vec = new Vector();
                    
                vec.add(productName);
                vec.add(productSize);
                vec.add("PHP " + Menu.decimalFormat.format(price));
                vec.add(productQnty);
                vec.add("PHP " + Menu.decimalFormat.format(totalSales));
                vec.add(orderDate);
                    
                dt.addRow(vec);
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    // Order Page Queries
    public static void loadOrders(String orderBy){
        String Query = String.format("SELECT orderTB.orderID, CONCAT(productTB.productName, ' ', productTB.productOzSize, 'oz ', productTB.productCategory) AS 'Product' , orderTB.productQnty, orderTB.orderPrice, orderTB.customerID, transactionTB.paymentMethod, transactionTB.serviceOption, transactionTB.address, orderTB.orderDate FROM orderTB INNER JOIN transactionTB ON orderTB.transactionID = transactionTB.transactionID INNER JOIN productTB ON orderTB.productID = productTB.productID INNER JOIN userTB ON orderTB.userID = userTB.userID WHERE clearedFromAdminSide = 'false' ORDER BY ?");
        
        DefaultTableModel dt = (DefaultTableModel) OrderPage.orderTable.getModel();
        
        try{
            PreparedStatement ps = con.prepareStatement(Query);
            ps.setString(1, orderBy);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            
            while(rs.next()){
                int orderNo = rs.getInt("orderID");
                String productName = rs.getString("Product");
                int qnty = rs.getInt("productQnty");
                double orderPrice = rs.getDouble("orderPrice");
                int customerID  = rs.getInt("orderTB.customerID");
                String paymentMethod = rs.getString("paymentMethod");
                String serviceOption = rs.getString("serviceOption");
                String address = rs.getString("address");
                String orderDate = rs.getString("orderTB.orderDate");

                Vector vec = new Vector();
                    
                vec.add(orderNo);
                vec.add(productName);
                vec.add(qnty);
                vec.add("PHP " + Menu.decimalFormat.format(orderPrice));
                vec.add(customerID);
                vec.add(paymentMethod);
                vec.add(serviceOption);
                vec.add(address);
                vec.add(orderDate);
                    
                dt.addRow(vec);
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static void loadOrders(String orderBy, String searchBy, String keyword){
        
        String Query = "SELECT orderTB.orderID, CONCAT(productTB.productName, ' ', productTB.productOzSize, 'oz ', productTB.productCategory) AS 'Product' , orderTB.productQnty, orderTB.orderPrice, orderTB.customerID, transactionTB.paymentMethod, transactionTB.serviceOption, transactionTB.address, orderTB.orderDate FROM orderTB INNER JOIN transactionTB ON orderTB.transactionID = transactionTB.transactionID INNER JOIN productTB ON orderTB.productID = productTB.productID INNER JOIN userTB ON orderTB.userID = userTB.userID WHERE "+ searchBy +" LIKE '%"+ keyword +"%' AND clearedFromAdminSide = 'false' ORDER BY "+ orderBy +"";
        
        if(searchBy.equals("productName")){
            Query = "SELECT orderTB.orderID, CONCAT(productTB.productName, ' ', productTB.productOzSize, 'oz ', productTB.productCategory) AS 'Product' , orderTB.productQnty, orderTB.orderPrice, orderTB.customerID, transactionTB.paymentMethod, transactionTB.serviceOption, transactionTB.address, orderTB.orderDate FROM orderTB INNER JOIN transactionTB ON orderTB.transactionID = transactionTB.transactionID INNER JOIN productTB ON orderTB.productID = productTB.productID INNER JOIN userTB ON orderTB.userID = userTB.userID WHERE "+ searchBy +" LIKE '%"+ keyword +"%' OR productTB.productOzSize LIKE '%"+ keyword +"%' AND clearedFromAdminSide = 'false' ORDER BY "+ orderBy +"";
        }
        else if(searchBy.equals("FName")){
            Query = "SELECT orderTB.orderID, CONCAT(productTB.productName, ' ', productTB.productOzSize, 'oz ', productTB.productCategory) AS 'Product' , orderTB.productQnty, orderTB.orderPrice, orderTB.customerID, transactionTB.paymentMethod, transactionTB.serviceOption, transactionTB.address, orderTB.orderDate FROM orderTB INNER JOIN transactionTB ON orderTB.transactionID = transactionTB.transactionID INNER JOIN productTB ON orderTB.productID = productTB.productID INNER JOIN userTB ON orderTB.userID = userTB.userID WHERE "+ searchBy +" LIKE '%"+ keyword +"%' OR userTB.LName LIKE '%"+ keyword +"%' AND clearedFromAdminSide = 'false' ORDER BY "+ orderBy +"";
        }
        if(keyword.equals("cash")){
            Query = "SELECT orderTB.orderID, CONCAT(productTB.productName, ' ', productTB.productOzSize, 'oz ', productTB.productCategory) AS 'Product' , orderTB.productQnty, orderTB.orderPrice, orderTB.customerID, transactionTB.paymentMethod, transactionTB.serviceOption, transactionTB.address, orderTB.orderDate FROM orderTB INNER JOIN transactionTB ON orderTB.transactionID = transactionTB.transactionID INNER JOIN productTB ON orderTB.productID = productTB.productID INNER JOIN userTB ON orderTB.userID = userTB.userID WHERE "+ searchBy +" LIKE 'cash' AND clearedFromAdminSide = 'false' ORDER BY "+ orderBy +"";
        }
        
        DefaultTableModel dt = (DefaultTableModel) OrderPage.orderTable.getModel();
        
        try{
            PreparedStatement ps = con.prepareStatement(Query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            
            
            while(rs.next()){
                int orderNo = rs.getInt("orderID");
                String productName = rs.getString("Product");
                int qnty = rs.getInt("productQnty");
                double orderPrice = rs.getDouble("orderPrice");
                int customerID = rs.getInt("orderTB.customerID");
                String paymentMethod = rs.getString("paymentMethod");
                String serviceOption = rs.getString("serviceOption");
                String address = rs.getString("address");
                String orderDate = rs.getString("orderTB.orderDate");

                Vector vec = new Vector();
                    
                vec.add(orderNo);
                vec.add(productName);
                vec.add(qnty);
                vec.add("PHP " + Menu.decimalFormat.format(orderPrice));
                vec.add(customerID);
                vec.add(paymentMethod);
                vec.add(serviceOption);
                vec.add(address);
                vec.add(orderDate);
                    
                dt.addRow(vec);
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static void removeRecord( int orderID){
        try{
            PreparedStatement ps = con.prepareStatement("UPDATE orderTB SET clearedFromAdminSide = 'true' WHERE orderID = ?");
            ps.setInt(1, orderID);
            
            ps.executeUpdate();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static void clearAdminSideOrderTable(){
        try{
            PreparedStatement clearOrderTable = con.prepareStatement("UPDATE orderTB SET clearedFromAdminSide = 'true'");
            
            clearOrderTable.executeUpdate();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    // Product Page Queries
    public static void loadProducts(){
        DefaultTableModel dt = (DefaultTableModel) ProductPage.beveragesTable.getModel();
        
        try{
            PreparedStatement ps = con.prepareStatement("SELECT * FROM productTB");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                int productID = rs.getInt("productID");
                String productName = rs.getString("productName");
                String productSize = String.valueOf(rs.getInt("productOzSize")) + " Oz";
                String productCategory = rs.getString("productCategory");
                double price = rs.getDouble("price");
                boolean isAvailable = rs.getBoolean("isAvailable");
                
                Vector vec = new Vector();
                
                vec.add(productID);
                vec.add(productName);
                vec.add(productSize);
                vec.add(productCategory);
                vec.add("PHP " + Menu.decimalFormat.format(price));
                vec.add((isAvailable) ? "Available" : "Not Available");
                
                dt.addRow(vec);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static void updateProductTb(int productID, String name, String category, String size, String price, boolean isAvailable){
        try{
            PreparedStatement ps = con.prepareStatement("UPDATE productTB SET productCategory = ?, productOzSize = ?, price = ?, isAvailable = ? WHERE productID = ?");
            
            ps.setString(1, category);
            ps.setString(2, size);
            ps.setString(3, price);
            ps.setBoolean(4, isAvailable);
            ps.setString(5, String.valueOf(productID));
            
            
            if(category.equals("Hot") || category.equals("Iced")){
                ps.setString(1, category + " Coffee");
            }
            if(Pattern.matches("^\\d+ oz$", size.toLowerCase())){
                ps.setString(2, size.split(" ")[0]);
            }
            if(Pattern.matches("^PHP +\\d+$", price) || Pattern.matches("^PHP +\\d+\\.?\\d{2}+$", price)){
                ps.setString(3, price.substring(4));
            }
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Product updated");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // User Page Queries
    public static void loadUsers(){
        DefaultTableModel dt = (DefaultTableModel) UserPage.userTable.getModel();
        
        try{
            PreparedStatement ps = con.prepareStatement("Select * FROM userTB");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Vector userData = new Vector();
                userData.add(rs.getInt("userID"));
                userData.add(rs.getString("FName") + " " + rs.getString("LName"));
                userData.add(rs.getString("email"));
                userData.add(rs.getString("contactNo"));
                userData.add(rs.getString("gender"));
                userData.add(rs.getString("userRole"));
                userData.add((rs.getString("lastLogin") != null) ? rs.getString("lastLogin").substring(0, 16) : rs.getString("lastLogin"));
                
                dt.addRow(userData);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static void changeUserRole(int userID, String newRole){
        try{
            PreparedStatement ps = con.prepareStatement("UPDATE userTB SET userRole = ? WHERE userID = ?");
            ps.setString(1, newRole);
            ps.setInt(2, userID);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "User role has been changed to " + newRole);
            
            methods.clearTable(UserPage.userTable.getModel());
            loadUsers();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static void deleteUser(int userID){
        try{
            PreparedStatement ps = con.prepareStatement("DELETE FROM userTB WHERE userID = ?");
            ps.setInt(1, userID);
            ps.executeUpdate();    
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static void clearUserOrder(int userID){
        try{
            PreparedStatement ps = con.prepareStatement("DELETE FROM orderTB WHERE userID = ?");
            ps.setInt(1, userID);
            ps.executeUpdate();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static void clearUserTransaction(int userID){
        try{
            PreparedStatement ps = con.prepareStatement("DELETE FROM transactionTB WHERE userID = ?");
            ps.setInt(1, userID);
            ps.executeUpdate();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static boolean isOrderOfUserEmpty(int userID){
        try{
            PreparedStatement ps = con.prepareStatement("SELECT productQnty FROM orderTB WHERE userID = ?");
            ps.setInt(1, userID);
            ResultSet rs = ps.executeQuery();
            
            return rs.next();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
}
