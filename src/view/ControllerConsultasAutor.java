/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.AutorNcc;
import bean.LivroNcc;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u03808019140
 */
public class ControllerConsultasAutor extends AbstractTableModel {

    private List lstConsultasAutor;

    public void setList(List lstConsultasAutor) {
        this.lstConsultasAutor = lstConsultasAutor;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstConsultasAutor.size();

    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        AutorNcc autorNcc  = (AutorNcc) lstConsultasAutor.get(rowIndex);
        if (columnIndex == 0) {
            return autorNcc.getNomeNcc();
        } else if (columnIndex == 1) {
            return autorNcc.getPseudonimoNcc();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Nome";
        } else if (columnIndex == 1) {
            return "Pseudonimo";
        }
        return "";
    }
}
