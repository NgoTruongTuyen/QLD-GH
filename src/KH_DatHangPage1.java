
import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zerotus
 */
public class KH_DatHangPage1 extends javax.swing.JFrame {
    Connection connection;
    static Vector<Vector<String>> savedPro;
    String savedPartnerID;
    String savedProID;
    String savedDT;
    /**
     * Creates new form DatHang_page1
     */
    public KH_DatHangPage1() {
       savedPro = new Vector<Vector<String>>();
       savedPartnerID="";
        savedProID="";
        savedDT="";
        initComponents(); 
        String sql ="SELECT * FROM DOITAC";
        table_load(sql);
    }
    void table_load(String sql){
       // Statement statement = null;
        connection = DBInfo.connect();
        DefaultTableModel tableModel = (DefaultTableModel) TableDoiTac.getModel();
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        try {    
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                String MaDT = rs.getString("MADT");
                String TENDT = rs.getString("TENDT");
                String DIACHI = rs.getString("DIACHIKD");
                String tData[] = {MaDT,TENDT,DIACHI};
          
                tableModel.setColumnIdentifiers(new Object[]{"Mã đối tác","Tên đối tác","Địa chỉ kinh doanh"});
                tableModel.addRow(tData);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
    void table_load_SP(String sql1){
        // Statement statement = null;
       // connection = DBInfo.connect();
        DefaultTableModel tableModel = (DefaultTableModel) TableSanPham.getModel();
       tableModel.setRowCount(0);
       tableModel.setColumnCount(0);
       tableModel.setColumnIdentifiers(new Object[]{"Mã sản phẩm","Tên sản phẩm",
                        "Giá","Mã đối tác","Số lượng tồn"});
        try {
          
                    
            Statement statement = connection.createStatement();
            ResultSet rs1 = statement.executeQuery(sql1);
            while (rs1.next()) {
                String MASP = rs1.getString("MASP");
                savedProID = MASP;
                String TENSP = rs1.getString("TENSP");
                String GIA = rs1.getString("GIA");
                String MaDT = rs1.getString("MADT");
                String SL= rs1.getString("SOLUONGTON");
                
                String tData[] = { MASP, TENSP, GIA,MaDT,SL};
                //      DefaultTableModel tableModel = (DefaultTableModel) table1.getModel();
                
                tableModel.addRow(tData);
            }
           

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public boolean isExistPro(String ProID,String MADT){
       // connection=DBInfo.connect();
        String sql_check="SELECT * FROM CHINHANH_SANPHAM WHERE MASP = '" + ProID + "'  AND MADT='"+MADT+"'";
        Statement stmt = null;
        try {
            stmt = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql_check);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,  e);
            e.printStackTrace();
        }
        try {
            if(rs.next()){
     
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,  e);
            e.printStackTrace();
        }
        return false;
    }
    public boolean isExistPartner(String MADT){
       // connection=DBInfo.connect();
        String sql_check="SELECT * FROM DOITAC WHERE MADT='"+MADT+"'";
        Statement stmt = null;
        try {
            stmt = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql_check);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,  e);
            e.printStackTrace();
        }
        try {
            if(rs.next()){
     
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,  e);
            e.printStackTrace();
        }
        return false;
    }
    
