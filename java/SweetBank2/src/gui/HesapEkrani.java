/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import gui.ayarlar.ActionAyarlar;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDüzenleyici;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;


public final class HesapEkrani extends javax.swing.JFrame implements IDüzenleyici,IBilgiController{

 
    public HesapEkrani() {
        initComponents();
        getEdits();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HesapEkraniPanel = new javax.swing.JPanel();
        hosgeldinLabel = new javax.swing.JLabel();
        kullaniciLabel = new javax.swing.JLabel();
        liraIcon = new javax.swing.JLabel();
        bakiyeText = new javax.swing.JLabel();
        paracekicon = new javax.swing.JLabel();
        paracekbutton = new javax.swing.JButton();
        kasaicon = new javax.swing.JLabel();
        parayatirbutton = new javax.swing.JButton();
        havalebutton = new javax.swing.JButton();
        havaleicon = new javax.swing.JLabel();
        ödemeicon = new javax.swing.JLabel();
        ödemelerbutton = new javax.swing.JButton();
        settingsicon = new javax.swing.JLabel();
        logouticon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rebu Bank Hesap Ekranı ");

        HesapEkraniPanel.setBackground(new java.awt.Color(0, 153, 255));
        HesapEkraniPanel.setToolTipText("HesapEkraniPanel");

        hosgeldinLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        hosgeldinLabel.setForeground(new java.awt.Color(255, 255, 255));
        hosgeldinLabel.setText("HOŞGELDİN");

        kullaniciLabel.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        kullaniciLabel.setForeground(new java.awt.Color(255, 255, 255));
        kullaniciLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kullaniciLabel.setText("         [KULLANICI ADI SOYADI]");

        liraIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/lira.png"))); // NOI18N
        liraIcon.setLabelFor(liraIcon);

        bakiyeText.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bakiyeText.setText("[BAKİYE]");

        paracekicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/widtdraf.png"))); // NOI18N

        paracekbutton.setText("Para Çek");
        paracekbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paracekbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paracekbuttonMouseExited(evt);
            }
        });
        paracekbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paracekbuttonActionPerformed(evt);
            }
        });

        kasaicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/kasa.png"))); // NOI18N

        parayatirbutton.setText("Para Yatır");
        parayatirbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                parayatirbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                parayatirbuttonMouseExited(evt);
            }
        });
        parayatirbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parayatirbuttonActionPerformed(evt);
            }
        });

        havalebutton.setText("Havale Yap");
        havalebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                havalebuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                havalebuttonMouseExited(evt);
            }
        });
        havalebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                havalebuttonActionPerformed(evt);
            }
        });

        havaleicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/havale.png"))); // NOI18N

        ödemeicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/ödeme.png"))); // NOI18N

        ödemelerbutton.setText("Ödemeler");
        ödemelerbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ödemelerbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ödemelerbuttonMouseExited(evt);
            }
        });
        ödemelerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ödemelerbuttonActionPerformed(evt);
            }
        });

        settingsicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/settings.png"))); // NOI18N
        settingsicon.setLabelFor(settingsicon);
        settingsicon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsiconMouseClicked(evt);
            }
        });

        logouticon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/çıkış.png"))); // NOI18N
        logouticon.setLabelFor(logouticon);
        logouticon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logouticon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logouticonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HesapEkraniPanelLayout = new javax.swing.GroupLayout(HesapEkraniPanel);
        HesapEkraniPanel.setLayout(HesapEkraniPanelLayout);
        HesapEkraniPanelLayout.setHorizontalGroup(
            HesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                .addGroup(HesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(logouticon)
                        .addGap(87, 87, 87)
                        .addGroup(HesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(hosgeldinLabel))
                            .addComponent(kullaniciLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addComponent(settingsicon))
                    .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(liraIcon)
                        .addGap(12, 12, 12)
                        .addComponent(bakiyeText, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(paracekicon)
                        .addGap(70, 70, 70)
                        .addComponent(kasaicon)
                        .addGap(62, 62, 62)
                        .addComponent(havaleicon)
                        .addGap(70, 70, 70)
                        .addComponent(ödemeicon))
                    .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(paracekbutton)
                        .addGap(117, 117, 117)
                        .addComponent(parayatirbutton)
                        .addGap(102, 102, 102)
                        .addComponent(havalebutton)
                        .addGap(109, 109, 109)
                        .addComponent(ödemelerbutton)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        HesapEkraniPanelLayout.setVerticalGroup(
            HesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(HesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logouticon)
                    .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(hosgeldinLabel)
                        .addGap(12, 12, 12)
                        .addComponent(kullaniciLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(settingsicon))
                .addGap(45, 45, 45)
                .addGroup(HesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(liraIcon)
                    .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(bakiyeText)))
                .addGap(40, 40, 40)
                .addGroup(HesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paracekicon)
                    .addComponent(kasaicon)
                    .addComponent(havaleicon)
                    .addComponent(ödemeicon))
                .addGap(6, 6, 6)
                .addGroup(HesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paracekbutton)
                    .addComponent(parayatirbutton)
                    .addComponent(havalebutton)
                    .addComponent(ödemelerbutton))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HesapEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HesapEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getEdits() {

         this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        HesapEkraniPanel.setFocusable(true);
        this.kullaniciLabel.setText(getHesapBilgileri().getAdSoyad());
        this.bakiyeText.setText(String.valueOf(getHesapBilgileri().getBakiye()));
    }
    
    
    @Override
    public boolean bilgilerGecerliMi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }
    
