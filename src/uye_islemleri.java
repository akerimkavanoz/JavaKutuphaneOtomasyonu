
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class uye_islemleri extends javax.swing.JFrame {

    String uyeid;
    String message;

    public uye_islemleri() {
        initComponents();
    }

    public uye_islemleri(String kisiid) {
        initComponents();
        uyeid = kisiid;
        if (uyeid == null){
            System.out.println(uyeid);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bilgileri_guncelle = new javax.swing.JButton();
        kitap_arama = new javax.swing.JButton();
        kitap_al = new javax.swing.JButton();
        kitap_iade = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        girilen_barkod_no = new javax.swing.JTextField();
        cikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kullanıcı İşlemleri");
        setLocation(new java.awt.Point(600, 300));
        setResizable(false);

        bilgileri_guncelle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bilgileri_guncelle.setText("Bilgilerini Düzenle");
        bilgileri_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilgileri_guncelleActionPerformed(evt);
            }
        });

        kitap_arama.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kitap_arama.setText("Kitap Arama");
        kitap_arama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_aramaActionPerformed(evt);
            }
        });

        kitap_al.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kitap_al.setText("Kitap Al");
        kitap_al.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_alActionPerformed(evt);
            }
        });

        kitap_iade.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kitap_iade.setText("Kitap İade");
        kitap_iade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_iadeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Aldığın Kitabın Barkod Numarası:");

        girilen_barkod_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                girilen_barkod_noKeyPressed(evt);
            }
        });

        cikis.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cikis.setText("Oturumdan Çıkış Yapmak İçin Tıklayınız");
        cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(kitap_al, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                        .addComponent(kitap_arama, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                        .addComponent(kitap_iade, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(girilen_barkod_no, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(cikis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(bilgileri_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(bilgileri_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kitap_arama, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kitap_al, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kitap_iade, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(girilen_barkod_no, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private kisi kisiBilgi(String id) {
        kisi result = new kisi();
         uyeid = id;
       
        File inputFile = new File("kisiler.xml");

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputFile);

            Element kokElement = document.getDocumentElement();

            NodeList kisiListesi = kokElement.getElementsByTagName("kisi");

            String kisiid, kisi_ad, kisi_soyad, kisi_sifre, kisi_bolum, kisi_sinif;
            
            for (int i = 0; i < kisiListesi.getLength(); i++) {
                Node kisi = kisiListesi.item(i);
                Element kisiElement = (Element) kisi;
                kisiid = kisiElement.getElementsByTagName("id").item(0).getTextContent();
                kisi_ad  = kisiElement.getElementsByTagName("isim").item(0).getTextContent();
                kisi_soyad = kisiElement.getElementsByTagName("soyisim").item(0).getTextContent();
                kisi_sifre = kisiElement.getElementsByTagName("sifre").item(0).getTextContent();
                kisi_bolum = kisiElement.getElementsByTagName("bolum").item(0).getTextContent();
                kisi_sinif = kisiElement.getElementsByTagName("sinif").item(0).getTextContent();
                
                if (kisiid.equals(uyeid)) {
                    result.setKullanici_id(kisiid);
                    result.setKullanici_adi(kisi_ad);
                    result.setKullanici_sifresi(kisi_sifre);
                    result.setKullanici_soyadi(kisi_soyad);
                    result.setKullanici_bolumu(kisi_bolum);
                    result.setKullanici_sinifi(kisi_sinif);
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
    
    private void bilgileri_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilgileri_guncelleActionPerformed
        setVisible(false);
        kisi gidenkisi = kisiBilgi(uyeid);
        uye_duzenleme ud = new uye_duzenleme(gidenkisi);
        ud.setVisible(true);
    }//GEN-LAST:event_bilgileri_guncelleActionPerformed

    private void kitap_aramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_aramaActionPerformed
        setVisible(false);
        kitap_arama ka = new kitap_arama(uyeid);
        ka.setVisible(true);
    }//GEN-LAST:event_kitap_aramaActionPerformed

    private void kitap_alActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_alActionPerformed
        setVisible(false);
        kitap_alma ka = new kitap_alma(uyeid);
        System.out.println("id:" + uyeid);
        ka.setVisible(true);
    }//GEN-LAST:event_kitap_alActionPerformed

    private void kitap_iadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_iadeActionPerformed
        setVisible(false);
        kitap_iade ki = new kitap_iade(uyeid);
        ki.setVisible(true);
    }//GEN-LAST:event_kitap_iadeActionPerformed

    private void girilen_barkod_noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_girilen_barkod_noKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String barkod = girilen_barkod_no.getText();
            kitap giden = kitapBul(barkod, uyeid);

            if (isExist) {
                setVisible(false);
                uye_alinan_kitap_bilgi ac = new uye_alinan_kitap_bilgi(giden, uyeid);
                ac.setVisible(true);
            }
        }
    }//GEN-LAST:event_girilen_barkod_noKeyPressed

    private void cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisActionPerformed
        message = "Oturumdan Çıkış Yapıldı..";
        JOptionPane.showMessageDialog(this, message);
        setVisible(false);
        kullanici_giris kg = new kullanici_giris();
        kg.setVisible(true);
    }//GEN-LAST:event_cikisActionPerformed
    boolean isExist;

    private kitap kitapBul(String barkod, String id) {
        File inputFile = new File("kitaplar.xml");

        kitap gercekKitap = new kitap();
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputFile);

            Element kokElement = document.getDocumentElement();

            NodeList kitapListesi = kokElement.getElementsByTagName("kitap");

            isExist = false;
            String barkod_no, kitap_ismi, kitap_yazari, kitap_turu, kitap_y_yili, kitap_s_sayisi, kitap_dili, alinanid;

            for (int i = 0; i < kitapListesi.getLength(); i++) {
                Node kitap = kitapListesi.item(i);
                Element kitapElement = (Element) kitap;
                barkod_no = kitapElement.getElementsByTagName("barkod").item(0).getTextContent();
                alinanid = kitapElement.getElementsByTagName("alankisiid").item(0).getTextContent();

                if (barkod_no.equals(barkod) && id.equals(alinanid)) {
                    isExist = true;
                    gercekKitap = new kitap();
                    barkod_no = kitapElement.getElementsByTagName("barkod").item(0).getTextContent();
                    kitap_ismi = kitapElement.getElementsByTagName("isim").item(0).getTextContent();
                    kitap_yazari = kitapElement.getElementsByTagName("yazar").item(0).getTextContent();
                    kitap_turu = kitapElement.getElementsByTagName("tur").item(0).getTextContent();
                    kitap_y_yili = kitapElement.getElementsByTagName("yayinyili").item(0).getTextContent();
                    kitap_dili = kitapElement.getElementsByTagName("dili").item(0).getTextContent();
                    kitap_s_sayisi = kitapElement.getElementsByTagName("sayfasayisi").item(0).getTextContent();

                    gercekKitap.setBarkodno(barkod_no);
                    gercekKitap.setKitapadi(kitap_ismi);
                    gercekKitap.setDil(kitap_dili);
                    gercekKitap.setKitaptur(kitap_turu);
                    gercekKitap.setSayfasayisi(kitap_s_sayisi);
                    gercekKitap.setKitapyazari(kitap_yazari);
                    gercekKitap.setYayinyili(kitap_y_yili);
                } else {
                    continue;
                }
            }
            if (isExist == true) {
                message = "Girilen barkodda kitap bulundu.";
                JOptionPane.showMessageDialog(this, message);
            } else {
                message = "Girilen barkodda kitap bulunamadı.";
                JOptionPane.showMessageDialog(this, message, "Hata", JOptionPane.ERROR_MESSAGE);
                girilen_barkod_no.setText("");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return gercekKitap;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uye_islemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bilgileri_guncelle;
    private javax.swing.JButton cikis;
    private javax.swing.JTextField girilen_barkod_no;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kitap_al;
    private javax.swing.JButton kitap_arama;
    private javax.swing.JButton kitap_iade;
    // End of variables declaration//GEN-END:variables
}
