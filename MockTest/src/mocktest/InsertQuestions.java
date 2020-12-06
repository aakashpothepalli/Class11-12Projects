/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mocktest;
import java.awt.Image;
import java.io.File;
import java.sql.*;
import javax.swing.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
public class InsertQuestions extends javax.swing.JFrame {

String Qpath,Apath,opt;
    static String question, p1,p2,p3,p4; // p represents option
    public InsertQuestions() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        r1 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        lb1 = new javax.swing.JLabel();
        qpath = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ans = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("question");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 90, -1, -1));

        jButton1.setText("previous");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, -1, -1));

        jButton2.setText("insert");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 560, -1, -1));

        r1.setText("A)");
        getContentPane().add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 50, 30));

        r3.setText("C)");
        getContentPane().add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 50, 30));

        r4.setText("D)");
        getContentPane().add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 50, 30));

        r2.setText("B)");
        getContentPane().add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 50, 30));

        jScrollPane2.setViewportView(jEditorPane1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 572, 210, 80));
        getContentPane().add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 690, 280));

        qpath.setText("question");
        qpath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qpathActionPerformed(evt);
            }
        });
        getContentPane().add(qpath, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 300, -1, -1));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, 150, 30));

        jLabel2.setText("sno");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 370, -1, -1));

        ans.setText("answer");
        ans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansActionPerformed(evt);
            }
        });
        getContentPane().add(ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(1067, 350, 80, -1));

        jButton3.setText("load");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 500, -1, -1));

        jButton4.setText("clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 610, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
opt="l";
        if(r1.isSelected())
            opt = "A";
        else if (r2.isSelected())
            opt = "B";
        else if(r3.isSelected())
            opt="C";
        else if (r4.isSelected())
        {       opt = "D";
    }
        else{
            JOptionPane.showMessageDialog(null,"select an option");
        }
            try{
                File f1 = new File(Qpath);
            FileInputStream fil1 = new FileInputStream(f1);
            
             File f2 = new File(Apath);
            FileInputStream fil2 = new FileInputStream(f2);
                Class.forName("java.sql.Driver");
                Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jee","root","");
                PreparedStatement s = con.prepareStatement("insert into mq values("+t1.getText()+",'"+opt+"',?,?)");
               s.setBinaryStream(1, fil1);
               s.setBinaryStream(2, fil2);
               s.executeUpdate();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }      //lb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("D:\\jee\\math\\1.png")));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void qpathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qpathActionPerformed
      
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        file.setCurrentDirectory(new File("D:\\jee\\math"));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","png","gif");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if (result==JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = file.getSelectedFile();
            Qpath = selectedFile.getAbsolutePath();
            lb1.setIcon(ResizeImage(Qpath));
            
        }
        else if(result == JFileChooser.CANCEL_OPTION) {
            System.out.println("no file selected");            
        }
        
    }//GEN-LAST:event_qpathActionPerformed

    private void ansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansActionPerformed
          JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        file.setCurrentDirectory(new File("D:\\jee\\math"));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","png","gif");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        
       
        if (result==JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = file.getSelectedFile();
            Apath = selectedFile.getAbsolutePath();
            
            
        }
        else if(result == JFileChooser.CANCEL_OPTION) {
            System.out.println("no file selected");            
        }
        
    }//GEN-LAST:event_ansActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try{
                Class.forName("java.sql.Driver");
                Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jee","root","");
              Statement s= con.createStatement();
              ResultSet r = s.executeQuery("select * from mq where qno = 1;");
              while(r.next())
              {
                  int qno = r.getInt("qno");
                  String opt = r.getString("opt");                 
                   byte[] qImg = r.getBytes("Qpath");
         ImageIcon image = new ImageIcon(qImg);
         Image im = image.getImage();
         Image myImg = im.getScaledInstance(lb1.getWidth(),lb1.getHeight(),Image.SCALE_SMOOTH);
         ImageIcon newimage = new ImageIcon(myImg);
         lb1.setIcon(newimage);
              }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
new InsertQuestions().setVisible(true);
dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
public ImageIcon ResizeImage(String ImagePath)
{
        ImageIcon myImage = new ImageIcon(ImagePath);
       Image img = myImage.getImage();
       Image newImg = img.getScaledInstance(lb1.getWidth(),lb1.getHeight(),Image.SCALE_SMOOTH);
       ImageIcon image = new ImageIcon(newImg);
       return image;
}
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
            java.util.logging.Logger.getLogger(InsertQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertQuestions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ans;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb1;
    private javax.swing.JButton qpath;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
