/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.mains;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import ups.edu.ec.utils.JPA_UTILS;

/**
 *
 * @author Bertha Tacuri
 */
public class Transporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = JPA_UTILS.getEntitiMangerFactory();
        EntityManager em = emf.createEntityManager();
    }
    
}
