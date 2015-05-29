/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.daos.security;

import javax.persistence.EntityManager;
import ups.edu.ec.daos.Abstract.AbstractDAO;
import ups.edu.ec.entities.security.TraRol;

/**
 *
 * @author asissistemas
 */
public class RolDAO extends AbstractDAO {
    private EntityManager em;
    public RolDAO(EntityManager em) {
        super(TraRol.class, em);
        this.em=em;
        
    }
    
}
