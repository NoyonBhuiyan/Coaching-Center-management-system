
package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Homepage extends javax.swing.JFrame {

    //Color panedefault;
    //Color paneClick;

    public Homepage() {
        initComponents();
         Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

       // panedefault = new Color(0, 255, 255);
       // paneClick = new Color(124, 25, 83);
       // click1.setBackground(panedefault);
       /* click2.setBackground(panedefault);
        click3.setBackground(panedefault);
        click4.setBackground(panedefault);
        click5.setBackground(panedefault);
        click6.setBackground(panedefault);
        click7.setBackground(panedefault);*/

        Internal itn = new Internal();
        jDesktopPane1.add(itn).setVisible(true);

        Admission ad = new Admission();
        jDesktopPane1.add(ad).setVisible(true);
    }

    int x, y;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelbar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sidepane = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        click1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        click10 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        click2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        click11 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        click4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        click15 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        click3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        click12 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        click5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        click14 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        click6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        click9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        click7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        click8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        panelbar.setBackground(new java.awt.Color(0, 120, 215));
        panelbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelbarMouseDragged(evt);
            }
        });
        panelbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelbarMousePressed(evt);
            }
        });
        panelbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icons8-close-window-48.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        panelbar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1258, 0, 50, 40));

        sidepane.setBackground(new java.awt.Color(0, 29, 83));
        sidepane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 2, true));
        sidepane.setPreferredSize(new java.awt.Dimension(326, 700));

        jPanel1.setBackground(new java.awt.Color(51, 143, 180));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        click1.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout click1Layout = new javax.swing.GroupLayout(click1);
        click1.setLayout(click1Layout);
        click1Layout.setHorizontalGroup(
            click1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        click1Layout.setVerticalGroup(
            click1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(click1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 20, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icons8-home-48.png"))); // NOI18N
        jLabel2.setText("    Home");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 120, 38));

        click10.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout click10Layout = new javax.swing.GroupLayout(click10);
        click10.setLayout(click10Layout);
        click10Layout.setHorizontalGroup(
            click10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        click10Layout.setVerticalGroup(
            click10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(click10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 50));

        jPanel3.setBackground(new java.awt.Color(51, 143, 180));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        click2.setBackground(new java.awt.Color(0, 255, 255));
        click2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                click2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout click2Layout = new javax.swing.GroupLayout(click2);
        click2.setLayout(click2Layout);
        click2Layout.setHorizontalGroup(
            click2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        click2Layout.setVerticalGroup(
            click2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.add(click2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 50));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icons8-admission-60.png"))); // NOI18N
        jLabel3.setText("Admission ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, 50));

        click11.setBackground(new java.awt.Color(0, 255, 255));
        click11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                click11MousePressed(evt);
            }
        });

        javax.swing.GroupLayout click11Layout = new javax.swing.GroupLayout(click11);
        click11.setLayout(click11Layout);
        click11Layout.setHorizontalGroup(
            click11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        click11Layout.setVerticalGroup(
            click11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.add(click11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 30, 50));

        jPanel4.setBackground(new java.awt.Color(51, 143, 180));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        click4.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout click4Layout = new javax.swing.GroupLayout(click4);
        click4.setLayout(click4Layout);
        click4Layout.setHorizontalGroup(
            click4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        click4Layout.setVerticalGroup(
            click4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel4.add(click4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icons8-teacher-50.png"))); // NOI18N
        jLabel4.setText("  Teacher Panel");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 186, 40));

        click15.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout click15Layout = new javax.swing.GroupLayout(click15);
        click15.setLayout(click15Layout);
        click15Layout.setHorizontalGroup(
            click15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        click15Layout.setVerticalGroup(
            click15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.add(click15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 30, 50));

        jPanel5.setBackground(new java.awt.Color(51, 143, 180));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        click3.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout click3Layout = new javax.swing.GroupLayout(click3);
        click3.setLayout(click3Layout);
        click3Layout.setHorizontalGroup(
            click3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        click3Layout.setVerticalGroup(
            click3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.add(click3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 50));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icons8-cash-in-hand-60.png"))); // NOI18N
        jLabel5.setText(" Payment");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 189, 50));

        click12.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout click12Layout = new javax.swing.GroupLayout(click12);
        click12.setLayout(click12Layout);
        click12Layout.setHorizontalGroup(
            click12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        click12Layout.setVerticalGroup(
            click12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.add(click12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 30, 50));

        jPanel6.setBackground(new java.awt.Color(51, 143, 180));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });

        click5.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout click5Layout = new javax.swing.GroupLayout(click5);
        click5.setLayout(click5Layout);
        click5Layout.setHorizontalGroup(
            click5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        click5Layout.setVerticalGroup(
            click5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 51));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icons8-report-card-52.png"))); // NOI18N
        jLabel6.setText(" Results");

        click14.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout click14Layout = new javax.swing.GroupLayout(click14);
        click14.setLayout(click14Layout);
        click14Layout.setHorizontalGroup(
            click14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        click14Layout.setVerticalGroup(
            click14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(click5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(click14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(click5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(click14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(51, 143, 180));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel7MousePressed(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        click6.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout click6Layout = new javax.swing.GroupLayout(click6);
        click6.setLayout(click6Layout);
        click6Layout.setHorizontalGroup(
            click6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        click6Layout.setVerticalGroup(
            click6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel7.add(click6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icons8-debit-card-64.png"))); // NOI18N
        jLabel7.setText(" Debit Account");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 196, 44));

        click9.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout click9Layout = new javax.swing.GroupLayout(click9);
        click9.setLayout(click9Layout);
        click9Layout.setHorizontalGroup(
            click9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        click9Layout.setVerticalGroup(
            click9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel7.add(click9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 30, 50));

        jPanel8.setBackground(new java.awt.Color(51, 143, 180));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel8MousePressed(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        click7.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout click7Layout = new javax.swing.GroupLayout(click7);
        click7.setLayout(click7Layout);
        click7Layout.setHorizontalGroup(
            click7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        click7Layout.setVerticalGroup(
            click7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel8.add(click7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 50));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icons8-edit-account-50.png"))); // NOI18N
        jLabel8.setText("Credit Account");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 180, -1));

        click8.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout click8Layout = new javax.swing.GroupLayout(click8);
        click8.setLayout(click8Layout);
        click8Layout.setHorizontalGroup(
            click8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        click8Layout.setVerticalGroup(
            click8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel8.add(click8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 30, 50));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/icons8-front-desk-96.png"))); // NOI18N

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidepaneLayout = new javax.swing.GroupLayout(sidepane);
        sidepane.setLayout(sidepaneLayout);
        sidepaneLayout.setHorizontalGroup(
            sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepaneLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(sidepaneLayout.createSequentialGroup()
                .addGroup(sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidepaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(122, 122, 122))
        );
        sidepaneLayout.setVerticalGroup(
            sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
        );

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(970, 770));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelbar, javax.swing.GroupLayout.PREFERRED_SIZE, 1305, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sidepane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 973, Short.MAX_VALUE)))
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelbar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sidepane, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        //click2.setBackground(panedefault);
        //click1.setBackground(paneClick);
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
       // click1.setBackground(paneClick);
       // click2.setBackground(panedefault);
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        jDesktopPane1.removeAll();
        Internal itn = new Internal();
        jDesktopPane1.add(itn).setVisible(true);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        jDesktopPane1.removeAll();
        Admission ad = new Admission();
        jDesktopPane1.add(ad).setVisible(true);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        jDesktopPane1.removeAll();
        Teachers tcr = new Teachers();
        jDesktopPane1.add(tcr).setVisible(true);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        //click3.setBackground(panedefault);
        //click2.setBackground(paneClick);
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        jDesktopPane1.removeAll();
        Payment pm = new Payment();
        jDesktopPane1.add(pm).setVisible(true);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        //click2.setBackground(paneClick);
       // click3.setBackground(panedefault);
    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        jDesktopPane1.removeAll();
        Results rst = new Results();
        jDesktopPane1.add(rst).setVisible(true);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MousePressed

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        jDesktopPane1.removeAll();
        Debit db = new Debit();
        jDesktopPane1.add(db).setVisible(true);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel7MousePressed

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        jDesktopPane1.removeAll();
        Credit cr = new Credit();
        jDesktopPane1.add(cr).setVisible(true);
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel8MousePressed

    private void click2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_click2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_click2MousePressed

    private void click11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_click11MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_click11MousePressed

    private void panelbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelbarMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_panelbarMousePressed

    private void panelbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelbarMouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx - x, yy - y);
    }//GEN-LAST:event_panelbarMouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
      System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          int h=jDesktopPane1.getHeight();
        JOptionPane.showMessageDialog(rootPane, h);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel click1;
    private javax.swing.JPanel click10;
    private javax.swing.JPanel click11;
    private javax.swing.JPanel click12;
    private javax.swing.JPanel click14;
    private javax.swing.JPanel click15;
    private javax.swing.JPanel click2;
    private javax.swing.JPanel click3;
    private javax.swing.JPanel click4;
    private javax.swing.JPanel click5;
    private javax.swing.JPanel click6;
    private javax.swing.JPanel click7;
    private javax.swing.JPanel click8;
    private javax.swing.JPanel click9;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel panelbar;
    private javax.swing.JPanel sidepane;
    // End of variables declaration//GEN-END:variables
}
