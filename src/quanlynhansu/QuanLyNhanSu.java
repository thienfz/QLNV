/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhansu;

import quanlynhansu.model.DepartmentDAO;
import quanlynhansu.model.EmployeeDAO;
import quanlynhansu.model.MessageDAO;
import quanlynhansu.model.ProjectDAO;
import quanlynhansu.model.RoomDAO;
import quanlynhansu.view.Login;

/**
 *
 * @author Thu Hong
 */
public class QuanLyNhanSu {

    /**
     */
    public static DatabaseControl db; //= new DatabaseControl();
    public static EmployeeDAO employeeDAO = new EmployeeDAO();
    public static RoomDAO roomDAO = new RoomDAO();
    public static DepartmentDAO departmentDAO = new DepartmentDAO();
    public static ProjectDAO projectDAO = new ProjectDAO();
    public static MessageDAO messageDAO = new MessageDAO();
    
    public static void main(String[] args) throws Exception {
        db = new DatabaseControl();
        db.connect();
        new Login().setVisible(true);
    }

}
