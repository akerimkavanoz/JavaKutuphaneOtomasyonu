
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

public class kitap_islemleri extends javax.swing.JFrame {

    public kitap_islemleri() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kitap_ekleme = new javax.swing.JButton();
        k_barkod = new javax.swing.JTextField();
        kitap_barkod_no = new javax.swing.JTextField();
        geri = new javax.swing.JButton();
        kitap_cikarma = new javax.swing.JButton();
        kitap_duzenleme = new javax.swing.JButton();
        kitap_arama = new javax.swing.JButton();
        barkodno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kitap İşlemleri");
        setLocation(new java.awt.Point(600, 300));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Kitap Ekleme:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Çıkaracağınız Kitabın Barkod No:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Düzenlemek İstediğiniz Kitabın Barkod No:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Aramak İstediğiniz Kitabın Barkod No:");

        kitap_ekleme.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kitap_ekleme.setText("Eklemek İçin Tıklayınız");
        kitap_ekleme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_eklemeActionPerformed(evt);
            }
        });

        geri.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        geri.setText("Geri");
        geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriActionPerformed(evt);
            }
        });

        kitap_cikarma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kitap_cikarma.setText("Çıkar");
        kitap_cikarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_cikarmaActionPerformed(evt);
            }
        });

        kitap_duzenleme.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kitap_duzenleme.setText("Düzenle");
        kitap_duzenleme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_duzenlemeActionPerformed(evt);
            }
        });

        kitap_arama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kitap_arama.setText("Ara");
        kitap_arama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_aramaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("KİTAP İŞLEMLERİ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kitap_barkod_no, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(barkodno)
                            .addComponent(k_barkod))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kitap_arama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kitap_cikarma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kitap_duzenleme, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)))
                    .addComponent(kitap_ekleme, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geri)
                .addGap(162, 162, 162)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(geri)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kitap_ekleme, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(k_barkod, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kitap_cikarma))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kitap_duzenleme)
                        .addComponent(barkodno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kitap_barkod_no, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kitap_arama)))
                .addGap(102, 102, 102))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriActionPerformed
        setVisible(false);
        yonetici_islem_secim ys = new yonetici_islem_secim();
        ys.setVisible(true);

    }//GEN-LAST:event_geriActionPerformed

    private void kitap_eklemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_eklemeActionPerformed
        setVisible(false);
        kitap_ekleme ke = new kitap_ekleme();
        ke.setVisible(true);
    }//GEN-LAST:event_kitap_eklemeActionPerformed
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
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<String> boslukOkuma() {
        ArrayList<String> lst = new ArrayList<String>();
        FileInputStream fis = null;
        BufferedReader reader = null;
        try {
            fis = new FileInputStream("kitaplar.xml");
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

    private void kitap_cikarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_cikarmaActionPerformed
        String k_b_no = k_barkod.getText();
        String message;

        File inputFile = new File("kitaplar.xml");

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
                    kokElement.removeChild(kitap);
                    isExist = true;
                    break;
                }
            }
            if (isExist == false) {
                message = k_b_no + " barkod numaralı kitap bulunamadı.";
                JOptionPane.showMessageDialog(this, message, "Hata", JOptionPane.ERROR_MESSAGE);
                k_barkod.setText("");
            } else {
                message = "Kitap başarıyla silindi.";
                JOptionPane.showMessageDialog(this, message);
                k_barkod.setText("");
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            DOMSource source = new DOMSource(document);

            StreamResult result = new StreamResult(new PrintWriter(new FileOutputStream(inputFile, false)));

            transformer.transform(source, result);
            ArrayList<String> res = boslukOkuma();
            writeToFile(res, "kitaplar.xml");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_kitap_cikarmaActionPerformed

    private void kitap_duzenlemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_duzenlemeActionPerformed
        String message;
        String k_b_no = barkodno.getText();
        boolean varmi = kitapVarmi(k_b_no);
        if (varmi == true) {
            setVisible(false);
            kitap giden = kitapBilgi(k_b_no);
            kitap_duzenleme kd = new kitap_duzenleme(giden);
            kd.setVisible(true);
        } else {
            message = k_b_no + " barkod numaralı kitap bulunamadı.";
            JOptionPane.showMessageDialog(this, message, "Hata", JOptionPane.ERROR_MESSAGE);
            barkodno.setText("");
        }

    }//GEN-LAST:event_kitap_duzenlemeActionPerformed
    
    private kitap kitapBilgi(String barkod) {
        kitap result = new kitap();
        String k_b_no = barkodno.getText();

        File inputFile = new File("kitaplar.xml");

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputFile);

            Element kokElement = document.getDocumentElement();

            NodeList kitapListesi = kokElement.getElementsByTagName("kitap");

            String barkod_no, kitap_ismi, kitap_yazari, kitap_turu, kitap_y_yili, kitap_s_sayisi, kitap_dili;
            
            for (int i = 0; i < kitapListesi.getLength(); i++) {
                Node kitap = kitapListesi.item(i);
                Element kitapElement = (Element) kitap;
                barkod_no = kitapElement.getElementsByTagName("barkod").item(0).getTextContent();
                kitap_ismi  = kitapElement.getElementsByTagName("isim").item(0).getTextContent();
                kitap_yazari = kitapElement.getElementsByTagName("yazar").item(0).getTextContent();
                kitap_turu = kitapElement.getElementsByTagName("tur").item(0).getTextContent();
                kitap_y_yili = kitapElement.getElementsByTagName("yayinyili").item(0).getTextContent();
                kitap_s_sayisi = kitapElement.getElementsByTagName("sayfasayisi").item(0).getTextContent();
                kitap_dili = kitapElement.getElementsByTagName("dili").item(0).getTextContent();
                
                if (barkod_no.equals(k_b_no)) {
                    result.setBarkodno(barkod_no);
                    result.setKitapadi(kitap_ismi);
                    result.setKitapyazari(kitap_yazari);
                    result.setKitaptur(kitap_turu);
                    result.setYayinyili(kitap_y_yili);
                    result.setSayfasayisi(kitap_s_sayisi);
                    result.setDil(kitap_dili);
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
    
    
    private boolean kitapVarmi(String barkod) {
        boolean result = false;
        String k_b_no = barkodno.getText();
        String message;

        File inputFile = new File("kitaplar.xml");

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputFile);

            Element kokElement = document.getDocumentElement();

            NodeList kitapListesi = kokElement.getElementsByTagName("kitap");

            String barkod_no, kitap_ismi, kitap_yazari, kitap_turu, kitap_y_yili, kitap_s_sayisi, kitap_dili;
            kitap gercekKitap = new kitap();
            for (int i = 0; i < kitapListesi.getLength(); i++) {
                Node kitap = kitapListesi.item(i);
                Element kitapElement = (Element) kitap;
                barkod_no = kitapElement.getElementsByTagName("barkod").item(0).getTextContent();
                if (barkod_no.equals(k_b_no)) {
                    result = true;
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private void kitap_aramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_aramaActionPerformed
        String k_b_no = kitap_barkod_no.getText();
        String message;

        File inputFile = new File("kitaplar.xml");

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputFile);

            Element kokElement = document.getDocumentElement();

            NodeList kitapListesi = kokElement.getElementsByTagName("kitap");

            boolean isExist = false;
            String barkod_no, kitap_ismi, kitap_yazari, kitap_turu, kitap_y_yili, kitap_s_sayisi, kitap_dili;
            kitap gercekKitap = new kitap();
            for (int i = 0; i < kitapListesi.getLength(); i++) {
                Node kitap = kitapListesi.item(i);
                Element kitapElement = (Element) kitap;
                barkod_no = kitapElement.getElementsByTagName("barkod").item(0).getTextContent();

                if (barkod_no.equals(k_b_no)) {

                    isExist = true;
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
                    break;
                }
            }
            if (isExist == true) {
                message = k_b_no + " barkod numaralı kitap bulundu.";
                JOptionPane.showMessageDialog(this, message);
                setVisible(false);
                kitap_bulunan ibk = new kitap_bulunan(gercekKitap);
                ibk.setVisible(true);

            } else {
                message = k_b_no + " barkod numaralı bir kitap bulunamadı.";
                JOptionPane.showMessageDialog(this, message, "Hata", JOptionPane.ERROR_MESSAGE);
                kitap_barkod_no.setText("");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_kitap_aramaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kitap_islemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barkodno;
    private javax.swing.JButton geri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField k_barkod;
    private javax.swing.JButton kitap_arama;
    private javax.swing.JTextField kitap_barkod_no;
    private javax.swing.JButton kitap_cikarma;
    private javax.swing.JButton kitap_duzenleme;
    private javax.swing.JButton kitap_ekleme;
    // End of variables declaration//GEN-END:variables
}
