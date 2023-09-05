
package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.ParaYatirma;
import gui.ayarlar.ActionAyarlar;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDüzenleyici;
import gui.ayarlar.TextAyarlari;


public final class ParaYatirmaEkrani extends javax.swing.JFrame implements IDüzenleyici,IBilgiController{

    private ParaYatirma paraYatirmaObject = null;
    
    private int yatirilacakMiktar = 0;
    public ParaYatirmaEkrani() {
        initComponents();
    }

    @Override
    public void getEdits() {

        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        paraYatirmaEkraniPanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(yatirilacakparamiktari);
        TextAyarlari.setMaxLimit(yatirilacakparamiktari, 5);
        this.kullanıcıadsoyadtext.setText("Sayın " + getHesapBilgileri().getAdSoyad());
        this.bakiyetext.setText(String.valueOf(getHesapBilgileri().getBakiye()));
        
    }
    
     @Override
    public boolean bilgilerGecerliMi() {
        return !(this.yatirilacakparamiktari.getText().equals(""));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public ParaYatirma getParaYatirmaObject() {
        if(this.paraYatirmaObject == null) {
            paraYatirmaObject = new ParaYatirma();
        }
        return paraYatirmaObject;
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        paraYatirmaEkraniPanel = new javax.swing.JPanel();
        kullanıcıadsoyadtext = new javax.swing.JLabel();
        yatirmamiktartext = new javax.swing.JLabel();
        uyarıtext = new javax.swing.JLabel();
        bakiyetext = new javax.swing.JLabel();
        toplambakiyetext = new javax.swing.JLabel();
        yatirilacakparamiktari = new javax.swing.JTextField();
        parayatirbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paraYatirmaEkraniPanel.setBackground(new java.awt.Color(51, 153, 255));
        paraYatirmaEkraniPanel.setForeground(new java.awt.Color(255, 255, 255));

        kullanıcıadsoyadtext.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        kullanıcıadsoyadtext.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullanıcıadsoyadtext.setText("Sayın[KULLANICI ADI SOYADI]");

        yatirmamiktartext.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        yatirmamiktartext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yatirmamiktartext.setText("Yatıracağınız Miktar:");

        uyarıtext.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        uyarıtext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uyarıtext.setText("Tek seferde 40.000TL ve altını yatırabilirsiniz");

        bakiyetext.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bakiyetext.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bakiyetext.setText("[BAKİYE]");
        bakiyetext.setToolTipText("");

        toplambakiyetext.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        toplambakiyetext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        toplambakiyetext.setText("Toplam Bakiyeniz:");

        yatirilacakparamiktari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yatirilacakparamiktariActionPerformed(evt);
            }
        });
        yatirilacakparamiktari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                yatirilacakparamiktariKeyReleased(evt);
            }
        });

        parayatirbutton.setText("PARA YATIR");
        parayatirbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        parayatirbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parayatirbuttonActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/geriicon2.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paraYatirmaEkraniPanelLayout = new javax.swing.GroupLayout(paraYatirmaEkraniPanel);
        paraYatirmaEkraniPanel.setLayout(paraYatirmaEkraniPanelLayout);
        paraYatirmaEkraniPanelLayout.setHorizontalGroup(
            paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                                .addComponent(yatirmamiktartext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(parayatirbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yatirilacakparamiktari, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                                .addComponent(toplambakiyetext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bakiyetext, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(kullanıcıadsoyadtext, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uyarıtext))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        paraYatirmaEkraniPanelLayout.setVerticalGroup(
            paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(kullanıcıadsoyadtext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(uyarıtext)
                .addGap(58, 58, 58)
                .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bakiyetext)
                    .addComponent(toplambakiyetext))
                .addGap(49, 49, 49)
                .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yatirmamiktartext, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yatirilacakparamiktari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(parayatirbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraYatirmaEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraYatirmaEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yatirilacakparamiktariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yatirilacakparamiktariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yatirilacakparamiktariActionPerformed

    private void yatirilacakparamiktariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yatirilacakparamiktariKeyReleased
        this.yatirilacakMiktar = TextAyarlari.checkTheTextKeyReleased(yatirilacakparamiktari, 40000);

    }//GEN-LAST:event_yatirilacakparamiktariKeyReleased

    private void parayatirbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parayatirbuttonActionPerformed
          if(this.bilgilerGecerliMi()) {
            this.paraYatir();
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
        }
    }//GEN-LAST:event_parayatirbuttonActionPerformed

    private void paraYatir() {
        this.getParaYatirmaObject().setYatirilacakMiktar(this.yatirilacakMiktar);
        
        if(getParaYatirmaObject().paraYatirildiMi()) {
            Dialogs.ozelMesajGoster(this, "Para başarıyla hesabınıza tanımlanmıştır.\nYatırılan miktar:" + this.yatirilacakMiktar + " TL");
            ActionAyarlar.setVisible(this, new HesapEkrani());
        } else {
            Dialogs.ozelMesajGoster(this, "Bilgilerinizi kontrol edin!");
        }
    }

    
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        ActionAyarlar.setVisible(this,new HesapEkrani());
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParaYatirmaEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bakiyetext;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kullanıcıadsoyadtext;
    private javax.swing.JPanel paraYatirmaEkraniPanel;
    private javax.swing.JButton parayatirbutton;
    private javax.swing.JLabel toplambakiyetext;
    private javax.swing.JLabel uyarıtext;
    private javax.swing.JTextField yatirilacakparamiktari;
    private javax.swing.JLabel yatirmamiktartext;
    // End of variables declaration//GEN-END:variables
}
