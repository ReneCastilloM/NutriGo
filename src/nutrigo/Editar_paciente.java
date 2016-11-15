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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author Rene
 */
public class Editar_paciente extends javax.swing.JFrame {
    int row = Panel_Pacientes.Tabla.getSelectedRow();
    String reg = (String) Panel_Pacientes.Tabla.getValueAt(row, 0);
    int registro = Integer.parseInt(reg);
    /**
     * Creates new form Editar_paciente
     */
    public Editar_paciente() {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(175, 228, 202));
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("../img//recursos/Icono.png")).getImage());
        
        
        Conectar con = new Conectar();
        Connection co = con.conexion();
        
        //Personal
        String nombre="",edad="",telefono="",correo="",celular="",escolaridad="",a_heredo="",a_no_pat="",a_pat="";
        String alergias_a="",alergias_m="",quirurgicos="",trastornos="",suplementos="";
        String sql_personal = "SELECT nombre,edad,telefono,correo,celular,a_heredo,a_no_pat,a_pat,alergias_a,"
                + "alergias_m,quirurgicos,trastornos,suplementos FROM pacientes WHERE id=" + registro;
        try{
            Statement st = co.createStatement();
            ResultSet rs = st.executeQuery(sql_personal);
            while(rs.next()){
                nombre_txt.setText(rs.getString(1));
                edad_txt.setText(rs.getString(2));
                telefono_txt.setText(rs.getString(3));
                correo_txt.setText(rs.getString(4));
                celular_txt.setText(rs.getString(5));
                a_h_txt.setText(rs.getString(6));
                a_npat_txt.setText(rs.getString(7));
                a_pat_txt.setText(rs.getString(8));
                alergia_a_txt.setText(rs.getString(9));
                alergia_m_txt.setText(rs.getString(10));
                quirur_txt.setText(rs.getString(11));
                trastornos_txt.setText(rs.getString(12));
                suplementos = rs.getString(13);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al tratar de tomar los datos personales del paciente, vuelva a intentarlo");
        }
        if("0".equals(suplementos)){
            sup_txt.setText("No");
        }
        else{
            sup_txt.setText("1");
        }
        
        
        //Antropometrico y bioquimio
        String peso="", estatura="", c_cintura="", c_cadera="", c_muneca="", c_brazo="", biceps="", triceps="";
        String glucosa="", a_urico="", trigliceridos="", colesterol="";
        String sql_antro = "SELECT peso, estatura, c_cintura, c_cadera, c_muneca, c_brazo, biceps, triceps, glucosa,"
                + "a_urico, trigliceridos, colesterol FROM pacientes_info WHERE id=" + registro;
        try{
            Statement st = co.createStatement();
            ResultSet rs = st.executeQuery(sql_antro);
            while(rs.next()){
                peso = rs.getString(1);
                estatura = rs.getString(2);
                c_cintura = rs.getString(3);
                c_cadera = rs.getString(4);
                c_muneca = rs.getString(5);
                c_brazo = rs.getString(6);
                biceps = rs.getString(7);
                triceps = rs.getString(8);
                glucosa = rs.getString(9);
                a_urico = rs.getString(10);
                trigliceridos = rs.getString(11);
                colesterol = rs.getString(12);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al tratar de tomar los datos antropometricoso del paciente, vuelva a intentarlo");
        }
        peso_txt.setText(peso);
        estatura_txt.setText(estatura);
        c_cintura_txt.setText(c_cintura);
        c_cadera_txt.setText(c_cadera);
        c_muneca_txt.setText(c_muneca);
        c_brazo_txt.setText(c_brazo);
        biceps_txt.setText(biceps);
        triceps_txt.setText(triceps);
        glucosa_txt.setText(glucosa);
        a_urico_txt.setText(a_urico);
        trigliceridos_txt.setText(trigliceridos);
        colesterol_txt.setText(colesterol);
        
        
        //Recordatorio de 24 hrs
        String hora1="", alimento1="", ingredientes1="";
        String hora2="", alimento2="", ingredientes2="";
        String hora3="", alimento3="", ingredientes3="";
        String hora4="", alimento4="", ingredientes4="";
        String hora5="", alimento5="", ingredientes5="";
        String sql_recordatorio = "SELECT hora_1, alimento_1, ingredientes_1,hora_2, alimento_2, ingredientes_2,hora_3,"
                + "alimento_3, ingredientes_3,hora_4, alimento_4, ingredientes_4,hora_5, alimento_5, ingredientes_5"
                + " FROM pacientes_evaluacion WHERE id=" + registro;
        try{
            Statement st = co.createStatement();
            ResultSet rs = st.executeQuery(sql_recordatorio);
            while(rs.next()){
                hora1 = rs.getString(1);
                alimento1 = rs.getString(2);
                ingredientes1 = rs.getString(3);
                hora2 = rs.getString(4);
                alimento2 = rs.getString(5);
                ingredientes2 = rs.getString(6);
                hora3 = rs.getString(7);
                alimento3 = rs.getString(8);
                ingredientes3 = rs.getString(9);
                hora4 = rs.getString(10);
                alimento4 = rs.getString(11);
                ingredientes4 = rs.getString(12);
                hora5 = rs.getString(13);
                alimento5 = rs.getString(14);
                ingredientes5 = rs.getString(15);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al tratar de tomar los valores del recordatorio del paciente, vuelva a intentarlo");
        }
        hora_1.setText(hora1);
        alimento_1.setText(alimento1);
        ingredientes_1.setText(ingredientes1);
        hora_2.setText(hora2);
        alimento_2.setText(alimento2);
        ingredientes_2.setText(ingredientes2);
        hora_3.setText(hora3);
        alimento_3.setText(alimento3);
        ingredientes_3.setText(ingredientes3);
        hora_4.setText(hora4);
        alimento_4.setText(alimento4);
        ingredientes_4.setText(ingredientes4);
        hora_5.setText(hora5);
        alimento_5.setText(alimento5);
        ingredientes_5.setText(ingredientes5);
        
        
        //Clinico
        String sintomas_txt = "";
        String[] sintomas = new String[42];
        JRadioButton[] botones = new JRadioButton[42];
        botones[0] = edema;
        botones[1] = obesidad;
        botones[2] = unas_1;
        botones[3] = unas_2;
        botones[4] = cuello_7;
        botones[5] = cuello_8;
        botones[6] = nervioso_1;
        botones[7] = nervioso_2;
        botones[8] = nervioso_3;
        botones[9] = rostro_1;
        botones[10] = rostro_2;
        botones[11] = rostro_3;
        botones[12] = dientes_1;
        botones[13] = dientes_2;
        botones[14] = dientes_3;
        botones[15] = urinaria_1;
        botones[16] = urinaria_2;
        botones[17] = torax_1;
        botones[18] = torax_2;
        botones[19] = torax_3;
        botones[20] = torax_4;
        botones[21] = boca_1;
        botones[22] = boca_2;
        botones[23] = boca_3;
        botones[24] = boca_4;
        botones[25] = boca_5;
        botones[26] = boca_6;
        botones[27] = ojos_1;
        botones[28] = ojos_2;
        botones[29] = ojos_3;
        botones[30] = ojos_4;
        botones[31] = ojos_5;
        botones[32] = piel_8;
        botones[33] = piel_9;
        botones[34] = piel_10;
        botones[35] = piel_11;
        botones[36] = piel_12;
        botones[37] = piel_13;
        botones[38] = piel_14;
        botones[39] = esqueleto_1;
        botones[40] = esqueleto_2;
        botones[41] = esqueleto_3;
        String sql_clinico = "SELECT edema, obesidad, unas_1, unas_2, cuello_1, cuello_2, nervioso_1, nervioso_2, nervioso_3,"
                + "rostro_1, rostro_2, rostro_3, dientes_1, dientes_2, dientes_3, urinaria_1, urinaria_2, torax_1, torax_2,"
                + "torax_3, torax_4, boca_1, boca_2, boca_3, boca_4, boca_5, boca_6, ojos_1, ojos_2, ojos_3, ojos_4, ojos_5,"
                + "piel_1, piel_2, piel_3, piel_4, piel_5, piel_6, piel_7, esqueleto_1, esqueleto_2, esqueleto_3 FROM pacientes_clinico WHERE id=" + registro;
        int i = 1;
        try{
            Statement st = co.createStatement();
            ResultSet rs = st.executeQuery(sql_clinico);
            while(rs.next()){
                while (i<43)
                {
                    sintomas[i-1] = rs.getString(i);
                    i++;
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al tratar de tomar los valores clinicos del paciente, vuelva a intentarlo");
        }
        for (i=0; i<42; i++)
                {
                    if ("1".equals(sintomas[i]))
                    {
                        botones[i].setSelected(true);
                    }
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre_txt = new javax.swing.JTextField();
        telefono_txt = new javax.swing.JTextField();
        correo_txt = new javax.swing.JTextField();
        edad_txt = new javax.swing.JTextField();
        celular_txt = new javax.swing.JTextField();
        a_h_txt = new javax.swing.JTextField();
        a_pat_txt = new javax.swing.JTextField();
        a_npat_txt = new javax.swing.JTextField();
        alergia_a_txt = new javax.swing.JTextField();
        alergia_m_txt = new javax.swing.JTextField();
        quirur_txt = new javax.swing.JTextField();
        trastornos_txt = new javax.swing.JTextField();
        sup_txt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        cuello_7 = new javax.swing.JRadioButton();
        cuello_8 = new javax.swing.JRadioButton();
        jPanel16 = new javax.swing.JPanel();
        edema = new javax.swing.JRadioButton();
        obesidad = new javax.swing.JRadioButton();
        jPanel14 = new javax.swing.JPanel();
        urinaria_1 = new javax.swing.JRadioButton();
        urinaria_2 = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        ojos_1 = new javax.swing.JRadioButton();
        ojos_2 = new javax.swing.JRadioButton();
        ojos_3 = new javax.swing.JRadioButton();
        ojos_4 = new javax.swing.JRadioButton();
        ojos_5 = new javax.swing.JRadioButton();
        jPanel10 = new javax.swing.JPanel();
        nervioso_1 = new javax.swing.JRadioButton();
        nervioso_2 = new javax.swing.JRadioButton();
        nervioso_3 = new javax.swing.JRadioButton();
        jPanel11 = new javax.swing.JPanel();
        unas_1 = new javax.swing.JRadioButton();
        unas_2 = new javax.swing.JRadioButton();
        jPanel12 = new javax.swing.JPanel();
        dientes_1 = new javax.swing.JRadioButton();
        dientes_2 = new javax.swing.JRadioButton();
        dientes_3 = new javax.swing.JRadioButton();
        jPanel13 = new javax.swing.JPanel();
        esqueleto_1 = new javax.swing.JRadioButton();
        esqueleto_2 = new javax.swing.JRadioButton();
        esqueleto_3 = new javax.swing.JRadioButton();
        jPanel15 = new javax.swing.JPanel();
        boca_1 = new javax.swing.JRadioButton();
        boca_2 = new javax.swing.JRadioButton();
        boca_3 = new javax.swing.JRadioButton();
        boca_4 = new javax.swing.JRadioButton();
        boca_5 = new javax.swing.JRadioButton();
        boca_6 = new javax.swing.JRadioButton();
        jPanel17 = new javax.swing.JPanel();
        torax_2 = new javax.swing.JRadioButton();
        torax_3 = new javax.swing.JRadioButton();
        torax_4 = new javax.swing.JRadioButton();
        torax_1 = new javax.swing.JRadioButton();
        jPanel18 = new javax.swing.JPanel();
        rostro_1 = new javax.swing.JRadioButton();
        rostro_2 = new javax.swing.JRadioButton();
        rostro_3 = new javax.swing.JRadioButton();
        jPanel20 = new javax.swing.JPanel();
        piel_8 = new javax.swing.JRadioButton();
        piel_9 = new javax.swing.JRadioButton();
        piel_10 = new javax.swing.JRadioButton();
        piel_11 = new javax.swing.JRadioButton();
        piel_12 = new javax.swing.JRadioButton();
        piel_13 = new javax.swing.JRadioButton();
        piel_14 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        peso_txt = new javax.swing.JTextField();
        c_cintura_txt = new javax.swing.JTextField();
        c_cadera_txt = new javax.swing.JTextField();
        biceps_txt = new javax.swing.JTextField();
        estatura_txt = new javax.swing.JTextField();
        c_muneca_txt = new javax.swing.JTextField();
        c_brazo_txt = new javax.swing.JTextField();
        triceps_txt = new javax.swing.JTextField();
        glucosa_txt = new javax.swing.JTextField();
        a_urico_txt = new javax.swing.JTextField();
        trigliceridos_txt = new javax.swing.JTextField();
        colesterol_txt = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        hora_5 = new javax.swing.JTextField();
        hora_4 = new javax.swing.JTextField();
        hora_3 = new javax.swing.JTextField();
        hora_2 = new javax.swing.JTextField();
        hora_1 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ingredientes_1 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        alimento_1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        alimento_2 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        alimento_3 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        alimento_4 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        alimento_5 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        ingredientes_5 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        ingredientes_4 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        ingredientes_3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        ingredientes_2 = new javax.swing.JTextArea();
        btn_actualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar paciente");

        jPanel1.setBackground(new java.awt.Color(175, 228, 202));

        jLabel1.setText("Nombre:");

        jLabel23.setText("Telefono fijo:");

        jLabel21.setText("Correo:");

        jLabel5.setText("Antecedentes heredofamiliares:");

        jLabel6.setText("Antecedentes personales patologicos:");

        jLabel11.setText("Antecedentes personales no patologicos:");

        jLabel4.setText("Alergias a alimentos:");

        jLabel3.setText("Alergias a medicamentos:");

        jLabel9.setText("Quirurgicos:");

        jLabel8.setText("Trastornos fisicos o gastrointestinales:");

        jLabel7.setText("¡Uso de suplementos?");

        jLabel22.setText("Telefono Celular:");

        jLabel2.setText("Edad:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(correo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(a_pat_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(a_npat_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(alergia_m_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(alergia_a_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quirur_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(trastornos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sup_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(a_h_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(telefono_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(128, 128, 128)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(celular_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(edad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(jLabel22)
                        .addComponent(celular_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(telefono_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(a_h_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(a_pat_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a_npat_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(alergia_a_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(alergia_m_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(quirur_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(trastornos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(sup_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Personal", jPanel1);

        jPanel2.setBackground(new java.awt.Color(175, 228, 202));

        jPanel8.setBackground(new java.awt.Color(175, 228, 202));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cuello", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        cuello_7.setText("Agrandamiento de tiroides");

        cuello_8.setText("Agrandamiento de paratiroides");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuello_7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cuello_8)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuello_7)
                    .addComponent(cuello_8))
                .addGap(26, 26, 26))
        );

        jPanel16.setBackground(new java.awt.Color(175, 228, 202));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Aspectos generales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        edema.setText("Edema");

        obesidad.setText("Obesidad");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(obesidad)
                .addGap(19, 19, 19))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edema)
                    .addComponent(obesidad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(175, 228, 202));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Vias Urinarias", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        urinaria_1.setText("Orina oscura y concentrada");

        urinaria_2.setText("Orina clara y diluida");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(urinaria_1)
                    .addComponent(urinaria_2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(urinaria_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(urinaria_2))
        );

        jPanel9.setBackground(new java.awt.Color(175, 228, 202));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ojos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        ojos_1.setText("Manchas de bitot");

        ojos_2.setText("Keratomalasia");

        ojos_3.setText("Xerosis");

        ojos_4.setText("Ceguera nocturna");

        ojos_5.setText("Xantelasma");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ojos_1)
                    .addComponent(ojos_2)
                    .addComponent(ojos_3)
                    .addComponent(ojos_5)
                    .addComponent(ojos_4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ojos_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ojos_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ojos_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ojos_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ojos_5))
        );

        jPanel10.setBackground(new java.awt.Color(175, 228, 202));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Sistema Nervioso", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        nervioso_1.setText("Confusion mental");

        nervioso_2.setText("Disminucion de reflejos");

        nervioso_3.setText("Dolor de cabeza, vomito o mareos");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nervioso_1)
                    .addComponent(nervioso_2)
                    .addComponent(nervioso_3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nervioso_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nervioso_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nervioso_3))
        );

        jPanel11.setBackground(new java.awt.Color(175, 228, 202));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Uñas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        unas_1.setText("Uña coiliniquia");
        unas_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unas_1ActionPerformed(evt);
            }
        });

        unas_2.setText("Despigmentacion, grietas");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(unas_1)
                    .addComponent(unas_2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(unas_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(unas_2))
        );

        jPanel12.setBackground(new java.awt.Color(175, 228, 202));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        dientes_1.setText("Fluorosis");

        dientes_2.setText("Falta de dientes, caries");

        dientes_3.setText("Perdida de esmalte");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dientes_1)
                    .addComponent(dientes_2)
                    .addComponent(dientes_3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dientes_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dientes_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dientes_3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(175, 228, 202));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Sistema Esqueleto-Muscular", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        esqueleto_1.setText("Dolor de articulaciones");

        esqueleto_2.setText("Dolor en pantorrilla y muslos");

        esqueleto_3.setText("Piernas arqueadas");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(esqueleto_2)
                    .addComponent(esqueleto_3)
                    .addComponent(esqueleto_1))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(esqueleto_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(esqueleto_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(esqueleto_3))
        );

        jPanel15.setBackground(new java.awt.Color(175, 228, 202));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Boca", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        boca_1.setText("Atrofia papilar");

        boca_2.setText("Glocitis");

        boca_3.setText("Lengua magenta o escarlata");

        boca_4.setText("Encias hinchadas");

        boca_5.setText("Disminucion de gusto");

        boca_6.setText("Atrofia de la lengua");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boca_1)
                    .addComponent(boca_2)
                    .addComponent(boca_3)
                    .addComponent(boca_5)
                    .addComponent(boca_6)
                    .addComponent(boca_4))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boca_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boca_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boca_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boca_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boca_5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boca_6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(175, 228, 202));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Torax", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        torax_2.setText("Falta de respiracion, fatiga");

        torax_3.setText("Disminucion de funcionamiento pulmonar");

        torax_4.setText("Falla cardiaca");

        torax_1.setText("Disminusion de masa y fuerza muscular");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(torax_1)
                    .addComponent(torax_2)
                    .addComponent(torax_3)
                    .addComponent(torax_4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(torax_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(torax_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(torax_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(torax_4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(175, 228, 202));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Rostro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        rostro_1.setText("Cara de luna");

        rostro_2.setText("Parestesia facial");

        rostro_3.setText("Despigmentacion o hinchazon");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rostro_1)
                    .addComponent(rostro_2)
                    .addComponent(rostro_3))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rostro_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rostro_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE)
                .addComponent(rostro_3)
                .addContainerGap())
        );

        jPanel20.setBackground(new java.awt.Color(175, 228, 202));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Piel", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        piel_8.setText("Falta de brillo en cabello");

        piel_9.setText("Cabello signo de bandera");

        piel_10.setText("Escaces de cabello");

        piel_11.setText("Problemas de cicatrizacion");

        piel_12.setText("Piel escamosa");

        piel_13.setText("Ceborrea  nasolabial");
        piel_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piel_13ActionPerformed(evt);
            }
        });

        piel_14.setText("Falta de elastisidad");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(piel_13)
                    .addComponent(piel_9)
                    .addComponent(piel_8)
                    .addComponent(piel_10)
                    .addComponent(piel_11)
                    .addComponent(piel_12)
                    .addComponent(piel_14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(piel_8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(piel_9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(piel_10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(piel_11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(piel_12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(piel_13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(piel_14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Clinico", jPanel2);

        jPanel3.setBackground(new java.awt.Color(175, 228, 202));

        jLabel14.setText("Circunferencia de muñeca:");

        jLabel15.setText("Circunferencia de brazo:");

        jLabel18.setText("Triceps:");

        jLabel12.setText("Estatura:");

        jLabel10.setText("Peso::");

        jLabel13.setText("Circunferencia de cadera:");

        jLabel16.setText("Circunferencia de cintura:");

        jLabel17.setText("Biceps:");

        jLabel19.setText("Glucosa:");

        jLabel20.setText("Acido urico:");

        jLabel24.setText("Trigliceridos:");

        jLabel25.setText("Colesterol:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Datos antropometricos");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Datos bioquimicos");

        jLabel28.setText("gr/dl");

        jLabel29.setText("gr/dl");

        jLabel30.setText("gr/dl");

        jLabel39.setText("gr/dl");

        jLabel40.setText("mm");

        jLabel41.setText("cm");

        jLabel42.setText("cm");

        jLabel43.setText("m");

        jLabel44.setText("mm");

        jLabel45.setText("cm");

        jLabel46.setText("cm");

        jLabel47.setText("m");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(93, 93, 93)
                            .addComponent(jLabel10))
                        .addComponent(jLabel13)
                        .addComponent(jLabel16))
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(a_urico_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(peso_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_cintura_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_cadera_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(biceps_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addComponent(glucosa_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel25))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel24)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trigliceridos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colesterol_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel12))
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estatura_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_muneca_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_brazo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(triceps_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addComponent(jLabel30)
                    .addComponent(jLabel44)
                    .addComponent(jLabel47)
                    .addComponent(jLabel46)
                    .addComponent(jLabel45))
                .addGap(107, 107, 107))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(378, 378, 378))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(374, 374, 374))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(estatura_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(peso_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43)
                            .addComponent(jLabel47))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14)
                            .addComponent(c_cintura_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_muneca_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42)
                            .addComponent(jLabel46))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(c_cadera_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_brazo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel41)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(biceps_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(triceps_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel24)
                    .addComponent(glucosa_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trigliceridos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel25)
                    .addComponent(a_urico_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colesterol_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29))
                .addGap(42, 42, 42))
        );

        jTabbedPane1.addTab("Antropometrico y bioquimico", jPanel3);

        jPanel4.setBackground(new java.awt.Color(175, 228, 202));

        jLabel31.setText("Desayuno");

        jLabel35.setText("Colacion 1");

        jLabel36.setText("Comida");

        jLabel37.setText("Colacion 2");

        jLabel38.setText("Cena");

        jLabel32.setText("Hora");

        jLabel33.setText("Alimento");

        jLabel34.setText("Ingredientes");

        ingredientes_1.setColumns(20);
        ingredientes_1.setLineWrap(true);
        ingredientes_1.setRows(3);
        jScrollPane3.setViewportView(ingredientes_1);

        alimento_1.setColumns(20);
        alimento_1.setLineWrap(true);
        alimento_1.setRows(3);
        jScrollPane11.setViewportView(alimento_1);

        alimento_2.setColumns(20);
        alimento_2.setLineWrap(true);
        alimento_2.setRows(3);
        jScrollPane4.setViewportView(alimento_2);

        alimento_3.setColumns(20);
        alimento_3.setLineWrap(true);
        alimento_3.setRows(3);
        jScrollPane6.setViewportView(alimento_3);

        alimento_4.setColumns(20);
        alimento_4.setLineWrap(true);
        alimento_4.setRows(3);
        jScrollPane8.setViewportView(alimento_4);

        alimento_5.setColumns(20);
        alimento_5.setLineWrap(true);
        alimento_5.setRows(3);
        jScrollPane10.setViewportView(alimento_5);

        ingredientes_5.setColumns(20);
        ingredientes_5.setLineWrap(true);
        ingredientes_5.setRows(3);
        jScrollPane12.setViewportView(ingredientes_5);

        ingredientes_4.setColumns(20);
        ingredientes_4.setLineWrap(true);
        ingredientes_4.setRows(3);
        jScrollPane9.setViewportView(ingredientes_4);

        ingredientes_3.setColumns(20);
        ingredientes_3.setLineWrap(true);
        ingredientes_3.setRows(3);
        jScrollPane7.setViewportView(ingredientes_3);

        ingredientes_2.setColumns(20);
        ingredientes_2.setLineWrap(true);
        ingredientes_2.setRows(3);
        jScrollPane5.setViewportView(ingredientes_2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel32)
                .addGap(171, 171, 171)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addGap(180, 180, 180))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel38)
                    .addComponent(jLabel37))
                .addGap(391, 391, 391)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7)
                    .addComponent(jScrollPane5))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel36))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(hora_1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hora_3, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(hora_2, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(hora_4, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(hora_5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane12)
                            .addComponent(jScrollPane9))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hora_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hora_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel35))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hora_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel36))
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hora_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel37)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hora_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel38)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Recordatorio de 24 hrs.", jPanel4);

        btn_actualizar.setText("Actualizar valores");
        btn_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_actualizar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unas_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unas_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unas_1ActionPerformed

    private void piel_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piel_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_piel_13ActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // Personal
        String nombre = nombre_txt.getText();
        int edad = Integer.parseInt(edad_txt.getText());
        long telefono = Long.parseLong(telefono_txt.getText());
        String correo = correo_txt.getText();
        Long celular = Long.parseLong(celular_txt.getText());

        String a_h = a_h_txt.getText();
        String a_pat = a_pat_txt.getText(); 
        String a_npat = a_npat_txt.getText();
        //Ingresar_paciente_enviar.ant_npa = 
        String alergia_a = alergia_a_txt.getText();
        String alergia_m = alergia_m_txt.getText();
        String quirur = quirur_txt.getText();
        String trastornos = trastornos_txt.getText();
        String x = sup_txt.getText();
        int suplemento = 0;
        if ("Si".equals(x) || "si".equals(x)){
            suplemento = 1;
        }
        
        if ("".equals(nombre_txt.getText()))
        {
            JOptionPane.showConfirmDialog(null, "Favor de llenar el campo de nombre");
            return;
        }
        
        //Antropometrico y bioquimico
        float peso = Float.parseFloat(peso_txt.getText());
        float estatura = Float.parseFloat(estatura_txt.getText());
        float c_cintura = Float.parseFloat(c_cintura_txt.getText());
        float c_cadera = Float.parseFloat(c_cadera_txt.getText());
        float c_muneca = Float.parseFloat(c_muneca_txt.getText());
        float c_brazo = Float.parseFloat(c_brazo_txt.getText());
        float biceps = Float.parseFloat(biceps_txt.getText());
        float triceps = Float.parseFloat(triceps_txt.getText());
        
        float glucosa = Float.parseFloat(glucosa_txt.getText());
        float a_urico = Float.parseFloat(a_urico_txt.getText());
        float trigliceridos = Float.parseFloat(trigliceridos_txt.getText());
        float colesterol = Float.parseFloat(colesterol_txt.getText());
        
        //Recordatorio de 24 horas
        String hora1 = hora_1.getText();
        String alimento1 = alimento_1.getText();
        String ingredientes1 = ingredientes_1.getText();
        String hora2 = hora_2.getText();
        String alimento2 = alimento_2.getText();
        String ingredientes2 = ingredientes_2.getText();
        String hora3 = hora_3.getText();
        String alimento3 = alimento_3.getText();
        String ingredientes3 = ingredientes_3.getText();
        String hora4 = hora_4.getText();
        String alimento4 = alimento_4.getText();
        String ingredientes4 = ingredientes_4.getText();
        String hora5 = hora_5.getText();
        String alimento5 = alimento_5.getText();
        String ingredientes5 = ingredientes_5.getText();
        
        //Clinico
        int edem = (edema.isSelected()) ? 1:0;
        int obesida = (obesidad.isSelected()) ? 1:0;
        int unas1 = (unas_1.isSelected()) ? 1:0;
        int unas2 = (unas_2.isSelected()) ? 1:0;
        int cuello1 = (cuello_7.isSelected()) ? 1:0;
        int cuello2 = (cuello_8.isSelected()) ? 1:0;
        int nervioso1 = (nervioso_1.isSelected()) ? 1:0;
        int nervioso2 = (nervioso_2.isSelected()) ? 1:0;
        int nervioso3 = (nervioso_3.isSelected()) ? 1:0;
        int rostro1 = (rostro_1.isSelected()) ? 1:0;
        int rostro2 = (rostro_2.isSelected()) ? 1:0;
        int rostro3 = (rostro_3.isSelected()) ? 1:0;
        int dientes1 = (dientes_1.isSelected()) ? 1:0;
        int dientes2 = (dientes_2.isSelected()) ? 1:0;
        int dientes3 = (dientes_3.isSelected()) ? 1:0;
        int urinaria1 = (urinaria_1.isSelected()) ? 1:0;
        int urinaria2 = (urinaria_2.isSelected()) ? 1:0;
        int torax1 = (torax_1.isSelected()) ? 1:0;
        int torax2 = (torax_2.isSelected()) ? 1:0;
        int torax3 = (torax_3.isSelected()) ? 1:0;
        int torax4 = (torax_4.isSelected()) ? 1:0;
        int boca1 = (boca_1.isSelected()) ? 1:0;
        int boca2 = (boca_2.isSelected()) ? 1:0;
        int boca3 = (boca_3.isSelected()) ? 1:0;
        int boca4 = (boca_4.isSelected()) ? 1:0;
        int boca5 = (boca_5.isSelected()) ? 1:0;
        int boca6 = (boca_6.isSelected()) ? 1:0;
        int ojos1 = (ojos_1.isSelected()) ? 1:0;
        int ojos2 = (ojos_2.isSelected()) ? 1:0;
        int ojos3 = (ojos_3.isSelected()) ? 1:0;
        int ojos4 = (ojos_4.isSelected()) ? 1:0;
        int ojos5 = (ojos_5.isSelected()) ? 1:0;
        int piel1 = (piel_8.isSelected()) ? 1:0;
        int piel2 = (piel_9.isSelected()) ? 1:0;
        int piel3 = (piel_10.isSelected()) ? 1:0;
        int piel4 = (piel_11.isSelected()) ? 1:0;
        int piel5 = (piel_12.isSelected()) ? 1:0;
        int piel6 = (piel_13.isSelected()) ? 1:0;
        int piel7 = (piel_14.isSelected()) ? 1:0;
        int esqueleto1 = (esqueleto_1.isSelected()) ? 1:0;
        int esqueleto2 = (esqueleto_2.isSelected()) ? 1:0;
        int esqueleto3 = (esqueleto_3.isSelected()) ? 1:0;
        
        //ACTUALIZACION
        Conectar con = new Conectar();
        String sql_clinico = "UPDATE pacientes_clinico SET edema=" + edem + ",obesidad=" + obesida + ",unas_1=" + unas1 + ",unas_2=" + unas2 + ",cuello_1=" + cuello1 + ",cuello_2=" + cuello2 + ",nervioso_1=" + nervioso1 + ",nervioso_2=" + nervioso2 + ",nervioso_3=" + nervioso3 + ",rostro_1=" + rostro1 + ",rostro_2=" + rostro2 + ",rostro_3=" + rostro3 + ",dientes_1=" + dientes1 + ",dientes_2=" + dientes2 + ",dientes_3=" + dientes3 + ",urinaria_1=" + urinaria1 + ",urinaria_2=" + urinaria2 + ",torax_1=" + torax1 + ",torax_2=" + torax2 + ",torax_3=" + torax3 + ",torax_4=" + torax4 + ",boca_1=" + boca1 + ",boca_2=" + boca2 + ",boca_3=" + boca3 + ",boca_4=" + boca4 + ",boca_5=" + boca5 + ",boca_6=" + boca6 + ",ojos_1=" + ojos1 + ",ojos_2=" + ojos2 + ",ojos_3=" + ojos3 + ",ojos_4=" + ojos4 + ",ojos_5=" + ojos5 + ",piel_1=" + piel1 + ",piel_2=" + piel2 + ",piel_3=" + piel3 + ",piel_4=" + piel4 + ",piel_5=" + piel5 + ",piel_6=" + piel6 + ",piel_7=" + piel7 + ",esqueleto_1=" + esqueleto1 + ",esqueleto_2=" + esqueleto2 + ",esqueleto_3=" + esqueleto3 + " WHERE id=" + registro;
        String sql_recordatorio = "UPDATE pacientes_evaluacion SET hora_1='" + hora1 + "',alimento_1='" + alimento1 + "',ingredientes_1='" + ingredientes1 +  "',hora_2='" + hora2 + "',alimento_2='" + alimento2 + "',ingredientes_2='" + ingredientes2 + "',hora_3='" + hora3 + "',alimento_3='" + alimento3 + "',ingredientes_3='" + ingredientes3 + "',hora_4='" + hora4 + "',alimento_4='" + alimento4 + "',ingredientes_4='" + ingredientes4 + "',hora_5='" + hora5 + "',alimento_5='" + alimento5 + "',ingredientes_5='" + ingredientes5 + "' WHERE id=" + registro;
        String sql_personal = "UPDATE pacientes SET nombre='" + nombre + "',edad=" + edad + ",telefono=" + telefono + ",correo='" + correo + "',celular=" + celular + ",a_heredo='" + a_h + "',a_no_pat='" + a_npat + "',a_pat='" + a_pat + "',alergias_a='" + alergia_a + "',alergias_m='"  + alergia_m + "',quirurgicos='" + quirur + "',trastornos='" + trastornos + "',suplementos='" + suplemento + "' WHERE id=" + registro;
        String sql_antro = "UPDATE pacientes_info SET peso=" + peso + ",estatura=" + estatura + ",c_cintura=" + c_cintura + ",c_cadera=" + c_cadera + ",c_muneca=" + c_muneca + ",c_brazo=" + c_brazo + ",biceps=" + biceps + ",triceps=" + triceps + ",glucosa=" + glucosa + ",a_urico=" + a_urico + ",trigliceridos=" + trigliceridos + ",colesterol=" + colesterol + " WHERE id=" + registro;
        Connection co = con.conexion();
        Statement stm;
        try {
            stm = co.createStatement();
            stm.executeUpdate(sql_clinico);
            stm.executeUpdate(sql_recordatorio);
            stm.executeUpdate(sql_personal);
            stm.executeUpdate(sql_antro);
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar");
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Editar_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar_paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a_h_txt;
    private javax.swing.JTextField a_npat_txt;
    private javax.swing.JTextField a_pat_txt;
    private javax.swing.JTextField a_urico_txt;
    private javax.swing.JTextField alergia_a_txt;
    private javax.swing.JTextField alergia_m_txt;
    private javax.swing.JTextArea alimento_1;
    private javax.swing.JTextArea alimento_2;
    private javax.swing.JTextArea alimento_3;
    private javax.swing.JTextArea alimento_4;
    private javax.swing.JTextArea alimento_5;
    private javax.swing.JTextField biceps_txt;
    private javax.swing.JRadioButton boca_1;
    private javax.swing.JRadioButton boca_2;
    private javax.swing.JRadioButton boca_3;
    private javax.swing.JRadioButton boca_4;
    private javax.swing.JRadioButton boca_5;
    private javax.swing.JRadioButton boca_6;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JTextField c_brazo_txt;
    private javax.swing.JTextField c_cadera_txt;
    private javax.swing.JTextField c_cintura_txt;
    private javax.swing.JTextField c_muneca_txt;
    private javax.swing.JTextField celular_txt;
    private javax.swing.JTextField colesterol_txt;
    private javax.swing.JTextField correo_txt;
    private javax.swing.JRadioButton cuello_7;
    private javax.swing.JRadioButton cuello_8;
    private javax.swing.JRadioButton dientes_1;
    private javax.swing.JRadioButton dientes_2;
    private javax.swing.JRadioButton dientes_3;
    private javax.swing.JTextField edad_txt;
    private javax.swing.JRadioButton edema;
    private javax.swing.JRadioButton esqueleto_1;
    private javax.swing.JRadioButton esqueleto_2;
    private javax.swing.JRadioButton esqueleto_3;
    private javax.swing.JTextField estatura_txt;
    private javax.swing.JTextField glucosa_txt;
    private javax.swing.JTextField hora_1;
    private javax.swing.JTextField hora_2;
    private javax.swing.JTextField hora_3;
    private javax.swing.JTextField hora_4;
    private javax.swing.JTextField hora_5;
    private javax.swing.JTextArea ingredientes_1;
    private javax.swing.JTextArea ingredientes_2;
    private javax.swing.JTextArea ingredientes_3;
    private javax.swing.JTextArea ingredientes_4;
    private javax.swing.JTextArea ingredientes_5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton nervioso_1;
    private javax.swing.JRadioButton nervioso_2;
    private javax.swing.JRadioButton nervioso_3;
    private javax.swing.JTextField nombre_txt;
    private javax.swing.JRadioButton obesidad;
    private javax.swing.JRadioButton ojos_1;
    private javax.swing.JRadioButton ojos_2;
    private javax.swing.JRadioButton ojos_3;
    private javax.swing.JRadioButton ojos_4;
    private javax.swing.JRadioButton ojos_5;
    private javax.swing.JTextField peso_txt;
    private javax.swing.JRadioButton piel_10;
    private javax.swing.JRadioButton piel_11;
    private javax.swing.JRadioButton piel_12;
    private javax.swing.JRadioButton piel_13;
    private javax.swing.JRadioButton piel_14;
    private javax.swing.JRadioButton piel_8;
    private javax.swing.JRadioButton piel_9;
    private javax.swing.JTextField quirur_txt;
    private javax.swing.JRadioButton rostro_1;
    private javax.swing.JRadioButton rostro_2;
    private javax.swing.JRadioButton rostro_3;
    private javax.swing.JTextField sup_txt;
    private javax.swing.JTextField telefono_txt;
    private javax.swing.JRadioButton torax_1;
    private javax.swing.JRadioButton torax_2;
    private javax.swing.JRadioButton torax_3;
    private javax.swing.JRadioButton torax_4;
    private javax.swing.JTextField trastornos_txt;
    private javax.swing.JTextField triceps_txt;
    private javax.swing.JTextField trigliceridos_txt;
    private javax.swing.JRadioButton unas_1;
    private javax.swing.JRadioButton unas_2;
    private javax.swing.JRadioButton urinaria_1;
    private javax.swing.JRadioButton urinaria_2;
    // End of variables declaration//GEN-END:variables
}
