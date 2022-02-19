package view;
import Control.IOFile;
import Control.SoLuongException;
import Control.TrongException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Sach;

public class Quan_Ly_Sach extends javax.swing.JFrame {
    private  boolean them ,sua  ; 
    private  String fileSach ; 
    private  List<Sach> lsach ; 
    DefaultTableModel tbl ; 
    
    public Quan_Ly_Sach() {
        initComponents();
        setLocationRelativeTo(null);
        String namecolString[] = {"Ma sach" , "Ten sach" , "Tac gia" , "Chuyen Nganh" , "So luong"} ;
        tbl = new DefaultTableModel(namecolString, 0) ; 
        sachTABLE.setModel(tbl);
        trangthai(true);
        them = false ; 
        sua = false ; 
        fileSach = "src/model/sach.txt" ; 
        loadData();
    }
    
    private void loadData(){
        File t  = new File(fileSach) ; 
        if(t.exists())
            lsach = IOFile.doc(fileSach);
    }
    private void trangthai(boolean  b){
        themoiBT.setEnabled(b);
        capnhatBT.setEnabled(!b);
        boquaBT.setEnabled(!b);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        themoiBT = new javax.swing.JButton();
        suaBT = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        xoaBT = new javax.swing.JButton();
        hienthiBT = new javax.swing.JButton();
        capnhatBT = new javax.swing.JButton();
        boquaBT = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sachTABLE = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        masachTXT = new javax.swing.JTextField();
        tensachTXT = new javax.swing.JTextField();
        tacgiaTXT = new javax.swing.JTextField();
        chuyennganhBOX = new javax.swing.JComboBox<>();
        soluongTXT = new javax.swing.JTextField();
        luuvaofileBT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        themoiBT.setText("Thêm mới");
        themoiBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themoiBTActionPerformed(evt);
            }
        });

        suaBT.setText("Sửa");
        suaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaBTActionPerformed(evt);
            }
        });

        jButton3.setText("jButton2");

        xoaBT.setText("Xóa");
        xoaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaBTActionPerformed(evt);
            }
        });

        hienthiBT.setText("Hiển Thi");
        hienthiBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hienthiBTActionPerformed(evt);
            }
        });

        capnhatBT.setText("Cập nhật");
        capnhatBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capnhatBTActionPerformed(evt);
            }
        });

        boquaBT.setText("Bỏ qua");
        boquaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boquaBTActionPerformed(evt);
            }
        });

        sachTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        sachTABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sachTABLEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sachTABLE);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );

        jLabel2.setText("Mã Sách:");

        jLabel3.setText("Tên Sách:");

        jLabel4.setText("Tác Giả: ");

        jLabel5.setText("Chuyên Ngành: ");

        jLabel6.setText("Số lượng: ");

        masachTXT.setEditable(false);

        chuyennganhBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Khoa học tự nhiên", "Văn học – Nghệ thuật", "Điện tử Viễn thông", "Công nghệ thông tin" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(masachTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tensachTXT))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tacgiaTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(soluongTXT)
                            .addComponent(chuyennganhBOX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(masachTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tensachTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tacgiaTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(chuyennganhBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(soluongTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(361, Short.MAX_VALUE))
        );

        luuvaofileBT.setText("Lưu Vào File");
        luuvaofileBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luuvaofileBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(capnhatBT, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boquaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(themoiBT, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(suaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(xoaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hienthiBT, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(luuvaofileBT, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(luuvaofileBT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(themoiBT)
                            .addComponent(suaBT)
                            .addComponent(xoaBT))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(capnhatBT)
                            .addComponent(boquaBT)
                            .addComponent(hienthiBT))))
                .addGap(680, 680, 680)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sách", jPanel1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Quản Lý Sách và Người Mượn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void luuvaofileBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luuvaofileBTActionPerformed
        // TODO add your handling code here:
        IOFile.viet(fileSach, lsach);
    }//GEN-LAST:event_luuvaofileBTActionPerformed

    private void sachTABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sachTABLEMouseClicked
        // TODO add your handling code here:
        int row = sachTABLE.getSelectedRow() ;
        tensachTXT.setText(tbl.getValueAt(row, 1).toString());
        masachTXT.setText(tbl.getValueAt(row, 0).toString());
        soluongTXT.setText(tbl.getValueAt(row, 4).toString());
        tacgiaTXT.setText(tbl.getValueAt(row, 2).toString());
        String cn = tbl.getValueAt(row, 3).toString() ;
        for (int i = 0; i < chuyennganhBOX.getItemCount(); i++) {
            if(chuyennganhBOX.getItemAt(i).toString().equals(cn)){
                chuyennganhBOX.setSelectedIndex(i);
                break ;
            }
        }
    }//GEN-LAST:event_sachTABLEMouseClicked

    private void boquaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boquaBTActionPerformed
        // TODO add your handling code here:
        if(them == true)
        them  = false ;
        trangthai(true);
    }//GEN-LAST:event_boquaBTActionPerformed

    private void capnhatBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capnhatBTActionPerformed
        // TODO add your handling code here:
        if(them == true) {
            String tensach , tacgia ;
            int soluong ;
            try {
                tensach  = tensachTXT.getText() ;
                tacgia = tacgiaTXT.getText() ;
                if(tensach.isEmpty() || tacgia.isEmpty()) throw  new  TrongException() ;
                soluong = Integer.parseInt(soluongTXT.getText()) ;
                if(soluong<0) throw new SoLuongException() ;
                int ma = Integer.parseInt(masachTXT.getText()) ;
                Sach t = new Sach(ma, tensach, tacgia, chuyennganhBOX.getSelectedItem().toString(), soluong) ;
                tbl.addRow(t.toObject());
                trangthai(true);
                them  = false ;
                lsach.add(t) ;
            } catch (TrongException t) {
                JOptionPane.showMessageDialog(this, "Khong De Trong !");
                tensachTXT.requestFocus();
            } catch(NumberFormatException t) {
                JOptionPane.showMessageDialog(this, "Nhap SO");
                soluongTXT.requestFocus();
            } catch (SoLuongException t){
                JOptionPane.showMessageDialog(this, "Nhap SO DUONG");
            }
        }
        if(sua == true) {
            int row = sachTABLE.getSelectedRow() ;
            String tensach , tacgia ;
            int soluong ;
            try {
                tensach  = tensachTXT.getText() ;
                tacgia = tacgiaTXT.getText() ;
                if(tensach.isEmpty() || tacgia.isEmpty()) throw  new  TrongException() ;
                soluong = Integer.parseInt(soluongTXT.getText()) ;
                if(soluong<0) throw new SoLuongException() ;
                int ma = Integer.parseInt(masachTXT.getText()) ;
                String cn = chuyennganhBOX.getSelectedItem().toString() ;
                Sach t = new Sach(ma, tensach, tacgia, cn, soluong) ;
                lsach.set(row, t);
                sachTABLE.setValueAt(tensach, row, 1);
                sachTABLE.setValueAt(tacgia, row, 2);
                sachTABLE.setValueAt(soluong, row, 4);
                sachTABLE.setValueAt(cn, row, 3);
                sua = false ;
                trangthai(true);
            } catch (TrongException t) {
                JOptionPane.showMessageDialog(this, "Khong De Trong !");
                tensachTXT.requestFocus();
            } catch(NumberFormatException t) {
                JOptionPane.showMessageDialog(this, "Nhap SO");
                soluongTXT.requestFocus();
            } catch (SoLuongException t){
                JOptionPane.showMessageDialog(this, "Nhap SO DUONG");
            }
        }
    }//GEN-LAST:event_capnhatBTActionPerformed

    private void hienthiBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hienthiBTActionPerformed
        // TODO add your handling code here:
        loadData() ;
        lsach = IOFile.doc(fileSach) ;
        tbl.setRowCount(0);
        for (Sach sach : lsach) {
            tbl.addRow(sach.toObject());
        }
    }//GEN-LAST:event_hienthiBTActionPerformed

    private void xoaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaBTActionPerformed
        // TODO add your handling code here:
        int row = sachTABLE.getSelectedRow();
        if(row<0  || row >sachTABLE.getRowCount()){
            JOptionPane.showMessageDialog(this, "Chon Sach De Xoa");
        } else {
            tbl.removeRow(row);
            lsach.remove(row );
        }
    }//GEN-LAST:event_xoaBTActionPerformed

    private void suaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaBTActionPerformed
        // TODO add your handling code here:
        int row = sachTABLE.getSelectedRow() ;
        if(row < 0 || row > sachTABLE.getRowCount())
        JOptionPane.showMessageDialog(this, "Chon Sach De Sua");
        else  {
            sua = true ;
            trangthai(false);
            tensachTXT.requestFocus();
        }
    }//GEN-LAST:event_suaBTActionPerformed

    private void themoiBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themoiBTActionPerformed
        // TODO add your handling code here:
        trangthai(false);
        them  = true ;
        File t  = new File(fileSach) ;

        if(lsach!=null && lsach.size()>0 ) {
            Sach.setSma(lsach.get(lsach.size() -1 ).getMa_sach() + 1);
        } else{
            lsach = new ArrayList<>() ;
        }

        masachTXT.setText(Sach.getSma()+"") ;
        tensachTXT.requestFocus();
    }//GEN-LAST:event_themoiBTActionPerformed

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
            java.util.logging.Logger.getLogger(Quan_Ly_Sach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quan_Ly_Sach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quan_Ly_Sach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quan_Ly_Sach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quan_Ly_Sach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boquaBT;
    private javax.swing.JButton capnhatBT;
    private javax.swing.JComboBox<String> chuyennganhBOX;
    private javax.swing.JButton hienthiBT;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton luuvaofileBT;
    private javax.swing.JTextField masachTXT;
    private javax.swing.JTable sachTABLE;
    private javax.swing.JTextField soluongTXT;
    private javax.swing.JButton suaBT;
    private javax.swing.JTextField tacgiaTXT;
    private javax.swing.JTextField tensachTXT;
    private javax.swing.JButton themoiBT;
    private javax.swing.JButton xoaBT;
    // End of variables declaration//GEN-END:variables
}
