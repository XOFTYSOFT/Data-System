package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import clases.Conexion;
import javax.swing.WindowConstants;
import alertas.AlertWarningSalir;
import alertas.AlertWarningSesion;

public class Administrador extends javax.swing.JFrame {

    String user, nombre_usuario;
    public static int sesion_usuario;

    public Administrador() {
        initComponents();
        user = Login.user;
        sesion_usuario = 1;
        setSize(889, 554);
        setResizable(false);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select nombre_usuario from usuarios where username = '" + user + "'");

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                nombre_usuario = rs.getString("nombre_usuario");
                jLabel_NombreUsuario.setText(nombre_usuario);

            }

        } catch (SQLException e) {
            System.err.println("Error en conexión desde la interfaz Administrador");
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

        jPanel1 = new javax.swing.JPanel();
        jPanel_menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton_RegistrarUsuario = new javax.swing.JButton();
        jButton_GestionarUsuarios = new javax.swing.JButton();
        jButton_Capturista = new javax.swing.JButton();
        jButton_Tecnico = new javax.swing.JButton();
        jButton_AcercaDe = new javax.swing.JButton();
        jButton_cerrarSesion = new javax.swing.JButton();
        jButton_menu = new javax.swing.JButton();
        jButton_minimizar = new javax.swing.JButton();
        jButton_Cerrar = new javax.swing.JButton();
        jLabel_NombreUsuario = new javax.swing.JLabel();
        jLabel_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 146, 244), 2));
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
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_menu.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N

        jButton_RegistrarUsuario.setBackground(new java.awt.Color(23, 146, 244));
        jButton_RegistrarUsuario.setFont(new java.awt.Font("Roboto Lt", 1, 18)); // NOI18N
        jButton_RegistrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jButton_RegistrarUsuario.setText("Registrar usuario");
        jButton_RegistrarUsuario.setContentAreaFilled(false);
        jButton_RegistrarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_RegistrarUsuario.setOpaque(true);
        jButton_RegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarUsuarioActionPerformed(evt);
            }
        });

        jButton_GestionarUsuarios.setBackground(new java.awt.Color(23, 146, 244));
        jButton_GestionarUsuarios.setFont(new java.awt.Font("Roboto Lt", 1, 18)); // NOI18N
        jButton_GestionarUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jButton_GestionarUsuarios.setText("Gestionar usuario");
        jButton_GestionarUsuarios.setContentAreaFilled(false);
        jButton_GestionarUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_GestionarUsuarios.setOpaque(true);
        jButton_GestionarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GestionarUsuariosActionPerformed(evt);
            }
        });

        jButton_Capturista.setBackground(new java.awt.Color(23, 146, 244));
        jButton_Capturista.setFont(new java.awt.Font("Roboto Lt", 1, 18)); // NOI18N
        jButton_Capturista.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Capturista.setText("Panel Capturista");
        jButton_Capturista.setContentAreaFilled(false);
        jButton_Capturista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Capturista.setOpaque(true);
        jButton_Capturista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CapturistaActionPerformed(evt);
            }
        });

        jButton_Tecnico.setBackground(new java.awt.Color(23, 146, 244));
        jButton_Tecnico.setFont(new java.awt.Font("Roboto Lt", 1, 18)); // NOI18N
        jButton_Tecnico.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Tecnico.setText("Panel Tecnico");
        jButton_Tecnico.setContentAreaFilled(false);
        jButton_Tecnico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Tecnico.setOpaque(true);
        jButton_Tecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TecnicoActionPerformed(evt);
            }
        });

        jButton_AcercaDe.setBackground(new java.awt.Color(23, 146, 244));
        jButton_AcercaDe.setFont(new java.awt.Font("Roboto Lt", 1, 18)); // NOI18N
        jButton_AcercaDe.setForeground(new java.awt.Color(255, 255, 255));
        jButton_AcercaDe.setText("Acerca de");
        jButton_AcercaDe.setContentAreaFilled(false);
        jButton_AcercaDe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_AcercaDe.setOpaque(true);
        jButton_AcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AcercaDeActionPerformed(evt);
            }
        });

        jButton_cerrarSesion.setBackground(new java.awt.Color(23, 146, 244));
        jButton_cerrarSesion.setFont(new java.awt.Font("Roboto Lt", 1, 18)); // NOI18N
        jButton_cerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jButton_cerrarSesion.setText("Cerrar Sesión");
        jButton_cerrarSesion.setContentAreaFilled(false);
        jButton_cerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_cerrarSesion.setOpaque(true);
        jButton_cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_menuLayout = new javax.swing.GroupLayout(jPanel_menu);
        jPanel_menu.setLayout(jPanel_menuLayout);
        jPanel_menuLayout.setHorizontalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_RegistrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_GestionarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(jButton_Capturista, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(jButton_Tecnico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(jButton_AcercaDe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(jButton_cerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_menuLayout.setVerticalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_RegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_GestionarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Capturista, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Tecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_AcercaDe, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jButton_cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel1.add(jPanel_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, -1, -1));

        jButton_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu.png"))); // NOI18N
        jButton_menu.setBorder(null);
        jButton_menu.setContentAreaFilled(false);
        jButton_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_menuActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jButton_minimizar.setBackground(new java.awt.Color(23, 146, 244));
        jButton_minimizar.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jButton_minimizar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_minimizar.setText("-");
        jButton_minimizar.setToolTipText("");
        jButton_minimizar.setBorder(null);
        jButton_minimizar.setContentAreaFilled(false);
        jButton_minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_minimizarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 5, 49, 43));

        jButton_Cerrar.setBackground(new java.awt.Color(23, 146, 244));
        jButton_Cerrar.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jButton_Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Cerrar.setText("X");
        jButton_Cerrar.setToolTipText("");
        jButton_Cerrar.setBorder(null);
        jButton_Cerrar.setContentAreaFilled(false);
        jButton_Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CerrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(823, 5, 50, 43));

        jLabel_NombreUsuario.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel_NombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_NombreUsuario.setText("jLabel2");
        jPanel1.add(jLabel_NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, -1, 30));

        jLabel_wallpaper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Wallpaper.png"))); // NOI18N
        jLabel_wallpaper.setText("jLabel2");
        jPanel1.add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -10, 630, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CerrarActionPerformed

        AlertWarningSalir salir = new AlertWarningSalir(this, true);
        salir.titulo.setText("¿ ESTAS SEGURO DE SALIR ?");
        salir.setVisible(true);

    }//GEN-LAST:event_jButton_CerrarActionPerformed

    private void jButton_minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_minimizarActionPerformed

        this.setExtendedState(ICONIFIED);

    }//GEN-LAST:event_jButton_minimizarActionPerformed

    private void jButton_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_menuActionPerformed

        int posicion = jButton_menu.getX();
        if (posicion > 5) {
            Animacion.Animacion.mover_izquierda(255, 5, 2, 2, jButton_menu);
            Animacion.Animacion.mover_izquierda(5, -250, 2, 2, jPanel_menu);

        } else {
            Animacion.Animacion.mover_derecha(5, 260, 2, 2, jButton_menu);
            Animacion.Animacion.mover_derecha(-250, 5, 2, 2, jPanel_menu);
        }

    }//GEN-LAST:event_jButton_menuActionPerformed

    private void jButton_RegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarUsuarioActionPerformed

        RegistrarUsuarios registrarUsuarios = new RegistrarUsuarios();
        registrarUsuarios.setVisible(true);

    }//GEN-LAST:event_jButton_RegistrarUsuarioActionPerformed
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

    private void jButton_GestionarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GestionarUsuariosActionPerformed

        GestionarUsuarios gestionarUsuarios = new GestionarUsuarios();
        gestionarUsuarios.setVisible(true);

    }//GEN-LAST:event_jButton_GestionarUsuariosActionPerformed

    private void jButton_CapturistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CapturistaActionPerformed

      Capturista capturista = new Capturista();
      capturista.setVisible(true);
        
    }//GEN-LAST:event_jButton_CapturistaActionPerformed

    private void jButton_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cerrarSesionActionPerformed

        AlertWarningSesion sesion = new AlertWarningSesion(this, true);
        sesion.titulo.setText("¿ESTAS SEGURO DE CERRAR LA SESIÓN");
        sesion.titulo2.setText("DE ADMINISTRADOR?");
        sesion.setVisible(true);
        
        if(AlertWarningSesion.salir){
            this.dispose();
            new ventanas.Login().setVisible(true);
        }
        
    }//GEN-LAST:event_jButton_cerrarSesionActionPerformed

    private void jButton_TecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TecnicoActionPerformed

        Tecnico tecnico = new Tecnico();
        tecnico.setVisible(true);
      
    }//GEN-LAST:event_jButton_TecnicoActionPerformed

    private void jButton_AcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AcercaDeActionPerformed
        About about = new About();
        about.setVisible(true);

    }//GEN-LAST:event_jButton_AcercaDeActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AcercaDe;
    private javax.swing.JButton jButton_Capturista;
    private javax.swing.JButton jButton_Cerrar;
    private javax.swing.JButton jButton_GestionarUsuarios;
    private javax.swing.JButton jButton_RegistrarUsuario;
    private javax.swing.JButton jButton_Tecnico;
    private javax.swing.JButton jButton_cerrarSesion;
    private javax.swing.JButton jButton_menu;
    private javax.swing.JButton jButton_minimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_NombreUsuario;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_menu;
    // End of variables declaration//GEN-END:variables
}
