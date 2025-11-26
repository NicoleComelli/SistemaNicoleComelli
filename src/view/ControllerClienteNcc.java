/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ClienteNcc;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u03808019140
 */
public class ControllerClienteNcc extends AbstractTableModel {

    List listaCliente;

    public void setList(List listaCliente) {
        this.listaCliente = listaCliente;
    }

    public ClienteNcc getBean(int rowIndex) {
        return (ClienteNcc) listaCliente.get(rowIndex);
    }

    public void addBean(ClienteNcc clienteNcc) {
        listaCliente.add(clienteNcc);
        this.fireTableDataChanged();
    }

    public void removeBean(int rowIndex) {
        listaCliente.remove(rowIndex);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return listaCliente.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ClienteNcc clienteNcc = (ClienteNcc) listaCliente.get(rowIndex);
        if (columnIndex == 0) {
            return clienteNcc.getIdClienteNcc();
        } else if (columnIndex == 1) {
            return clienteNcc.getNomeNcc();
        } else if (columnIndex == 2) {
            return clienteNcc.getCpfNcc();
        } else if (columnIndex == 3) {
            return clienteNcc.getTotalGastoNcc();
        }
        return "";
    }

    public String getColumnName(int column) {
        if (column == 0) {
            return "Código";
        } else if (column == 1) {
            return "Nome";
        } else if (column == 2) {
            return "cpf";
        } else if (column == 3) {
            return "total gasto";
        }
        return "";
    }
}
