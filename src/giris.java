
public class giris extends javax.swing.JFrame {

    public giris() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        kullanici_girisi = new javax.swing.JButton();
        yonetici_girisi = new javax.swing.JButton();
        cikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kütüphane Otomasyonu");
        setLocation(new java.awt.Point(600, 300));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("KÜTÜPHANE OTOMASYONUNA HOŞGELDİNİZ");

        kullanici_girisi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kullanici_girisi.setText("KULLANICI GİRİŞİ");
        kullanici_girisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici_girisiActionPerformed(evt);
            }
        });

        yonetici_girisi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        yonetici_girisi.setText("YÖNETİCİ GİRİŞİ");
        yonetici_girisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yonetici_girisiActionPerformed(evt);
            }
        });

        cikis.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cikis.setText("ÇIKIŞ");
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
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(yonetici_girisi, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(kullanici_girisi, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(231, 231, 231))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yonetici_girisi, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullanici_girisi, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cikisActionPerformed

    private void yonetici_girisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yonetici_girisiActionPerformed
        setVisible(false);
        yonetici_giris yg = new yonetici_giris();
        yg.setVisible(true);
    }//GEN-LAST:event_yonetici_girisiActionPerformed

    private void kullanici_girisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici_girisiActionPerformed
        setVisible(false);
        kullanici_giris kg = new kullanici_giris();
        kg.setVisible(true);
    }//GEN-LAST:event_kullanici_girisiActionPerformed
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new giris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cikis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kullanici_girisi;
    private javax.swing.JButton yonetici_girisi;
    // End of variables declaration//GEN-END:variables
}
