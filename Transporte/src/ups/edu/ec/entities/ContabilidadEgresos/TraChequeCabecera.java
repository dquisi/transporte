/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.ContabilidadEgresos;

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
 * @author usuario
 */
@Entity
@Table(name = "TRA_CHEQUE_CABECERA")
@SequenceGenerator(name = "TRA_CHEQUE_CABECERA_SEQ",sequenceName = "TRA_CHEQUE_CABECERA_SEQ", initialValue = 1,allocationSize = 1)
public class TraChequeCabecera implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_CHEQUE_CABECERA_SEQ")
    @Column(name = "CCA_ID", nullable = false)
    private Long id;
    @Column(name = "CCA_EFECTIVO")
    private double efectivo;
    @Column(name = "CCA_TOTAL_RECAUDADO")
    private double totalRecaudado;
  
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(double efectivo) {
        this.efectivo = efectivo;
    }

    public double getTotalRecaudado() {
        return totalRecaudado;
    }

    public void setTotalRecaudado(double totalRecaudado) {
        this.totalRecaudado = totalRecaudado;
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
        if (!(object instanceof TraChequeCabecera)) {
            return false;
        }
        TraChequeCabecera other = (TraChequeCabecera) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.ContabilidadEgresos.TraChequeCabecera[ id=" + id + " ]";
    }
    
}
