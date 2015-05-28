/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.contabilidadgeneral;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "TRA_CONTABILIDAD_RETENCIONES")
@SequenceGenerator(name = "TRA_CONTABILIDAD_RETENCIONES_SEQ", sequenceName = "TRA_CONTABILIDAD_RETENCIONES_SEQ", initialValue = 1, allocationSize = 1)
public class Contabilidad_Retenciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_CONTABILIDAD_RETENCIONES_SEQ")
    @Column(name="TRA_ID_PK")
    private Long creId;
    @Column(name="TRA_VALOR", precision=2, scale=4)
    private double creValor;
    @Column(name = "TRA_DESCRIPCION", length=200)
    @Basic(fetch = FetchType.LAZY)
    private String creDescripcion;

    public Long getCreId() {
        return creId;
    }

    public void setCreId(Long creId) {
        this.creId = creId;
    }

    public double getCreValor() {
        return creValor;
    }

    public void setCreValor(double creValor) {
        this.creValor = creValor;
    }

    public String getCreDescripcion() {
        return creDescripcion;
    }

    public void setCreDescripcion(String creDescripcion) {
        this.creDescripcion = creDescripcion;
    }
   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (creId != null ? creId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contabilidad_Retenciones)) {
            return false;
        }
        Contabilidad_Retenciones other = (Contabilidad_Retenciones) object;
        if ((this.creId == null && other.creId!= null) || (this.creId != null && !this.creId.equals(other.creId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.contabilidadgeneral.Contabilidad_Retenciones[ id=" + creId + " ]";
    }
    
}
