/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutrigo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rene
 */
public class Editar_nota extends javax.swing.JFrame {

    /**
     * Creates new form Editar_nota
     */
    public Editar_nota() {
        try {
            initComponents();
            this.setLocationRelativeTo(null);
            setIconImage(new ImageIcon(getClass().getResource("../img//recursos/Icono.png")).getImage());
            int row = Panel_Perfil.Tabla.getSelectedRow();
            String reg = (String) Panel_Perfil.Tabla.getValueAt(row, 0);
            int registro = Integer.parseInt(reg);
            Conectar con = new Conectar();
            Connection co = con.conexion();
            String sql = "SELECT titulo,texto,tipo FROM notas WHERE id=" + registro;
            String title = null, text = null, tipo = null;
            Statement st = co.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                text=rs.getString("texto");
                title=rs.getString("titulo");
                tipo=rs.getString("tipo");
            }
            titulo.setText(title);
            contenido.setText(text);
            if ("Positiva".equals(tipo))
            {
                boton_verde.setSelected(true);
                boton_verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Verde_S.png")));
            }
            else if ("Alerta".equals(tipo))
            {
                boton_amarillo.setSelected(true);
                boton_amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Amarillo_S.png")));
            }
            else if ("Urgente".equals(tipo))
            {
                boton_rojo.setSelected(true);
                boton_rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Rojo_S.png")));
            }
            else if ("Suceso".equals(tipo))
            {
                boton_azul.setSelected(true);
                boton_azul.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Azul_S.png")));
            }
            else
            {
                boton_blanco.setSelected(true);
                boton_blanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Blanco_S.png")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al tratar de mostrar datos");
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_colores = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contenido = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        boton_verde = new javax.swing.JRadioButton();
        boton_amarillo = new javax.swing.JRadioButton();
        boton_rojo = new javax.swing.JRadioButton();
        boton_azul = new javax.swing.JRadioButton();
        boton_blanco = new javax.swing.JRadioButton();
        btn_cancelar = new javax.swing.JButton();
        btn_siguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar nota");
        setResizable(false);

        jLabel1.setText("Titulo");

        titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloActionPerformed(evt);
            }
        });

        jLabel2.setText("Contenido");

        contenido.setColumns(20);
        contenido.setLineWrap(true);
        contenido.setRows(5);
        jScrollPane1.setViewportView(contenido);

        jLabel3.setText("Tipo");

        grupo_colores.add(boton_verde);
        boton_verde.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/Verde.png"))); // NOI18N
        boton_verde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_verdeActionPerformed(evt);
            }
        });

        grupo_colores.add(boton_amarillo);
        boton_amarillo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/Amarillo.png"))); // NOI18N
        boton_amarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_amarilloActionPerformed(evt);
            }
        });

        grupo_colores.add(boton_rojo);
        boton_rojo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/Rojo.png"))); // NOI18N
        boton_rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_rojoActionPerformed(evt);
            }
        });

        grupo_colores.add(boton_azul);
        boton_azul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_azul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/Azul.png"))); // NOI18N
        boton_azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_azulActionPerformed(evt);
            }
        });

        grupo_colores.add(boton_blanco);
        boton_blanco.setSelected(true);
        boton_blanco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_blanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/Blanco.png"))); // NOI18N
        boton_blanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_blancoActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_siguiente.setText("Aceptar");
        btn_siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(titulo))
                        .addComponent(jLabel2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_blanco)
                        .addGap(18, 18, 18)
                        .addComponent(boton_verde)
                        .addGap(18, 18, 18)
                        .addComponent(boton_amarillo)
                        .addGap(18, 18, 18)
                        .addComponent(boton_rojo)
                        .addGap(18, 18, 18)
                        .addComponent(boton_azul)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cancelar)
                .addGap(18, 18, 18)
                .addComponent(btn_siguiente)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_verde)
                    .addComponent(boton_amarillo)
                    .addComponent(boton_rojo)
                    .addComponent(boton_azul)
                    .addComponent(boton_blanco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_siguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_verdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_verdeActionPerformed
        boton_blanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Blanco.png")));
        boton_verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Verde_S.png")));
        boton_amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Amarillo.png")));
        boton_rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Rojo.png")));
        boton_azul.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Azul.png")));
        boton_verde.setSelected(true);
    }//GEN-LAST:event_boton_verdeActionPerformed

    private void boton_amarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_amarilloActionPerformed
        boton_blanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Blanco.png")));
        boton_verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Verde.png")));
        boton_amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Amarillo_S.png")));
        boton_rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Rojo.png")));
        boton_azul.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Azul.png")));
        boton_amarillo.setSelected(true);
    }//GEN-LAST:event_boton_amarilloActionPerformed

    private void boton_rojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_rojoActionPerformed
        boton_blanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Blanco.png")));
        boton_verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Verde.png")));
        boton_amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Amarillo.png")));
        boton_rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Rojo_S.png")));
        boton_azul.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Azul.png")));
        boton_rojo.setSelected(true);
    }//GEN-LAST:event_boton_rojoActionPerformed

    private void boton_azulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_azulActionPerformed
        boton_blanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Blanco.png")));
        boton_verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Verde.png")));
        boton_amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Amarillo.png")));
        boton_rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Rojo.png")));
        boton_azul.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Azul_S.png")));
        boton_azul.setSelected(true);
    }//GEN-LAST:event_boton_azulActionPerformed

    private void boton_blancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_blancoActionPerformed
        boton_blanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Blanco_S.png")));
        boton_verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Verde.png")));
        boton_amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Amarillo.png")));
        boton_rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Rojo.png")));
        boton_azul.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/botones//Azul.png")));
        boton_blanco.setSelected(true);
    }//GEN-LAST:event_boton_blancoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguienteActionPerformed
        try {
            int row = Panel_Perfil.Tabla.getSelectedRow();
            String reg = (String) Panel_Perfil.Tabla.getValueAt(row, 0);
            int registro = Integer.parseInt(reg);
            String titulo_txt = titulo.getText();
            String contenido_txt = contenido.getText();
            Calendar calendario = Calendar.getInstance();
            int ano = calendario.get(Calendar.YEAR);
            int mes = calendario.get(Calendar.MONTH) + 1;
            int dia = calendario.get(Calendar.DAY_OF_MONTH);
            String fecha = ano + "-" + mes + "-" + dia;
            int horas =calendario.get(Calendar.HOUR_OF_DAY);
            int minutos = calendario.get(Calendar.MINUTE);
            int segundos = calendario.get(Calendar.SECOND);
            String hora = horas + ":" + minutos + ":" + segundos;
            String tipo = "";
            if (boton_blanco.isSelected())
            {
                tipo = "Sin tipo";
            }
            else if (boton_verde.isSelected())
            {
                tipo = "Positiva";
            }
            else if (boton_amarillo.isSelected())
            {
                tipo = "Alerta";
            }
            else if (boton_rojo.isSelected())
            {
                tipo = "Urgente";
            }
            else
            {
                tipo = "Suceso";
            }
            Conectar con = new Conectar();
            Connection co = con.conexion();
            String sql = "UPDATE notas SET titulo='" + titulo_txt + "',texto='" + contenido_txt + "',fecha='" + fecha + "',hora='" + hora + "',tipo='" + tipo + "' WHERE id=" + registro;
            Statement stm = co.createStatement();
            stm.executeUpdate(sql);
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "Nota editada con exito");

            DefaultTableModel modelo = (DefaultTableModel) Panel_Perfil.Tabla.getModel();
            int filas=Panel_Perfil.Tabla.getRowCount();
            for (int i = 0;filas>i; i++)
            {
                modelo.removeRow(0);
            }
            String sql_2 = "SELECT id,titulo,fecha,hora,tipo FROM notas ORDER BY fecha DESC, hora DESC";
            String []datos = new String [5];
            Statement st = co.createStatement();
            ResultSet rs = st.executeQuery(sql_2);
            while(rs.next()){
                datos[0]=rs.getString("id");
                datos[1]=rs.getString("titulo");
                datos[2]=rs.getString("fecha");
                datos[3]=rs.getString("hora").substring(0,5);
                datos[4]=rs.getString("tipo");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar la nota");
        }
    }//GEN-LAST:event_btn_siguienteActionPerformed

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloActionPerformed

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
            java.util.logging.Logger.getLogger(Editar_nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar_nota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton boton_amarillo;
    private javax.swing.JRadioButton boton_azul;
    private javax.swing.JRadioButton boton_blanco;
    private javax.swing.JRadioButton boton_rojo;
    private javax.swing.JRadioButton boton_verde;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_siguiente;
    private javax.swing.JTextArea contenido;
    private javax.swing.ButtonGroup grupo_colores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
