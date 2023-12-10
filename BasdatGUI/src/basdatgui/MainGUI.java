
package basdatgui;

import java.awt.HeadlessException;
import java.io.*;
import java.sql.*;
import javax.swing.*;

public class MainGUI extends javax.swing.JFrame {


    public MainGUI() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginButton = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        loginLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        loginButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginButtonKeyPressed(evt);
            }
        });

        txtUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLabel.setText("Username");

        passwordLabel.setText("Password");

        loginLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginLabel.setText("LOGIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(loginButton)
                    .addComponent(txtUsername)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginLabel))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(loginLabel)
                .addGap(39, 39, 39)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(loginButton)
                .addGap(47, 47, 47))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        try{
            if(authenticateUser()){
                getStatus(txtUsername);
            } else {
                JOptionPane.showMessageDialog(this, "Username atau password tidak valid");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginButtonKeyPressed
        try{
            if(authenticateUser()){
                getStatus(txtUsername);
            } else {
                JOptionPane.showMessageDialog(this, "Username atau password tidak valid");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e);
        }
    }//GEN-LAST:event_loginButtonKeyPressed

    private boolean authenticateUser(){
        try {
            PreparedStatement logIn = sqlQuery("SELECT * FROM karyawan WHERE id_karyawan = ? AND password = ?");
        
            logIn.setString(1, txtUsername.getText());
            logIn.setString(2, String.valueOf(txtPassword.getPassword()));

            ResultSet resultSet = logIn.executeQuery();
            
            if (resultSet.next()) {
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error reading user data: " + e.getMessage());
        }
        return false;
    }
    
    private void getStatus(JTextField username){
        try {
            String kodeStatus = username.getText().substring(0, 2);
            switch (kodeStatus) {
                case "20" -> {
                    new EmployeeMenu().setVisible(true);
                    this.dispose();
                }
                case "21" -> {
                    new AdminMenu().setVisible(true);
                    this.dispose();
                }
                default -> JOptionPane.showMessageDialog(this, "Invalid user status");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error reading user data: " + e.getMessage());
        }
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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }
    
    /*
        REQUIRED METHODS
    */
    
    private PreparedStatement sqlQuery (String query){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection url = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=KeinasthaFarma;encrypt=true;trustServerCertificate=true","sa","1211125");
            PreparedStatement getQuery = url.prepareStatement(query);
            return getQuery;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this,"Error: " + e);
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
