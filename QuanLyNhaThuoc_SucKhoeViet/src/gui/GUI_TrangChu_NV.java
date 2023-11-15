/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenuItem;

import entities.NhanVien;

/**
 *
 * @author NguyenThanhLuan
 */
public class GUI_TrangChu_NV extends javax.swing.JFrame {
	private GUI_NhapThuoc gui_NhapThuoc;
	private GUI_TT gui_BTN;
	private GUI_TaoHoaDon guiTaoHoaDon;
    private GUI_QuanLiKhachHang gui_quanLiKhachHang;
    private GUI_QuanLiNhanVien gui_quanLiNhanVien;
    private GUI_TimKiemHoaDon gui_TimKiemHoaDon;
    private GUI_TimKiemThuoc gui_TimKiemThuoc;
    private GUI_DanhSachNhapThuoc gui_DanhSachNhapThuoc;
    private GUI_QuanLiNhaCungCap gui_QuanLiNhaCungCap;
    private GUI_QuanLiThongKe gui_QuanLiThongKe;
	private NhanVien emp;
    /**
     * Creates new form GUI_TrangChu
     */
    public GUI_TrangChu_NV(NhanVien nv) {
        initComponents();
        emp = nv;
        gui_BTN = new GUI_TT(emp);
        this.PnlChuyenHuong.add(gui_BTN);
        gui_NhapThuoc = new GUI_NhapThuoc();
        guiTaoHoaDon =  new GUI_TaoHoaDon(emp);
        gui_quanLiKhachHang = new GUI_QuanLiKhachHang();
        gui_quanLiNhanVien = new GUI_QuanLiNhanVien();
        gui_TimKiemHoaDon = new GUI_TimKiemHoaDon();
        gui_TimKiemThuoc = new GUI_TimKiemThuoc();
        gui_DanhSachNhapThuoc = new GUI_DanhSachNhapThuoc();
        gui_QuanLiNhaCungCap = new GUI_QuanLiNhaCungCap();
        gui_QuanLiThongKe = new GUI_QuanLiThongKe();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlChuyenHuong = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnDangXuat = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        jMenuBar1 = new javax.swing.JMenuBar();
        menuTT = new javax.swing.JMenu();
        menuHD = new javax.swing.JMenu();
        menuTaoHD = new javax.swing.JMenuItem();
        menuXemDSHD = new javax.swing.JMenuItem();
        menuSP = new javax.swing.JMenu();
        menuDanhSachThuoc = new javax.swing.JMenuItem();
        menuKH = new javax.swing.JMenu();
        ql = new javax.swing.JMenuItem();
        menuTK = new javax.swing.JMenu();
        menuQuanLiTK = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlChuyenHuong.setBackground(new java.awt.Color(255, 255, 255));
        PnlChuyenHuong.setLayout(new java.awt.BorderLayout());
        getContentPane().add(PnlChuyenHuong, java.awt.BorderLayout.CENTER);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel5.setMinimumSize(new java.awt.Dimension(222, 52));
        jPanel5.setPreferredSize(new java.awt.Dimension(302, 52));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 5));

        btnDangXuat.setBackground(new java.awt.Color(15, 145, 239));
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setMargin(new java.awt.Insets(1, 14, 1, 14));
        btnDangXuat.setPreferredSize(new java.awt.Dimension(120, 40));
        jPanel5.add(btnDangXuat);

        btnThoat.setBackground(new java.awt.Color(15, 145, 239));
        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("Thoát");
        btnThoat.setMargin(new java.awt.Insets(1, 14, 1, 14));
        btnThoat.setPreferredSize(new java.awt.Dimension(120, 40));
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jPanel5.add(btnThoat);
        jPanel5.add(filler1);

        getContentPane().add(jPanel5, java.awt.BorderLayout.SOUTH);

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenuBar1.setMargin(new java.awt.Insets(0, 8, 0, 8));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(23941, 50));

        menuTT.setForeground(new java.awt.Color(15, 145, 239));
        menuTT.setText("Trang chủ");
        menuTT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuTT.setMargin(new java.awt.Insets(3, 10, 3, 10));
        menuTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTTActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuTT);

        menuHD.setForeground(new java.awt.Color(15, 145, 239));
        menuHD.setText("Hóa đơn");
        menuHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuHD.setMargin(new java.awt.Insets(3, 10, 3, 10));

        menuTaoHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuTaoHD.setText("Tạo hóa đơn");
        menuTaoHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTaoHDActionPerformed(evt);
            }
        });
        menuHD.add(menuTaoHD);

        menuXemDSHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuXemDSHD.setText("Xem danh sách hóa đơn");
        menuXemDSHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuXemDSHDActionPerformed(evt);
            }
        });
        menuHD.add(menuXemDSHD);

        jMenuBar1.add(menuHD);

        menuSP.setForeground(new java.awt.Color(15, 145, 239));
        menuSP.setText("Sản phẩm");
        menuSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuSP.setMargin(new java.awt.Insets(3, 10, 3, 10));

        menuDanhSachThuoc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuDanhSachThuoc.setText("Xem danh sách thuốc");
        menuDanhSachThuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDanhSachThuocActionPerformed(evt);
            }
        });
        menuSP.add(menuDanhSachThuoc);

        jMenuBar1.add(menuSP);

        menuKH.setForeground(new java.awt.Color(15, 145, 239));
        menuKH.setText("Khách hàng");
        menuKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuKH.setMargin(new java.awt.Insets(3, 10, 3, 10));
        menuKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKHActionPerformed(evt);
            }
        });

        ql.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ql.setText("Thông tin khách hàng");
        ql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qlActionPerformed(evt);
            }
        });
        menuKH.add(ql);

        jMenuBar1.add(menuKH);

        menuTK.setForeground(new java.awt.Color(15, 145, 239));
        menuTK.setText("Thống kê");
        menuTK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuTK.setMargin(new java.awt.Insets(3, 10, 3, 10));
        menuTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTKActionPerformed(evt);
            }
        });

        menuQuanLiTK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuQuanLiTK.setText("Quản lí thông kê");
        menuQuanLiTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuQuanLiTKActionPerformed(evt);
            }
        });
        menuTK.add(menuQuanLiTK);

        jMenuBar1.add(menuTK);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
	public void clearSelectedMenu() {
		menuTT.setSelected(false);
		menuHD.setSelected(false);
		menuSP.setSelected(false);
		menuKH.setSelected(false);
		menuTK.setSelected(false);
	}
    
	public void thayDoiPanelChinh(JComponent component, JMenuItem menu) {
		clearSelectedMenu();
		menu.setSelected(true);
		this.PnlChuyenHuong.removeAll();
		this.PnlChuyenHuong.repaint();
		this.PnlChuyenHuong.revalidate();

		this.PnlChuyenHuong.add(component);
		this.PnlChuyenHuong.repaint();
		this.PnlChuyenHuong.revalidate();
	}
	
	
    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void menuTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTTActionPerformed
    	this.thayDoiPanelChinh(gui_BTN, menuTT);
    }//GEN-LAST:event_menuTTActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
    	this.thayDoiPanelChinh(gui_BTN, menuTT);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnNhapThuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapThuocActionPerformed
    	this.thayDoiPanelChinh(gui_NhapThuoc, menuSP);
    }//GEN-LAST:event_btnNhapThuocActionPerformed
    
    private void menuTaoHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTaoHDActionPerformed
    	this.thayDoiPanelChinh(guiTaoHoaDon, menuHD);
    }//GEN-LAST:event_menuTaoHDActionPerformed

    private void menuSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSPActionPerformed

    private void menuDanhSachThuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDanhSachThuocActionPerformed
    	this.thayDoiPanelChinh(gui_TimKiemThuoc, menuSP);
    }//GEN-LAST:event_menuDanhSachThuocActionPerformed

    private void menuXemDSHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuXemDSHDActionPerformed
        this.thayDoiPanelChinh(gui_TimKiemHoaDon, menuHD);
    }//GEN-LAST:event_menuXemDSHDActionPerformed

    private void menuKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKHActionPerformed
        
    }//GEN-LAST:event_menuKHActionPerformed
     
    private void qlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qlActionPerformed
      this.thayDoiPanelChinh(gui_quanLiKhachHang, menuKH);
    }//GEN-LAST:event_qlActionPerformed

    private void menuTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTKActionPerformed
      
    }//GEN-LAST:event_menuTKActionPerformed

    private void menuQuanLiTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuQuanLiTKActionPerformed
         this.thayDoiPanelChinh(gui_QuanLiThongKe, menuTK);
    }//GEN-LAST:event_menuQuanLiTKActionPerformed


    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlChuyenHuong;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnThoat;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JMenuItem menuDanhSachThuoc;
    private javax.swing.JMenu menuHD;
    private javax.swing.JMenu menuKH;
    private javax.swing.JMenuItem menuQuanLiTK;
    private javax.swing.JMenu menuSP;
    private javax.swing.JMenu menuTK;
    private javax.swing.JMenu menuTT;
    private javax.swing.JMenuItem menuTaoHD;
    private javax.swing.JMenuItem menuXemDSHD;
    private javax.swing.JMenuItem ql;
    // End of variables declaration//GEN-END:variables
}
