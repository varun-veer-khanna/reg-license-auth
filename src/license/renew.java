/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package license;
import java.sql.*;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class renew extends javax.swing.JFrame {

    
    Connection con;
    exchange e3=new exchange();
    int id;
    ResultSet rs;
    Statement st;
    public renew() 
    {
        initComponents();
this.getContentPane().setBackground(Color.WHITE);
        setBounds(100, 100, 650, 500);
        setTitle("Renew Licence");
            connection();
            id=e3.get_id();
            jTextField3.setText(Integer.toString(id));
             String str="select * from register where id1="+id;
        try
        {
            st=con.createStatement();
            rs=st.executeQuery(str);
          
            if(rs.next())
            {
                 String type_no=rs.getString("type_no");
               
                 st.close();
                   str="select * from license where type_no='"+type_no+"'";
                   st=con.createStatement();
                   rs=st.executeQuery(str);
                   if(rs.next())   
                   {
                       String s=rs.getString("type");
                       int fee=rs.getInt("fees");
                        tf_type.setText(s);
                       tf_fees.setText(Integer.toString(fee));
                      // JOptionPane.showMessageDialog(this, rs.getString("type"));
                       st.close();
                      
                   }
                   
           }
            else
            {
                JOptionPane.showMessageDialog(this, "try again ");
            }
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
            
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_type = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_fees = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Id:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 80, 40, 20);

        jTextField3.setEnabled(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(310, 80, 210, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("Renew");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 270, 120, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel4.setText("Renew License");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 10, 190, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("License type:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(180, 120, 100, 60);

        tf_type.setEnabled(false);
        getContentPane().add(tf_type);
        tf_type.setBounds(310, 140, 210, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Renew Fees:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(180, 200, 100, 30);

        tf_fees.setEnabled(false);
        getContentPane().add(tf_fees);
        tf_fees.setBounds(310, 200, 210, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int result;
        String str="select * from register where id1="+id;
        //JOptionPane.showMessageDialog(this, str);
        try
        {
            st=con.createStatement();
            rs=st.executeQuery(str);
          
            if(rs.next())
            {
                st.close();
                str="update register set dr=1 where id1="+id;
                st=con.createStatement();
                result=st.executeUpdate(str);
                if(result==1)
                {
                    JOptionPane.showMessageDialog(this,"request successful");
                }
                
                        
                   
           }
            else
            {
                JOptionPane.showMessageDialog(this, "try again ");
            }
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(renew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(renew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(renew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(renew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new renew().setVisible(true);
            }
        });
    }
   void  connection()
    {
         try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con=DriverManager.getConnection("jdbc:odbc:varun","sa","chandigarh");
           
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField tf_fees;
    private javax.swing.JTextField tf_type;
    // End of variables declaration//GEN-END:variables
}
