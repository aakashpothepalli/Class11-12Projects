/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
import java.sql.*;

import javax.swing.*;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author home
 */
public class main_2 extends javax.swing.JFrame {
int i=1;
String a;
    /**
     * Creates new form main_2
     */
    public main_2() {
        initComponents();
       a1();
       t1.setVisible(false);
       b2.setVisible(false);
       s1.setVisible(false);
       lb1.setVisible(false);
       cb1.setVisible(false);
       b4.setVisible(false);
    }
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        b2 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        s1 = new javax.swing.JSlider();
        lb1 = new java.awt.Label();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        cb1 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        b1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "name", "roll no", "age", "grade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb1);
        if (tb1.getColumnModel().getColumnCount() > 0) {
            tb1.getColumnModel().getColumn(0).setPreferredWidth(100);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 120));

        b2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        b2.setText("HINT");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 90, 20));

        t1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        t1.setText("enter pass");
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 120, 40));

        s1.setMajorTickSpacing(10);
        s1.setPaintLabels(true);
        s1.setPaintTicks(true);
        s1.setValue(0);
        s1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                s1StateChanged(evt);
            }
        });
        getContentPane().add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        lb1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        lb1.setText("0");
        getContentPane().add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        b3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        b3.setText("SUBMIT");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 120, 50));

        b4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        b4.setText("GET NEXT HINT");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 150, 30));

        cb1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NAME" }));
        cb1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb1ItemStateChanged(evt);
            }
        });
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 90, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, -1, -1));

        b1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        b1.setText("RETRIEVE");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
JOptionPane.showMessageDialog(this, "Number of Desks bought by kivell ");
    }//GEN-LAST:event_b2ActionPerformed

    private void s1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_s1StateChanged
lb1.setText(""+s1.getValue());   
int e5 = s1.getValue();
if (e5==5)
{
    JOptionPane.showMessageDialog(this,"the first letter of password is 'A'");
    b4.setVisible(true);
} 
   
    
// TODO add your handling code here:
    }//GEN-LAST:event_s1StateChanged

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed

    }//GEN-LAST:event_b4ActionPerformed

    private void cb1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb1ItemStateChanged
       a = (String)cb1.getSelectedItem();
        DefaultTableModel tb = (DefaultTableModel)tb1.getModel();
        tb.setRowCount(0);
try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aakash","root","");
        Statement stmt = con.createStatement();        
 
        ResultSet rs = stmt.executeQuery("select * from book1 where Rep = '"+a+"'");
        while(rs.next())
        {
 
        String name = rs.getString("Rep");
        String rollno = rs.getString("Item");        
        String age = rs.getString("Units");
        String grade1 = rs.getString("Total");
        tb.addRow(new Object[]{name,rollno ,age,grade1});
        
        }
         tb1.setModel(tb);
         
        }
    catch(ClassNotFoundException | SQLException e)
    {
       JOptionPane.showMessageDialog(this,e);             
   
        
    }        
    }//GEN-LAST:event_cb1ItemStateChanged

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        i++;
        b1txt();
        lvls();
        tbselection();// TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed
 public void a3() //same as a2 using to get distinct name
{
    
try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aakash","root","");
        Statement stmt = con.createStatement();        
 
        ResultSet rs = stmt.executeQuery("select distinct Rep from book1");
        
        while(rs.next())
        {
 
        String name = rs.getString("Rep");
        
        cb1.addItem(name);
        
        }
        
        }
    catch(ClassNotFoundException | SQLException e)
    {
       JOptionPane.showMessageDialog(this,e);             
   
        
    }        

}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------\
    public void lvls()
    {   
       switch(i)
   {
       
       case 2 : t1.setVisible(true); //when user clicks the button 2nd time
                b2.setVisible(true);
                s1.setVisible(true);
                lb1.setVisible(true);
                cb1.setVisible(true);
                b1.setVisible(false);
                a3();
       break;
          }
    
        
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public void tbselection() //selects the table based on no of clicks
    {
        switch(i)
   {
       case 1 : a1();
       break;
       case 2 : a2();
                 tb1.getColumnModel().getColumn(0).setHeaderValue("Name");//setting the new table column names
                 tb1.getColumnModel().getColumn(1).setHeaderValue("Item");
                 tb1.getColumnModel().getColumn(2).setHeaderValue("Units");
                 tb1.getColumnModel().getColumn(3).setHeaderValue("Total");
                 tb1.getTableHeader().repaint();
       break;
          }
    
    }
    
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    public void b1txt(){ // setting the button text on each click
   switch(i)
   {
       case 1 :
       case 2 : b1.setText("GET PASS");
       JOptionPane.showMessageDialog(this, "AS YOU KNOW YOUR DATA BASE HAS BEEN HACKED! \n YOU NEED TO GET A PASSWORD TO ACCESS YOUR DATABASE \n DECODE THE CLUES TO GET THE PASS");
       break;
       case 3 : b1.setText("SOLVE");
       
   }
        
    }
    
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public void a1()
{

        DefaultTableModel tb = (DefaultTableModel)tb1.getModel();
        tb.setRowCount(0);
        
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aakash","root","");
        Statement stmt = con.createStatement();        
 
        ResultSet rs = stmt.executeQuery("select * from a1");
        
        while(rs.next())
        {
        String name = rs.getString("name");
        String rollno = rs.getString("rollno");        
        String age = rs.getString("age");
        String grade = rs.getString("grade");
        tb.addRow(new Object[]{name,rollno,age,grade });
        }
            }
   
        catch(ClassNotFoundException | SQLException e)
    {
       JOptionPane.showMessageDialog(this,e);             
    }


}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public void a2()
{
    DefaultTableModel tb = (DefaultTableModel)tb1.getModel();
        tb.setRowCount(0);
try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aakash","root","");
        Statement stmt = con.createStatement();        
        
        
        ResultSet rs = stmt.executeQuery("select * from book1");
        
        while(rs.next())
        {
 
        String name = rs.getString("Rep");
        String rollno = rs.getString("Item");        
        String age = rs.getString("Units");
        String grade1 = rs.getString("Total");
        tb.addRow(new Object[]{name,rollno ,age,grade1});
        
        }
         tb1.setModel(tb);
        }
    catch(ClassNotFoundException | SQLException e)
    {
       JOptionPane.showMessageDialog(this,e);             
   
        
    }        

}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------      
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
            java.util.logging.Logger.getLogger(main_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Label lb1;
    private javax.swing.JSlider s1;
    private javax.swing.JTextField t1;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables
}
