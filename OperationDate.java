/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aboud.gradleproject1;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Aboud Mahmoud
 */
public class OperationDate extends javax.swing.JPanel {

    /**
     * Creates new form OperationDate
     */
 private String[] Header = {"����� ������� ", " ��� ������� "};
  private String[][] dater;
    public OperationDate() {
        initComponents();
        getOperationDate();
    }
    private  ArrayList<dateValue>   ar;
    void getOperationDate()
    {
        ar=LiteConection.get_The_date();
        dater = new String[ar.size()][2];
        for(int i=0; i<ar.size() ; i++)
        {
            dater[i][0]=ar.get(i).getStardate();
              dater[i][1]=ar.get(i).getTypeOfProcc();
        }
          jTable1=new JTable(dater,Header);
       
          //jScrollPane1.setLayout(null);
           
             ((DefaultTableCellRenderer)jTable1.getTableHeader().getDefaultRenderer())
             .setHorizontalAlignment((int)JLabel.CENTER_ALIGNMENT);
     DefaultTableCellRenderer v = new DefaultTableCellRenderer();
     v.setHorizontalAlignment(JLabel.CENTER);
     jTable1.getColumnModel().getColumn(0).setCellRenderer(v);
     for( int i=0 ; i<jTable1.getColumnCount();i++)
     {
         jTable1.getColumnModel().getColumn(i).setCellRenderer(v);
     }
      jScrollPane1.setViewportView(jTable1);
        
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
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
