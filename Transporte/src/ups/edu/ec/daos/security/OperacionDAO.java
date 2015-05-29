/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.daos.security;

import javax.persistence.EntityManager;
import ups.edu.ec.daos.Abstract.AbstractDAO;
import ups.edu.ec.entities.security.TraOperacion;

/**
 *
 * @author asissistemas
 */
public class OperacionDAO extends AbstractDAO{
EntityManager em;
    public OperacionDAO(EntityManager em) {
        super(TraOperacion.class, em);
        this.em=em;
    }
    
}
