/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.VendasProdutosNcc;
import bean.UsuariosNcc;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u09217474118
 */
public class ControllerVendasProdutosNcc extends AbstractTableModel {

    private List lista;

    public void setLista(List lista) {
        this.lista = lista;
    }

    public VendasProdutosNcc getBean(int row) {
        return (VendasProdutosNcc) lista.get(row);
    }

    /**
     *
     * @param vendasProdutos
     */
    public void addBean(VendasProdutosNcc vendasProdutos) {
        lista.add(vendasProdutos);
    }

    public void deleteBean(int index) {
        lista.remove(index);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VendasProdutosNcc vendasProdutosNcc = (VendasProdutosNcc) lista.get(rowIndex);
        if (columnIndex == 0) {
            return vendasProdutosNcc.getIdVendasProdutosNcc();
        }
        if (columnIndex == 1) {
            return vendasProdutosNcc.getLivroNcc().getTituloNcc();
        }
        if (columnIndex == 2) {
            return vendasProdutosNcc.getLivroNcc().getAutorNcc();
        }
        if (columnIndex == 3) {
            return vendasProdutosNcc.getQuantidadeNcc();
        }
        if (columnIndex == 4) {
            return vendasProdutosNcc.getValorUnitarioNcc();
        }
        if (columnIndex == 5) {
            return vendasProdutosNcc.getQuantidadeNcc() * vendasProdutosNcc.getValorUnitarioNcc();
        }
        return null;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        }
        if (columnIndex == 1) {
            return "Título";
        }
        if (columnIndex == 2) {
            return "Autor";
        }
        if (columnIndex == 3) {
            return "Quantidade";
        }
        if (columnIndex == 4) {
            return "Valor Unitario";
        }
        if (columnIndex == 5) {
            return "Total";
        }
        return "";
    }

}
