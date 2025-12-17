/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.UsuariosNcc;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u03808019140
 */
public class UsuariosDAO extends AbstractDAO {

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

    @Override
    public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuariosNcc.class);
        criteria.add(Restrictions.eq("idUsuariosNcc", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
    
    public Object listNome(String nomeNcc) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuariosNcc.class);
        criteria.add(Restrictions.like("nomeNcc", "%"+ nomeNcc +" %"));
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
    }
    
    public Object listCpf(String cpfNcc) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuariosNcc.class);
        criteria.add(Restrictions.like("cpfNcc", cpfNcc));
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
    }

    public Object listNomeCpf(String nomeNcc, String cpfNcc) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuariosNcc.class);
        criteria.add(Restrictions.like("nomeNcc", "%"+ nomeNcc +" %"));
        criteria.add(Restrictions.like("cpfNcc", cpfNcc));
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
    }
    

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuariosNcc.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

}
