
import java.awt.event.ItemEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class sistem_bilgi_goruntuleme extends javax.swing.JFrame implements ListSelectionListener {

    public sistem_bilgi_goruntuleme() {
        initComponents();
        kitaplar_goruntule.addListSelectionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        kitaplar_goruntule = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        kitap_bilgileri_goruntulu = new javax.swing.JList<>();
        islem_sec = new javax.swing.JComboBox<>();
        geri = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kitap Bilgileri");
        setLocation(new java.awt.Point(600, 300));
        setResizable(false);

        jScrollPane1.setViewportView(kitaplar_goruntule);

        jScrollPane2.setViewportView(kitap_bilgileri_goruntulu);

        islem_sec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İşlem Seçiniz", "Tüm Kitapları Görüntüle" }));
        islem_sec.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                islem_secİtemStateChanged(evt);
            }
        });

        geri.setText("Geri");
        geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("KİTAP BİLGİLERİ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geri)
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(islem_sec, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(geri)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(islem_sec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String message;
    private void islem_secİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_islem_secİtemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED && evt.getItem().equals("Tüm Kitapları Görüntüle") && tumkitaplar == null) {
            tumKitaplar();
            kitaplarEkle(tumkitaplar);
        } else if (evt.getStateChange() == ItemEvent.SELECTED && evt.getItem().equals("İşlem Seçiniz")) {
            message = "Lütfen işlem seçiniz.";
            JOptionPane.showMessageDialog(this, message, "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_islem_secİtemStateChanged

    private void geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriActionPerformed
        setVisible(false);
        yonetici_islem_secim yis = new yonetici_islem_secim();
        yis.setVisible(true);
    }//GEN-LAST:event_geriActionPerformed
    private void kitaplarEkle(ArrayList<kitap> kitapListe) {
        DefaultListModel<String> listModel = new DefaultListModel<String>();
        for (int i = 0; i < kitapListe.size(); i++) {
            listModel.add(i, kitapListe.get(i).getKitapadi());
        }
        kitaplar_goruntule.setModel(listModel);
    }

    ArrayList<kitap> tumkitaplar;

    private void tumKitaplar() {
        File inputFile = new File("kitaplar.xml");
        String message;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputFile);

            Element kokElement = document.getDocumentElement();

            NodeList kitapListesi = kokElement.getElementsByTagName("kitap");

            String barkod_no, kitap_ismi, kitap_yazari, kitap_turu, kitap_y_yili, kitap_s_sayisi, kitap_dili, stok_durum, alimtarihi, alankisiid;
            kitap gercekKitap;
            tumkitaplar = new ArrayList<kitap>();
            for (int i = 0; i < kitapListesi.getLength(); i++) {
                Node kitap = kitapListesi.item(i);
                Element kitapElement = (Element) kitap;
                gercekKitap = new kitap();

                barkod_no = kitapElement.getElementsByTagName("barkod").item(0).getTextContent();
                kitap_ismi = kitapElement.getElementsByTagName("isim").item(0).getTextContent();
                kitap_yazari = kitapElement.getElementsByTagName("yazar").item(0).getTextContent();
                kitap_turu = kitapElement.getElementsByTagName("tur").item(0).getTextContent();
                kitap_y_yili = kitapElement.getElementsByTagName("yayinyili").item(0).getTextContent();
                kitap_dili = kitapElement.getElementsByTagName("dili").item(0).getTextContent();
                kitap_s_sayisi = kitapElement.getElementsByTagName("sayfasayisi").item(0).getTextContent();
                alankisiid = kitapElement.getElementsByTagName("alankisiid").item(0).getTextContent();
                alimtarihi = kitapElement.getElementsByTagName("tarih").item(0).getTextContent();
                stok_durum = kitapElement.getElementsByTagName("stok").item(0).getTextContent();

                gercekKitap.setBarkodno(barkod_no);
                gercekKitap.setKitapadi(kitap_ismi);
                gercekKitap.setDil(kitap_dili);
                gercekKitap.setKitaptur(kitap_turu);
                gercekKitap.setSayfasayisi(kitap_s_sayisi);
                gercekKitap.setKitapyazari(kitap_yazari);
                gercekKitap.setYayinyili(kitap_y_yili);

                if (stok_durum.equals("var")) {
                    alankisiid = "Kitap henüz alınmamış";
                    alimtarihi = "Yok";
                    stok_durum = "Stokta";
                } else if (stok_durum.equals("yok")) {
                    stok_durum = "Stokta yok, alınmış";
                }
                gercekKitap.setAlankisiid(alankisiid);
                gercekKitap.setAlimTarihi(alimtarihi);
                gercekKitap.setStok(stok_durum);

                tumkitaplar.add(gercekKitap);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sistem_bilgi_goruntuleme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton geri;
    private javax.swing.JComboBox<String> islem_sec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> kitap_bilgileri_goruntulu;
    private javax.swing.JList<String> kitaplar_goruntule;
    // End of variables declaration//GEN-END:variables

    private void kitapBilgi(int index) {
        kitap bul = tumkitaplar.get(index);
        DefaultListModel<String> listModel = new DefaultListModel<String>();
        listModel.add(0, "Barkod No: " + bul.getBarkodno());
        listModel.add(1, "Kitap Adı: " + bul.getKitapadi());
        listModel.add(2, "Kitap Yazarı: " + bul.getKitapyazari());
        listModel.add(3, "Kitap Türü: " + bul.getKitaptur());
        listModel.add(4, "Kitap Yayın Yılı: " + bul.getYayinyili());
        listModel.add(5, "Kitap Dili: " + bul.getDil());
        listModel.add(6, "Kitap Sayfa Sayısı: " + bul.getSayfasayisi());
        listModel.add(7, "Kitap Stok Durumu: " + bul.getStok());
        listModel.add(8, "Kitabı Alan Kişi ID: " + bul.getAlankisiid());
        listModel.add(9, "Kitap Alım Tarihi: " + bul.getAlimTarihi());

        kitap_bilgileri_goruntulu.setModel(listModel);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int[] inds = kitaplar_goruntule.getSelectedIndices();
        int last = inds[inds.length - 1];
        kitapBilgi(last);

    }
}
