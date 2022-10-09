package ventanas;

import alertas.AlertWarningSalir;
import static java.awt.Frame.ICONIFIED;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import clases.Conexion;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import rojeru_san.RSPanelsSlider;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login extends javax.swing.JFrame {

    public static String user = "";
    String pass = "";

    public Login() {
        initComponents();
        setSize(693, 406);
        setResizable(false);
        setLocationRelativeTo(null);

    }

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
        rSPanelsSlider1 = new rojeru_san.RSPanelsSlider();
        jPanel_sesion = new javax.swing.JPanel();
        txt_user = new rojeru_san.RSMTextFull();
        txt_password = new rojeru_san.RSMPassView();
        jLabel_logoUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton_Acceder = new rojeru_san.RSButtonRiple();
        jLabel_mensajeUser = new javax.swing.JLabel();
        jPanel_cargando = new javax.swing.JPanel();
        rSProgressMaterial1 = new rojerusan.componentes.RSProgressMaterial();
        jLabel_cargando = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Button_Youtube = new rojeru_san.rsbutton.RSButtonRoundEffect();
        Button_Instagram = new rojeru_san.rsbutton.RSButtonRoundEffect();
        Button_Facebook = new rojeru_san.rsbutton.RSButtonRoundEffect();
        Button_Twitter = new rojeru_san.rsbutton.RSButtonRoundEffect();
        Button_Cerrar = new rojeru_san.RSButtonRiple();
        Button_minimizar = new rojeru_san.RSButtonRiple();

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

        jPanel_sesion.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_sesion.setName("jPanel_sesion"); // NOI18N

        txt_user.setBordeColorNoFocus(new java.awt.Color(153, 153, 153));
        txt_user.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txt_user.setModoMaterial(true);
        txt_user.setPlaceholder("Nombre de usuario...");

        txt_password.setBordeColorNoFocus(new java.awt.Color(153, 153, 153));
        txt_password.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txt_password.setModoMaterial(true);
        txt_password.setPlaceholder("Contraseña");

        jLabel_logoUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_logoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_user_24px.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_password_26px.png"))); // NOI18N

        jButton_Acceder.setText("Iniciar Sesión");
        jButton_Acceder.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton_Acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AccederActionPerformed(evt);
            }
        });

        jLabel_mensajeUser.setFont(new java.awt.Font("Roboto", 3, 12)); // NOI18N
        jLabel_mensajeUser.setForeground(new java.awt.Color(204, 0, 51));
        jLabel_mensajeUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel_sesionLayout = new javax.swing.GroupLayout(jPanel_sesion);
        jPanel_sesion.setLayout(jPanel_sesionLayout);
        jPanel_sesionLayout.setHorizontalGroup(
            jPanel_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_sesionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton_Acceder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_sesionLayout.createSequentialGroup()
                .addGroup(jPanel_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_sesionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_logoUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_sesionLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_sesionLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_sesionLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel_mensajeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel_sesionLayout.setVerticalGroup(
            jPanel_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_sesionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel_logoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_mensajeUser, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Acceder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        rSPanelsSlider1.add(jPanel_sesion, "card2");

        jPanel_cargando.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_cargando.setName("jPanel_cargando"); // NOI18N

        rSProgressMaterial1.setAnchoProgress(15);

        jLabel_cargando.setFont(new java.awt.Font("Droid Serif", 1, 18)); // NOI18N
        jLabel_cargando.setForeground(new java.awt.Color(0, 112, 192));
        jLabel_cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_cargando.setText("Cargando...");

        jLabel7.setFont(new java.awt.Font("Droid Serif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 112, 192));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("¡Espera un momento!");

        javax.swing.GroupLayout jPanel_cargandoLayout = new javax.swing.GroupLayout(jPanel_cargando);
        jPanel_cargando.setLayout(jPanel_cargandoLayout);
        jPanel_cargandoLayout.setHorizontalGroup(
            jPanel_cargandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_cargandoLayout.createSequentialGroup()
                .addGroup(jPanel_cargandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_cargandoLayout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addComponent(jLabel_cargando, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_cargandoLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(rSProgressMaterial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_cargandoLayout.setVerticalGroup(
            jPanel_cargandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_cargandoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(rSProgressMaterial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_cargando)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        rSPanelsSlider1.add(jPanel_cargando, "card3");

        jPanel2.setBackground(new java.awt.Color(0, 112, 192));

        jLabel4.setFont(new java.awt.Font("Roboto Bk", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Mi-Logo.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DATA SYSTEM");

        Button_Youtube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Youtube.png"))); // NOI18N
        Button_Youtube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_YoutubeActionPerformed(evt);
            }
        });

        Button_Instagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Instagram.png"))); // NOI18N
        Button_Instagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_InstagramActionPerformed(evt);
            }
        });

        Button_Facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Facebook.png"))); // NOI18N
        Button_Facebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_FacebookActionPerformed(evt);
            }
        });

        Button_Twitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/twitter.png"))); // NOI18N
        Button_Twitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_TwitterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(Button_Youtube, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button_Facebook, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button_Instagram, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button_Twitter, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_Youtube, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Instagram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Facebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Twitter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        Button_Cerrar.setBackground(new java.awt.Color(255, 255, 255));
        Button_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_delete_50px.png"))); // NOI18N
        Button_Cerrar.setColorHover(new java.awt.Color(255, 255, 255));
        Button_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CerrarActionPerformed(evt);
            }
        });

        Button_minimizar.setBackground(new java.awt.Color(255, 255, 255));
        Button_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_minus_50px.png"))); // NOI18N
        Button_minimizar.setColorHover(new java.awt.Color(255, 255, 255));
        Button_minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_minimizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Button_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button_Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Button_Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(rSPanelShadow1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AccederActionPerformed
        user = txt_user.getText().trim();
        pass = txt_password.getText().trim();

        if (!user.equals("") || !pass.equals("")) {

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select tipo_nivel, estatus from usuarios where username = '" + user
                        + "' and password = '" + pass + "'");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {

                    String tipo_nivel = rs.getString("tipo_nivel");
                    String estatus = rs.getString("estatus");

                    if (tipo_nivel.equalsIgnoreCase("Administrador") && estatus.equalsIgnoreCase("Activo")) {
                        //  dispose();//permite que el Jframe sea destruido
                        rSPanelsSlider1.setPanelSlider(1, jPanel_cargando, RSPanelsSlider.DIRECT.RIGHT);

                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    Thread.sleep(5000);
                                    dispose();//permite que el Jframe sea destruido
                                    new Administrador().setVisible(true);
                                } catch (InterruptedException e) {
                                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
                                }

                            }
                        }).start();

                    } else if (tipo_nivel.equalsIgnoreCase("Capturista") && estatus.equalsIgnoreCase("Activo")) {
                        rSPanelsSlider1.setPanelSlider(1, jPanel_cargando, RSPanelsSlider.DIRECT.RIGHT);

                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    Thread.sleep(5000);
                                    dispose();//permite que el Jframe sea destruido
                                    new Capturista().setVisible(true);
                                } catch (InterruptedException e) {
                                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
                                }

                            }
                        }).start();

                    } else if (tipo_nivel.equalsIgnoreCase("Tecnico") && estatus.equalsIgnoreCase("Activo")) {
                        rSPanelsSlider1.setPanelSlider(1, jPanel_cargando, RSPanelsSlider.DIRECT.RIGHT);

                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    Thread.sleep(5000);
                                    dispose();
                                    new Tecnico().setVisible(true);
                                } catch (InterruptedException e) {
                                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
                                }
                            }
                        }).start();

                    }

                } else {
                    jLabel_mensajeUser.setText("¡ Usuario y/o contraseña incorrectos ! ");
                    txt_user.setText("");
                    txt_password.setText("");
                }

            } catch (Exception e) {
                System.err.println("Error en el boton Acceder" + e);
                jLabel_mensajeUser.setText("¡Error al iniciar sesión, contacte al administrador ! ");

            }

        } else {
            jLabel_mensajeUser.setText("¡ Debe llenar todos los campos ! ");
        }


    }//GEN-LAST:event_jButton_AccederActionPerformed

    private void Button_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CerrarActionPerformed
        //procedimiento para cerrar ventana
        //System.exit(0);

        AlertWarningSalir salir = new AlertWarningSalir(this, true);
        salir.titulo.setText("¿ESTAS SEGURO DE SALIR?");
        salir.setVisible(true);

    }//GEN-LAST:event_Button_CerrarActionPerformed

    private void Button_minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_minimizarActionPerformed
        //Procedimiento para minimizar ventana
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_Button_minimizarActionPerformed
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

    private void Button_FacebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_FacebookActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/XOFTYSOFT/"));
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Button_FacebookActionPerformed

    private void Button_YoutubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_YoutubeActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/channel/UCCfwlZKXG0wUX1NCqAvjLTQ?sub_confirmation=1"));
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Button_YoutubeActionPerformed

    private void Button_InstagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_InstagramActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://www.instagram.com/xoftysoft/"));
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Button_InstagramActionPerformed

    private void Button_TwitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_TwitterActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://twitter.com/sxoftysoft"));
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Button_TwitterActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple Button_Cerrar;
    private rojeru_san.rsbutton.RSButtonRoundEffect Button_Facebook;
    private rojeru_san.rsbutton.RSButtonRoundEffect Button_Instagram;
    private rojeru_san.rsbutton.RSButtonRoundEffect Button_Twitter;
    private rojeru_san.rsbutton.RSButtonRoundEffect Button_Youtube;
    private rojeru_san.RSButtonRiple Button_minimizar;
    private rojeru_san.RSButtonRiple jButton_Acceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_cargando;
    private javax.swing.JLabel jLabel_logoUser;
    private javax.swing.JLabel jLabel_mensajeUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_cargando;
    private javax.swing.JPanel jPanel_sesion;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private rojeru_san.RSPanelsSlider rSPanelsSlider1;
    private rojerusan.componentes.RSProgressMaterial rSProgressMaterial1;
    private rojeru_san.RSMPassView txt_password;
    private rojeru_san.RSMTextFull txt_user;
    // End of variables declaration//GEN-END:variables
}
