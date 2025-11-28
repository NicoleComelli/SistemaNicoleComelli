/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.VendasNcc;
import bean.VendasProdutosNcc;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u03808019140
 */
public class VendasProdutosDAO extends AbstractDAO {

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }
    
     public void deleteProdutos(VendasNcc vendasNcc) {
        List lista = (List) listLivro(vendasNcc);
        session.beginTransaction();
        for (int i = 0; i < lista.size(); i++) {
            VendasProdutosNcc vendasProdutosNcc = (VendasProdutosNcc) lista.get(i);
            session.flush();
            session.clear();
            session.delete(vendasProdutosNcc);
        }
        session.getTransaction().commit();
    }

    @Override
    public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendasProdutosNcc.class);
        criteria.add(Restrictions.eq("idPedidosProdutos", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listLivro(VendasNcc vendasNcc) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendasProdutosNcc.class);
        criteria.add(Restrictions.eq("vendasNcc", vendasNcc));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendasProdutosNcc.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public static void main(String[] args) {
        VendasProdutosDAO vendasProdutosDAO = new VendasProdutosDAO();
        vendasProdutosDAO.listAll();
    }
}
