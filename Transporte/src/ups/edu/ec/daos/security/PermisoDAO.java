/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.daos.security;

import javax.persistence.EntityManager;
import ups.edu.ec.daos.Abstract.AbstractDAO;
import ups.edu.ec.entities.security.TraPermiso;

/**
 *
 * @author asissistemas
 */
public class PermisoDAO extends AbstractDAO{

    EntityManager em;
    public PermisoDAO(EntityManager em) {
        super(TraPermiso.class, em);
        this.em=em;
    }
    
}
