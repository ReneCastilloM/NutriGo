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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rene
 */
public class Panel_Inicio extends javax.swing.JPanel {

    /**
     * Creates new form Panel_Inicio
     */
    public Panel_Inicio() {
        initComponents();
        Tabla_notas.setDefaultRenderer(Object.class, new Colores_tabla_inicio());
        try{
            DefaultTableModel modelo = (DefaultTableModel) Tabla_citas.getModel();
            Tabla_citas.getColumnModel().getColumn(0).setPreferredWidth(50);
            Tabla_citas.getColumnModel().getColumn(1).setPreferredWidth(50);
            Tabla_citas.getColumnModel().getColumn(2).setPreferredWidth(100);
            Tabla_citas.getColumnModel().getColumn(3).setPreferredWidth(300);
            Tabla_citas.getColumnModel().getColumn(4).setPreferredWidth(240);
            Tabla_citas.getColumnModel().getColumn(5).setPreferredWidth(80);
            Calendar fecha = Calendar.getInstance();
            int ano = fecha.get(Calendar.YEAR);
            int mes = fecha.get(Calendar.MONTH) + 1;
            int dia = fecha.get(Calendar.DAY_OF_MONTH);
            String fecha_de_hoy = String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(ano);
            String fecha_bd = "";
            Conectar con = new Conectar();
            Connection co = con.conexion();
            String sql = "SELECT id,hora,fecha,nombre,asunto,telefono_cita,correo FROM citas";
            String []datos = new String [7];
            Statement st = co.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString("id");
                datos[1]=rs.getString("hora");
                datos[2]=rs.getString("nombre");
                datos[3]=rs.getString("asunto");
                datos[4]=rs.getString("telefono_cita");
                datos[5]=rs.getString("correo");
                fecha_bd=rs.getString("fecha");
                if (fecha_bd.equals(fecha_de_hoy)){
                    modelo.addRow(datos);
                }
            }
            
            DefaultTableModel modelo_pac = (DefaultTableModel) Tabla_pacientes.getModel();
            Tabla_pacientes.getColumnModel().getColumn(0).setPreferredWidth(50);
            Tabla_pacientes.getColumnModel().getColumn(1).setPreferredWidth(300);
            Tabla_pacientes.getColumnModel().getColumn(2).setPreferredWidth(50);
            Tabla_pacientes.getColumnModel().getColumn(3).setPreferredWidth(105);
            Tabla_pacientes.getColumnModel().getColumn(4).setPreferredWidth(240);
            Tabla_pacientes.getColumnModel().getColumn(5).setPreferredWidth(105);
            String sql_pac = "SELECT id,nombre,edad,telefono,correo,celular FROM pacientes";
            String []datos_pac = new String [6];
            int contador=0;
            st = co.createStatement();
            rs = st.executeQuery(sql_pac);
            while(rs.next() && contador<7){
                datos_pac[0]=rs.getString("id");
                datos_pac[1]=rs.getString("nombre");
                datos_pac[2]=rs.getString("edad");
                datos_pac[3]=rs.getString("telefono");
                datos_pac[4]=rs.getString("correo");
                datos_pac[5]=rs.getString("celular");
                modelo_pac.addRow(datos_pac);
                contador++;
            }
            
            
            DefaultTableModel modelo_notas = (DefaultTableModel) Tabla_notas.getModel();
            Tabla_notas.getColumnModel().getColumn(0).setPreferredWidth(50);
            Tabla_notas.getColumnModel().getColumn(1).setPreferredWidth(250);
            Tabla_notas.getColumnModel().getColumn(2).setPreferredWidth(200);
            Tabla_notas.getColumnModel().getColumn(3).setPreferredWidth(200);
            Tabla_notas.getColumnModel().getColumn(4).setPreferredWidth(100);
            
            String sql_notas = "SELECT id,titulo,fecha,hora,tipo FROM notas ORDER BY fecha DESC, hora DESC";
            String []datos_notas = new String [5];
            int cont = 0;
            st = co.createStatement();
            rs = st.executeQuery(sql_notas);
            while(rs.next() && cont<7){
                datos_notas[0]=rs.getString("id");
                datos_notas[1]=rs.getString("titulo");
                datos_notas[2]=rs.getString("fecha");
                datos_notas[3]=rs.getString("hora").substring(0,5);
                datos_notas[4]=rs.getString("tipo");
                modelo_notas.addRow(datos_notas);
                cont++;
            }
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al traer los datos");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_citas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_pacientes = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla_notas = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Citas para Hoy");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Ultimos Pacientes Registrados");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Ultimas Notas Guardadas");

        Tabla_citas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Hora", "Nombre", "Asunto", "Telefono", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla_citas);

        Tabla_pacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Edad", "Telefono", "Correo", "Celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_pacientes.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(Tabla_pacientes);

        Tabla_notas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Fecha de modificacion", "Hora de modificacion", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Tabla_notas);

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/info.png"))); // NOI18N
        jButton2.setText("Ver contenido");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 255, 153));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botones/info.png"))); // NOI18N
        jButton3.setText("Ver contenido");
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
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(449, 449, 449)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(467, 467, 467)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(553, 553, 553)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(80, 80, 80)))
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(73, 73, 73))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int fila = Tabla_pacientes.getSelectedRow();
        if (fila == -1){
            JOptionPane.showMessageDialog(null, "Para ver el contenido de un paciente debes seleccionar su respectiva fila de la tabla");
            return;
        }
        Ver_paciente_inicio ver= new Ver_paciente_inicio();
        ver.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         int fila = Tabla_notas.getSelectedRow();
        if (fila == -1){
            JOptionPane.showMessageDialog(null, "Para ver el contenido de una nota debes seleccionar su respectiva fila de la tabla");
            return;
        }
        Ver_nota_inicio ver= new Ver_nota_inicio();
        ver.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable Tabla_citas;
    public static javax.swing.JTable Tabla_notas;
    public static javax.swing.JTable Tabla_pacientes;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
