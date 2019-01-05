/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhansu.model;

import java.sql.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Thu Hong
 */
public class MessageDTO {

    int sendid, receiveid, mid;
    String content = "";
    Date time;

    public MessageDTO() {
    }

    public MessageDTO(int sendid, int receiveid, int mid, Date time, String content) {
        this.sendid = sendid;
        this.receiveid = receiveid;
        this.mid = mid;
        this.time = time;
        this.content = content;
    }

    @Override
    public String toString() {
        java.util.Date d = new java.util.Date(time.getTime());
        String string = "<span style=\"color:rgb(150,150,150);\"> ["
                + d.getHours() + ":"
                + d.getMinutes() + ":"
                + d.getSeconds() + " - "
                + d.getDate() + "/"
                + (d.getMonth() + 1) + "/"
                + (d.getYear() + 1900) + "]: "
                + "</span>"
                + "<span>"
                + content
                + "</span>";
        //style="color:rgb(255,0,0);"

//        "ADMIN [12:00:00 12/12/2012]: Hello my friend!! \n"
        return string;
    }
    

    public int getSendid() {
        return sendid;
    }

    public void setSendid(int sendid) {
        this.sendid = sendid;
    }

    public int getReceiveid() {
        return receiveid;
    }

    public void setReceiveid(int receiveid) {
        this.receiveid = receiveid;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("qlnv?zeroDateTimeBehavior=convertToNullPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
}
