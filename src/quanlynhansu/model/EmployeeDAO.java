/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhansu.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static quanlynhansu.QuanLyNhanSu.db;

/**
 *
 * @author Thu Hong
 */
// DAO = Data Access Objects 
public class EmployeeDAO { // ds cac nhan vien 

    public void addEmployee(EmployeeDTO e) throws Exception {
        String sql = "INSERT INTO `qlnv`.`employees` "
                + "(`username`, `password`, `fullname`, `address`, `phone`, `role`, `rid`, `prid`) VALUES ('"
                + e.getUsername() + "', '"
                + e.getPassword() + "', '"
                + e.getFullname() + "', '"
                + e.getAddress() + "', '"
                + e.getPhone() + "', '"
                + e.getRole() + "', '"
                + e.getRid() + "', '"
                + e.getPrid() + "');\n";
        db.execNonQuerry(sql);
    }

    public void deleteEmployee(int uid) {
        String sql = "DELETE FROM `qlnv`.`employees` WHERE (`uid` = '" + uid + "');";
        db.execNonQuerry(sql);
    }


    public void editEmployee(EmployeeDTO e) {
//UPDATE `qlnv`.`employees` SET `username` = 'thienthien1', `password` = 'thienthien1', `fullname` = 'thien 1', `address` = 'somewher 1', `phone` = '1818181818', `role` = '3', `rid` = '2', `prid` = '3' WHERE (`uid` = '20');
        String sql = "UPDATE `qlnv`.`employees` SET "
                + "`username` = '" + e.getUsername()
                + "', `password` = '" + e.getPassword()
                + "', `fullname` = '" + e.getFullname()
                + "', `address` = '" + e.getAddress()
                + "', `phone` = '" + e.getPhone()
                + "', `role` = '" + e.getRole()
                + "', `rid` = '" + e.getRid()
                + "', `prid` = '" + e.getPrid()
                + "' WHERE (`uid` = '" + e.getUid()
                + "');";
        db.execNonQuerry(sql);
    }

    public ArrayList<EmployeeDTO> getAllEmployee() {

        ArrayList<EmployeeDTO> allEmployee = new ArrayList<>();
        String sql = "SELECT * FROM qlnv.employees;";
        ResultSet rs = db.execSelectQuerry(sql);
        try {
            while (rs.next()) {
                allEmployee.add(new EmployeeDTO(
                        rs.getInt("uid"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("fullname"),
                        rs.getString("address"),
                        rs.getString("phone"),
                        rs.getInt("rid"),
                        rs.getInt("prid"),
                        rs.getInt("role")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
        return allEmployee;
    }

    public EmployeeDTO getEmployeeByID(int uid) {
        EmployeeDTO e = new EmployeeDTO();
        try {
            String sql = "SELECT * FROM qlnv.employees where uid="+uid+";";
            ResultSet rs = db.execSelectQuerry(sql);
            if (rs.next()) {
                e = new EmployeeDTO(
                        rs.getInt("uid"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("fullname"),
                        rs.getString("address"),
                        rs.getString("phone"),
                        rs.getInt("rid"),
                        rs.getInt("prid"),
                        rs.getInt("role"));
                return e;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
        return e;
    }

    public ArrayList<EmployeeDTO> getEmployeeByPRID(int prid) {
        ArrayList<EmployeeDTO> list = new ArrayList<>();
        String sql = "SELECT * FROM qlnv.employees WHERE `prid`=" + prid + ";";
        ResultSet rs = db.execSelectQuerry(sql);
        try {
            while (rs.next()) {
                list.add(new EmployeeDTO(
                        rs.getInt("uid"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("fullname"),
                        rs.getString("address"),
                        rs.getString("phone"),
                        rs.getInt("rid"),
                        rs.getInt("prid"),
                        rs.getInt("role")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
        return list;
    }

    public ArrayList<EmployeeDTO> getEmployeeByRID(int rid) {
        ArrayList<EmployeeDTO> list = new ArrayList<>();
        String sql = "SELECT * FROM qlnv.employees WHERE `rid`=" + rid + ";";
        ResultSet rs = db.execSelectQuerry(sql);
        try {
            while (rs.next()) {
                list.add(new EmployeeDTO(
                        rs.getInt("uid"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("fullname"),
                        rs.getString("address"),
                        rs.getString("phone"),
                        rs.getInt("rid"),
                        rs.getInt("prid"),
                        rs.getInt("role")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            //ex.getMessage()
        }
        return list;
    }

    

}
