/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coffeesystem;

import java.sql.*;

public class CoffeeSystem {
    
    static int userID = 0;
    static String userFName = "";
    static String userLName = "";
    static String userEmail = "";
    static String hashedPassword = "";
    static String userContact = "";
    static String userGender = "";
    
    public static void main(String[] args) {
        LogIn LogInFrame = new LogIn();
        LogInFrame.setVisible(true);
        LogInFrame.pack();
        LogInFrame.setLocationRelativeTo(null);
    }
    
    public static Connection getCon(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/COFFEEDB?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","Your-DB-User","Your-DB-Password");
            return con;
        }
        catch (Exception e){
            return null;
        }
    }
}
