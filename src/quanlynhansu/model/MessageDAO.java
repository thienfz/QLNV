/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhansu.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import static quanlynhansu.QuanLyNhanSu.db;

public class MessageDAO {

    public ArrayList<MessageDTO> getAll(int sendid, int receiveid) throws SQLException {
        String sql = "SELECT * FROM qlnv.messages where sendid ="
                + sendid
                + " and receiveid="
                + receiveid;
        ResultSet rs = db.execSelectQuerry(sql);
        ArrayList<MessageDTO> mess = new ArrayList<>();
        mess.clear();
        while (rs.next()) {
            mess.add(new MessageDTO(
                    sendid,
                    receiveid,
                    rs.getInt("mid"),
                    new java.sql.Date(rs.getTimestamp("time").getTime()),
                    rs.getString("content")
            ));
        }
        
        sql = "SELECT * FROM qlnv.messages where sendid ="
                + receiveid
                + " and receiveid="
                + sendid;
        rs = db.execSelectQuerry(sql);
        while (rs.next()) {
            mess.add(new MessageDTO(
                    receiveid,
                    sendid,
                    rs.getInt("mid"),
                    new java.sql.Date(rs.getTimestamp("time").getTime()),
                    rs.getString("content")
            ));
        }
        return mess;
    }

    public void send(int sendid, int receiveid, String content) {
        Date d = new Date();
        Timestamp t = new Timestamp(d.getTime());
        String sql = "INSERT INTO `qlnv`.`messages` (`sendid`, `receiveid`, `content`, `time`) VALUES ('"
                + sendid
                + "', '"
                + receiveid
                + "', '"
                + content
                + "', '"
                + t
                + "');";
        db.execNonQuerry(sql);
    }

}
