
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class kullanici_giris extends javax.swing.JFrame {
    private String uyeid;
    public kullanici_giris() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kullanici_id = new javax.swing.JTextField();
        kullanici_adi = new javax.swing.JTextField();
        kullanici_sifre = new javax.swing.JPasswordField();
        giris_yap = new javax.swing.JButton();
        sifreyi_goster = new javax.swing.JCheckBox();
        geri = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kullanıcı Giriş");
        setLocation(new java.awt.Point(600, 300));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Kullanıcı ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Kullanıcı Adı:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Şifre:");

        kullanici_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        kullanici_adi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        kullanici_sifre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        giris_yap.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        giris_yap.setText("Giriş Yap");
        giris_yap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giris_yapActionPerformed(evt);
            }
        });

        sifreyi_goster.setText("Şifre Göster");
        sifreyi_goster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreyi_gosterActionPerformed(evt);
            }
        });

        geri.setText("Geri");
        geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("KULLANICI GİRİŞ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 3, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(kullanici_id, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addGap(190, 190, 190))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kullanici_adi)
                            .addComponent(kullanici_sifre))
                        .addGap(41, 41, 41)
                        .addComponent(sifreyi_goster, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(giris_yap, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geri)
                        .addGap(148, 148, 148)
                        .addComponent(jLabel4)))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geri))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullanici_id, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullanici_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kullanici_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sifreyi_goster, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addComponent(giris_yap, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void giris_yapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giris_yapActionPerformed
        String id = kullanici_id.getText();;
        while (id == null){
            System.out.println(id);
            id = kullanici_id.getText();
        }
        String k_adi = kullanici_adi.getText();
        String k_sifre = new String(kullanici_sifre.getPassword());
        String message;
        
        File inputFile = new File("kisiler.xml");

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputFile);

            Element kokElement = document.getDocumentElement();
 
            NodeList kisiListesi = kokElement.getElementsByTagName("kisi");
            
            String rID = "",kisiAdi = "",kisiSifre = "";
            for (int i = 0; i < kisiListesi.getLength(); i++) {
                Node kisi = kisiListesi.item(i);
                Element kisiElement = (Element) kisi;
                
                rID = kisiElement.getElementsByTagName("id").item(0).getTextContent();
                kisiAdi = kisiElement.getElementsByTagName("isim").item(0).getTextContent();
                kisiSifre = kisiElement.getElementsByTagName("sifre").item(0).getTextContent();
               
                if (rID.equals(id)) {
                    break;
                }
            }
            if (rID.equals(id) && kisiAdi.equals(k_adi) && kisiSifre.equals(k_sifre)){
                message = "Giriş Başarılı";
                JOptionPane.showMessageDialog(this, message);
                setVisible(false);
                uye_islemleri ui = new uye_islemleri(id);
                ui.setVisible(true);
            }
            else if (rID.equals(id) && !kisiAdi.equals(k_adi) && kisiSifre.equals(k_sifre)) {
                message = "Kullanıcı Adı Hatalı";
                JOptionPane.showMessageDialog(this, message,"Hata",JOptionPane.ERROR_MESSAGE);
            }
            else if (rID.equals(id) && kisiAdi.equals(k_adi) && !kisiSifre.equals(k_sifre)) {
                message = "Şifre Hatalı";
                JOptionPane.showMessageDialog(this, message,"Hata",JOptionPane.ERROR_MESSAGE);
            }
            else if (rID.equals(id) && !kisiAdi.equals(k_adi) && !kisiSifre.equals(k_sifre)) {
                message = "Kullanıcı Adı ve Şifre Hatalı";
                JOptionPane.showMessageDialog(this, message,"Hata",JOptionPane.ERROR_MESSAGE);
            }
            else {
               message = "Hatalı Giriş";
               JOptionPane.showMessageDialog(this, message,"Hata",JOptionPane.ERROR_MESSAGE);       
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_giris_yapActionPerformed

    private void sifreyi_gosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreyi_gosterActionPerformed
       if (sifreyi_goster.isSelected()) {
           kullanici_sifre.setEchoChar((char)0);
       }
       else {
           kullanici_sifre.setEchoChar('*');
       }
    }//GEN-LAST:event_sifreyi_gosterActionPerformed

    private void geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriActionPerformed
        setVisible(false);
        giris g = new giris();
        g.setVisible(true);
    }//GEN-LAST:event_geriActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kullanici_giris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton geri;
    private javax.swing.JButton giris_yap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField kullanici_adi;
    private javax.swing.JTextField kullanici_id;
    private javax.swing.JPasswordField kullanici_sifre;
    private javax.swing.JCheckBox sifreyi_goster;
    // End of variables declaration//GEN-END:variables
}
