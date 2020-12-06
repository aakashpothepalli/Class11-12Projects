/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * jdbc.java
 *
 * Created on Mar 7, 2018, 11:53:37 AM
 */
package aakash12B;

import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/**
 *
 * @author student
 */
public class jdbc extends javax.swing.JFrame {

    String column, a1, a2;
    int a, b;

    /**
     * Creates new form jdbc
     */
    public jdbc() {
        initComponents();
       
 try{
  
        
          Class.forName("java.sql.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xpertos","root","");
          Statement s = con.createStatement();
          
          ResultSet r = s.executeQuery("select name from contacts where sno=0;");
          while(r.next())
          {
          t1.setText(r.getString("name"));
           
          }
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
        }    
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
        tb1 = new javax.swing.JTable();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lb1 = new javax.swing.JList<>();
        t1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "sno", "Name", "Roll No", "Situation"
            }
        ));
        tb1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tb1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tb1KeyTyped(evt);
            }
        });
        tb1.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                tb1VetoableChange(evt);
            }
        });
        jScrollPane1.setViewportView(tb1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 410, 150));

        b2.setText("UPDATE");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 120, 90));

        b1.setText("RETRIEVE");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 120, 90));

        lb1.setModel(new DefaultListModel<String>
            ());
        lb1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lb1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lb1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 120, 180));

        t1.setText("jTextField1");
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jButton1.setText("next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 120, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        DefaultTableModel tb = (DefaultTableModel) tb1.getModel();
        DefaultListModel lb = (DefaultListModel) lb1.getModel();
        tb.setRowCount(0);
        String sdfkgj = "select * from contacts";
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xpertos", "root", "");
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery(sdfkgj);
            while (r.next()) {
                String name = r.getString("NAME");
                String phno = r.getString("PHNO");
                String email = r.getString("EMAIL");
                String sno = r.getString("sno");
                lb.addElement(name);
                tb.addRow(new Object[]{sno,name, phno, email});
                lb1.setModel(lb);
                tb1.setModel(tb);
            }
            updatetb();
            r.close();
            s.close();
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_b1ActionPerformed

    private void tb1VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_tb1VetoableChange
DefaultTableModel tb = (DefaultTableModel)tb1.getModel();

    }//GEN-LAST:event_tb1VetoableChange
    private void updatetb() {
        a = tb1.getSelectedRow();
        b = tb1.getSelectedColumn();

        DefaultTableModel tb = (DefaultTableModel) tb1.getModel();
        a1 = (String) tb.getValueAt(a, b);
        a2 = (String) tb.getValueAt(a, 1);
        if (b == 0) {
            column = "sno";}
        else if (b == 1) {
            column = "NAME";
        } else if (b == 2) {
            column = "phno";
        } else if (b == 3) {
            column = "email";
        }
        String sql = "Update contacts set " + column + " = '" + a1 + "' where name = '" + a2 + "';";

        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xpertos", "root", "");
            Statement s = con.createStatement();
            s.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }

    }
    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        updatetb();
    }//GEN-LAST:event_b2ActionPerformed

    private void tb1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb1KeyPressed

        updatetb();
    }//GEN-LAST:event_tb1KeyPressed

    private void tb1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb1KeyTyped

        updatetb();
    }//GEN-LAST:event_tb1KeyTyped

    private void lb1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lb1ValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_lb1ValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 int n=0;
        
        try{
  
        
          Class.forName("java.sql.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xpertos","root","");
          Statement s = con.createStatement();
          
          ResultSet r = s.executeQuery("select name from contacts where sno=0;");
          while(r.next())
          {
          n= r.getInt("sno");
           
          }
          ResultSet r1 = s.executeQuery("select name from contacts where sno="+(n+1)+";");
          while(r.next())
          {
          t1.setText(r.getString("name"));
           
          }
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
        }       
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jdbc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lb1;
    private javax.swing.JTextField t1;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables

}
