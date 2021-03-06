/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhansu.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static quanlynhansu.QuanLyNhanSu.db;

/**
 *
 * @author Thu Hong
 */
public class DepartmentDAO {

    public ArrayList<DepartmentDTO> getAllDepartment() {
        ArrayList<DepartmentDTO> list = new ArrayList<>();
        ResultSet rs = null;
        String sql = "SELECT * FROM qlnv.departments;";
        try {
            rs = db.execSelectQuerry(sql);
            while (rs.next()) {
                list.add(new DepartmentDTO(
                        rs.getInt("depid"),
                        rs.getString("depname"),
                        rs.getInt("depmanagerid"),
                        rs.getInt("depdeputyid")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
        return list;
    }

    public DepartmentDTO getDepByID(int depid) {
        ResultSet rs = null;
        String sql = "SELECT * FROM qlnv.departments where depid=" + depid + ";";
        rs = db.execSelectQuerry(sql);
        try {
            if (rs.next()) {
                return new DepartmentDTO(
                        rs.getInt("depid"),
                        rs.getString("depname"),
                        rs.getInt("depmanagerid"),
                        rs.getInt("depdeputyid"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
        }
        return new DepartmentDTO(0, "undefined", 0, 0);
    }

    public void editDepartment(Integer depid, String depname) {
        String sql = "UPDATE `qlnv`.`departments` SET `depname` = '" + depname
                + "' WHERE (`depid` = '" + depid
                + "');";
        db.execNonQuerry(sql);
    }

    public void addNewDep(String depname, int depmanagerid, int depdeputyid) {
        String sql = "INSERT INTO `qlnv`.`departments` (`depname`, `depmanagerid`, `depdeputyid`) VALUES ('"
                + depname
                + "', '"
                + depmanagerid
                + "', '"
                + depdeputyid
                + "');";
        db.execNonQuerry(sql);
    }

}
