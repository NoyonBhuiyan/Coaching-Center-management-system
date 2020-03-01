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
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import jdbcConnection.Connector;

/**
 *
 * @author USER
 */
public class Credit extends javax.swing.JInternalFrame {

 String mon;
    public Credit() {
        initComponents();
        this.setBorder((javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0)));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
    }
  
    
    
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        camount = new javax.swing.JTextField();
        cdate = new com.toedter.calendar.JDateChooser();
        cpurpose = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        cdetails = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        serialno = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbMonth = new javax.swing.JComboBox<String>();
        jLabel8 = new javax.swing.JLabel();
        cmbyear = new javax.swing.JComboBox<String>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        creditTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        month = new javax.swing.JButton();
        year = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(973, 770));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(47, 51, 54));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Amount :");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CreditDate :");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Purpose :");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Details :");

        cdate.setDateFormatString("yyyy-MM-dd");

        cpurpose.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        cpurpose.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select Credit Purpose--", "Student Payment", "Profit", "Books Payment", "Boss Collection" }));

        cdetails.setColumns(20);
        cdetails.setRows(5);
        jScrollPane1.setViewportView(cdetails);

        jButton1.setBackground(new java.awt.Color(0, 153, 102));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 102));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jButton3.setText("View Credit List");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Srl_no :");

        update.setBackground(new java.awt.Color(0, 153, 102));
        update.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icons8-payment-history-100.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Month :");

        cmbMonth.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select Month--", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Year :");

        cmbyear.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        cmbyear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select Year--", "2030", "2029", "2028", "2027", "2026", "2025", "2024", "2023", "2022", "2021", "2020", "2019", "2018", " " }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addGap(16, 16, 16)
                        .addComponent(camount, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(cdate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5)
                        .addGap(19, 19, 19)
                        .addComponent(serialno, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jLabel3)
                            .addGap(14, 14, 14)
                            .addComponent(cpurpose, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(jLabel4)
                                    .addGap(14, 14, 14))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmbyear, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbMonth, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton1)
                        .addGap(32, 32, 32)
                        .addComponent(update)
                        .addGap(38, 38, 38)
                        .addComponent(jButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jButton3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(serialno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(camount, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(cpurpose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(update)
                    .addComponent(jButton2))
                .addGap(34, 34, 34)
                .addComponent(jButton3)
                .addGap(88, 88, 88))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 730));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        creditTable.setBackground(new java.awt.Color(41, 123, 136));
        creditTable.setForeground(new java.awt.Color(255, 255, 255));
        creditTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Srl_no", "Amount", "CreditDate", "Purpose", "Details", "Month", "Year"
            }
        ));
        creditTable.setRowHeight(20);
        creditTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creditTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(creditTable);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 570, 630));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 0, 590, 630));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        month.setBackground(new java.awt.Color(0, 153, 0));
        month.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        month.setText("View Monthly Summary");
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });

        year.setBackground(new java.awt.Color(0, 153, 0));
        year.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        year.setText("View Yearly Summary");
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(month)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(year)
                .addGap(43, 43, 43))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(month)
                    .addComponent(year))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 640, 590, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = Connector.getConnection();
            String query = "insert into creditlist(Srl_no,Amount,CreditDate,Purpose,Details,Month,Year)values(?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
             pst.setString(1,serialno.getText());
            pst.setString(2, camount.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
            String datee = sdf.format(cdate.getDate());
            pst.setString(3, datee);
            String prs;
            prs = cpurpose.getSelectedItem().toString();
            pst.setString(4, prs);
            pst.setString(5, cdetails.getText());
              String mon;
         mon=cmbMonth.getSelectedItem().toString();
            pst.setString(6, mon);
              String yar;
      yar=cmbyear.getSelectedItem().toString();
            pst.setString(7, yar);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Added Successfully");
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       serialno.setText("");
        camount.setText("");
        cdate.setCalendar(null);
        cpurpose.setSelectedIndex(0);
        cdetails.setText("");
        cmbMonth.setSelectedIndex(0);
         cmbyear.setSelectedIndex(0);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          Connection con=null;
      Statement stm=null;
      ResultSet rs=null;

        try {
              String  da = new SimpleDateFormat("yyyy-MM-dd").format(cdate.getDate());
            Class.forName("com.mysql.jdbc.Driver");
           con = Connector.getConnection();
             stm = con.createStatement();
                rs = stm.executeQuery("select * from creditlist where CreditDate='"+da+"' ");
            DefaultTableModel model = (DefaultTableModel) creditTable.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                Object o[] = {rs.getString("Srl_no"),rs.getString("Amount"), rs.getString("CreditDate"), rs.getString("Purpose"), rs.getString("Details"),rs.getString("Month"),rs.getString("Year")};
                model.addRow(o);
            }

        } catch (Exception e) {
     
                 try {
            Class.forName("com.mysql.jdbc.Driver");
           con = Connector.getConnection();
             stm = con.createStatement();
                rs = stm.executeQuery("select * from creditlist  ");
            DefaultTableModel model = (DefaultTableModel) creditTable.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                Object o[] = {rs.getString("Srl_no"),rs.getString("Amount"), rs.getString("CreditDate"), rs.getString("Purpose"), rs.getString("Details"),rs.getString("Month"),rs.getString("Year")};
                model.addRow(o);
            }

        } catch (Exception f) {
            f.printStackTrace();
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
      Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = Connector.getConnection();
            int row =creditTable.getSelectedRow();
            String value = (creditTable.getModel().getValueAt(row, 0).toString());
            String query = "UPDATE  debitlist SET Amount=?, CreditDate=?, Purpose=?, Details=? , Month=?,Year=? where Srl_no=" + value;
            PreparedStatement pst = con.prepareStatement(query);
              pst.setString(1, camount.getText());
              
             SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
            String dater= sdf.format(cdate.getDate());
            pst.setString(2, dater);
            
            String purs;
           purs = cpurpose.getSelectedItem().toString();
            pst.setString(3,purs);
              pst.setString(4,cdetails.getText());
                   String mont;
           mont =cmbMonth.getSelectedItem().toString();
            pst.setString(5,  mont);
             String yars;
          yars =cmbyear.getSelectedItem().toString();
            pst.setString(6, yars);
             pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)creditTable.getModel();
            model.setRowCount(0);
            JOptionPane.showMessageDialog(null, "Updated Successfully");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void creditTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditTableMouseClicked
   int i = creditTable.getSelectedRow();
        TableModel model = creditTable.getModel();
         serialno.setText(model.getValueAt(i, 0).toString());
        camount.setText(model.getValueAt(i, 1).toString());
       try {
            int srow =creditTable.getSelectedRow();
            Date dat = new SimpleDateFormat("YYYY-MM-dd").parse((String) model.getValueAt(i, 2));
            cdate.setDate(dat);
        } catch (Exception e) {
            e.printStackTrace();
        }
      
        String pur = model.getValueAt(i, 3).toString();
        switch (pur) {
            case "  Student Payment ":
                cpurpose.setSelectedIndex(0);
                break;
            case "Profit ":
                cpurpose.setSelectedIndex(1);
                break;
            case " Books Payment ":
                cpurpose.setSelectedIndex(2);
                break;
            case " Boss Collection ":
                cpurpose.setSelectedIndex(3);
                break;
          
        }

        cdetails.setText(model.getValueAt(i, 4).toString());
        
        
    
        
        

    }//GEN-LAST:event_creditTableMouseClicked

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed

     
        if (cmbyear.getSelectedIndex() > 0 && cmbMonth.getSelectedIndex() > 0) {
       getMon();
            Connection con;
        Statement stm;
        ResultSet rs;
        
        try {
            
           
            con = Connector.getConnection();
            stm=con.createStatement();
  rs = stm.executeQuery("select * from creditlist where CreditDate like '"+mon+"%' ");
    DefaultTableModel model = (DefaultTableModel) creditTable.getModel();
            model.setRowCount(0);
            
        
            while (rs.next()) {
                
               Object p[] = {rs.getString("Srl_no"),rs.getString("Amount"), rs.getString("CreditDate"), rs.getString("Purpose"), rs.getString("Details"),rs.getString("Month"),rs.getString("Year")};
               model.addRow(p);
                
                
            }
            
            
            
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }                                        
      
    }//GEN-LAST:event_monthActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
       
        
                if (cmbyear.getSelectedIndex() > 0) {
       getYear();
            Connection con;
        Statement stm;
        ResultSet rs;
        
        try {
            
           
            con = Connector.getConnection();
            stm=con.createStatement();
  rs = stm.executeQuery("select * from creditlist where CreditDate like '"+mon+"%' ");
    DefaultTableModel model = (DefaultTableModel) creditTable.getModel();
            model.setRowCount(0);
            
        
            while (rs.next()) {
                
               Object p[] = {rs.getString("Srl_no"),rs.getString("Amount"), rs.getString("CreditDate"), rs.getString("Purpose"), rs.getString("Details"),rs.getString("Month"),rs.getString("Year")};
               model.addRow(p);
                
                
            }
            
            
            
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    } 
    }//GEN-LAST:event_yearActionPerformed

  public void getMon(){
        int i=cmbMonth.getSelectedIndex();
        if(i<10){
        mon=cmbyear.getSelectedItem().toString()+"-"+"0"+Integer.toString(i);}
        else{ mon=cmbyear.getSelectedItem().toString()+"-"+Integer.toString(i);}
    }
  
   public void getYear(){
       
        mon=cmbyear.getSelectedItem().toString();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField camount;
    private com.toedter.calendar.JDateChooser cdate;
    private javax.swing.JTextArea cdetails;
    private javax.swing.JComboBox<String> cmbMonth;
    private javax.swing.JComboBox<String> cmbyear;
    private javax.swing.JComboBox<String> cpurpose;
    private javax.swing.JTable creditTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton month;
    private javax.swing.JTextField serialno;
    private javax.swing.JButton update;
    private javax.swing.JButton year;
    // End of variables declaration//GEN-END:variables
}
