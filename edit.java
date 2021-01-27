import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.sql.*;
import javax.swing.table.*;
import net.proteanit.sql.DbUtils;
public class edit extends javax.swing.JFrame {

    public edit() {
        initComponents();
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

       // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("details");

        jTextField5.setText("id");

        jTextField6.setText("first name");

        jTextField7.setText("last name");

        jTextField8.setText("father's name");

        
        jTextField9.setText("mother's name");
        jTextField9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jTextField10.setText("address");

        jTextField11.setText("mark2");

        jTextField12.setText("mark1");

        jTextField13.setText("mark3");

        jTextField14.setText("phno");

        jButton1.setText("change first name");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

        jLabel2.setText("id");

        jLabel3.setText("first name");

        jLabel4.setText("last name");

        jLabel5.setText("father's name");

        jLabel6.setText("mother's name");

        jLabel7.setText("address");

        jLabel8.setText("phone no");

        jLabel9.setText("maths");

        jLabel10.setText("english");

        jLabel11.setText("science");

        jLabel12.setText("enter student details");

        jButton2.setText("change last name ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

        jButton3.setText("change fathers name");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton3ActionPerformed(evt);
                }
            });

        jButton4.setText("change mothers name");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton4ActionPerformed(evt);
                }
            });

        jButton5.setText("change address");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton5ActionPerformed(evt);
                }
            });

        jButton6.setText("change phno");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton6ActionPerformed(evt);
                }
            });

        jButton7.setText("change mark1");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton7ActionPerformed(evt);
                }
            });

        jButton8.setText("change mark2");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton8ActionPerformed(evt);
                }
            });

        jButton9.setText("changemark3");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton9ActionPerformed(evt);
                }
            });

        jButton10.setText("search");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton10ActionPerformed(evt);
                }
            });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(537, 537, 537)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField7)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                                .addGap(373, 373, 373)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(373, 373, 373)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton5))
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(82, 82, 82)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton9)
                                            .addComponent(jButton7)
                                            .addComponent(jButton6)
                                            .addComponent(jButton8)))))
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton10))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jButton10))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton6))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton8))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton9))
                .addContainerGap(163, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String sid = jTextField5.getText();
        int count;
        String ch = jTextField6.getText();
        String qry ="update infotable set first_name='"+ch+"' where id='"+sid+"'";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student?useSSL=false","s","pass123");
            Statement stm=con.createStatement();
            count=stm.executeUpdate(qry); 

            stm.close();
            con.close();
        }
        catch(ClassNotFoundException e)
        {count=-1;
            System.out.println("Exception:" + e);
        }
        catch(SQLException e)
        {count=-1;
            System.out.println("Exception:" + e);
        } 
        if(count!=-1)
        {JOptionPane.showMessageDialog(null, "edited");}
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        int count;
        String sid = jTextField5.getText();
        String ch = jTextField7.getText();
        String qry ="update infotable set last_name='"+ch+"' where id='"+sid+"'";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student?useSSL=false","s","pass123");
            Statement stm=con.createStatement();
            count=stm.executeUpdate(qry); 

            stm.close();
            con.close();
        }
        catch(ClassNotFoundException e)
        {count=-1;
            System.out.println("Exception:" + e);
        }
        catch(SQLException e)
        {count=-1;
            System.out.println("Exception:" + e);
        } 
        if(count!=-1)
        {JOptionPane.showMessageDialog(null, "edited");}

    }                               

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        int count;
        String sid = jTextField5.getText();
        String ch = jTextField8.getText();
        String qry ="update infotable set father_name='"+ch+"' where id='"+sid+"'";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student?useSSL=false","s","pass123");
            Statement stm=con.createStatement();
            count=stm.executeUpdate(qry); 

            stm.close();
            con.close();
        }
        catch(ClassNotFoundException e)
        {count=-1;
            System.out.println("Exception:" + e);
        }
        catch(SQLException e)
        {count=-1;
            System.out.println("Exception:" + e);
        } 
        if(count!=-1)
        {JOptionPane.showMessageDialog(null, "edited");}
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {  
        int count;
        // TODO add your handling code here:
        String sid = jTextField5.getText();
        String ch = jTextField9.getText();
        String qry ="update infotable set mothers_name='"+ch+"' where id='"+sid+"'";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student?useSSL=false","s","pass123");
            Statement stm=con.createStatement();
            count=stm.executeUpdate(qry); 

            stm.close();
            con.close();
        }
        catch(ClassNotFoundException e)
        {count=-1;
            System.out.println("Exception:" + e);
        }
        catch(SQLException e)
        {count=-1;
            System.out.println("Exception:" + e);
        } 
        if(count!=-1)
        {JOptionPane.showMessageDialog(null, "edited");} 
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        int count;
        String sid = jTextField5.getText();
        String ch = jTextField10.getText();
        String qry ="update infotable set address='"+ch+"' where id='"+sid+"'";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student?useSSL=false","s","pass123");
            Statement stm=con.createStatement();
            count=stm.executeUpdate(qry); 

            stm.close();
            con.close();
        }
        catch(ClassNotFoundException e)
        {count=-1;
            System.out.println("Exception:" + e);
        }
        catch(SQLException e)
        {count=-1;
            System.out.println("Exception:" + e);
        } 
        if(count!=-1)
        {JOptionPane.showMessageDialog(null, "edited");} 
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        int count;
        String sid = jTextField5.getText();
        String ch = jTextField14.getText();
        String qry ="update infotable set phno='"+ch+"' where id='"+sid+"'";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student?useSSL=false","s","pass123");
            Statement stm=con.createStatement();
            count=stm.executeUpdate(qry); 

            stm.close();
            con.close();
        }
        catch(ClassNotFoundException e)
        {count=-1;
            System.out.println("Exception:" + e);
        }
        catch(SQLException e)
        {count=-1;
            System.out.println("Exception:" + e);
        } 
        if(count!=-1)
        {JOptionPane.showMessageDialog(null, "edited");} 
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        int count;
        String sid = jTextField5.getText();
        String ch = jTextField12.getText();
        String qry ="update infotable set mark1='"+ch+"' where id='"+sid+"'";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student?useSSL=false","s","pass123");
            Statement stm=con.createStatement();
            count=stm.executeUpdate(qry); 

            stm.close();
            con.close();
        }
        catch(ClassNotFoundException e)
        {count=-1;
            System.out.println("Exception:" + e);
        }
        catch(SQLException e)
        {count=-1;
            System.out.println("Exception:" + e);
        } 
        if(count!=-1)
        {JOptionPane.showMessageDialog(null, "edited");} 
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        int count;
        String sid = jTextField5.getText();
        String ch = jTextField11.getText();
        String qry ="update infotable set mark2='"+ch+"' where id='"+sid+"'";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student?useSSL=false","s","pass123");
            Statement stm=con.createStatement();
            count=stm.executeUpdate(qry); 

            stm.close();
            con.close();
        }
        catch(ClassNotFoundException e)
        {count=-1;
            System.out.println("Exception:" + e);
        }
        catch(SQLException e)
        {count=-1;
            System.out.println("Exception:" + e);
        } 
        if(count!=-1)
        {JOptionPane.showMessageDialog(null, "edited");} 
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        int count;
        String sid = jTextField5.getText();
        String ch = jTextField13.getText();
        String qry ="update infotable set mark3='"+ch+"' where id='"+sid+"'";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student?useSSL=false","s","pass123");
            Statement stm=con.createStatement();
            count=stm.executeUpdate(qry); 

            stm.close();
            con.close();
        }
        catch(ClassNotFoundException e)
        {count=-1;
            System.out.println("Exception:" + e);
        }
        catch(SQLException e)
        {count=-1;
            System.out.println("Exception:" + e);
        } 
        if(count!=-1)
        {JOptionPane.showMessageDialog(null, "edited");} 
    }                                        

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {  
        String sid = jTextField5.getText();
        ;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student?useSSL=false","s","pass123");
            Statement stm=con.createStatement();
            String qry="select * from infotable where id='"+sid+"'"; 
            //qry = qry.concat(sid);
            // ResultSet rs = stm.executeQuery(qry);
            // System.out.println("id  name    job");
            ResultSet rs = stm.executeQuery(qry);
            while (rs.next()) {
                int id = rs.getInt("id");
                String idd=Integer.toString(id);

                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");
                String father_name = rs.getString("father_name");
                String mother_name = rs.getString("mothers_name");
                String address = rs.getString("address");
                int phno = rs.getInt("phno");
                String ph=Integer.toString(phno);
                int mark1 = rs.getInt("mark1");
                String m1=Integer.toString(mark1);
                int mark2 = rs.getInt("mark2");
                String m2=Integer.toString(mark2);
                int mark3 = rs.getInt("mark3");
                String m3=Integer.toString(mark3);

                //jTextField2.setText(id);
                jTextField6.setText(first_name);
                jTextField7.setText(last_name);
                jTextField8.setText(father_name);
                jTextField9.setText(mother_name);
                jTextField10.setText(address);

                jTextField11.setText(m1);
                jTextField12.setText(m2);
                jTextField13.setText(m3);
                jTextField14.setText(ph);

                // System.out.println(id+"   "+name+"    "+job);
            }

            stm.close();
            con.close();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Exception:" + e);
        }
        catch(SQLException e)
        {
            System.out.println("Exception:" + e);
        }
    }                                        

        

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new edit().setVisible(true);
                }
            });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration                   
}