    public String getSL(String MaSP){
        String count="";
        connection = DBInfo.connect();
        String sql = "SELECT SOLUONGTON FROM CHINHANH_SANPHAM WHERE MASP = '"+MaSP+"'";
        try {
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);
            rs.next();
            count = rs.getString("SOLUONGTON");
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return count;
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
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableDoiTac = new javax.swing.JTable();
        btnChooseDT = new javax.swing.JButton();
        txtChooseDT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnDonHang = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TableSanPham = new javax.swing.JTable();
        btnSearchDT = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtSearchSPBar = new javax.swing.JTextField();
        btnSearchSP = new javax.swing.JButton();
        btnChooseSP = new javax.swing.JButton();
        txtSearchDTBar = new javax.swing.JTextField();
        txtChooseSP = new javax.swing.JTextField();
        btnSeeAll = new javax.swing.JButton();
        txtChooseSL = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableDoiTac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã đối tác", "Tên đối tác", "Địa chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(TableDoiTac);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1240, 230));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 250));

        btnChooseDT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnChooseDT.setText("Chọn đối tác");
        btnChooseDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseDTActionPerformed(evt);
            }
        });
        jPanel3.add(btnChooseDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 100, 150, 40));

        txtChooseDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChooseDTActionPerformed(evt);
            }
        });
        jPanel3.add(txtChooseDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 160, 230, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1520, 260));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("HỆ THỐNG ĐẶT VÀ CHUYỂN HÀNG ONLINE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1520, 90));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel7.setText("Danh sách sản phẩm");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, 50));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 720, 140, 40));

        btnDonHang.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDonHang.setText("Tiến hành đặt hàng");
        btnDonHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonHangActionPerformed(evt);
            }
        });
        jPanel1.add(btnDonHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 720, 280, 40));

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Chi nhánh", "Số lượng", "Thành tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(TableSanPham);

        jPanel7.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1240, 240));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 1260, 260));

        btnSearchDT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearchDT.setText("Tìm kiếm");
        btnSearchDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDTActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearchDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 110, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel8.setText("Danh sách đối tác");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 97, -1, 50));

        txtSearchSPBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchSPBarActionPerformed(evt);
            }
        });
        jPanel1.add(txtSearchSPBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 410, 230, 30));

        btnSearchSP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearchSP.setText("Tìm kiếm");
        btnSearchSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchSPActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearchSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 410, -1, 30));

        btnChooseSP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnChooseSP.setText("Thêm vào giỏ hàng");
        btnChooseSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseSPActionPerformed(evt);
            }
        });
        jPanel1.add(btnChooseSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 660, 210, 40));

        txtSearchDTBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchDTBarActionPerformed(evt);
            }
        });
        jPanel1.add(txtSearchDTBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 110, 230, 30));

        txtChooseSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChooseSPActionPerformed(evt);
            }
        });
        jPanel1.add(txtChooseSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 520, 110, 30));

        btnSeeAll.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSeeAll.setText("Xem tất cả");
        btnSeeAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeAllActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeeAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 720, 180, 40));

        txtChooseSL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChooseSLActionPerformed(evt);
            }
        });
        jPanel1.add(txtChooseSL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 570, 110, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Mã sản phẩm");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 520, 120, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Mã số thuế đối tác");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 190, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Mã số thuế đối tác");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 190, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Số lượng");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 570, 80, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1540, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnChooseSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseSPActionPerformed
        // TODO add your handling code here:
        String ProID = txtChooseSP.getText();
        String SL = txtChooseSL.getText();
        String SLSP = getSL(ProID);
         
        if(isExistPro(ProID, savedPartnerID)){
            if (Integer.parseInt(SL)>Integer.parseInt(SLSP)){
            JOptionPane.showMessageDialog(null,"Số lượng sản phẩm phải nhỏ hơn số lượng tồn");
            return;
        }
            Vector<String>tempSP = new Vector<>();
            tempSP.add(ProID);
            tempSP.add(SL);
            savedPro.add(tempSP);
            JOptionPane.showMessageDialog(null,"Thêm thành công");
        }
        else {
            JOptionPane.showMessageDialog(null, "Sản phẩm không tồn tại hoặc thuộc đối tác khác");
            return;
        }
        
         try {
            
        int d = Integer.parseInt(SL);
    } catch (NumberFormatException nfe) {
        JOptionPane.showMessageDialog(null,"Số lượng phải là một số nguyên");
        return;
    }
        
    }//GEN-LAST:event_btnChooseSPActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtSearchDTBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchDTBarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtSearchDTBarActionPerformed

    private void btnDonHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonHangActionPerformed
        // TODO add your handling code here:
        
        KH_DangHangPage2 dh = new KH_DangHangPage2();
        //dh.savedPro = savedPro;
        dh.savedDT = savedPartnerID;
        dh.savedDT = savedPartnerID;
        dispose();
        dh.setVisible(true);
    }//GEN-LAST:event_btnDonHangActionPerformed

    private void btnSearchDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDTActionPerformed
        // TODO add your handling code here:
        String PartnerID = txtSearchDTBar.getText();
        if(isExistPartner(PartnerID)){
            savedPartnerID= PartnerID;
            String sql ="SELECT * FROM DOITAC WHERE MADT = '"+PartnerID+"'";
            table_load(sql);
        }
        else {
            JOptionPane.showMessageDialog(null, "Đối tác không tồn tại");
            DefaultTableModel tableModel = (DefaultTableModel) TableDoiTac.getModel();
            tableModel.setRowCount(0);
            tableModel.setColumnCount(0);        
        }
    }//GEN-LAST:event_btnSearchDTActionPerformed

    private void txtSearchSPBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchSPBarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtSearchSPBarActionPerformed

    private void btnSearchSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchSPActionPerformed
        // TODO add your handling code here:
        String ProID = txtSearchSPBar.getText();
        if(isExistPro(ProID, savedPartnerID)){
             String sql1 ="SELECT * FROM SANPHAM,CHINHANH_SANPHAM,CHINHANH"
                    + " WHERE SANPHAM.MASP=CHINHANH_SANPHAM.MASP AND CHINHANH.MACN=CHINHANH_SANPHAM.MACN\n" +
"AND CHINHANH.MACTY=CHINHANH_SANPHAM.MADT AND CHINHANH.MACTY ='"+savedPartnerID+"' AND SANPHAM.MASP='"+ProID+"'";
            table_load_SP(sql1);
        }
            else{
            JOptionPane.showMessageDialog(null, "Sản phẩm không tồn tại");
        }
        
    }//GEN-LAST:event_btnSearchSPActionPerformed

    
    private void btnChooseDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseDTActionPerformed
        // TODO add your handling code here:
        String MaDT = txtChooseDT.getText();
        savedPartnerID =txtChooseDT.getText();
        String sql1 ="SELECT * FROM SANPHAM,CHINHANH_SANPHAM,CHINHANH"
                    + " WHERE SANPHAM.MASP=CHINHANH_SANPHAM.MASP AND CHINHANH.MACN=CHINHANH_SANPHAM.MACN\n" +
