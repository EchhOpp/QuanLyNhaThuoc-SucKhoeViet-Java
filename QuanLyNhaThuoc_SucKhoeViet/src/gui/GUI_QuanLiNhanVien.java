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
        lblMa = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        lblCMND = new javax.swing.JLabel();
        txtCMND = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblGT = new javax.swing.JLabel();
        radNam = new javax.swing.JRadioButton();
        radNu = new javax.swing.JRadioButton();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblDT = new javax.swing.JLabel();
        txtDT = new javax.swing.JTextField();
        lblNVL = new javax.swing.JLabel();
        txtNVL = new javax.swing.JTextField();
        lblCV = new javax.swing.JLabel();
        cbCV = new javax.swing.JComboBox<>();
        lblTT = new javax.swing.JLabel();
        cbTT = new javax.swing.JComboBox<>();
        lblDC = new javax.swing.JLabel();
        txtDC = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblTim = new javax.swing.JLabel();
        txtTim = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnXoaT = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Nhân Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 200));

        lblMa.setText("Mã Nhân Viên:");

        txtMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaActionPerformed(evt);
            }
        });

        lblCMND.setText("Số CMND:");

        lblName.setText("Họ và Tên:");

        lblGT.setText("Giới Tính:");

        radNam.setText("Nam");

        radNu.setText("Nữ");

        lblEmail.setText("Email:");

        lblDT.setText("Số Điện Thoại:");

        lblNVL.setText("Ngày vào làm:");

        lblCV.setText("Chức vụ:");

        cbCV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCV.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCVItemStateChanged(evt);
            }
        });
        cbCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCVActionPerformed(evt);
            }
        });

        lblTT.setText("Tình Trạng:");

        cbTT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblDC.setText("Địa chỉ:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDC)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMa)
                                    .addComponent(lblName)
                                    .addComponent(lblEmail))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNVL)
                                    .addComponent(lblCV))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNVL, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDC, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbCV, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCMND)
                            .addComponent(lblGT)
                            .addComponent(lblDT)
                            .addComponent(lblTT))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radNam)
                                .addGap(60, 60, 60)
                                .addComponent(radNu))
                            .addComponent(txtDT, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTT, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(305, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMa)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCMND)
                    .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGT)
                    .addComponent(radNam)
                    .addComponent(radNu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDT)
                    .addComponent(txtDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNVL)
                    .addComponent(txtNVL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCV)
                    .addComponent(cbCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTT)
                    .addComponent(cbTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDC)
                    .addComponent(txtDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chọn Tác Vụ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblTim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTim.setForeground(new java.awt.Color(255, 51, 0));
        lblTim.setText("Mã nhân viên cần tìm:");

        txtTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimActionPerformed(evt);
            }
        });

        btnTim.setBackground(new java.awt.Color(255, 0, 0));
        btnTim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTim.setForeground(new java.awt.Color(255, 255, 255));
        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search.png"))); // NOI18N
        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(255, 51, 0));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 51, 0));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Remove.png"))); // NOI18N
        btnXoa.setText("Xóa");

        btnXoaT.setBackground(new java.awt.Color(255, 51, 0));
        btnXoaT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoaT.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/RemoveChar.png"))); // NOI18N
        btnXoaT.setText("Xóa Trắng");

        btnLuu.setBackground(new java.awt.Color(255, 51, 0));
        btnLuu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLuu.setForeground(new java.awt.Color(242, 242, 242));
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save.png"))); // NOI18N
        btnLuu.setText("Lưu");

        btnSua.setBackground(new java.awt.Color(255, 51, 0));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Change.png"))); // NOI18N
        btnSua.setText("Sửa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTim)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(92, 92, 92)
                .addComponent(btnThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoaT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLuu)
                .addContainerGap(216, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTim)
                    .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTim)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnXoaT)
                    .addComponent(btnLuu)
                    .addComponent(btnSua))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        add(jPanel2, java.awt.BorderLayout.SOUTH);

        JTable.setModel(new javax.swing.table.DefaultTableModel(
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
                "STT", "Mã Nhân Viên", "Số CMND", "Họ và Tên", "Giới tính", "Email", "Số Điện Thoại", "Ngày vào làm", "Chức vụ", "Tình trạng", "Địa chỉ"
            }
        ));
        jScrollPane1.setViewportView(JTable);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaActionPerformed

    private void cbCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCVActionPerformed

    private void cbCVItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCVItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCVItemStateChanged

    private void txtTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaT;
    private javax.swing.JComboBox<String> cbCV;
    private javax.swing.JComboBox<String> cbTT;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCMND;
    private javax.swing.JLabel lblCV;
    private javax.swing.JLabel lblDC;
    private javax.swing.JLabel lblDT;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGT;
    private javax.swing.JLabel lblMa;
    private javax.swing.JLabel lblNVL;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTT;
    private javax.swing.JLabel lblTim;
    private javax.swing.JRadioButton radNam;
    private javax.swing.JRadioButton radNu;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtDC;
    private javax.swing.JTextField txtDT;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtNVL;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTim;
    // End of variables declaration//GEN-END:variables
}
