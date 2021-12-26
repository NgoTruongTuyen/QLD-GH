
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author zerotus
 */
public class KH_TheoDoiDH extends javax.swing.JFrame {
    Connection connection;
    String savedDH;
    /**
     * Creates new form TheoDoiDonHang
     */
    public KH_TheoDoiDH() {
        initComponents();
        savedDH=KH_DanhSachDH.savedID;
        loadDH(DangNhap.userID);
    }
    public void loadDH(String MAKH){
        connection = DBInfo.connect();
       
        String MADH,TongTien,PhiVC,TinhTrangDH,HinhThucTT,DiaChiNhanHang,SDT,DIACHI;
        MADH = KH_DanhSachDH.savedID;
        
        String sql = "SELECT * FROM DONHANG,KHACHHANG WHERE DONHANG.MAKH='"+MAKH+"' AND DONHANG.MAKH= KHACHHANG.MAKH AND MADH='"+savedDH+"'";
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
           // TongTien = rs.getString();
            PhiVC = "29000";
            TinhTrangDH = rs.getString("TINHTRANGDH");
            if(Integer.parseInt(TinhTrangDH)==0){
                btnXacNhan.setEnabled(true);
            }
            else {
                btnXacNhan.setEnabled(false);
            }
            HinhThucTT = rs.getString("HINHTHUCTT");
            DiaChiNhanHang = rs.getString("DIACHIGIAO");
            lblMaDH.setText(MADH);
            
            lblPhiVC.setText(PhiVC);
            if(Integer.parseInt(TinhTrangDH)==0){
                lblTTDH.setText("Đang giao");
            }
            else if (Integer.parseInt(TinhTrangDH)==1){
                lblTTDH.setText("Đã nhận");
            }
            else if (Integer.parseInt(TinhTrangDH)==-1){
                lblTTDH.setText("Đã hủy");
            }
            
            HTTT.setText(HinhThucTT);
            lblDCNH.setText(DiaChiNhanHang);
            lblMAKH.setText(MAKH);
            SDT = rs.getString("SDT");
            lblSDT.setText(SDT);
           
            
        } catch (SQLException ex) {
            Logger.getLogger(KH_TheoDoiDH.class.getName()).log(Level.SEVERE, null, ex);
        }
         DefaultTableModel tableModel = (DefaultTableModel) TableSanPham.getModel();
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        String sqlCTDH = "SELECT* FROM CTDONHANG,SANPHAM WHERE MADH = '"+MADH+"' "
                + "AND CTDONHANG.MASP = SANPHAM.MASP";
        try {
            Statement st1= connection.createStatement();
            ResultSet rs = st1.executeQuery(sqlCTDH);
            while(rs.next()){
                String TenSP = rs.getString("TENSP");
                String MASP = rs.getString("MASP");
                String SL = rs.getString("SOLUONG");
                String GIA = rs.getString("GIA");
                String TongTienHang = (Integer.parseInt(SL)*Integer.parseInt(GIA))+"";
                lblTongTienHang.setText(TongTienHang);
                lblTongTT.setText((Integer.parseInt(TongTienHang)+29000)+"");
                String tData[] = {TenSP,MASP,SL,GIA};
                tableModel.setColumnIdentifiers(new Object[]{"Tên sản phẩm","Mã sản phẩm","Số lượng","Đơn giá"});
                tableModel.addRow(tData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KH_TheoDoiDH.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        btnBack = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        HTTT = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
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
        lblTongTT = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        lblMaDH = new javax.swing.JLabel();
        lblTongTienHang = new javax.swing.JLabel();
        lblPhiVC = new javax.swing.JLabel();
        lblTTDH = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableQuaTrinhVC = new javax.swing.JTable();
        btnXacNhan = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        lblDCNH = new javax.swing.JLabel();
        lblSDT = new javax.swing.JLabel();
        lblMAKH = new javax.swing.JLabel();

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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tên đối tác", "Tên sản phẩm", "Mã sản phẩm", "Số lượng", "Đơn giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(TableSanPham);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 860, 330));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 880, 350));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("HỆ THỐNG ĐẶT VÀ CHUYỂN HÀNG ONLINE");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 8, -1, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1520, 70));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 720, 130, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel8.setText("Theo dõi đơn hàng");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 60));

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel37.setText("Tổng thanh toán:");
        jPanel10.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 160, 30));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel38.setText("Hình thức thanh toán:");
        jPanel10.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, 30));

        HTTT.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel10.add(HTTT, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 130, 40));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel40.setText("Tổng tiền hàng:");
        jPanel10.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 180, 30));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel41.setText("Phí vận chuyển:");
        jPanel10.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 150, 30));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel42.setText("Tình trạng đơn hàng:");
        jPanel10.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 190, 30));

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

        lblTongTT.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTongTT.setText("0 đ");
        jPanel10.add(lblTongTT, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 160, 30));

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel65.setText("Mã đơn hàng:");
        jPanel10.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 40));

        lblMaDH.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel10.add(lblMaDH, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 130, 40));

        lblTongTienHang.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel10.add(lblTongTienHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 130, 40));

        lblPhiVC.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel10.add(lblPhiVC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 130, 40));

        lblTTDH.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel10.add(lblTTDH, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 130, 40));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 880, 240));

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Quá trình vận chuyển");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Mã tài xế");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 80, 40));

        TableQuaTrinhVC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TableQuaTrinhVC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Thời gian", "Ngày tháng năm", "Quá trình vận chuyển"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableQuaTrinhVC);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 610, 90));

        btnXacNhan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnXacNhan.setText("Xác nhận đã nhận hàng");
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });
        jPanel6.add(btnXacNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 320, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 250, 630, 470));

        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel14.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, 40));

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel63.setText("Số điện thoại:");
        jPanel14.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, 50));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Địa chỉ nhận hàng");
        jPanel14.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel66.setText("Mã khách hàng:");
        jPanel14.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, 40));

        lblDCNH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel14.add(lblDCNH, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 130, 20));

        lblSDT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel14.add(lblSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 130, 20));

        lblMAKH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel14.add(lblMAKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 130, 20));

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 120, 630, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1540, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        KH_DanhSachDH KH = new KH_DanhSachDH();
        dispose();
        KH.setVisible(true);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        try {
            // TODO add your handling code here:
            String sql ="UPDATE DONHANG SET TINHTRANGDH = '1' WHERE MAKH='"+DangNhap.userID+"'";
            Statement st = connection.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Xác nhận thành công");
            dispose();
            KH_DanhSachDH KH = new KH_DanhSachDH();
            KH.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(KH_TheoDoiDH.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnXacNhanActionPerformed

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
            java.util.logging.Logger.getLogger(KH_TheoDoiDH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KH_TheoDoiDH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KH_TheoDoiDH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KH_TheoDoiDH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KH_TheoDoiDH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HTTT;
    private javax.swing.JTable TableQuaTrinhVC;
    private javax.swing.JTable TableSanPham;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
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
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblDCNH;
    private javax.swing.JLabel lblMAKH;
    private javax.swing.JLabel lblMaDH;
    private javax.swing.JLabel lblPhiVC;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JLabel lblTTDH;
    private javax.swing.JLabel lblTongTT;
    private javax.swing.JLabel lblTongTienHang;
    private javax.swing.JTextField txtHinhThucThanhToan5;
    private javax.swing.JTextField txtHinhThucThanhToan6;
    private javax.swing.JTextField txtHinhThucThanhToan7;
    private javax.swing.JTextField txtMaDonHang5;
    private javax.swing.JTextField txtMaDonHang6;
    private javax.swing.JTextField txtMaDonHang7;
    private javax.swing.JTextField txtPhiVanChuyen5;
    private javax.swing.JTextField txtPhiVanChuyen6;
    private javax.swing.JTextField txtPhiVanChuyen7;
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
