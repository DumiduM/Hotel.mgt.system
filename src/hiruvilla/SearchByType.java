package hiruvilla;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class SearchByType extends javax.swing.JFrame {
Connection conn=null; 
    ResultSet rs=null;
    PreparedStatement pst=null;
    private String gender;
    private String tableName;
    
    public SearchByType() {
        
        initComponents();
         conn=javaconnect.ConnecrDb();
        tableName = cmbField.getSelectedItem().toString();
        
       FillCombo(tableName);
        
       
    }
   
    
       
    private void FillCombo(String tblName){
        cmbSearchBy.removeAllItems();
        if (tblName.equals("customer")) {
        cmbSearchBy.addItem("All");
        cmbSearchBy.addItem("Customer_ID");
        cmbSearchBy.addItem("Package_ID");
        cmbSearchBy.addItem("Agent_ID");
        cmbSearchBy.addItem("PPN");
        cmbSearchBy.addItem("Name");
        cmbSearchBy.addItem("Country");
        cmbSearchBy.addItem("Gender");
    }
        else if (tblName.equals("employee")) {
        cmbSearchBy.addItem("All");
        cmbSearchBy.addItem("Emp_No");
        cmbSearchBy.addItem("Emp_Name");
        cmbSearchBy.addItem("Address");
        cmbSearchBy.addItem("TP");
        cmbSearchBy.addItem("Designation");
        
        }
        
        else if(tblName.equals("packages")){
            cmbSearchBy.addItem("All");
            cmbSearchBy.addItem("Package_ID");
            cmbSearchBy.addItem("Package_Name");
            cmbSearchBy.addItem("Duration");
            cmbSearchBy.addItem("Payment");
        }
        else if(tblName.equals("treatments")){
            cmbSearchBy.addItem("All");
            cmbSearchBy.addItem("Tratment_ID");
            cmbSearchBy.addItem("T_Name");
            cmbSearchBy.addItem("Doctor_ID");
            
        }
        else if(tblName.equals("products")){
            cmbSearchBy.addItem("All");
            cmbSearchBy.addItem("Product_ID");
            cmbSearchBy.addItem("Product_Name");
            cmbSearchBy.addItem("Available_Quantity");
            
        }
        else if(tblName.equals("suppliers")){
            cmbSearchBy.addItem("All");
            cmbSearchBy.addItem("Supplier_ID");
            cmbSearchBy.addItem("Sup_Name");
            cmbSearchBy.addItem("Address");
            cmbSearchBy.addItem("TP");
        }
        else if(tblName.equals("internantional_agent")){
            cmbSearchBy.addItem("All");
            cmbSearchBy.addItem("Agent_ID");
            cmbSearchBy.addItem("Name");
            cmbSearchBy.addItem("Country");
            cmbSearchBy.addItem("Address");
            
        }
        else if(tblName.equals("invoice")){
            cmbSearchBy.addItem("All");
            cmbSearchBy.addItem("Invoice_ID");
            cmbSearchBy.addItem("Package_ID");
            cmbSearchBy.addItem("Customer_ID");
            cmbSearchBy.addItem("Basic_Payment");
            cmbSearchBy.addItem("Total_Payment");
        }
    }
    private void setMore()
    {
        String SearchField = cmbField.getSelectedItem().toString();
        if(SearchField.equals("customer"))
            btnMore.setVisible(true);
        else
            btnMore.hide();
    }
//    private void FillCombo1(){
//    Connection conn = connector.ConnercrDb();
//    ResultSet rs = null;
//    PreparedStatement pst = null;
//        try{
//            String sql = "select * from customer";
//            pst = conn.prepareStatement(sql);
//            rs = pst.executeQuery();
//            
//            while (rs.next()){
//                String name = rs.getString("Name");
//                cmbSearchBy.addItem(name);
//                
//            }
//        }
//        
//        catch(Exception e){
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbSearchBy = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSearchText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnMore = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmbField = new javax.swing.JComboBox<String>();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(670, 463));
        setResizable(false);
        getContentPane().setLayout(null);

        getContentPane().add(cmbSearchBy);
        cmbSearchBy.setBounds(75, 114, 122, 24);

        jLabel1.setText("Search By");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 119, 51, 15);

        jLabel2.setText("Search");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(222, 119, 60, 15);
        getContentPane().add(txtSearchText);
        txtSearchText.setBounds(300, 117, 130, 19);

        jScrollPane1.setViewportView(tblCustomer);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(12, 178, 646, 154);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(436, 114, 69, 25);

        btnMore.setText("More Details");
        btnMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoreActionPerformed(evt);
            }
        });
        getContentPane().add(btnMore);
        btnMore.setBounds(548, 376, 93, 25);

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(443, 376, 100, 25);

        jLabel3.setText("Search Field");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(12, 30, 85, 15);

        cmbField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "customer", "employee", "packages", "internantional_agent", "products", "suppliers", "treatments" }));
        cmbField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFieldActionPerformed(evt);
            }
        });
        getContentPane().add(cmbField);
        cmbField.setBounds(139, 25, 125, 24);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(12, 376, 96, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hiruvilla/Back treatements.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-90, -150, 910, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        String SearchField = cmbField.getSelectedItem().toString();
        String SearchBy = cmbSearchBy.getSelectedItem().toString();
        String SearchText = txtSearchText.getText();
        
       
       
    
    
    if( "All".equals(SearchBy))
    {    
       if(SearchField.equals("customer"))
       {
        try
        {
            String sql = "Select `Customer_ID`,`Package_ID`,`Agent_ID`,`Name`,`PPN`,`Country`,`Gender` from "+SearchField;
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tblCustomer.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
       else
       {
            try
        {
            String sql = "Select * from "+SearchField;
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tblCustomer.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
       }
    }
    
    else {
        if(SearchField.equals("customer")){
        try
        {
            String sql =  "Select `Customer_ID`,`Package_ID`,`Agent_ID`,`Name`,`PPN`,`Country`,`Gender` from "+SearchField+" where "+SearchBy+" = '"+SearchText+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tblCustomer.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
        else{
            try
        {
            String sql =  "Select * from "+SearchField+" where "+SearchBy+" = '"+SearchText+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tblCustomer.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnMoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoreActionPerformed
        
        
           
       try{
       int selectedRow = tblCustomer.getSelectedRow();
       String cusId = (tblCustomer.getModel().getValueAt(selectedRow, 0).toString());
       
        SearchCustomer obj = new SearchCustomer(cusId);
                this.dispose();
                obj.setVisible(true);
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, "Please select a row");
           
       }
    }//GEN-LAST:event_btnMoreActionPerformed

    private void cmbFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFieldActionPerformed
        tableName = cmbField.getSelectedItem().toString();
       setMore();
       FillCombo(tableName);
       
       
        
    }//GEN-LAST:event_cmbFieldActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
 this.hide();
         HiruVilla_Welcome obj1=new HiruVilla_Welcome();//when Back boten click disply Administrater form
        obj1.setVisible(true);

        
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.hide();
    HiruVilla_Admin obj;
        obj = new HiruVilla_Admin ();
                this.dispose();
                obj.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SearchByType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchByType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchByType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchByType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchByType().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnMore;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbField;
    private javax.swing.JComboBox<String> cmbSearchBy;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtSearchText;
    // End of variables declaration//GEN-END:variables

}