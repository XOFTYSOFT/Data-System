package ventanas;

import alertas.AlertWarningSalir;
import java.awt.Image;
import java.awt.Toolkit;
import clases.Conexion;
import java.sql.*;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import java.io.FileOutputStream;
import javax.swing.WindowConstants;
import alertas.AlertSuccess;
import alertas.AlertWarningSesion;

public class Capturista extends javax.swing.JFrame {

    String user, nombre_usuario;
    int sesion_usuario;

    public Capturista() {
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
        jButton_RegistrarCliente = new javax.swing.JButton();
        jButton_GestionarCliente = new javax.swing.JButton();
        jButton_Imprimir = new javax.swing.JButton();
        jButton_cerrarSesion = new javax.swing.JButton();
        jButton_menu = new javax.swing.JButton();
        jButton_minimizar = new javax.swing.JButton();
        jButton_Cerrar = new javax.swing.JButton();
        jLabel_NombreUsuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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

        jButton_RegistrarCliente.setBackground(new java.awt.Color(23, 146, 244));
        jButton_RegistrarCliente.setFont(new java.awt.Font("Droid Serif", 1, 18)); // NOI18N
        jButton_RegistrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButton_RegistrarCliente.setText("Registrar Cliente");
        jButton_RegistrarCliente.setContentAreaFilled(false);
        jButton_RegistrarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_RegistrarCliente.setOpaque(true);
        jButton_RegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarClienteActionPerformed(evt);
            }
        });

        jButton_GestionarCliente.setBackground(new java.awt.Color(23, 146, 244));
        jButton_GestionarCliente.setFont(new java.awt.Font("Droid Serif", 1, 18)); // NOI18N
        jButton_GestionarCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButton_GestionarCliente.setText("Gestionar Cliente");
        jButton_GestionarCliente.setContentAreaFilled(false);
        jButton_GestionarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_GestionarCliente.setOpaque(true);
        jButton_GestionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GestionarClienteActionPerformed(evt);
            }
        });

        jButton_Imprimir.setBackground(new java.awt.Color(23, 146, 244));
        jButton_Imprimir.setFont(new java.awt.Font("Droid Serif", 1, 18)); // NOI18N
        jButton_Imprimir.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Imprimir.setText("Imprimir Cliente");
        jButton_Imprimir.setContentAreaFilled(false);
        jButton_Imprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Imprimir.setOpaque(true);
        jButton_Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ImprimirActionPerformed(evt);
            }
        });

        jButton_cerrarSesion.setBackground(new java.awt.Color(23, 146, 244));
        jButton_cerrarSesion.setFont(new java.awt.Font("Droid Serif", 1, 18)); // NOI18N
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
                    .addComponent(jButton_RegistrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_GestionarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(jButton_Imprimir, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(jButton_cerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_menuLayout.setVerticalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_RegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_GestionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(jButton_cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jLabel_NombreUsuario.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel_NombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_NombreUsuario.setText("jLabel2");
        jPanel1.add(jLabel_NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Wallpaper_capturista.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -10, 630, 570));

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

    private void jButton_RegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarClienteActionPerformed

        RegistrarClientes registrarClientes = new RegistrarClientes();
        registrarClientes.setVisible(true);

    }//GEN-LAST:event_jButton_RegistrarClienteActionPerformed

    private void jButton_GestionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GestionarClienteActionPerformed

        GestionarClientes gestionarClientes = new GestionarClientes();
        gestionarClientes.setVisible(true);

    }//GEN-LAST:event_jButton_GestionarClienteActionPerformed
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

    private void jButton_ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ImprimirActionPerformed

        Document documento = new Document();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/ListaClientes.pdf"));

            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/images/BannerPDF.jpeg");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Lista de clientes. \n \n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));

            documento.open();
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("ID");
            tabla.addCell("Nombre");
            tabla.addCell("email");
            tabla.addCell("Telefono");
            tabla.addCell("Dirección");

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "select * from clientes");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    do {

                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));

                    } while (rs.next());

                    documento.add(tabla);
                }
            } catch (SQLException e) {
                System.err.println("Error al generar lista de clientes. " + e);
            }

            documento.close();
            AlertSuccess succes = new AlertSuccess(this, true);
            succes.Succes.setText("LISTA DE CLIENTES CREADA CORRECTAMENTE");
            succes.setVisible(true);
            //JOptionPane.showMessageDialog(null, "Lista de clientes creada correctamente.");

        } catch (Exception e) {
            System.err.println("Error al generar PDF " + e);

        }

    }//GEN-LAST:event_jButton_ImprimirActionPerformed

    private void jButton_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cerrarSesionActionPerformed

        AlertWarningSesion salir = new AlertWarningSesion(this, true);
        salir.titulo.setText("¿ESTAS SEGURO DE CERRAR LA SESIÓN");
        salir.titulo2.setText("DE CAPTURISTA?");
        salir.setVisible(true);

        if (AlertWarningSesion.salir) {
            this.dispose();
            new ventanas.Login().setVisible(true);
        }


    }//GEN-LAST:event_jButton_cerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(Capturista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Capturista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Capturista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Capturista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Capturista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cerrar;
    private javax.swing.JButton jButton_GestionarCliente;
    private javax.swing.JButton jButton_Imprimir;
    private javax.swing.JButton jButton_RegistrarCliente;
    private javax.swing.JButton jButton_cerrarSesion;
    private javax.swing.JButton jButton_menu;
    private javax.swing.JButton jButton_minimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_NombreUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_menu;
    // End of variables declaration//GEN-END:variables
}
