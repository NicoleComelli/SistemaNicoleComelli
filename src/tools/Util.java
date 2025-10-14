/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author u03808019140
 */
public class Util {

    public static void habilitar(boolean valor, JComponent... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(valor);

        }
    }

    public static void limpar(JComponent... components) {
        for (int i = 0; i < components.length; i++) {
            if (components[i] instanceof JTextField) {
                ((JTextField) components[i]).setText("");
            }
            if (components[i] instanceof JComboBox) {
                ((JComboBox) components[i]).setSelectedIndex(-1);
            }
            if (components[i] instanceof JFormattedTextField) {
                ((JFormattedTextField) components[i]).setText("");
            }
            if (components[i] instanceof JPasswordField) {
                ((JPasswordField) components[i]).setText("");
            }
            if (components[i] instanceof JCheckBox) {
                ((JCheckBox) components[i]).setSelected(false);
            }
        }
    }

    public static void msg(String cad) {
        JOptionPane.showMessageDialog(null, cad);
    }

    public static boolean perguntar(String cad) {
        int option = JOptionPane.showConfirmDialog(null, cad, "Pergunta", JOptionPane.YES_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            return true;
        }
        return false;
    }

    public static int strToInt(String num) {
        return Integer.valueOf(num);
    }

    public static String intToStr(int num) {
        return String.valueOf(num);
    }

    public static double strToDouble(String num) {
        return Double.parseDouble(num);
    }

    public static String doubleToStr(double num) {
        return String.valueOf(num);
    }

    public static Date strToDate(String data) {
        return null;
    }

    public static String dateToStr(Date data) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(data);
    }
}
