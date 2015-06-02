/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.mains;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import ups.edu.ec.daos.security.OperacionDAO;
import ups.edu.ec.daos.security.PermisoDAO;
import ups.edu.ec.utils.JPA_UTILS;
import ups.edu.ec.daos.security.RolDAO;
import ups.edu.ec.daos.security.SeccionDAO;
import ups.edu.ec.daos.security.TipoSeccionDAO;
import ups.edu.ec.daos.security.UseRolDAO;
import ups.edu.ec.daos.security.UsuarioDAO;
import ups.edu.ec.entities.security.TraOperacion;
import ups.edu.ec.entities.security.TraPermiso;
import ups.edu.ec.entities.security.TraRol;
import ups.edu.ec.entities.security.TraSeccion;
import ups.edu.ec.entities.security.TraTipoSeccion;
import ups.edu.ec.entities.security.TraUsuario;
import ups.edu.ec.entities.security.TraUsuarioRol;

/**
 *
 * @author asissistemas
 */
public class Security {
     public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf=JPA_UTILS.getEntitiMangerFactory();
        EntityManager em=emf.createEntityManager();
        UsuarioDAO usuarioDAO = new UsuarioDAO(em);
        RolDAO rolDAO=new RolDAO(em);
        UseRolDAO usuarioRolDAO=new UseRolDAO(em);
        PermisoDAO permisoDAO=new PermisoDAO(em);
        OperacionDAO operacionDAO=new OperacionDAO(em);
        TipoSeccionDAO tipoSeccionDAO=new TipoSeccionDAO(em);
        SeccionDAO seccionDAO=new SeccionDAO(em);
        
//        for (int i = 0; i < 50; i++){
//            TraUsuario usuario = new TraUsuario();
//            usuario.setNombreUsuario("usr_PEP");
//            usuario.setClaveUsuario("pep");
//            usuarioDAO.create(usuario);
////            
//            TraRol rol = new TraRol();
//            rol.setRolDescripción("CONT");
//            rolDAO.create(rol);
////            
//            TraUsuarioRol usuarioRol=new TraUsuarioRol();
//            usuarioRol.setUsuario(usuario);
//            usuarioRol.setRol(rol);
//            usuarioRolDAO.create(usuarioRol);
//            
//            TraOperacion tranOperacion=new TraOperacion();
//            tranOperacion.setOpeDescripcion("Lectura");
//            operacionDAO.create(tranOperacion);
//        
//              TraTipoSeccion tranTipoSeccion=new TraTipoSeccion();
//              tranTipoSeccion.setTisDescripcion("Ventana");
//              tranTipoSeccion.setTisNivel("1");
//              tipoSeccionDAO.create(tranTipoSeccion);
//              
//              TraSeccion tranSeccion=new TraSeccion();
//              tranSeccion.setSecDescripcion("Facturacion");
//              tranSeccion.setSecNombreClave("FAC");
//              tranSeccion.setSecEtiqueta("FActuracion del Cliente");
//              tranSeccion.setSecOrden(1);
//              tranSeccion.setSecRuta("www");
//              tranSeccion.setSecPagina("pagina1");
//              tranSeccion.setTranTipoSeccion(tranTipoSeccion);
//              seccionDAO.create(tranSeccion);
//              
////            
//            TraPermiso tranPermiso=new TraPermiso();
//            tranPermiso.setDesPermiso("Todo");
//            tranPermiso.setTranRol(rol);
//            tranPermiso.setTranOperacion(tranOperacion);
//            tranPermiso.setTranSeccion(tranSeccion);
//            permisoDAO.create(tranPermiso);
            
            
            
//        }
//        
        em.close();
        emf.close();
        
        
    }
    
}
