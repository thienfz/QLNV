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
    //Data Transfer Object 
public class EmployeeDTO {
    public final int ADMIN = 0;
    public final int MANAGER = 1;
    public final int DEPUTY = 2;
    public final int LECTURER = 3;
    public final int STAFF = 4;
    
    private int uid;
    private String username;
    private String password;
    private String fullname;
    private String address;
    private String phone;
    private int rid;
    private int prid;
    private int role;

    public EmployeeDTO(String username, String password, String fullname, String address, String phone, int rid, int prid, int role) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.address = address;
        this.phone = phone;
        this.rid = rid;
        this.prid = prid;
        this.role = role;
    }

    public EmployeeDTO(int uid, String username, String password, String fullname, String address, String phone, int rid, int prid, int role) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.address = address;
        this.phone = phone;
        this.rid = rid;
        this.prid = prid;
        this.role = role;
    }

    public EmployeeDTO() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getPrid() {
        return prid;
    }

    public void setPrid(int prid) {
        this.prid = prid;
    }

    public int getRole() {
       return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    
    
}
