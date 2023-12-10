/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basdatgui;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class SQLconnection {
    public static Connection LinkDB(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection url = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=KeinasthaFarma;encrypt=true;trustServerCertificate=true","sa","1211125");
            return url;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return null;
    }
}
