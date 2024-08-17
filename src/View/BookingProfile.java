package View;

import Controller.BookingProfileController;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Aum
 */
public class BookingProfile extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame2
     */
    public BookingProfile() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel26 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Bookid = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        Customerid = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        Pickupdate = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        Dropoffdate = new javax.swing.JTextField();
        Registrationid = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1353, 463, -1, -1));
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1452, 538, -1, 45));

        Bookid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookidActionPerformed(evt);
            }
        });
        getContentPane().add(Bookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 204, 141, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText("BookId");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 206, -1, 16));
        getContentPane().add(Customerid, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 291, 144, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setText("Pickup date");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 341, 82, -1));

        Pickupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PickupdateActionPerformed(evt);
            }
        });
        getContentPane().add(Pickupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 341, 144, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setText("Drop off date");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 381, -1, -1));
        getContentPane().add(Dropoffdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 381, 144, -1));

        Registrationid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrationidActionPerformed(evt);
            }
        });
        getContentPane().add(Registrationid, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 244, 144, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setText("Registration ID");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 244, -1, -1));

        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        getContentPane().add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 443, -1, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setText("Customer ID");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 291, -1, -1));

        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, -1, -1));

        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, -1, -1));

        Refresh.setText("REFRESH");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        getContentPane().add(Refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 440, -1, -1));

        Logout.setFont(new java.awt.Font("Unispace", 1, 18)); // NOI18N
        Logout.setForeground(new java.awt.Color(51, 0, 0));
        Logout.setText("LOGOUT");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, -1, 37));

        jPanel2.setBackground(new java.awt.Color(51, 32, 32));

        jLabel1.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Bhatbhatey");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(746, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 46, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -7, 1450, 120));

        jLabel20.setFont(new java.awt.Font("Wide Latin", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 0, 0));
        jLabel20.setText("Booking profile");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, -1, 80));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BookID", "Registration ID", "Customer ID", "Pickup date", "Drop off date", "Name", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 171, 640, 245));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("Bike profile");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 553, -1, 33));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setText("User profile");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 592, -1, -1));

        jButton1.setText("Book Now!");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 590, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BookidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookidActionPerformed

    private void PickupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PickupdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PickupdateActionPerformed

    private void RegistrationidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrationidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistrationidActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RefreshActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutActionPerformed

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        BikeProfile bk = new BikeProfile();
        bk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        UserProfile up = new UserProfile();
        up.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jLabel24MouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        // TODO add your handling code here:
        Register r = new Register();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        Scanner qr= new Scanner();
        qr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked
public javax.swing.JButton getAdd(){
    return Add;
}
public javax.swing.JTextField getBookid(){
    return Bookid;
}
public javax.swing.JTextField getCustomerid(){
    return Customerid;
}
public javax.swing.JButton getDelete(){
    return Delete;
}
public javax.swing.JTextField getDropoffdate(){
    return Dropoffdate;
}
public javax.swing.JButton getLogout(){
    return Logout;
}
public javax.swing.JTextField getPickupdate(){
    return Pickupdate;
}
public javax.swing.JButton getRefresh(){
    return Refresh;
}
public javax.swing.JTextField getRegistrationid(){
    return Registrationid;
}
public javax.swing.JButton getUpdate(){
    return Update;
}
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
            java.util.logging.Logger.getLogger(BookingProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextField Bookid;
    private javax.swing.JTextField Customerid;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Dropoffdate;
    private javax.swing.JButton Logout;
    private javax.swing.JTextField Pickupdate;
    private javax.swing.JButton Refresh;
    private javax.swing.JTextField Registrationid;
    private javax.swing.JButton Update;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
