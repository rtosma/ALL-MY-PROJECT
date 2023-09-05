/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IBilgiController;
import database.transactions.Havale;
import database.transactions.HesapBilgileri;
import gui.ayarlar.ActionAyarlar;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDüzenleyici;
import gui.ayarlar.TextAyarlari;



public final class HavaleEkrani extends javax.swing.JFrame implements IDüzenleyici,IBilgiController{

     private Havale havaleObject = null;
    
    private final String MUSTERİ_NO_TEXT_ORIGINAL = "Müşteri No";
    private int gonderilicekTutar = 0;
    public HavaleEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {

        this.setLocationRelativeTo(null);
         this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        havaleEkraniPanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(gönderilecekMiktarText);
        TextAyarlari.setMaxLimit(gönderilecekMiktarText, 5);
        TextAyarlari.setOnlyNumber(aliciId);
        aliciId.setText(MUSTERİ_NO_TEXT_ORIGINAL);
        this.kullanıcıadsoyadtext.setText("Sayın " + getHesapBilgileri().getAdSoyad());
        this.bakiyetext.setText(String.valueOf(getHesapBilgileri().getBakiye()));

    }
    
    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.gönderilecekMiktarText.getText().equals("")
                || this.aliciId.getText().equals(this.MUSTERİ_NO_TEXT_ORIGINAL));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public Havale getHavaleObject() {
        if(this.havaleObject == null) {
            havaleObject = new Havale();
        }
        return havaleObject;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        havaleEkraniPanel = new javax.swing.JPanel();
        kullanıcıadsoyadtext = new javax.swing.JLabel();
        gondereceginizMiktarLabel = new javax.swing.JLabel();
        uyarıtext = new javax.swing.JLabel();
        bakiyetext = new javax.swing.JLabel();
        toplambakiyetext = new javax.swing.JLabel();
        gönderilecekMiktarText = new javax.swing.JTextField();
        havaleButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        aliciLabel = new javax.swing.JLabel();
        aliciId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        havaleEkraniPanel.setBackground(new java.awt.Color(51, 153, 255));
        havaleEkraniPanel.setForeground(new java.awt.Color(255, 255, 255));

        kullanıcıadsoyadtext.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        kullanıcıadsoyadtext.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullanıcıadsoyadtext.setText("Sayın[KULLANICI ADI SOYADI]");

        gondereceginizMiktarLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gondereceginizMiktarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gondereceginizMiktarLabel.setText("Göndereceğiniz Miktar:");

        uyarıtext.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        uyarıtext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uyarıtext.setText("Tek seferde 20000TL ve altını gönderebilirsiniz.");

        bakiyetext.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bakiyetext.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bakiyetext.setText("[BAKİYE]");
        bakiyetext.setToolTipText("");

        toplambakiyetext.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        toplambakiyetext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        toplambakiyetext.setText("Toplam Bakiyeniz:");

        gönderilecekMiktarText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gönderilecekMiktarTextActionPerformed(evt);
            }
        });
        gönderilecekMiktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                gönderilecekMiktarTextKeyReleased(evt);
            }
        });

        havaleButton.setText("HAVALE YAP");
        havaleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        havaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                havaleButtonActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/geriicon2.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        aliciLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        aliciLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aliciLabel.setText("Havale Alacak Kişi:");

        aliciId.setForeground(new java.awt.Color(153, 153, 153));
        aliciId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                aliciIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                aliciIdFocusLost(evt);
            }
        });
        aliciId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aliciIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout havaleEkraniPanelLayout = new javax.swing.GroupLayout(havaleEkraniPanel);
        havaleEkraniPanel.setLayout(havaleEkraniPanelLayout);
        havaleEkraniPanelLayout.setHorizontalGroup(
            havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                        .addComponent(toplambakiyetext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bakiyetext, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kullanıcıadsoyadtext, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uyarıtext)
                    .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                            .addGap(0, 30, Short.MAX_VALUE)
                            .addComponent(aliciLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(havaleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(aliciId, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, havaleEkraniPanelLayout.createSequentialGroup()
                            .addComponent(gondereceginizMiktarLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(gönderilecekMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        havaleEkraniPanelLayout.setVerticalGroup(
            havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(kullanıcıadsoyadtext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(uyarıtext)
                .addGap(58, 58, 58)
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bakiyetext)
                    .addComponent(toplambakiyetext))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gönderilecekMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gondereceginizMiktarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aliciLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aliciId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(havaleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(havaleEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(havaleEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gönderilecekMiktarTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gönderilecekMiktarTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gönderilecekMiktarTextActionPerformed

    private void gönderilecekMiktarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gönderilecekMiktarTextKeyReleased
        this.gonderilicekTutar = TextAyarlari.checkTheTextKeyReleased(gönderilecekMiktarText, 20000);

    }//GEN-LAST:event_gönderilecekMiktarTextKeyReleased

    private void havaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_havaleButtonActionPerformed
        if(this.bilgilerGecerliMi()) {
            this.havaleYap();
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
        }
    }//GEN-LAST:event_havaleButtonActionPerformed

    private void havaleYap() {
        getHavaleObject().setGonderilecekMiktar(this.gonderilicekTutar);
        getHavaleObject().setHavaleAlacakKisi(this.aliciId.getText());
        
        if(getHavaleObject().havaleYapildiMi()) {
            Dialogs.ozelMesajGoster(this, "Havale işlemi başarıyla gerçekleşmiştir.\nGönderilen müşteri numarası:" + this.aliciId.getText()
                    + "\nGönderilen Miktar:" + this.gonderilicekTutar + " TL");
            ActionAyarlar.setVisible(this, new HesapEkrani());
        } else {
            Dialogs.ozelMesajGoster(this, "Havale işlemi gerçekleştirilemedi.\nLütfen bilgilerinizi kontrol edin!");
        }
    }
    
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        ActionAyarlar.setVisible(this,new HesapEkrani());
    }//GEN-LAST:event_jLabel2MouseClicked

    private void aliciIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aliciIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aliciIdActionPerformed

    private void aliciIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aliciIdFocusGained
        TextAyarlari.checkTheTextFocusGained(aliciId, MUSTERİ_NO_TEXT_ORIGINAL);
    }//GEN-LAST:event_aliciIdFocusGained

    private void aliciIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aliciIdFocusLost
        TextAyarlari.chekTheTextFocusLost(aliciId);
    }//GEN-LAST:event_aliciIdFocusLost

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
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HavaleEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aliciId;
    private javax.swing.JLabel aliciLabel;
    private javax.swing.JLabel bakiyetext;
    private javax.swing.JLabel gondereceginizMiktarLabel;
    private javax.swing.JTextField gönderilecekMiktarText;
    private javax.swing.JButton havaleButton;
    private javax.swing.JPanel havaleEkraniPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel kullanıcıadsoyadtext;
    private javax.swing.JLabel toplambakiyetext;
    private javax.swing.JLabel uyarıtext;
    // End of variables declaration//GEN-END:variables
}
