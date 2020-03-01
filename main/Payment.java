/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import jdbcConnection.Connector;

/**
 *
 * @author USER
 */
public class Payment extends javax.swing.JInternalFrame {
    
    String classes,id,sn,classno,fn,subjected,bt,spn,fpn,pa,ps;
    String gap =  "  " ;
    
    public Payment() {
        initComponents();
        this.setBorder((javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0)));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
    }

     private void getallrecord() {
         id=sid.getText();
        sn = nam.getText();
            if (Xi.isSelected()) {
            classno = "XI";
        } else {
            classno = "XII";
        }
     
        for (int i = 0; i < panelsubject.getComponentCount(); i++) {
            JCheckBox checkbox = (JCheckBox) panelsubject.getComponent(i);
            if (checkbox.isSelected()) {
                subjected += checkbox.getText();
                subjected += gap;
            }
        }
        bt = cmbBatch.getSelectedItem().toString();
         pa = pamount.getText();
           ps=pstatus.getText();
        spn = sphone.getText();
        fpn = sphone.getText();
       
      
      
     
    
    }

    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btclass = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nam = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbBatch = new javax.swing.JComboBox<String>();
        jLabel6 = new javax.swing.JLabel();
        pamount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pstatus = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pdate = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sphone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        fphone = new javax.swing.JTextField();
        Xi = new javax.swing.JRadioButton();
        Xii = new javax.swing.JRadioButton();
        panelsubject = new javax.swing.JPanel();
        phe = new javax.swing.JCheckBox();
        chem = new javax.swing.JCheckBox();
        mat = new javax.swing.JCheckBox();
        biol = new javax.swing.JCheckBox();
        jLabel22 = new javax.swing.JLabel();
        cmbmonth = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tarea = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        paymenttable = new javax.swing.JTable();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jTextField14 = new javax.swing.JTextField();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(973, 770));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(152, 146, 105));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel2.setText("Id :");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));
        jPanel5.add(nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 220, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel3.setText("Name :");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 50, -1));
        jPanel5.add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 55, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel4.setText("Subjects :");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel5.setText("Batch Time :");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 80, -1));

        cmbBatch.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        cmbBatch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select Batch Time--", "Morning", "Afternoon" }));
        jPanel5.add(cmbBatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 155, 180, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel6.setText("Payable Amount :");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 120, -1));
        jPanel5.add(pamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 183, 120, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Payment Status :");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 110, -1));
        jPanel5.add(pstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 221, 120, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel9.setText("PaidDue Date :");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 100, -1));

        pdate.setDateFormatString("yyyy-MM-dd");
        jPanel5.add(pdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 271, 120, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel8.setText("Class :");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, 20));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel10.setText("StudentsPhoneNumber :");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 160, -1));
        jPanel5.add(sphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 309, 180, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel1.setText("FathersPhoneNumber :");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 150, 30));
        jPanel5.add(fphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 345, 180, -1));

        btclass.add(Xi);
        Xi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Xi.setText("XI");
        jPanel5.add(Xi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 60, -1));

        btclass.add(Xii);
        Xii.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Xii.setText("XII");
        jPanel5.add(Xii, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        panelsubject.setForeground(new java.awt.Color(255, 255, 255));

        phe.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        phe.setText("Physics");

        chem.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        chem.setText("Chemistry");

        mat.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        mat.setText("Math");

        biol.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        biol.setText("Biology");

        javax.swing.GroupLayout panelsubjectLayout = new javax.swing.GroupLayout(panelsubject);
        panelsubject.setLayout(panelsubjectLayout);
        panelsubjectLayout.setHorizontalGroup(
            panelsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelsubjectLayout.createSequentialGroup()
                .addComponent(phe, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chem)
                .addGap(8, 8, 8)
                .addComponent(mat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(biol))
        );
        panelsubjectLayout.setVerticalGroup(
            panelsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelsubjectLayout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addGroup(panelsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(phe, javax.swing.GroupLayout.PREFERRED_SIZE, 16, Short.MAX_VALUE)
                        .addComponent(chem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(mat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(biol, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.add(panelsubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 115, 310, 30));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel22.setText("Month :");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 50, -1));

        cmbmonth.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        cmbmonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select Month--", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel5.add(cmbmonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 180, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 460));

        Tarea.setColumns(20);
        Tarea.setRows(5);
        Tarea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane1.setViewportView(Tarea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 300, 360));

        jPanel7.setBackground(new java.awt.Color(152, 146, 105));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(0, 102, 51));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Inser into List");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 140, -1));

        jButton4.setBackground(new java.awt.Color(0, 102, 51));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("View Full List");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 120, -1));

        Reset.setBackground(new java.awt.Color(0, 102, 51));
        Reset.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        Reset.setForeground(new java.awt.Color(255, 255, 255));
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel7.add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        Update.setBackground(new java.awt.Color(0, 102, 51));
        Update.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel7.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 100, -1));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icons8-refund-80.png"))); // NOI18N
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, 80));

        jButton5.setBackground(new java.awt.Color(0, 102, 51));
        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("View Due List");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 120, -1));

        jButton7.setBackground(new java.awt.Color(0, 102, 51));
        jButton7.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("View Paid List");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jButton6.setBackground(new java.awt.Color(0, 102, 51));
        jButton6.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("View All Student");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 140, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 160, 460));

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 102, 51));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Print  Payment Copy");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 170, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 300, 100));

        paymenttable.setBackground(new java.awt.Color(152, 146, 105));
        paymenttable.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        paymenttable.setForeground(new java.awt.Color(255, 255, 255));
        paymenttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "ClassNo", "Subjects", "BatchTime", "PayableAmount", "PaymentStatus", "PaidDueDate", "StudentPhoneNumber", "FatherPhoneNumber"
            }
        ));
        paymenttable.setRowHeight(20);
        paymenttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymenttableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(paymenttable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 950, 280));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("FathersPhoneNumber :");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 130, -1));

        jLabel12.setText("id :");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel13.setText("Name :");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 40, -1));

        jLabel14.setText("Subjects :");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 50, -1));

        jLabel15.setText("Batch Time :");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 60, -1));

        jLabel16.setText("Payable Amount :");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, -1));

        jLabel17.setText("Payment Status :");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 90, -1));

        jLabel18.setText("Payment Status :");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 90, -1));

        jLabel19.setText("PaidDue Date :");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 90, -1));

        jLabel20.setText("StudentsPhoneNumber :");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 130, -1));
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 170, -1));
        jPanel3.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 170, -1));
        jPanel3.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 170, -1));
        jPanel3.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 170, -1));
        jPanel3.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 170, -1));
        jPanel3.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 170, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select Batch Time--", "Morning", "Afternoon" }));
        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));
        jPanel3.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 120, -1));

        jCheckBox5.setText("Biology");
        jPanel3.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        jCheckBox6.setText("Physics");
        jPanel3.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        jCheckBox7.setText("Chemistry");
        jPanel3.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jCheckBox8.setText("Math");
        jPanel3.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));
        jPanel3.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 290, 320));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 870, 190));

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 475, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 475, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 370, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 370, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = Connector.getConnection();
            String query = "insert into paidduelist(Id,Name,ClassNo,Subjects,BatchTime,PayableAmount,PaymentStatus,PaidDueDate,StudentPhoneNumber,FatherPhoneNumber,Month)values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, sid.getText());
            pst.setString(2, nam.getText());
            
            if (Xi.isSelected()) {
                classes = "XI";
            }
            if (Xii.isSelected()) {
                classes = "XII";
            }
            pst.setString(3, classes);
            
            String course = "";
            if (phe.isSelected()) {
                course += phe.getText() + " ";
            }
            if (chem.isSelected()) {
                course += chem.getText() + " ";
            }
            if (mat.isSelected()) {
                course += mat.getText() + " ";
            }
            if (biol.isSelected()) {
                course += biol.getText() + " ";
            }
            pst.setString(4, course);
            
            String batch;
            batch = cmbBatch.getSelectedItem().toString();
            pst.setString(5, batch);
            pst.setString(6, pamount.getText());
            pst.setString(7, pstatus.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
            String datee = sdf.format(pdate.getDate());
            pst.setString(8, datee);
            pst.setString(9, sphone.getText());
            pst.setString(10, fphone.getText());
              String mon;
         mon=cmbmonth.getSelectedItem().toString();
            pst.setString(11, mon);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted Successfully");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        sid.setText("");
        nam.setText("");
        btclass.clearSelection();
        phe.setSelected(false);
        chem.setSelected(false);
        mat.setSelected(false);
        biol.setSelected(false);
        cmbBatch.setSelectedIndex(0);
        pamount.setText("");
        pstatus.setText("");
       pdate.setCalendar(null);
        
        sphone.setText("");
        fphone.setText("");
           cmbmonth.setSelectedIndex(0);
        Tarea.setText("");
        
    }//GEN-LAST:event_ResetActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Connection con = null;
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = Connector.getConnection();
            String query = " select * from paidduelist";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) paymenttable.getModel();
            model.setRowCount(0);
            
            while (rs.next()) {
                Object o[] = {rs.getString("Id"), rs.getString("Name"), rs.getString("ClassNo"), rs.getString("Subjects"), rs.getString("BatchTime"), rs.getString("PayableAmount"), rs.getString("PaymentStatus"), rs.getString("StudentPhoneNumber"), rs.getString("StudentPhoneNumber"), rs.getString("FatherPhoneNumber")};
                model.addRow(o);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Tarea.print();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
       Connection con = null;
        ResultSet rs;
        Statement stmt = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = Connector.getConnection();
            int row = paymenttable.getSelectedRow();
            String value = (paymenttable.getModel().getValueAt(row, 0).toString());
            String query = "UPDATE  paidduelist SET  Name=?, ClassNo=?, Subjects=?, BatchTime=?, PayableAmount=?, PaymentStatus=?, PaidDueDate=?, StudentPhoneNumber=?, FatherPhoneNumber=?,Month=? where id=" + value;
            PreparedStatement pst = con.prepareStatement(query);
            
            pst.setString(1, nam.getText());
            
            if (Xi.isSelected()) {
                classes = "XI";
            }
            if (Xii.isSelected()) {
                classes = "XII";
            }
            pst.setString(2, classes);
            
            String course = "";
            if (phe.isSelected()) {
                course += phe.getText() + " ";
            }
            if (chem.isSelected()) {
                course += chem.getText() + " ";
            }
            if (mat.isSelected()) {
                course += mat.getText() + " ";
            }
            if (biol.isSelected()) {
                course += biol.getText() + " ";
            }
            pst.setString(3, course);
            String batch;
            batch =cmbBatch.getSelectedItem().toString();
            pst.setString(4, batch);
            pst.setString(5, pamount.getText());
            pst.setString(6, pstatus.getText());
            SimpleDateFormat sf = new SimpleDateFormat("YYYY-MM-dd");
            String datery= sf.format(pdate.getDate());
            pst.setString(7, datery);
            pst.setString(8, sphone.getText());
            pst.setString(9, fphone.getText());
            String month;
           month = cmbmonth.getSelectedItem().toString();
            pst.setString(10, month);
            
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) paymenttable.getModel();
            model.setRowCount(0);
            JOptionPane.showMessageDialog(null, "Updated Successfully");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
            String dater= sdf.format(pdate.getDate());
             Class.forName("com.mysql.jdbc.Driver");
            con = Connector.getConnection();
             stmt = con.createStatement();
             String zxc="Student Payment";
            
          stmt.executeUpdate("delete from temp");
            
            stmt.executeUpdate("insert into temp ( id,amount,creditdate) values('"+1+"' , '"+pamount.getText()+"','"+dater+"')");
            
            rs=stmt.executeQuery("select CreditDate,Amount from creditlist where CreditDate='"+dater+"' ");
            
            if(rs.next()){
            
            int amo=rs.getInt("Amount");
              String abc=pamount.getText();
            amo+=Integer.parseInt(abc); 
                
               stmt.executeUpdate("update creditlist set Amount='"+amo+"' where CreditDate='"+dater+"'  ");
            
            }
            
            else{
            
             stmt.executeUpdate("insert into creditlist (Amount,CreditDate,Purpose,Details) values('"+pamount.getText()+"','"+dater+"','"+zxc+"','N/A') ");
         
            }
            

            
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void paymenttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymenttableMouseClicked
        int i = paymenttable.getSelectedRow();
        TableModel model = paymenttable.getModel();
        sid.setText(model.getValueAt(i, 0).toString());
        nam.setText(model.getValueAt(i, 1).toString());
        String cls = model.getValueAt(i, 2).toString();
        if (cls.equals("XI")) {
            Xi.setSelected(true);
        } else {
            Xii.setSelected(true);
        }
        /*switch(sub){
            case " Physics " :
            phy.setSelected(true);
            che.setSelected(false);
        }*/
        String bat = model.getValueAt(i, 4).toString();
        switch (bat) {
            case " Morning ":
                cmbBatch.setSelectedIndex(0);
                break;
            case " Afternoon ":
                cmbBatch.setSelectedIndex(1);
                break;
        }
        pamount.setText(model.getValueAt(i, 5).toString());
        pstatus.setText(model.getValueAt(i, 6).toString());
        try {
            int srow = paymenttable.getSelectedRow();
            Date dat = new SimpleDateFormat("yyyy-MM-dd").parse((String) model.getValueAt(i, 7));
            pdate.setDate(dat);
        } catch (Exception e) {
        }
        sphone.setText(model.getValueAt(i, 8).toString());
        fphone.setText(model.getValueAt(i, 9).toString());
        

    }//GEN-LAST:event_paymenttableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   getallrecord();
        Tarea.setText("*********************************************************\n");
        Tarea.setText(Tarea.getText() + "**                              Payment Receipt                           **\n");
        Tarea.setText(Tarea.getText() + "*********************************************************\n");

        Date obj = new Date();
        String date = obj.toString();

        Tarea.setText(Tarea.getText() + "\n" + date + "\n\n");
        Tarea.setText(Tarea.getText() + "ID: " + id + "\n");
        Tarea.setText(Tarea.getText() + "Student Name: " + sn + "\n");
         Tarea.setText(Tarea.getText() + "Class: " + classno + "\n");
        Tarea.setText(Tarea.getText() + "Subjects: " + subjected + "\n");
        Tarea.setText(Tarea.getText() + "Batch Time: " + bt + "\n");
            Tarea.setText(Tarea.getText() + "Payable Amount: " + pa + " Tk " + "\n");
              Tarea.setText(Tarea.getText() + "Payment Status: " +ps + "\n");
        Tarea.setText(Tarea.getText() + "Student Phone Number: " + spn + "\n");
        Tarea.setText(Tarea.getText() + "Father Phone Number: " + fpn + "\n");
    
      
        Tarea.setText(Tarea.getText() + "\n\n\n\n                                                                        Signature ");

        if (sn.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter Name");
           nam.requestFocus();
        } else {
           // file = new File("E://info.txt");
            JOptionPane.showMessageDialog(rootPane, "Data Submitted");
        }
        
   
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      String x="paid";
        
        Connection con;
        Statement stm;
        ResultSet rs;
        
        try {
            
           
            con = Connector.getConnection();
            stm=con.createStatement();
  rs = stm.executeQuery("select * from paidduelist where PaymentStatus='"+x+"' ");
    DefaultTableModel model = (DefaultTableModel) paymenttable.getModel();
            model.setRowCount(0);
            
        
            while (rs.next()) {
                
               Object p[] = {rs.getString("Id"),rs.getString("Name"), rs.getString("ClassNo"), rs.getString("Subjects"), rs.getString("BatchTime"),rs.getString("PayableAmount"),rs.getString("PaymentStatus")};
               model.addRow(p);
                
                
            }
            
            
            
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      String y="Due";
        
        Connection con;
        Statement stm;
        ResultSet rs;
        
        try {
            
           
            con = Connector.getConnection();
            stm=con.createStatement();
  rs = stm.executeQuery("select * from paidduelist where PaymentStatus='"+y+"' ");
    DefaultTableModel model = (DefaultTableModel) paymenttable.getModel();
            model.setRowCount(0);
            
        
            while (rs.next()) {
                
               Object p[] = {rs.getString("Id"),rs.getString("Name"), rs.getString("ClassNo"), rs.getString("Subjects"), rs.getString("BatchTime"),rs.getString("PayableAmount"),rs.getString("PaymentStatus")};
               model.addRow(p);
                
                
            }
            
            
            
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      AllStudent as=new AllStudent();
      as.setVisible(true);
       Connection con=null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = Connector.getConnection();
            String query=" select * from batch41";
            PreparedStatement pst=con.prepareStatement(query);
            ResultSet rs=pst.executeQuery();
            DefaultTableModel model=( DefaultTableModel) as.allstudent.getModel();
            model.setRowCount(0);

            while(rs.next()){
                Object o[]={rs.getString("id"),rs.getString("Name"),rs.getString("ContactNumber"),rs.getString("FatherName"),rs.getString("FatherContact"),rs.getString("MotherName"),rs.getString("MotherContact"),rs.getString("Class"),rs.getString("CollegeName"),rs.getString("Subjects"),rs.getString("BatchTime"),rs.getString("Email"),rs.getString("Address"),rs.getString("AddDate")};
                model.addRow(o);
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset;
    private javax.swing.JTextArea Tarea;
    private javax.swing.JButton Update;
    private javax.swing.JRadioButton Xi;
    private javax.swing.JRadioButton Xii;
    private javax.swing.JCheckBox biol;
    private javax.swing.ButtonGroup btclass;
    private javax.swing.JCheckBox chem;
    private javax.swing.JComboBox<String> cmbBatch;
    private javax.swing.JComboBox<String> cmbmonth;
    private javax.swing.JTextField fphone;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JCheckBox mat;
    private javax.swing.JTextField nam;
    private javax.swing.JTextField pamount;
    private javax.swing.JPanel panelsubject;
    private javax.swing.JTable paymenttable;
    private com.toedter.calendar.JDateChooser pdate;
    private javax.swing.JCheckBox phe;
    private javax.swing.JTextField pstatus;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField sphone;
    // End of variables declaration//GEN-END:variables
}
