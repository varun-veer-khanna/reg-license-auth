

package license;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;
import java.sql.DriverManager;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class signup extends javax.swing.JFrame {
    static int id;
    Connection con;
    Statement st;
    ResultSet rs;
    String path,path1,spath,spath1,type,typeno;
    int c1=0,c2=0;
    public signup()
    {
        initComponents();
        setBounds(10, 10,1000, 1000);
       this.getContentPane().setBackground(Color.WHITE);
        dob();
        type();
        
       
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_fname = new javax.swing.JTextField();
        tf_mobile = new javax.swing.JTextField();
        tf_email = new javax.swing.JTextField();
        tf_name = new javax.swing.JTextField();
        jc_month = new javax.swing.JComboBox();
        jc_year = new javax.swing.JComboBox();
        jc_date = new javax.swing.JComboBox();
        jr_male = new javax.swing.JRadioButton();
        jr_female = new javax.swing.JRadioButton();
        jp_cpass = new javax.swing.JPasswordField();
        jp_pass = new javax.swing.JPasswordField();
        l_pic = new javax.swing.JLabel();
        jb_uploadpic = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_address = new javax.swing.JTextArea();
        jb_uploadproof = new javax.swing.JButton();
        jb_submit = new javax.swing.JButton();
        l_proof = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jc_type = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        tf_fee = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(841, 643));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("       Request Driving License");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 0, 380, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Father's name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 100, 160, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Date of Birth");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 150, 130, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 350, 120, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 50, 80, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Confirm Password");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(170, 400, 170, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(170, 540, 80, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Gender");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(170, 200, 80, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Mobile");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(170, 440, 80, 40);
        getContentPane().add(tf_fname);
        tf_fname.setBounds(380, 100, 240, 30);

        tf_mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_mobileActionPerformed(evt);
            }
        });
        getContentPane().add(tf_mobile);
        tf_mobile.setBounds(380, 450, 240, 30);
        getContentPane().add(tf_email);
        tf_email.setBounds(380, 490, 240, 30);
        getContentPane().add(tf_name);
        tf_name.setBounds(380, 50, 240, 30);

        getContentPane().add(jc_month);
        jc_month.setBounds(450, 160, 70, 20);

        getContentPane().add(jc_year);
        jc_year.setBounds(540, 160, 80, 20);

        getContentPane().add(jc_date);
        jc_date.setBounds(380, 160, 60, 20);

        buttonGroup1.add(jr_male);
        jr_male.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jr_male.setText("Male");
        jr_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jr_maleActionPerformed(evt);
            }
        });
        getContentPane().add(jr_male);
        jr_male.setBounds(390, 200, 93, 25);

        buttonGroup1.add(jr_female);
        jr_female.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jr_female.setText("Female");
        getContentPane().add(jr_female);
        jr_female.setBounds(550, 200, 110, 25);
        getContentPane().add(jp_cpass);
        jp_cpass.setBounds(380, 400, 240, 30);
        getContentPane().add(jp_pass);
        jp_pass.setBounds(380, 350, 240, 30);
        getContentPane().add(l_pic);
        l_pic.setBounds(660, 30, 150, 160);

        jb_uploadpic.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb_uploadpic.setText("Upload Image");
        jb_uploadpic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_uploadpicActionPerformed(evt);
            }
        });
        getContentPane().add(jb_uploadpic);
        jb_uploadpic.setBounds(680, 200, 180, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Email");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(170, 490, 80, 40);

        ta_address.setColumns(20);
        ta_address.setRows(5);
        jScrollPane1.setViewportView(ta_address);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(380, 540, 240, 40);

        jb_uploadproof.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jb_uploadproof.setText("Upload Proof");
        jb_uploadproof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_uploadproofActionPerformed(evt);
            }
        });
        getContentPane().add(jb_uploadproof);
        jb_uploadproof.setBounds(680, 510, 150, 30);

        jb_submit.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jb_submit.setForeground(new java.awt.Color(51, 51, 0));
        jb_submit.setText("Submit");
        jb_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_submitActionPerformed(evt);
            }
        });
        getContentPane().add(jb_submit);
        jb_submit.setBounds(280, 590, 150, 60);
        getContentPane().add(l_proof);
        l_proof.setBounds(630, 290, 200, 200);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Vehicle type");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(170, 250, 120, 30);

        jc_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_typeActionPerformed(evt);
            }
        });
        getContentPane().add(jc_type);
        jc_type.setBounds(380, 250, 240, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Fees");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(170, 300, 80, 30);

        tf_fee.setEnabled(false);
        getContentPane().add(tf_fee);
        tf_fee.setBounds(380, 290, 240, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_mobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_mobileActionPerformed

    private void jb_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_submitActionPerformed
        connection();
        if(tf_email.getText().equals("")||tf_name.getText().equals("")||tf_mobile.getText().equals("")||tf_fname.getText().equals("")||jc_date.getSelectedItem().equals("")||jc_month.getSelectedItem().equals("")||jc_year.equals("")||jp_cpass.getText().equals("")||jp_pass.getText().equals("")||ta_address.getText().equals(""))
      {
          JOptionPane.showMessageDialog(this,"all fields are mandatory");
      }
       else if(jc_date.getSelectedItem().toString().equals("date")||jc_month.getSelectedItem().toString().equals("month")||jc_year.getSelectedItem().toString().equals("Year"))
       {
           JOptionPane.showMessageDialog(this, "Select approriate date of birth");
       }
    
        else  if(buttonGroup1.isSelected(null))
      {
          JOptionPane.showMessageDialog(this, "select ur gender");
      }
      
       else if(c1==0)
       {
           JOptionPane.showMessageDialog(this,"upload pic");
       }
       else if(c2==0)
       {
           JOptionPane.showMessageDialog(this, "upload proof");
       }
       else if(!jp_pass.getText().equals(jp_cpass.getText()))
       {
           JOptionPane.showMessageDialog(this,"Password Dont match");
       }
       else if(jc_type.getSelectedItem().equals("choose"))
       {
           JOptionPane.showMessageDialog(this, "select license type");
       }
        else
       {
            String str;
           String gen=null;
           if(jr_female.isSelected())
           {
              gen=jr_female.getText();
           }
           else if(jr_male.isSelected())
           {
               gen=jr_male.getText();
           }
           str="insert into register(name,f_name,dob,password,address,gender,mobile,email,type_no) values("+"'"+tf_name.getText()+"','"+tf_fname.getText()+"','"+jc_date.getSelectedItem().toString()+"/"+jc_month.getSelectedItem().toString()+"/"+jc_year.getSelectedItem().toString()+"','"+jp_pass.getText()+"','"+ta_address.getText()+"','"+gen+"','"+Integer.parseInt(tf_mobile.getText())+"','"+tf_email.getText()+"','"+typeno+"'"+")";
          // JOptionPane.showMessageDialog(this, str);
           try
           {
               st=con.createStatement();
               int result=st.executeUpdate(str);
               if(result==1)
               {
                   JOptionPane.showMessageDialog(this, "saved");
                  
                   st.close();
                   str="select id1 from register where mobile="+tf_mobile.getText();
                   st=con.createStatement();
                   rs=st.executeQuery(str);
                   if(rs.next())
                   {
                         id=rs.getInt("id1");
                       
                            JOptionPane.showMessageDialog(this, "Your id is"+id);
                       st.close();
                       copy(path,id,c1);
                       copy(path1,id,c2);
                       str="update register set pic='"+spath+"',proof='"+spath1+"'where id1="+id;
                      // JOptionPane.showMessageDialog(this, str);
                       st=con.createStatement();
                       int result1=st.executeUpdate(str);
                        if(result1==1)
                        {
                           
                            JOptionPane.showMessageDialog(this,"save successfull");
                            start obj=new start();
                            obj.setVisible(true);
                           this.dispose();
                            
                        }
                                 
                               
                   }
                   
               }
           }
           catch(Exception e)
           {
               e.printStackTrace();
           }
       }
      
    }//GEN-LAST:event_jb_submitActionPerformed

    private void jr_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jr_maleActionPerformed
       
    }//GEN-LAST:event_jr_maleActionPerformed

    private void jb_uploadpicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_uploadpicActionPerformed
      upload();
    }//GEN-LAST:event_jb_uploadpicActionPerformed

    private void jb_uploadproofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_uploadproofActionPerformed
      upload1();
    }//GEN-LAST:event_jb_uploadproofActionPerformed

    private void jc_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_typeActionPerformed
       connection();
       if(!jc_type.getSelectedItem().equals("choose"))
       {
         type=jc_type.getSelectedItem().toString();
       String str="select type_no,fees from license where type='"+type+"'";
       try
       {
           st=con.createStatement();
           rs=st.executeQuery(str);
           if(rs.next())
           {
               typeno=rs.getString(1);
               tf_fee.setText(rs.getString("fees"));   
             //  JOptionPane.showMessageDialog(this, typeno);
               
           }
           st.close();
           con.close();
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       }
    }//GEN-LAST:event_jc_typeActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }
    void dob()
    {
         jc_date.addItem("date");
        for(int i=1;i<=31;i++)
        {
            jc_date.addItem(i);
        }
        jc_month.addItem("month");
        for(int i=1;i<=12;i++)
        {
            jc_month.addItem(i);
        }
        jc_year.addItem("Year");
        for(int i=1962;i<=1999;i++)
        {
            jc_year.addItem(i);
        }
    }
    void upload()
    {
        JFileChooser jf=new JFileChooser();
        int option=jf.showOpenDialog(this);
        if(option==0)
        {
            path=jf.getSelectedFile().getAbsolutePath();
            JOptionPane.showMessageDialog(this,"pic uploaded");
            BufferedImage img=null;
            try
            {
                img= ImageIO.read(new File(path));
                
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            Image dimg = img.getScaledInstance(150, 160,Image.SCALE_SMOOTH);
            ImageIcon icon=new ImageIcon(dimg);
            l_pic.setIcon(icon);
            c1=1;
        }
      
        else
        {
            JOptionPane.showMessageDialog(this,"try again");
        }
    }
    void copy(String path,int id,int c)
    {
        if(c==1)
        {
            spath="e:\\rla\\"+id+"profile.jpg";
            image(path,spath);
        }
        else if(c==2)
        {
            spath1="e:\\rla\\"+id+"proof.jpg";
            image(path,spath1);
        }
    }
    void image(String path,String spath)
    {
         try {
            InputStream input_file=new FileInputStream(path);
            OutputStream output_file=new FileOutputStream(spath);
            byte[] mypic=new byte[1024];
            int len;
            while((len=input_file.read(mypic))>0)
            {
                output_file.write(mypic, 0, len);
            }
            output_file.close();
            input_file.close();
         }
         catch(Exception e)
         {
            e.printStackTrace();
         }
    }
      void upload1()
    {
        JFileChooser jf=new JFileChooser();
        int option=jf.showOpenDialog(this);
        if(option==0)
        {
            path1=jf.getSelectedFile().getAbsolutePath();
            JOptionPane.showMessageDialog(this,"pic uploaded");
            BufferedImage img=null;
            try
            {
                img= ImageIO.read(new File(path1));
                
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            Image dimg = img.getScaledInstance(200, 200,Image.SCALE_SMOOTH);
            ImageIcon icon=new ImageIcon(dimg);
            l_proof.setIcon(icon);
            c2=2;
        }
      
        else
        {
            JOptionPane.showMessageDialog(this,"try again");
        }
    }
      void type()
      {
          connection();
          jc_type.addItem("choose");
          String str="select * from license";
          try
          {
              st=con.createStatement();
              rs=st.executeQuery(str);
              while (rs.next())
                      {
                          jc_type.addItem(rs.getString("type"));
                      }
              st.close();
              con.close();
          }
          
          catch(Exception e)
          {
              e.printStackTrace();
          }
      }
      void connection()
      {
           try
        {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        con=DriverManager.getConnection("jdbc:odbc:varun","sa","chandigarh");
        //JOptionPane.showMessageDialog(rootPane, "connected");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
      }
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_submit;
    private javax.swing.JButton jb_uploadpic;
    private javax.swing.JButton jb_uploadproof;
    private javax.swing.JComboBox jc_date;
    private javax.swing.JComboBox jc_month;
    private javax.swing.JComboBox jc_type;
    private javax.swing.JComboBox jc_year;
    private javax.swing.JPasswordField jp_cpass;
    private javax.swing.JPasswordField jp_pass;
    private javax.swing.JRadioButton jr_female;
    private javax.swing.JRadioButton jr_male;
    private javax.swing.JLabel l_pic;
    private javax.swing.JLabel l_proof;
    private javax.swing.JTextArea ta_address;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_fee;
    private javax.swing.JTextField tf_fname;
    private javax.swing.JTextField tf_mobile;
    private javax.swing.JTextField tf_name;
    // End of variables declaration//GEN-END:variables
}
