
package com.aboud.gradleproject1;

//import com.aboud.firebase.model.User;
import static com.aboud.gradleproject1.Common.gentrtaUserId;
import static com.aboud.gradleproject1.Common.initFirebase;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.processing.Completion;
import org.apache.commons.logging.Log;

public class Menu extends javax.swing.JFrame {
private DatabaseReference mDatabase;

    public Menu() throws FileNotFoundException {
        initComponents();
        wtf.setVisible(false);
        initFirebase();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tes = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        wtf = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tes1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        deat = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(tes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, -1));

        jButton1.setText("SEND VALUE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        wtf.setText("i dont what this lapel do");
        getContentPane().add(wtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 150, -1));

        jButton2.setText("get info");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel1.setText("user");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel2.setText("email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        tes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes1ActionPerformed(evt);
            }
        });
        getContentPane().add(tes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 70, -1));

        deat.setColumns(20);
        deat.setRows(5);
        jScrollPane1.setViewportView(deat);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 220, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      //  setfri(tes.getText());
      try{
          ResgertMember(tes.getText(),tes1.getText());
           wtf.setVisible(true);
            wtf.setText("place wait...");
      }
      catch (Exception ex)
      {
           wtf.setVisible(true);
            wtf.setText(ex.getMessage());
      }
      
     
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
     //   getfri();
       // deat.setText(null);
     try{
      
      wtf.setVisible(true);
      wtf.setText("wait");
     getTheMember();
     }
     catch(Exception ex )
     {
         wtf.setVisible(true);
         wtf.setText(ex.getMessage());
         
     }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tes1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Menu().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea deat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tes;
    private javax.swing.JTextField tes1;
    private javax.swing.JLabel wtf;
    // End of variables declaration//GEN-END:variables
private void ResgertMember(String name , String email)
{
    deat.setText(null);
    mDatabase=FirebaseDatabase.getInstance().getReference().child("User");
    User user = new User();
user.setUsername(name);
user.setEmail(email);
   mDatabase.child(gentrtaUserId()).setValue(user,new DatabaseReference.CompletionListener() {
        @Override
        public void onComplete(DatabaseError de, DatabaseReference dr) {
            wtf.setText("done");
        }
    });
 /*  mDatabase.setValue(user,new DatabaseReference.CompletionListener() {
        @Override
        public void onComplete(DatabaseError de, DatabaseReference dr) {
            wtf.setText("done");
        }
    });*/
}

private void getTheMember()
{
    deat.setText(null);
     mDatabase=FirebaseDatabase.getInstance().getReference().child("User").child("2dd72a48-0a6a-413e-80a2-d490c8536183");
mDatabase.addValueEventListener(new ValueEventListener() {
 
    @Override
    public void onDataChange(DataSnapshot dataSnapshot) {
        // Get Post object and use the values to update the UI
     
     /*for(DataSnapshot da : dataSnapshot.getChildren() )
     {
         User user =da.getValue(User.class);
         deat.append(user.getUsername()+" \n ");
     }*/
     User user= dataSnapshot.getValue(User.class);
     deat.append(user.getUsername()+" \n ");
     wtf.setText("done");
    //   System.out.println(dataSnapshot.getValue().toString());
        // ..
    }

    @Override
    public void onCancelled(DatabaseError databaseError) {
        // Getting Post failed, log a message
      //  Log.w(TAG, "loadPost:onCancelled", databaseError.toException());
      wtf.setVisible(true);
      wtf.setText(databaseError.getMessage());
    }
});
//mPostReference.addValueEventListener(postListener);
}
}



