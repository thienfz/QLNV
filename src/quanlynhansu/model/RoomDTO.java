/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhansu.model;

/**
 *
 * @author Thu Hong
 */
public class RoomDTO {
    private int rid;
    private String rname;
    private int rmanagerid;
    private int rdeputyid;
    private int depid ;

    public RoomDTO() {
    }

    public RoomDTO(int rid, String rname, int rmanagerid, int rdeputyid, int depid) {
        this.rid = rid;
        this.rname = rname;
        this.rmanagerid = rmanagerid;
        this.rdeputyid = rdeputyid;
        this.depid = depid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public int getRmanagerid() {
        return rmanagerid;
    }

    public void setRmanagerid(int rmanagerid) {
        this.rmanagerid = rmanagerid;
    }

    public int getRdeputyid() {
        return rdeputyid;
    }

    public void setRdeputyid(int rdeputyid) {
        this.rdeputyid = rdeputyid;
    }

    public int getDepid() {
        return depid;
    }

    public void setDepid(int depid) {
        this.depid = depid;
    }
    
    
}
