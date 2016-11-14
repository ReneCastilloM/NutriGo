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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rene
 */
public class Ingresar_paciente_enviar {
    //Conexion a la base de datos
    Conectar con = new Conectar();
    Connection co = con.conexion();
    //Variables del primer formulario
    public static String nombre,sexo,escolaridad, ant_h, ant_pa, ant_npa, alergia_m, alergia_a, quirur, trast, correo;
    public static int edad, suplem;
    public static long telefono,celular;
    //Variables del segundo formulario
    public static float peso, estatura, c_cintura, c_cadera, c_muñeca, c_brazo, biceps, triceps, subescupular, ileocrestal, suprailiaco;
    //Variables del tercer formulario
    public static float glucosa, a_u, trigliceridos, colesterol;
    //Variables del cuarto formulario
    public static int edema, obesidad, unas1, unas2, cuello1, cuello2, nervioso1, nervioso2, nervioso3, rostro1, rostro2, rostro3, dientes1;
    public static int dientes2, dientes3, urinaria1, urinaria2, torax1, torax2, torax3, torax4, boca1, boca2, boca3, boca4, boca5, boca6, ojos1;
    public static int ojos2, ojos3, ojos4, ojos5, piel1, piel2, piel3, piel4, piel5, piel6, piel7, esqueleto1, esqueleto2, esqueleto3, gastro1;
    //Variables del quinto formulario
    public static String hora1, hora2, hora3, hora4, hora5;
    public static String alimento1, alimento2, alimento3, alimento4, alimento5, ingredientes1, ingredientes2, ingredientes3, ingredientes4, ingredientes5;
    public void enviar() throws SQLException
    {
        //String sql = "INSERT INTO prueba VALUES(NULL," + edema + ", '" + nombre + "')";
        String sql_1 = "INSERT INTO pacientes VALUES(NULL,'" + nombre +"'," + edad + ",'" + sexo + "'," + telefono + ",'" + correo +
                "'," + celular + ",'" + escolaridad + "','" + ant_h + "','" + ant_npa + "','" + ant_pa + "','" + alergia_a + "','" + 
                alergia_m + "','" + quirur + "','" + trast + "'," + suplem + ")";
        String sql_2 = "INSERT INTO pacientes_info VALUES(NULL," + peso + "," + estatura + "," + c_cintura + "," + c_cadera + "," +
                c_cadera + "," + c_brazo + "," + biceps + "," + triceps + "," + glucosa + "," + a_u + "," + trigliceridos + "," + colesterol + ")";
        String sql_3 = "INSERT INTO pacientes_clinico VALUES(NULL," + edema + "," + obesidad + "," + unas1 + "," + unas2 + "," +
                cuello1 + "," + cuello2 + "," + nervioso1 + "," + nervioso2 + "," + nervioso3 + "," + rostro1 + "," + rostro2 +
                "," + rostro3 + "," + dientes1 + "," + dientes2 + "," + dientes3 + "," + urinaria1 + "," + urinaria2 + "," + torax1 +
                "," + torax2 + "," + torax3 + "," + torax4 + "," + boca1 + "," + boca2 + "," + boca3 + "," + boca4 + "," + boca5 + "," + boca6 +
                "," + ojos1 + "," + ojos2 + "," + ojos3 + "," + ojos4 + "," + ojos5 + "," + piel1 + "," + piel2 + "," + piel3 + "," + piel4 +
                "," + piel5 + "," + piel6 + "," + piel7 + "," + esqueleto1 + "," + esqueleto2 + "," + esqueleto3 + ")";
        String sql_4 = "INSERT INTO pacientes_evaluacion VALUES(NULL,'" + hora1 + "','" +  alimento1 + "','" + ingredientes1 + "','" +
        hora2 + "','" + alimento2 + "','" + ingredientes2 + "','" + hora3 + "','" + alimento3 + "','" + ingredientes3 + "','" +
        hora4 + "','" + alimento4 + "','" + ingredientes4 + "','" + hora5 + "','" + alimento5 + "','" + ingredientes5 + "')";
        Statement stm = co.createStatement();
        //stm.executeUpdate(sql);
        stm.executeUpdate(sql_1);
        stm.executeUpdate(sql_2);
        stm.executeUpdate(sql_3);
        stm.executeUpdate(sql_4);
        
        JOptionPane.showMessageDialog(null, "Paciente registrado con exito");
        //A PARTIR DE AQUI
        DefaultTableModel modelo=(DefaultTableModel) Panel_Pacientes.Tabla.getModel();
        int filas=Panel_Pacientes.Tabla.getRowCount();
        for (int i = 0;filas>i; i++)
        {
            modelo.removeRow(0);
        }
        Conectar con = new Conectar();
        Connection co = con.conexion();
        String sql = "SELECT id,nombre,edad,telefono,correo,celular FROM pacientes";
        String []datos = new String [6];
        Statement st = co.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            datos[0]=rs.getString("id");
            datos[1]=rs.getString("nombre");
            datos[2]=rs.getString("edad");
            datos[3]=rs.getString("telefono");
            datos[4]=rs.getString("correo");
            datos[5]=rs.getString("celular");
            modelo.addRow(datos);
        }
    }
}