"AND CHINHANH.MACTY=CHINHANH_SANPHAM.MADT AND CHINHANH.MACTY ='"+MaDT+"'";
        table_load_SP(sql1);
        
        
    }//GEN-LAST:event_btnChooseDTActionPerformed

    private void txtChooseDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChooseDTActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtChooseDTActionPerformed

    private void txtChooseSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChooseSPActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtChooseSPActionPerformed

    private void btnSeeAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeAllActionPerformed
        // TODO add your handling code here:
        String sql ="SELECT * FROM DOITAC";
        DefaultTableModel tableModel = (DefaultTableModel) TableSanPham.getModel();
       tableModel.setRowCount(0);
       tableModel.setColumnCount(0);
        table_load(sql);
        
    }//GEN-LAST:event_btnSeeAllActionPerformed

    private void txtChooseSLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChooseSLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChooseSLActionPerformed

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
            java.util.logging.Logger.getLogger(KH_DatHangPage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KH_DatHangPage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KH_DatHangPage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KH_DatHangPage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KH_DatHangPage1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableDoiTac;
    private javax.swing.JTable TableSanPham;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChooseDT;
    private javax.swing.JButton btnChooseSP;
    private javax.swing.JButton btnDonHang;
    private javax.swing.JButton btnSearchDT;
    private javax.swing.JButton btnSearchSP;
    private javax.swing.JButton btnSeeAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtChooseDT;
    private javax.swing.JTextField txtChooseSL;
    private javax.swing.JTextField txtChooseSP;
    private javax.swing.JTextField txtSearchDTBar;
    private javax.swing.JTextField txtSearchSPBar;
    // End of variables declaration//GEN-END:variables
}
