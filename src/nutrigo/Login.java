package nutrigo;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;


public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../img//recursos/Icono.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuario = new javax.swing.JTextField();
        contra = new javax.swing.JPasswordField();
        submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingresa a tu perfil");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        usuario.setBorder(null);
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 320, 30));

        contra.setBorder(null);
        getContentPane().add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 320, 30));

        submit.setBackground(new java.awt.Color(0, 153, 0));
        submit.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 15)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Ingresar");
        submit.setBorder(null);
        submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 120, 40));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Contraeña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nutri Go");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, -1, -1));

        jButton1.setBackground(new java.awt.Color(244, 67, 54));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/recursos/Fondo.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 380, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String user = usuario.getText();
        String contrasena = contra.getText();
        String pass = DigestUtils.md5Hex(contrasena);
        ingresar(user,pass);
    }//GEN-LAST:event_submitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contra;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton submit;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

    private void ingresar(String user, String contrasena)
    {
        try {
            String sql = "SELECT * FROM usuarios WHERE usuario='" + user + "'";
            String nom="", pass="", sexo="";
            Statement stm = co.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next())
            {
                nom = rs.getString("nombre");
                pass = rs.getString("pass");
                sexo = rs.getString("sexo");
                if (pass.equals(contrasena))
                {
                    this.setVisible(false);
                    if (sexo.equals("M"))
                    {
                        this.setVisible(false);
                        JOptionPane.showMessageDialog(null, "Bienvenido " + nom);
                        Ventana_Principal ven = new Ventana_Principal();
                        ven.setVisible(true);
                    }
                    else
                    {
                        this.setVisible(false);
                        JOptionPane.showMessageDialog(null, "Bienvenida " + nom);
                        Ventana_Principal ven = new Ventana_Principal();
                        ven.setVisible(true);
                        
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Contraeña incorrecta");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El usuario no se encuentra registrado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Favor de ingresar su nombre de usuario");
        }
        
        
    }
    Conectar con = new Conectar();
    Connection co = con.conexion();
}