/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.utils.security.main;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import ups.edu.ec.utils.JPA_UTILS;
import ups.edu.ec.utils.security.daos.RolDAO;
import ups.edu.ec.utils.security.daos.UseRolDAO;
import ups.edu.ec.utils.security.daos.UsuarioDAO;
import ups.edu.ec.utils.security.entities.Rol;
import ups.edu.ec.utils.security.entities.Usuario;
import ups.edu.ec.utils.security.entities.UsuarioRol;

/**
 *
 * @author asissistemas
 */
public class SecurityJPA {
     public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf=JPA_UTILS.getEntitiMangerFactory();
        EntityManager em=emf.createEntityManager();
        
        UsuarioDAO usuarioDAO = new UsuarioDAO(em);
        RolDAO rolDAO=new RolDAO(em);
        UseRolDAO usuarioRolDAO=new UseRolDAO(em);
        
//        for (int i = 0; i < 50; i++){
//            Usuario usuario = new Usuario();
//            usuario.setUsrUsuario("usr_carlos");
//            usuario.setUsrClave("carlos");
//            usuarioDAO.create(usuario);
////            
//            Rol rol = new Rol();
//            rol.setRolDescripción("facturacion");
//            rolDAO.create(rol);
////            
//            UsuarioRol usuarioRol=new UsuarioRol();
//            usuarioRol.setUsuario(usuario);
//            usuarioRol.setRol(rol);
//            usuarioRolDAO.create(usuarioRol);
//        }
        
        em.close();
        emf.close();
        
        
    }
    
}
