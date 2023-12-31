/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.Toolkit;
import java.security.NoSuchAlgorithmException;

import javax.swing.JOptionPane;

import dao.NhanVien_DAO;
import entities.NhanVien;
import utilities.MyExtension;

/**
 *
 * @author NguyenThanhLuan
 */
public class GUI_Login extends javax.swing.JFrame {
	private static NhanVien employee;
    /**
     * Creates new form GUI_Login
     */
	public void dangNhap() {
		try {
			String username = txtUser.getText().trim();
			String password = MyExtension.ConvertHashToString(txtPassword.getText().trim());
			NhanVien_DAO nv_dao = new NhanVien_DAO();
			employee = nv_dao.layNhanVien(username);
			if (employee == null) {
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showMessageDialog(null, "Không tìm thấy nhân viên nào có mã vừa nhập");
			} else {
				if (password.equals(employee.getTaiKhoan().getMatKhau().trim())) {
					txtPassword.setText("Không cho phép hiển thị");
					if (employee.getTaiKhoan().getTrangThai().trim().equalsIgnoreCase("Tài khoản đang mở")) {
						if (employee.getChucVu().trim().equalsIgnoreCase("Quản lý nhà thuốc")) {
							GUI_TrangChu_QL ql = new GUI_TrangChu_QL(employee);
							ql.setVisible(true);
							setVisible(false);
						}
						else if (employee.getChucVu().trim().equalsIgnoreCase("Nhân Viên bán thuốc")) {
							GUI_TrangChu_NV nv = new GUI_TrangChu_NV(employee);
							nv.setVisible(true);
							setVisible(false);
						}
					}
				} else {
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(txtPassword, "Mật khẩu bạn nhập chưa đúng", "Cảnh báo",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		 }catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
    public GUI_Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel13.setPreferredSize(new java.awt.Dimension(900, 1));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel13, java.awt.BorderLayout.SOUTH);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 145, 239));
        jLabel1.setText("Sức khỏe Việt");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jPanel3.setPreferredSize(new java.awt.Dimension(449, 572));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background/thuoc-bg.png"))); // NOI18N
        jPanel3.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel5.setBackground(new java.awt.Color(15, 145, 239));
        jPanel5.setPreferredSize(new java.awt.Dimension(1, 572));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5);

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 1, 30));
        jPanel4.setPreferredSize(new java.awt.Dimension(450, 572));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 20, 1));
        jPanel8.setLayout(new java.awt.GridLayout(2, 1));

        jPanel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 20, 1));
        jPanel9.setLayout(new java.awt.GridLayout(3, 1));
        jPanel9.add(jLabel6);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText("User name:");
        jPanel9.add(jLabel5);

        txtUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUser.setText("NV20200001");
        jPanel9.add(txtUser);

        jPanel8.add(jPanel9);

        jPanel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 20, 1));
        jPanel10.setLayout(new java.awt.GridLayout(3, 0));
        jPanel10.add(jLabel7);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel8.setText("Password:");
        jPanel10.add(jLabel8);

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setText("123456");
        jPanel10.add(txtPassword);

        jPanel8.add(jPanel10);

        jPanel4.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.PAGE_AXIS));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Chào mừng đã trở lại!");
        jPanel6.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Hãy đăng nhập để tiếp tục công việc của bạn");
        jPanel6.add(jLabel4);

        jPanel4.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setPreferredSize(new java.awt.Dimension(405, 160));
        jPanel7.setLayout(new java.awt.GridLayout(2, 0));

        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        btnLogin.setBackground(new java.awt.Color(15, 145, 239));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Đăng nhập");
        btnLogin.setPreferredSize(new java.awt.Dimension(180, 45));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel11.add(btnLogin);

        btnCancel.setBackground(new java.awt.Color(15, 145, 239));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Thoát");
        btnCancel.setPreferredSize(new java.awt.Dimension(180, 45));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel11.add(btnCancel);

        jPanel7.add(jPanel11);

        jPanel12.setLayout(new javax.swing.BoxLayout(jPanel12, javax.swing.BoxLayout.LINE_AXIS));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel9.setText("Copyrights 2023. Design By SucKhoeViet");
        jPanel12.add(jLabel9);

        jPanel7.add(jPanel12);

        jPanel4.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jPanel2.add(jPanel4);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        dangNhap();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
