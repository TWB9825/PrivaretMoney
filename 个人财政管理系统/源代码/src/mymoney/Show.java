/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymoney;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 小圈子
 */
public class Show extends javax.swing.JFrame {

    Statement st;
    Connection con;
    String s;

    /**
     * Creates new form Show
     */
    public Show() {

        initComponents();
        initializeDB();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jb1 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jbox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jbox3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jf1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jf2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jf3 = new javax.swing.JTextField();
        jb5 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "收支编号", "收支日期", "收支类型", "收支项目", "收入数目", "支出数目", "总计数目"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jb1.setText("全部查询");

        jb2.setText("收入查询");

        jb3.setText("支出查询");

        jb4.setText("按日期查询");

        jbox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2010", "2011", "2012", "2013", "2014", "2015", "2016" }));
        jbox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jbox1ItemStateChanged(evt);
            }
        });

        jLabel1.setText("选择年份：");

        jLabel2.setText("选择月份：");

        jbox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));
        jbox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jbox2ItemStateChanged(evt);
            }
        });

        jLabel3.setText("选择日份：");

        jbox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        jLabel4.setText("收入总计：");

        jLabel5.setText("支出总计：");

        jLabel6.setText("收入支出总计：");

        jb5.setText("返回上一级");

        jb6.setText("修改");
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });

        jb7.setText("删除");

        jb8.setText("插入");

        jb9.setText("个人信息查询");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jbox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jb4))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jf1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jf2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jf3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jb5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb8)
                            .addComponent(jb7)
                            .addComponent(jb6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jb1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb3)
                        .addGap(249, 249, 249)
                        .addComponent(jb9)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb1)
                    .addComponent(jb2)
                    .addComponent(jb3)
                    .addComponent(jb9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jbox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jbox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jb8)
                        .addGap(49, 49, 49)
                        .addComponent(jb7)
                        .addGap(44, 44, 44)
                        .addComponent(jb6)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jb5)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setDay(JComboBox year, JComboBox month, JComboBox day) {
        int y = Integer.parseInt(year.getSelectedItem().toString());
        int m = Integer.parseInt(month.getSelectedItem().toString());
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, y);
        c.set(Calendar.MONTH, m - 1);
        int days = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        day.setModel(new DefaultComboBoxModel(getModel(1, days)));
    }

    public String[] getModel(int start, int end) {
        String[] m = new String[end - start + 1];
        for (int i = 0; i < m.length; i++) {
            m[i] = String.valueOf(i + start);
        }
        return m;
    }
    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb6ActionPerformed

    private void jbox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jbox1ItemStateChanged
        // TODO add your handling code here:
        setDay(jbox1, jbox2, jbox3);
    }//GEN-LAST:event_jbox1ItemStateChanged

    private void jbox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jbox2ItemStateChanged
        // TODO add your handling code here:
        setDay(jbox1, jbox2, jbox3);
    }//GEN-LAST:event_jbox2ItemStateChanged

    
    public void initializeDB() {
        String url = "jdbc:sqlserver://localhost:1433; DatabaseName=MyMoney";
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String user = "sa";
        String pwd = "zq7108392";
        try {
            Class.forName(driver);//加载驱动
            System.out.println("驱动加载成功");
        } catch (ClassNotFoundException event) {
            System.out.print("无法创建驱动程式实体!");
        }
        try {
            con = DriverManager.getConnection(url, user, pwd);
            System.out.println("引入数据库成功");
            st = con.createStatement();

        } catch (SQLException e) {
        }
    }

    public void init() {
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int isTrue = JOptionPane.showConfirmDialog(null, "确定退出？", "退出", JOptionPane.YES_NO_OPTION);
                if (isTrue == JOptionPane.YES_NO_OPTION) {
                    System.exit(0);
                }

            }
        });
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultSet rs;
//                ResultSetMetaData rsmd;
                String[] data = new String[7];
                int numT;
                double sum = 0;
                double sum1 = 0;
                double sum2 = 0;
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                numT = model.getRowCount();//获取当前已有行数
                while (numT > 0) {//如果是全体刷新表格需要移除之前的所有数据行
                    model.removeRow(0);
                    numT--;
                }
                try {
                    String sql = "select incomeID,date,type,project,inMoney,outMoney,sumMoney from MyMoney where userName='" + s + "'";
                    rs = st.executeQuery(sql);
                    while (rs.next()) {
                        data[0] = rs.getString(1).trim();
                        data[1] = rs.getString(2).trim();
                        data[2] = rs.getString(3).trim();
                        data[3] = rs.getString(4).trim();
                        data[4] = rs.getString(5).trim();
                        data[5] = rs.getString(6).trim();
                        data[6] = rs.getString(7).trim();
                        model.addRow(data);
                        sum = sum + Double.parseDouble(data[4].trim());
                        sum1 = sum1 + Double.parseDouble(data[5].trim());
                        sum2 = sum2 + Double.parseDouble(data[6].trim());
                    }
                    jf1.setText(sum + " ");
                    jf2.setText(sum1 + " ");
                    jf3.setText(sum2 + " ");
                } catch (Exception e1) {
                    e1.printStackTrace();
                } finally {
                    //jdbchelper.close();
                }
                jTable1.setModel(model);
            }
        });
        jb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ResultSet rs;
                ResultSetMetaData rsmd;
                String[] data = new String[7];
                int numT;
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                numT = model.getRowCount();//获取当前已有行数
                while (numT > 0) {//如果是全体刷新表格需要移除之前的所有数据行
                    model.removeRow(0);
                    numT--;
                }
                try {
                    String sql = "select incomeID,date,type,project,inMoney,outMoney,sumMoney from MyMoney where type='收入' and  userName='" + s + "'";
                    rs = st.executeQuery(sql);
                    while (rs.next()) {
                        data[0] = rs.getString(1).trim();
                        data[1] = rs.getString(2).trim();
                        data[2] = rs.getString(3).trim();
                        data[3] = rs.getString(4).trim();
                        data[4] = rs.getString(5).trim();
                        data[5] = rs.getString(6).trim();
                        data[6] = rs.getString(7).trim();
                        model.addRow(data);
                    }
                } catch (Exception e1) {
                    e1.printStackTrace();
                } finally {
                }
                jTable1.setModel(model);
            }
        });
        jb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ResultSet rs;
                ResultSetMetaData rsmd;
                String[] data = new String[7];
                int numT;
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                numT = model.getRowCount();//获取当前已有行数
                while (numT > 0) {//如果是全体刷新表格需要移除之前的所有数据行
                    model.removeRow(0);
                    numT--;
                }
                try {
                    String sql = "select incomeID,date,type,project,inMoney,outMoney,sumMoney from MyMoney where type='支出'and  userName='" + s + "'";
                    rs = st.executeQuery(sql);
                    while (rs.next()) {
                        data[0] = rs.getString(1).trim();
                        data[1] = rs.getString(2).trim();
                        data[2] = rs.getString(3).trim();
                        data[3] = rs.getString(4).trim();
                        data[4] = rs.getString(5).trim();
                        data[5] = rs.getString(6).trim();
                        data[6] = rs.getString(7).trim();
                        model.addRow(data);
                    }
                } catch (Exception e1) {
                    e1.printStackTrace();
                } finally {
                    //jdbchelper.close();
                }
                jTable1.setModel(model);
            }
        });
        jb4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s1 = (String) jbox1.getSelectedItem();
                String s2 = (String) jbox2.getSelectedItem();
                String s3 = (String) jbox3.getSelectedItem();
                String s4 = s1 + "-" + s2 + "-" + s3;
                ResultSet rs;
                String[] data = new String[7];
                int numT;
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                numT = model.getRowCount();//获取当前已有行数
                while (numT > 0) {//如果是全体刷新表格需要移除之前的所有数据行
                    model.removeRow(0);
                    numT--;
                }
                try {
                    String sql = "select incomeID,date,type,project,inMoney,outMoney,sumMoney from MyMoney where date='" + s4 + "' and  userName='" + s + "'";
                    rs = st.executeQuery(sql);
                    while (rs.next()) {
                        data[0] = rs.getString(1).trim();
                        data[1] = rs.getString(2).trim();
                        data[2] = rs.getString(3).trim();
                        data[3] = rs.getString(4).trim();
                        data[4] = rs.getString(5).trim();
                        data[5] = rs.getString(6).trim();
                        data[6] = rs.getString(7).trim();
                        model.addRow(data);
                    }
                } catch (Exception e1) {
                    e1.printStackTrace();
                } finally {
                }
                jTable1.setModel(model);
            }
        });
        jb5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int isTrue = JOptionPane.showConfirmDialog(null, "确定返回登录界面？", "退出", JOptionPane.YES_NO_OPTION);
                if (isTrue == JOptionPane.YES_NO_OPTION) {
                    Login login = new Login();
                    login.setVisible(true);
                    setVisible(false);
                }
            }
        });
        jb6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int row = jTable1.getSelectedRow();
                if (row == -1) {
                    JOptionPane.showMessageDialog(null, "请在表中选择一行！");
                } else {
                    Update up = new Update();
                    JTextField[] jtf = up.returnJTF();
                    JComboBox[] jcb = up.returnJBOX();
                    jtf[0].setText(jTable1.getValueAt(row, 2).toString());
                    jtf[1].setText(jTable1.getValueAt(row, 3).toString());
                    jtf[2].setText(jTable1.getValueAt(row, 4).toString());
                    jtf[3].setText(jTable1.getValueAt(row, 5).toString());
                    jtf[4].setText(jTable1.getValueAt(row, 6).toString());
                    jtf[5].setText(jTable1.getValueAt(row, 0).toString());
                    jcb[0].setSelectedItem(jTable1.getValueAt(row, 3).toString());
                    String birthday = jTable1.getValueAt(row, 1).toString();
                    up.setVisible(true);
                    String year = birthday.substring(0, 4);
                    String month = birthday.substring(5, 7);
                    String day = birthday.substring(8, 10);
                    jcb[0].setSelectedItem(year);
                    jcb[1].setSelectedItem(month);
                    jcb[2].setSelectedItem(day);
                }
            }
        });
        jb7.addActionListener(new ActionListener() {//删除功能
            public void actionPerformed(ActionEvent e) {
                int row = jTable1.getSelectedRow();
                if (row == -1) {
                    JOptionPane.showMessageDialog(null, "请在表中选择一行！");
                } else {
                    try {
                        String s = jTable1.getValueAt(row, 0).toString();
                        String str = "delete from MyMoney where incomeID='" + s + "'";
                        st.executeUpdate(str);
                        JOptionPane.showMessageDialog(null, "删除成功");
                    } catch (SQLException ex) {
                        Logger.getLogger(Show.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        jb8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Insert insert = new Insert();
                insert.s = s;
                insert.setVisible(true);
            }
        });
        jb9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    User user = new User();
                    JTextField[] jtf = user.returnJTF();
                    JComboBox[] jcb = user.returnJBOX();
                    user.setVisible(true);
                    ResultSet rs;
                    String str = "select * from admin where userName='" + s + "'";
                    rs = st.executeQuery(str);
                    while (rs.next()) {
                        String s1 = rs.getString("userName");
                        String s2 = rs.getString("password");
                        String s3 = rs.getString("name");
                        String s4 = rs.getString("sex");
                        String s5 = rs.getString("brithday");
                        String s6 = rs.getString("tel");
                        String s7 = rs.getString("job");
                        String s8 = rs.getString("identify");
                        jtf[0].setText(s1);//用户名
                        jtf[5].setText(s2);//密码
                        jtf[1].setText(s3);//姓名
                        jcb[3].setSelectedItem(s4);//性别
                        //生日
                        String year = s5.substring(0, 4);
                        String month = s5.substring(5, 7);
                        String day = s5.substring(8, 10);
                        jcb[0].setSelectedItem(year);
                        jcb[1].setSelectedItem(month);
                        jcb[2].setSelectedItem(day);
                        
                        jtf[2].setText(s7);//职业
                        jtf[3].setText(s8);//身份证号码
                        jtf[4].setText(s6);//电话号码
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Show.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

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
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Show().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JComboBox<String> jbox1;
    private javax.swing.JComboBox<String> jbox2;
    private javax.swing.JComboBox<String> jbox3;
    private javax.swing.JTextField jf1;
    private javax.swing.JTextField jf2;
    private javax.swing.JTextField jf3;
    // End of variables declaration//GEN-END:variables
}
