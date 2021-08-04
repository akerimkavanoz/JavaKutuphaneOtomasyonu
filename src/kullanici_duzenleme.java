
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
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
import javax.swing.JOptionPane;

public class kullanici_duzenleme extends javax.swing.JFrame {

    public kullanici_duzenleme() {
        initComponents();

    }

    public kullanici_duzenleme(kisi gelenKisi) {
        initComponents();
        kullanici_id.setText(gelenKisi.getKullanici_id());
        kullanici_id.setEditable(false);
        kullanici_id.setBackground(Color.YELLOW);
        kullanici_adi.setText(gelenKisi.getKullanici_adi());
        kullanici_soyadi.setText(gelenKisi.getKullanici_soyadi());
        kullanici_sifresi.setText(gelenKisi.getKullanici_sifresi());
        kullanici_bolumu.setText(gelenKisi.getKullanici_bolumu());
        kullanici_sinifi.setText(gelenKisi.getKullanici_sinifi());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kullanici_adi = new javax.swing.JTextField();
        kullanici_soyadi = new javax.swing.JTextField();
        kullanici_sifresi = new javax.swing.JPasswordField();
        kullanici_bolumu = new javax.swing.JTextField();
        kullanici_sinifi = new javax.swing.JTextField();
        sifre_goster = new javax.swing.JCheckBox();
        bilgileri_guncelle = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        kullanici_id = new javax.swing.JTextField();
        geri = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kullanıcı Bilgileri Düzenleme");
        setLocation(new java.awt.Point(600, 300));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Kullanıcı Adı:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Kullanıcı Soyadı:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Kullanıcı Şifresi:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Kullanıcı Bölümü:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Kullanıcı Sınıfı:");

        kullanici_adi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kullanici_soyadi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kullanici_sifresi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kullanici_bolumu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kullanici_sinifi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        sifre_goster.setText("Şifreyi Göster");
        sifre_goster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifre_gosterActionPerformed(evt);
            }
        });

        bilgileri_guncelle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bilgileri_guncelle.setText("Bilgileri Güncelle");
        bilgileri_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilgileri_guncelleActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Kullanıcı ID:");

        kullanici_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        geri.setText("Geri");
        geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("KULLANICI BİLGİLERİ DÜZENLEME");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geri)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kullanici_bolumu, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(kullanici_sifresi)
                            .addComponent(kullanici_id)
                            .addComponent(kullanici_adi)
                            .addComponent(kullanici_soyadi)
                            .addComponent(kullanici_sinifi))
                        .addGap(18, 18, 18)
                        .addComponent(sifre_goster))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(bilgileri_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(geri)
                            .addComponent(jLabel7))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(kullanici_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(kullanici_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(kullanici_soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(kullanici_sifresi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sifre_goster, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(kullanici_bolumu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(kullanici_sinifi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(bilgileri_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bilgileri_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilgileri_guncelleActionPerformed

        String k_id = kullanici_id.getText();
        String k_adi = kullanici_adi.getText();
        String k_sadi = kullanici_soyadi.getText();
        String k_sifre = new String(kullanici_sifresi.getPassword());
        String k_bolum = kullanici_bolumu.getText();
        String k_sinif = kullanici_sinifi.getText();
        String message;

        if (k_id.length() > 0 && k_adi.length() > 0 && k_sadi.length() > 0 && k_sifre.length() > 0 && k_bolum.length() > 0 && k_sinif.length() > 0) {
            File inputFile = new File("kisiler.xml");

            try {
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document document = builder.parse(inputFile);

                Element kokElement = document.getDocumentElement();

                NodeList kisiListesi = kokElement.getElementsByTagName("kisi");

                boolean isExist = false;
                for (int i = 0; i < kisiListesi.getLength(); i++) {
                    Node kisi = kisiListesi.item(i);
                    Element kisiElement = (Element) kisi;
                    String rID = kisiElement.getElementsByTagName("id").item(0).getTextContent();
                    if (rID.equals(k_id)) {

                        Node firstname = kisiElement.getElementsByTagName("isim").item(0).getFirstChild();
                        firstname.setNodeValue(k_adi);

                        Node lastname = kisiElement.getElementsByTagName("soyisim").item(0).getFirstChild();
                        lastname.setNodeValue(k_sadi);

                        Node password = kisiElement.getElementsByTagName("sifre").item(0).getFirstChild();
                        password.setNodeValue(k_sifre);

                        Node episode = kisiElement.getElementsByTagName("bolum").item(0).getFirstChild();
                        episode.setNodeValue(k_bolum);

                        Node grade = kisiElement.getElementsByTagName("sinif").item(0).getFirstChild();
                        grade.setNodeValue(k_sinif);
                        isExist = true;
                        break;
                    }
                }
                if (isExist == true) {
                    message = "Kullanıcı bilgileri başarıyla güncellendi.";
                    JOptionPane.showMessageDialog(this, message);

                    kullanici_adi.setText("");
                    kullanici_soyadi.setText("");
                    kullanici_sifresi.setText("");
                    kullanici_bolumu.setText("");
                    kullanici_sinifi.setText("");
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

    private void sifre_gosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifre_gosterActionPerformed
        if (sifre_goster.isSelected()) {
            kullanici_sifresi.setEchoChar((char) 0);
        } else {
            kullanici_sifresi.setEchoChar('*');
        }
    }//GEN-LAST:event_sifre_gosterActionPerformed

    private void geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriActionPerformed
        setVisible(false);
        kullanici_islemleri ki = new kullanici_islemleri();
        ki.setVisible(true);

    }//GEN-LAST:event_geriActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kullanici_duzenleme().setVisible(true);
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
    private javax.swing.JTextField kullanici_adi;
    private javax.swing.JTextField kullanici_bolumu;
    private javax.swing.JTextField kullanici_id;
    private javax.swing.JPasswordField kullanici_sifresi;
    private javax.swing.JTextField kullanici_sinifi;
    private javax.swing.JTextField kullanici_soyadi;
    private javax.swing.JCheckBox sifre_goster;
    // End of variables declaration//GEN-END:variables
}
