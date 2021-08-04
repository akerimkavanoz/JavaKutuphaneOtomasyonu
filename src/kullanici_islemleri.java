
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
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

public class kullanici_islemleri extends javax.swing.JFrame {

    public kullanici_islemleri() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        c_kid = new javax.swing.JTextField();
        a_kid = new javax.swing.JTextField();
        kullanici_ekleme = new javax.swing.JButton();
        geri = new javax.swing.JButton();
        kullanici_cikarma = new javax.swing.JButton();
        kullanici_ara = new javax.swing.JButton();
        kullanici_duzenleme = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        d_kid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kullanıcı İşlemleri");
        setLocation(new java.awt.Point(600, 300));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Kullanıcı Ekleme:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Çıkaracağınız Kullanıcı ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Düzenlemek İstediğiniz Kullanıcı ID:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Aramak İstediğiniz Kullanıcı ID:");

        kullanici_ekleme.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kullanici_ekleme.setText("Eklemek İçin Tıklayınız");
        kullanici_ekleme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici_eklemeActionPerformed(evt);
            }
        });

        geri.setText("Geri");
        geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriActionPerformed(evt);
            }
        });

        kullanici_cikarma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kullanici_cikarma.setText("Çıkar");
        kullanici_cikarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici_cikarmaActionPerformed(evt);
            }
        });

        kullanici_ara.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kullanici_ara.setText("Ara");
        kullanici_ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici_araActionPerformed(evt);
            }
        });

        kullanici_duzenleme.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kullanici_duzenleme.setText("Düzenle");
        kullanici_duzenleme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici_duzenlemeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("KULLANICI İŞLEMLERİ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(c_kid, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(d_kid, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kullanici_duzenleme, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(kullanici_cikarma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(a_kid, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kullanici_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(kullanici_ekleme, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geri)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel5)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(geri)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullanici_ekleme, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kullanici_cikarma, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c_kid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d_kid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kullanici_duzenleme, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kullanici_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a_kid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(97, 97, 97))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriActionPerformed
        setVisible(false);
        yonetici_islem_secim ys = new yonetici_islem_secim();
        ys.setVisible(true);
    }//GEN-LAST:event_geriActionPerformed

    private void kullanici_eklemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici_eklemeActionPerformed
        setVisible(false);
        kullanıcı_ekleme ke = new kullanıcı_ekleme();
        ke.setVisible(true);
    }//GEN-LAST:event_kullanici_eklemeActionPerformed

    private void writeToFile(ArrayList<String> ls, String Filename) {
        File fout = new File(Filename);
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(fout);
            OutputStreamWriter osw = new OutputStreamWriter(fos);

            for (int i = 0; i < ls.size(); i++) {
                osw.write(ls.get(i));
                if (i < ls.size() - 1) {
                    osw.write("\n");
                }
            }
            osw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(kullanici_islemleri.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(kullanici_islemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean kullaniciVarmi(String id) {
        boolean result = false;
        String kid = id;
        String message;

        File inputFile = new File("kisiler.xml");

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputFile);

            Element kokElement = document.getDocumentElement();

            NodeList kisiListesi = kokElement.getElementsByTagName("kisi");

            String kisiid = "";
            for (int i = 0; i < kisiListesi.getLength(); i++) {
                Node kisi = kisiListesi.item(i);
                Element kisiElement = (Element) kisi;
                kisiid = kisiElement.getElementsByTagName("id").item(0).getTextContent();
                if (kisiid.equals(id)) {
                    result = true;
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public ArrayList<String> boslukOkuma() {
        ArrayList<String> lst = new ArrayList<String>();
        FileInputStream fis = null;
        BufferedReader reader = null;
        try {
            fis = new FileInputStream("kisiler.xml");
            reader = new BufferedReader(new InputStreamReader(fis));
            String line = reader.readLine();
            int count = 0;
            while (line != null) {
                if (line.length() != 0) {
                    lst.add(line.toString());
                }
                line = reader.readLine();
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                reader.close();
                fis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return lst;
    }

    private void kullanici_cikarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici_cikarmaActionPerformed
        String id = c_kid.getText();
        String message;
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

                if (rID.equals(id)) {
                    kokElement.removeChild(kisi);
                    isExist = true;
                    break;
                }
            }
            if (isExist == false) {
                message = id + " ID'li kullanıcı bulunamadı.";
                JOptionPane.showMessageDialog(this, message, "Hata", JOptionPane.ERROR_MESSAGE);
                c_kid.setText("");
            } else {
                message = "Kullanıcı başarıyla silindi.";
                JOptionPane.showMessageDialog(this, message);
                c_kid.setText("");
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            DOMSource source = new DOMSource(document);

            StreamResult result = new StreamResult(new PrintWriter(new FileOutputStream(inputFile, false)));

            transformer.transform(source, result);
            ArrayList<String> res = boslukOkuma();
            writeToFile(res, "kisiler.xml");

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_kullanici_cikarmaActionPerformed
 
     private kisi kisiBilgi(String id) {
        kisi result = new kisi();
        String uyeid = id;
       
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
    
    
    private void kullanici_duzenlemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici_duzenlemeActionPerformed
        String id = d_kid.getText();
        String message;
        boolean varmi = kullaniciVarmi(id);
        if (varmi == true) {
            setVisible(false);
            kisi gidenkisi = kisiBilgi(id);
            kullanici_duzenleme kd = new kullanici_duzenleme(gidenkisi);
            kd.setVisible(true);
        } else {
            message = id + " ID'li kullanıcı bulunamadı.";
            JOptionPane.showMessageDialog(this, message, "Hata", JOptionPane.ERROR_MESSAGE);
            d_kid.setText("");
        }
    }//GEN-LAST:event_kullanici_duzenlemeActionPerformed

    private void kullanici_araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici_araActionPerformed
        String id = a_kid.getText();
        String message;

        File inputFile = new File("kisiler.xml");

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputFile);

            Element kokElement = document.getDocumentElement();

            NodeList kisiListesi = kokElement.getElementsByTagName("kisi");

            boolean isExist = false;
            String kisi_id, kisi_adi, kisi_soyadi, kisi_sifresi, kisi_bolumu, kisi_sinifi;
            kisi gercekKisi = new kisi();
            for (int i = 0; i < kisiListesi.getLength(); i++) {
                Node kisi = kisiListesi.item(i);
                Element kisiElement = (Element) kisi;
                kisi_id = kisiElement.getElementsByTagName("id").item(0).getTextContent();

                if (kisi_id.equals(id)) {

                    isExist = true;
                    kisi_id = kisiElement.getElementsByTagName("id").item(0).getTextContent();
                    kisi_adi = kisiElement.getElementsByTagName("isim").item(0).getTextContent();
                    kisi_soyadi = kisiElement.getElementsByTagName("soyisim").item(0).getTextContent();
                    kisi_sifresi = kisiElement.getElementsByTagName("sifre").item(0).getTextContent();
                    kisi_bolumu = kisiElement.getElementsByTagName("bolum").item(0).getTextContent();
                    kisi_sinifi = kisiElement.getElementsByTagName("sinif").item(0).getTextContent();

                    gercekKisi.setKullanici_id(kisi_id);
                    gercekKisi.setKullanici_adi(kisi_adi);
                    gercekKisi.setKullanici_soyadi(kisi_soyadi);
                    gercekKisi.setKullanici_sifresi(kisi_sifresi);
                    gercekKisi.setKullanici_bolumu(kisi_bolumu);
                    gercekKisi.setKullanici_sinifi(kisi_sinifi);

                    break;
                }
            }
            if (isExist == true) {
                message = id + " ID'li kullanıcı bulundu";
                JOptionPane.showMessageDialog(this, message);
                setVisible(false);
                kisi_bulunan kb = new kisi_bulunan(gercekKisi);
                kb.setVisible(true);

            } else {
                message = id + " ID'li kullanıcı bulunamadı.";
                JOptionPane.showMessageDialog(this, message, "Hata", JOptionPane.ERROR_MESSAGE);
                a_kid.setText("");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_kullanici_araActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kullanici_islemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a_kid;
    private javax.swing.JTextField c_kid;
    private javax.swing.JTextField d_kid;
    private javax.swing.JButton geri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton kullanici_ara;
    private javax.swing.JButton kullanici_cikarma;
    private javax.swing.JButton kullanici_duzenleme;
    private javax.swing.JButton kullanici_ekleme;
    // End of variables declaration//GEN-END:variables
}
