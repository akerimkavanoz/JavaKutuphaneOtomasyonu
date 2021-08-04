
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class kitap_duzenleme extends javax.swing.JFrame {

    public kitap_duzenleme() {
        initComponents();
    }

    public kitap_duzenleme(kitap gelenKitap) {
        initComponents();
        kitap_barkod_no.setText(gelenKitap.getBarkodno());
        kitap_barkod_no.setEditable(false);
        kitap_barkod_no.setBackground(Color.YELLOW);
        kitap_ismi.setText(gelenKitap.getKitapadi());
        kitap_yazari.setText(gelenKitap.getKitapyazari());
        kitap_turu.setText(gelenKitap.getKitaptur());
        kitap_yayin_yili.setText(gelenKitap.getYayinyili());
        kitap_dili.setText(gelenKitap.getDil());
        kitap_sayfa_sayisi.setText(gelenKitap.getSayfasayisi());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        geri = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        kitap_barkod_no = new javax.swing.JTextField();
        kitap_ismi = new javax.swing.JTextField();
        kitap_yazari = new javax.swing.JTextField();
        kitap_turu = new javax.swing.JTextField();
        kitap_yayin_yili = new javax.swing.JTextField();
        kitap_dili = new javax.swing.JTextField();
        kitap_sayfa_sayisi = new javax.swing.JTextField();
        bilgileri_guncelle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kitap Bilgileri Düzenleme");
        setLocation(new java.awt.Point(600, 300));
        setResizable(false);

        geri.setText("Geri");
        geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("KİTAP BİLGİLERİ DÜZENLEME");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Kitabın Barkod Numarası:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Kitabın İsmi:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Kitabın Yazarı:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Kitabın Türü:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Kitabın Yayın Yılı:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Kitabın Dili:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Kitabın Sayfa Sayısı:");

        kitap_barkod_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kitap_ismi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kitap_yazari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kitap_turu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kitap_yayin_yili.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kitap_dili.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kitap_sayfa_sayisi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        bilgileri_guncelle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bilgileri_guncelle.setText("Bilgileri Güncelle");
        bilgileri_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilgileri_guncelleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(geri)
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addGap(190, 190, 190))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kitap_barkod_no, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(kitap_ismi)
                            .addComponent(kitap_yazari)
                            .addComponent(kitap_turu)
                            .addComponent(kitap_yayin_yili)
                            .addComponent(kitap_dili)
                            .addComponent(kitap_sayfa_sayisi)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(bilgileri_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(geri)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kitap_barkod_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(kitap_ismi, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(kitap_yazari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(kitap_turu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(kitap_yayin_yili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(kitap_dili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(kitap_sayfa_sayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bilgileri_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriActionPerformed
        setVisible(false);
        kitap_islemleri ki = new kitap_islemleri();
        ki.setVisible(true);
    }//GEN-LAST:event_geriActionPerformed

    private void bilgileri_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilgileri_guncelleActionPerformed

        String k_b_no = kitap_barkod_no.getText();
        String k_isim = kitap_ismi.getText();
        String k_yazar = kitap_yazari.getText();
        String k_turu = kitap_turu.getText();
        String k_y_yili = kitap_yayin_yili.getText();
        String k_dili = kitap_dili.getText();
        String k_s_sayisi = kitap_sayfa_sayisi.getText();
        String message;

        File inputFile = new File("kitaplar.xml");
        if (k_b_no.length() > 0 && k_isim.length() > 0 && k_yazar.length() > 0 && k_turu.length() > 0
                && k_y_yili.length() > 0 && k_dili.length() > 0 && k_s_sayisi.length() > 0) {
            try {
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document document = builder.parse(inputFile);

                Element kokElement = document.getDocumentElement();

                NodeList kitapListesi = kokElement.getElementsByTagName("kitap");

                boolean isExist = false;
                for (int i = 0; i < kitapListesi.getLength(); i++) {
                    Node kitap = kitapListesi.item(i);
                    Element kitapElement = (Element) kitap;
                    String barkod_no = kitapElement.getElementsByTagName("barkod").item(0).getTextContent();

                    if (barkod_no.equals(k_b_no)) {

                        Node name = kitapElement.getElementsByTagName("isim").item(0).getFirstChild();
                        name.setNodeValue(k_isim);

                        Node author = kitapElement.getElementsByTagName("yazar").item(0).getFirstChild();
                        author.setNodeValue(k_yazar);

                        Node type = kitapElement.getElementsByTagName("tur").item(0).getFirstChild();
                        type.setNodeValue(k_turu);

                        Node release_year = kitapElement.getElementsByTagName("yayinyili").item(0).getFirstChild();
                        release_year.setNodeValue(k_y_yili);

                        Node language = kitapElement.getElementsByTagName("dili").item(0).getFirstChild();
                        language.setNodeValue(k_dili);

                        Node number_pages = kitapElement.getElementsByTagName("sayfasayisi").item(0).getFirstChild();
                        number_pages.setNodeValue(k_s_sayisi);
                        isExist = true;
                        break;
                    }
                }
                if (isExist == true) {
                    message = "Kitap bilgileri başarıyla güncellendi.";
                    JOptionPane.showMessageDialog(this, message);
                    kitap_ismi.setText("");
                    kitap_yazari.setText("");
                    kitap_turu.setText("");
                    kitap_yayin_yili.setText("");
                    kitap_dili.setText("");
                    kitap_sayfa_sayisi.setText("");
                }
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
                DOMSource source = new DOMSource(document);

                StreamResult result = new StreamResult(new PrintWriter(new FileOutputStream(inputFile, false)));

                transformer.transform(source, result);

            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else {
            message = "Lütfen tüm bilgileri doldurunuz.";
            JOptionPane.showMessageDialog(this, message, "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bilgileri_guncelleActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kitap_duzenleme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bilgileri_guncelle;
    private javax.swing.JButton geri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField kitap_barkod_no;
    private javax.swing.JTextField kitap_dili;
    private javax.swing.JTextField kitap_ismi;
    private javax.swing.JTextField kitap_sayfa_sayisi;
    private javax.swing.JTextField kitap_turu;
    private javax.swing.JTextField kitap_yayin_yili;
    private javax.swing.JTextField kitap_yazari;
    // End of variables declaration//GEN-END:variables
}
