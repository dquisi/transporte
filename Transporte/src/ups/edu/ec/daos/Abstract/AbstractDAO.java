/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.daos.Abstract;

import javax.persistence.EntityManager;

/**
 *
 * @author Bertha Tacuri
 */
public abstract class AbstractDAO <T> {
    protected Class<T> entityClass;
    private EntityManager em;
    
    public AbstractDAO(Class<T> entityClass, EntityManager em){
        this.entityClass = entityClass;
        this.em = em;
    }
    
    public void create (T entity){
        em.getTransaction().begin();
        try {
            em.persist(entity);
            em.getTransaction().commit();
            System.out.println("CREACION EXITOSA");  
        }catch(Exception ex){
            em.getTransaction().rollback();
            System.out.println("ERROR AL CREAR : " + ex.getMessage());
        }
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
    
    public T find(Object id){
        T entity =  null; 
        try {
            entity = em.find(entityClass, id);        
        } catch (Exception ex) {
            System.out.println("ERROR AL BUSCAR " + ex.getMessage());
        }
        return entity;
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
    
    public EntityManager getEntityManager(){
        return em;
    }
    
    
    
}
