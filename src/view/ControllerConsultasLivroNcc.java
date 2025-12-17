/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.LivroNcc;
import bean.VendedorNcc;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u03808019140
 */
public class ControllerConsultasLivroNcc extends AbstractTableModel {

    private List lstConsultasUsuarios;

    public void setList(List lstConsultasUsuarios) {
        this.lstConsultasUsuarios = lstConsultasUsuarios;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstConsultasUsuarios.size();

    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LivroNcc livroNcc  = (LivroNcc) lstConsultasUsuarios.get(rowIndex);
        if (columnIndex == 0) {
            return livroNcc.getTituloNcc();
        } else if (columnIndex == 1) {
            return livroNcc.getDataPublicacaoNcc();
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
