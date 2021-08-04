
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

public class kitap_ekleme extends javax.swing.JFrame {

    int sonid;

    public kitap_ekleme() {
        initComponents();
        sonid = enBuyukID();
        sonid += 1;
        kitap_barkod_no.setText(String.valueOf(sonid));
        kitap_barkod_no.setEditable(false);
        kitap_barkod_no.setBackground(Color.YELLOW);
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
        kitap_barkod_no = new javax.swing.JTextField();
        kitap_ismi = new javax.swing.JTextField();
        kitap_yazari = new javax.swing.JTextField();
        kitap_turu = new javax.swing.JTextField();
        kitap_yayin_yili = new javax.swing.JTextField();
        kitap_dili = new javax.swing.JTextField();
        kitap_sayfa_sayisi = new javax.swing.JTextField();
        kitap_ekle = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kitap Ekleme");
        setLocation(new java.awt.Point(600, 300));

        geri.setText("Geri");
        geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Kitabın Barkod Numarası:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Kitabın İsmi:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Kitabın Yazarı:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Kitabın Türü:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Kitabın Yayın Yılı:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Kitabın Dili:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Kitabın Sayfa Sayısı:");

        kitap_barkod_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kitap_ismi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kitap_yazari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kitap_turu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kitap_yayin_yili.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kitap_dili.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kitap_sayfa_sayisi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kitap_ekle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kitap_ekle.setText("Kitabı Ekle");
        kitap_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_ekleActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("KİTAP EKLEME");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(kitap_turu, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(kitap_yazari)
                            .addComponent(kitap_ismi)
                            .addComponent(kitap_barkod_no)
                            .addComponent(kitap_yayin_yili)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kitap_dili, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(kitap_sayfa_sayisi))))
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geri)
                .addGap(204, 204, 204)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(226, Short.MAX_VALUE)
                .addComponent(kitap_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(geri)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kitap_barkod_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kitap_ismi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(kitap_yazari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(kitap_turu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kitap_yayin_yili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kitap_dili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kitap_sayfa_sayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kitap_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int enBuyukID() {
        int id = 1;
        File inputFile = new File("kitaplar.xml");

        try {

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(inputFile);
            Element rootElement = doc.getDocumentElement();

            NodeList kisiListesi = rootElement.getElementsByTagName("kitap");

            for (int i = 0; i < kisiListesi.getLength(); i++) {
                Node kisi = kisiListesi.item(i);
                Element kisiElement = (Element) kisi;
                int rID = Integer.parseInt(kisiElement.getElementsByTagName("barkod").item(0).getTextContent());

                if (rID >= id) {
                    id = rID;
                }
            }

        } catch (Exception e) {

        }
        return id;
    }

    private void kitap_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_ekleActionPerformed
        sonid = enBuyukID();
        String k_b_no = kitap_barkod_no.getText();
        String k_ismi = kitap_ismi.getText();
        String k_yazari = kitap_yazari.getText();
        String k_turu = kitap_turu.getText();
        String k_y_yili = kitap_yayin_yili.getText();
        String k_dili = kitap_dili.getText();
        String k_s_sayisi = kitap_sayfa_sayisi.getText();
        String stok = "var";
        String alankullanici = "yok";
        String tarih = "null";
        String message;

        File inputFile = new File("kitaplar.xml");

        if (k_b_no.length() > 0 && k_ismi.length() > 0 && k_yazari.length() > 0 && k_turu.length() > 0 && k_y_yili.length() > 0 && k_dili.length() > 0 && k_s_sayisi.length() > 0) {
            try {

                DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
                Document doc = docBuilder.parse(inputFile);
                Element rootElement = doc.getDocumentElement();

                NodeList kitapListesi = rootElement.getElementsByTagName("kitap");
                int kitapid = 0;
                /*for (int i = 0; i < kitapListesi.getLength(); i++) {
                    Node kitap = kitapListesi.item(i);
                    Element kitapElement = (Element) kitap;
                    String b_no = kitapElement.getElementsByTagName("barkod").item(0).getTextContent();

                    if (b_no.equals(k_b_no)) {
                        message = "Bu barkodda kitap mevcuttur.Lütfen " + (sonid + 1) + " ve üzeri bir barkod numarası veriniz.";
                        JOptionPane.showMessageDialog(this, message, "Hata", JOptionPane.ERROR_MESSAGE);
                        break;
                    } 
                } */
                kitapid = Integer.parseInt(k_b_no);
                if (kitapid > sonid) {
                    Element staff = doc.createElement("kitap");
                    rootElement.appendChild(staff);

                    Element barcode = doc.createElement("barkod");
                    barcode.appendChild(doc.createTextNode(k_b_no));
                    staff.appendChild(barcode);

                    Element name = doc.createElement("isim");
                    name.appendChild(doc.createTextNode(k_ismi));
                    staff.appendChild(name);

                    Element author = doc.createElement("yazar");
                    author.appendChild(doc.createTextNode(k_yazari));
                    staff.appendChild(author);

                    Element type = doc.createElement("tur");
                    type.appendChild(doc.createTextNode(k_turu));
                    staff.appendChild(type);

                    Element release_year = doc.createElement("yayinyili");
                    release_year.appendChild(doc.createTextNode(k_y_yili));
                    staff.appendChild(release_year);

                    Element language = doc.createElement("dili");
                    language.appendChild(doc.createTextNode(k_dili));
                    staff.appendChild(language);

                    Element number_pages = doc.createElement("sayfasayisi");
                    number_pages.appendChild(doc.createTextNode(k_s_sayisi));
                    staff.appendChild(number_pages);

                    Element stock = doc.createElement("stok");
                    stock.appendChild(doc.createTextNode(stok));
                    staff.appendChild(stock);

                    Element book_buyer = doc.createElement("alankisiid");
                    book_buyer.appendChild(doc.createTextNode(alankullanici));
                    staff.appendChild(book_buyer);

                    Element history = doc.createElement("tarih");
                    history.appendChild(doc.createTextNode(tarih));
                    staff.appendChild(history);

                    TransformerFactory transformerFactory = TransformerFactory.newInstance();
                    Transformer transformer = transformerFactory.newTransformer();
                    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                    transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
                    DOMSource source = new DOMSource(doc);

                    StreamResult result = new StreamResult(new PrintWriter(new FileOutputStream(inputFile, false)));

                    transformer.transform(source, result);
                    message = "Kitap ekleme başarılı.";
                    JOptionPane.showMessageDialog(this, message);
                    sonid = enBuyukID();
                    sonid += 1;
                    kitap_barkod_no.setText(String.valueOf(sonid));

                    kitap_ismi.setText("");
                    kitap_yazari.setText("");
                    kitap_turu.setText("");
                    kitap_yayin_yili.setText("");
                    kitap_dili.setText("");
                    kitap_sayfa_sayisi.setText("");

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            message = "Kitap ekleme başarısız. Lütfen tüm bilgileri doldurunuz.";
            JOptionPane.showMessageDialog(this, message, "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_kitap_ekleActionPerformed

    private void geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriActionPerformed
        setVisible(false);
        kitap_islemleri ki = new kitap_islemleri();
        ki.setVisible(true);
    }//GEN-LAST:event_geriActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kitap_ekleme().setVisible(true);
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField kitap_barkod_no;
    private javax.swing.JTextField kitap_dili;
    private javax.swing.JButton kitap_ekle;
    private javax.swing.JTextField kitap_ismi;
    private javax.swing.JTextField kitap_sayfa_sayisi;
    private javax.swing.JTextField kitap_turu;
    private javax.swing.JTextField kitap_yayin_yili;
    private javax.swing.JTextField kitap_yazari;
    // End of variables declaration//GEN-END:variables
}
