//package view;
//
//import control.DienThoaiEX;
//import control.IOFile;
//import control.KhongTrongEX;
//import control.NgayThang;
//import control.SoDuongEx;
//import java.io.File;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Date;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;
//import model.DangKy;
//import model.GiangVien;
//import model.MonHoc;
//
///**
// *
// * @author phamc
// */
//public class MainGVMH extends javax.swing.JFrame {
//    private String filemonhoc , fileGV  ,fileDK ; 
//    List<MonHoc> lmonhoc  ; 
//    List<GiangVien> lgiangvien  ; 
//    List<DangKy> ldangky  ; 
//    DefaultTableModel tbl1 , tbl2,tbl3 ; 
//    public MainGVMH() {
//        initComponents();
//        setLocationRelativeTo(this);
//        
//        String colum1[] = {"Ma" , "Ten Mon" , "So Tiet" , "Loai Mon"} ; 
//        tbl1 = new DefaultTableModel(colum1, 0) ; 
//        jTable1.setModel(tbl1);
//        filemonhoc = "src/MH.dat" ; 
//        String colum2[] = {"Ma" , "Ho Ten" , "SoDt" , "Email" , "KHoa"} ; 
//        tbl2 = new DefaultTableModel(colum2, 0) ; 
//        jTable2.setModel(tbl2);
//        fileGV = "src/GV.dat" ; 
//        String colum3[] = {"Ma mon hoc" , "Ten Mon" , "Ma Giang Vien" , "Ten Giang Vien" , "So lop" , "Ngay Dang Ky"} ; 
//        tbl3 = new DefaultTableModel(colum3, 0) ; 
//        jTable3.setModel(tbl3);
//        fileDK = "src/DKMH.dat" ; 
//        
//        loaddata() ; 
//        load2ma() ; 
//    }
//    private void loaddata(){
//        File t1 = new File(filemonhoc) ; 
//        if(t1.exists()){
//            lmonhoc = IOFile.doc(filemonhoc) ; 
//            tbl1.setRowCount(0);
//            for (MonHoc i : lmonhoc) {
//                tbl1.addRow(i.tobObject());
//            }
//        }else {
//            lmonhoc = new ArrayList<>() ; 
//        }
//        File t2 = new File(fileGV) ; //copy duoc
//        if(t2.exists()){
//            lgiangvien = IOFile.doc(fileGV) ; 
//            tbl2.setRowCount(0);
//            for (GiangVien i : lgiangvien) {
//                tbl2.addRow(i.tobObject());
//            }
//        }else {
//            lgiangvien = new ArrayList<>() ; 
//        }
//        File t3 = new File(fileDK) ; 
//        if(t3.exists()){
//            ldangky = IOFile.doc(fileDK) ; 
//            tbl3.setRowCount(0);
//            for (DangKy i : ldangky) {
//                tbl3.addRow(i.tobObject());
//            }
//        }else {
//            ldangky = new ArrayList<>() ; 
//        }
//    
//    }
//    private void load2ma(){
//        List<MonHoc> l1 = IOFile.doc(filemonhoc) ; 
//        jComboBox3.removeAllItems();
//        for (MonHoc monHoc : l1) {
//            jComboBox3.addItem(monHoc.getMamh()+"");
//        }
//        List<GiangVien> l2 = IOFile.doc(fileGV) ;  //copy duoc
//        jComboBox4.removeAllItems();
//        for (GiangVien monHoc : l2) {
//            jComboBox4.addItem(monHoc.getMagv()+"");
//        }
//    }
//    
//    @SuppressWarnings("unchecked")
//    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
//    private void initComponents() {
//
//        buttonGroup1 = new javax.swing.ButtonGroup();
//        jTabbedPane1 = new javax.swing.JTabbedPane();
//        jPanel1 = new javax.swing.JPanel();
//        jScrollPane1 = new javax.swing.JScrollPane();
//        jTable1 = new javax.swing.JTable();
//        jLabel1 = new javax.swing.JLabel();
//        jTextField1 = new javax.swing.JTextField();
//        jTextField2 = new javax.swing.JTextField();
//        jComboBox1 = new javax.swing.JComboBox<>();
//        jLabel3 = new javax.swing.JLabel();
//        jLabel2 = new javax.swing.JLabel();
//        THEM1 = new javax.swing.JButton();
//        XOA = new javax.swing.JButton();
//        LUU1 = new javax.swing.JButton();
//        jPanel2 = new javax.swing.JPanel();
//        jScrollPane2 = new javax.swing.JScrollPane();
//        jTable2 = new javax.swing.JTable();
//        jLabel4 = new javax.swing.JLabel();
//        jTextField3 = new javax.swing.JTextField();
//        jLabel5 = new javax.swing.JLabel();
//        jTextField4 = new javax.swing.JTextField();
//        jLabel6 = new javax.swing.JLabel();
//        jTextField5 = new javax.swing.JTextField();
//        jLabel7 = new javax.swing.JLabel();
//        jComboBox2 = new javax.swing.JComboBox<>();
//        SUA2 = new javax.swing.JButton();
//        LUU2 = new javax.swing.JButton();
//        THEM2 = new javax.swing.JButton();
//        CAPNHAT = new javax.swing.JButton();
//        jPanel3 = new javax.swing.JPanel();
//        jScrollPane3 = new javax.swing.JScrollPane();
//        jTable3 = new javax.swing.JTable();
//        jComboBox3 = new javax.swing.JComboBox<>();
//        jLabel8 = new javax.swing.JLabel();
//        jComboBox4 = new javax.swing.JComboBox<>();
//        jLabel9 = new javax.swing.JLabel();
//        jLabel10 = new javax.swing.JLabel();
//        jTextField6 = new javax.swing.JTextField();
//        jLabel11 = new javax.swing.JLabel();
//        jTextField7 = new javax.swing.JTextField();
//        THEM3 = new javax.swing.JButton();
//        jButton8 = new javax.swing.JButton();
//        LUU3 = new javax.swing.JButton();
//        jRadioButton1 = new javax.swing.JRadioButton();
//        jRadioButton2 = new javax.swing.JRadioButton();
//
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//
//        jTable1.setModel(new javax.swing.table.DefaultTableModel(
//            new Object [][] {
//                {null, null, null, null},
//                {null, null, null, null},
//                {null, null, null, null},
//                {null, null, null, null}
//            },
//            new String [] {
//                "Title 1", "Title 2", "Title 3", "Title 4"
//            }
//        ));
//        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                jTable1MouseClicked(evt);
//            }
//        });
//        jScrollPane1.setViewportView(jTable1);
//
//        jLabel1.setText("Ten Mon");
//
//        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Co ban", "co so nganh", "chuyenn nganh", " " }));
//
//        jLabel3.setText("Loai Mon Hoc");
//
//        jLabel2.setText("So Tiet");
//
//        THEM1.setText("THEM");
//        THEM1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                THEM1ActionPerformed(evt);
//            }
//        });
//
//        XOA.setText("XOA");
//        XOA.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                XOAActionPerformed(evt);
//            }
//        });
//
//        LUU1.setText("LUUVAOFILE");
//        LUU1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                LUU1ActionPerformed(evt);
//            }
//        });
//
//        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
//        jPanel1.setLayout(jPanel1Layout);
//        jPanel1Layout.setHorizontalGroup(
//            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel1Layout.createSequentialGroup()
//                .addContainerGap()
//                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(18, 18, 18)
//                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(jPanel1Layout.createSequentialGroup()
//                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
//                    .addGroup(jPanel1Layout.createSequentialGroup()
//                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
//                    .addGroup(jPanel1Layout.createSequentialGroup()
//                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
//                            .addComponent(THEM1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
//                            .addGroup(jPanel1Layout.createSequentialGroup()
//                                .addComponent(XOA, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
//                                .addComponent(LUU1)))))
//                .addGap(47, 47, 47))
//        );
//        jPanel1Layout.setVerticalGroup(
//            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel1Layout.createSequentialGroup()
//                .addContainerGap()
//                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(jPanel1Layout.createSequentialGroup()
//                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                            .addComponent(jLabel1)
//                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                        .addGap(29, 29, 29)
//                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                            .addComponent(jLabel2)
//                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                        .addGap(31, 31, 31)
//                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                            .addComponent(jLabel3)
//                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                        .addGap(70, 70, 70)
//                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                            .addComponent(THEM1)
//                            .addComponent(XOA)
//                            .addComponent(LUU1)))
//                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
//                .addContainerGap(137, Short.MAX_VALUE))
//        );
//
//        jTabbedPane1.addTab("MonHoc", jPanel1);
//
//        jTable2.setModel(new javax.swing.table.DefaultTableModel(
//            new Object [][] {
//                {null, null, null, null},
//                {null, null, null, null},
//                {null, null, null, null},
//                {null, null, null, null}
//            },
//            new String [] {
//                "Title 1", "Title 2", "Title 3", "Title 4"
//            }
//        ));
//        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                jTable2MouseClicked(evt);
//            }
//        });
//        jScrollPane2.setViewportView(jTable2);
//
//        jLabel4.setText("Ho Ten");
//
//        jLabel5.setText("SDT");
//
//        jLabel6.setText("Email");
//
//        jTextField5.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jTextField5ActionPerformed(evt);
//            }
//        });
//
//        jLabel7.setText("Khoa");
//
//        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "co ban", "dien tu vien thong", "cntt", "qtkd", "ketoan", " " }));
//
//        SUA2.setText("SUA");
//        SUA2.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                SUA2ActionPerformed(evt);
//            }
//        });
//
//        LUU2.setText("LUUVaoFILE");
//        LUU2.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                LUU2ActionPerformed(evt);
//            }
//        });
//
//        THEM2.setText("THEM");
//        THEM2.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                THEM2ActionPerformed(evt);
//            }
//        });
//
//        CAPNHAT.setText("CAP NHAT SAU SUA");
//        CAPNHAT.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                CAPNHATActionPerformed(evt);
//            }
//        });
//
//        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
//        jPanel2.setLayout(jPanel2Layout);
//        jPanel2Layout.setHorizontalGroup(
//            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel2Layout.createSequentialGroup()
//                .addContainerGap()
//                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(18, 18, 18)
//                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(jPanel2Layout.createSequentialGroup()
//                        .addComponent(THEM2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addGap(59, 59, 59)
//                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                            .addGroup(jPanel2Layout.createSequentialGroup()
//                                .addComponent(SUA2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
//                                .addComponent(LUU2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
//                            .addGroup(jPanel2Layout.createSequentialGroup()
//                                .addComponent(CAPNHAT, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addGap(0, 0, Short.MAX_VALUE))))
//                    .addGroup(jPanel2Layout.createSequentialGroup()
//                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
//                    .addGroup(jPanel2Layout.createSequentialGroup()
//                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
//                    .addGroup(jPanel2Layout.createSequentialGroup()
//                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
//                    .addGroup(jPanel2Layout.createSequentialGroup()
//                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
//                .addContainerGap())
//        );
//        jPanel2Layout.setVerticalGroup(
//            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel2Layout.createSequentialGroup()
//                .addContainerGap()
//                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(jPanel2Layout.createSequentialGroup()
//                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                            .addComponent(jLabel4)
//                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                        .addGap(29, 29, 29)
//                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                            .addComponent(jLabel5)
//                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                        .addGap(33, 33, 33)
//                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                            .addComponent(jLabel6)
//                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                        .addGap(18, 18, 18)
//                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                            .addComponent(jLabel7)
//                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                        .addGap(35, 35, 35)
//                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                            .addComponent(THEM2)
//                            .addComponent(SUA2)
//                            .addComponent(LUU2))
//                        .addGap(28, 28, 28)
//                        .addComponent(CAPNHAT))
//                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
//                .addContainerGap(137, Short.MAX_VALUE))
//        );
//
//        jTabbedPane1.addTab("Giang Vien", jPanel2);
//
//        jTable3.setModel(new javax.swing.table.DefaultTableModel(
//            new Object [][] {
//                {null, null, null, null},
//                {null, null, null, null},
//                {null, null, null, null},
//                {null, null, null, null}
//            },
//            new String [] {
//                "Title 1", "Title 2", "Title 3", "Title 4"
//            }
//        ));
//        jScrollPane3.setViewportView(jTable3);
//
//        jLabel8.setText("Ma Mon Hoc");
//
//        jLabel9.setText("Ma GV");
//
//        jLabel10.setText("So Lop");
//
//        jLabel11.setText("Ngay Dang Ky (dd/MM/yyyy)");
//
//        THEM3.setText("Them");
//        THEM3.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                THEM3ActionPerformed(evt);
//            }
//        });
//
//        jButton8.setText("REFRESH");
//        jButton8.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton8ActionPerformed(evt);
//            }
//        });
//
//        LUU3.setText("LuuVaoFile");
//        LUU3.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                LUU3ActionPerformed(evt);
//            }
//        });
//
//        buttonGroup1.add(jRadioButton1);
//        jRadioButton1.setText("Sap Xep Theo SDT");
//        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                jRadioButton1MouseClicked(evt);
//            }
//        });
//
//        buttonGroup1.add(jRadioButton2);
//        jRadioButton2.setText("Sap Xep Theo Ngay Dang Ky");
//        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                jRadioButton2MouseClicked(evt);
//            }
//        });
//
//        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
//        jPanel3.setLayout(jPanel3Layout);
//        jPanel3Layout.setHorizontalGroup(
//            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel3Layout.createSequentialGroup()
//                .addContainerGap()
//                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(jPanel3Layout.createSequentialGroup()
//                        .addComponent(THEM3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addGap(41, 41, 41)
//                        .addComponent(LUU3))
//                    .addGroup(jPanel3Layout.createSequentialGroup()
//                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                            .addGroup(jPanel3Layout.createSequentialGroup()
//                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
//                            .addGroup(jPanel3Layout.createSequentialGroup()
//                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
//                            .addGroup(jPanel3Layout.createSequentialGroup()
//                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
//                            .addGroup(jPanel3Layout.createSequentialGroup()
//                                .addComponent(jLabel11)
//                                .addGap(24, 24, 24)
//                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
//                            .addGroup(jPanel3Layout.createSequentialGroup()
//                                .addComponent(jRadioButton1)
//                                .addGap(26, 26, 26)
//                                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
//                        .addGap(0, 0, Short.MAX_VALUE)))
//                .addContainerGap())
//        );
//        jPanel3Layout.setVerticalGroup(
//            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel3Layout.createSequentialGroup()
//                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                    .addGroup(jPanel3Layout.createSequentialGroup()
//                        .addContainerGap()
//                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
//                    .addGroup(jPanel3Layout.createSequentialGroup()
//                        .addGap(22, 22, 22)
//                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                            .addComponent(jLabel8)
//                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                        .addGap(36, 36, 36)
//                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                            .addComponent(jLabel9)
//                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                        .addGap(27, 27, 27)
//                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                            .addComponent(jLabel10)
//                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                        .addGap(37, 37, 37)
//                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                            .addComponent(jLabel11)
//                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                        .addGap(18, 18, 18)
//                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                            .addComponent(THEM3)
//                            .addComponent(jButton8)
//                            .addComponent(LUU3))
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                            .addComponent(jRadioButton1)
//                            .addComponent(jRadioButton2))))
//                .addContainerGap(137, Short.MAX_VALUE))
//        );
//
//        jTabbedPane1.addTab("Bang Dang Ky", jPanel3);
//
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addComponent(jTabbedPane1)
//        );
//        layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addComponent(jTabbedPane1)
//        );
//
//        pack();
//    }// </editor-fold>                        
//
//    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {                                            
//        // TODO add your handling code here:
//    }                                           
//    private MonHoc getmonhoc(int ma){
//        for (MonHoc monHoc : lmonhoc) {
//            if(monHoc.getMamh() == ma) return monHoc ; 
//        }
//        return  null ; 
//    }
//    private  GiangVien getGiangVien(int ma){
//        for (GiangVien giangVien : lgiangvien) {
//            if(giangVien.getMagv() == ma) return giangVien ; 
//        }
//        return null; 
//    }
//    private int layNam(String s){
//        String []l = s.split("/") ; 
//        return Integer.parseInt(l[l.length-1]) ;
//    }
//    private Boolean check(int mamh , int magv , String ngaydangki){
//        for (DangKy dangKy : ldangky) {
//            if(dangKy.getMonhoc().getMamh() == mamh && dangKy.getGiangvien().getMagv() == magv && dangKy.getnamdangky() == layNam(ngaydangki)) return true ; 
//        }
//        return false ; 
//    }
//    private void THEM3ActionPerformed(java.awt.event.ActionEvent evt) {                                      
//        // TODO add your handling code here:
//        int solop = -1 ; 
//        try {
//            int mamn = Integer.parseInt(jComboBox3.getSelectedItem().toString()) ;
//            int magv = Integer.parseInt(jComboBox4.getSelectedItem().toString()) ;
//            String ngaydangki = jTextField7.getText() ; 
//            String solopstring = jTextField6.getText() ; 
//            if(ngaydangki.isEmpty()|| solopstring.isEmpty()) throw  new KhongTrongEX() ; 
//            String res  = "\\d{2}/\\d{2}/\\d{4}" ;
//            if(!ngaydangki.matches(res)) throw  new NgayThang()  ; 
//            solop = Integer.parseInt(solopstring) ; 
//            Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(ngaydangki);   
//            DangKy t = new  DangKy(getmonhoc(mamn) , getGiangVien(magv) , solop , ngaydangki) ; 
//            if(check(mamn, magv, ngaydangki) == true) {
//                      JOptionPane.showMessageDialog(rootPane, "GIang Vien DAng kY Trung Mon Trong Nam"); return;  
//            }
//            ldangky.add(t) ; 
//            tbl3.addRow(t.tobObject());
//        } catch (KhongTrongEX e) {
//            JOptionPane.showMessageDialog(rootPane, "Khong de trong");
//        }catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(rootPane, "Nhap vao so lop");
//        } catch (ParseException ex) {
//           JOptionPane.showMessageDialog(rootPane, "Nhap dung dinh dang ngay dang ki"); return;  
//        } catch (NgayThang ex) {
//           JOptionPane.showMessageDialog(rootPane, "Nhap dung dinh dang ngay dang ki"); return;  
//        } 
//    }                                     
//
//    private void THEM1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
//        // TODO add your handling code here:
//        int n = lmonhoc.size() ; 
//        if(n>0){
//            MonHoc.setSma(lmonhoc.get(n-1).getMamh() + 1);
//        }
//        String ten , loai ; 
//        int sotiet ; 
//        try {
//            ten = jTextField1.getText() ; 
//            if(ten.isEmpty()) throw new KhongTrongEX() ; 
//            sotiet = Integer.parseInt(jTextField2.getText()) ; 
//            if(sotiet <= 0) throw new SoDuongEx() ; 
//            loai = jComboBox1.getSelectedItem().toString() ; 
//            MonHoc t = new  MonHoc(MonHoc.getSma() , ten , sotiet , loai) ; 
//            lmonhoc.add(t) ; 
//            tbl1.addRow(t.tobObject());
//        } catch (KhongTrongEX e) {
//            JOptionPane.showMessageDialog(rootPane, "khong de trong");
//        }
//        catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(rootPane, "Nhap vao so");
//        }catch (SoDuongEx e) {
//            JOptionPane.showMessageDialog(rootPane, "Nhap Dung gia tri so tiet");
//        }
//    }                                     
//
//    private void XOAActionPerformed(java.awt.event.ActionEvent evt) {                                    
//        // TODO add your handling code here:
//        int row  = jTable1.getSelectedRow() ; 
//        if(row<0 ||row >= jTable1.getRowCount()){
//            JOptionPane.showMessageDialog(rootPane, "chon de xoa"); return ; 
//        }
//        lmonhoc.remove(row ); 
//        tbl1.removeRow(row);
//    }                                   
//
//    private void LUU1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
//        // TODO add your handling code here:
//        IOFile.viet(filemonhoc, lmonhoc);
//        load2ma();
//    }                                    
//
//    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
//        // TODO add your handling code here:
//    }                                    
//
//    private void THEM2ActionPerformed(java.awt.event.ActionEvent evt) {                                      
//        // TODO add your handling code here:
//        int n = lgiangvien.size() ; 
//        if(n>0){
//            GiangVien.setSma(lgiangvien.get(n-1).getMagv()+ 1);
//        }
//        String hoten , khoa , sdt,email ; 
////        int sotiet ; 
//        try {
//            hoten = jTextField3.getText() ; 
//            sdt = jTextField4.getText() ; 
//            email = jTextField5.getText() ; 
//            khoa  = jComboBox2.getSelectedItem().toString()  ; 
//            
//            if(hoten.isEmpty()||email.isEmpty()||sdt.isEmpty()) throw new KhongTrongEX() ; 
//            String res = "\\d+"  ; 
//            if(!sdt.matches(res)) throw  new DienThoaiEX() ; 
//            
//            GiangVien t = new  GiangVien(GiangVien.getSma() , hoten , sdt , email  , khoa) ; 
//            lgiangvien.add(t) ; 
//            tbl2.addRow(t.tobObject());
//        } catch (KhongTrongEX e) {
//            JOptionPane.showMessageDialog(rootPane, "khong de trong");
//        }
//        catch (DienThoaiEX e) {
//            JOptionPane.showMessageDialog(rootPane, "Nhap vao so dt dung dinh dang");
//        }
//    }                                     
//
//    private void SUA2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
//        // TODO add your handling code here:
//                int row = jTable2.getSelectedRow() ; 
//        if(row<0 ||row >= jTable2.getRowCount()){
//            JOptionPane.showMessageDialog(rootPane, "chon de sua"); return ; 
//        }
//        int ma= Integer.parseInt( jTable2.getValueAt(row, 0).toString()) ; 
//        String hoten , khoa , sdt,email ; 
////        int sotiet ; 
//        try {
//            hoten = jTextField3.getText() ; 
//            sdt = jTextField4.getText() ; 
//            email = jTextField5.getText() ; 
//            khoa  = jComboBox2.getSelectedItem().toString()  ; 
//            
//            if(hoten.isEmpty()||email.isEmpty()||sdt.isEmpty()) throw new KhongTrongEX() ; 
//            String res = "\\d+"  ; 
//            if(!sdt.matches(res)) throw  new DienThoaiEX() ; 
//            
//            GiangVien t = new  GiangVien(ma , hoten , sdt , email  , khoa) ; 
//            lgiangvien.set(row, t) ; 
//            JOptionPane.showMessageDialog(rootPane, "Sua Thanh Cong\nNhan 'Cap Nhat Sau Sua' de hien thi lai thong tin");
//        } catch (KhongTrongEX e) {
//            JOptionPane.showMessageDialog(rootPane, "khong de trong");
//        }
//        catch (DienThoaiEX e) {
//            JOptionPane.showMessageDialog(rootPane, "Nhap vao so dt dung dinh dang");
//        }
//    }                                    
//
//    private void LUU2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
//        // TODO add your handling code here:
//        IOFile.viet(fileGV, lgiangvien);
//        load2ma();
//    }                                    
//
//    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {                                     
//        // TODO add your handling code here:
//        int row = jTable2.getSelectedRow() ; 
//        jTextField3.setText(jTable2.getValueAt(row, 1)+"");
//        jTextField4.setText(jTable2.getValueAt(row, 2)+"");
//        jTextField5.setText(jTable2.getValueAt(row, 3)+"");
//        jComboBox2.setSelectedItem(jTable2.getValueAt(row, 4));
//    }                                    
//
//    private void CAPNHATActionPerformed(java.awt.event.ActionEvent evt) {                                        
//        // TODO add your handling code here:
//        tbl2.setRowCount(0);
//            for (GiangVien i : lgiangvien) {
//                tbl2.addRow(i.tobObject());
//            }
//    }                                       
//
//    private void LUU3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
//        // TODO add your handling code here:
//        IOFile.viet(fileDK, ldangky);
//    }                                    
//
//    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
//        // TODO add your handling code here:
//        load2ma();
//    }                                        
//
//    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {                                           
//        // TODO add your handling code here:
//        // theo sdt
//        ldangky.sort(new Comparator<DangKy>(){
//
//            @Override
//            public int compare(DangKy o1, DangKy o2) {
//                return o1.getGiangvien().getSdt().compareToIgnoreCase(o2.getGiangvien().getSdt()) ; 
//            }
//            }
//);
//        tbl3.setRowCount(0);
//        for (DangKy dangKy : ldangky) {
//            tbl3.addRow(dangKy.tobObject());
//        }
//    }                                          
//
//    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {                                           
//        // TODO add your handling code here:
//          ldangky.sort(new Comparator<DangKy>(){
//
//            @Override
//            public int compare(DangKy o1, DangKy o2) {
//                String l1[] = o1.getNgaydangki().split("/")  ; 
//                String l2[] = o2.getNgaydangki().split("/")  ; 
//                
//                int n1 = l1.length ,n2 = l2.length ; 
//                if(!l1[n1-1].equalsIgnoreCase(l2[n2-1])  ){
//                    return l1[n1-1].compareToIgnoreCase(l2[n2-1]) ; 
//                } else if(!l1[n1-2].equalsIgnoreCase(l2[n2-2])){
//                      return l1[n1-2].compareToIgnoreCase(l2[n2-2]) ; 
//                } else return l1[n1-3].compareToIgnoreCase(l2[n2-3]) ; 
//            }
//            }
//);
//        tbl3.setRowCount(0);
//        for (DangKy dangKy : ldangky) {
//            tbl3.addRow(dangKy.tobObject());
//        }
//    }                                          
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainGVMH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainGVMH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainGVMH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainGVMH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainGVMH().setVisible(true);
//            }
//        });
//    }
//
//    // Variables declaration - do not modify                     
//    private javax.swing.JButton CAPNHAT;
//    private javax.swing.JButton LUU1;
//    private javax.swing.JButton LUU2;
//    private javax.swing.JButton LUU3;
//    private javax.swing.JButton SUA2;
//    private javax.swing.JButton THEM1;
//    private javax.swing.JButton THEM2;
//    private javax.swing.JButton THEM3;
//    private javax.swing.JButton XOA;
//    private javax.swing.ButtonGroup buttonGroup1;
//    private javax.swing.JButton jButton8;
//    private javax.swing.JComboBox<String> jComboBox1;
//    private javax.swing.JComboBox<String> jComboBox2;
//    private javax.swing.JComboBox<String> jComboBox3;
//    private javax.swing.JComboBox<String> jComboBox4;
//    private javax.swing.JLabel jLabel1;
//    private javax.swing.JLabel jLabel10;
//    private javax.swing.JLabel jLabel11;
//    private javax.swing.JLabel jLabel2;
//    private javax.swing.JLabel jLabel3;
//    private javax.swing.JLabel jLabel4;
//    private javax.swing.JLabel jLabel5;
//    private javax.swing.JLabel jLabel6;
//    private javax.swing.JLabel jLabel7;
//    private javax.swing.JLabel jLabel8;
//    private javax.swing.JLabel jLabel9;
//    private javax.swing.JPanel jPanel1;
//    private javax.swing.JPanel jPanel2;
//    private javax.swing.JPanel jPanel3;
//    private javax.swing.JRadioButton jRadioButton1;
//    private javax.swing.JRadioButton jRadioButton2;
//    private javax.swing.JScrollPane jScrollPane1;
//    private javax.swing.JScrollPane jScrollPane2;
//    private javax.swing.JScrollPane jScrollPane3;
//    private javax.swing.JTabbedPane jTabbedPane1;
//    private javax.swing.JTable jTable1;
//    private javax.swing.JTable jTable2;
//    private javax.swing.JTable jTable3;
//    private javax.swing.JTextField jTextField1;
//    private javax.swing.JTextField jTextField2;
//    private javax.swing.JTextField jTextField3;
//    private javax.swing.JTextField jTextField4;
//    private javax.swing.JTextField jTextField5;
//    private javax.swing.JTextField jTextField6;
//    private javax.swing.JTextField jTextField7;
//    // End of variables declaration                   
//}
