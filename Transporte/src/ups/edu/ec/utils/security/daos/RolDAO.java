/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.utils.security.daos;

import javax.persistence.EntityManager;
import ups.edu.ec.daos.Abstract.AbstractDAO;
import ups.edu.ec.utils.security.entities.Rol;

/**
 *
 * @author asissistemas
 */
public class RolDAO extends AbstractDAO {
    private EntityManager em;
    public RolDAO(EntityManager em) {
        super(Rol.class, em);
        this.em=em;
        
    }
    
}
