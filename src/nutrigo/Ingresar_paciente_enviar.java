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

/**
 *
 * @author Rene
 */
public class Ingresar_paciente_enviar {
    //Conexion a la base de datos
    Conectar con = new Conectar();
    Connection co = con.conexion();
    //Variables del primer formulario
    public static String nombre,sexo,escolaridad, ant_h, ant_pa, ant_npa, alergia_m, alergia_a, quirur, trast;
    public static int edad, suplem;
    //Variables del segundo formulario
    public static float peso, estatura, c_cintura, c_cadera, c_muñeca, c_brazo, biceps, triceps, subescupular, ileocrestal, suprailiaco;
    //Variables del tercer formulario
    public static float hemoglobina, hematrocitos, linfocitos, glucosa, urea, a_u, creatonina, trigliceridos, colesterol, albumina, sodio, potasio;
    //Variables del cuarto formulario
    public static int edema, obesidad, unas1, unas2, cuello1, cuello2, nervioso1, nervioso2, nervioso3, rostro1, rostro2, rostro3, dientes1;
    public static int dientes2, dientes3, urinaria1, urinaria2, torax1, torax2, torax3, torax4, boca1, boca2, boca3, boca4, boca5, boca6, ojos1;
    public static int ojos2, ojos3, ojos4, ojos5, piel1, piel2, piel3, piel4, piel5, piel6, piel7, esqueleto1, esqueleto2, esqueleto3, gastro1;
    //Variables del quinto formulario
    public static String hora1, hora2, hora3, hora4, hora5, hora6, lugar1, lugar2, lugar3, lugar4, lugar5, lugar6;
    public static String alimento1, alimento2, alimento3, alimento4, alimento5, alimento6, ingredientes1, ingredientes2, ingredientes3, ingredientes4, ingredientes5, ingredientes6;
    public void enviar() throws SQLException
    {
        String sql = "INSERT INTO prueba VALUES(" + edema + ", '" + nombre + "')";
        Statement stm = co.createStatement();
        stm.executeUpdate(sql);
    }
}
