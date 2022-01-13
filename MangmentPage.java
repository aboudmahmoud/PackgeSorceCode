/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aboud.gradleproject1;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aboud Mahmoud
 */
public class MangmentPage extends javax.swing.JFrame {

    int indexhere1 = 0, indexhere2 = 0, indexhere3 = 0, indexhere4 = 0, indexhere5 = 0, indexhere6 = 0, indexhere7 = 0, cor1 = 0, cor2 = 0, cor3 = 0, cor4 = 0, cor5 = 0, cor6 = 0, cor7 = 0;
    /**
     * Creates new form MangmentPage
     */
    private int cntot = 0;
    static DefaultTableModel model2 = new DefaultTableModel();
    URL rl;

    public MangmentPage() throws MalformedURLException {
        initComponents();
        this.setTitle("«œ—«… «·ÿ—Êœ");
        setimageforbuttons();
    }

    void setimageforbuttons() throws MalformedURLException {
        rl = new URL("https://firebasestorage.googleapis.com/v0/b/projectmangment-666fb.appspot.com/o/package2.png?alt=media&token=6e6c700d-823c-40f9-8d04-e988389b2c1e");
        Image iconr = Toolkit.getDefaultToolkit().getImage(rl);
        ImageIcon myimage = new ImageIcon(iconr);
        jButton12.setIcon(myimage);
        rl = new URL("https://firebasestorage.googleapis.com/v0/b/projectmangment-666fb.appspot.com/o/loupe.png?alt=media&token=8f327ceb-630a-4c7f-9951-23cb083f0e24");
        iconr = Toolkit.getDefaultToolkit().getImage(rl);
        myimage = new ImageIcon(iconr);
        jButton1.setIcon(myimage);
        rl = new URL("https://firebasestorage.googleapis.com/v0/b/projectmangment-666fb.appspot.com/o/packaging.png?alt=media&token=0b26c4bd-7b8d-40bb-a1ca-35897124b710");
        iconr = Toolkit.getDefaultToolkit().getImage(rl);
        myimage = new ImageIcon(iconr);
        jButton2.setIcon(myimage);
        rl = new URL("https://firebasestorage.googleapis.com/v0/b/projectmangment-666fb.appspot.com/o/invoice1.png?alt=media&token=793981a8-1585-4f2f-bb6e-483c80af5678");
        iconr = Toolkit.getDefaultToolkit().getImage(rl);
        myimage = new ImageIcon(iconr);
        jButton7.setIcon(myimage);
        myimage = setIMAgeFor("https://firebasestorage.googleapis.com/v0/b/projectmangment-666fb.appspot.com/o/package4.png?alt=media&token=b5852643-f843-41e3-91e9-fd3fcba03d05");
        jButton3.setIcon(myimage);
        myimage = setIMAgeFor("https://firebasestorage.googleapis.com/v0/b/projectmangment-666fb.appspot.com/o/scroll.png?alt=media&token=655d3612-30fe-4a24-a89f-f60885af8cbb");
        jButton5.setIcon(myimage);
        myimage = setIMAgeFor("https://firebasestorage.googleapis.com/v0/b/projectmangment-666fb.appspot.com/o/investment.png?alt=media&token=19fbe2d8-c0cb-4f3e-935d-1fbdb4b51569");
        jButton6.setIcon(myimage);
        myimage = setIMAgeFor("https://firebasestorage.googleapis.com/v0/b/projectmangment-666fb.appspot.com/o/una.png?alt=media&token=ef18f9d6-643e-43e8-bdb4-c8537dd4a4de");
        jButton4.setIcon(myimage);
        myimage = setIMAgeFor("https://firebasestorage.googleapis.com/v0/b/projectmangment-666fb.appspot.com/o/todolist.png?alt=media&token=8b6edb0d-53ea-454c-99ed-f12a87accaf7");
        jButton10.setIcon(myimage);
        myimage = setIMAgeFor("https://firebasestorage.googleapis.com/v0/b/projectmangment-666fb.appspot.com/o/minus.png?alt=media&token=a036da82-6766-4ce1-b8d6-47bc58e22c61");
        jButton8.setIcon(myimage);
        URL url = new URL("https://firebasestorage.googleapis.com/v0/b/projectmangment-666fb.appspot.com/o/businessman.png?alt=media&token=00373775-bfaf-4b35-b957-16ef8c6288ac");
        iconr = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconr);
        myimage = setIMAgeFor("https://firebasestorage.googleapis.com/v0/b/projectmangment-666fb.appspot.com/o/agent.png?alt=media&token=48d48254-067e-449a-8fe9-140d0b72ae10");
        jButton9.setIcon(myimage);
        myimage = setIMAgeFor("https://firebasestorage.googleapis.com/v0/b/projectmangment-666fb.appspot.com/o/kyc.png?alt=media&token=6d5d601c-836e-494d-8e96-0994ed0e9750");
        jButton11.setIcon(myimage);

    }

    private ImageIcon setIMAgeFor(String path) throws MalformedURLException {
        URL urt = new URL(path);
        Image iconr = Toolkit.getDefaultToolkit().getImage(urt);
        ImageIcon myimage = new ImageIcon(iconr);
        return myimage;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(231, 111, 81));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("«·»ÕÀ ⁄‰ «·ÿ—œ");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(38, 70, 83)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("«÷«›… ÿ—œ ");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(38, 70, 83)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setText("«ŸÂ«— «·ÿ—Êœ");
        jButton12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(38, 70, 83)));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("«·ÿ—Êœ ﬁÌœ «· Ê’Ì·");
        jButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setText("ÿ»«⁄… ›« Ê—…");
        jButton7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(38, 70, 83)));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton12, jButton2, jButton7});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton12, jButton2, jButton3, jButton7});

        jPanel2.setBackground(new java.awt.Color(244, 162, 97));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setText(" Ê«—ÌŒ «·⁄„·Ì« ");
        jButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(38, 70, 83)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("«Ã„«·Ì «·«—»«Õ");
        jButton6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(38, 70, 83)));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setText("«·„Â„«   ");
        jButton10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(38, 70, 83), 1, true));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("«÷«›… «œ„‰");
        jButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(38, 70, 83)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setText("«“«·… «·‰Ê«›–");
        jButton8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(38, 70, 83)));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setText("«÷«›… ⁄„Ì·");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setText("”Ã· «·“»«∆‰");
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton10, jButton11, jButton4, jButton5, jButton6, jButton8, jButton9});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton11)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton10, jButton11, jButton4, jButton5, jButton6, jButton8, jButton9});

        jPanel5.setBackground(new java.awt.Color(42, 157, 143));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("√œ«—… «·„‘—Ê⁄ ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jLabel1)
                .addContainerGap(295, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        magnentcontrol c;
        try {
            c = new magnentcontrol();
            c.setVisible(true);
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        addpro pro;
        try {
            pro = new addpro();
            pro.setVisible(true);
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "ﬁÌœ «·⁄„· Ê«· ’·ÌÕ");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        /* Menu mr = null;
        try {
            mr = new Menu();
            mr.setVisible(true);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }*/

        if (cor6 != 0) {
            jTabbedPane2.remove(indexhere6);

        } else {

            cor6++;

        }
        OperationDate operationdate = new OperationDate();
        jTabbedPane2.add(" Ê«—ÌŒ «·⁄„·Ì« ", operationdate);
        indexhere6 = jTabbedPane2.getComponentZOrder(operationdate);
        // jTabbedPane2.add(
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            // TODO add your handling code here:

            /*ViewOfdata dr = new ViewOfdata(3);
            dr.getTheDilverdDatr();*/
            if (cor5 != 0) {
                jTabbedPane2.remove(indexhere5);

            } else {

                cor5++;

            }
            Winreport rep = new Winreport();
            jTabbedPane2.add(" ﬁ«—Ì— «·«—»«Õ «·„›’·", rep);
            indexhere5 = jTabbedPane2.getComponentZOrder(rep);
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:

        if (cor1 != 0) {
            jTabbedPane2.remove(indexhere1);

        } else {

            cor1++;

        }
        ViewOfdata dr;
        try {
            dr = new ViewOfdata(1);
            jTabbedPane2.add(dr, "Ã„Ì⁄ «·ÿ—Êœ");
            indexhere1 = jTabbedPane2.getComponentZOrder(dr);
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }


    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:

            if (cor2 != 0) {
                jTabbedPane2.remove(indexhere2);

                /*   ViewOfdata dr= new ViewOfdata(2);
                jTabbedPane2.add( dr,"«·ÿ—Êœ ﬁÌœ «· Ê’Ì·");*/
            } else {

                cor2++;

            }

            ViewOfdata dr = new ViewOfdata(2);

            jTabbedPane2.add(dr, "«·ÿ—Êœ ﬁÌœ «· Ê’Ì·");
            indexhere2 = jTabbedPane2.getComponentZOrder(dr);
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        try {
            if (cor3 != 0) {
                jTabbedPane2.remove(indexhere3);
            } else {
                cor3++;
            }
            RequstesOrder r1 = new RequstesOrder();
            jTabbedPane2.add(r1, "«·„Â„« ");
            indexhere3 = jTabbedPane2.getComponentZOrder(r1);
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            // TODO add your handling code here:

            if (cor4 != 0) {
                jTabbedPane2.remove(indexhere4);
            } else {
                cor4++;
            }
            BillPrinter bil = new BillPrinter();
            jTabbedPane2.add(bil, "›Ê« Ì— «·⁄„·«¡");
            indexhere4 = jTabbedPane2.getComponentZOrder(bil);
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if (jTabbedPane2.getTabCount() == 0) {
            JOptionPane.showMessageDialog(null, "⁄›Ê« ·« ÊÃœ ‰Ê«›– „› ÊÕ", "  ‰»ÌÂ ", JOptionPane.CANCEL_OPTION);

        } else {
            jTabbedPane2.removeAll();
            cor1 = 0;
            cor2 = 0;
            cor3 = 0;
            cor4 = 0;
            cor5 = 0;
            cor5 = 0;
            cor6 = 0;
            cor7 = 0;
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        CoustmerPageInfo p = new CoustmerPageInfo();
        p.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try {
            // TODO add your handling code here:
            if (cor7 != 0) {
                jTabbedPane2.remove(indexhere7);
            } else {
                cor7++;
            }
            
            AgentMenu ag = new AgentMenu();
            jTabbedPane2.add(ag, "Ã„Ì⁄ «·⁄„·«¡");
            indexhere7 = jTabbedPane2.getComponentZOrder(ag);
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton11ActionPerformed
    private void GetRMidner() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<PackgeValue> arr = LiteConection.getPackgeInfo();
        Date date = new Date();
        //Date startDate = formatter.parse(arr.ge);
        for (int i = 0; i < arr.size(); i++) {
            Date TheDilverdDate = formatter.parse(arr.get(i).getPackgeDate());
            if (TheDilverdDate.getYear() == date.getYear()) {

            }
        }

    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    public static javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
