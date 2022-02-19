package view;

import control.IOFile;
import control.TrongException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DichVu;
import model.NhanVien;

/**
 *
 * @author phamc
 */
public class Main extends javax.swing.JFrame {
    private List<DichVu> listDV ; 
    private List<NhanVien> listNV ; 
    
    private  DefaultTableModel tblDvu , tblNvien  ; 
    private String fileDV , fileNV ; 
    public Main() {
        initComponents();
        fileDV = "src/model/DV.dat" ; 
        fileNV = "src/model/NV.dat" ; 
        setLocationRelativeTo(null);
        
       String namedvuString[] = new String[]{
           "Ma Dich VU", "Ten Dich Vu", "Nhom Dvu", "Chi phi" ,"Gia Cuoc"  
       } ; 
       String namenvtring[] = new String[]{
           "Ma NV", "Ho ten NV", "Dia chi", "SDien thoai"   
       } ; 
       tblDvu = new DefaultTableModel(namedvuString , 0) ; 
       tblNvien = new DefaultTableModel(namenvtring , 0) ;
       nhanvienTABLE.setModel(tblNvien);
       dvuTABLE.setModel(tblDvu);
        loadDV() ; 
        loadNV() ; 
        showDV(listDV) ; 
        showNV(listNV);
    }
    private void loadDV() { 
        File f = new File(fileDV) ; 
        if(f.exists()){
            listDV = IOFile.doc(fileDV) ; 
        } else {
            listDV = new ArrayList<>() ; 
        }
    }
    private void loadNV() { 
        File f = new File(fileNV) ; 
        if(f.exists()){
            listDV = IOFile.doc(fileNV) ; 
        } else {
            listNV = new ArrayList<>() ; 
        }
    }
    private void showDV(List<DichVu> list){
        tblDvu.setRowCount(0);
        for (DichVu dichVu : list) {
            tblDvu.addRow(dichVu.toObject());
        }
    }
    private void showNV(List<NhanVien> list){
        tblNvien.setRowCount(0);
        for (NhanVien nhanVien : list) {
            tblNvien.addRow(nhanVien.toObject());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dvuTABLE = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        giacuocdvuTXT = new javax.swing.JTextField();
        chiphidvuTXT = new javax.swing.JTextField();
        tendvuTXT = new javax.swing.JTextField();
        nhomdvuBOX = new javax.swing.JComboBox<>();
        themdvuBTN = new javax.swing.JButton();
        xoadvuBTN = new javax.swing.JButton();
        luudvuBTN = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        themnvienBTN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        nhanvienTABLE = new javax.swing.JTable();
        xoanvienBTN1 = new javax.swing.JButton();
        suanvienBTN = new javax.swing.JButton();
        luunvienBTN = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sdtnvienTXT = new javax.swing.JTextField();
        diachinvienTXT = new javax.swing.JTextField();
        tennvienTXT1 = new javax.swing.JTextField();
        madnhavienTXT1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dvuTABLE.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(dvuTABLE);

        jLabel2.setText("Ten Dich Vu");

        jLabel3.setText("Nhom DVu");

        jLabel4.setText("Chi Phi");

        jLabel5.setText("Gia Cuoc");

        giacuocdvuTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giacuocdvuTXTActionPerformed(evt);
            }
        });

        chiphidvuTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiphidvuTXTActionPerformed(evt);
            }
        });

        nhomdvuBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dịch vụ thuê bao trả trước", "Dịch vụ thuê bao trả sau", "Dịch vụ giá trị gia tăng" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(nhomdvuBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(giacuocdvuTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chiphidvuTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tendvuTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 54, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tendvuTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nhomdvuBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(chiphidvuTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(giacuocdvuTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        themdvuBTN.setText("Them");
        themdvuBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themdvuBTNActionPerformed(evt);
            }
        });

        xoadvuBTN.setText("Xoa");
        xoadvuBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoadvuBTNActionPerformed(evt);
            }
        });

        luudvuBTN.setText("Luu Vao Fiile");
        luudvuBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luudvuBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(themdvuBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(xoadvuBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(luudvuBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(375, 375, 375))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themdvuBTN)
                    .addComponent(xoadvuBTN)
                    .addComponent(luudvuBTN))
                .addGap(0, 276, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thong Tin Dich Vu", jPanel1);

        themnvienBTN.setText("Them");
        themnvienBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themnvienBTNActionPerformed(evt);
            }
        });

        nhanvienTABLE.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(nhanvienTABLE);

        xoanvienBTN1.setText("Xoa");
        xoanvienBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoanvienBTN1ActionPerformed(evt);
            }
        });

        suanvienBTN.setText("Sua");
        suanvienBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suanvienBTNActionPerformed(evt);
            }
        });

        luunvienBTN.setText("Luu Vao Fiile");
        luunvienBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luunvienBTNActionPerformed(evt);
            }
        });

        jLabel6.setText("MA nhan vien");

        jLabel7.setText("Ten Nhan Vien");

        jLabel9.setText("Dia chi");

        jLabel10.setText("SDT");

        sdtnvienTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdtnvienTXTActionPerformed(evt);
            }
        });

        diachinvienTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diachinvienTXTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sdtnvienTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(madnhavienTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diachinvienTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tennvienTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 54, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(madnhavienTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tennvienTXT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(diachinvienTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(sdtnvienTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(themnvienBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(xoanvienBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(suanvienBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(luunvienBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(375, 375, 375))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themnvienBTN)
                    .addComponent(xoanvienBTN1)
                    .addComponent(suanvienBTN)
                    .addComponent(luunvienBTN))
                .addGap(0, 273, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thong Tin Nhan Vien", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void giacuocdvuTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giacuocdvuTXTActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_giacuocdvuTXTActionPerformed

    private void chiphidvuTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiphidvuTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chiphidvuTXTActionPerformed

    private void themdvuBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themdvuBTNActionPerformed
        // TODO add your handling code here:
        int  n = listDV.size() ; 
        if(n>0){
            DichVu.setSma(listDV.get(n-1).getMa() + 1);
        }
        String ten , nhom  ; 
        double chiphi , cuoc ; 
        try {
            ten = tendvuTXT.getText() ; 
            nhom = nhomdvuBOX.getSelectedItem().toString() ; 
            chiphi =   Double.parseDouble(chiphidvuTXT.getText()) ; 
            cuoc = Double.parseDouble(giacuocdvuTXT.getText()) ;
            DichVu d = new DichVu(ten , nhom ,chiphi , cuoc) ; 
            tblDvu.addRow(d.toObject());
            listDV.add(d );
            tendvuTXT.setText("");
            nhomdvuBOX.setSelectedIndex(0);
            chiphidvuTXT.setText("");
            giacuocdvuTXT.setText("");
        } catch (TrongException e) {
            JOptionPane.showMessageDialog(this, "Khong de trong");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Nhap Vao So");
        } 
    }//GEN-LAST:event_themdvuBTNActionPerformed

    private void xoadvuBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoadvuBTNActionPerformed
        // TODO add your handling code here:
       int tick = dvuTABLE.getSelectedRow() ; 
       if(tick <0 || tick > dvuTABLE.getRowCount()){
          JOptionPane.showMessageDialog(this, "Chon D Vu");
             return ; 
       }  
       tblDvu.removeRow(tick);
       listDV.remove(tick) ; 
    }//GEN-LAST:event_xoadvuBTNActionPerformed

    private void luudvuBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luudvuBTNActionPerformed
        // TODO add your handling code here:
        IOFile.viet(fileDV, listDV);
    }//GEN-LAST:event_luudvuBTNActionPerformed

    private void themnvienBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themnvienBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_themnvienBTNActionPerformed

    private void xoanvienBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoanvienBTN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xoanvienBTN1ActionPerformed

    private void suanvienBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suanvienBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suanvienBTNActionPerformed

    private void luunvienBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luunvienBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_luunvienBTNActionPerformed

    private void sdtnvienTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdtnvienTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sdtnvienTXTActionPerformed

    private void diachinvienTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diachinvienTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diachinvienTXTActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField chiphidvuTXT;
    private javax.swing.JTextField diachinvienTXT;
    private javax.swing.JTable dvuTABLE;
    private javax.swing.JTextField giacuocdvuTXT;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton luudvuBTN;
    private javax.swing.JButton luunvienBTN;
    private javax.swing.JTextField madnhavienTXT1;
    private javax.swing.JTable nhanvienTABLE;
    private javax.swing.JComboBox<String> nhomdvuBOX;
    private javax.swing.JTextField sdtnvienTXT;
    private javax.swing.JButton suanvienBTN;
    private javax.swing.JTextField tendvuTXT;
    private javax.swing.JTextField tennvienTXT1;
    private javax.swing.JButton themdvuBTN;
    private javax.swing.JButton themnvienBTN;
    private javax.swing.JButton xoadvuBTN;
    private javax.swing.JButton xoanvienBTN1;
    // End of variables declaration//GEN-END:variables
}
