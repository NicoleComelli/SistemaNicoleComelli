/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.LivroNcc;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u03808019140
 */
public class ControllerLivroNcc extends AbstractTableModel {

    List listaLivro;

    public void setList(List listaLivro) {
        this.listaLivro = listaLivro;
    }

    public LivroNcc getBean(int rowIndex) {
        return (LivroNcc) listaLivro.get(rowIndex);
    }

    public void addBean(LivroNcc livroNcc) {
        listaLivro.add(livroNcc);
        this.fireTableDataChanged();
    }

    public void removeBean(int rowIndex) {
        listaLivro.remove(rowIndex);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return listaLivro.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LivroNcc livroNcc = (LivroNcc) listaLivro.get(rowIndex);
        if (columnIndex == 0) {
            return livroNcc.getIdLivroNcc();
        } else if (columnIndex == 1) {
            return livroNcc.getTituloNcc();
        } else if (columnIndex == 2) {
            return livroNcc.getAutorNcc();
        }  else if (columnIndex == 3) {
            return livroNcc.getValorUnNcc();
        }
        return "";
    }

    public String getColumnName(int column) {
        if (column == 0) {
            return "Código";
        } else if (column == 1) {
            return "Titulo";
        } else if (column == 2) {
            return "Autor";
        } else if (column == 3) {
            return "Valor unitário";
        }
        return "";
    }
}
