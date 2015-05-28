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
@Table(name = "TRA_NUMERO_EGRESOS")
@SequenceGenerator(name = "TRA_NUMERO_EGRESOS_SEQ", sequenceName = "TRA_NUMERO_EGRESOS_SEQ", initialValue = 1, allocationSize = 1)
public class Numero_Egresos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_NUMERO_EGRESOS_SEQ")
    @Column(name="TRA_ID_PK")
    private Long negId;
    @Column(name="TRA_DES", precision=2, scale=4)
    private double negDes;
    @Column(name="TRA_HAS", precision=2, scale=4)
    private double negHas;
    @Column(name="TRA_SUMA", precision=2, scale=4)
    private double negSuma;

    public Long getNegId() {
        return negId;
    }

    public void setNegId(Long negId) {
        this.negId = negId;
    }

    public double getNegDes() {
        return negDes;
    }

    public void setNegDes(double negDes) {
        this.negDes = negDes;
    }

    public double getNegHas() {
        return negHas;
    }

    public void setNegHas(double negHas) {
        this.negHas = negHas;
    }

    public double getNegSuma() {
        return negSuma;
    }

    public void setNegSuma(double negSuma) {
        this.negSuma = negSuma;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (negId != null ? negId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Numero_Egresos)) {
            return false;
        }
        Numero_Egresos other = (Numero_Egresos) object;
        if ((this.negId == null && other.negId != null) || (this.negId != null && !this.negId.equals(other.negId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.contabilidadgeneral.Numero_Egresos[ id=" + negId+ " ]";
    }
    
}
