/*
 *  Student's ID: 19127622
 *  Full name: Ngo Truong Tuyen
 *  Subject: Java Programming
 *  Assignment :
 *  Problem :
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zerotus
 */
public class DangKyTaiKhoan_DT extends javax.swing.JFrame {
    Connection connection;
    /**
     * Creates new form ManagerList
     */
    public DangKyTaiKhoan_DT() {
        initComponents();
    }
    public String getMaDT(){
        int count=0;
        connection= DBInfo.connect();
        String sql = "SELECT COUNT (MADT) AS ROW_COUNT FROM DOITAC";
        try {
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);
            rs.next();
            count = rs.getInt("ROW_COUNT");
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return "DT000"+(count+1);
    }
    String getMaST(){
        int count=0;
        connection = DBInfo.connect();
        String sql = "SELECT COUNT (MAST) AS ROW_COUNT FROM DOITAC";
        try {
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);
            rs.next();
            count = rs.getInt("ROW_COUNT");
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return "ST12"+(count+1)+"5";
    }
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtPartnerName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtOrderPerDay = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtRepresentativeName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtTypeOfGood = new javax.swing.JTextField();
        txtDistrict = new javax.swing.JTextField();
        txtBranchQuantity = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhonenumber = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtBranchQuantity4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("HỆ THỐNG ĐẶT VÀ CHUYỂN HÀNG ONLINE");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1520, 90));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Quản lý nhân viên");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 654, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Đăng ký tài khoản");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 570, 40));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel8.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 210, 60));

        btnSignUp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSignUp.setText("Đăng ký");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel8.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 210, 60));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, 1520, 70));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Email");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 190, 40));

        txtPartnerName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel7.add(txtPartnerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 260, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Loại hàng vận chuyển");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 210, 40));

        txtOrderPerDay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel7.add(txtOrderPerDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 260, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Người đại diện");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 140, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Thành phố");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 230, 40));

        txtRepresentativeName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel7.add(txtRepresentativeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 260, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Tên đối tác");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 190, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Quận");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 190, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Số chi nhánh");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 190, 40));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Số lượng đơn hàng mỗi ngày");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 280, 40));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Số điện thoại");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 190, 40));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Địa chỉ kinh doanh");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 190, 40));

        txtTypeOfGood.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel7.add(txtTypeOfGood, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 260, 40));

        txtDistrict.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel7.add(txtDistrict, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 260, 40));

        txtBranchQuantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel7.add(txtBranchQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 260, 40));

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel7.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 260, 40));

        txtPhonenumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel7.add(txtPhonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 260, 40));

        txtMail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel7.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, 260, 40));

        txtCity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel7.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 260, 40));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 1130, 540));

        txtBranchQuantity4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(txtBranchQuantity4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 260, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1520, 560));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        String MaDT = getMaDT();
               String MaST= getMaST();
               String tenDT = txtPartnerName.getText();
               String NguoiDD =txtRepresentativeName.getText();
               String SLDHMN = txtOrderPerDay.getText();
               String LHVC = txtTypeOfGood.getText();
               String DCKD  = txtAddress.getText();
               String SDT  = txtPhonenumber.getText();
               String SoCN = txtBranchQuantity.getText();
               String Email= txtMail.getText();
               String sql = "INSERT INTO DOITAC(MADT,MAST,TENDT,NGUOIDAIDIEN,SOCN,SOLUONGDH,LOAIHANGVC,DIACHIKD,SDT,EMAIL) VALUES(?,?,?,?,?,?,?,?,?,?)";
               try {
                    PreparedStatement pst = connection.prepareStatement(sql);
                    pst.setString(1,MaDT);
                    pst.setString(2,MaST);
                    pst.setString(3,tenDT);
                    pst.setString(4,NguoiDD);
                    pst.setString(5, SoCN);
                    pst.setString(6,SLDHMN);
                    pst.setString(7,LHVC);
                    pst.setString(8,DCKD);
                    pst.setString(9,SDT);
                   
                    pst.setString(10,Email);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Thêm thành công");
                    txtAddress.setText("");
                    txtBranchQuantity.setText("");
                    txtCity.setText("");
                    txtPartnerName.setText("");
                    txtDistrict.setText("");
                    txtPhonenumber.setText("");
                    txtMail.setText("");
                    txtRepresentativeName.setText("");
                    txtTypeOfGood.setText("");
                    txtOrderPerDay.setText("");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,ex);
                    ex.printStackTrace();
                }
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(DangKyTaiKhoan_DT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKyTaiKhoan_DT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKyTaiKhoan_DT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKyTaiKhoan_DT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangKyTaiKhoan_DT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBranchQuantity;
    private javax.swing.JTextField txtBranchQuantity4;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDistrict;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtOrderPerDay;
    private javax.swing.JTextField txtPartnerName;
    private javax.swing.JTextField txtPhonenumber;
    private javax.swing.JTextField txtRepresentativeName;
    private javax.swing.JTextField txtTypeOfGood;
    // End of variables declaration//GEN-END:variables
}