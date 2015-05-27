/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.utils.security.daos;

import javax.persistence.EntityManager;
import ups.edu.ec.daos.Abstract.AbstractDAO;
import ups.edu.ec.utils.security.entities.Usuario;

/**
 *
 * @author asissistemas
 */
public class UsuarioDAO extends AbstractDAO<Usuario> {
 private EntityManager em;
//    public UsuarioDAO(Class<Usuario> entityClass, EntityManager em) {
//        super(entityClass, em);
//    }
    public UsuarioDAO(EntityManager em) {
        super(Usuario.class, em);
        this.em=em;
    }
    
}
