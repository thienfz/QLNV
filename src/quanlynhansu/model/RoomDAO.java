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
public class RoomDAO {

    public ArrayList<RoomDTO> getAllRoom() {
        ArrayList<RoomDTO> list = new ArrayList<>();
        ResultSet rs = null;
        String sql = "SELECT * FROM qlnv.rooms;";
        try {
            rs = db.execSelectQuerry(sql);
            while (rs.next()) {
                list.add(new RoomDTO(
                        rs.getInt("rid"),
                        rs.getString("rname"),
                        rs.getInt("rmanagerid"),
                        rs.getInt("rdeputyid"),
                        rs.getInt("depid")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
        return list;
    }

    public RoomDTO getRoomByID(int rid) {
        ResultSet rs;
        String sql = "SELECT * FROM qlnv.rooms where rid = '" + rid + "';";
        rs = db.execSelectQuerry(sql);
        try {
            if (rs.next()) {
                return new RoomDTO(
                        rs.getInt("rid"),
                        rs.getString("rname"),
                        rs.getInt("rmanagerid"),
                        rs.getInt("rdeputyid"),
                        rs.getInt("depid"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error: " + ex.toString());
        }
        System.out.println(rid);
        return new RoomDTO(0, "undefined", 0, 0, 0);
    }

    public void editRoom(Integer rid, String rname) {
        String sql = "UPDATE `qlnv`.`rooms` SET `rname` = '" + rname
                + "' WHERE (`rid` = '" + rid
                + "');";
        db.execNonQuerry(sql);
    }

    public void addNewRoom(String rname, int rmanagerid, int rdeputyid, int depid) {
         String sql = "INSERT INTO `qlnv`.`rooms` (`rname`, `rmanagerid`, `rdeputyid`, `depid`) VALUES ('"
                + rname
                + "', '"
                + rmanagerid
                + "', '" 
                + rdeputyid
                + "', '"
                + depid
                + "');";
        db.execNonQuerry(sql);
    }

}
