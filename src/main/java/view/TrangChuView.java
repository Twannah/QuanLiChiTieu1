/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

//import DAO.QlctDao;
//import model.QLChi_Tieu;
import java.awt.Component;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.QLCT;
import model.QLCTXML;
import view.chinhsuaView;



/**
 *
 * @author ADMIN
 */
public class TrangChuView extends javax.swing.JFrame {

    
    
    private QLCTXML qlctxml;
    private int selectIndex;
    private List<QLCT> ls;
    private DefaultTableModel tblModel;
    
    public int getLength(){
        return ls.size()+1;
   }
    public int getID(){
        return this.selectIndex;
    }
    
    public TrangChuView() {
    setLocationRelativeTo(null);
    ls = new ArrayList<>();
    qlctxml = new QLCTXML();
    ls = qlctxml.docqlct(); // Đọc thông tin từ tệp qlct.xml và gán vào danh sách ls
    initComponents();
    this.setLocationRelativeTo(null);
    tblModel = (DefaultTableModel) tblKetqua.getModel();
    this.setTitle("Trang chủ");

    // Hiển thị thông tin từ danh sách ls lên bảng
    if (ls != null && !ls.isEmpty()) {
        for (QLCT qlct : ls) {
            tblModel.addRow(new Object[]{qlct.getId(), qlct.getNgay(), qlct.getNoidung(), qlct.getNguon(), qlct.getSoTien()});
        }
    }
}

 
    public void showData(){
        tblModel.setRowCount(0);
        for(QLCT qlct : ls){
            tblModel.addRow(new Object[]{qlct.getId(), qlct.getNgay(),
            qlct.getNoidung(), qlct.getNguon(), qlct.getSoTien()});
        }
    }
     public void addQL(QLCT ql){
        ls.add(ql); // them quan ly moi vao danh sach
        try {
            // Ghi dữ liệu mới vào tệp tin qlct.xml sau khi sửa
            qlctxml.ghi(ls);
        } catch (IOException ex) {
            Logger.getLogger(TrangChuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        showData();
    }
    

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tbnTimKiem = new javax.swing.JButton();
        tbnThoat = new javax.swing.JButton();
        tbnThem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKetqua = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnThongke = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbboxThuChi2 = new javax.swing.JComboBox<>();
        btnsort = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txttimkiem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        cbboxLoaiLoc = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("QUẢN  LÝ THU CHI CÁ NHÂN");

        tbnTimKiem.setIcon(new javax.swing.ImageIcon("D:\\DATA\\New folder\\ChiTieu\\ChiTieu\\src\\main\\resources\\icon\\find20px.png")); // NOI18N
        tbnTimKiem.setText("Tìm kiếm");
        tbnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnTimKiemActionPerformed(evt);
            }
        });

        tbnThoat.setIcon(new javax.swing.ImageIcon("D:\\DATA\\New folder\\ChiTieu\\ChiTieu\\src\\main\\resources\\icon\\exit_20px.png")); // NOI18N
        tbnThoat.setText("Thoát");
        tbnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnThoatActionPerformed(evt);
            }
        });

        tbnThem.setIcon(new javax.swing.ImageIcon("D:\\DATA\\New folder\\ChiTieu\\ChiTieu\\src\\main\\resources\\icon\\new1_20px.png")); // NOI18N
        tbnThem.setText("Thêm mới");
        tbnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnThemActionPerformed(evt);
            }
        });

        tblKetqua.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Ngày", "Nội dung", "Nguồn", "Số tiền"
            }
        ));
        jScrollPane1.setViewportView(tblKetqua);

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new_20px.png"))); // NOI18N
        btnEdit.setText("Sửa ");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete20px.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnThongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/thongke20px.png"))); // NOI18N
        btnThongke.setText("Thống kê");
        btnThongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongkeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Nội dung:");

        cbboxThuChi2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Thu", "Chi" }));
        cbboxThuChi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbboxThuChi2ActionPerformed(evt);
            }
        });

        btnsort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Tên", "Thời gian", "Số tiền", "STT" }));
        btnsort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsortActionPerformed(evt);
            }
        });

        jLabel2.setText("Tìm kiếm");

        txttimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimkiemActionPerformed(evt);
            }
        });

        jLabel3.setText("Sắp xếp:");

        jLabel4.setText("Lọc:");

        cbboxLoaiLoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Thu", "Chi" }));
        cbboxLoaiLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbboxLoaiLocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbboxThuChi2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(77, 77, 77)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnsort, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78)
                                        .addComponent(jLabel4)
                                        .addGap(29, 29, 29)
                                        .addComponent(cbboxLoaiLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 10, Short.MAX_VALUE))
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tbnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tbnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnThongke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tbnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tbnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addGap(12, 12, 12)
                        .addComponent(btnThongke, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnEdit)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbboxThuChi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnsort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbboxLoaiLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnTimKiem)
                    .addComponent(jLabel2)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbnThoat))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_tbnThoatActionPerformed

    private void tbnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnThemActionPerformed
      // TODO add your handling code here:
      themthongtinView add = new themthongtinView(this,true);
      add.setVisible(true);
    }//GEN-LAST:event_tbnThemActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
            // TODO add your handling code here:
    selectIndex = tblKetqua.getSelectedRow();
        if (ls.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Danh sách quản lý thu chi đang trống. Hãy thêm quản lý trước khi sửa!");
        } else if (selectIndex == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn một dòng có quản lý thu chi để sửa!");
        } else {
            // Lấy dữ liệu từ dòng đã chọn và hiển thị trong giao diện sửa
            QLCT selectedQLCT = ls.get(selectIndex);
            chinhsuaView edit = new chinhsuaView(this, rootPaneCheckingEnabled);
            edit.setEditData(selectedQLCT);
            edit.setVisible(true);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
                // TODO add your handling code here:
        int removeIndex = tblKetqua.getSelectedRow();
        if (removeIndex == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn một dòng rồi nhấn nút xóa");
        } else if (ls.size() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Không có lựa chọn để xóa");
        } else {
            ls.remove(removeIndex);
            // Cập nhật lại số thứ tự (STT)
            for (int i = 0; i < ls.size(); i++) {
                ls.get(i).setId(i + 1);
            }
            try {
                // Ghi dữ liệu mới vào tệp qlct.xml sau khi xóa
                qlctxml.ghi(ls);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane, "Lỗi khi cập nhật tệp qlct.xml sau khi xóa");
            }
            showData(); // Cập nhật hiển thị của bảng
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tbnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnTimKiemActionPerformed
                                            
    // Lấy thông tin cần tìm kiếm từ các thành phần giao diện người dùng
    String ngayStr = txttimkiem.getText().trim();
    String nguon = txttimkiem.getText().trim();

// Kiểm tra kiểu tìm kiếm (theo ngày hoặc theo nội dung)
if (!ngayStr.isEmpty()) {
    // Tìm kiếm theo ngày
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate ngay = LocalDate.parse(ngayStr, formatter);
    
    // Thực hiện tìm kiếm trong danh sách thông tin theo ngày
    List<QLCT> ketqua = new ArrayList<>();
    for (QLCT ql : ls) {
        if (ql.getNgay().isEqual(ngay)) {
            ketqua.add(ql);
        }
    }
    
    // Hiển thị kết quả lên bảng
    updateTable(ketqua);
    
    // Kiểm tra nếu không có kết quả
    if (ketqua.isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "Không tìm thấy kết quả nào.");
    }
} else if (!nguon.isEmpty()) {
    // Tìm kiếm theo nội dung (nguồn)
    List<QLCT> ketqua = new ArrayList<>();
    for (QLCT ql : ls) {
        if (ql.getNguon().equalsIgnoreCase(nguon)) {
            ketqua.add(ql);
        }
    }
    
    // Hiển thị kết quả lên bảng
    updateTable(ketqua);
    
    // Kiểm tra nếu không có kết quả
    if (ketqua.isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "Không tìm thấy kết quả nào.");
    }
} else {
    JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập thông tin cần tìm kiếm.");
}

}
// Hàm cập nhật bảng
private void updateTable(List<QLCT> ketqua) {
    // Xóa toàn bộ dòng trong bảng
    DefaultTableModel model = (DefaultTableModel) tblKetqua.getModel();
    model.setRowCount(0);
    
    // Thêm kết quả tìm kiếm vào bảng
    for (QLCT ql : ketqua) {
        Object[] row = {ql.getId(), ql.getNguon(), ql.getSoTien(), ql.getNgay(), ql.getNoidung()};
        model.addRow(row);
    }
    }//GEN-LAST:event_tbnTimKiemActionPerformed

    private void btnThongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongkeActionPerformed
        double tongThu =0.0;
        double tongChi = 0.0;
        
        for(QLCT ql : ls){
            if(ql.getNoidung().equals("Thu")){
               tongThu += ql.getSoTien();
            } else if(ql.getNoidung().equals("Chi")){
                tongChi += ql.getSoTien();
            }
        }
        
        if (tongChi > tongThu) {
            double canhBao = tongChi - tongThu;
            JOptionPane.showMessageDialog(this, "Cảnh báo: Bạn đang chi tiêu vượt quá số tiền thu. Vui lòng tiết kiệm!\n" +
            "Tổng thu: " + tongThu + "\nTổng chi: " + tongChi + "\nChênh lệch: " + canhBao, "Cảnh báo thu chi", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Tổng thu: " + tongThu + "\nTổng chi: " + tongChi, "Thống kê thu chi", JOptionPane.INFORMATION_MESSAGE);
        } 
    }//GEN-LAST:event_btnThongkeActionPerformed

    private void cbboxThuChi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbboxThuChi2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cbboxThuChi2ActionPerformed

    private void btnsortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsortActionPerformed
      String selectedOption = btnsort.getSelectedItem().toString(); // Lấy lựa chọn từ ComboBox

    if (selectedOption.equals("Tên")) {
        // Sắp xếp theo tên
        Collections.sort(ls, new Comparator<QLCT>() {
            @Override
            public int compare(QLCT ql1, QLCT ql2) {
                return ql1.getNguon().compareTo(ql2.getNguon());
            }
        });
    } else if (selectedOption.equals("Thời gian")) {
        // Sắp xếp theo thời gian
        Collections.sort(ls, new Comparator<QLCT>() {
            @Override
            public int compare(QLCT ql1, QLCT ql2) {
                return ql1.getNgay().compareTo(ql2.getNgay());
            }
        });
    } else if (selectedOption.equals("Số tiền")) {
        // Sắp xếp theo số tiền
        Collections.sort(ls, new Comparator<QLCT>() {
            @Override
            public int compare(QLCT ql1, QLCT ql2) {
                return Double.compare(ql1.getSoTien(), ql2.getSoTien());
            }
        });
    } else if (selectedOption.equals("STT")) {
        // Sắp xếp theo ID
        Collections.sort(ls, new Comparator<QLCT>() {
            @Override
            public int compare(QLCT ql1, QLCT ql2) {
                return Integer.compare(ql1.getId(), ql2.getId());
            }
        });
    }

    // Cập nhật hiển thị trên bảng
    showData();
    }//GEN-LAST:event_btnsortActionPerformed

    private void txttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttimkiemActionPerformed

    private void cbboxLoaiLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbboxLoaiLocActionPerformed
        // TODO add your handling code here:
         // Lấy loại lọc từ người dùng (Chi hoặc Thu)
    String loaiLoc = cbboxLoaiLoc.getSelectedItem().toString();
    
    // Khởi tạo danh sách để lưu kết quả lọc
    List<QLCT> ketqua = new ArrayList<>();
    
    if(loaiLoc.equals("Tất cả")){
        showData();
    } else {
        for (QLCT ql : ls) {
            if (loaiLoc.equals("Chi") && ql.getNoidung().equalsIgnoreCase("Chi")) {
                ketqua.add(ql);
            } else if (loaiLoc.equals("Thu") && ql.getNoidung().equalsIgnoreCase("Thu")) {
                ketqua.add(ql);
            }
        }
        UpdateTable(ketqua);
    }
    // Lọc thông tin theo loại lọc được chọn
   
    
    // Hiển thị kết quả lên bảng
   
    }//GEN-LAST:event_cbboxLoaiLocActionPerformed

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
            java.util.logging.Logger.getLogger(TrangChuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnThongke;
    private javax.swing.JComboBox<String> btnsort;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbboxLoaiLoc;
    private javax.swing.JComboBox<String> cbboxThuChi2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tblKetqua;
    private javax.swing.JButton tbnThem;
    private javax.swing.JButton tbnThoat;
    private javax.swing.JButton tbnTimKiem;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables

   public void updateQl(QLCT ct) {
        ls.remove(selectIndex);
        this.addQL(ct);
        showData(); //     Cập nhật hiển thị của bảng

        try {
            // Ghi dữ liệu mới vào tệp tin qlct.xml sau khi sửa
            qlctxml.ghi(ls);
        } catch (IOException ex) {
            Logger.getLogger(TrangChuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    private void UpdateTable(List<QLCT> ls) {
    DefaultTableModel model = (DefaultTableModel) tblKetqua.getModel();
    model.setRowCount(0);
    
    // Thêm kết quả lọc vào bảng
        for (QLCT ql : ls) {
            Object[] row = {ql.getId(), ql.getNguon(), ql.getSoTien(), ql.getNgay(), ql.getNoidung()};
            model.addRow(row);
        }
    }


}
