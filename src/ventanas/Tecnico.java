package ventanas;

import alertas.AlertWarningSalir;
import alertas.AlertWarningSesion;
import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.WindowConstants;

public class Tecnico extends javax.swing.JFrame {

    String user, nombre_usuario;
    int sesion_usuario;

    public Tecnico() {
        user = Login.user;
        sesion_usuario = Administrador.sesion_usuario;

        initComponents();
        setSize(889, 554);
        setResizable(false);
        setLocationRelativeTo(null);

        if (sesion_usuario == 1) {
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        } else {
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select nombre_usuario from usuarios where username = '" + user + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next());
            nombre_usuario = rs.getString("nombre_usuario");
            jLabel_NombreUsuario.setText("Bienvenido: " + nombre_usuario);

        } catch (SQLException e) {
            System.out.println("Error en consultar nombre de capturista. ");
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
        jButton_GestionarEquipo = new javax.swing.JButton();
        jButton_GraficaEstatus = new javax.swing.JButton();
        jButton_GraficaMarcas = new javax.swing.JButton();
        Button_CerrarSesion = new javax.swing.JButton();
        jButton_menu = new javax.swing.JButton();
        jButton_minimizar = new javax.swing.JButton();
        jButton_Cerrar = new javax.swing.JButton();
        jLabel_NombreUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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
        jPanel_menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N

        jButton_GestionarEquipo.setBackground(new java.awt.Color(23, 146, 244));
        jButton_GestionarEquipo.setFont(new java.awt.Font("Droid Serif", 1, 18)); // NOI18N
        jButton_GestionarEquipo.setForeground(new java.awt.Color(255, 255, 255));
        jButton_GestionarEquipo.setText("Gestion de equipo");
        jButton_GestionarEquipo.setContentAreaFilled(false);
        jButton_GestionarEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_GestionarEquipo.setOpaque(true);
        jButton_GestionarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GestionarEquipoActionPerformed(evt);
            }
        });

        jButton_GraficaEstatus.setBackground(new java.awt.Color(23, 146, 244));
        jButton_GraficaEstatus.setFont(new java.awt.Font("Droid Serif", 1, 18)); // NOI18N
        jButton_GraficaEstatus.setForeground(new java.awt.Color(255, 255, 255));
        jButton_GraficaEstatus.setText("Gráfica de estatus");
        jButton_GraficaEstatus.setContentAreaFilled(false);
        jButton_GraficaEstatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_GraficaEstatus.setOpaque(true);
        jButton_GraficaEstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GraficaEstatusActionPerformed(evt);
            }
        });

        jButton_GraficaMarcas.setBackground(new java.awt.Color(23, 146, 244));
        jButton_GraficaMarcas.setFont(new java.awt.Font("Droid Serif", 1, 18)); // NOI18N
        jButton_GraficaMarcas.setForeground(new java.awt.Color(255, 255, 255));
        jButton_GraficaMarcas.setText("Gráfica de marcas");
        jButton_GraficaMarcas.setContentAreaFilled(false);
        jButton_GraficaMarcas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_GraficaMarcas.setOpaque(true);
        jButton_GraficaMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GraficaMarcasActionPerformed(evt);
            }
        });

        Button_CerrarSesion.setBackground(new java.awt.Color(23, 146, 244));
        Button_CerrarSesion.setFont(new java.awt.Font("Droid Serif", 1, 18)); // NOI18N
        Button_CerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        Button_CerrarSesion.setText("Cerrar Sesión");
        Button_CerrarSesion.setContentAreaFilled(false);
        Button_CerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_CerrarSesion.setOpaque(true);
        Button_CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CerrarSesionActionPerformed(evt);
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
                    .addComponent(jButton_GestionarEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_GraficaEstatus, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(jButton_GraficaMarcas, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(Button_CerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_menuLayout.setVerticalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_GestionarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_GraficaEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_GraficaMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(Button_CerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
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
        jButton_minimizar.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
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
        jButton_Cerrar.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
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

        jLabel_NombreUsuario.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel_NombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_NombreUsuario.setText("jLabel2");
        jPanel1.add(jLabel_NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Wallpaper_tecnico.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -20, 630, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CerrarActionPerformed

        if (sesion_usuario == 1) {
            this.dispose();
        } else {
            AlertWarningSalir salir = new AlertWarningSalir(this, true);
            salir.titulo.setText("¿ ESTAS SEGURO DE SALIR ?");
            salir.setVisible(true);
        }

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

    private void jButton_GestionarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GestionarEquipoActionPerformed

        GestionarEquipos gestionarEquipos = new GestionarEquipos();
        gestionarEquipos.setVisible(true);

    }//GEN-LAST:event_jButton_GestionarEquipoActionPerformed

    private void jButton_GraficaEstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GraficaEstatusActionPerformed
        GraficarEstatus graficaEstatus = new GraficarEstatus();
        graficaEstatus.setVisible(true);
    }//GEN-LAST:event_jButton_GraficaEstatusActionPerformed

    private void Button_CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CerrarSesionActionPerformed

        AlertWarningSesion sesion = new AlertWarningSesion(this, true);
        sesion.titulo.setText("¿ESTAS SEGURO DE CERRAR LA SESIÓN");
        sesion.titulo2.setText("DE ADMINISTRADOR");
        sesion.setVisible(true);

        if (AlertWarningSesion.salir) {
            this.dispose();
            new ventanas.Login().setVisible(true);

        }

    }//GEN-LAST:event_Button_CerrarSesionActionPerformed

    private void jButton_GraficaMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GraficaMarcasActionPerformed
        GraficarMarcas graficarMarcas = new GraficarMarcas();
        graficarMarcas.setVisible(true);
    }//GEN-LAST:event_jButton_GraficaMarcasActionPerformed

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
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tecnico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_CerrarSesion;
    private javax.swing.JButton jButton_Cerrar;
    private javax.swing.JButton jButton_GestionarEquipo;
    private javax.swing.JButton jButton_GraficaEstatus;
    private javax.swing.JButton jButton_GraficaMarcas;
    private javax.swing.JButton jButton_menu;
    private javax.swing.JButton jButton_minimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_NombreUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_menu;
    // End of variables declaration//GEN-END:variables
}
