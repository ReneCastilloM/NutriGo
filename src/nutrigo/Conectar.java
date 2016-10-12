package nutrigo;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conectar {
    Connection con = null;
    
    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/bd_nutrigo?user=root&useSSL=false&password=");
        }
        catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al tratar de acceder a la Base de Datos");
        }
        return con;
    }
}
