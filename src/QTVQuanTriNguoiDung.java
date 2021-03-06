import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zerotus
 */
public class QTVQuanTriNguoiDung extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    
    
    String userID = "QTV0001";
    String userType = "0";
    String currentUser = "QTV0001";
    /**
     * Creates new form ThongTinDoiTac
     */
    public QTVQuanTriNguoiDung() {
        initComponents();
        updateDB();
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
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDetail = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnFilterCustomer = new javax.swing.JButton();
        btnFilterAll = new javax.swing.JButton();
        btnFilterDriver = new javax.swing.JButton();
        btnFilterPartner = new javax.swing.JButton();
        btnFilterManager = new javax.swing.JButton();
        btnFilterAdmin = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtSearchByAccountID = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUserList = new javax.swing.JTable();
        btnViewProfile = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("H??? TH???NG ?????T V?? CHUY???N H??NG ONLINE");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1520, 90));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Qu???n l?? nh??n vi??n");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 654, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Qu???n tr??? ng?????i d??ng");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 570, 40));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDelete.setText("X??a");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel8.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 170, 60));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAdd.setText("Th??m");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel8.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 170, 60));

        btnDetail.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDetail.setText("Chi ti???t");
        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });
        jPanel8.add(btnDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 170, 60));

        btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnRefresh.setText("T???i l???i");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel8.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, 170, 60));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, 1520, 70));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFilterCustomer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFilterCustomer.setText("Kh??ch h??ng");
        btnFilterCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterCustomerActionPerformed(evt);
            }
        });
        jPanel6.add(btnFilterCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 310, 40));

        btnFilterAll.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFilterAll.setText("T???t c???");
        btnFilterAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterAllActionPerformed(evt);
            }
        });
        jPanel6.add(btnFilterAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 310, 40));

        btnFilterDriver.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFilterDriver.setText("T??i x???");
        btnFilterDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterDriverActionPerformed(evt);
            }
        });
        jPanel6.add(btnFilterDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 310, 40));

        btnFilterPartner.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFilterPartner.setText("?????i t??c");
        btnFilterPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterPartnerActionPerformed(evt);
            }
        });
        jPanel6.add(btnFilterPartner, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 310, 40));

        btnFilterManager.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFilterManager.setText("Nh??n vi??n");
        btnFilterManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterManagerActionPerformed(evt);
            }
        });
        jPanel6.add(btnFilterManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 310, 40));

        btnFilterAdmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFilterAdmin.setText("Qu???n tr??? vi??n");
        btnFilterAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterAdminActionPerformed(evt);
            }
        });
        jPanel6.add(btnFilterAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 310, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Qu???n l?? t??i kho???n");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 40));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 470, 410));

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSearch.setText("T??m ki???m");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel7.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 150, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("T??m ki???m");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 40));

        txtSearchByAccountID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel7.add(txtSearchByAccountID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 260, 40));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 470, 90));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableUserList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableUserList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M?? t??i kho???n", "Lo???i ng?????i d??ng", "T??nh tr???ng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableUserList);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 510));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 1000, 530));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1520, 560));

        btnViewProfile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnViewProfile.setText("Th??ng tin t??i kho???n");
        btnViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfileActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 100, -1, 40));

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout.setText("????ng xu???t");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 100, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1538, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateDB() {
        int nums, type, status;
        String typeString;
        String statusString;
        try{
            conn = DBInfo.connect();
            pstmt = conn.prepareStatement("select * from TAIKHOAN");
            
            rs = pstmt.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            
            //nums = stData.getColumnCount();
            nums = 3;
            DefaultTableModel recordTable = (DefaultTableModel) tableUserList.getModel();
            recordTable.setRowCount(0);
            while (rs.next()) {
                Vector columnData = new Vector();
                
                for (int i = 0; i < nums; i++) {
                    columnData.add(rs.getString("MATK"));
                    type = Integer.parseInt(rs.getString("LOAIND"));
                    status = Integer.parseInt(rs.getString("TINHTRANG"));
                    switch (type) {
                        case 0: 
                            typeString = "Qu???n tr??? vi??n";
                            break;
                        case 1: 
                            typeString = "Nh??n vi??n";
                            break;
                        case 2: 
                            typeString = "?????i t??c";
                            break;
                            
                        case 3: 
                            typeString = "T??i x???";
                            break;
                        default:
                            typeString = "Kh??ch h??ng"; 
                    }
                    
                    if (status == 0) {
                        statusString = "B??? kh??a";
                    }
                    else {
                        statusString = "B??nh th?????ng";
                    }
                    
                    columnData.add(typeString);
                    columnData.add(statusString);
                }
                
                recordTable.addRow(columnData);
            }
            
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    
    private String getTableName(String id) {
        String preCode = id.substring(0, 2);
        String result;
        switch (preCode) {
            case "NV":
                result = "NHANVIEN";
                break;
            case "DT":
                result = "DOITAC";
                break;
            case "TX":
                result = "TAIXE";
                break;
            case "KH":
                result = "KHACHHANG";
                break;
            default:
                result = "QUANTRIVIEN";   
        } 
        
        return result;
    }
    
    private int getUserType(String id) {
        String preCode = id.substring(0, 2);
        int result;
        switch (preCode) {
            case "NV":
                result = 1;
                break;
            case "DT":
                result = 2;
                break;
            case "TX":
                result = 3;
                break;
            case "KH":
                result = 4;
                break;
            default:
                result = 0;   
        } 
        
        return result;
    }
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        QTVTaoTaiKhoan adminCreate = new QTVTaoTaiKhoan();
        adminCreate.userID = userID;
        adminCreate.userType = userType;
        adminCreate.currentUser = currentUser;
        this.hide();
        adminCreate.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
        DefaultTableModel recordTable = (DefaultTableModel)tableUserList.getModel();
        int selectedRows = tableUserList.getSelectedRow();

        try {
            String id = recordTable.getValueAt(selectedRows, 0).toString();
            id = id.replaceAll("\\s+", "");
            int type = this.getUserType(id);

            switch (type) {
                case 0:
                    ThongTinQuanTriVien adminInfo = new ThongTinQuanTriVien();
                    adminInfo.userID = userID;
                    adminInfo.userType = userType;
                    adminInfo.currentUser = id;
                    
                    this.hide();
                    adminInfo.loadData();
                    adminInfo.setVisible(true);
                    break;
                case 1:
                    ThongTinNhanVien managerInfo = new ThongTinNhanVien();
                    managerInfo.userID = userID;
                    managerInfo.userType = userType;
                    managerInfo.currentUser = id;
                    
                    this.hide();
                    managerInfo.loadData();
                    managerInfo.setVisible(true);
                    break;
                case 2:
                    ThongTinDoiTac partnerInfo = new ThongTinDoiTac();
                    partnerInfo.userID = userID;
                    partnerInfo.userType = userType;
                    partnerInfo.currentUser = id;

                    this.hide();
                    partnerInfo.loadData();
                    partnerInfo.setVisible(true);
                    break;
                case 3:
                    ThongTinTaiXe driverInfo = new ThongTinTaiXe();
                    driverInfo.userID = userID;
                    driverInfo.userType = userType;
                    driverInfo.currentUser = id;

                    this.hide();
                    driverInfo.loadData();
                    driverInfo.setVisible(true);
                    break;
                default:
                    ThongTinKhachHang customerInfo = new ThongTinKhachHang();
                    customerInfo.userID = userID;
                    customerInfo.userType = userType;
                    customerInfo.currentUser = id;

                    this.hide();
                    customerInfo.loadData();
                    customerInfo.setVisible(true);
                    break;
            }
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "C?? l???i x???y ra, kh??ng th??? xem chi ti???t t??i kho???n!");
        }
    }//GEN-LAST:event_btnDetailActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        int type, status;
        String typeString;
        String statusString;
        try{
            conn = DBInfo.connect();
            pstmt = conn.prepareStatement("select * from TAIKHOAN where MATK = ?");
            pstmt.setString(1, txtSearchByAccountID.getText());
            rs = pstmt.executeQuery();
            
            ResultSetMetaData stData = rs.getMetaData();
            boolean found = false;
            
            DefaultTableModel recordTable = (DefaultTableModel) tableUserList.getModel();
            recordTable.setRowCount(0);
            
            while (rs.next()) {
                found = true;
                Vector columnData = new Vector();
                columnData.add(rs.getString("MATK"));
                type = Integer.parseInt(rs.getString("LOAIND"));
                status = Integer.parseInt(rs.getString("TINHTRANG"));
                switch (type) {
                    case 0: 
                        typeString = "Qu???n tr??? vi??n";
                        break;
                    case 1: 
                        typeString = "Nh??n vi??n";
                        break;
                    case 2: 
                        typeString = "?????i t??c";
                        break;

                    case 3: 
                        typeString = "T??i x???";
                        break;
                    default:
                        typeString = "Kh??ch h??ng"; 
                }

                if (status == 0) {
                    statusString = "B??? kh??a";
                }
                else {
                    statusString = "B??nh th?????ng";
                }

                columnData.add(typeString);
                columnData.add(statusString);
                
                recordTable.addRow(columnData);
            }
            
            if (found == false) {
                String rsMessage = "M?? t??i kho???n kh??ng t???n t???i, vui l??ng nh???p l???i!";
                JOptionPane.showMessageDialog(this, rsMessage);
                this.btnRefreshActionPerformed(evt);
            }
            
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnFilterManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterManagerActionPerformed
        int type, status;
        String typeString;
        String statusString;
        try{
            conn = DBInfo.connect();
            pstmt = conn.prepareStatement("select * from TAIKHOAN where LOAIND = 1");
            rs = pstmt.executeQuery();
            
            ResultSetMetaData stData = rs.getMetaData();
            
            DefaultTableModel recordTable = (DefaultTableModel) tableUserList.getModel();
            recordTable.setRowCount(0);
            
            while (rs.next()) {
                Vector columnData = new Vector();
                columnData.add(rs.getString("MATK"));
                status = Integer.parseInt(rs.getString("TINHTRANG"));
                if (status == 0) {
                    statusString = "B??? kh??a";
                }
                else {
                    statusString = "B??nh th?????ng";
                }

                columnData.add("Nh??n vi??n");
                columnData.add(statusString);
                
                recordTable.addRow(columnData);
            }
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnFilterManagerActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        txtSearchByAccountID.setText("");
        
        DefaultTableModel RecordTable = (DefaultTableModel) tableUserList.getModel();
        RecordTable.setRowCount(0);
        
        updateDB();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfileActionPerformed
        ThongTinQuanTriVien adminInfo = new ThongTinQuanTriVien();
        adminInfo.userID = userID;
        adminInfo.userType = userType;
        adminInfo.currentUser = userID;
        this.hide();
        adminInfo.loadData();
        adminInfo.hideDeleteButton();
        adminInfo.setVisible(true);
    }//GEN-LAST:event_btnViewProfileActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        DangNhap login = new DangNhap();
        this.hide();
        login.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnFilterAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterAllActionPerformed
        txtSearchByAccountID.setText("");
        
        DefaultTableModel RecordTable = (DefaultTableModel) tableUserList.getModel();
        RecordTable.setRowCount(0);
        
        updateDB();
    }//GEN-LAST:event_btnFilterAllActionPerformed

    private void btnFilterAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterAdminActionPerformed
        int type, status;
        String typeString;
        String statusString;
        try{
            conn = DBInfo.connect();
            pstmt = conn.prepareStatement("select * from TAIKHOAN where LOAIND = 0");
            rs = pstmt.executeQuery();
            
            ResultSetMetaData stData = rs.getMetaData();
            
            DefaultTableModel recordTable = (DefaultTableModel) tableUserList.getModel();
            recordTable.setRowCount(0);
            
            while (rs.next()) {
                Vector columnData = new Vector();
                columnData.add(rs.getString("MATK"));
                status = Integer.parseInt(rs.getString("TINHTRANG"));
                if (status == 0) {
                    statusString = "B??? kh??a";
                }
                else {
                    statusString = "B??nh th?????ng";
                }

                columnData.add("Qu???n tr??? vi??n");
                columnData.add(statusString);
                
                recordTable.addRow(columnData);
            }
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnFilterAdminActionPerformed

    private void btnFilterPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterPartnerActionPerformed
        int type, status;
        String typeString;
        String statusString;
        try{
            conn = DBInfo.connect();
            pstmt = conn.prepareStatement("select * from TAIKHOAN where LOAIND = 2");
            rs = pstmt.executeQuery();
            
            ResultSetMetaData stData = rs.getMetaData();
            
            DefaultTableModel recordTable = (DefaultTableModel) tableUserList.getModel();
            recordTable.setRowCount(0);
            
            while (rs.next()) {
                Vector columnData = new Vector();
                columnData.add(rs.getString("MATK"));
                status = Integer.parseInt(rs.getString("TINHTRANG"));
                if (status == 0) {
                    statusString = "B??? kh??a";
                }
                else {
                    statusString = "B??nh th?????ng";
                }

                columnData.add("?????i t??c");
                columnData.add(statusString);
                
                recordTable.addRow(columnData);
            }
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnFilterPartnerActionPerformed

    private void btnFilterDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterDriverActionPerformed
        int type, status;
        String typeString;
        String statusString;
        try{
            conn = DBInfo.connect();
            pstmt = conn.prepareStatement("select * from TAIKHOAN where LOAIND = 3");
            rs = pstmt.executeQuery();
            
            ResultSetMetaData stData = rs.getMetaData();
            
            DefaultTableModel recordTable = (DefaultTableModel) tableUserList.getModel();
            recordTable.setRowCount(0);
            
            while (rs.next()) {
                Vector columnData = new Vector();
                columnData.add(rs.getString("MATK"));
                status = Integer.parseInt(rs.getString("TINHTRANG"));
                if (status == 0) {
                    statusString = "B??? kh??a";
                }
                else {
                    statusString = "B??nh th?????ng";
                }

                columnData.add("T??i x???");
                columnData.add(statusString);
                
                recordTable.addRow(columnData);
            }
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnFilterDriverActionPerformed

    private void btnFilterCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterCustomerActionPerformed
        int type, status;
        String typeString;
        String statusString;
        try{
            conn = DBInfo.connect();
            pstmt = conn.prepareStatement("select * from TAIKHOAN where LOAIND = 4");
            rs = pstmt.executeQuery();
            
            ResultSetMetaData stData = rs.getMetaData();
            
            DefaultTableModel recordTable = (DefaultTableModel) tableUserList.getModel();
            recordTable.setRowCount(0);
            
            while (rs.next()) {
                Vector columnData = new Vector();
                columnData.add(rs.getString("MATK"));
                status = Integer.parseInt(rs.getString("TINHTRANG"));
                if (status == 0) {
                    statusString = "B??? kh??a";
                }
                else {
                    statusString = "B??nh th?????ng";
                }

                columnData.add("Kh??ch h??ng");
                columnData.add(statusString);
                
                recordTable.addRow(columnData);
            }
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnFilterCustomerActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel recordTable = (DefaultTableModel)tableUserList.getModel();
        int selectedRows = tableUserList.getSelectedRow();

        try{
            String id = recordTable.getValueAt(selectedRows, 0).toString();
            id = id.replaceAll("\\s+", "");
            boolean deletePermission = false;

            
            int type = this.getUserType(id);

            if (type == 0 || type == 1) {
                deletePermission = true;
            }
            String rsMessage = "B???n kh??ng c?? quy???n x??a t??i kho???n n??y!";
            if (userID.equals(id)) {
                deletePermission = false;
                rsMessage = "B???n kh??ng th??? x??a ch??nh t??i kho???n c???a m??nh";
            }

            if (deletePermission) {
                int deleteItem = JOptionPane.showConfirmDialog(null,"B???n ch???c ch???n mu???n x??a?",
                    "X??a t??i kho???n", JOptionPane.YES_NO_OPTION);
                if (deleteItem ==  JOptionPane.YES_OPTION) {
                    conn = DBInfo.connect();
                    //X??a th??ng tin ng?????i d??ng
                    if (type == 0) {
                        pstmt = conn.prepareStatement("delete from QUANTRIVIEN where MAQTV = ?");
                        pstmt.setString(1, id);
                    }
                    else {
                        pstmt = conn.prepareStatement("delete from NHANVIEN where MANV = ?");
                        pstmt.setString(1, id);
                    }
                    pstmt.executeUpdate();

                    //X??a t??i kho???n ng?????i d??ng
                    pstmt = conn.prepareStatement("delete from TAIKHOAN where MATK = ?");
                    pstmt.setString(1, id);
                    pstmt.executeUpdate();

                    this.btnRefreshActionPerformed(evt);
                    JOptionPane.showMessageDialog(this, "X??a th??nh c??ng!");
                }
            }
            else {
                JOptionPane.showMessageDialog(this, rsMessage);
            }

        } catch(Exception ex){

            JOptionPane.showMessageDialog(null, "C?? l???i x???y ra, x??a kh??ng th??nh c??ng!");
        }
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
            java.util.logging.Logger.getLogger(QTVQuanTriNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QTVQuanTriNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QTVQuanTriNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QTVQuanTriNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QTVQuanTriNguoiDung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDetail;
    private javax.swing.JButton btnFilterAdmin;
    private javax.swing.JButton btnFilterAll;
    private javax.swing.JButton btnFilterCustomer;
    private javax.swing.JButton btnFilterDriver;
    private javax.swing.JButton btnFilterManager;
    private javax.swing.JButton btnFilterPartner;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableUserList;
    private javax.swing.JTextField txtSearchByAccountID;
    // End of variables declaration//GEN-END:variables
}
