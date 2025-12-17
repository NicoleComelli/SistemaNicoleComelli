/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.VendasNcc;
import bean.VendedorNcc;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u03808019140
 */
public class ControllerConsultasVendasNcc extends AbstractTableModel {

    private List lstConsultasVendas;

    public void setList(List lstConsultasVendas) {
        this.lstConsultasVendas = lstConsultasVendas;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstConsultasVendas.size();

    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VendasNcc vendasNcc  = (VendasNcc) lstConsultasVendas.get(rowIndex);
        if (columnIndex == 0) {
            return vendasNcc.getVendedorNcc();
        } else if (columnIndex == 1) {
            return vendasNcc.getTotalNcc();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Vendedor";
        } else if (columnIndex == 1) {
            return "Total";
        }
        return "";
    }
}
