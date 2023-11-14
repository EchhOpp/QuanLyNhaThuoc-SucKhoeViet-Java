/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

/**
 *
 * @author DELL
 */
public class GUI_QuanLiNhanVien extends javax.swing.JPanel {

    /**
     * Creates new form GUI_QuanLiNhanVien
     */
    public GUI_QuanLiNhanVien() {
        initComponents();
        
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
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblMaNV = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lblTen = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        lblCV = new javax.swing.JLabel();
        comBoCV = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        lblDC = new javax.swing.JLabel();
        txtDC = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        lblCMND = new javax.swing.JLabel();
        txtCMND = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        lblGT = new javax.swing.JLabel();
        radNam = new javax.swing.JRadioButton();
        radNu = new javax.swing.JRadioButton();
        jPanel13 = new javax.swing.JPanel();
        lblDT = new javax.swing.JLabel();
        txtDT = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        lblTT = new javax.swing.JLabel();
        comBoTT = new javax.swing.JComboBox<>();
        jPanel14 = new javax.swing.JPanel();
        lblNVL = new javax.swing.JLabel();
        txtNVL = new com.toedter.calendar.JDateChooser();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        lblTim = new javax.swing.JLabel();
        txtTim = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnXoaRong = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Nhân Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(0, 204, 204))); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(960, 300));
        jPanel4.setLayout(new java.awt.GridLayout(0, 2, 20, 0));

        jPanel2.setLayout(new java.awt.GridLayout(6, 1, 0, 5));

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        lblMaNV.setText("Mã Nhân Viên:");
        lblMaNV.setPreferredSize(new java.awt.Dimension(80, 16));
        jPanel3.add(lblMaNV);
        jPanel3.add(txtMaNV);

        jPanel2.add(jPanel3);

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        lblTen.setText("Họ & Tên:");
        lblTen.setPreferredSize(new java.awt.Dimension(80, 16));
        jPanel5.add(lblTen);
        jPanel5.add(txtTen);

        jPanel2.add(jPanel5);

        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        lblEmail.setText("Email:");
        lblEmail.setPreferredSize(new java.awt.Dimension(80, 16));
        jPanel6.add(lblEmail);
        jPanel6.add(txtEmail);

        jPanel2.add(jPanel6);

        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        lblCV.setText("Chức Vụ:");
        lblCV.setPreferredSize(new java.awt.Dimension(80, 16));
        jPanel7.add(lblCV);

        comBoCV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel7.add(comBoCV);

        jPanel2.add(jPanel7);

        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        lblDC.setText("Địa Chỉ:");
        lblDC.setPreferredSize(new java.awt.Dimension(80, 16));
        jPanel8.add(lblDC);
        jPanel8.add(txtDC);

        jPanel2.add(jPanel8);

        jPanel4.add(jPanel2);

        jPanel9.setLayout(new java.awt.GridLayout(6, 1, 0, 5));

        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.LINE_AXIS));

        lblCMND.setText("Số CMND:");
        lblCMND.setPreferredSize(new java.awt.Dimension(80, 16));
        jPanel10.add(lblCMND);
        jPanel10.add(txtCMND);

        jPanel9.add(jPanel10);

        jPanel11.setLayout(new java.awt.GridLayout(1, 2));

        lblGT.setText("Giới Tính:");
        jPanel11.add(lblGT);

        radNam.setText("Nam");
        jPanel11.add(radNam);

        radNu.setText("Nữ");
        jPanel11.add(radNu);

        jPanel9.add(jPanel11);

        jPanel13.setLayout(new javax.swing.BoxLayout(jPanel13, javax.swing.BoxLayout.LINE_AXIS));

        lblDT.setText("Số Điện Thoại:");
        lblDT.setPreferredSize(new java.awt.Dimension(80, 16));
        jPanel13.add(lblDT);
        jPanel13.add(txtDT);

        jPanel9.add(jPanel13);

        jPanel12.setLayout(new javax.swing.BoxLayout(jPanel12, javax.swing.BoxLayout.LINE_AXIS));

        lblTT.setText("Tình Trạng:");
        lblTT.setPreferredSize(new java.awt.Dimension(80, 16));
        jPanel12.add(lblTT);

        comBoTT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel12.add(comBoTT);

        jPanel9.add(jPanel12);

        jPanel14.setLayout(new javax.swing.BoxLayout(jPanel14, javax.swing.BoxLayout.LINE_AXIS));

        lblNVL.setText("Ngày Vào Làm:");
        jPanel14.add(lblNVL);
        jPanel14.add(txtNVL);

        jPanel9.add(jPanel14);

        jPanel4.add(jPanel9);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel15.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Nhân Viên", "Họ & Tên", "Số CMND", "Email", "Giới Tính", "Số Điện Thoại", "Chức Vụ", "Tình trạng", "Ngày Vào Làm", "Địa chỉ"
            }
        ));
        jTable1.setMinimumSize(new java.awt.Dimension(200, 100));
        jScrollPane1.setViewportView(jTable1);

        jPanel15.add(jScrollPane1, java.awt.BorderLayout.PAGE_START);

        add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel17.setLayout(new java.awt.BorderLayout());
        jPanel17.add(jPanel20, java.awt.BorderLayout.PAGE_END);
        jPanel17.add(jPanel16, java.awt.BorderLayout.NORTH);

        jPanel19.setPreferredSize(new java.awt.Dimension(50, 100));

        lblTim.setText("Nhập mã Nhân Viên cần tìm:");
        jPanel19.add(lblTim);

        txtTim.setMinimumSize(new java.awt.Dimension(150, 22));
        txtTim.setPreferredSize(new java.awt.Dimension(150, 22));
        txtTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimActionPerformed(evt);
            }
        });
        jPanel19.add(txtTim);

        btnTim.setBackground(new java.awt.Color(0, 204, 204));
        btnTim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTim.setForeground(new java.awt.Color(255, 255, 255));
        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search.png"))); // NOI18N
        btnTim.setText("Tìm");
        jPanel19.add(btnTim);

        jPanel17.add(jPanel19, java.awt.BorderLayout.CENTER);

        jPanel21.setMinimumSize(new java.awt.Dimension(100, 26));
        jPanel21.setLayout(new javax.swing.BoxLayout(jPanel21, javax.swing.BoxLayout.X_AXIS));

        btnThem.setBackground(new java.awt.Color(0, 204, 204));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        jPanel21.add(btnThem);

        btnXoa.setBackground(new java.awt.Color(0, 204, 204));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Remove.png"))); // NOI18N
        btnXoa.setText("Xóa");
        jPanel21.add(btnXoa);

        btnXoaRong.setBackground(new java.awt.Color(0, 204, 204));
        btnXoaRong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaRong.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaRong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/RemoveChar.png"))); // NOI18N
        btnXoaRong.setText("Xóa Rỗng");
        jPanel21.add(btnXoaRong);

        btnSua.setBackground(new java.awt.Color(0, 204, 204));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Change.png"))); // NOI18N
        btnSua.setText("Sửa");
        jPanel21.add(btnSua);

        btnLuu.setBackground(new java.awt.Color(0, 204, 204));
        btnLuu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLuu.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.setToolTipText("");
        jPanel21.add(btnLuu);

        jPanel17.add(jPanel21, java.awt.BorderLayout.EAST);

        add(jPanel17, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaRong;
    private javax.swing.JComboBox<String> comBoCV;
    private javax.swing.JComboBox<String> comBoTT;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCMND;
    private javax.swing.JLabel lblCV;
    private javax.swing.JLabel lblDC;
    private javax.swing.JLabel lblDT;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGT;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblNVL;
    private javax.swing.JLabel lblTT;
    private javax.swing.JLabel lblTen;
    private javax.swing.JLabel lblTim;
    private javax.swing.JRadioButton radNam;
    private javax.swing.JRadioButton radNu;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtDC;
    private javax.swing.JTextField txtDT;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaNV;
    private com.toedter.calendar.JDateChooser txtNVL;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTim;
    // End of variables declaration//GEN-END:variables
}
