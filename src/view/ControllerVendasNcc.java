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

    private List vendasPesquisar;

    public void setList(List list) {
        this.vendasPesquisar = list;
    }

    public VendasNcc getBean(int rowIndex) {
        return (VendasNcc) vendasPesquisar.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return vendasPesquisar.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VendasNcc VendasNcc = (VendasNcc) vendasPesquisar.get(rowIndex);

        if (columnIndex == 0) {
            return VendasNcc.getIdVendasNcc();

        }
        if (columnIndex == 1) {
            return VendasNcc.getDataVendaNcc();
        }
        if (columnIndex == 2) {
            return VendasNcc.getTotalNcc();
        }
        return "";
    }

    @Override

    public String getColumnName(int columnIndex) {

        if (columnIndex == 0) {
            return "Código";

        }
        if (columnIndex == 1) {
            return "Data";
        }
        if (columnIndex == 2) {
            return "Total";
        }
        return "";
    }
}
