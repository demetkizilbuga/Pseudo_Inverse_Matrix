/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sozdetersi;

import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author uset
 */
public class matrisOlustur extends javax.swing.JFrame {

    private DefaultTableModel m_tablo;
    private DefaultTableModel p_tablo;
    private DefaultTableModel t_tablo;
    private DefaultTableModel c_tablo;
    private DefaultTableModel ct_tablo;
    public static int toplam =0;
    public static int carpim_sayisi=0;
    
    public matrisOlustur() {
        initComponents();
        myInit();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void myInit(){
        //Matrisin gösterileceği tablo düzenlemesi
        m_tablo = (DefaultTableModel)matris_tablo.getModel();
        m_tablo.setRowCount(0);
        matris_tablo.setRowHeight(30);
        matris_tablo.getTableHeader().setUI(null);
        //Sözde tersinin gösterileceği tablo düzenlemesi
        p_tablo = (DefaultTableModel)pseudo_tablo.getModel();
        p_tablo.setRowCount(0);
        pseudo_tablo.setRowHeight(30);
        pseudo_tablo.getTableHeader().setUI(null);
        //Transpozun gösterileceği tablo düzenlemesi
        t_tablo = (DefaultTableModel)transpoz_tablo.getModel();
        t_tablo.setRowCount(0);
        transpoz_tablo.setRowHeight(30);
        transpoz_tablo.getTableHeader().setUI(null);
        //Çarpım matrisinin gösterileceği tablo düzenlemesi
        c_tablo = (DefaultTableModel)carpim_tablo.getModel();
        c_tablo.setRowCount(0);
        carpim_tablo.setRowHeight(30);
        carpim_tablo.getTableHeader().setUI(null);
        //Çarpımın tersinin gösterileceği tablo düzenlemesi
        ct_tablo = (DefaultTableModel)carpim_tersi.getModel();
        ct_tablo.setRowCount(0);
        carpim_tersi.setRowHeight(30);
        carpim_tersi.getTableHeader().setUI(null);
        //Comboboxların içi temizlenir
        satir.removeAllItems();
        sutun.removeAllItems();
        //Satır combobox ına veriler eklenir
        satir.addItem("1");
        satir.addItem("2");
        satir.addItem("3");
        satir.addItem("4");
        satir.addItem("5");
        //Sütun combobox ına veriler eklenir
        sutun.addItem("1");
        sutun.addItem("2");
        sutun.addItem("3");
        sutun.addItem("4");
        sutun.addItem("5");
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        satir = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        sutun = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        matris_tablo = new javax.swing.JTable();
        hesapla = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        temizle = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        pseudo_tablo = new javax.swing.JTable();
        bir_onceki = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        transpoz_tablo = new javax.swing.JTable();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        carpim_tablo = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane5 = new javax.swing.JScrollPane();
        carpim_tersi = new javax.swing.JTable();
        sum = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        carpma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(89, 171, 227));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("_");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sözde Tersi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(13, 13, 13))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(31, 58, 147));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Satır Sayısı");

        satir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        satir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sütun Sayısı");

        sutun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sutun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sutunActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Matris");

        matris_tablo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(matris_tablo);

        hesapla.setText("Hesapla");
        hesapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesaplaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sözde Matris");

        temizle.setText("Temizle");
        temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizleActionPerformed(evt);
            }
        });

        pseudo_tablo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(pseudo_tablo);

        bir_onceki.setText("Bir Önceki Menü");
        bir_onceki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bir_oncekiActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Matris'in Transpozu");

        transpoz_tablo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(transpoz_tablo);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Matris ile Transpozun Çarpımı");

        carpim_tablo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(carpim_tablo);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Çarpım Matrisinin Tersi");

        carpim_tersi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(carpim_tersi);

        sum.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        sum.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Çarpma-Bölme İşlem Sayısı :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Toplama-Çıkarma İşlem Sayısı :");

        carpma.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        carpma.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sutun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(satir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(temizle)
                            .addComponent(hesapla)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(bir_onceki)))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(51, 51, 51)))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sum, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(jLabel7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(carpma, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(57, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(satir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sutun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGap(56, 56, 56)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(hesapla)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(temizle)
                            .addGap(27, 27, 27)
                            .addComponent(bir_onceki))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGap(44, 44, 44)
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(carpma, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sum, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(8, 8, 8)
                                .addComponent(jLabel12)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setState(JFrame.ICONIFIED);
        // "_" etiketine basınca simge durumda küçültür
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
        //"X" etiketine basınca programı kapatır
    }//GEN-LAST:event_jLabel2MouseClicked

    private void satirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satirActionPerformed
       m_tablo.setRowCount(satir.getSelectedIndex()+1);
       //Matris tablosuna satır combobox ından seçilen değer kadar satır ekler
    }//GEN-LAST:event_satirActionPerformed

    private void sutunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sutunActionPerformed
        m_tablo.setColumnCount(sutun.getSelectedIndex()+1);
        //Matris tablosuna sütun combobox ından seçilen değer kadar sütun ekler
    }//GEN-LAST:event_sutunActionPerformed

    private void hesaplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesaplaActionPerformed
        
        try{
            toplam=0;
            carpim_sayisi=0;
            int boyut1=satir.getSelectedIndex()+1;
            int boyut2=sutun.getSelectedIndex()+1;
            DecimalFormat df=new DecimalFormat("#.####");
            tersi t = new tersi();
            double[][] matris = new double[boyut1][boyut2];
            int i,j,k;
            
            if(boyut1==boyut2){
                throw new MyException(3); // Boyutlar aynı ise uyarı verip exception a düşer
            }
            //Program her çalıştırıldığında eski verilerin kaybolması için 0 atanır
            for(i=0;i<boyut1;i++){
                for(j=0;j<boyut2;j++){
                    matris[i][j]=0;
                }
            }
            //Hatalar kontrol edilir hata varsa uyarı verip exception a düşer
            for(i=0;i<boyut1;i++){
                for(j=0;j<boyut2;j++){
                    if("".equals(m_tablo.getValueAt(i, j).toString())){
                        throw new MyException(1);
                    }
                    for(k=0;k<m_tablo.getValueAt(i, j).toString().length();k++){
                        char ch=m_tablo.getValueAt(i, j).toString().charAt(k);
                        if(!Character.isDigit(ch) && ch!='.'){
                            throw new MyException(2);
                        }
                    }
                    if(m_tablo.getValueAt(i, j).toString().contains(".")){
                        int index = m_tablo.getValueAt(i, j).toString().indexOf(".");
                        String s = m_tablo.getValueAt(i, j).toString().substring(index+1);
                        if(s.length()>1){
                            throw new MyException(4);
                        }
                    }
                    
                }
            }
            //Matris tablosundaki verileri gerçek matrise atar
            for(i=0;i<boyut1;i++){
                for(j=0;j<boyut2;j++){
                    matris[i][j]=Double.parseDouble(m_tablo.getValueAt(i, j).toString());
                }
            }
            //Transpoz tablosunun boyutları ayarlanır
            t_tablo.setRowCount(boyut2);
            t_tablo.setColumnCount(boyut1);

            double[][] transpoz = new double[boyut2][boyut1];
            //Transpoz matrisi ve tablosu elde edilir
            for(i=0;i<boyut2;i++){
                for(j=0;j<boyut1;j++){
                    transpoz[i][j]=matris[j][i];
                    t_tablo.setValueAt(transpoz[i][j], i, j);
                }
            }
            
            double[][] carpim = new double[boyut2][boyut2];
            double[][] carpim_yedek = new double[boyut2][boyut2];
            double[][] pseudo = new double[boyut2][boyut1];
            //Transpozu ile matrisin kendi çarpılır
            for(i=0;i<boyut2;i++){
                for(j=0;j<boyut2;j++){
                    for(k=0;k<boyut1;k++){
                        carpim[i][j] += transpoz[i][k]*matris[k][j];
                        carpim_sayisi++;
                        toplam++;
                    }
                }
            }
            //Ekrandaki çarpım tablosunda görmek için yedeği alınır
            for(i=0;i<boyut2;i++){
                for(j=0;j<boyut2;j++){
                    carpim_yedek[i][j]=carpim[i][j];
                }
            }
            
            
            Determinant d = new Determinant();
            //Çarpım matrisinin determinantı alınır
            if(d.det(carpim)!=0){
                //Determinant 0'dan farklıysa Yönte1 uygulanır
                pseudo=t.yontem1(carpim,transpoz,boyut1,boyut2);
                
                c_tablo.setRowCount(boyut2);
                c_tablo.setColumnCount(boyut2);
                
                for (i=0; i<boyut2;i++){
                    for (j=0; j<boyut2;j++){
                        c_tablo.setValueAt(df.format(carpim_yedek[i][j]), i, j);
                    }
                }
                
                ct_tablo.setRowCount(boyut2);
                ct_tablo.setColumnCount(boyut2);
                
                for(i=0;i<boyut2;i++){
                    for(j=0;j<boyut2;j++){
                        ct_tablo.setValueAt(df.format(t.yeni_matris[i][j]), i, j);
                    }
                }
                
            }
            else{
                pseudo=t.yontem2(matris, transpoz, boyut1, boyut2);
                
                c_tablo.setRowCount(boyut1);
                c_tablo.setColumnCount(boyut1);
               
                for(i=0;i<boyut1;i++){
                    for(j=0;j<boyut1;j++){
                        c_tablo.setValueAt(df.format(t.carpim2_yedek[i][j]), i, j);
                    }
                }
                
                ct_tablo.setRowCount(boyut1);
                ct_tablo.setColumnCount(boyut1);
                
                for(i=0;i<boyut1;i++){
                    for(j=0;j<boyut1;j++){
                        ct_tablo.setValueAt(df.format(t.yeni_matris2[i][j]), i, j);
                    }
                }
                
            }
            
            p_tablo.setRowCount(boyut2);
            p_tablo.setColumnCount(boyut1);

            for(i=0;i<boyut2;i++){
                for(j=0;j<boyut1;j++){
                    p_tablo.setValueAt(new DecimalFormat("##.####").format(pseudo[i][j]), i, j);
                }
            }
            
            sum.setText(String.valueOf(toplam+t.toplam));
            carpma.setText(String.valueOf(carpim_sayisi+t.carpim_sayisi));
        
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Tabloyu Tamamlayınız !");
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Virgül Yerine Nokta Kullanınız !");
        } catch (MyException ex) {
           // Logger.getLogger(matrisOlustur.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_hesaplaActionPerformed

    private void temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temizleActionPerformed
        int i,j;
        
        for(i=0;i<m_tablo.getRowCount();i++){
            for(j=0;j<m_tablo.getColumnCount();j++){
                m_tablo.setValueAt("", i, j);
            }
        }
        
        for(i=0;i<p_tablo.getRowCount();i++){
            for(j=0;j<p_tablo.getColumnCount();j++){
                p_tablo.setValueAt("", i, j);
            }
        }
        
        for(i=0;i<t_tablo.getRowCount();i++){
            for(j=0;j<t_tablo.getColumnCount();j++){
                t_tablo.setValueAt("", i, j);
            }
        }
        
        for(i=0;i<c_tablo.getRowCount();i++){
            for(j=0;j<c_tablo.getColumnCount();j++){
                c_tablo.setValueAt("", i, j);
            }
        }
        
        for(i=0;i<ct_tablo.getRowCount();i++){
            for(j=0;j<ct_tablo.getColumnCount();j++){
                ct_tablo.setValueAt("", i, j);
            }
        }
        
        sum.setText("");
        carpma.setText("");
    }//GEN-LAST:event_temizleActionPerformed

    private void bir_oncekiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bir_oncekiActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bir_oncekiActionPerformed

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
            java.util.logging.Logger.getLogger(matrisOlustur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(matrisOlustur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(matrisOlustur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(matrisOlustur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new matrisOlustur().setVisible(true);
            }
        });
    }
 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bir_onceki;
    private javax.swing.JTable carpim_tablo;
    private javax.swing.JTable carpim_tersi;
    private javax.swing.JLabel carpma;
    private javax.swing.JButton hesapla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable matris_tablo;
    private javax.swing.JTable pseudo_tablo;
    private javax.swing.JComboBox<String> satir;
    private javax.swing.JLabel sum;
    private javax.swing.JComboBox<String> sutun;
    private javax.swing.JButton temizle;
    private javax.swing.JTable transpoz_tablo;
    // End of variables declaration//GEN-END:variables
}
