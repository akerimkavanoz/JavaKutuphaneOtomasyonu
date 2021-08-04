
import com.sun.glass.events.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import javafx.scene.input.KeyCode;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class kitap_arama extends javax.swing.JFrame implements ListSelectionListener {

    String uyeid;

    public kitap_arama() {
        initComponents();
        kitaplistesi.addListSelectionListener(this);
    }

    public kitap_arama(String id) {
        initComponents();
        kitaplistesi.addListSelectionListener(this);
        uyeid = id;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        kitaplistesi = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        kitap_bilgiler = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        aranacak = new javax.swing.JTextField();
        islemler = new javax.swing.JComboBox<>();
        geri = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kitap Arama");
        setLocation(new java.awt.Point(600, 300));
        setResizable(false);

        kitaplistesi.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        kitaplistesi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(kitaplistesi);

        jScrollPane2.setViewportView(kitap_bilgiler);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ara:");

        aranacak.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                aranacakKeyPressed(evt);
            }
        });

        islemler.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İşlem Seçiniz", "İsme Göre Arama", "Yazarına Göre Arama", "Türüne Göre Arama", "Yayın Yılına Göre Arama", "Diline Göre Arama" }));

        geri.setText("Geri");
        geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("KİTAP ARAMA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(islemler, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(aranacak, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geri)
                .addGap(212, 212, 212)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(geri)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(islemler, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aranacak, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void aranacakKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aranacakKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // to do
            if (islemler.getSelectedIndex() == 1) {
                // isme göre
                String kelime = aranacak.getText().toLowerCase();
                ismeGoreAra(kelime);
            } else if (islemler.getSelectedIndex() == 2) {
                //yazara gore
                String kelime = aranacak.getText().toLowerCase();
                yazaraGoreArama(kelime);
            } else if (islemler.getSelectedIndex() == 3) {
                //ture gore
                String kelime = aranacak.getText().toLowerCase();
                tureGoreArama(kelime);
            } else if (islemler.getSelectedIndex() == 4) {
                //yayın yılına gore
                String kelime = aranacak.getText().toLowerCase();
                yayinyilineGoreArama(kelime);
            } else if (islemler.getSelectedIndex() == 5) {
                //dile gore
                String kelime = aranacak.getText().toLowerCase();
                dileGoreArama(kelime);
            } else {
                String message = "Lütfen işlem seçiniz.";
                JOptionPane.showMessageDialog(this, message, "Hata", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_aranacakKeyPressed

    private void geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriActionPerformed
        setVisible(false);
        uye_islemleri ui = new uye_islemleri(uyeid);
        ui.setVisible(true);
    }//GEN-LAST:event_geriActionPerformed

    ArrayList<kitap> liste;

    private void ismeGoreAra(String isim) {
        File inputFile = new File("kitaplar.xml");
        String message;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputFile);

            Element kokElement = document.getDocumentElement();

            NodeList kitapListesi = kokElement.getElementsByTagName("kitap");

            boolean isExist = false;
            String barkod_no, kitap_ismi, kitap_yazari, kitap_turu, kitap_y_yili, kitap_s_sayisi, kitap_dili;
            kitap gercekKitap = new kitap();
            liste = new ArrayList<kitap>();
            for (int i = 0; i < kitapListesi.getLength(); i++) {
                Node kitap = kitapListesi.item(i);
                Element kitapElement = (Element) kitap;

                kitap_ismi = kitapElement.getElementsByTagName("isim").item(0).getTextContent().toLowerCase();

                if (kitap_ismi.equals(isim)) {

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
                    liste.add(gercekKitap);
                } else {
                    continue;
                }
            }
            if (isExist == true) {
                message = isim.toUpperCase() + " isminde kitap(lar) bulundu.";
                JOptionPane.showMessageDialog(this, message);
                kitaplarEkle(liste);
            } else {
                message = isim.toUpperCase() + " isminde kitap bulunamadı.";
                JOptionPane.showMessageDialog(this, message, "Hata", JOptionPane.ERROR_MESSAGE);
                aranacak.setText("");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private void yazaraGoreArama(String yazar) {

        File inputFile = new File("kitaplar.xml");
        String message;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputFile);

            Element kokElement = document.getDocumentElement();

            NodeList kitapListesi = kokElement.getElementsByTagName("kitap");

            boolean isExist = false;
            String barkod_no, kitap_ismi, kitap_yazari, kitap_turu, kitap_y_yili, kitap_s_sayisi, kitap_dili;
            kitap gercekKitap = new kitap();
            liste = new ArrayList<kitap>();
            for (int i = 0; i < kitapListesi.getLength(); i++) {
                Node kitap = kitapListesi.item(i);
                Element kitapElement = (Element) kitap;
                kitap_yazari = kitapElement.getElementsByTagName("yazar").item(0).getTextContent().toLowerCase();

                if (yazar.equals(kitap_yazari)) {

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
                    liste.add(gercekKitap);
                } else {
                    continue;
                }
            }
            if (isExist == true) {
                message = yazar.toUpperCase() + " adlı yazara ait kitap(lar) bulundu.";
                JOptionPane.showMessageDialog(this, message);
                kitaplarEkle(liste);
            } else {
                message = yazar.toUpperCase() + " adlı yazara ait kitap bulunamadı.";
                JOptionPane.showMessageDialog(this, message, "Hata", JOptionPane.ERROR_MESSAGE);
                aranacak.setText("");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private void tureGoreArama(String tur) {
        File inputFile = new File("kitaplar.xml");
        String message;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputFile);

            Element kokElement = document.getDocumentElement();

            NodeList kitapListesi = kokElement.getElementsByTagName("kitap");

            boolean isExist = false;
            String barkod_no, kitap_ismi, kitap_yazari, kitap_turu, kitap_y_yili, kitap_s_sayisi, kitap_dili;
            kitap gercekKitap = new kitap();
            liste = new ArrayList<kitap>();
            for (int i = 0; i < kitapListesi.getLength(); i++) {
                Node kitap = kitapListesi.item(i);
                Element kitapElement = (Element) kitap;
                kitap_turu = kitapElement.getElementsByTagName("tur").item(0).getTextContent().toLowerCase();

                if (tur.equals(kitap_turu)) {

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
                    liste.add(gercekKitap);
                } else {
                    continue;
                }
            }
            if (isExist == true) {
                message = tur.toUpperCase() + " türünde kitap(lar) bulundu.";
                JOptionPane.showMessageDialog(this, message);
                kitaplarEkle(liste);
            } else {
                message = tur.toUpperCase() + " türünde kitap bulunamadı.";
                JOptionPane.showMessageDialog(this, message, "Hata", JOptionPane.ERROR_MESSAGE);
                aranacak.setText("");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private void yayinyilineGoreArama(String yayinyili) {
        File inputFile = new File("kitaplar.xml");
        String message;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputFile);

            Element kokElement = document.getDocumentElement();

            NodeList kitapListesi = kokElement.getElementsByTagName("kitap");

            boolean isExist = false;
            String barkod_no, kitap_ismi, kitap_yazari, kitap_turu, kitap_y_yili, kitap_s_sayisi, kitap_dili;
            kitap gercekKitap = new kitap();
            liste = new ArrayList<kitap>();
            for (int i = 0; i < kitapListesi.getLength(); i++) {
                Node kitap = kitapListesi.item(i);
                Element kitapElement = (Element) kitap;
                kitap_y_yili = kitapElement.getElementsByTagName("yayinyili").item(0).getTextContent().toLowerCase();

                if (yayinyili.equals(kitap_y_yili)) {

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
                    liste.add(gercekKitap);
                } else {
                    continue;
                }
            }
            if (isExist == true) {
                message = yayinyili.toUpperCase() + " yayın yılına ait kitap(lar) bulundu.";
                JOptionPane.showMessageDialog(this, message);
                kitaplarEkle(liste);
            } else {
                message = yayinyili.toUpperCase() + " yayın yılına ait kitap bulunamadı.";
                JOptionPane.showMessageDialog(this, message, "Hata", JOptionPane.ERROR_MESSAGE);
                aranacak.setText("");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private void dileGoreArama(String dil) {
        File inputFile = new File("kitaplar.xml");
        String message;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputFile);

            Element kokElement = document.getDocumentElement();

            NodeList kitapListesi = kokElement.getElementsByTagName("kitap");

            boolean isExist = false;
            String barkod_no, kitap_ismi, kitap_yazari, kitap_turu, kitap_y_yili, kitap_s_sayisi, kitap_dili;
            kitap gercekKitap = new kitap();
            liste = new ArrayList<kitap>();
            for (int i = 0; i < kitapListesi.getLength(); i++) {
                Node kitap = kitapListesi.item(i);
                Element kitapElement = (Element) kitap;
                kitap_dili = kitapElement.getElementsByTagName("dili").item(0).getTextContent().toLowerCase();

                if (dil.equals(kitap_dili)) {

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
                    liste.add(gercekKitap);
                } else {
                    continue;
                }
            }
            if (isExist == true) {
                message = dil.toUpperCase() + " dilinde kitap(lar) bulundu.";
                JOptionPane.showMessageDialog(this, message);
                kitaplarEkle(liste);
            } else {
                message = dil.toUpperCase() + " dilinde kitap bulunamadı.";
                JOptionPane.showMessageDialog(this, message, "Hata", JOptionPane.ERROR_MESSAGE);
                aranacak.setText("");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private void kitaplarEkle(ArrayList<kitap> kitaplar) {
        DefaultListModel<String> listModel = new DefaultListModel<String>();
        for (int i = 0; i < kitaplar.size(); i++) {
            listModel.add(i, kitaplar.get(i).getKitapadi());
        }
        kitaplistesi.setModel(listModel);
    }

    private void kitapBilgi(int index) {
        kitap bul = liste.get(index);
        DefaultListModel<String> listModel = new DefaultListModel<String>();
        listModel.add(0, "Barkod No: " + bul.getBarkodno());
        listModel.add(1, "Kitap Adı: " + bul.getKitapadi());
        listModel.add(2, "Kitap Yazarı: " + bul.getKitapyazari());
        listModel.add(3, "Kitap Türü: " + bul.getKitaptur());
        listModel.add(4, "Kitap Yayın Yılı: " + bul.getYayinyili());
        listModel.add(5, "Kitap Dili: " + bul.getDil());
        listModel.add(6, "Kitap Sayfa Sayısı: " + bul.getSayfasayisi());
        kitap_bilgiler.setModel(listModel);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(kitap_arama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kitap_arama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kitap_arama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kitap_arama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kitap_arama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aranacak;
    private javax.swing.JButton geri;
    private javax.swing.JComboBox<String> islemler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> kitap_bilgiler;
    private javax.swing.JList<String> kitaplistesi;
    // End of variables declaration//GEN-END:variables

    private int listeBoyut() {
        int result = kitaplistesi.getModel().getSize();
        return result;
    }

    public void valueChanged(ListSelectionEvent e) {
        int[] inds = kitaplistesi.getSelectedIndices();
        if (inds.length > 0) {
            int last = inds[inds.length - 1];
            kitapBilgi(last);
        }
    }
}
