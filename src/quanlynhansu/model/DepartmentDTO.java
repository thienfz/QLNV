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
public class DepartmentDTO {
    private int depid;
    private String depname;
    private int depmanagerid;
    private int depdeputyid;

    public DepartmentDTO() {
    }

    public DepartmentDTO(int depid, String depname, int depmanagerid, int depdeputyid) {
        this.depid = depid;
        this.depname = depname;
        this.depmanagerid = depmanagerid;
        this.depdeputyid = depdeputyid;
    }

    public int getDepid() {
        return depid;
    }

    public void setDepid(int depid) {
        this.depid = depid;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public int getDepmanagerid() {
        return depmanagerid;
    }

    public void setDepmanagerid(int depmanagerid) {
        this.depmanagerid = depmanagerid;
    }

    public int getDepdeputyid() {
        return depdeputyid;
    }

    public void setDepdeputyid(int depdeputyid) {
        this.depdeputyid = depdeputyid;
    }
    
    
}
