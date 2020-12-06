package apps;

import java.sql.*;
import javax.swing.*;
import xpertos.Home;

public class Contacts extends javax.swing.JFrame {

    static String SelectedName, SelectedPhNo, SelectedEmail;// variable for stroing the selected name by the user
    int b = 1;
    int[] alphabets = new int[26] ; //stores 0 or 1 which informs that if a word with same starting alphabet has occured 
   int k=0;// stores ascii value of selected name
    
//////////////////////////////////////////////////////////////////
    public Contacts() {
        initComponents();
        this.setLocationRelativeTo(null);
        menubar.setEditable(false);
        t1.setVisible(false);
        LoadContacts();
    }

////////////////////////////////////////////////////////////////
    private void LoadContacts() {
        DefaultListModel lb = (DefaultListModel) lb1.getModel();
          for (int i = 0; i <26 ; i++) {//inserting all initial values of array as 0
                        alphabets[i] = 0 ;
           }
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xpertos", "root", "");
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery("select * from contacts order by name");
            while (r.next()) {
                String name = r.getString("name");
                SelectedName = name;
                k = (int)SelectedName.charAt(0);
                Sorting();
             
                lb.addElement(SelectedName);
                }
                lb1.setModel(lb);

          for (int i = 0; i <26 ; i++) {//clearing all values for further use in search
                        alphabets[i] = 0 ;
           }
         
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
////////////////////////////////////////////////////////

    private void Sorting() {
        DefaultListModel lb = (DefaultListModel) lb1.getModel();
       
       if (alphabets[k-97]==0)
       {   lb.addElement(SelectedName.toUpperCase().subSequence(0, 1));
           alphabets[k-97]=1 ;
       }
      
}
////////////////////////////////////////////////////////

    public void search() {
        DefaultListModel lb = (DefaultListModel) lb1.getModel();
        lb.clear();
       
     
        String SearchName = t1.getText();
        
        
        String SearchCmd = "select * from contacts where name like '" + SearchName + "%' order by name;";
b=1;

        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xpertos", "root", "");
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery(SearchCmd);

            while (r.next()) {
                SelectedName = r.getString("name");
                k = (int)SelectedName.charAt(0);
               Sorting(); // groups the names by alphabets
                lb.addElement(SelectedName);
                lb1.setModel(lb);
                
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
         for (int i = 0; i <25 ; i++) {//clearing all values for further use in search
                        alphabets[i] = 0 ;
           }
         
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        menubar = new javax.swing.JTextField();
        canvas1 = new java.awt.Canvas();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lb1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 60, 50));

        t1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        t1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t1FocusGained(evt);
            }
        });
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t1KeyTyped(evt);
            }
        });
        t1.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                t1VetoableChange(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 420, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xpertos/images/search-3-32.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 40, 40));

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

        canvas1.setBackground(new java.awt.Color(53, 240, 240));
        canvas1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(canvas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xpertos/images/left-angle-bracket (1).png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, 40, 40));

        lb1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lb1.setModel(new DefaultListModel()
        );
        lb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb1MousePressed(evt);
            }
        });
        lb1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lb1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lb1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 550, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xpertos/images/home.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("© SAI AAKASH @APS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menubarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubarActionPerformed

    }//GEN-LAST:event_menubarActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel4MousePressed

    private void lb1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb1MousePressed
    }//GEN-LAST:event_lb1MousePressed

    private void lb1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lb1ValueChanged
        SelectedName = lb1.getSelectedValue();
            String sql = "select * from contacts where name ='" + SelectedName + "';";
            try {
                Class.forName("java.sql.Driver");
                Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/xpertos", "root", "");
                Statement s1 = con1.createStatement();
                ResultSet r1 = s1.executeQuery(sql);
                while (r1.next()) {
                    SelectedPhNo = r1.getString("phno");
                    SelectedEmail = r1.getString("email");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
            new ContactDetails().setVisible(true);
            dispose();
        
    }//GEN-LAST:event_lb1ValueChanged

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed

        t1.setVisible(true);
        jLabel5.setVisible(false);
    }//GEN-LAST:event_jLabel5MousePressed

    private void t1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyPressed
       
    }//GEN-LAST:event_t1KeyPressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MousePressed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
       
    }//GEN-LAST:event_t1ActionPerformed

    private void t1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyTyped
   // TODO add your handling code here:
    }//GEN-LAST:event_t1KeyTyped

    private void t1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t1FocusGained

    }//GEN-LAST:event_t1FocusGained

    private void t1VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_t1VetoableChange
      // TODO add your handling code here:
    }//GEN-LAST:event_t1VetoableChange

    private void t1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyReleased
 search();        // TODO add your handling code here:
    }//GEN-LAST:event_t1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new CreateContact().setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Contacts().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lb1;
    private javax.swing.JTextField menubar;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
