package nutrigo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static nutrigo.Panel_Pacientes.Tabla;

public class Panel_Citas extends javax.swing.JPanel {

    public Panel_Citas(){
        initComponents();
        try{
            DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(50);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(50);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(100);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(250);
            Tabla.getColumnModel().getColumn(4).setPreferredWidth(200);
            Tabla.getColumnModel().getColumn(5).setPreferredWidth(80);
            Tabla.getColumnModel().getColumn(6).setPreferredWidth(270);
            Conectar con = new Conectar();
            Connection co = con.conexion();
            String sql = "SELECT id,hora,fecha,nombre,asunto,telefono_cita,correo FROM citas";
            String []datos = new String [7];
            Statement st = co.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString("id");
                datos[1]=rs.getString("hora");
                datos[2]=rs.getString("fecha");
                datos[3]=rs.getString("nombre");
                datos[4]=rs.getString("asunto");
                datos[5]=rs.getString("telefono_cita");
                datos[6]=rs.getString("correo");
                modelo.addRow(datos);
            }
        }catch (SQLException ex) {
            Logger.getLogger(Panel_Citas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1250, 600));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Hora", "Fecha", "Nombre", "Asunto", "Telefono", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/agregar.png"))); // NOI18N
        jButton1.setText("Ingresar Cita");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/eliminar.png"))); // NOI18N
        jButton2.setText("Eliminar Cita");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/editar.png"))); // NOI18N
        jButton3.setText("Editar Cita");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 127, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 998, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jButton1)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Ingresar_cita_1 ing = new Ingresar_cita_1();
        ing.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int fila = Tabla.getSelectedRow();
        if (fila != -1)
        {
            String nombre = String.valueOf(Tabla.getValueAt(fila, 1));
            int x = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar la cita de " + nombre + "?", "Eliminar cita", JOptionPane.YES_NO_OPTION);
            if (x==0)
            {
                try {
                    int row = Tabla.getSelectedRow();
                    String reg = (String) Tabla.getValueAt(row, 0);
                    int registro = Integer.parseInt(reg);
                    Conectar con = new Conectar();
                    Connection co = con.conexion();
                    Statement stm = co.createStatement();
                    String eliminar_1 = "DELETE FROM citas WHERE id=" + registro;
                    stm.executeUpdate(eliminar_1);
                    JOptionPane.showMessageDialog(null, "Cita eliminada con exito");
                    
                    //A PARTIR DE AQUI
                    DefaultTableModel modelo=(DefaultTableModel) Tabla.getModel();
                    int filas = Tabla.getRowCount();
                    for (int i = 0;filas>i; i++)
                    {
                        modelo.removeRow(0);
                    }
                    String sql = "SELECT id,hora,fecha,nombre,asunto,telefono_cita,correo FROM citas";
                    String []datos = new String [7];
                    Statement st = co.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    while(rs.next()){
                        datos[0]=rs.getString("id");
                        datos[1]=rs.getString("hora");
                        datos[2]=rs.getString("fecha");
                        datos[3]=rs.getString("nombre");
                        datos[4]=rs.getString("asunto");
                        datos[5]=rs.getString("telefono_cita");
                        datos[6]=rs.getString("correo");
                        modelo.addRow(datos);
                    }
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el registro, intentelo nuevamente");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Para eliminar un registro, debes seleccionar su respectiva fila de la tabla");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int fila = Tabla.getSelectedRow();
        if (fila == -1){
            JOptionPane.showMessageDialog(null, "Para editar el contenido de una cita debes seleccionar su respectiva fila de la tabla");
            return;
        }
        Editar_citas editar = new Editar_citas();
        editar.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable Tabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
