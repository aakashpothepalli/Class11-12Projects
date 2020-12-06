//
package apps;

import apps.Contacts;
import java.sql.*;
import javax.swing.*;
import xpertos.Home;
import static apps.Contacts.SelectedName;
import static apps.Contacts.SelectedPhNo;


public class ContactDetails extends javax.swing.JFrame {

    String EditedName="",EditedPhNo="",EditedEmail="";

    public ContactDetails() {
        initComponents();
        /////
        t1.setText(apps.Contacts.SelectedName);
        t2.setText(apps.Contacts.SelectedPhNo);
        t3.setText(apps.Contacts.SelectedEmail);
        /////
        this.setLocationRelativeTo(null);
         save.setVisible(false);
          
    }
       

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menubar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        t1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menubar.setBackground(new java.awt.Color(53, 144, 249));
        menubar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        menubar.setForeground(new java.awt.Color(255, 255, 255));
        menubar.setText("  Contacts");
        menubar.setFocusable(false);
        menubar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menubarActionPerformed(evt);
            }
        });
        getContentPane().add(menubar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xpertos/images/dp.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));
        jLabel2.getAccessibleContext().setAccessibleDescription("");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("NAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 283, 584, 10));

        t1.setEditable(false);
        t1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                t1MousePressed(evt);
            }
        });
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 480, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xpertos/images/left-angle-bracket (1).png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, 60, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("PH NO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        t2.setEditable(false);
        t2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        t2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                t2MousePressed(evt);
            }
        });
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t2KeyPressed(evt);
            }
        });
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 358, 480, 40));

        save.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        save.setText("save");
        save.setFocusCycleRoot(true);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xpertos/images/home.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, -1, -1));

        t3.setEditable(false);
        t3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        t3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                t3MousePressed(evt);
            }
        });
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t3KeyPressed(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 480, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("EMAIL");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        delete.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        delete.setText("delete");
        delete.setFocusCycleRoot(true);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menubarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubarActionPerformed
    }//GEN-LAST:event_menubarActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
    }//GEN-LAST:event_t1ActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
     new Contacts().setVisible(true);
     dispose();
    }//GEN-LAST:event_jLabel1MousePressed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed


    }//GEN-LAST:event_t2ActionPerformed

    private void t2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t2MousePressed
    t2.setEditable(true);
    save.setVisible(true);
    }//GEN-LAST:event_t2MousePressed
     
    public void saveC()
    {
            EditedName = t1.getText();
            EditedPhNo = t2.getText();   
           EditedEmail = t3.getText();

           String UpdateCmd = "update contacts set name ='"+EditedName +"' , phno ='"+EditedPhNo +"' ,email ='"+EditedEmail +"' where name ='"+SelectedName+"';";
         try{
            Class.forName("java.sql.Driver");
            Connection con1  = DriverManager.getConnection("jdbc:mysql://localhost:3306/xpertos", "root","");
            Statement s1 = con1.createStatement();
           
            s1.executeUpdate(UpdateCmd);
         }
        catch(Exception e)
        { JOptionPane.showMessageDialog(this, e);
        }
    }
    
    private void t2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyPressed
    }//GEN-LAST:event_t2KeyPressed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
    saveC();
    JOptionPane.showMessageDialog(this,"Your edits have been saved :)" );
    }//GEN-LAST:event_saveActionPerformed

    private void t1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MousePressed
    t1.setEditable(true);
    save.setVisible(true);      
    }//GEN-LAST:event_t1MousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
    new Home().setVisible(true);
    dispose();      
    }//GEN-LAST:event_jLabel5MousePressed

    private void t3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t3MousePressed
    t3.setEditable(true);
    save.setVisible(true);
    }//GEN-LAST:event_t3MousePressed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3KeyPressed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try{
            Class.forName("java.sql.Driver");
            Connection con1  = DriverManager.getConnection("jdbc:mysql://localhost:3306/xpertos", "root","");
            Statement s1 = con1.createStatement();
           EditedName= apps.Contacts.SelectedName;
            s1.executeUpdate("delete from contacts where name = '"+EditedName+"';");
         }
        catch(Exception e)
        { JOptionPane.showMessageDialog(this, e);
        }
        JOptionPane.showMessageDialog(this, "contact has been deleted");
        new Contacts().setVisible(true);
            dispose();
    }//GEN-LAST:event_deleteActionPerformed

   
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(ContactDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ContactDetails().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField menubar;
    private javax.swing.JButton save;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    // End of variables declaration//GEN-END:variables
}
