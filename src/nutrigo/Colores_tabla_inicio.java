/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutrigo;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Rene
 */
public class Colores_tabla_inicio extends DefaultTableCellRenderer{
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component componente = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (isSelected)
        {
            componente.setBackground(new Color(0,0,0)); //NEGRO
        }
        else
        {
            if ((Panel_Inicio.Tabla_notas.getValueAt(row, 4)).equals("Positiva"))
            {
                componente.setBackground(new Color(164,223,157)); //VERDE
            }
            else if ((Panel_Inicio.Tabla_notas.getValueAt(row, 4)).equals("Alerta"))
            {
                componente.setBackground(new Color(236,236,130)); //AMARILLO
            }
            else if ((Panel_Inicio.Tabla_notas.getValueAt(row, 4)).equals("Urgente"))
            {
                componente.setBackground(new Color(236,130,148)); //ROJO
            }
            else if ((Panel_Inicio.Tabla_notas.getValueAt(row, 4)).equals("Suceso"))
            {
                componente.setBackground(new Color(113,173,241)); //AZUL
            }
            else if ((Panel_Inicio.Tabla_notas.getValueAt(row, 4)).equals("Sin tipo"))
            {
                componente.setBackground(new Color(248,248,248)); //BLANCO
            }
        }
        return componente;
    }
    
}
