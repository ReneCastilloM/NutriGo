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
            while(rs.next() && contador<5){
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
            while(rs.next() && cont<5){
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Citas para Hoy");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ultimos Pacientes Registrados");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        Tabla_pacientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(523, 523, 523))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(570, 570, 570)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(529, 529, 529))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable Tabla_citas;
    public static javax.swing.JTable Tabla_notas;
    public static javax.swing.JTable Tabla_pacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
