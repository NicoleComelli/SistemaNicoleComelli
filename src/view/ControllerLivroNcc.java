/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u03808019140
 */
public class ControllerLivroNcc extends AbstractTableModel{

    List lista;

    public void setList(List lista) {
        this.lista = lista;
    }
    public Object getBean(int rowIndex){
    return lista.get(rowIndex);
    }   
    @Override
    public int getRowCount() {
     return lista.size();    }

    @Override
    public int getColumnCount() {
        return 3;
        }

@Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        return "";
    }
    public String getColumnName(int column){
        if (column == 0 ) return "Código";
        if (column == 1 ) return "Titulo";
        if (column == 2 ) return "Autor";
        return "";
}
}

