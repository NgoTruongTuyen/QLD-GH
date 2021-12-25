
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 *  Student's ID: 19127622
 *  Full name: Ngo Truong Tuyen
 *  Subject: Java Programming
 *  Assignment :
 *  Problem :
 */

/**
 *
 * @author zerotus
 */
public class TXDangKyTaiKhoan extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    /**
     * Creates new form TXDangKyTaiKhoan
     */
    public TXDangKyTaiKhoan() {
        initComponents();
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
        jPanel8 = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtAccountNumber = new javax.swing.JTextField();
        txtIDCard = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtLicensePlate = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("HỆ THỐNG ĐẶT VÀ CHUYỂN HÀNG ONLINE");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1520, 90));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnRegister.setText("Đăng kí");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel8.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 210, 60));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, 1520, 70));

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Biển số xe");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 170, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Tên tài xế");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 140, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Đăng kí tài khoản");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 210, 40));

        txtAccountNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel6.add(txtAccountNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 310, 40));

        txtIDCard.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel6.add(txtIDCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 310, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Email");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 140, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("CMND");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 140, 40));

        txtLicensePlate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel6.add(txtLicensePlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 310, 40));

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel6.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 310, 40));

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel6.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 310, 40));

        txtArea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel6.add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 310, 40));

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel6.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, 310, 40));

        txtPhone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel6.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, 310, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Số điện thoại");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 140, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Khu vực hoạt động");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 180, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Địa chỉ");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 200, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Tài khoản ngân hàng");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 200, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1520, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1538, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        try {
            conn = DBInfo.connect();
            pstmt = conn.prepareStatement("select MATK from TAIKHOAN where LOAIND = 3");
            rs = pstmt.executeQuery();
            int counter = 0;
            while (rs.next()) {
                counter++;
            }
            
            String id;
            while (true) {
                pstmt = conn.prepareStatement("select * from TAIKHOAN where MATK = ?");
                id = new String ("TX000" + Integer.toString(counter));
                pstmt.setString(1, id);
                rs = pstmt.executeQuery();
                if (!rs.next()) {
                    pstmt = conn.prepareStatement("insert into TAIKHOAN(MATK, LOAIND, MATKHAU, TINHTRANG) values(?, ?, ?, ?)");
                    pstmt.setString(1, id);
                    pstmt.setInt(2, 3);
                    pstmt.setString(3, "12345678");
                    pstmt.setInt(4, 1);
                    pstmt.executeUpdate();
                    break;
                }
                counter++;
            }

            //update data from QUANTRIVIEN table
            pstmt = conn.prepareStatement("insert into TAIXE(MATX, TENTX, CMND, BIENSOXE, THONGTINTKNH, KHUVUCHD, DIACHI, SDT, EMAIL)" 
                  + " values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pstmt.setString(1, id);
            pstmt.setString(2, txtName.getText());
            pstmt.setString(3, txtIDCard.getText());
            pstmt.setString(4, txtLicensePlate.getText());
            pstmt.setString(5, txtAccountNumber.getText());
            pstmt.setString(6, txtArea.getText());
            pstmt.setString(7, txtAddress.getText());
            pstmt.setString(8, txtPhone.getText());
            pstmt.setString(9, txtEmail.getText());
            pstmt.executeUpdate();
           
            String rsMessage = "Đăng kí tài khoản thành công, MATK: " + id + ", mật khẩu: 12345678";
            JOptionPane.showMessageDialog(this, rsMessage);
            
            DangNhap login = new DangNhap();
            this.hide();
            login.setVisible(true);

        } catch (SQLException ex) {
            Logger.getLogger(ThongTinQuanTriVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(TXDangKyTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TXDangKyTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TXDangKyTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TXDangKyTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TXDangKyTaiKhoan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIDCard;
    private javax.swing.JTextField txtLicensePlate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
