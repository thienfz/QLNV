/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhansu.view;

import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import static quanlynhansu.QuanLyNhanSu.departmentDAO;
import static quanlynhansu.QuanLyNhanSu.employeeDAO;
import static quanlynhansu.QuanLyNhanSu.projectDAO;
import static quanlynhansu.QuanLyNhanSu.roomDAO;
import quanlynhansu.model.DepartmentDTO;
import quanlynhansu.model.EmployeeDTO;
import quanlynhansu.model.ProjectDTO;
import quanlynhansu.model.RoomDTO;

/**
 *
 * @author Thu Hong
 */
public class EmployeeManager extends javax.swing.JFrame {

    /**
     * Creates new form Test
     */
    DefaultTableModel model;
    ArrayList<EmployeeDTO> allEmployee = new ArrayList<>();
    int role;

    public EmployeeManager(int role) {
        initComponents();
        this.role = role;
        setLocationRelativeTo(null);
        allEmployee = employeeDAO.getAllEmployee();
        newtable();
        if (role == 0) {
            this.logout.setVisible(false);
            setDefaultCloseOperation(HIDE_ON_CLOSE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        input = new javax.swing.JTextField();
        searchbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(table.getModel());
        jScrollPane1.setViewportView(table);

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Edit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        logout.setText("Log out ");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        searchbutton.setText("Search");
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(input))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton1)
                    .addComponent(logout))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbutton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        newtable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int row = table.getSelectedRow();
        if (row == -1) {
            return;
        } else {
            System.out.println((String) table.getValueAt(row, 0));
            int uid = Integer.valueOf((String) table.getValueAt(row, 0));
            employeeDAO.deleteEmployee(uid);
            newtable();
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.setVisible(false);        // TODO add your handling code here:
        new Login().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new EmployeeAddNew().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     int row = table.getSelectedRow();
        if (row == -1) {
            return;
        } else {
            int uid = Integer.valueOf((String) table.getValueAt(row, 0));
            new EmployeeEdit(employeeDAO.getEmployeeByID(uid)).setVisible(true);
           
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed
        String input = this.input.getText().toLowerCase();
        allEmployee.clear();
        allEmployee = employeeDAO.getAllEmployee();
        
        for (int i = 0; i < allEmployee.size(); i++) {
            if(allEmployee.get(i).getUsername().toLowerCase().contains(input)){
                System.out.println("input: " + input + "; i: " + allEmployee.get(i).getUsername());
               
            } else{
                allEmployee.remove(allEmployee.get(i));
            }
        }
        
        String[] row = {"UID", "Username", "Fullname", "Address", "Phone", "Department", "Room", "Project", "Role"};
        model = new DefaultTableModel(row, 0) {
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }
        };
        for (int i = 0; i < allEmployee.size(); i++) {
            String role;
            switch (allEmployee.get(i).getRole()) {
                case 0:
                    role = "Admin";
                    break;
                case 1:
                    role = "Manager";
                    break;
                case 2:
                    role = "Deputy";
                    break;
                case 3:
                    role = "Lecturer";
                    break;
                case 4:
                    role = "Staff";
                    break;
                default:
                    role = "undefined";
                    break;
            }

            RoomDTO r = roomDAO.getRoomByID(allEmployee.get(i).getRid());
//            RoomDTO r = new RoomDTO(1, "rom", 1, 1, 1);
            DepartmentDTO d = departmentDAO.getDepByID(r.getDepid());
            ProjectDTO p = projectDAO.getProjectByID(allEmployee.get(i).getPrid());
            String project = "my chau";
            String[] data = {
                allEmployee.get(i).getUid() + "",
                allEmployee.get(i).getUsername() + "",
                allEmployee.get(i).getFullname() + "",
                allEmployee.get(i).getAddress() + "",
                allEmployee.get(i).getPhone() + "",
                d.getDepname(),
                r.getRname(),
                p.getPrname(),
                //                allEmployee.get(i).getRole() + ""
                role,};
            model.addRow(data);
        }
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.setModel(model);
    }//GEN-LAST:event_searchbuttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField input;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JButton searchbutton;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void newtable() {

        allEmployee = employeeDAO.getAllEmployee();
        String[] row = {"UID", "Username", "Fullname", "Address", "Phone", "Department", "Room", "Project", "Role"};
        model = new DefaultTableModel(row, 0) {
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }
        };
        for (int i = 0; i < allEmployee.size(); i++) {
            String role;
            switch (allEmployee.get(i).getRole()) {
                case 0:
                    role = "Admin";
                    break;
                case 1:
                    role = "Manager";
                    break;
                case 2:
                    role = "Deputy";
                    break;
                case 3:
                    role = "Lecturer";
                    break;
                case 4:
                    role = "Staff";
                    break;
                default:
                    role = "undefined";
                    break;
            }

            RoomDTO r = roomDAO.getRoomByID(allEmployee.get(i).getRid());
//            RoomDTO r = new RoomDTO(1, "rom", 1, 1, 1);
            DepartmentDTO d = departmentDAO.getDepByID(r.getDepid());
            ProjectDTO p = projectDAO.getProjectByID(allEmployee.get(i).getPrid());
            String project = "my chau";
            String[] data = {
                allEmployee.get(i).getUid() + "",
                allEmployee.get(i).getUsername() + "",
                allEmployee.get(i).getFullname() + "",
                allEmployee.get(i).getAddress() + "",
                allEmployee.get(i).getPhone() + "",
                d.getDepname(),
                r.getRname(),
                p.getPrname(),
                //                allEmployee.get(i).getRole() + ""
                role,};
            model.addRow(data);
        }
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.setModel(model);
    }
}
