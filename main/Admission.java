/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import jdbcConnection.Connector;

/**
 *
 * @author USER
 */
public class Admission extends javax.swing.JInternalFrame {
    
    String classes;
    
    public Admission() {
        initComponents();
        this.setBorder((javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0)));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgClass = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        id = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fathercontact = new javax.swing.JTextField();
        Id = new javax.swing.JTextField();
        contactnumber = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        mothername = new javax.swing.JTextField();
        xi = new javax.swing.JRadioButton();
        xii = new javax.swing.JRadioButton();
        collegename = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        mothercontact = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        phy = new javax.swing.JCheckBox();
        che = new javax.swing.JCheckBox();
        math = new javax.swing.JCheckBox();
        bio = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        cmbatch = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        fathername = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        addate = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        reset = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        apply = new javax.swing.JButton();
        UpdateStudent = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(973, 770));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1151, 0, -1, 845));

        id.setBackground(new java.awt.Color(0, 102, 102));
        id.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0), "Admission Form", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name :");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FatherName :");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FatherContact :");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MotheName :");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("id :");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Class :");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CollegeName :");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email :");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Address :");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("MotherContact :");

        contactnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactnumberActionPerformed(evt);
            }
        });

        btgClass.add(xi);
        xi.setForeground(new java.awt.Color(255, 255, 255));
        xi.setText("XI");

        btgClass.add(xii);
        xii.setForeground(new java.awt.Color(255, 255, 255));
        xii.setText("XII");

        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ContactNumber :");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Subjects :");

        phy.setForeground(new java.awt.Color(255, 255, 255));
        phy.setText("Physics");

        che.setForeground(new java.awt.Color(255, 255, 255));
        che.setText("Chemistry");

        math.setForeground(new java.awt.Color(255, 255, 255));
        math.setText("Math");

        bio.setForeground(new java.awt.Color(255, 255, 255));
        bio.setText("Biology");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("BatchTime :");

        cmbatch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Batch Time--", "Morning", "Afternoon" }));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/group2.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Add Date :");

        addate.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout idLayout = new javax.swing.GroupLayout(id);
        id.setLayout(idLayout);
        idLayout.setHorizontalGroup(
            idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idLayout.createSequentialGroup()
                .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1))
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel7)
                        .addGap(31, 31, 31)
                        .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addGap(16, 16, 16)
                        .addComponent(contactnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)
                        .addGap(21, 21, 21)
                        .addComponent(fathername, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)
                        .addGap(15, 15, 15)
                        .addComponent(fathercontact, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel6)
                        .addGap(14, 14, 14)
                        .addComponent(mothername, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(xi)
                        .addGap(5, 5, 5)
                        .addComponent(xii))
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel14)
                        .addGap(13, 13, 13)
                        .addComponent(cmbatch, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(idLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(phy)
                                .addGap(19, 19, 19)
                                .addComponent(che))
                            .addGroup(idLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(collegename, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(idLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(math, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(bio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(idLayout.createSequentialGroup()
                .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel13)
                        .addGap(15, 15, 15)
                        .addComponent(mothercontact, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(addate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        idLayout.setVerticalGroup(
            idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(contactnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(fathername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(fathercontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(mothername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel13))
                    .addComponent(mothercontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(xi)
                        .addComponent(jLabel8))
                    .addComponent(xii))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(collegename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(idLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phy)
                            .addComponent(che))
                        .addGap(7, 7, 7)
                        .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(math)
                            .addComponent(bio)))
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel14))
                    .addComponent(cmbatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel11))
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(idLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(idLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(addate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 740));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 0, 590, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reset.setBackground(new java.awt.Color(0, 153, 102));
        reset.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel3.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 102));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jButton1.setText("View Student List");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        delete.setBackground(new java.awt.Color(204, 0, 0));
        delete.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        apply.setBackground(new java.awt.Color(0, 153, 102));
        apply.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        apply.setText("Apply");
        apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyActionPerformed(evt);
            }
        });
        jPanel3.add(apply, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        UpdateStudent.setBackground(new java.awt.Color(0, 153, 102));
        UpdateStudent.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        UpdateStudent.setText("Update");
        UpdateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateStudentActionPerformed(evt);
            }
        });
        jPanel3.add(UpdateStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 590, 150));

        studentTable.setBackground(new java.awt.Color(0, 102, 102));
        studentTable.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        studentTable.setForeground(new java.awt.Color(255, 255, 255));
        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Name", "ContactNumber", "FatherName", "FatherContact", "MotherName", "MotherContact", "Class", "CollegeName", "Subjects", "BatchTime", "Email", "Address", "AddDate"
            }
        ));
        studentTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentTable.setRowHeight(20);
        studentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(studentTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 590, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contactnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactnumberActionPerformed

    private void applyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyActionPerformed
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = Connector.getConnection();
            String query = "insert into batch41(id,Name,ContactNumber,FatherName,FatherContact,MotherName,MotherContact,Class,CollegeName,Subjects,BatchTime,Email,Address,AddDate)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, Id.getText());
            pst.setString(2, name.getText());
            pst.setString(3, contactnumber.getText());
            pst.setString(4, fathername.getText());
            pst.setString(5, fathercontact.getText());
            pst.setString(6, mothername.getText());
            pst.setString(7, mothercontact.getText());

            if (xi.isSelected()) {
                classes = "XI";
            }
            if (xii.isSelected()) {
                classes = "XII";
            }
            pst.setString(8, classes);

            pst.setString(9, collegename.getText());
            String course = "";
            if (phy.isSelected()) {
                course += phy.getText() + " ";
            }
            if (che.isSelected()) {
                course += che.getText() + " ";
            }
             if (math.isSelected()) {
                course += math.getText() + " ";
            }
         if (bio.isSelected()) {
                course += bio.getText() + " ";
            }
            pst.setString(10, course);
            String batch;
            batch = cmbatch.getSelectedItem().toString();
            pst.setString(11, batch);
            pst.setString(12, email.getText());
            pst.setString(13, txtarea.getText());
             SimpleDateFormat sdfd = new SimpleDateFormat("YYYY-MM-dd");
            String dateer = sdfd.format(addate.getDate());
            pst.setString(14, dateer);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Application Submitted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_applyActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        Id.setText("");
        name.setText("");
        btgClass.clearSelection();
        phy.setSelected(false);
        che.setSelected(false);
        math.setSelected(false);
        bio.setSelected(false);
        cmbatch.setSelectedIndex(0);
        contactnumber.setText("");
        fathername.setText("");

        fathercontact.setText("");
        mothername.setText("");
        mothercontact.setText("");
        collegename.setText("");
        email.setText("");
        txtarea.setText("");
        addate.setCalendar(null);
    }//GEN-LAST:event_resetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (xi.isSelected()) {
                classes = "XI";
   viS(classes);
  
               
            }
        else  if (xii.isSelected()) {
                classes = "XII";
                viS(classes);
                
            }
        
        else{
            
              Connection con=null;

        try {
           
            Class.forName("com.mysql.jdbc.Driver");
            con = Connector.getConnection();
            String query=" select * from batch41";
            PreparedStatement pst=con.prepareStatement(query);
            ResultSet rs=pst.executeQuery();
            DefaultTableModel model=( DefaultTableModel)studentTable.getModel();
            model.setRowCount(0);

            while(rs.next()){
                Object o[]={rs.getString("id"),rs.getString("Name"),rs.getString("ContactNumber"),rs.getString("FatherName"),rs.getString("FatherContact"),rs.getString("MotherName"),rs.getString("MotherContact"),rs.getString("Class"),rs.getString("CollegeName"),rs.getString("Subjects"),rs.getString("BatchTime"),rs.getString("Email"),rs.getString("Address"),rs.getString("AddDate")};
                model.addRow(o);
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void UpdateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateStudentActionPerformed
        Connection con=null;
        try {
             Class.forName("com.mysql.jdbc.Driver");
            con = Connector.getConnection();
            int row=studentTable.getSelectedRow();
            String value=(studentTable.getModel().getValueAt(row,0).toString());
            String query="UPDATE  batch41 SET  Name=?, ContactNumber=?, FatherName=?, FatherContact=?, MotherName=?, MotherContact=?, Class=?, CollegeName=?, Subjects=?, BatchTime=?, Email=?, Address=?, AddDate=? where id="+value;
            PreparedStatement pst = con.prepareStatement(query);
          
            pst.setString(1, name.getText());
            pst.setString(2, contactnumber.getText());
            pst.setString(3, fathername.getText());
            pst.setString(4, fathercontact.getText());
            pst.setString(5, mothername.getText());
            pst.setString(6, mothercontact.getText());

            if (xi.isSelected()) {
                classes = "XI";
            }
            if (xii.isSelected()) {
                classes = "XII";
            }
            pst.setString(7, classes);

            pst.setString(8, collegename.getText());
            String course = "";
            if (phy.isSelected()) {
                course += phy.getText() + " ";
            }
            if (che.isSelected()) {
                course += che.getText() + " ";
            }
            if (math.isSelected()) {
                course += math.getText() + " ";
            }
            if (bio.isSelected()) {
                course += bio.getText() + " ";
            }
            pst.setString(9, course);
            String batch;
            batch = cmbatch.getSelectedItem().toString();
            pst.setString(10, batch);
            pst.setString(11, email.getText());
            pst.setString(12, txtarea.getText());
             SimpleDateFormat sd = new SimpleDateFormat("YYYY-MM-dd");
            String dateery = sd.format(addate.getDate());
            pst.setString(13, dateery);
            pst.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)studentTable.getModel();
            model.setRowCount(0);
            JOptionPane.showMessageDialog(null, "Updated Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
             
             
            
       
    }//GEN-LAST:event_UpdateStudentActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
         Connection con=null;try {
             Class.forName("com.mysql.jdbc.Driver");
            con = Connector.getConnection();
             int row=studentTable.getSelectedRow();
          String value=(studentTable.getModel().getValueAt(row,0).toString());
          String query="DELETE FROM batch41 where id="+value;
           PreparedStatement pst = con.prepareStatement(query);
           pst.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)studentTable.getModel();
            model.setRowCount(0);
           JOptionPane.showMessageDialog(rootPane, "Deleted Successfully");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void studentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTableMouseClicked
        try {

            int i = studentTable.getSelectedRow();
            TableModel model = studentTable.getModel();
            Id.setText(model.getValueAt(i, 0).toString());
            name.setText(model.getValueAt(i, 1).toString());
            contactnumber.setText(model.getValueAt(i, 2).toString());
            fathername.setText(model.getValueAt(i, 3).toString());
            fathercontact.setText(model.getValueAt(i, 4).toString());
            mothername.setText(model.getValueAt(i, 5).toString());
            mothercontact.setText(model.getValueAt(i, 6).toString());
            String cls = model.getValueAt(i, 7).toString();
            if (cls.equals("XI")) {
                xi.setSelected(true);
                xii.setSelected(false);
            } else {
                xii.setSelected(true);
                xi.setSelected(false);
            }
            collegename.setText(model.getValueAt(i, 8).toString());
            String sub = model.getValueAt(i, 9).toString();
            /*switch(sub){
                case " Physics " :
                phy.setSelected(true);
                che.setSelected(false);
            }*/
            String bat = model.getValueAt(i, 10).toString();
            switch (bat) {
                case " Morning ":
                cmbatch.setSelectedIndex(0);
                break;
                case " Afternoon ":
                cmbatch.setSelectedIndex(1);
                break;
            }
            email.setText(model.getValueAt(i, 11).toString());
            txtarea.setText(model.getValueAt(i, 12).toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_studentTableMouseClicked

  public void viS(String abc){
  
  Connection con=null;
      Statement stm=null;
      ResultSet rs=null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = Connector.getConnection();
             stm = con.createStatement();
                rs = stm.executeQuery("select * from batch41 where class='"+abc+"' ");
           
            
            
            DefaultTableModel model=( DefaultTableModel)studentTable.getModel();
            model.setRowCount(0);

            while(rs.next()){
                Object o[]={rs.getString("id"),rs.getString("Name"),rs.getString("ContactNumber"),rs.getString("FatherName"),rs.getString("FatherContact"),rs.getString("MotherName"),rs.getString("MotherContact"),rs.getString("Class"),rs.getString("CollegeName"),rs.getString("Subjects"),rs.getString("BatchTime"),rs.getString("Email"),rs.getString("Address")};
                model.addRow(o);
            }

        } catch (Exception e){
            e.printStackTrace();
        }
  
  
  
  }
   
   
   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Id;
    private javax.swing.JButton UpdateStudent;
    private com.toedter.calendar.JDateChooser addate;
    private javax.swing.JButton apply;
    private javax.swing.JCheckBox bio;
    private javax.swing.ButtonGroup btgClass;
    private javax.swing.JCheckBox che;
    private javax.swing.JComboBox<String> cmbatch;
    private javax.swing.JTextField collegename;
    private javax.swing.JTextField contactnumber;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fathercontact;
    private javax.swing.JTextField fathername;
    private javax.swing.JPanel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox math;
    private javax.swing.JTextField mothercontact;
    private javax.swing.JTextField mothername;
    private javax.swing.JTextField name;
    private javax.swing.JCheckBox phy;
    private javax.swing.JButton reset;
    private javax.swing.JTable studentTable;
    private javax.swing.JTextArea txtarea;
    private javax.swing.JRadioButton xi;
    private javax.swing.JRadioButton xii;
    // End of variables declaration//GEN-END:variables
}
