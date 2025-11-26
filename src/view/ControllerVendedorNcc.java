/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.VendedorNcc;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u03808019140
 */
public class ControllerVendedorNcc extends AbstractTableModel {

    List listaVendedor;

    public void setList(List listaVendedor) {
        this.listaVendedor = listaVendedor;
        this.fireTableDataChanged();
    }

    public VendedorNcc getBean(int rowIndex) {
        return (VendedorNcc) listaVendedor.get(rowIndex);
    }

    public void addBean(VendedorNcc vendedorNcc) {
        listaVendedor.add(vendedorNcc);
        this.fireTableDataChanged();
    }

    public void removeBean(int rowIndex) {
        listaVendedor.remove(rowIndex);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return listaVendedor.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VendedorNcc vendedorNcc = (VendedorNcc) listaVendedor.get(rowIndex);
        if (columnIndex == 0) {
            return vendedorNcc.getIdVendedorNcc();
        } else if (columnIndex == 1) {
            return vendedorNcc.getNomeNcc();
        } else if (columnIndex == 2) {
            return vendedorNcc.getCpfNcc();
        }
        return "";
    }

    public String getColumnName(int column) {
        if (column == 0) {
            return "Código";
        } else if (column == 1) {
            return "Nome";
        } else if (column == 2) {
            return "CPF";
        }
        return "";
    }
}
