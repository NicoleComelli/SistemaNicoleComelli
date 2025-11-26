/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.AutorNcc;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u03808019140
 */
public class ControllerAutorNcc extends AbstractTableModel {

    List listaAutor;

    public void setList(List listaAutor) {
        this.listaAutor = listaAutor;
    }

    public AutorNcc getBean(int rowIndex) {
        return (AutorNcc) listaAutor.get(rowIndex);
    }

    public void addBean(AutorNcc autorNcc) {
        listaAutor.add(autorNcc);
        this.fireTableDataChanged();
    }

    public void removeBean(int rowIndex) {
        listaAutor.remove(rowIndex);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return listaAutor.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        AutorNcc autorNcc = (AutorNcc) listaAutor.get(rowIndex);
        if (columnIndex == 0) {
            return autorNcc.getIdAutorNcc();
        } else if (columnIndex == 1) {
            return autorNcc.getNomeNcc();
        } else if (columnIndex == 2) {
            return autorNcc.getPseudonimoNcc();
        }
        return "";
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Código";
        } else if (column == 1) {
            return "Nome";
        } else if (column == 2) {
            return "Pseudonimo";
        }
        return "";
    }
}
