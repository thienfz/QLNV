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
public class ProjectDAO {

    public ArrayList<ProjectDTO> getAllProject() {
        ArrayList<ProjectDTO> list = new ArrayList<>();
        ResultSet rs;
        String sql = "SELECT * FROM qlnv.projects;";
        rs = db.execSelectQuerry(sql);
        try {
            while (rs.next()) {
                list.add(new ProjectDTO(rs.getInt("prid"), rs.getString("prname")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error: " + ex.toString());
        }
        return list;
    }
    public void editProject(ProjectDTO p){
        String sql = "UPDATE `qlnv`.`projects` SET "
                + "`prname` = '" + p.getPrname()
                + "' WHERE (`prid` = '" + p.getPrid()
                + "');";
        db.execNonQuerry(sql);
    }
    public ProjectDTO getProjectByID(int prid) {
        ResultSet rs;
        String sql = "SELECT * FROM qlnv.projects where prid = '" + prid + "';";
        rs = db.execSelectQuerry(sql);
        try {
            if (rs.next()) {
                return new ProjectDTO(rs.getInt("prid"), rs.getString("prname"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error: " + ex.toString());
        }
        return new ProjectDTO(0, "undefined");
    }

    public void addNewProject(String text) {
        String sql = "INSERT INTO `qlnv`.`projects` (`prname`) VALUES ('"+text
                + "');";
        db.execNonQuerry(sql);
    }

}
