package license;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.awt.Color;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import license.renew_list;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gagan Amrit
 */
public class duplicate_list extends javax.swing.JFrame {

    /**
     * Creates new form duplicate_list
     */
    ResultSet rs;
    public duplicate_list() {
        initComponents();
        setBounds(100, 100, 500, 500);
   this.getContentPane().setBackground(Color.WHITE);
        try {
            // TODO add your handling code here:
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con=DriverManager.getConnection("jdbc:odbc:varun","sa","chandigarh");
           // JOptionPane.showMessageDialog(this, "conn establish");
            get_my_table_value();
            st.close();
            combo();
        } 
        catch (Exception e) {
            e.printStackTrace();
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
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jc_dup = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

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
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 444, 192);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("Duplicate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(130, 270, 160, 40);

        getContentPane().add(jc_dup);
        jc_dup.setBounds(160, 220, 100, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 220, 50, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
             
           String str="update duplicate set status=1 where id1="+jc_dup.getSelectedItem();
            st=con.createStatement();
           int result=st.executeUpdate(str);
            if(result==1)
            {
                JOptionPane.showMessageDialog(this, "duplicate");
               // st.close();
                get_my_table_value();
                st.close();
                combo();
            }
            get_my_table_value();
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(duplicate_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(duplicate_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(duplicate_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(duplicate_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new duplicate_list().setVisible(true);
            }
        });
    }
    DefaultTableModel model1;
 Connection con;
 Statement st;
 ResultSet result;
    public void get_my_table_value()
 {
     model1=(DefaultTableModel) jTable1.getModel();
     model1.getDataVector().removeAllElements();
     
     String str="select id1,mobile from duplicate where status=0";
     try
     {
         st=con.createStatement();
          result= st.executeQuery(str);
          
          
          ResultSetMetaData meta_data=result.getMetaData();
         
          
          int col_size=meta_data.getColumnCount();
          String[] col_list=new String[col_size];
          for(int i=0;i<col_size;i++)
          {
              col_list[i]=meta_data.getColumnLabel(i+1).toString();
          }
          model1.setColumnIdentifiers(col_list);
          
          
          while(result.next())
          {
          Object[] row_data=new Object[col_size];
            for(int c=0;c<col_size;c++)
            {
                row_data[c]=result.getObject(c+1);
            }
          model1.addRow(row_data); 
     }
         
     }
     catch(Exception e)
     {
         e.printStackTrace();
     }
 }
      public void combo()
    {
    try {
      
        jc_dup.removeAllItems();
        String str="select id1 from duplicate where status=0";
        st=con.createStatement();
        rs=st.executeQuery(str);
        while(rs.next())
        {
            jc_dup.addItem(Integer.toString(rs.getInt("id1")));
        }
        
       // st.close();
        
    }
    catch (Exception ex)
    {
        ex.printStackTrace();
    }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox jc_dup;
    // End of variables declaration//GEN-END:variables
}
