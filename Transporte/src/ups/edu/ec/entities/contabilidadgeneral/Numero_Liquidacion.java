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
@Table(name = "TRA_NUMERO_LIQUIDACION")
@SequenceGenerator(name = "TRA_NUMERO_LIQUIDACION_SEQ", sequenceName = "TRA_NUMERO_LIQUIDACION_SEQ", initialValue = 1, allocationSize = 1)
public class Numero_Liquidacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_NUMERO_LIQUIDACION_SEQ")
    @Column(name="TRA_ID_PK")
    private Long nliId;
    @Column(name="TRA_DES", precision=2, scale=4)
    private double nliDes;
    @Column(name="TRA_HAS", precision=2, scale=4)
    private double nliHas;
    @Column(name="TRA_SUMA", precision=2, scale=4)
    private double nliSuma;

    public Long getNliId() {
        return nliId;
    }

    public void setNliId(Long nliId) {
        this.nliId = nliId;
    }

    public double getNliDes() {
        return nliDes;
    }

    public void setNliDes(double nliDes) {
        this.nliDes = nliDes;
    }

    public double getNliHas() {
        return nliHas;
    }

    public void setNliHas(double nliHas) {
        this.nliHas = nliHas;
    }

    public double getNliSuma() {
        return nliSuma;
    }

    public void setNliSuma(double nliSuma) {
        this.nliSuma = nliSuma;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nliId != null ? nliId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Numero_Liquidacion)) {
            return false;
        }
        Numero_Liquidacion other = (Numero_Liquidacion) object;
        if ((this.nliId == null && other.nliId != null) || (this.nliId != null && !this.nliId.equals(other.nliId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.contabilidadgeneral.Numero_Liquidacion[ id=" + nliId + " ]";
    }
    
}
