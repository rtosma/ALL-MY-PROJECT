/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.ParaCekme;
import gui.ayarlar.ActionAyarlar;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDüzenleyici;
import gui.ayarlar.TextAyarlari;



public final class ParaCekmeEkrani extends javax.swing.JFrame implements  IDüzenleyici,IBilgiController{

        private ParaCekme paraCekmeObject = null;
    
    private int cekilecekMiktar = 0;
   
    public ParaCekmeEkrani() {
        initComponents();
        getEdits();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paraCekmeEkraniPanel = new javax.swing.JPanel();
        kullanıcıadsoyadtext = new javax.swing.JLabel();
        miktartext = new javax.swing.JLabel();
        uyarıtext = new javax.swing.JLabel();
        bakiyetext = new javax.swing.JLabel();
        toplambakiyetext = new javax.swing.JLabel();
        paramiktari = new javax.swing.JTextField();
        paracekbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paraCekmeEkraniPanel.setBackground(new java.awt.Color(51, 153, 255));
        paraCekmeEkraniPanel.setForeground(new java.awt.Color(255, 255, 255));

        kullanıcıadsoyadtext.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        kullanıcıadsoyadtext.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullanıcıadsoyadtext.setText("Sayın[KULLANICI ADI SOYADI]");

        miktartext.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        miktartext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        miktartext.setText("Çekeceğiniz Miktar:");

        uyarıtext.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        uyarıtext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uyarıtext.setText("Tek seferde 5000TL ve altını çekebilirsiniz");

        bakiyetext.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bakiyetext.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bakiyetext.setText("[BAKİYE]");
        bakiyetext.setToolTipText("");

        toplambakiyetext.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        toplambakiyetext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        toplambakiyetext.setText("Toplam Bakiyeniz:");

        paramiktari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paramiktariActionPerformed(evt);
            }
        });
        paramiktari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paramiktariKeyReleased(evt);
            }
        });

        paracekbutton.setText("PARA ÇEK");
        paracekbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paracekbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paracekbuttonActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/geriicon2.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paraCekmeEkraniPanelLayout = new javax.swing.GroupLayout(paraCekmeEkraniPanel);
        paraCekmeEkraniPanel.setLayout(paraCekmeEkraniPanelLayout);
        paraCekmeEkraniPanelLayout.setHorizontalGroup(
            paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                                .addComponent(miktartext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(paracekbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(paramiktari, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                                .addComponent(toplambakiyetext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bakiyetext, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(kullanıcıadsoyadtext, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uyarıtext))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        paraCekmeEkraniPanelLayout.setVerticalGroup(
            paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(kullanıcıadsoyadtext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(uyarıtext)
                .addGap(58, 58, 58)
                .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bakiyetext)
                    .addComponent(toplambakiyetext))
                .addGap(49, 49, 49)
                .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(miktartext, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paramiktari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(paracekbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraCekmeEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraCekmeEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getEdits() {

        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        paraCekmeEkraniPanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(paramiktari);
        TextAyarlari.setMaxLimit(paramiktari, 4);
        this.kullanıcıadsoyadtext.setText("Sayın " + this.getHesapBilgileri().getAdSoyad());
        this.bakiyetext.setText(String.valueOf(this.getHesapBilgileri().getBakiye()));
    }
    
    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.bakiyetext.getText().equals(""));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public ParaCekme getParaCekmeObject() {
        if(this.paraCekmeObject == null) {
            paraCekmeObject = new ParaCekme();
        }
        return paraCekmeObject;
    }
    
    private void paramiktariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paramiktariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paramiktariActionPerformed

    private void paramiktariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paramiktariKeyReleased
       this.cekilecekMiktar = TextAyarlari.checkTheTextKeyReleased(paramiktari, 5000);
     
       
    }//GEN-LAST:event_paramiktariKeyReleased

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        ActionAyarlar.setVisible(this,new HesapEkrani());
    }//GEN-LAST:event_jLabel2MouseClicked

    private void paracekbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paracekbuttonActionPerformed
        if(this.bilgilerGecerliMi()) {
            this.paraCek();
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
        }
    }//GEN-LAST:event_paracekbuttonActionPerformed

    private void paraCek() {
        this.getParaCekmeObject().setCekilecekMiktar(cekilecekMiktar);
        
        if(getParaCekmeObject().paraCekildiMi()) {
            Dialogs.ozelMesajGoster(this, "Para çekme işlemi tamamlandı.\nÇekilen miktar:" + this.cekilecekMiktar + " TL");
            ActionAyarlar.setVisible(this, new HesapEkrani());
        } else {
            Dialogs.ozelMesajGoster(this, "Bakiyeniz yeterli değil!");
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
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParaCekmeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bakiyetext;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel kullanıcıadsoyadtext;
    private javax.swing.JLabel miktartext;
    private javax.swing.JPanel paraCekmeEkraniPanel;
    private javax.swing.JButton paracekbutton;
    private javax.swing.JTextField paramiktari;
    private javax.swing.JLabel toplambakiyetext;
    private javax.swing.JLabel uyarıtext;
    // End of variables declaration//GEN-END:variables
}