//button yönlendirme
    private void paracekbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paracekbuttonActionPerformed
      ActionAyarlar.setVisible(this, new ParaCekmeEkrani());
    }//GEN-LAST:event_paracekbuttonActionPerformed

    private void parayatirbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parayatirbuttonActionPerformed
        ActionAyarlar.setVisible(this, new ParaYatirmaEkrani());
    }//GEN-LAST:event_parayatirbuttonActionPerformed

    private void havalebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_havalebuttonActionPerformed
       ActionAyarlar.setVisible(this, new HavaleEkrani());
    }//GEN-LAST:event_havalebuttonActionPerformed

    private void ödemelerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ödemelerbuttonActionPerformed
        ActionAyarlar.setVisible(this, new OdemelerEkrani());
    }//GEN-LAST:event_ödemelerbuttonActionPerformed
//Button Renkledirmeleri
    private void setBgFg(Component c){
        ButtonAyarlari.setBgFg((JButton)c, Color.orange,Color.black);  
      
    }
    private void paracekbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paracekbuttonMouseEntered
        this.setBgFg(evt.getComponent());
        
    }//GEN-LAST:event_paracekbuttonMouseEntered

    private void paracekbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paracekbuttonMouseExited
       ButtonAyarlari.setOriginalBg((JButton) evt.getComponent());
       
    }//GEN-LAST:event_paracekbuttonMouseExited

    private void parayatirbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parayatirbuttonMouseEntered
       this.setBgFg(evt.getComponent());
       
    }//GEN-LAST:event_parayatirbuttonMouseEntered

    private void parayatirbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parayatirbuttonMouseExited
        ButtonAyarlari.setOriginalBg((JButton) evt.getComponent());
       
    }//GEN-LAST:event_parayatirbuttonMouseExited

    private void havalebuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_havalebuttonMouseEntered
       this.setBgFg(evt.getComponent());
     
    }//GEN-LAST:event_havalebuttonMouseEntered

    private void havalebuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_havalebuttonMouseExited
       ButtonAyarlari.setOriginalBg((JButton) evt.getComponent());
       
    }//GEN-LAST:event_havalebuttonMouseExited

    private void ödemelerbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ödemelerbuttonMouseEntered
           this.setBgFg(evt.getComponent());
           
    }//GEN-LAST:event_ödemelerbuttonMouseEntered

    private void ödemelerbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ödemelerbuttonMouseExited
       ButtonAyarlari.setOriginalBg((JButton) evt.getComponent());
               

    }//GEN-LAST:event_ödemelerbuttonMouseExited

    private void logouticonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logouticonMouseClicked
       String question = "Hesabınızdan çıkış yapılacaktır\nOnaylıyor musunuz?";
        if (Dialogs.onayMesajiGoster(this, question) == 1) {
            this.cikisYap();
        }
    
    }//GEN-LAST:event_logouticonMouseClicked

    private void cikisYap() {
        getHesapBilgileri().cikisYap();
        ActionAyarlar.setVisible(this, new GirisEkrani());
    }
    private void settingsiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsiconMouseClicked
      ActionAyarlar.setVisible(this, new AyarlarEkrani());
    }//GEN-LAST:event_settingsiconMouseClicked

    
    
 
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
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HesapEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HesapEkraniPanel;
    private javax.swing.JLabel bakiyeText;
    private javax.swing.JButton havalebutton;
    private javax.swing.JLabel havaleicon;
    private javax.swing.JLabel hosgeldinLabel;
    private javax.swing.JLabel kasaicon;
    private javax.swing.JLabel kullaniciLabel;
    private javax.swing.JLabel liraIcon;
    private javax.swing.JLabel logouticon;
    private javax.swing.JButton paracekbutton;
    private javax.swing.JLabel paracekicon;
    private javax.swing.JButton parayatirbutton;
    private javax.swing.JLabel settingsicon;
    private javax.swing.JLabel ödemeicon;
    private javax.swing.JButton ödemelerbutton;
    // End of variables declaration//GEN-END:variables
}
