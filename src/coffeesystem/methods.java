/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeesystem;

import static coffeesystem.Menu.bagContent;
import java.awt.Component;
import java.security.*;
import java.util.Vector;
import javax.swing.table.*;
import javax.swing.*;
import java.util.*;

public class methods {
    
    public static String passwordHashing(String unhashedPassword){
        
        try{
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            
            messageDigest.update(unhashedPassword.getBytes());
            
            byte[] hashedPasswordByte = messageDigest.digest();
            
            StringBuilder sb = new StringBuilder();
            
            for(byte b : hashedPasswordByte){
                sb.append(String.format("%02x", b));
            }
            
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
    
    // METHODS
    public static void addtable(String productName, String productSize, int quantity, double price){
        DefaultTableModel dt = (DefaultTableModel) bagContent.getModel();
        
        Vector v = new Vector();
        
        v.add(productName);
        v.add(productSize);
        v.add(quantity);
        v.add(Menu.decimalFormat.format(price));
        
        dt.addRow(v);
    }
    public static void clearTable(TableModel model){
        DefaultTableModel dt = (DefaultTableModel) model;
        
        dt.setRowCount(0);
    }
    public static void setDashboardLabels(){
        Dashboard.dailySalesLabel.setText("PHP " + Menu.decimalFormat.format(DBQuery.totalDailySale()));
        Dashboard.monthlySalesLabel.setText("PHP " + Menu.decimalFormat.format(DBQuery.totalMonthlySale()));
        Dashboard.annualSalesLabel.setText("PHP " + Menu.decimalFormat.format(DBQuery.totalAnnualSale()));
        Dashboard.dailyPurchasesLabel.setText(String.valueOf(DBQuery.totalDailyPurchase()) + " Purchases");
        Dashboard.monthlyPurchasesLabel.setText(String.valueOf(DBQuery.totalMonthlyPurchase()) + " Purchases");
        Dashboard.annualPurchasesLabel.setText(String.valueOf(DBQuery.totalAnnualPurchase()) + " Purchases");
    }
    public static String getSelectedButton(ButtonGroup buttonGroup){
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();){
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }
    
    // WRAP TABLE TEXT
    public static class TextAreaRenderer extends JTextArea implements TableCellRenderer {
        private final DefaultTableCellRenderer adaptee =
            new DefaultTableCellRenderer();
        /** map from table to map of rows to map of column heights */
        private final Map cellSizes = new HashMap();

        public TextAreaRenderer() {
            setLineWrap(true);
            setWrapStyleWord(true);
        }

        public Component getTableCellRendererComponent( 
            JTable table, Object obj, boolean isSelected,
            boolean hasFocus, int row, int column) {
            adaptee.getTableCellRendererComponent(table, obj, isSelected, hasFocus, row, column);
            setForeground(adaptee.getForeground());
            setBackground(adaptee.getBackground());
            setBorder(adaptee.getBorder());
            setFont(adaptee.getFont());
            setText(adaptee.getText());

            
            TableColumnModel columnModel = table.getColumnModel();
            setSize(columnModel.getColumn(column).getWidth(), 100000);
            int height_wanted = (int) getPreferredSize().getHeight();
            addSize(table, row, column, height_wanted);
            height_wanted = findTotalMaximumRowSize(table, row);
            if (height_wanted != table.getRowHeight(row)) {
                table.setRowHeight(row, height_wanted);
            }
            return this;
        }

        private void addSize(JTable table, int row, int column,
            int height) {
            Map rows = (Map) cellSizes.get(table);
            if (rows == null) {
                cellSizes.put(table, rows = new HashMap());
            }
            Map rowheights = (Map) rows.get(new Integer(row));
            if (rowheights == null) {
                rows.put(new Integer(row), rowheights = new HashMap());
            }
            rowheights.put(new Integer(column), new Integer(height));
        }

        private int findTotalMaximumRowSize(JTable table, int row) {
            int maximum_height = 0;
            Enumeration columns = table.getColumnModel().getColumns();
            while (columns.hasMoreElements()) {
                TableColumn tc = (TableColumn) columns.nextElement();
                TableCellRenderer cellRenderer = tc.getCellRenderer();
                if (cellRenderer instanceof TextAreaRenderer) {
                    TextAreaRenderer tar = (TextAreaRenderer) cellRenderer;
                    maximum_height = Math.max(maximum_height,
                        tar.findMaximumRowSize(table, row));
                }
            }
            return maximum_height;
        }

        private int findMaximumRowSize(JTable table, int row) {
            Map rows = (Map) cellSizes.get(table);
            if (rows == null) return 0;
            Map rowheights = (Map) rows.get(new Integer(row));
            if (rowheights == null) return 0;
            int maximum_height = 0;
            for (Iterator it = rowheights.entrySet().iterator(); it.hasNext();) {
                Map.Entry entry = (Map.Entry) it.next();
                int cellHeight = ((Integer) entry.getValue()).intValue();
                maximum_height = Math.max(maximum_height, cellHeight);
            }
            return maximum_height;
        }
    }
}
