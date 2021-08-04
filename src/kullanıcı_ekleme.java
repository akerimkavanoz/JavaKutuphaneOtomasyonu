
import java.awt.Color;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.xml.transform.OutputKeys;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class kullanıcı_ekleme extends javax.swing.JFrame {

    int sonid;

    public kullanıcı_ekleme() {
        initComponents();
        sonid = enBuyukID();
        sonid += 1;
        kullanici_id.setText(String.valueOf(sonid));
        kullanici_id.setEditable(false);
        kullanici_id.setBackground(Color.YELLOW);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kullanici_ekle = new javax.swing.JButton();
        kullanici_id = new javax.swing.JTextField();
        kullanici_adi = new javax.swing.JTextField();
        kullanici_soyadi = new javax.swing.JTextField();
        kullanici_sifre = new javax.swing.JPasswordField();
        kullanici_bolumu = new javax.swing.JTextField();
        kullanici_sinifi = new javax.swing.JTextField();
        sifre_goster = new javax.swing.JCheckBox();
        geri = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kullanıcı Ekleme");
        setLocation(new java.awt.Point(600, 300));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Kullanıcı ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Kullanıcı Adı:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Kullanıcı Soyadı:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Kullanıcı Şifresi:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Kullanıcı Bölümü:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Kullanıcı Sınıfı:");

        kullanici_ekle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kullanici_ekle.setText("Kullanıcıyı Ekle");
        kullanici_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici_ekleActionPerformed(evt);
            }
        });

        kullanici_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kullanici_adi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kullanici_soyadi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kullanici_sifre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kullanici_bolumu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kullanici_sinifi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        sifre_goster.setText("Şifreyi Göster");
        sifre_goster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifre_gosterActionPerformed(evt);
            }
        });

        geri.setText("Geri");
        geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("KULLANICI EKLEME");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(geri))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kullanici_soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(253, 253, 253)
                                .addComponent(kullanici_sifre))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(kullanici_bolumu, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(kullanici_sinifi, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(sifre_goster)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(kullanici_id, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kullanici_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kullanici_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(geri)
                    .addComponent(jLabel7))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullanici_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kullanici_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(kullanici_soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(kullanici_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifre_goster))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(kullanici_bolumu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(kullanici_sinifi, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(kullanici_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sifre_gosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifre_gosterActionPerformed
        if (sifre_goster.isSelected()) {
            kullanici_sifre.setEchoChar((char) 0);
        } else {
            kullanici_sifre.setEchoChar('*');
        }
    }//GEN-LAST:event_sifre_gosterActionPerformed

    private int enBuyukID() {
        int id = 1;
        File inputFile = new File("kisiler.xml");

        try {

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(inputFile);
            Element rootElement = doc.getDocumentElement();

            NodeList kisiListesi = rootElement.getElementsByTagName("kisi");

            for (int i = 0; i < kisiListesi.getLength(); i++) {
                Node kisi = kisiListesi.item(i);
                Element kisiElement = (Element) kisi;
                int rID = Integer.parseInt(kisiElement.getElementsByTagName("id").item(0).getTextContent());

                if (rID >= id) {
                    id = rID;
                }
            }

        } catch (Exception e) {

        }
        return id;
    }

    private void kullanici_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici_ekleActionPerformed
        sonid = enBuyukID();
        String id = kullanici_id.getText();
        String k_adi = kullanici_adi.getText();
        String k_sadi = kullanici_soyadi.getText();
        String k_sifre = new String(kullanici_sifre.getPassword());
        String k_bolum = kullanici_bolumu.getText();
        String k_sinif = kullanici_sinifi.getText();
        String kitapsayisi = "0";
        String message;

        File inputFile = new File("kisiler.xml");
        if (id.length() > 0 && k_adi.length() > 0 && k_sadi.length() > 0 && k_sifre.length() > 0 && k_bolum.length() > 0 && k_sinif.length() > 0) {
            try {

                DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
                Document doc = docBuilder.parse(inputFile);
                Element rootElement = doc.getDocumentElement();

                NodeList kisiListesi = rootElement.getElementsByTagName("kisi");
                int kisiid;
                //String rID = "";
                /*for (int i = 0; i < kisiListesi.getLength(); i++) {
                    Node kisi = kisiListesi.item(i);
                    Element kisiElement = (Element) kisi;
                    rID = kisiElement.getElementsByTagName("id").item(0).getTextContent();

                    if (rID.equals(id)) {
                        message = "Bu ID de bir kullanıcı mevcuttur. Lütfen " + (sonid + 1) + " ve sonraki sayılarda bir ID değeri veriniz..";
                        JOptionPane.showMessageDialog(this, message, "Hata", JOptionPane.ERROR_MESSAGE);
                        kullanici_id.setText("");
                    } 
                } */
                kisiid = Integer.parseInt(id);
                if (kisiid > sonid) {
                    Element staff = doc.createElement("kisi");
                    rootElement.appendChild(staff);

                    Element sira = doc.createElement("id");
                    sira.appendChild(doc.createTextNode(id));
                    staff.appendChild(sira);

                    Element firstname = doc.createElement("isim");
                    firstname.appendChild(doc.createTextNode(k_adi));
                    staff.appendChild(firstname);

                    Element lastname = doc.createElement("soyisim");
                    lastname.appendChild(doc.createTextNode(k_sadi));
                    staff.appendChild(lastname);

                    Element password = doc.createElement("sifre");
                    password.appendChild(doc.createTextNode(k_sifre));
                    staff.appendChild(password);

                    Element episode = doc.createElement("bolum");
                    episode.appendChild(doc.createTextNode(k_bolum));
                    staff.appendChild(episode);

                    Element grade = doc.createElement("sinif");
                    grade.appendChild(doc.createTextNode(k_sinif));
                    staff.appendChild(grade);

                    Element book_number = doc.createElement("kitapsayisi");
                    book_number.appendChild(doc.createTextNode(kitapsayisi));
                    staff.appendChild(book_number);

                    TransformerFactory transformerFactory = TransformerFactory.newInstance();
                    Transformer transformer = transformerFactory.newTransformer();
                    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                    transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
                    DOMSource source = new DOMSource(doc);

                    StreamResult result = new StreamResult(new PrintWriter(new FileOutputStream(inputFile, false)));

                    transformer.transform(source, result);
                    message = "Kullanıcı ekleme başarılı.";
                    JOptionPane.showMessageDialog(this, message);
                    sonid = enBuyukID();
                    sonid += 1;
                    kullanici_id.setText(String.valueOf(sonid));

                    kullanici_adi.setText("");
                    kullanici_soyadi.setText("");
                    kullanici_sifre.setText("");
                    kullanici_bolumu.setText("");
                    kullanici_sinifi.setText("");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            message = "Kullanıcı ekleme başarısız. Lütfen tüm bilgileri doğru şekilde doldurunuz.";
            JOptionPane.showMessageDialog(this, message, "Hata", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_kullanici_ekleActionPerformed

    private void geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriActionPerformed
        setVisible(false);
        kullanici_islemleri ki = new kullanici_islemleri();
        ki.setVisible(true);
    }//GEN-LAST:event_geriActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kullanıcı_ekleme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton geri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField kullanici_adi;
    private javax.swing.JTextField kullanici_bolumu;
    private javax.swing.JButton kullanici_ekle;
    private javax.swing.JTextField kullanici_id;
    private javax.swing.JPasswordField kullanici_sifre;
    private javax.swing.JTextField kullanici_sinifi;
    private javax.swing.JTextField kullanici_soyadi;
    private javax.swing.JCheckBox sifre_goster;
    // End of variables declaration//GEN-END:variables
}
