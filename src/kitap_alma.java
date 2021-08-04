
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class kitap_alma extends javax.swing.JFrame {

    String id;
    String message;

    public kitap_alma() {
        initComponents();
        kitapYukle();
    }

    public kitap_alma(String uyeid) {
        initComponents();
        kitapYukle();
        id = uyeid;
    }

    ArrayList<kitap> liste;

    private void kitapYukle() {
        File inputFile = new File("kitaplar.xml");
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputFile);

            Element kokElement = document.getDocumentElement();
            
            NodeList kitapListesi = kokElement.getElementsByTagName("kitap");
           
            boolean isExist = false;
            String barkod_no, kitap_ismi, alimtarihi, alankisiid, stok_durum;
            kitap gercekKitap = new kitap();
            liste = new ArrayList<kitap>();
            for (int i = 0; i < kitapListesi.getLength(); i++) {
                Node kitap = kitapListesi.item(i);
                Element kitapElement = (Element) kitap;

                stok_durum = kitapElement.getElementsByTagName("stok").item(0).getTextContent();
                if (stok_durum.equals("var")) {
                    gercekKitap = new kitap();
                    barkod_no = kitapElement.getElementsByTagName("barkod").item(0).getTextContent();
                    kitap_ismi = kitapElement.getElementsByTagName("isim").item(0).getTextContent();
                    alankisiid = kitapElement.getElementsByTagName("alankisiid").item(0).getTextContent();
                    alimtarihi = kitapElement.getElementsByTagName("tarih").item(0).getTextContent();
                    gercekKitap.setBarkodno(barkod_no);
                    gercekKitap.setKitapadi(kitap_ismi);
                    gercekKitap.setStok(stok_durum);
                    gercekKitap.setAlankisiid(alankisiid);
                    gercekKitap.setAlimTarihi(alimtarihi);
                    liste.add(gercekKitap);
                } else {
                    continue;
                }
            }
            kitaplarEkle(liste);

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private void kitaplarEkle(ArrayList<kitap> kitapListe) {
        DefaultListModel<String> listModel = new DefaultListModel<String>();
        for (int i = 0; i < kitapListe.size(); i++) {
            listModel.add(i, kitapListe.get(i).getKitapadi());
        }
        kitaplar.setModel(listModel);
    }
    
    private int listeBoyut(){
        int result = kitaplar.getModel().getSize();
        return result;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        geri = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        kitaplar = new javax.swing.JList<>();
        kitap_al = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kitap Alma");
        setLocation(new java.awt.Point(600, 300));
        setResizable(false);

        geri.setText("Geri");
        geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriActionPerformed(evt);
            }
        });

        kitaplar.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        kitaplar.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(kitaplar);

        kitap_al.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kitap_al.setText("Kitap Al");
        kitap_al.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_alActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("KİTAP ALMA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geri)
                        .addGap(203, 203, 203)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(kitap_al, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(geri)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(kitap_al, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kitap_alActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_alActionPerformed
        int sayi = listeBoyut();
        if (sayi > 0) {
            int kitapSayi = alinanKitapSayisi(id);

            if (kitapSayi < 3) {
                int kitapSira = kitaplar.getSelectedIndex();
                kitap alinan = liste.get(kitapSira);
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                Date date = new Date();
                String tarih = formatter.format(date).toString();
                kitapAl(id, alinan.getBarkodno(), tarih);
                kitapSayi += 1;
                alinanKitapSayisiGuncelle(id, kitapSayi);
            } else {
                message = "Kitap alma başarısız. 3 kitaptan fazla kitap alamazsınız.";
                JOptionPane.showMessageDialog(this, message, "Hata", JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            message = "Alıncak kitap yoktur.";
            JOptionPane.showMessageDialog(this, message, "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_kitap_alActionPerformed

    private void alinanKitapSayisiGuncelle(String kisiID, int kitapSayi) {
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
                String rID = kisiElement.getElementsByTagName("id").item(0).getTextContent();

                if (rID.equals(id)) {
                    Node sayi = kisiElement.getElementsByTagName("kitapsayisi").item(0).getFirstChild();
                    sayi.setNodeValue(String.valueOf(kitapSayi));
                    break;
                }
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            DOMSource source = new DOMSource(doc);
            

            FileOutputStream fo = new FileOutputStream(inputFile,false);
            StreamResult result = new StreamResult(new PrintWriter(fo));

            transformer.transform(source, result);
            fo.flush();
            fo.close();

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }


    private void geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriActionPerformed
        setVisible(false);
        uye_islemleri ui = new uye_islemleri(id);
        ui.setVisible(true);

    }//GEN-LAST:event_geriActionPerformed

    private int alinanKitapSayisi(String kisiID) {
        int result = 0;

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
                String rID = kisiElement.getElementsByTagName("id").item(0).getTextContent();

                if (rID.equals(id)) {
                    String alinanKitap = kisiElement.getElementsByTagName("kitapsayisi").item(0).getTextContent();
                    result = Integer.parseInt(alinanKitap);
                    break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    private void kitapAl(String kisiid, String barkodno, String tarih) {

        File inputFile = new File("kitaplar.xml");
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputFile);

            Element kokElement = document.getDocumentElement();
           
            NodeList kitapListesi = kokElement.getElementsByTagName("kitap");
            
            String barkod_no = "";

            for (int i = 0; i < kitapListesi.getLength(); i++) {
                Node kitap = kitapListesi.item(i);
                Element kitapElement = (Element) kitap;

                barkod_no = kitapElement.getElementsByTagName("barkod").item(0).getTextContent();
                if (barkod_no.equals(barkodno)) {

                    Node stokNode = kitapElement.getElementsByTagName("stok").item(0).getFirstChild();
                    stokNode.setNodeValue("yok");

                    Node kisiNode = kitapElement.getElementsByTagName("alankisiid").item(0).getFirstChild();
                    kisiNode.setNodeValue(kisiid);

                    Node alimNode = kitapElement.getElementsByTagName("tarih").item(0).getFirstChild();
                    alimNode.setNodeValue(tarih.toString());

                    message = "Kitap başarıyla alındı";
                    JOptionPane.showMessageDialog(this, message);
                    break;
                }

            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            DOMSource source = new DOMSource(document);

            PrintWriter sw;
            FileOutputStream fo = new FileOutputStream(inputFile, false);
            sw = new PrintWriter(fo);
            StreamResult result = new StreamResult(sw);

            transformer.transform(source, result);
            fo.flush();
            fo.close();
            kitapYukle();
            

        } catch (TransformerException te){
            te.printStackTrace();
            System.out.println(kisiid+ "," + tarih.toString());
        } catch (Exception e){
            e.printStackTrace();
        }
        
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kitap_alma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton geri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kitap_al;
    private javax.swing.JList<String> kitaplar;
    // End of variables declaration//GEN-END:variables
}
