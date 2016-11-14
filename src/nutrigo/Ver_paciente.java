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
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rene
 */
public class Ver_paciente extends javax.swing.JFrame {

    /**
     * Creates new form Ver_usuario
     */
    public Ver_paciente() {
        initComponents();
        /*int row = Panel_Pacientes.Tabla.getSelectedRow();
        String reg = (String) Panel_Pacientes.Tabla.getValueAt(row, 0);
        int registro = Integer.parseInt(reg);*/
        Conectar con = new Conectar();
        Connection co = con.conexion();
        
        //Personal
        String nombre="",edad="",telefono="",correo="",celular="",escolaridad="",a_heredo="",a_no_pat="",a_pat="";
        String alergias_a="",alergias_m="",quirurgicos="",trastornos="",suplementos="";
        String sql_personal = "SELECT nombre,edad,telefono,correo,celular,a_heredo,a_no_pat,a_pat,alergias_a,"
                + "alergias_m,quirurgicos,trastornos,suplementos FROM pacientes WHERE id=1";
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
                + "a_urico, trigliceridos, colesterol FROM pacientes_info WHERE id=1";
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
        peso_txt.setText(peso + " kg");
        estatura_txt.setText(estatura + " m");
        c_cintura_txt.setText(c_cintura + " cm");
        c_cadera_txt.setText(c_cadera + " cm");
        c_muneca_txt.setText(c_muneca + " cm");
        c_brazo_txt.setText(c_brazo + " cm");
        biceps_txt.setText(biceps + " mm");
        triceps_txt.setText(triceps + " mm");
        glucosa_txt.setText(glucosa + " gr/dl");
        a_urico_txt.setText(a_urico + " gr/dl");
        trigliceridos_txt.setText(trigliceridos + " gr/dl");
        colesterol_txt.setText(colesterol + " gr/dl");
        
        float masa=Float.parseFloat(peso);
        float alt_cm = Float.parseFloat(estatura);
        float alt_m = (float) Math.pow(alt_cm / 100, 2);
        float c_ci = Float.parseFloat(c_cintura);
        float c_ca = Float.parseFloat(c_cadera);
        float c_mu = Float.parseFloat(c_muneca);
        String indice_masa = String.valueOf(masa/alt_m) + " kg/m2";
        String indice_cc = String.valueOf(c_ci / c_ca);
        String complexion_coorporal = String.valueOf(alt_cm / c_mu);
        
        imc_txt.setText(indice_masa);
        icc_txt.setText(indice_cc);
        cc_txt.setText(complexion_coorporal);
        
        //Recordatorio de 24 hrs
        String hora1="", alimento1="", ingredientes1="";
        String hora2="", alimento2="", ingredientes2="";
        String hora3="", alimento3="", ingredientes3="";
        String hora4="", alimento4="", ingredientes4="";
        String hora5="", alimento5="", ingredientes5="";
        String sql_recordatorio = "SELECT hora_1, alimento_1, ingredientes_1,hora_2, alimento_2, ingredientes_2,hora_3,"
                + "alimento_3, ingredientes_3,hora_4, alimento_4, ingredientes_4,hora_5, alimento_5, ingredientes_5"
                + " FROM pacientes_evaluacion WHERE id=1";
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
        String[][] sintomas = new String[42][2];
        sintomas[0][1] = "Edema";
        sintomas[1][1] = "Obesidad";
        sintomas[2][1] = "Uña coiloniquea";
        sintomas[3][1] = "Despigmentacion o grietas en las uñas";
        sintomas[4][1] = "Agrandamiento de tiroides";
        sintomas[5][1] = "Agrandamiento de paratiroides";
        sintomas[6][1] = "Confusion mental";
        sintomas[7][1] = "Disminucion de reflejos";
        sintomas[8][1] = "Dolor de abeza, vomito y/o mareos";
        sintomas[9][1] = "Cara de luna";
        sintomas[10][1] = "Parestesia facial";
        sintomas[11][1] = "Despigmentacion o hinchazon en rostro";
        sintomas[12][1] = "Fluorosis";
        sintomas[13][1] = "Falta de dientes";
        sintomas[14][1] = "Perdida de esmalte en los dientes";
        sintomas[15][1] = "Orina oscura y concentrada";
        sintomas[16][1] = "Orina clara y diluida";
        sintomas[17][1] = "Disminucion de masa y fuerza coorporal";
        sintomas[18][1] = "Falta de respiracion y/o fatiga";
        sintomas[19][1] = "Disminucion de funcionamiento pulmonar";
        sintomas[20][1] = "Falla cardiaca";
        sintomas[21][1] = "Atrofia papilar";
        sintomas[22][1] = "Glocitis";
        sintomas[23][1] = "Lengua margenta o escarlata";
        sintomas[24][1] = "Encias hinchadas";
        sintomas[25][1] = "Disminucion de gusto";
        sintomas[26][1] = "Atrofia en la lengua";
        sintomas[27][1] = "Manchas de bitot";
        sintomas[28][1] = "Keratomalasia";
        sintomas[29][1] = "Xerosis";
        sintomas[30][1] = "Ceguera nocturna";
        sintomas[31][1] = "Xantelasma";
        sintomas[32][1] = "Falta de brillo en cabello";
        sintomas[33][1] = "Cabello signo de bandera";
        sintomas[34][1] = "Escaces de cabello";
        sintomas[35][1] = "Problemas de cicatrizacion";
        sintomas[36][1] = "Piel escamosa";
        sintomas[37][1] = "Ceborrea nasolabial";
        sintomas[38][1] = "Falta de elasticidad";
        sintomas[39][1] = "Dolor en articulaciones";
        sintomas[40][1] = "Dolor en pantorrillas y muslos";
        sintomas[41][1] = "Piernas arqueadas";
        String sql_clinico = "SELECT edema, obesidad, unas_1, unas_2, cuello_1, cuello_2, nervioso_1, nervioso_2, nervioso_3,"
                + "rostro_1, rostro_2, rostro_3, dientes_1, dientes_2, dientes_3, urinaria_1, urinaria_2, torax_1, torax_2,"
                + "torax_3, torax_4, boca_1, boca_2, boca_3, boca_4, boca_5, boca_6, ojos_1, ojos_2, ojos_3, ojos_4, ojos_5,"
                + "piel_1, piel_2, piel_3, piel_4, piel_5, piel_6, piel_7, esqueleto_1, esqueleto_2, esqueleto_3 FROM pacientes_clinico WHERE id=1";
        int i = 1;
        try{
            Statement st = co.createStatement();
            ResultSet rs = st.executeQuery(sql_clinico);
            while(rs.next()){
                while (i<43)
                {
                    sintomas[i-1][0] = rs.getString(i);
                    i++;
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al tratar de tomar los valores clinicos del paciente, vuelva a intentarlo");
        }
        for (i=0; i<42; i++)
                {
                    if ("1".equals(sintomas[i][0]))
                    {
                        sintomas_txt += sintomas[i][1] + "\n";
                    }
                }
        if ("".equals(sintomas_txt))
        {
            sintomas_txt = "El paciente no tiene ningun padecimiento";
        }
        lista_sintomas.setText(sintomas_txt);
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
        jPanel3 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_sintomas = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        telefono_txt = new javax.swing.JLabel();
        nombre_txt = new javax.swing.JLabel();
        correo_txt = new javax.swing.JLabel();
        edad_txt = new javax.swing.JLabel();
        celular_txt = new javax.swing.JLabel();
        a_h_txt = new javax.swing.JLabel();
        a_pat_txt = new javax.swing.JLabel();
        a_npat_txt = new javax.swing.JLabel();
        alergia_a_txt = new javax.swing.JLabel();
        alergia_m_txt = new javax.swing.JLabel();
        quirur_txt = new javax.swing.JLabel();
        trastornos_txt = new javax.swing.JLabel();
        sup_txt = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        peso_txt = new javax.swing.JLabel();
        c_cintura_txt = new javax.swing.JLabel();
        c_cadera_txt = new javax.swing.JLabel();
        biceps_txt = new javax.swing.JLabel();
        c_brazo_txt = new javax.swing.JLabel();
        triceps_txt = new javax.swing.JLabel();
        c_muneca_txt = new javax.swing.JLabel();
        estatura_txt = new javax.swing.JLabel();
        cc_txt = new javax.swing.JLabel();
        imc_txt = new javax.swing.JLabel();
        a_urico_txt = new javax.swing.JLabel();
        glucosa_txt = new javax.swing.JLabel();
        colesterol_txt = new javax.swing.JLabel();
        trigliceridos_txt = new javax.swing.JLabel();
        icc_txt = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ingredientes_1 = new javax.swing.JTextArea();
        hora_1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        hora_2 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        alimento_2 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        ingredientes_2 = new javax.swing.JTextArea();
        jLabel36 = new javax.swing.JLabel();
        hora_3 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        alimento_3 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        ingredientes_3 = new javax.swing.JTextArea();
        jLabel37 = new javax.swing.JLabel();
        hora_4 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        alimento_4 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        ingredientes_4 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        alimento_5 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        alimento_1 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        ingredientes_5 = new javax.swing.JTextArea();
        jLabel38 = new javax.swing.JLabel();
        hora_5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel39.setText("Lista de sintomas con los que cuenta el paciente:");

        lista_sintomas.setColumns(20);
        lista_sintomas.setRows(5);
        jScrollPane2.setViewportView(lista_sintomas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Clinico", jPanel3);

        jLabel11.setText("Antecedentes personales no patologicos:");

        jLabel9.setText("Quirurgicos:");

        jLabel8.setText("Trastornos fisicos o gastrointestinales:");

        jLabel7.setText("¡Uso de suplementos?");

        jLabel6.setText("Antecedentes personales patologicos:");

        jLabel5.setText("Antecedentes heredofamiliares:");

        jLabel21.setText("Correo:");

        jLabel1.setText("Nombre:");

        jLabel2.setText("Edad:");

        jLabel22.setText("Telefono Celular:");

        jLabel23.setText("Telefono fijo:");

        jLabel3.setText("Alergias a medicamentos:");

        jLabel4.setText("Alergias a alimentos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(telefono_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(celular_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(correo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(a_pat_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a_npat_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(alergia_m_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(alergia_a_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(quirur_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(trastornos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sup_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(a_h_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addComponent(nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(telefono_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel22)
                                                    .addComponent(jLabel23)))
                                            .addComponent(celular_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel21)
                                            .addComponent(correo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(a_h_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(a_pat_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11))
                                    .addComponent(a_npat_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(alergia_a_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addComponent(alergia_m_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(quirur_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addComponent(trastornos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(sup_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Personal", jPanel1);

        jLabel10.setText("Peso::");

        jLabel12.setText("Estatura:");

        jLabel13.setText("Circunferencia de cintura:");

        jLabel14.setText("Circunferencia de muñeca:");

        jLabel15.setText("Circunferencia de brazo:");

        jLabel16.setText("Circunferencia de cadera:");

        jLabel17.setText("Biceps:");

        jLabel18.setText("Triceps:");

        jLabel19.setText("Glucosa:");

        jLabel20.setText("Acido urico:");

        jLabel24.setText("Trigliceridos:");

        jLabel25.setText("Colesterol:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Datos antropometricos");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Datos bioquimicos");

        jLabel28.setText("IMC:");

        jLabel29.setText("Indice cintura-cadera:");

        jLabel30.setText("Complexion coorporal:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel30))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(peso_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c_cadera_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(biceps_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(imc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(glucosa_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a_urico_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(c_cintura_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estatura_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_brazo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(triceps_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_muneca_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trigliceridos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colesterol_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(jLabel26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(282, 350, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(351, 351, 351))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(estatura_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25))
                                    .addComponent(c_muneca_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(c_brazo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25))
                                    .addComponent(triceps_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(icc_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel30))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(peso_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel12)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)))
                            .addComponent(c_cintura_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(c_cadera_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addComponent(biceps_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(imc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addComponent(cc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel25)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(trigliceridos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(25, 25, 25))
                                .addComponent(colesterol_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(glucosa_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addComponent(a_urico_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        jTabbedPane1.addTab("Antropometrico y bioquimico", jPanel2);

        ingredientes_1.setEditable(false);
        ingredientes_1.setColumns(20);
        ingredientes_1.setLineWrap(true);
        ingredientes_1.setRows(3);
        jScrollPane3.setViewportView(ingredientes_1);

        hora_1.setEditable(false);
        hora_1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel31.setText("Desayuno");

        jLabel32.setText("Hora");

        jLabel33.setText("Alimento");

        jLabel34.setText("Ingredientes");

        jLabel35.setText("Colacion 1");

        hora_2.setEditable(false);
        hora_2.setBackground(new java.awt.Color(255, 255, 255));

        alimento_2.setEditable(false);
        alimento_2.setColumns(20);
        alimento_2.setLineWrap(true);
        alimento_2.setRows(3);
        jScrollPane4.setViewportView(alimento_2);

        ingredientes_2.setEditable(false);
        ingredientes_2.setColumns(20);
        ingredientes_2.setLineWrap(true);
        ingredientes_2.setRows(3);
        jScrollPane5.setViewportView(ingredientes_2);

        jLabel36.setText("Comida");

        hora_3.setEditable(false);
        hora_3.setBackground(new java.awt.Color(255, 255, 255));

        alimento_3.setEditable(false);
        alimento_3.setColumns(20);
        alimento_3.setLineWrap(true);
        alimento_3.setRows(3);
        jScrollPane6.setViewportView(alimento_3);

        ingredientes_3.setEditable(false);
        ingredientes_3.setColumns(20);
        ingredientes_3.setLineWrap(true);
        ingredientes_3.setRows(3);
        jScrollPane7.setViewportView(ingredientes_3);

        jLabel37.setText("Colacion 2");

        hora_4.setEditable(false);
        hora_4.setBackground(new java.awt.Color(255, 255, 255));

        alimento_4.setEditable(false);
        alimento_4.setColumns(20);
        alimento_4.setLineWrap(true);
        alimento_4.setRows(3);
        jScrollPane8.setViewportView(alimento_4);

        ingredientes_4.setEditable(false);
        ingredientes_4.setColumns(20);
        ingredientes_4.setLineWrap(true);
        ingredientes_4.setRows(3);
        jScrollPane9.setViewportView(ingredientes_4);

        alimento_5.setEditable(false);
        alimento_5.setColumns(20);
        alimento_5.setLineWrap(true);
        alimento_5.setRows(3);
        jScrollPane10.setViewportView(alimento_5);

        alimento_1.setEditable(false);
        alimento_1.setColumns(20);
        alimento_1.setLineWrap(true);
        alimento_1.setRows(3);
        jScrollPane11.setViewportView(alimento_1);

        ingredientes_5.setEditable(false);
        ingredientes_5.setColumns(20);
        ingredientes_5.setLineWrap(true);
        ingredientes_5.setRows(3);
        jScrollPane12.setViewportView(ingredientes_5);

        jLabel38.setText("Cena");

        hora_5.setEditable(false);
        hora_5.setBackground(new java.awt.Color(255, 255, 255));

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
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel38)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(hora_5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addComponent(jScrollPane12))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel36))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(hora_1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3))
                    .addComponent(hora_3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hora_2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hora_4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Recordatorio de 24 hrs.", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Ver_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ver_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ver_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ver_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ver_paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a_h_txt;
    private javax.swing.JLabel a_npat_txt;
    private javax.swing.JLabel a_pat_txt;
    private javax.swing.JLabel a_urico_txt;
    private javax.swing.JLabel alergia_a_txt;
    private javax.swing.JLabel alergia_m_txt;
    private javax.swing.JTextArea alimento_1;
    private javax.swing.JTextArea alimento_2;
    private javax.swing.JTextArea alimento_3;
    private javax.swing.JTextArea alimento_4;
    private javax.swing.JTextArea alimento_5;
    private javax.swing.JLabel biceps_txt;
    private javax.swing.JLabel c_brazo_txt;
    private javax.swing.JLabel c_cadera_txt;
    private javax.swing.JLabel c_cintura_txt;
    private javax.swing.JLabel c_muneca_txt;
    private javax.swing.JLabel cc_txt;
    private javax.swing.JLabel celular_txt;
    private javax.swing.JLabel colesterol_txt;
    private javax.swing.JLabel correo_txt;
    private javax.swing.JLabel edad_txt;
    private javax.swing.JLabel estatura_txt;
    private javax.swing.JLabel glucosa_txt;
    private javax.swing.JTextField hora_1;
    private javax.swing.JTextField hora_2;
    private javax.swing.JTextField hora_3;
    private javax.swing.JTextField hora_4;
    private javax.swing.JTextField hora_5;
    private javax.swing.JLabel icc_txt;
    private javax.swing.JLabel imc_txt;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea lista_sintomas;
    private javax.swing.JLabel nombre_txt;
    private javax.swing.JLabel peso_txt;
    private javax.swing.JLabel quirur_txt;
    private javax.swing.JLabel sup_txt;
    private javax.swing.JLabel telefono_txt;
    private javax.swing.JLabel trastornos_txt;
    private javax.swing.JLabel triceps_txt;
    private javax.swing.JLabel trigliceridos_txt;
    // End of variables declaration//GEN-END:variables
}
