/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import rojeru_san.complementos.RSUtilities;

/**
 *
 * @author dell
 */
public class About extends javax.swing.JFrame {

    /**
     * Creates new form About
     */
    public About() {
        initComponents();
        setSize(783, 550);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public void abrirEnlace(String link) {
        try {
            Desktop.getDesktop().browse(new URI(link));
        } catch (IOException | URISyntaxException ex) {
            Logger.getLogger(About.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelShadow1 = new rojeru_san.rspanel.RSPanelShadow();
        jPanel1 = new javax.swing.JPanel();
        rSPanelBorder1 = new RSMaterialComponent.RSPanelBorder();
        rSButtonIconOne1 = new RSMaterialComponent.RSButtonIconOne();
        rSLabelTextIcon1 = new RSMaterialComponent.RSLabelTextIcon();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMsg = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        Button_Facebook = new RSMaterialComponent.RSButtonMaterialOne();
        Button_Youtube = new RSMaterialComponent.RSButtonMaterialOne();
        Button_web = new RSMaterialComponent.RSButtonMaterialOne();
        Button_Paypal = new RSMaterialComponent.RSButtonMaterialOne();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        rSPanelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        rSPanelBorder1.setBgBorder(new java.awt.Color(23, 146, 244));
        rSPanelBorder1.setBorderLeft(false);
        rSPanelBorder1.setBorderRight(false);
        rSPanelBorder1.setBorderTop(false);

        rSButtonIconOne1.setBackground(new java.awt.Color(204, 0, 51));
        rSButtonIconOne1.setBackgroundHover(new java.awt.Color(255, 51, 0));
        rSButtonIconOne1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        rSButtonIconOne1.setRound(5);
        rSButtonIconOne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconOne1ActionPerformed(evt);
            }
        });

        rSLabelTextIcon1.setForeground(new java.awt.Color(23, 146, 244));
        rSLabelTextIcon1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSLabelTextIcon1.setText("Acerca de");
        rSLabelTextIcon1.setColorIcon(new java.awt.Color(23, 146, 244));
        rSLabelTextIcon1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        rSLabelTextIcon1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ACCOUNT_CIRCLE);

        javax.swing.GroupLayout rSPanelBorder1Layout = new javax.swing.GroupLayout(rSPanelBorder1);
        rSPanelBorder1.setLayout(rSPanelBorder1Layout);
        rSPanelBorder1Layout.setHorizontalGroup(
            rSPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSLabelTextIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSButtonIconOne1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        rSPanelBorder1Layout.setVerticalGroup(
            rSPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rSButtonIconOne1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(rSLabelTextIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setBorder(null);

        txtMsg.setEditable(false);
        txtMsg.setContentType("text/html"); // NOI18N
        txtMsg.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n\n    <p style=\"margin-top: 0;text-align:center;font-size:12px;font-family:Tahoma;\">\n      Software desarrollado por <b>Andrés de Jesús Muñoz Gil.</b>\n    </p>\n\n    <br>\n\n    <p style=\"margin-top: 0;text-align:center;font-size:12px;font-family:Tahoma;\">\n     Gracias por utilizar mi software, si te es util, por favor suscríbanse a mi canal de YouTube, que me sigan en Facebook <b> tambien pueden dejar su notivo </b> De esta forma podre seguir compartiendo contenido <b> Gratuito.</b> \n    </p>\n\n  </body>\r\n</html>\r\n");
        txtMsg.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtMsg.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(txtMsg);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/splash/Mi-Logo.png"))); // NOI18N

        Button_Facebook.setText("FaceBook");
        Button_Facebook.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        Button_Facebook.setRound(5);
        Button_Facebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_FacebookActionPerformed(evt);
            }
        });

        Button_Youtube.setBackground(new java.awt.Color(153, 0, 0));
        Button_Youtube.setText("YouTube");
        Button_Youtube.setBackgroundHover(new java.awt.Color(153, 0, 0));
        Button_Youtube.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        Button_Youtube.setRound(5);
        Button_Youtube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_YoutubeActionPerformed(evt);
            }
        });

        Button_web.setText("Pagina web");
        Button_web.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        Button_web.setRound(5);
        Button_web.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_webActionPerformed(evt);
            }
        });

        Button_Paypal.setText("PayPal");
        Button_Paypal.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        Button_Paypal.setRound(5);
        Button_Paypal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PaypalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(Button_Facebook, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Button_web, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Button_Youtube, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Button_Paypal, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rSPanelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 413, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Facebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_web, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Youtube, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Paypal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(187, Short.MAX_VALUE)))
        );

        rSPanelShadow1.add(jPanel1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_FacebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_FacebookActionPerformed
        abrirEnlace("https://www.facebook.com/XOFTYSOFT");
    }//GEN-LAST:event_Button_FacebookActionPerformed

    private void Button_YoutubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_YoutubeActionPerformed
        abrirEnlace("https://www.youtube.com/channel/UCCfwlZKXG0wUX1NCqAvjLTQ");
    }//GEN-LAST:event_Button_YoutubeActionPerformed

    private void Button_webActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_webActionPerformed
        abrirEnlace("https://xoftysoft.com/");
    }//GEN-LAST:event_Button_webActionPerformed

    private void Button_PaypalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_PaypalActionPerformed
        abrirEnlace("https://www.paypal.com/paypalme/AndresMGil");
    }//GEN-LAST:event_Button_PaypalActionPerformed

    private void rSButtonIconOne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconOne1ActionPerformed
         this.dispose();
    }//GEN-LAST:event_rSButtonIconOne1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialOne Button_Facebook;
    private RSMaterialComponent.RSButtonMaterialOne Button_Paypal;
    private RSMaterialComponent.RSButtonMaterialOne Button_Youtube;
    private RSMaterialComponent.RSButtonMaterialOne Button_web;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSButtonIconOne rSButtonIconOne1;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon1;
    private RSMaterialComponent.RSPanelBorder rSPanelBorder1;
    private rojeru_san.rspanel.RSPanelShadow rSPanelShadow1;
    public javax.swing.JTextPane txtMsg;
    // End of variables declaration//GEN-END:variables
}
