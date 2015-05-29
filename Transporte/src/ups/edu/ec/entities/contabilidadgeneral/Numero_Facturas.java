/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.contabilidadgeneral;

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
 * @author user
 */
@Entity
@Table(name = "TRA_NUMERO_FACTURAS")
@SequenceGenerator(name = "TRA_NUMERO_FACTURAS_SEQ", sequenceName = "TRA_NUMERO_FACTURAS_SEQ", initialValue = 1, allocationSize = 1)
public class Numero_Facturas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_NUMERO_FACTURAS_SEQ")
    @Column(name="TRA_ID_PK")
    private Long nfaId;
    @Column(name="TRA_DES", precision=2, scale=4)
    private double nfaDes;
    @Column(name="TRA_HAS", precision=2, scale=4)
    private double nfaHas;
    @Column(name="TRA_SUMA", precision=2, scale=4)
    private double nfaSuma;

    public Long getNfaId() {
        return nfaId;
    }

    public void setNfaId(Long nfaId) {
        this.nfaId = nfaId;
    }

    public double getNfaDes() {
        return nfaDes;
    }

    public void setNfaDes(double nfaDes) {
        this.nfaDes = nfaDes;
    }

    public double getNfaHas() {
        return nfaHas;
    }

    public void setNfaHas(double nfaHas) {
        this.nfaHas = nfaHas;
    }

    public double getNfaSuma() {
        return nfaSuma;
    }

    public void setNfaSuma(double nfaSuma) {
        this.nfaSuma = nfaSuma;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nfaId != null ? nfaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Numero_Facturas)) {
            return false;
        }
        Numero_Facturas other = (Numero_Facturas) object;
        if ((this.nfaId == null && other.nfaId != null) || (this.nfaId != null && !this.nfaId.equals(other.nfaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.contabilidadgeneral.NumeroFacturas[ id=" + nfaId + " ]";
    }
    
}
