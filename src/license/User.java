

package license;

import java.awt.Color;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class User extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    Statement st;
    int id;
   
    public User() 
    
    {
        setTitle("User");
        try {
            initComponents();
   this.getContentPane().setBackground(Color.WHITE);
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con=DriverManager.getConnection("jdbc:odbc:varun","sa","chandigarh");
//            JOptionPane.showMessageDialog(this, "conn establish");
        exchange e2=new exchange();
     //   jLabel2.setText(e2.get_name());
        id=e2.get_id();
        JOptionPane.showMessageDialog(this, id);
      // jLabel3.setText( Integer.toString(e2.get_id()));
        
        }
        catch (Exception e) 
        {
           e.printStackTrace();
        }
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jb_renew = new javax.swing.JButton();
        jb_duplicate = new javax.swing.JButton();
        jb_date = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jb_date1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("       ** WELCOME**");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 20, 230, 40);

        jb_renew.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb_renew.setForeground(new java.awt.Color(255, 0, 255));
        jb_renew.setText("Renew License");
        jb_renew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_renewActionPerformed(evt);
            }
        });
        getContentPane().add(jb_renew);
        jb_renew.setBounds(280, 280, 180, 40);

        jb_duplicate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb_duplicate.setForeground(new java.awt.Color(255, 0, 255));
        jb_duplicate.setText("Duplicate License");
        jb_duplicate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_duplicateActionPerformed(evt);
            }
        });
        getContentPane().add(jb_duplicate);
        jb_duplicate.setBounds(270, 140, 210, 40);

        jb_date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb_date.setForeground(new java.awt.Color(255, 0, 255));
        jb_date.setText("Test Date Time");
        jb_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_dateActionPerformed(evt);
            }
        });
        getContentPane().add(jb_date);
        jb_date.setBounds(60, 220, 180, 40);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(390, 20, 100, 40);

        jb_date1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb_date1.setForeground(new java.awt.Color(255, 0, 204));
        jb_date1.setText("Status");
        jb_date1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_date1ActionPerformed(evt);
            }
        });
        getContentPane().add(jb_date1);
        jb_date1.setBounds(90, 80, 150, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_dateActionPerformed
      
        String str="select * from register where id1="+id;
        try
        {
            st=con.createStatement();
            rs=st.executeQuery(str);
            if(rs.next())
            {
              int status=rs.getInt("stat");
            if(status==1)
            {
                st.close();
                str="select * from admin where id1="+id;
                 st=con.createStatement();
                 rs=st.executeQuery(str);
                if(rs.next())
                {
                JOptionPane.showMessageDialog(this, "date="+rs.getString("date")+"time="+rs.getString("time"));
            }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "not alloted ");
            }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "not alloted");
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jb_dateActionPerformed

    private void jb_renewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_renewActionPerformed
        // TODO add your handling code here:
        renew obj=new renew();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jb_renewActionPerformed

    private void jb_duplicateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_duplicateActionPerformed
        // TODO add your handling code here:
        duplicate obj= new duplicate();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jb_duplicateActionPerformed

    private void jb_date1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_date1ActionPerformed
        // TODO add your handling code here:
        status st=new status();
        st.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jb_date1ActionPerformed

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jb_date;
    private javax.swing.JButton jb_date1;
    private javax.swing.JButton jb_duplicate;
    private javax.swing.JButton jb_renew;
    // End of variables declaration//GEN-END:variables
}
