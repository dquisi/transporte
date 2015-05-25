/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.daos.Abstract;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Bertha Tacuri
 */
public abstract class AbstractDAO<T> {

    protected Class<T> entityClass;
    private EntityManager em;

    public AbstractDAO(Class<T> entityClass, EntityManager em) {
        this.entityClass = entityClass;
        this.em = em;
    }

    public void create(T entity) {
        em.getTransaction().begin();
        try {
            em.persist(entity);
            em.getTransaction().commit();
            System.out.println("CREACION EXITOSA");
        } catch (Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ERROR AL CREAR : " + ex.getMessage());
        }
    }

    public void createList(List<T> objList) {
        em.getTransaction().begin();
        for (Iterator<T> iterator = objList.iterator(); iterator.hasNext();) {
            T entity = iterator.next();
            em.persist(entity);
        }
        em.getTransaction().commit();
    }

    public void update(T entity) {
        em.getTransaction().begin();
        try {
            em.merge(entity);
            em.getTransaction().commit();
            System.out.println("ACTUALIZACION EXITOSA.");
        } catch (Exception ex) {
            em.getTransaction().rollback();
            System.out.println("ERROR AL ACTUALIZAR : " + ex.getMessage());
        }
    }

    public void updateList(List<T> objList) {
        em.getTransaction().begin();
        for (Iterator<T> iterator = objList.iterator(); iterator.hasNext();) {
            T entity = iterator.next();
            em.merge(entity);
        }
        em.getTransaction().commit();
    }

    public T find(Object id) {
        T entity = null;
        try {
            entity = em.find(entityClass, id);
        } catch (Exception ex) {
            System.out.println("ERROR AL BUSCAR " + ex.getMessage());
        }
        return entity;
    }

    public List<T> findAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(entityClass);
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    public List<T> findByNamedQueryWithCondition(String namedQuery, Map<String, Object> params) {
        Query query = em.createNamedQuery(namedQuery);
        if (params != null && !params.isEmpty()) {
            for (Entry<String, Object> entry : params.entrySet()) {
                query.setParameter(entry.getKey(), entry.getValue());
            }
        }
        return query.getResultList();
    }

    public List<T> findByNamedQueryWithConditionNumerated(String namedQuery, List<Object> params) {
        Query query = em.createNamedQuery(namedQuery);
        if (params != null) {
            for (int i = 0; i < params.size(); i++) {
                query.setParameter(i + 1, params.get(i));
            }
        }
        return query.getResultList();
    }

    public List<T> findByNamedQueryWithConditionMaxAndMin(String namedQuery, Map<String, Object> params, int startAt, int maxPage) {
        Query query = em.createNamedQuery(namedQuery);
        if (params != null && !params.isEmpty()) {
            for (Entry<String, Object> entry : params.entrySet()) {
                query.setParameter(entry.getKey(), entry.getValue());
            }
        }
        query.setFirstResult(startAt);
        query.setMaxResults(maxPage);
        return query.getResultList();
    }

    public T findOneResultWithCondition(String namedQuery, Map<String, Object> params) {
        Query query = em.createNamedQuery(namedQuery);
        if (params != null && !params.isEmpty()) {
            for (Entry<String, Object> entry : params.entrySet()) {
                query.setParameter(entry.getKey(), entry.getValue());
            }
        }
        return (T) query.getSingleResult();
    }

    public T findOneResultWithConditionNumerated(String namedQuery, List<Object> params) {
        Query query = em.createNamedQuery(namedQuery);
        if (params != null) {
            for (int i = 0; i < params.size(); i++) {
                query.setParameter(i + 1, params.get(i));
            }
        }
        return (T) query.getSingleResult();
    }

    public int countAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        cq.select(cb.count(cq.from(entityClass)));
        return (getEntityManager().createQuery(cq).getSingleResult()).intValue();
    }

    public void delete(Long id) {
        em.getTransaction().begin();
        try {
            T entity = find(id);
            em.remove(entity);
            em.getTransaction().commit();
            System.out.println("ELIMINACION EXITOSA.");
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("ERROR AL ELIMINAR" + e.getMessage());
        }
    }

    public void delete(T entity) {
        em.getTransaction().begin();
        try {
            em.remove(entity);
            em.getTransaction().commit();
            System.out.println("ELIMINACION EXITOSA.");
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("ERROR AL ELIMINAR" + e.getMessage());
        }

    }

    public EntityManager getEntityManager() {
        return em;
    }

}
