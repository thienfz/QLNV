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
public class ProjectDTO {
    private int prid;
    private String prname;

    public ProjectDTO() {
    }

    public ProjectDTO(int prid, String prname) {
        this.prid = prid;
        this.prname = prname;
    }

    public int getPrid() {
        return prid;
    }

    public void setPrid(int prid) {
        this.prid = prid;
    }

    public String getPrname() {
        return prname;
    }

    public void setPrname(String prname) {
        this.prname = prname;
    }
    
    
}
