/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.VendasNcc;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u09217474118
 */
public class ControllerVendasNcc extends AbstractTableModel {

    private List listaVendas;

    public void setList(List listaVendas) {
        this.listaVendas = listaVendas;
        this.fireTableDataChanged();
    }

    public VendasNcc getBean(int rowIndex) {
        return (VendasNcc) listaVendas.get(rowIndex);
    }

    public void addBean(VendasNcc vendasNcc) {
        listaVendas.add(vendasNcc);
        this.fireTableDataChanged();
    }

    public void removeBean(int rowIndex) {
        listaVendas.remove(rowIndex);
    }

    @Override
    public int getRowCount() {
        return listaVendas.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VendasNcc VendasNcc = (VendasNcc) listaVendas.get(rowIndex);

        if (columnIndex == 0) {
            return VendasNcc.getIdVendasNcc();
        } else if (columnIndex == 1) {
            return VendasNcc.getClienteNcc();
        } else if (columnIndex == 2) {
            return VendasNcc.getVendedorNcc();
        } else if (columnIndex == 3) {
            return VendasNcc.getDataVendaNcc();
        } else if (columnIndex == 4) {
            return VendasNcc.getTotalNcc();
        }
        return "";
    }

    @Override

    public String getColumnName(int columnIndex) {

        if (columnIndex == 0) {
            return "Código";
        } else if (columnIndex == 1) {
            return "Cliente";
        } else if (columnIndex == 2) {
            return "Vendedor";
        } else if (columnIndex == 3) {
            return "Data";
        } else if (columnIndex == 4) {
            return "Total";
        }
        return "";
    }
}
