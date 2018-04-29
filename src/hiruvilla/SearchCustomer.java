package hiruvilla;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;


public class SearchCustomer extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    static String CustomerID;
    
    public SearchCustomer()
    {
       initComponents(); 
    }
    public SearchCustomer(String CusID) {
        CustomerID = CusID;
        initComponents();
      conn=javaconnect.ConnecrDb();
        txtCusID.setText(CusID);
        
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        txtName9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtName10 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCusID = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtPackage = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAgent = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPPN = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtAdmit = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtDischarge = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtTP = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel11.setText("Gender");

        txtName9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtName9ActionPerformed(evt);
            }
        });

        jLabel12.setText("Date of Birth");

        txtName10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtName10ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(719, 478));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(54, 109, 74, 15);

        jLabel2.setText("Country");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(54, 145, 74, 28);

        jLabel4.setText("PackageID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(54, 195, 68, 15);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName);
        txtName.setBounds(140, 101, 173, 31);

        jLabel5.setText("Enter Customer ID");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(54, 52, 92, 15);

        txtCusID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtCusID);
        txtCusID.setBounds(173, 50, 107, 19);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(352, 47, 69, 25);

        txtPackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPackageActionPerformed(evt);
            }
        });
        getContentPane().add(txtPackage);
        txtPackage.setBounds(140, 187, 173, 31);

        txtCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCountryActionPerformed(evt);
            }
        });
        getContentPane().add(txtCountry);
        txtCountry.setBounds(140, 144, 173, 31);

        jLabel7.setText("Agent ID");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(361, 146, 57, 15);

        txtAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgentActionPerformed(evt);
            }
        });
        getContentPane().add(txtAgent);
        txtAgent.setBounds(462, 138, 173, 31);

        jLabel8.setText("Passport Number");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(361, 109, 83, 15);

        txtPPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPPNActionPerformed(evt);
            }
        });
        getContentPane().add(txtPPN);
        txtPPN.setBounds(462, 101, 173, 31);

        jLabel9.setText("Gender");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(361, 232, 57, 15);

        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        getContentPane().add(txtGender);
        txtGender.setBounds(462, 224, 173, 31);

        jLabel10.setText("Date of Birth");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(361, 189, 60, 15);

        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });
        getContentPane().add(txtDOB);
        txtDOB.setBounds(462, 181, 173, 31);

        jLabel13.setText("Status");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(54, 238, 68, 15);

        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });
        getContentPane().add(txtStatus);
        txtStatus.setBounds(140, 230, 173, 31);

        jLabel14.setText("Address");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(54, 281, 57, 15);

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        getContentPane().add(txtAddress);
        txtAddress.setBounds(140, 273, 173, 31);

        jLabel15.setText("Admitted Date");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(361, 261, 68, 15);

        txtAdmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdmitActionPerformed(evt);
            }
        });
        getContentPane().add(txtAdmit);
        txtAdmit.setBounds(462, 261, 173, 31);

        jLabel16.setText("Discharged Date");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(361, 314, 57, 15);

        txtDischarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDischargeActionPerformed(evt);
            }
        });
        getContentPane().add(txtDischarge);
        txtDischarge.setBounds(462, 306, 173, 31);

        jLabel17.setText("TP");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(59, 330, 57, 15);

        txtTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTPActionPerformed(evt);
            }
        });
        getContentPane().add(txtTP);
        txtTP.setBounds(140, 322, 173, 31);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(54, 403, 98, 35);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hiruvilla/Back treatements.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-30, -110, 1240, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCusIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCusIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCusIDActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String tmp = (String)txtCusID.getText();
        String sql = "Select * from customer where Customer_ID = ?";
        
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, tmp);
            rs = pst.executeQuery();
            
            if(rs.next()){
                
                String add2 = rs.getString("Package_ID");
                txtPackage.setText(add2);
                String add3 = rs.getString("Agent_ID");
                txtAgent.setText(add3);
                String add4 = rs.getString("Country");
                txtCountry.setText(add4);
                String add5 = rs.getString("Status");
                txtStatus.setText(add5);
                String add6 = rs.getString("TP");
                txtTP.setText(add6);
                String add7 = rs.getString("Address");
                txtAddress.setText(add7);
                String add8 = rs.getString("DateOfBirth");
                txtDOB.setText(add8);
                String add9 = rs.getString("Gender");
                txtGender.setText(add9);
                String add10 = rs.getString("Admitted_Date");
                txtAdmit.setText(add10);
                String add11 = rs.getString("Discharged_Date");
                txtDischarge.setText(add11);
                String add12 = rs.getString("Name");
                txtName.setText(add12);
                String add13 = rs.getString("PPN");
                txtPPN.setText(add13);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtPackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPackageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPackageActionPerformed

    private void txtCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountryActionPerformed

    private void txtAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgentActionPerformed

    private void txtPPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPPNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPPNActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    private void txtName9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtName9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtName9ActionPerformed

    private void txtName10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtName10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtName10ActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtAdmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdmitActionPerformed

    private void txtDischargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDischargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDischargeActionPerformed

    private void txtTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTPActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        SearchByType obj = new SearchByType();
        this.hide();
        obj.show();
        
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(SearchCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAdmit;
    private javax.swing.JTextField txtAgent;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtCusID;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtDischarge;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName10;
    private javax.swing.JTextField txtName9;
    private javax.swing.JTextField txtPPN;
    private javax.swing.JTextField txtPackage;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTP;
    // End of variables declaration//GEN-END:variables
}
