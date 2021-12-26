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
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zerotus
 */
public class NV_XemVaDuyetHD extends javax.swing.JFrame {
    Connection connection;
    /**
     * Creates new form ManagerList
     */
    public NV_XemVaDuyetHD() {
        
        initComponents();
        String sql = "SELECT *FROM HOPDONG";
        table_load(sql); 
    }
    String[] getMaCN(String MADT){
        String SoCN="";
        String sql = "SELECT * FROM DOITAC WHERE MADT= '"+MADT+"'";
        String PartnerName = "";
        try {
            Statement st = connection.createStatement();
           
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            SoCN = rs.getString("SOCN");
            PartnerName = rs.getString("TENDT");
            System.out.print(SoCN + " "+PartnerName);
        } catch (SQLException ex) {
            Logger.getLogger(NV_XemVaDuyetHD.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        int BQ= Integer.parseInt(SoCN);
        System.out.print(BQ);
        
        String []BranchIDList ={"",""};
        for(int i = 0;i<BQ;i++){
            BranchIDList[i]="CN000"+i+1;
        }
        return BranchIDList;
    }
   
    void table_load(String sql){
        // Statement statement = null;
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        connection = DBInfo.connect();
      
        try {
           // String sql1 ="SELECT * FROM HOPDONG";
            Statement statement = connection.createStatement();
            
            ResultSet rs1 = statement.executeQuery(sql);

            while (rs1.next()) {
                String MAHD = rs1.getString("MAHD");
                String MADT = rs1.getString("MADT");
                String MAST = rs1.getString("MAST");
                String NGUOIDAIDIEN = rs1.getString("NGUOIDAIDIEN");
                String SOCHINHANH= rs1.getString("SOCHINHANHDK");
                String DIACHICN= rs1.getString("DIACHICN");
                String NGAYDK= rs1.getString("NGAYDK");
                String THOIGIANHL= rs1.getString("THOIGIANHIEULUC");
                String PHIKH = rs1.getString("PHIKICHHOAT");
                String CHECKHD = rs1.getString("TINHTRANGHD");
                String TTHD="";
                if(CHECKHD.equals("1")){
                    TTHD="Đã duyệt";
                }
                else if (CHECKHD.equals("0")){
                    TTHD="Đang chờ duyệt";
                } else if (CHECKHD.equals("-1")){
                    TTHD="Đã từ chối";
                } 

                String tData[] = { MAHD,MADT,MAST,NGUOIDAIDIEN,SOCHINHANH,DIACHICN,NGAYDK,THOIGIANHL,PHIKH,TTHD};
                //      DefaultTableModel tableModel = (DefaultTableModel) table1.getModel();
                tableModel.setColumnIdentifiers(new Object[]{
                        "Mã hợp đồng","Mã đối tác","Mã số thuế","Người đại diện",
                        "Số chi nhánh đăng ký","Địa chỉ chi nhánh","Ngày đăng ký","Thời gian hiệu lực"
                        ,"Phí kích hoạt","Tình trạng hợp đồng"});
                tableModel.addRow(tData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public boolean isExistCon(String ContractID){
       // connection=DBInfo.connect();
        String sql_check="SELECT * FROM HOPDONG WHERE MAHD = '" + ContractID + "' ";
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
    
    public boolean isExistCon(String ContractID,String MADT,String MAST, String SOCN){
       // connection=DBInfo.connect();
        String sql_check="SELECT * FROM HOPDONG WHERE MAHD = '" + ContractID + "' "
                +"AND MADT = '"+MADT+"' AND MAST = '" +MAST+"' AND SOCHINHANHDK = '"+SOCN+"'";
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
        btnConsiderList = new javax.swing.JButton();
        btnSelectAll = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        btnRefuse = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtContractID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTaxID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtBranchQuantity = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPartnerID = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtSearchingContractID = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnLogout = new javax.swing.JButton();

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
        jLabel5.setText("Xem danh sách hợp đồng");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 570, 40));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConsiderList.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnConsiderList.setText("Xem hợp đồng cần duyệt");
        btnConsiderList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsiderListActionPerformed(evt);
            }
        });
        jPanel8.add(btnConsiderList, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 360, 60));

        btnSelectAll.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSelectAll.setText("Xem tất cả");
        btnSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectAllActionPerformed(evt);
            }
        });
        jPanel8.add(btnSelectAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 210, 60));

        btnApprove.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnApprove.setText("Duyệt");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        jPanel8.add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 210, 60));

        btnRefuse.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnRefuse.setText("Không duyệt");
        btnRefuse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefuseActionPerformed(evt);
            }
        });
        jPanel8.add(btnRefuse, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 210, 60));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel8.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 10, 210, 60));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, 1520, 70));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Số chi nhánh");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 140, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Duyệt hợp đồng ");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 160, 40));

        txtContractID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtContractID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContractIDActionPerformed(evt);
            }
        });
        jPanel6.add(txtContractID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 260, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Mã đối tác");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 140, 40));

        txtTaxID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTaxID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaxIDActionPerformed(evt);
            }
        });
        jPanel6.add(txtTaxID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 260, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Mã số thuế");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 140, 40));

        txtBranchQuantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBranchQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBranchQuantityActionPerformed(evt);
            }
        });
        jPanel6.add(txtBranchQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 260, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Mã hợp đồng");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 140, 40));

        txtPartnerID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPartnerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPartnerIDActionPerformed(evt);
            }
        });
        jPanel6.add(txtPartnerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 260, 40));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 590, 260));

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Mã hợp đồng");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 140, 40));

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel7.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 150, 50));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Xem danh sách hợp đồng");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 240, 40));

        txtSearchingContractID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSearchingContractID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchingContractIDActionPerformed(evt);
            }
        });
        jPanel7.add(txtSearchingContractID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 260, 40));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 590, 150));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hợp đồng", "Mã đối tác", "Mã số thuế", "Người đại diện", "Số chi nhánh đăng ký", "Địa chỉ chi nhánh", "Ngày đăng ký", "Thời gian hiệu lực", "Phí kích hoạt", "Tình trạng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 860, 510));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 880, 530));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1520, 560));

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout.setText("Đăng xuất");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 100, -1, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
         DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
       tableModel.setRowCount(0);
       tableModel.setColumnCount(0);
        connection = DBInfo.connect();
        String search_ContractID = txtSearchingContractID.getText();
        if(isExistCon(search_ContractID)==false){
            JOptionPane.showMessageDialog(null,  "Hợp đồng không tồn tại");
            return;
        }
        String sql = "SELECT * FROM HOPDONG WHERE MAHD='"+search_ContractID+"'";
        table_load(sql);
        
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectAllActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT * FROM HOPDONG";
        table_load(sql);
    }//GEN-LAST:event_btnSelectAllActionPerformed

    private void btnConsiderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsiderListActionPerformed
        // TODO add your handling code here:
        String sql ="SELECT *FROM HOPDONG WHERE TINHTRANGHD='0'";
        table_load(sql);
    }//GEN-LAST:event_btnConsiderListActionPerformed

    private void txtSearchingContractIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchingContractIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchingContractIDActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        String ContractID = txtContractID.getText();
        String PartnerID = txtPartnerID.getText();
        String BQ =  txtBranchQuantity.getText();
        String MAST =  txtTaxID.getText();
        if(isExistCon(ContractID,PartnerID,MAST,BQ)==false){
            JOptionPane.showMessageDialog(null,  "Hợp đồng không tồn tại");
            return;
        }
        
        String sql = "UPDATE HOPDONG SET TINHTRANGHD = 1 WHERE MAHD = ?";
                try {
                    PreparedStatement pst = connection.prepareStatement(sql);
                    pst.setString(1,ContractID);
                    pst.executeUpdate();

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,ex);
                    ex.printStackTrace();
                }
                txtContractID.setText("");
                JOptionPane.showMessageDialog(null,"Duyệt thành công!!");
                String sql1="SELECT * FROM HOPDONG";
                table_load(sql1);                 
                for(int i=0;i<Integer.parseInt(BQ);i++){
                    String sqlInsert = "INSERT INTO CHINHANH (MACN,MACTY,TENCN) VALUES(?,?,?)";
            try {
                PreparedStatement ps1= connection.prepareStatement(sqlInsert);
               ps1.setString(1,"CN000"+(i+1)+" ");
               ps1.setString(2,PartnerID);
               ps1.setString(3, "Chi nhánh"+(i+1)+" ");
                ps1.executeUpdate();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex);
                Logger.getLogger(NV_XemVaDuyetHD.class.getName()).log(Level.SEVERE, null, ex);
            }
                  
             }
                
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRefuseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefuseActionPerformed
        // TODO add your handling code here:
        String ContractID = txtContractID.getText();
        if(isExistCon(ContractID)==false){
            JOptionPane.showMessageDialog(null,  "Hợp đồng không tồn tại");
            return;
        }
        String sql = "UPDATE HOPDONG SET TINHTRANGHD = -1 WHERE MAHD = ?";
                try {
                    PreparedStatement pst = connection.prepareStatement(sql);
                    pst.setString(1,ContractID);
                    pst.executeUpdate();

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,ex);
                    ex.printStackTrace();
                }
                txtContractID.setText("");
                JOptionPane.showMessageDialog(null,"Từ chối thành công!!");
                String sql1="SELECT * FROM HOPDONG";
                table_load(sql1);
    }//GEN-LAST:event_btnRefuseActionPerformed

    private void txtContractIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContractIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContractIDActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtTaxIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaxIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaxIDActionPerformed

    private void txtBranchQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBranchQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBranchQuantityActionPerformed

    private void txtPartnerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPartnerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPartnerIDActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        DangNhap login = new DangNhap();
        this.hide();
        login.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(NV_XemVaDuyetHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NV_XemVaDuyetHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NV_XemVaDuyetHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NV_XemVaDuyetHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NV_XemVaDuyetHD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConsiderList;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRefuse;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSelectAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBranchQuantity;
    private javax.swing.JTextField txtContractID;
    private javax.swing.JTextField txtPartnerID;
    private javax.swing.JTextField txtSearchingContractID;
    private javax.swing.JTextField txtTaxID;
    // End of variables declaration//GEN-END:variables
}
