/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chanelling;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rashmi
 */
public class Phamacy extends javax.swing.JFrame {
        Connection conn = connection.connect();
    /**
     * Creates new form Phamacy
     */
    public Phamacy() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    
public final void pham(){
        
        try{
            
       
            PreparedStatement ps = conn.prepareStatement("Select * from items");
            ResultSet rs=ps.executeQuery();
            DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                
                Object o[] = {rs.getInt("item"),rs.getString("itemName"),rs.getString("description"),rs.getInt("selprice"),
                    rs.getInt("buyPrice"),rs.getInt("quty")};
                tm.addRow(o);
                
                
                
            }
            
            
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"Error in Attendance Grid View..... "+e);
        }
        
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDe = new javax.swing.JTextField();
        txtBuy = new javax.swing.JTextField();
        txtIname = new javax.swing.JTextField();
        txtitem = new javax.swing.JTextField();
        txtSel = new javax.swing.JTextField();
        txtQu = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("E - Chanelling System");

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ITEM NAME");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("ADD ITEM");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DESCRIPTION");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 284, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SEL PRICE");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 354, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ITEM");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 142, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("BUY PRICE");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 416, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("QUTY");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 484, -1, -1));

        txtDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeActionPerformed(evt);
            }
        });
        jPanel2.add(txtDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 285, 186, 39));
        jPanel2.add(txtBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 425, 186, 39));
        jPanel2.add(txtIname, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 211, 186, 39));
        jPanel2.add(txtitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 143, 186, 39));
        jPanel2.add(txtSel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 358, 186, 39));

        txtQu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuActionPerformed(evt);
            }
        });
        jPanel2.add(txtQu, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 493, 186, 39));

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 570, 107, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ITEM", "TEM NAME", "DESCRIPTION", "SEL PRICE", "BUY PRICE", "QUTY"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, 960, 271));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chanelling/aaaaaaaaaaaaaaaaistockphoto-627870790-1024x1024.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 640));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chanelling/asssssssssssstockphoto-801361426-1024x1024.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, 840, 640));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(721, 721, 721)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1819, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

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

    private void txtQuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
           
        try{
            String sql = "INSERT INTO items VALUES (?,?,?,?,?,?,?)";
        
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                
                
                int id = Integer.parseInt(txtitem.getText());
                String item=txtIname .getText();
                String description = txtDe.getText();
                int sel = Integer.parseInt(txtSel.getText());
                int buy = Integer.parseInt(txtBuy.getText());
                int qty= Integer.parseInt(txtQu.getText());
                
               
               
                  
                    preparedStatement.setInt(1, 0);
                    preparedStatement.setInt(2, id);
                    preparedStatement.setString(3,  item);
                    preparedStatement.setString(4, description);
                    preparedStatement.setInt(5, sel);
                    preparedStatement.setInt(6, buy);
                    preparedStatement.setInt(7,  qty);
                   
                    
                    


                    preparedStatement.executeUpdate();
                    
                 
                    JOptionPane.showMessageDialog(null,"data inserted") ;
                    System.out.println("Data Inserted");
                    pham();
                  
                    
        }catch(SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       PhamacyLog nn = new PhamacyLog();
       nn .setVisible(true);
        this.hide();
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
            java.util.logging.Logger.getLogger(Phamacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Phamacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Phamacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Phamacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Phamacy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuy;
    private javax.swing.JTextField txtDe;
    private javax.swing.JTextField txtIname;
    private javax.swing.JTextField txtQu;
    private javax.swing.JTextField txtSel;
    private javax.swing.JTextField txtitem;
    // End of variables declaration//GEN-END:variables
}
