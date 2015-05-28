/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author DIEGO QUISI
 */
public class JPA_UTILS {
    private static EntityManagerFactory emf;
    
    public static EntityManagerFactory getEntitiMangerFactory(){
        if(emf == null){
            emf = Persistence.createEntityManagerFactory("TransportePU");
        }
        return emf;
    }
    
}
