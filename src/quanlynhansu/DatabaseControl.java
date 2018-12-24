/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhansu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Thu Hong
 */
public class DatabaseControl {

    public Connection connection = null;
    public Statement statement = null;
    private final String USERNAME = "root";
    private final String PASSWORD = "12345678";

    public DatabaseControl() {

    }

    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlnv", USERNAME, PASSWORD);
            statement = connection.createStatement();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public ResultSet execSelectQuerry(String sql) {
        ResultSet rs = null;
        try {
            rs = statement.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
        }
        return rs;
    }

    public void execNonQuerry(String sql) {
        try {
            statement.executeUpdate(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
        }
    }

    public int login(String username, String password) {
        try {
            ResultSet rs = statement.executeQuery("SELECT password,role FROM qlnv.employees where username='" + username + "';");
            if (rs.next()) {
                if (rs.getString("password").equals(password)) {
                    return Integer.valueOf(rs.getString("role"));
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        return -1;
    }

}
