/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.KullaniciBasvuru;
import gui.ayarlar.ActionAyarlar;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDüzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;


public final class BasvuruEkrani extends javax.swing.JFrame implements IDüzenleyici,IBilgiController{

    private KullaniciBasvuru kullaniciBasvuruObject = null;
    
    public BasvuruEkrani() {
        initComponents();
        getEdits();
        
    }
    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        basvuruEkraniPanel.setFocusable(true);
        TextAyarlari.setOnlyAlphabetic(AdText);
        TextAyarlari.setOnlyNumber(TcText);
        TextAyarlari.setOnlyNumber(TelText);
        TextAyarlari.setMaxLimit(TcText, 11);
        TextAyarlari.setMaxLimit(TelText, 11);
        
    }

    public KullaniciBasvuru getKullaniciBasvuruObject() {
        if(this.kullaniciBasvuruObject==null){
            kullaniciBasvuruObject = new KullaniciBasvuru();
        }
        return kullaniciBasvuruObject;
    }

    @Override
    public boolean bilgilerGecerliMi() {

        return TextAyarlari.textAlanlariDolumu(basvuruEkraniPanel);

    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }
    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basvuruEkraniPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TcText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TelText = new javax.swing.JTextField();
        guvenlikText = new javax.swing.JLabel();
        guvenlikSorusu = new javax.swing.JLabel();
        GuvenlikSorusuCombo = new javax.swing.JComboBox<>();
        kisiselText = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AdText = new javax.swing.JTextField();
        cevapLabel = new javax.swing.JLabel();
        cevaptext = new javax.swing.JTextField();
        basvurbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RebuBankBasvuruEkrani");

        basvuruEkraniPanel.setBackground(new java.awt.Color(0, 153, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("T.C No:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Telefon No:");

        guvenlikText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        guvenlikText.setText("Güvenlik Bilgileri");

        guvenlikSorusu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        guvenlikSorusu.setText("Güvenlik Sorusu :");

        GuvenlikSorusuCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Evcil hayvanınızın adı nedir?", "En sevdiğiniz nesne nedir?", "İlkokul öğretmeninizin sıyadı nedir?", "Yaşamak istediğiniz yer neresidir?", "Ya da rastgele cümle girin(önerilir)", " " }));

        kisiselText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kisiselText.setText("Kişisel Bilgiler");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Ad Soyad :");

        cevapLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cevapLabel.setText("Cevap:");

        basvurbutton.setText("BAŞVUR");
        basvurbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        basvurbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                basvurbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                basvurbuttonMouseExited(evt);
            }
        });
        basvurbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basvurbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout basvuruEkraniPanelLayout = new javax.swing.GroupLayout(basvuruEkraniPanel);
        basvuruEkraniPanel.setLayout(basvuruEkraniPanelLayout);
        basvuruEkraniPanelLayout.setHorizontalGroup(
            basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(guvenlikSorusu)
                    .addComponent(guvenlikText)
                    .addComponent(cevapLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(basvurbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cevaptext, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basvuruEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GuvenlikSorusuCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(kisiselText)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TcText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TelText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(116, 116, 116))
        );
        basvuruEkraniPanelLayout.setVerticalGroup(
            basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basvuruEkraniPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(kisiselText)
                .addGap(18, 18, 18)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(AdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TcText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(guvenlikText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guvenlikSorusu)
                    .addComponent(GuvenlikSorusuCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cevapLabel)
                    .addComponent(cevaptext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(basvurbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basvuruEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basvuruEkraniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    

    private void basvurbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basvurbuttonActionPerformed
        if (this.bilgilerGecerliMi()) {
            this.basvuruyuGerceklestir();
        }else{
            Dialogs.bosOlamazMesajiGoster(this);
        }
        
    }//GEN-LAST:event_basvurbuttonActionPerformed

    private void basvuruyuGerceklestir(){
        //kişisel bilgiler
        this.getKullaniciBasvuruObject().setAdSoyad(this.AdText.getText().trim());
        this.getKullaniciBasvuruObject().setTcNo(this.TcText.getText());
        this.getKullaniciBasvuruObject().setTelNo(this.TelText.getText());

        //güvenlik bilgileri
        this.getKullaniciBasvuruObject().setGuvenlikSorusu(this.guvenlikSorusu.getText());
        this.getKullaniciBasvuruObject().setGuvenlikCevap(this.cevaptext.getText().trim());

        //sistem tarafından verilecek bilgiler
        this.getKullaniciBasvuruObject().setMusteriNo(this.randomMusteriNoAl());
        this.getKullaniciBasvuruObject().setSifre(this.randomSifreAl());

        if (this.getKullaniciBasvuruObject().basvuruOnaylandiMi()) {
            Dialogs.ozelMesajGoster(this, "Başvurunuz kabul edilmiştir.\nMüşteri Numaranız:" + this.getKullaniciBasvuruObject().getMusteriNo()
                    + "\nŞifreniz:" + this.getKullaniciBasvuruObject().getSifre());
            ActionAyarlar.setVisible(this, new GirisEkrani());
        } else {
            Dialogs.ozelMesajGoster(this, "Başvurunuz kabul edilmemiştir.\nLütfen bilgilerinizi kontrol edin!");
        }
    }
     private String randomMusteriNoAl() {
        String musteriNo;
        do {
            musteriNo = String.valueOf(1000000 + (int) (Math.random() * 9000000));
        } while (this.getKullaniciBasvuruObject().musteriNoTablodaVarMi());
        return musteriNo;
    }
     
     private String randomSifreAl() {
        String sifre;
        sifre = String.valueOf(1000 + (int) (Math.random() * 9000));
        return sifre;
    }
    
    private void basvurbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurbuttonMouseEntered
        ButtonAyarlari.setBgFg(basvurbutton, Color.orange, Color.black);
    }//GEN-LAST:event_basvurbuttonMouseEntered

    private void basvurbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurbuttonMouseExited
        ButtonAyarlari.setOriginalBg(basvurbutton);
    }//GEN-LAST:event_basvurbuttonMouseExited

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
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasvuruEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdText;
    private javax.swing.JComboBox<String> GuvenlikSorusuCombo;
    private javax.swing.JTextField TcText;
    private javax.swing.JTextField TelText;
    private javax.swing.JButton basvurbutton;
    private javax.swing.JPanel basvuruEkraniPanel;
    private javax.swing.JLabel cevapLabel;
    private javax.swing.JTextField cevaptext;
    private javax.swing.JLabel guvenlikSorusu;
    private javax.swing.JLabel guvenlikText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel kisiselText;
    // End of variables declaration//GEN-END:variables
}
