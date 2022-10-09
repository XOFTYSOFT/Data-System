package ventanas;

import alertas.AlertInformation;
import alertas.AlertWarning;
import alertas.AlertSuccess;
import clases.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class RegistrarUsuarios extends javax.swing.JFrame {

    String user;

    public RegistrarUsuarios() {
        initComponents();
        user = Login.user;

        setSize(640, 496);
        setResizable(false);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }

    //Procedimiento para colocar icono en nuestro Jframe
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelShadow1 = new rojeru_san.RSPanelShadow();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton_Cerrar = new RSMaterialComponent.RSButtonIconOne();
        jLabel2 = new javax.swing.JLabel();
        txt_mail = new rojeru_san.RSMTextFull();
        jLabel3 = new javax.swing.JLabel();
        txt_telefono = new rojeru_san.RSMTextFull();
        jLabel4 = new javax.swing.JLabel();
        txt_username = new RSMaterialComponent.RSTextFieldMaterialIcon();
        cmb_niveles = new rojerusan.RSComboMetro();
        Button_Aceptar = new rojeru_san.RSButtonRiple();
        Button_cancelar = new rojeru_san.RSButtonRiple();
        txt_password = new RSMaterialComponent.RSPasswordIconTwo();
        jLabel5 = new javax.swing.JLabel();
        txt_nombre = new rojeru_san.RSMTextFull();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        rSPanelShadow1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 146, 244), 2));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(23, 146, 244));

        jLabel1.setFont(new java.awt.Font("Roboto Bk", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar usuarios");

        jButton_Cerrar.setBackground(new java.awt.Color(204, 0, 51));
        jButton_Cerrar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        jButton_Cerrar.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton_Cerrar.setRound(5);
        jButton_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(jButton_Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_user_24px.png"))); // NOI18N

        txt_mail.setBordeColorNoFocus(new java.awt.Color(153, 153, 153));
        txt_mail.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txt_mail.setModoMaterial(true);
        txt_mail.setPlaceholder("Em@il");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_email_30px.png"))); // NOI18N

        txt_telefono.setBordeColorNoFocus(new java.awt.Color(153, 153, 153));
        txt_telefono.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txt_telefono.setModoMaterial(true);
        txt_telefono.setPlaceholder("Telefono");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_phone_26px.png"))); // NOI18N

        txt_username.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txt_username.setPlaceholder("Username");

        cmb_niveles.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Capturista", "Tecnico" }));
        cmb_niveles.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N

        Button_Aceptar.setText("Aceptar");
        Button_Aceptar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Button_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AceptarActionPerformed(evt);
            }
        });

        Button_cancelar.setBackground(new java.awt.Color(204, 0, 51));
        Button_cancelar.setText("Cancelar");
        Button_cancelar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Button_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_cancelarActionPerformed(evt);
            }
        });

        txt_password.setPlaceholder("Password");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Creado por XOFTYSOFT ®");

        txt_nombre.setBordeColorNoFocus(new java.awt.Color(153, 153, 153));
        txt_nombre.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txt_nombre.setModoMaterial(true);
        txt_nombre.setPlaceholder("Nombre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(207, 207, 207))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Button_Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_username, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                        .addComponent(cmb_niveles, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                        .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_niveles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jLabel5)
                .addGap(19, 19, 19))
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

    private void jButton_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CerrarActionPerformed
        this.dispose();

    }//GEN-LAST:event_jButton_CerrarActionPerformed
    int xx, xy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed

        xx = evt.getX();
        xy = evt.getY();

    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xx, y - xy);

    }//GEN-LAST:event_jPanel1MouseDragged

    private void Button_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AceptarActionPerformed

        int permisos_cmb, validacion = 0;
        String nombre, mail, telefono, username, pass, permisos_string = "";

        mail = txt_mail.getText().trim();
        username = txt_username.getText().trim();
        pass = txt_password.getText().trim();
        nombre = txt_nombre.getText().trim();
        telefono = txt_telefono.getText().trim();
        permisos_cmb = cmb_niveles.getSelectedIndex() + 1;

        if (mail.equals("")) {
            txt_mail.setBackground(Color.red);
            validacion++;

        }
        if (username.equals("")) {
            txt_username.setBackground(Color.red);
            validacion++;

        }
        if (pass.equals("")) {
            txt_password.setBackground(Color.red);
            validacion++;

        }
        if (nombre.equals("")) {
            txt_nombre.setBackground(Color.red);
            validacion++;

        }
        if (telefono.equals("")) {
            txt_telefono.setBackground(Color.red);
            validacion++;

        }

        if (permisos_cmb == 1) {
            permisos_string = "Administrador";

        } else if (permisos_cmb == 2) {
            permisos_string = "Capturista";

        } else if (permisos_cmb == 3) {
            permisos_string = "Tecnico";
        }

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select username from usuarios where username = '" + username + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txt_username.setBackground(Color.red);
                AlertInformation informacion = new AlertInformation(this, true);
                informacion.titulo.setText("NOMBRE DE USUARIO NO DISPONIBLE");
                informacion.setVisible(true);
                cn.close();

            } else {

                cn.close();

                if (validacion == 0) {
                    try {
                        Connection cn2 = Conexion.conectar();
                        PreparedStatement pst2 = cn2.prepareStatement(
                                "insert into usuarios values (?,?,?,?,?,?,?,?,?)");

                        pst2.setInt(1, 0);
                        pst2.setString(2, nombre);
                        pst2.setString(3, mail);
                        pst2.setString(4, telefono);
                        pst2.setString(5, username);
                        pst2.setString(6, pass);
                        pst2.setString(7, permisos_string);
                        pst2.setString(8, "Activo");
                        pst2.setString(9, user);

                        pst2.executeUpdate();
                        cn2.close();

                        Limpiar();

                        txt_mail.setBackground(Color.green);
                        txt_username.setBackground(Color.green);
                        txt_password.setBackground(Color.green);
                        txt_nombre.setBackground(Color.green);
                        txt_telefono.setBackground(Color.green);

                        AlertSuccess succes = new AlertSuccess(this, true);
                        succes.Succes.setText("REGISTRO EXITOSO");
                        succes.setVisible(true);
                        this.dispose();

                    } catch (SQLException e) {
                        System.err.println("Error en Registrar usuario." + e);
                        JOptionPane.showMessageDialog(null, "¡¡Error!!, contacte al Administrador.");
                    }

                } else {
                    AlertInformation information = new AlertInformation(this, true);
                    information.titulo.setText("DEBES DE LLENAR TODOS LOS CAMPOS");
                    information.setVisible(true);
                }

            }
        } catch (SQLException e) {
            System.err.println("Erro en Registrar usuario." + e);
            JOptionPane.showMessageDialog(null, "¡¡Error al comparar usuario!!, contacte al Administrador.");

        }

    }//GEN-LAST:event_Button_AceptarActionPerformed

    private void Button_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_cancelarActionPerformed
        AlertWarning warning = new AlertWarning(this, true);
        warning.warning.setText("¿DESEA CANCELAR EL REGISTRO?");
        warning.setVisible(true);
        dispose();

    }//GEN-LAST:event_Button_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple Button_Aceptar;
    private rojeru_san.RSButtonRiple Button_cancelar;
    private rojerusan.RSComboMetro cmb_niveles;
    private RSMaterialComponent.RSButtonIconOne jButton_Cerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private rojeru_san.RSMTextFull txt_mail;
    private rojeru_san.RSMTextFull txt_nombre;
    private RSMaterialComponent.RSPasswordIconTwo txt_password;
    private rojeru_san.RSMTextFull txt_telefono;
    private RSMaterialComponent.RSTextFieldMaterialIcon txt_username;
    // End of variables declaration//GEN-END:variables

    public void Limpiar() {
        txt_mail.setText("");
        txt_password.setText("");
        txt_telefono.setText("");
        txt_username.setText("");
        cmb_niveles.setSelectedIndex(0);
    }
}
