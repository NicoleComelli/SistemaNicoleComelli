/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.VendedorNcc;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u03808019140
 */
public class ControllerConsultasVendedorNcc extends AbstractTableModel {

    private List lstConsultasVendedor;

    public void setList(List lstConsultasVendedor) {
        this.lstConsultasVendedor = lstConsultasVendedor;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstConsultasVendedor.size();

    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VendedorNcc vendedorNcc  = (VendedorNcc) lstConsultasVendedor.get(rowIndex);
        if (columnIndex == 0) {
            return vendedorNcc.getNomeNcc();
        } else if (columnIndex == 1) {
            return vendedorNcc.getApelidoNcc();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Nome";
        } else if (columnIndex == 1) {
            return "Apelido";
        }
        return "";
    }
}
