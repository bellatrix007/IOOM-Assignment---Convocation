package assignment2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Aditi
 */
public class JFrame_Student extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_UG
     */
    private String course;
    private ArrayList<student> s;
    
    public JFrame_Student(String type, ArrayList<student> s1) {
        course = type;
        s = s1;
        initComponents();
        setFrame();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rollLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        deptLabel = new javax.swing.JLabel();
        regLabel = new javax.swing.JLabel();
        CGPALabel = new javax.swing.JLabel();
        roll = new javax.swing.JTextField();
        dept = new javax.swing.JTextField();
        specializationLabel = new javax.swing.JLabel();
        reg = new javax.swing.JTextField();
        CGPA = new javax.swing.JTextField();
        cre = new javax.swing.JTextField();
        creditsLabel = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        specialization = new javax.swing.JTextField();
        thesisLabel = new javax.swing.JLabel();
        thesis = new javax.swing.JTextField();
        yearLabel = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "STUDENT DETAILS", 0, 0, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N

        rollLabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rollLabel.setText("Roll Number:");

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        nameLabel.setText("Name:");

        deptLabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        deptLabel.setText("Department:");

        regLabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        regLabel.setText("Period of Registration:");

        CGPALabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        CGPALabel.setText("CGPA:");

        roll.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        roll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollActionPerformed(evt);
            }
        });

        dept.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptActionPerformed(evt);
            }
        });

        specializationLabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        specializationLabel.setText("Specialization:");

        reg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        CGPA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        creditsLabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        creditsLabel.setText("Credits:");

        name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        specialization.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        thesisLabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        thesisLabel.setText("Thesis Area:");

        thesis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        yearLabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        yearLabel.setText("Year of Conformation:");

        year.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(creditsLabel)
                    .addComponent(nameLabel)
                    .addComponent(rollLabel)
                    .addComponent(deptLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(regLabel)
                            .addComponent(CGPALabel)
                            .addComponent(thesisLabel)
                            .addComponent(specializationLabel)
                            .addComponent(yearLabel))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roll)
                            .addComponent(name)
                            .addComponent(dept)
                            .addComponent(specialization)
                            .addComponent(reg)
                            .addComponent(CGPA, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(cre)
                            .addComponent(thesis)
                            .addComponent(year))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rollLabel)
                    .addComponent(roll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deptLabel)
                    .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(specializationLabel)
                    .addComponent(specialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CGPALabel)
                    .addComponent(CGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creditsLabel)
                    .addComponent(cre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thesisLabel)
                    .addComponent(thesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearLabel)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Add More..");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Show Result");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setFrame()
    {
        if(course.equals("UG"))
        {
            setSpecialization();
            setThesis();
            setYear();
        }
        else if(course.equals("PG"))
        {
            setYear();
        }
        else if(course.equals("UG+PG"))
        {
            setYear("Year of Conformation to Postgraduation:");
        }
        else if(course.equals("PhD"))
        {
            dept.setText("NA");
            dept.setEditable(false);
            CGPA.setText("NA");
            CGPA.setEditable(false);
            setSpecialization();
            setYear();
        }
        else if(course.equals("PG+PhD"))
        {
            dept.setText("NA");
            dept.setEditable(false);
            setSpecialization();
            setYear("Year of Conformation to Doctoral:");
        }
    }
    
    private void setSpecialization()
    {
        specialization.setText("NA");
        specialization.setEditable(false);
    }
    
    private void setThesis()
    {
        thesis.setText("NA");
        thesis.setEditable(false);
    }
    
    private void setYear()
    {
        year.setText("NA");
        year.setEditable(false);
    }
    
    private void setYear(String s)
    {
        yearLabel.setText(s);
    }
    
    private void rollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rollActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        addStudent();
        this.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame2(s).setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptActionPerformed
        
    }//GEN-LAST:event_deptActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        addStudent();
        this.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame1(s).setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton2ActionPerformed

    private void addStudent()
    {
        try{
        if(course.equals("UG"))
        {
            UG ug = new UG(course, roll.getText(), name.getText(), dept.getText(), Integer.parseInt(reg.getText()), Integer.parseInt(CGPA.getText()), Integer.parseInt(cre.getText()));
            s.add(ug);
        }
        else if(course.equals("PG"))
        {
            PG pg = new PG(course, roll.getText(), name.getText(), dept.getText(), specialization.getText(), Integer.parseInt(reg.getText()), Integer.parseInt(CGPA.getText()), Integer.parseInt(cre.getText()), thesis.getText());
            s.add(pg);
        }
        else if(course.equals("UG+PG"))
        {
            UGPG ugPg = new UGPG(course, roll.getText(), name.getText(), dept.getText(), specialization.getText(), Integer.parseInt(reg.getText()), Integer.parseInt(CGPA.getText()), Integer.parseInt(cre.getText()), thesis.getText(), Integer.parseInt(year.getText()));
            s.add(ugPg);
        }
        else if(course.equals("PhD"))
        {
            PhD phD = new PhD(course, roll.getText(), name.getText(), Integer.parseInt(reg.getText()), Integer.parseInt(cre.getText()), thesis.getText());
            s.add(phD);
        }
        else if(course.equals("PG+PhD"))
        {
            PGPhD pgPhD = new PGPhD(course, roll.getText(), name.getText(), Integer.parseInt(reg.getText()), Integer.parseInt(CGPA.getText()), Integer.parseInt(cre.getText()), thesis.getText(), Integer.parseInt(year.getText()));
            s.add(pgPhD);
        }
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this,"Input Error - Unknown input found instead of an Integer");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Student("",null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CGPA;
    private javax.swing.JLabel CGPALabel;
    private javax.swing.JTextField cre;
    private javax.swing.JLabel creditsLabel;
    private javax.swing.JTextField dept;
    private javax.swing.JLabel deptLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField reg;
    private javax.swing.JLabel regLabel;
    private javax.swing.JTextField roll;
    private javax.swing.JLabel rollLabel;
    private javax.swing.JTextField specialization;
    private javax.swing.JLabel specializationLabel;
    private javax.swing.JTextField thesis;
    private javax.swing.JLabel thesisLabel;
    private javax.swing.JTextField year;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}
