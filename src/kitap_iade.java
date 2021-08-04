
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
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
import java.time.temporal.ChronoUnit;
import static java.util.concurrent.TimeUnit.DAYS;

public class kitap_iade extends javax.swing.JFrame {

    String id;
    String message;
    int kitapSayisi;
    public kitap_iade() {
        initComponents();
        kitapSayisi = alinanKitapSayisi(id);
        iadeKitaplari(id);
    }
    
    public kitap_iade(String uyeid) {
        initComponents();
        id = uyeid;
        kitapSayisi = alinanKitapSayisi(id);
        iadeKitaplari(id);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        geri = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        kitaplarim = new javax.swing.JList<>();
        kitap_iade_et = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kitap İade Etme");
        setLocation(new java.awt.Point(600, 300));
        setResizable(false);

        geri.setText("Geri");
        geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriActionPerformed(evt);
            }
        });

        kitaplarim.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(kitaplarim);

        kitap_iade_et.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kitap_iade_et.setText("Kitap İade Et");
        kitap_iade_et.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_iade_etActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("KİTAP İADE ETME");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geri)
                        .addGap(172, 172, 172)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(kitap_iade_et, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(geri)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(kitap_iade_et, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    ArrayList<kitap> iadeListesi;
    private void iadeKitaplari(String kisiID){
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
            iadeListesi = new ArrayList<kitap>();
            for (int i = 0; i < kitapListesi.getLength(); i++) {
                Node kitap = kitapListesi.item(i);
                Element kitapElement = (Element) kitap;
                stok_durum = kitapElement.getElementsByTagName("stok").item(0).getTextContent();
                alankisiid = kitapElement.getElementsByTagName("alankisiid").item(0).getTextContent();
                if (stok_durum.equals("yok") && alankisiid.equals(kisiID)) {
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
                    iadeListesi.add(gercekKitap);
                } else {
                    continue;
                }
            }
            kitaplarEkle(iadeListesi);

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    private void geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriActionPerformed
        setVisible(false);
        uye_islemleri ui = new uye_islemleri(id);
        ui.setVisible(true);
    }//GEN-LAST:event_geriActionPerformed
    private void kitapSayisiIndir(String uyeID,int sayi){
        File inputFile = new File("kisiler.xml");
            
        try {    
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputFile);

            Element kokElement = document.getDocumentElement();

            NodeList kisiListesi = kokElement.getElementsByTagName("kisi");
            for (int i = 0; i < kisiListesi.getLength(); i++) {
                Node kisi = kisiListesi.item(i);
                Element kisiElement = (Element) kisi;
                String rID = kisiElement.getElementsByTagName("id").item(0).getTextContent();
                if(rID.equals(uyeID)){
                    
                Node alinanKitap = kisiElement.getElementsByTagName("kitapsayisi").item(0).getFirstChild();
                alinanKitap.setNodeValue(String.valueOf(sayi)); 
                
                break;
               }
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            DOMSource source = new DOMSource(document);
            
            PrintWriter sw;
            FileOutputStream fo = new FileOutputStream(inputFile, false);
            sw = new PrintWriter(fo);
            StreamResult result = new StreamResult(sw);

            transformer.transform(source, result);
            fo.flush();
            fo.close();
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    
    }
    private void kitaplarEkle(ArrayList<kitap> kitapListe) {
        DefaultListModel<String> listModel = new DefaultListModel<String>();
        for (int i = 0; i < kitapListe.size(); i++) {
            listModel.add(i, kitapListe.get(i).getKitapadi());
        }
        kitaplarim.setModel(listModel);
    }
     private int alinanKitapSayisi(String kisiID){
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
     private int listeBoyut(){
        int result = kitaplarim.getModel().getSize();
        return result;
    }
     
    private void kitap_iade_etActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_iade_etActionPerformed
        int sayi = listeBoyut();
        if (sayi > 0){
            kitapSayisi = alinanKitapSayisi(id);
            int yeniSayi = kitapSayisi - 1;
            int kitapSira = kitaplarim.getSelectedIndex();
            kitap alinan = iadeListesi.get(kitapSira);

            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            long gun = 0;
            try {
                Date alimTarihi = formatter.parse(alinan.getAlimTarihi());
                Date bugun = new Date();
                String tarih = formatter.format(bugun).toString();
                bugun = formatter.parse(tarih);

                long difference = bugun.getTime() - alimTarihi.getTime();
                float daysBetween = (difference / (1000 * 60 * 60 * 24));
                if (daysBetween > 30) {
                    daysBetween -= 30;
                    float ceza = 1.5f;
                    ceza *= daysBetween;
                    message = "Kitabı " + (int) daysBetween + " gün geç getirdiniz. Para cezanız: " + ceza;
                    JOptionPane.showMessageDialog(this, message, "Kitabı Geç Getirme Cezası", JOptionPane.ERROR_MESSAGE);
                }
            } catch (ParseException ex) {
                Logger.getLogger(kitap_iade.class.getName()).log(Level.SEVERE, null, ex);
            }

            kitapIadeEt(kitapSira, id, alinan.getBarkodno(), yeniSayi);
        }
        else {
            message = "İade edilecek kitap yoktur.";
            JOptionPane.showMessageDialog(this, message, "Uyarı", JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_kitap_iade_etActionPerformed
    
    private void kitapIadeEt(int sira, String kisiid, String barkodno,int sayi){

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
            
            for (int i = 0; i < kitapListesi.getLength(); i++) {
                Node kitap = kitapListesi.item(i);
                Element kitapElement = (Element) kitap;

                barkod_no = kitapElement.getElementsByTagName("barkod").item(0).getTextContent();
                stok_durum = kitapElement.getElementsByTagName("stok").item(0).getTextContent();
                alankisiid = kitapElement.getElementsByTagName("alankisiid").item(0).getTextContent();
                if (stok_durum.equals("yok") && alankisiid.equals(kisiid) && barkod_no.equals(barkodno)) {
                    
                    Node stokNode = kitapElement.getElementsByTagName("stok").item(0).getFirstChild();
                    stokNode.setNodeValue("var");

                    
                    Node kisiNode = kitapElement.getElementsByTagName("alankisiid").item(0).getFirstChild();
                    kisiNode.setNodeValue("yok");
                    

                    Node alimNode = kitapElement.getElementsByTagName("tarih").item(0).getFirstChild();
                    alimNode.setNodeValue("null");
                    
                    message = "Kitap başarıyla iade edildi";
                    JOptionPane.showMessageDialog(this, message); 
                    
                    break;
                } 
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            DOMSource source = new DOMSource(document);
            
            PrintWriter sw;
            FileOutputStream fo = new FileOutputStream(inputFile, false);
            sw = new PrintWriter(fo);
            StreamResult result = new StreamResult(sw);

            transformer.transform(source, result);
            fo.flush();
            fo.close();
    
        } catch (Exception ex) {
            System.out.println(ex);
        }
         
         kitapSayisiIndir(kisiid,sayi);
         iadeKitaplari(kisiid);
    }

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kitap_iade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton geri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kitap_iade_et;
    private javax.swing.JList<String> kitaplarim;
    // End of variables declaration//GEN-END:variables
}
