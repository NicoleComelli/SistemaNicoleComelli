/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.UsuariosNcc;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u09132909128
 */
public class ControllerUsuarioNcc extends AbstractTableModel {

    List listaUsuarios;

    public void setList(List listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
        this.fireTableDataChanged();
    }

    public UsuariosNcc getBean(int rowIndex) {
        return (UsuariosNcc) listaUsuarios.get(rowIndex);
    }

    public void addBean(UsuariosNcc usuariosNcc) {
        listaUsuarios.add(usuariosNcc);
        this.fireTableDataChanged();
    }

    public void removeBean(int rowIndex) {
        listaUsuarios.remove(rowIndex);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return listaUsuarios.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        UsuariosNcc usuariosNcc = (UsuariosNcc) listaUsuarios.get(rowIndex);
        if (columnIndex == 0) {
            return usuariosNcc.getIdUsuariosNcc();
        } else if (columnIndex == 1) {
            return usuariosNcc.getNomeNcc();
        } else if (columnIndex == 2) {
            return usuariosNcc.getCpfNcc();
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
