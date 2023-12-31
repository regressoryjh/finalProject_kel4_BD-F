/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package basdatgui;

/**
 *
 * @author WINDOWS 11
 */
public class EmployeeMenu extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeMenu
     */
    public EmployeeMenu() {
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

        employeeUjiKlinisbutton = new javax.swing.JButton();
        employeeBarangKeluarButton = new javax.swing.JButton();
        employeeLogoutButton = new javax.swing.JButton();
        employeeMenujLabel = new javax.swing.JLabel();
        employeeDataKaryawanButton = new javax.swing.JButton();
        employeeBahanBakuMasukButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        employeeUjiKlinisbutton.setText("Uji Klinis");
        employeeUjiKlinisbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeUjiKlinisbuttonActionPerformed(evt);
            }
        });

        employeeBarangKeluarButton.setText("Barang Keluar");
        employeeBarangKeluarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeBarangKeluarButtonActionPerformed(evt);
            }
        });

        employeeLogoutButton.setText("Logout");
        employeeLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeLogoutButtonActionPerformed(evt);
            }
        });

        employeeMenujLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        employeeMenujLabel.setText("MENU");

        employeeDataKaryawanButton.setText("Data Karyawan");
        employeeDataKaryawanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeDataKaryawanButtonActionPerformed(evt);
            }
        });

        employeeBahanBakuMasukButton.setText("Bahan Baku Masuk");
        employeeBahanBakuMasukButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeBahanBakuMasukButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(employeeUjiKlinisbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(employeeDataKaryawanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(employeeBahanBakuMasukButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(employeeBarangKeluarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(employeeMenujLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(employeeLogoutButton)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(employeeLogoutButton)
                .addGap(18, 18, 18)
                .addComponent(employeeMenujLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeBahanBakuMasukButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeBarangKeluarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeUjiKlinisbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeDataKaryawanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void employeeUjiKlinisbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeUjiKlinisbuttonActionPerformed
        new EmployeeUjiKlinis().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_employeeUjiKlinisbuttonActionPerformed

    private void employeeBarangKeluarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeBarangKeluarButtonActionPerformed
        new EmployeeBarangKeluar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_employeeBarangKeluarButtonActionPerformed

    private void employeeLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeLogoutButtonActionPerformed
        new MainGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_employeeLogoutButtonActionPerformed

    private void employeeDataKaryawanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeDataKaryawanButtonActionPerformed
        new EmployeeDataKaryawan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_employeeDataKaryawanButtonActionPerformed

    private void employeeBahanBakuMasukButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeBahanBakuMasukButtonActionPerformed
        new EmployeeBahanBakuMasuk().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_employeeBahanBakuMasukButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton employeeBahanBakuMasukButton;
    private javax.swing.JButton employeeBarangKeluarButton;
    private javax.swing.JButton employeeDataKaryawanButton;
    private javax.swing.JButton employeeLogoutButton;
    private javax.swing.JLabel employeeMenujLabel;
    private javax.swing.JButton employeeUjiKlinisbutton;
    // End of variables declaration//GEN-END:variables
}
