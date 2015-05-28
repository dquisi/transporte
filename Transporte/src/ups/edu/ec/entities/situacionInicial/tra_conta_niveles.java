/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.situacionInicial;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author jlc
 */
@Entity
@Table(name = "TRA_CONTA_NIVELES")
@SequenceGenerator(name = "TRA_CONTA_NIVELES_SEQ", sequenceName = "TRA_CONTA_NIVELES_SEQ", initialValue = 1, allocationSize = 1)
public class tra_conta_niveles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_CONTA_NIVELES_SEQ")
     @Column(name = "CONI_ID")
    private Long id;
    @Column(name = "CONI_VALOR")
    private double coniValor;
    @Column(name = "CONI_DESCRIPCION")
    private String coniDescripcion;

    public double getConiValor() {
        return coniValor;
    }

    public void setConiValor(double coniValor) {
        this.coniValor = coniValor;
    }

    public String getConiDescripcion() {
        return coniDescripcion;
    }

    public void setConiDescripcion(String coniDescripcion) {
        this.coniDescripcion = coniDescripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof tra_conta_niveles)) {
            return false;
        }
        tra_conta_niveles other = (tra_conta_niveles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.situacionInicial.tra_conta_niveles[ id=" + id + " ]";
    }
    
}
