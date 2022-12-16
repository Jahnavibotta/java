/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FinalProject;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brend
 */
public class UI_Home extends javax.swing.JFrame {

    /**
     * Creates new form UI_Home
     */
    public UI_Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Edit_Students = new javax.swing.JButton();
        Students_Label = new javax.swing.JLabel();
        Assignments_Label = new javax.swing.JLabel();
        Welcome_Label = new javax.swing.JLabel();
        View_Grades = new javax.swing.JButton();
        Students_Label1 = new javax.swing.JLabel();
        Add_Assignments = new javax.swing.JButton();
        Edit_Assignments = new javax.swing.JButton();
        Add_Grades = new javax.swing.JButton();
        Edit_Grades = new javax.swing.JButton();
        Add_Students = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Edit_Students.setText("Edit Students");
        Edit_Students.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_StudentsActionPerformed(evt);
            }
        });

        Students_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Students_Label.setText("Students");

        Assignments_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Assignments_Label.setText("Grades");

        Welcome_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome_Label.setText("Welcome To The Grading Application!");

        View_Grades.setText("View Grades");
        View_Grades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_GradesActionPerformed(evt);
            }
        });

        Students_Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Students_Label1.setText("Assignments");

        Add_Assignments.setText("Add Assignments");
        Add_Assignments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_AssignmentsActionPerformed(evt);
            }
        });

        Edit_Assignments.setText("Edit Assignments");
        Edit_Assignments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_AssignmentsActionPerformed(evt);
            }
        });

        Add_Grades.setText("Add Grades");
        Add_Grades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_GradesActionPerformed(evt);
            }
        });

        Edit_Grades.setText("Edit Grades");
        Edit_Grades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_GradesActionPerformed(evt);
            }
        });

        Add_Students.setText("Add Students");
        Add_Students.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_StudentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Welcome_Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Add_Students, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Edit_Students, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Students_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(View_Grades, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Students_Label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Edit_Assignments, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(Add_Assignments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Add_Grades, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(Assignments_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Edit_Grades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(82, 82, 82))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Welcome_Label)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Students_Label)
                    .addComponent(Assignments_Label)
                    .addComponent(Students_Label1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_Students)
                    .addComponent(Add_Grades)
                    .addComponent(Add_Assignments))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edit_Students)
                    .addComponent(Edit_Grades)
                    .addComponent(Edit_Assignments))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(View_Grades)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Edit_StudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_StudentsActionPerformed
        super.dispose();
        new UI_EditStudent().setVisible(true);
    }//GEN-LAST:event_Edit_StudentsActionPerformed

    private void View_GradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_GradesActionPerformed
        
        try {
            super.dispose();
            new UI_ViewGrades().setVisible(true);
        } catch (IOException ex) {
           // Logger.getLogger(UI_Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_View_GradesActionPerformed

    private void Add_AssignmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_AssignmentsActionPerformed
        super.dispose();
        new UI_AddAssignment().setVisible(true);
    }//GEN-LAST:event_Add_AssignmentsActionPerformed

    private void Edit_AssignmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_AssignmentsActionPerformed
        super.dispose();
        new UI_EditAssignment().setVisible(true);
    }//GEN-LAST:event_Edit_AssignmentsActionPerformed

    private void Add_GradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_GradesActionPerformed
        super.dispose();
        new UI_AddGrade().setVisible(true);
    }//GEN-LAST:event_Add_GradesActionPerformed

    private void Edit_GradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_GradesActionPerformed
        super.dispose();
        new UI_EditGrade().setVisible(true);
    }//GEN-LAST:event_Edit_GradesActionPerformed

    private void Add_StudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_StudentsActionPerformed
        super.dispose();
        new UI_AddStudent().setVisible(true);
    }//GEN-LAST:event_Add_StudentsActionPerformed

    public static void main(String args[]) {

        new UI_Home().setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Assignments;
    private javax.swing.JButton Add_Grades;
    private javax.swing.JButton Add_Students;
    private javax.swing.JLabel Assignments_Label;
    private javax.swing.JButton Edit_Assignments;
    private javax.swing.JButton Edit_Grades;
    private javax.swing.JButton Edit_Students;
    private javax.swing.JLabel Students_Label;
    private javax.swing.JLabel Students_Label1;
    private javax.swing.JButton View_Grades;
    private javax.swing.JLabel Welcome_Label;
    // End of variables declaration//GEN-END:variables
}