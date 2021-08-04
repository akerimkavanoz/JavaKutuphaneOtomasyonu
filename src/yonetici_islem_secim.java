
import javax.swing.JOptionPane;


public class yonetici_islem_secim extends javax.swing.JFrame {
    String message;
    public yonetici_islem_secim() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kullanici_islemleri = new javax.swing.JButton();
        alinan_kitaplar = new javax.swing.JButton();
        kitap_islemleri = new javax.swing.JButton();
        cikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yönetici İşlem Seçim");
        setLocation(new java.awt.Point(600, 300));
        setResizable(false);

        kullanici_islemleri.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kullanici_islemleri.setText("Kullanıcı İşlemleri");
        kullanici_islemleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici_islemleriActionPerformed(evt);
            }
        });

        alinan_kitaplar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        alinan_kitaplar.setText("Kitap Bilgileri");
        alinan_kitaplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alinan_kitaplarActionPerformed(evt);
            }
        });

        kitap_islemleri.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kitap_islemleri.setText("Kitap İşlemleri");
        kitap_islemleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_islemleriActionPerformed(evt);
            }
        });

        cikis.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cikis.setText("Sistemden Çıkış");
        cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kullanici_islemleri)
                    .addComponent(alinan_kitaplar, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kitap_islemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kullanici_islemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kitap_islemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alinan_kitaplar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kullanici_islemleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici_islemleriActionPerformed
        setVisible(false);
        kullanici_islemleri ki = new kullanici_islemleri();
        ki.setVisible(true);
    }//GEN-LAST:event_kullanici_islemleriActionPerformed

    private void kitap_islemleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_islemleriActionPerformed
        setVisible(false);
        kitap_islemleri ki = new kitap_islemleri();
        ki.setVisible(true);
    }//GEN-LAST:event_kitap_islemleriActionPerformed

    private void alinan_kitaplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alinan_kitaplarActionPerformed
        setVisible(false);
        sistem_bilgi_goruntuleme sbg = new sistem_bilgi_goruntuleme();
        sbg.setVisible(true);
    }//GEN-LAST:event_alinan_kitaplarActionPerformed

    private void cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisActionPerformed
        message = "Sistemden Çıkış Yapıldı..";
        JOptionPane.showMessageDialog(this, message);
        setVisible(false);
        giris g = new giris();
        g.setVisible(true);
    }//GEN-LAST:event_cikisActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new yonetici_islem_secim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alinan_kitaplar;
    private javax.swing.JButton cikis;
    private javax.swing.JButton kitap_islemleri;
    private javax.swing.JButton kullanici_islemleri;
    // End of variables declaration//GEN-END:variables
}
