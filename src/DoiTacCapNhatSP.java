

/**
 *
 * @author zerotus
 */
public class DoiTacCapNhatSP extends javax.swing.JFrame {

    /**
     * Creates new form DoiTacCapNhatSP
     */
    public DoiTacCapNhatSP() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableSanPham = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtSoluongton = new javax.swing.JTextField();
        txtMaSP = new javax.swing.JTextField();
        txtMaCN = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        txtTongThanhToan5 = new javax.swing.JTextField();
        txtMaDonHang5 = new javax.swing.JTextField();
        txtHinhThucThanhToan5 = new javax.swing.JTextField();
        txtTinhTrangDonHang5 = new javax.swing.JTextField();
        txtPhiVanChuyen5 = new javax.swing.JTextField();
        txtTongTienHang5 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        txtTongThanhToan6 = new javax.swing.JTextField();
        txtMaDonHang6 = new javax.swing.JTextField();
        txtHinhThucThanhToan6 = new javax.swing.JTextField();
        txtTinhTrangDonHang6 = new javax.swing.JTextField();
        txtPhiVanChuyen6 = new javax.swing.JTextField();
        txtTongTienHang6 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        txtTongThanhToan7 = new javax.swing.JTextField();
        txtMaDonHang7 = new javax.swing.JTextField();
        txtHinhThucThanhToan7 = new javax.swing.JTextField();
        txtTinhTrangDonHang7 = new javax.swing.JTextField();
        txtPhiVanChuyen7 = new javax.swing.JTextField();
        txtTongTienHang7 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnChoose = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtSearchCN = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        txtSearchSP = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã đơn hàng", "Tên khách hàng", "Địa chỉ giao", "Phí vận chuyển", "Hình thức thanh toán", "Tình trạng đơn hàng", "Chọn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã đối tác", "Mã chi nhánh", "Mã sản phẩm", "Số lượng tồn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(TableSanPham);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 920, 270));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 940, 290));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("HỆ THỐNG ĐẶT VÀ CHUYỂN HÀNG ONLINE");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 8, -1, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1520, 70));

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSearch.setText("Tìm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 320, 160, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("Danh sách thông tin sản phẩm");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, 80));

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel40.setText("Mã chi nhánh:");
        jPanel10.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 180, 30));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel41.setText("Mã sản phẩm:");
        jPanel10.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 180, 30));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel42.setText("Số lượng tồn:");
        jPanel10.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 190, 30));
        jPanel10.add(txtSoluongton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 880, 30));
        jPanel10.add(txtMaSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 880, 30));
        jPanel10.add(txtMaCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 880, 30));

        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel43.setText("Tổng thanh toán:");
        jPanel11.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 160, 30));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel44.setText("Hình thức thanh toán:");
        jPanel11.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 210, 30));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel45.setText("Mã đơn hàng:");
        jPanel11.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 40));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel46.setText("Tổng tiền hàng:");
        jPanel11.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 180, 30));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel47.setText("Phí vận chuyển:");
        jPanel11.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, 30));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel48.setText("Tình trạng đơn hàng:");
        jPanel11.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 190, 30));
        jPanel11.add(txtTongThanhToan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 150, 30));
        jPanel11.add(txtMaDonHang5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 150, 30));
        jPanel11.add(txtHinhThucThanhToan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 150, 30));
        jPanel11.add(txtTinhTrangDonHang5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 150, 30));
        jPanel11.add(txtPhiVanChuyen5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 150, 30));
        jPanel11.add(txtTongTienHang5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 150, 30));

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 870, 230));

        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel49.setText("Tổng thanh toán:");
        jPanel12.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 160, 30));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel50.setText("Hình thức thanh toán:");
        jPanel12.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 210, 30));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel51.setText("Mã đơn hàng:");
        jPanel12.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 40));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel52.setText("Tổng tiền hàng:");
        jPanel12.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 180, 30));

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel53.setText("Phí vận chuyển:");
        jPanel12.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, 30));

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel54.setText("Tình trạng đơn hàng:");
        jPanel12.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 190, 30));
        jPanel12.add(txtTongThanhToan6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 150, 30));
        jPanel12.add(txtMaDonHang6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 150, 30));
        jPanel12.add(txtHinhThucThanhToan6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 150, 30));
        jPanel12.add(txtTinhTrangDonHang6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 150, 30));
        jPanel12.add(txtPhiVanChuyen6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 150, 30));
        jPanel12.add(txtTongTienHang6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 150, 30));

        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel55.setText("Tổng thanh toán:");
        jPanel13.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 160, 30));

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel56.setText("Hình thức thanh toán:");
        jPanel13.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 210, 30));

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel57.setText("Mã đơn hàng:");
        jPanel13.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 40));

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel58.setText("Tổng tiền hàng:");
        jPanel13.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 180, 30));

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel59.setText("Phí vận chuyển:");
        jPanel13.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, 30));

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel60.setText("Tình trạng đơn hàng:");
        jPanel13.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 190, 30));
        jPanel13.add(txtTongThanhToan7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 150, 30));
        jPanel13.add(txtMaDonHang7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 150, 30));
        jPanel13.add(txtHinhThucThanhToan7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 150, 30));
        jPanel13.add(txtTinhTrangDonHang7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 150, 30));
        jPanel13.add(txtPhiVanChuyen7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 150, 30));
        jPanel13.add(txtTongTienHang7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 150, 30));

        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 870, 230));

        jPanel10.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 870, 230));

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel61.setText("Mã đối tác:");
        jPanel10.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 130, 40));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 1300, 200));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 690, 160, 60));

        btnChoose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnChoose.setText("Chọn");
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });
        jPanel1.add(btnChoose, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 690, 160, 60));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnUpdate.setText("Cập nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 690, 160, 60));
        jPanel1.add(txtSearchCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 190, 210, 50));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel39.setText("Mã chi nhánh:");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 190, 120, 50));

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel62.setText("Mã sản phẩm:");
        jPanel1.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 250, 120, 50));
        jPanel1.add(txtSearchSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 250, 210, 50));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 690, 160, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1540, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChooseActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(DoiTacCapNhatSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiTacCapNhatSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiTacCapNhatSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiTacCapNhatSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoiTacCapNhatSP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableSanPham;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChoose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtHinhThucThanhToan5;
    private javax.swing.JTextField txtHinhThucThanhToan6;
    private javax.swing.JTextField txtHinhThucThanhToan7;
    private javax.swing.JTextField txtMaCN;
    private javax.swing.JTextField txtMaDonHang5;
    private javax.swing.JTextField txtMaDonHang6;
    private javax.swing.JTextField txtMaDonHang7;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtPhiVanChuyen5;
    private javax.swing.JTextField txtPhiVanChuyen6;
    private javax.swing.JTextField txtPhiVanChuyen7;
    private javax.swing.JTextField txtSearchCN;
    private javax.swing.JTextField txtSearchSP;
    private javax.swing.JTextField txtSoluongton;
    private javax.swing.JTextField txtTinhTrangDonHang5;
    private javax.swing.JTextField txtTinhTrangDonHang6;
    private javax.swing.JTextField txtTinhTrangDonHang7;
    private javax.swing.JTextField txtTongThanhToan5;
    private javax.swing.JTextField txtTongThanhToan6;
    private javax.swing.JTextField txtTongThanhToan7;
    private javax.swing.JTextField txtTongTienHang5;
    private javax.swing.JTextField txtTongTienHang6;
    private javax.swing.JTextField txtTongTienHang7;
    // End of variables declaration//GEN-END:variables
}
