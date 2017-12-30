/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.components;
import controller.veriler;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author ozkan
 */
public class ekle extends javax.swing.JFrame {

    /**
     * Creates new form ekle
     */
    public ekle() {
        initComponents();
        this.setTitle("Malzeme - Müşteri - Araç Ekle");
        int ekranGenislik = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        int ekranYukseklik = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        int uygulamaGenislik = getWidth();
        int uygulamaYukseklik = getHeight();
        setLocation((ekranGenislik - uygulamaGenislik) / 2, (ekranYukseklik - uygulamaYukseklik) / 2);
        combosehirDoldur();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setText("TANIMLAR EKLE");

        jLabel2.setText("Malzeme Adı");

        jLabel3.setText("Birim Malzemenin Ağırlığı");

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel4.setText("KG");

        jLabel5.setText("Birim Malzemenin Satış Fiyatı");

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel6.setText("TL");

        jLabel7.setText("Birim Malzemenin Hacmi");

        jLabel8.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel8.setText("MetreKüp");

        jButton2.setBackground(java.awt.Color.green);
        jButton2.setText("KAYDET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel16.setText("Birim Malzemenin Maliyeti");

        jLabel17.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel17.setText("TL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel6))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)))
                .addContainerGap(291, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(31, 31, 31)
                .addComponent(jButton2)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Malzeme Ekle", jPanel2);

        jLabel9.setText("Müşteri Adı");

        jLabel10.setText("Şehir");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setBackground(java.awt.Color.green);
        jButton1.setText("KAYDET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Müşteri Ekle", jPanel3);

        jLabel11.setText("Araç Plakası");

        jLabel12.setText("Ton Kapasitesi");

        jLabel13.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel13.setText("TON");

        jLabel14.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel14.setText("MetreKüp");

        jLabel15.setText("Hacim Kapasitesi");

        jButton3.setBackground(java.awt.Color.green);
        jButton3.setText("KAYDET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel18.setText("Kilometre Başına Aldığı Ücret");

        jLabel19.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel19.setText("TL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(27, 27, 27)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel14)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel19)))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addGap(256, 256, 256))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(43, 43, 43)
                .addComponent(jButton3)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Araç Ekle", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel1)
                .addContainerGap(281, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane1)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(522, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jTabbedPane1)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (!jTextField1.getText().trim().equals("") && !jTextField2.getText().trim().equals("")
                && !jTextField3.getText().trim().equals("") && !jTextField4.getText().trim().equals("")
                && !jTextField9.getText().trim().equals("")) {

            boolean durum = malzemeKaydet();
            
            if (durum) {
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField9.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Kaydedilirken Hata Oldu", "SQL HATA", JOptionPane.ERROR_MESSAGE);

            }
        } else {
            JOptionPane.showMessageDialog(this, "Tüm Alanların Doldurulması Zorunludur", "Eksik alan", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (!jTextField5.getText().equals("") && jComboBox1.getSelectedIndex() > 0) {
            boolean durum = musteriKaydet();
            if (durum) {
                jTextField5.setText("");
                jComboBox1.setSelectedIndex(0);
            } else {
                JOptionPane.showMessageDialog(this, "Kaydedilirken Hata Oldu", "SQL HATA", JOptionPane.ERROR_MESSAGE);

            }
        } else {
            JOptionPane.showMessageDialog(this, "Tüm Alanların Doldurulması Zorunludur", "Eksik alan", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (!jTextField6.getText().equals("") && !jTextField7.getText().equals("") && !jTextField8.getText().equals("")) {
            boolean durum = aracKaydet();
            if (durum) {
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jTextField10.setText("");
                

            } else {
                JOptionPane.showMessageDialog(this, "Kaydedilirken Hata Oldu", "SQL HATA", JOptionPane.ERROR_MESSAGE);

            }
        } else {
            JOptionPane.showMessageDialog(this, "Tüm Alanların Doldurulması Zorunludur", "Eksik alan", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Malzeme ekle
    public boolean malzemeKaydet() {
        boolean durum = false;
        controller.veriler veri = new controller.veriler();

        veri.setMalzemeAd(jTextField1.getText().trim());
        veri.setMalzemeFiyat(Float.parseFloat(jTextField3.getText().trim()));
        veri.setMalzemeAgirlik(Integer.parseInt(jTextField2.getText().trim()));
        veri.setMalzemeHacim(Integer.parseInt(jTextField4.getText().trim()));
        veri.setMalzemeMaliyet(Float.parseFloat(jTextField9.getText().trim()));

        try {
            durum = veri.malzemeEkle(veri);
            durum = veri.stokEkle(jTextField1.getText().trim());
        } catch (SQLException ex) {
            Logger.getLogger(ekle.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "SQL'e kaydedilirken hata oldu" + ex.getMessage(), "SQL Hatası", JOptionPane.ERROR_MESSAGE);

            return false;
        }
        return durum;
    }

    // Müşteri ekle
    public boolean musteriKaydet() {
        boolean durum = false;
        controller.veriler veri = new controller.veriler();

        veri.setMusteriAd(jTextField5.getText().trim());
        veri.setSehirAd(jComboBox1.getSelectedItem().toString());

        try {
            durum = veri.musteriEkle(veri);
        } catch (SQLException ex) {
            Logger.getLogger(ekle.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return durum;
    }

    // Araç ekle
    public boolean aracKaydet() {
        boolean durum = false;
        controller.veriler veri = new controller.veriler();

        veri.setAracPlaka(jTextField6.getText().trim().toUpperCase().replace(" ", ""));
        veri.setAracTon(Integer.parseInt(jTextField7.getText().trim()));
        veri.setAracHacim(Integer.parseInt(jTextField8.getText().trim()));
        veri.setAracKatsayi(Float.parseFloat(jTextField10.getText().trim()));
        try {
            durum = veri.aracEkle(veri);
        } catch (SQLException ex) {
            Logger.getLogger(ekle.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return durum;
    }

    public void combosehirDoldur() {
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
        comboModel = new controller.components().comboSehirler();
        jComboBox1.setModel(comboModel);
        jComboBox1.repaint();
    }

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
            java.util.logging.Logger.getLogger(ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ekle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
