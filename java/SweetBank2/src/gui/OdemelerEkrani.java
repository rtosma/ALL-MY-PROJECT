/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IBilgiController;
import database.transactions.FaturaOdemeleri;
import database.transactions.HesapBilgileri;
import gui.ayarlar.ActionAyarlar;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDüzenleyici;



public final class OdemelerEkrani extends javax.swing.JFrame implements IDüzenleyici,IBilgiController{

      private FaturaOdemeleri faturaOdemeleriObject = null;
    
    
    public OdemelerEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {

        this.setLocationRelativeTo(null);
        odemelerEkraniPanel.setFocusable(true);
        this.kullanıcıadsoyadtext.setText("Sayın " + getHesapBilgileri().getAdSoyad());
        this.elektrikBorcu.setText(String.valueOf(getHesapBilgileri().getElektrikFaturasi()));
        this.suBorcu.setText(String.valueOf(getHesapBilgileri().getSuFaturasi()));
        this.dolgazBorcu.setText(String.valueOf(getHesapBilgileri().getDogalgazFaturasi()));
        this.internetBorcu.setText(String.valueOf(getHesapBilgileri().getInternetFaturasi()));
        
    }

     @Override
    public boolean bilgilerGecerliMi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public FaturaOdemeleri getFaturaOdemeleriObject() {
        if (this.faturaOdemeleriObject == null) {
            faturaOdemeleriObject = new FaturaOdemeleri();
        }
        return faturaOdemeleriObject;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        odemelerEkraniPanel = new javax.swing.JPanel();
        kullanıcıadsoyadtext = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mesajElektrikLabel = new javax.swing.JLabel();
        elektrikBorcu = new javax.swing.JLabel();
        elektrikOdeButton = new javax.swing.JButton();
        dogalgazOdeButton = new javax.swing.JButton();
        dolgazBorcu = new javax.swing.JLabel();
        mesajDogalgazLabel = new javax.swing.JLabel();
        suOdeButton = new javax.swing.JButton();
        mesajSuLabel = new javax.swing.JLabel();
        suBorcu = new javax.swing.JLabel();
        internetOdeButton = new javax.swing.JButton();
        internetBorcu = new javax.swing.JLabel();
        mesajInternetLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REBU Bank Ödemeler Ekranı");

        odemelerEkraniPanel.setBackground(new java.awt.Color(0, 153, 255));

        kullanıcıadsoyadtext.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        kullanıcıadsoyadtext.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullanıcıadsoyadtext.setText("Sayın[KULLANICI ADI SOYADI]");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/geriicon2.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        mesajElektrikLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mesajElektrikLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mesajElektrikLabel.setText("Toplam elektrik faturası borcunuz:");

        elektrikBorcu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        elektrikBorcu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        elektrikBorcu.setText("[ELEKT BORC]");

        elektrikOdeButton.setBackground(new java.awt.Color(255, 153, 0));
        elektrikOdeButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        elektrikOdeButton.setText("ÖDE");
        elektrikOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        elektrikOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elektrikOdeButtonActionPerformed(evt);
            }
        });

        dogalgazOdeButton.setBackground(new java.awt.Color(255, 153, 0));
        dogalgazOdeButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dogalgazOdeButton.setText("ÖDE");
        dogalgazOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dogalgazOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogalgazOdeButtonActionPerformed(evt);
            }
        });

        dolgazBorcu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        dolgazBorcu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dolgazBorcu.setText("[DGLGZ BORC]");

        mesajDogalgazLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mesajDogalgazLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mesajDogalgazLabel.setText("Toplam doğalgaz faturası borcunuz:");

        suOdeButton.setBackground(new java.awt.Color(255, 153, 0));
        suOdeButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        suOdeButton.setText("ÖDE");
        suOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        suOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suOdeButtonActionPerformed(evt);
            }
        });

        mesajSuLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mesajSuLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mesajSuLabel.setText("Toplam su faturası borcunuz:");

        suBorcu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        suBorcu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suBorcu.setText("[SU BORC]");

        internetOdeButton.setBackground(new java.awt.Color(255, 153, 0));
        internetOdeButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        internetOdeButton.setText("ÖDE");
        internetOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        internetOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internetOdeButtonActionPerformed(evt);
            }
        });

        internetBorcu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        internetBorcu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        internetBorcu.setText("[INTRNT BORC]");

        mesajInternetLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mesajInternetLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mesajInternetLabel.setText("Toplam internet faturası borcunuz:");

        javax.swing.GroupLayout odemelerEkraniPanelLayout = new javax.swing.GroupLayout(odemelerEkraniPanel);
        odemelerEkraniPanel.setLayout(odemelerEkraniPanelLayout);
        odemelerEkraniPanelLayout.setHorizontalGroup(
            odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(kullanıcıadsoyadtext, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                                .addComponent(mesajSuLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(suBorcu, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(suOdeButton))
                            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                                .addComponent(mesajElektrikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(elektrikBorcu, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(elektrikOdeButton))
                            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                                .addComponent(mesajDogalgazLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dolgazBorcu, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dogalgazOdeButton))
                            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                                .addComponent(mesajInternetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(internetBorcu, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(internetOdeButton)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        odemelerEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dolgazBorcu, elektrikBorcu, internetBorcu, suBorcu});

        odemelerEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dogalgazOdeButton, elektrikOdeButton, internetOdeButton, suOdeButton});

        odemelerEkraniPanelLayout.setVerticalGroup(
            odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kullanıcıadsoyadtext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(elektrikBorcu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mesajElektrikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(elektrikOdeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(suBorcu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mesajSuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(suOdeButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(34, 34, 34)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dolgazBorcu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mesajDogalgazLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dogalgazOdeButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(39, 39, 39)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(internetBorcu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mesajInternetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(internetOdeButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(odemelerEkraniPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(odemelerEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        ActionAyarlar.setVisible(this,new HesapEkrani());
    }//GEN-LAST:event_jLabel2MouseClicked

    private void elektrikOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elektrikOdeButtonActionPerformed
       double elektrikTutari = Double.parseDouble(this.elektrikBorcu.getText());
        if (this.faturaOncedenOdenmisMi(elektrikTutari)) {
            Dialogs.ozelMesajGoster(this, "Elektrik faturası zaten ödenmiş!");
        } else {
            this.faturayiOde("elektrik", elektrikTutari);
        }
    }//GEN-LAST:event_elektrikOdeButtonActionPerformed

    private void dogalgazOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dogalgazOdeButtonActionPerformed
       double dogalgazTutari = Double.parseDouble(this.dolgazBorcu.getText());
        if (this.faturaOncedenOdenmisMi(dogalgazTutari)) {
            Dialogs.ozelMesajGoster(this, "Doğalgaz faturası zaten ödenmiş!");
        } else {
            this.faturayiOde("dogalgaz", dogalgazTutari);
        }
    }//GEN-LAST:event_dogalgazOdeButtonActionPerformed

    private void suOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suOdeButtonActionPerformed
      double suTutari = Double.parseDouble(this.suBorcu.getText());
        if (this.faturaOncedenOdenmisMi(suTutari)) {
            Dialogs.ozelMesajGoster(this, "Su faturası zaten ödenmiş!");
        } else {
            this.faturayiOde("su", suTutari);
        }
    }//GEN-LAST:event_suOdeButtonActionPerformed

    private void internetOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internetOdeButtonActionPerformed
        double internetTutari = Double.parseDouble(this.internetBorcu.getText());
        if (this.faturaOncedenOdenmisMi(internetTutari)) {
            Dialogs.ozelMesajGoster(this, "İnternet faturası zaten ödenmiş!");
        } else {
            this.faturayiOde("internet", internetTutari);
        }             
    }//GEN-LAST:event_internetOdeButtonActionPerformed

   private boolean faturaOncedenOdenmisMi(double odenecekTutar) {
        return odenecekTutar == 0.0;
    }

    private void faturayiOde(String faturaIsmi, double faturaTutari) {
        this.getFaturaOdemeleriObject().setFaturaIsmi(faturaIsmi);
        this.getFaturaOdemeleriObject().setFaturaTutari(faturaTutari);

        if (getFaturaOdemeleriObject().faturaOdendiMi()) {
            Dialogs.ozelMesajGoster(this, "Faturanız başarıyla ödenmiştir.");
            ActionAyarlar.setVisible(this, new HesapEkrani());
        } else {
            Dialogs.ozelMesajGoster(this, "Ödeme işlemi gerçekleştirilemedi!");
        }
    }
    
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
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OdemelerEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dogalgazOdeButton;
    private javax.swing.JLabel dolgazBorcu;
    private javax.swing.JLabel elektrikBorcu;
    private javax.swing.JButton elektrikOdeButton;
    private javax.swing.JLabel internetBorcu;
    private javax.swing.JButton internetOdeButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel kullanıcıadsoyadtext;
    private javax.swing.JLabel mesajDogalgazLabel;
    private javax.swing.JLabel mesajElektrikLabel;
    private javax.swing.JLabel mesajInternetLabel;
    private javax.swing.JLabel mesajSuLabel;
    private javax.swing.JPanel odemelerEkraniPanel;
    private javax.swing.JLabel suBorcu;
    private javax.swing.JButton suOdeButton;
    // End of variables declaration//GEN-END:variables
}
