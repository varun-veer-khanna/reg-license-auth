/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package license;

import java.awt.Color;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class date extends javax.swing.JFrame {
 Connection con;
    Statement st;
    ResultSet rs;
      String str;
    
   
    public date()
    {
        initComponents();
        setBounds(100,100, 500, 500);
this.getContentPane().setBackground(Color.WHITE);
        setTitle("Alloting Date");
        try
        {
             Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
             con=DriverManager.getConnection("jdbc:odbc:varun","sa","chandigarh");
//             JOptionPane.showMessageDialog(this, "conn establish");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_date = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_time = new javax.swing.JTextField();
        tb_assign = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Enter id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 50, 80, 40);
        getContentPane().add(tf_id);
        tf_id.setBounds(160, 60, 110, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Date");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 100, 50, 20);
        getContentPane().add(tf_date);
        tf_date.setBounds(160, 100, 110, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Time");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 140, 60, 30);
        getContentPane().add(tf_time);
        tf_time.setBounds(160, 140, 110, 30);

        tb_assign.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        tb_assign.setForeground(new java.awt.Color(102, 102, 0));
        tb_assign.setText("Assign");
        tb_assign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_assignActionPerformed(evt);
            }
        });
        getContentPane().add(tb_assign);
        tb_assign.setBounds(140, 210, 120, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tb_assignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_assignActionPerformed
       if(tf_id.getText().equals("")||tf_date.getText().equals("")||tf_time.getText().equals(""))
       {
         JOptionPane.showMessageDialog(this, "All fields are compulsory");
        }
       else
       {
           int result;
          str="insert into admin values("+Integer.parseInt(tf_id.getText())+",'"+tf_date.getText()+"','"+tf_time.getText()+"'"+")";
           try
           {
               st=con.createStatement();
              result=st.executeUpdate(str);
               if(result==1)
               {
                   JOptionPane.showMessageDialog(this,"Allotted successfully");
                   st.close();
                   str="update register set stat=1 where id1="+tf_id.getText();
                   st=con.createStatement();
                    result=st.executeUpdate(str);
                   if(result==1)
                   {
                       JOptionPane.showMessageDialog(this, "changes succesfully saved");
                   }
               }
               else
               {
                   JOptionPane.showMessageDialog(this, "try again");
               }
               
           }
           catch(Exception e)
           {
               e.printStackTrace();
           }
       }
    }//GEN-LAST:event_tb_assignActionPerformed

 
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
            java.util.logging.Logger.getLogger(date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(date.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new date().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton tb_assign;
    private javax.swing.JTextField tf_date;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_time;
    // End of variables declaration//GEN-END:variables
}
