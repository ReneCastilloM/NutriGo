package nutrigo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Envio_Citas {
    Conectar con = new Conectar();
    Connection co = con.conexion();
    //Variables del primer formulario
    public static String nombre,correo,asunto,hora,telefono_cita;
    public static String fecha;
   
    public void enviar() throws SQLException
    {
        String sql_1 = "INSERT INTO citas VALUES(NULL,'"+ nombre +"','"+ correo +"','" + fecha + "','" + hora + "','" + asunto + "','"+ telefono_cita + "')"; 
        Statement stm = co.createStatement();
        stm.executeUpdate(sql_1);    
        JOptionPane.showMessageDialog(null, "Cita registrada con exito");
        //A PARTIR DE AQUI
        DefaultTableModel modelo=(DefaultTableModel) Panel_Citas.Tabla.getModel();
        int filas=Panel_Citas.Tabla.getRowCount();
        for (int i = 0;filas>i; i++)
        {
            modelo.removeRow(0);
        }
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
    }
}
