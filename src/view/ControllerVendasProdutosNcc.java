/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.VendasProdutosNcc;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u09217474118
 */
public class ControllerVendasProdutosNcc extends AbstractTableModel {

    private List listaVendasProdutos;

    public void setLista(List listaVendasProdutos) {
        this.listaVendasProdutos = listaVendasProdutos;
        this.fireTableDataChanged();
    }

    public VendasProdutosNcc getBean(int rowIndex) {
        return (VendasProdutosNcc) listaVendasProdutos.get(rowIndex);
    }

    public void addBean(VendasProdutosNcc vendasProdutosNcc) {
        listaVendasProdutos.add(vendasProdutosNcc);
        this.fireTableDataChanged();
    }

    public void removeBean(int rowIndex) {
        listaVendasProdutos.remove(rowIndex);

    }

    @Override
    public int getRowCount() {
        return listaVendasProdutos.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VendasProdutosNcc vendasProdutosNcc = (VendasProdutosNcc) listaVendasProdutos.get(rowIndex);
        if (columnIndex == 0) {
            return vendasProdutosNcc.getIdVendasProdutosNcc();
        } else if (columnIndex == 1) {
            return vendasProdutosNcc.getLivroNcc().getTituloNcc();
        } else if (columnIndex == 2) {
            return vendasProdutosNcc.getLivroNcc().getAutorNcc();
        } else if (columnIndex == 3) {
            return vendasProdutosNcc.getQuantidadeNcc();
        } else if (columnIndex == 4) {
            return vendasProdutosNcc.getValorUnitarioNcc();
        } else if (columnIndex == 5) {
            return vendasProdutosNcc.getQuantidadeNcc() * vendasProdutosNcc.getValorUnitarioNcc();
        }
        return "";
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
